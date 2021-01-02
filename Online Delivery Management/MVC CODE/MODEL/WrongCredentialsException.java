package Model;

public class WrongCredentialsException extends Exception {
    public String toString() {
        return "Entered Credentials are Wrong";
    }
}
