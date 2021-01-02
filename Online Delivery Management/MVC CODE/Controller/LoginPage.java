
package fodder;

import Backend.Customer;
import Backend.DatabaseAccess;
import Backend.FoodItem;
import Backend.Order;
import CustomErrors.InternalServerException;
import CustomErrors.UserDoesNotExist;
import CustomErrors.UsernameExistsException;
import CustomErrors.WrongCredentialsException;


public class LoginPage extends javax.swing.JFrame {
    DatabaseAccess db = new DatabaseAccess();
    Customer customer;
  
    private void logoSetup() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }

    }

    public Customer loginUser(String username, String password) throws UserDoesNotExist, InternalServerException, WrongCredentialsException {
        if (!userExists(username)) {
            throw new UserDoesNotExist();
        }

        try {
            PreparedStatement loginQuery = connect.prepareStatement("SELECT * FROM users WHERE USERNAME=?");
            loginQuery.setString(1, username);
            ResultSet result = loginQuery.executeQuery();
            result.first();
            String dbPassword = result.getString("PASSWORD");
            String email = result.getString("EMAIL");

            if (dbPassword.equals(password)) {
                return new Customer(username, email);
            } else {
                throw new WrongCredentialsException();
            }
        } catch (SQLException e) {
            throw new InternalServerException();
        }
    
}