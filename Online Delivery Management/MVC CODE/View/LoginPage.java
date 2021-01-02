
package View;




import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;


class MotionPanel extends JPanel{
    private Point initialClick;
    private JFrame parent;

    public MotionPanel(final JFrame parent){
    this.parent = parent;

    addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
            initialClick = e.getPoint();
            getComponentAt(initialClick);
        }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {

            // get location of Window
            int thisX = parent.getLocation().x;
            int thisY = parent.getLocation().y;

            // Determine how much the mouse moved since the initial click
            int xMoved = (thisX + e.getX()) - (thisX + initialClick.x);
            int yMoved = (thisY + e.getY()) - (thisY + initialClick.y);

            // Move window to this position
            int X = thisX + xMoved;
            int Y = thisY + yMoved;
            parent.setLocation(X, Y);
        }
    });
    }
}

public class LoginPage extends javax.swing.JFrame {
    DatabaseAccess db = new DatabaseAccess();
    Customer customer;
    /**
     * Creates new form LoginPage
     */
    public LoginPage() throws Exception {
        initComponents();
        logoSetup();
        try {   
            InputStream is = LoginPage.class.getResourceAsStream("cac_champagne.ttf");
            Font cac_champagne = Font.createFont(Font.TRUETYPE_FONT, is);
            jLabel1.setFont(cac_champagne.deriveFont(Font.PLAIN, 48f)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(239, 239, 239));
            jLabel1.setText("fodder");
            is = LoginPage.class.getResourceAsStream("DAGGERSQUARE.otf");
            Font DAGGERSQUARE = Font.createFont(Font.TRUETYPE_FONT, is);
            jLabel5.setFont(DAGGERSQUARE.deriveFont(Font.PLAIN, 36f)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(101, 43, 215));
            jLabel5.setText("Login");
        } catch(IOException | FontFormatException e) {
            System.out.println("Font not found");
        }
        Color borderColor = new Color(179, 193, 193);
        jPanel1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        username1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        password1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        password1.setEchoChar((char)0);
        password1.setText("Password");
        usernameRegistration.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        password_registartion.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        password_registartion.setEchoChar((char)0);
        password_registartion.setText("Password");
        name.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        email.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        this.setLocationRelativeTo(null);
    }
    
    private void logoSetup() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        MotionPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        password1 = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        usernameRegistration = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        hi = new javax.swing.JLabel();
        password_registartion = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(101, 43, 215));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(101, 43, 215));

        jLabel1.setFont(new java.awt.Font("CAC Champagne", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 239, 239));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fodder/logo-small.png"))); // NOI18N
        jLabel1.setText("Bhojon ");

        exit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(239, 239, 239));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        min.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        min.setForeground(new java.awt.Color(239, 239, 239));
        min.setText("-");
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        JPanel MotionPanel = new MotionPanel(this);
        MotionPanel.setBackground(new java.awt.Color(101, 43, 215));

        javax.swing.GroupLayout MotionPanelLayout = new javax.swing.GroupLayout(MotionPanel);
        MotionPanel.setLayout(MotionPanelLayout);
        MotionPanelLayout.setHorizontalGroup(
            MotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MotionPanelLayout.setVerticalGroup(
            MotionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(min)
                        .addGap(18, 18, 18)
                        .addComponent(exit)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MotionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MotionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exit)
                            .addComponent(min))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(101, 43, 215));

        jPanel4.setLayout(new java.awt.CardLayout());

        jPanel5.setBackground(new java.awt.Color(239, 239, 239));

        jLabel5.setFont(new java.awt.Font("DAGGERSQUARE", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(101, 43, 215));
        jLabel5.setText("Login");

        username1.setBackground(new java.awt.Color(239, 239, 239));
        username1.setForeground(new java.awt.Color(179, 193, 193));
        username1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username1.setText("Username");
        username1.setBorder(null);
        username1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                username1FocusLost(evt);
            }
        });
        username1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                username1MouseEntered(evt);
            }
        });
        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(101, 43, 215));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(239, 239, 239));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        password1.setBackground(new java.awt.Color(239, 239, 239));
        password1.setForeground(new java.awt.Color(179, 193, 193));
        password1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password1FocusLost(evt);
            }
        });
        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(password1))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jPanel4.add(jPanel5, "loginCard");

        jPanel6.setBackground(new java.awt.Color(239, 239, 239));

        jLabel6.setFont(new java.awt.Font("DAGGERSQUARE", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(101, 43, 215));
        jLabel6.setText("Register");

        name.setBackground(new java.awt.Color(239, 239, 239));
        name.setForeground(new java.awt.Color(179, 193, 193));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setText("Name");
        name.setBorder(null);
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameusernameMouseClicked(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        usernameRegistration.setBackground(new java.awt.Color(239, 239, 239));
        usernameRegistration.setForeground(new java.awt.Color(179, 193, 193));
        usernameRegistration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameRegistration.setText("Username");
        usernameRegistration.setBorder(null);
        usernameRegistration.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameRegistrationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameRegistrationFocusLost(evt);
            }
        });
        usernameRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameRegistrationpasswordMouseClicked(evt);
            }
        });
        usernameRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameRegistrationpasswordActionPerformed(evt);
            }
        });

        email.setBackground(new java.awt.Color(239, 239, 239));
        email.setForeground(new java.awt.Color(179, 193, 193));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setText("Email");
        email.setBorder(null);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailpasswordMouseClicked(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailpasswordActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(101, 43, 215));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(239, 239, 239));
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3jButton1ActionPerformed(evt);
            }
        });

        hi.setForeground(new java.awt.Color(51, 51, 255));

        password_registartion.setBackground(new java.awt.Color(239, 239, 239));
        password_registartion.setForeground(new java.awt.Color(179, 193, 193));
        password_registartion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_registartion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_registartionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_registartionFocusLost(evt);
            }
        });
        password_registartion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_registartionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(password_registartion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameRegistration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(hi, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_registartion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hi, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel6, "registerCard");

        jPanel7.setBackground(new java.awt.Color(101, 43, 215));
        jPanel7.setLayout(new java.awt.CardLayout());

        jPanel8.setBackground(new java.awt.Color(101, 43, 215));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("AvenirNext LT Pro MediumCn", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(239, 239, 239));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("If you are a new user, Click here to Register !");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel7.add(jPanel8, "registerLabel");

        jPanel9.setBackground(new java.awt.Color(101, 43, 215));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("AvenirNext LT Pro MediumCn", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 239, 239));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Click here to Login !");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel7.add(jPanel9, "loginLabel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        exit.setForeground(Color.RED);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        exit.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            customer = db.loginUser(username1.getText(), password1.getText());
            System.out.println(customer.getEmail());
            password1.setText("");
            username1.setText("");
            this.dispose();
            new menuPage(customer).setVisible(true); 
        } catch (WrongCredentialsException | UserDoesNotExist | InternalServerException e) {
            JOptionPane.showMessageDialog(rootPane, e, "Oops! There was an error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        // TODO add your handling code here:
        Color borderColor = new Color(101,43,215);
        if(username1.getText().equals("Username"))
        username1.setText("");
        username1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        username1.setForeground(borderColor);
    }//GEN-LAST:event_usernameMouseClicked

    private void nameusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameusernameMouseClicked
        // TODO add your handling code here:
        Color borderColor = new Color(101,43,215);
        name.setText("");
        name.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        name.setForeground(borderColor);
    }//GEN-LAST:event_nameusernameMouseClicked

    private void usernameRegistrationpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameRegistrationpasswordMouseClicked
        // TODO add your handling code here:
        Color borderColor = new Color(101,43,215);
        usernameRegistration.setText("");
        usernameRegistration.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        usernameRegistration.setForeground(borderColor);
    }//GEN-LAST:event_usernameRegistrationpasswordMouseClicked

    private void usernameRegistrationpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameRegistrationpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameRegistrationpasswordActionPerformed

    private void jButton3jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3jButton1ActionPerformed
        try {   
          customer = db.registerUser(usernameRegistration.getText(), 
                    password_registartion.getText(), email.getText());
          System.out.println(customer.getEmail());
            name.setText("");
            usernameRegistration.setText("");
            email.setText("");
            password_registartion.setText("");
            hi.setText("    Successfully Registered !");
        } catch (InternalServerException | UsernameExistsException e) {
            JOptionPane.showMessageDialog(rootPane, e, "Oops! There was an error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3jButton1ActionPerformed

    private void emailpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailpasswordMouseClicked
        // TODO add your handling code here:
        Color borderColor = new Color(101,43,215);
        email.setText("");
        email.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        email.setForeground(borderColor);
    }//GEN-LAST:event_emailpasswordMouseClicked

    private void emailpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailpasswordActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void username1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_username1MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout) jPanel7.getLayout();
        c1.show(jPanel7, "loginLabel");
        CardLayout c2 = (CardLayout) jPanel4.getLayout();
        c2.show(jPanel4, "registerCard");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout) jPanel7.getLayout();
        c1.show(jPanel7, "registerLabel");
        CardLayout c2 = (CardLayout) jPanel4.getLayout();
        c2.show(jPanel4, "loginCard");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void username1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username1FocusLost
        // TODO add your handling code here:
        if(username1.getText().isEmpty()){
            username1.setText("Username");
            username1.setForeground(new Color(179,193,193));
            username1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(179,193,193)));
            
        }
    }//GEN-LAST:event_username1FocusLost

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
        Color borderColor = new Color(101,43,215);
        if(password1.getPassword().equals("Password"))
        password1.setText("");
        password1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, borderColor));
        password1.setForeground(borderColor);

    }//GEN-LAST:event_password1ActionPerformed
    
    private void password1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusLost
        if(password1.getPassword().length==0){
            password1.setText("Password");
            password1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(179,193,193)));
            password1.setForeground(new Color(179,193,193));
            password1.setEchoChar((char)0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_password1FocusLost

    private void password1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusGained
        
            Color borderColor = new Color(101,43,215);
            password1.setText("");
            password1.setEchoChar('*');
            password1.setForeground(borderColor);
            password1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        
// TODO add your handling code here:
    }//GEN-LAST:event_password1FocusGained
                           

    private void nameFocusGained(java.awt.event.FocusEvent evt) {                                      
        
            Color borderColor = new Color(101,43,215);
            name.setText("");
            name.setForeground(borderColor);
            name.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        
// TODO add your handling code here:
    }
    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if(name.getText().length()==0){
    
            name.setText("Name");
            name.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(179,193,193)));
            name.setForeground(new Color(179,193,193));
        }
// TODO add your handling code here:
    }//GEN-LAST:event_nameFocusLost

    private void usernameRegistrationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameRegistrationFocusGained
        // TODO add your handling code here:
        Color borderColor = new Color(101,43,215);
        usernameRegistration.setText("");
        usernameRegistration.setForeground(borderColor);
        usernameRegistration.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
    
    }//GEN-LAST:event_usernameRegistrationFocusGained

    private void usernameRegistrationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameRegistrationFocusLost
        // TODO add your handling code here:
           if(usernameRegistration.getText().length()==0){
    
            usernameRegistration.setText("Username");
            usernameRegistration.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(179,193,193)));
            usernameRegistration.setForeground(new Color(179,193,193));
        }
    }//GEN-LAST:event_usernameRegistrationFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
           Color borderColor = new Color(101,43,215);
            email.setText("");
            email.setForeground(borderColor);
            email.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if(email.getText().length()==0){
    
            email.setText("Email");
            email.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(179,193,193)));
            email.setForeground(new Color(179,193,193));
        }// TODO add your handling code here:
    }//GEN-LAST:event_emailFocusLost

    private void password_registartionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_registartionFocusGained
          Color borderColor = new Color(101,43,215);
            password_registartion.setText("");
            password_registartion.setEchoChar('*');
            password_registartion.setForeground(borderColor);
            password_registartion.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        // TODO add your handling code here:
    }//GEN-LAST:event_password_registartionFocusGained

    private void password_registartionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_registartionFocusLost
            Color borderColor = new Color(179,193,193);
            if(password_registartion.getPassword().length == 0){
            password_registartion.setText("Password");
            password_registartion.setEchoChar((char)0);
            password_registartion.setForeground(borderColor);
            password_registartion.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, borderColor));
        // TODO add your handling code here:
            }
    }//GEN-LAST:event_password_registartionFocusLost

    private void password_registartionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_registartionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_registartionActionPerformed
    
    /**   
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try{
                        Thread.sleep(5000);
                    }
                    catch(Exception e){
                        
                    }
                    new LoginPage().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MotionPanel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel hi;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel min;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password_registartion;
    private javax.swing.JTextField username1;
    private javax.swing.JTextField usernameRegistration;
    // End of variables declaration//GEN-END:variables
}
