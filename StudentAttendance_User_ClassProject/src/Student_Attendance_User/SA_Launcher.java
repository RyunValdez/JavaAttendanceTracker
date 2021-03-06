package Student_Attendance_User;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * @author rvald_000
 */



public class SA_Launcher extends javax.swing.JFrame {

    //Set Variables that will be sent to SA_Main
    Socket clientSocket;
    String IP;
    int Port;
    String userName;
    String password;
    
     /**
     * Creates new form Login_Register
     */
    
    public SA_Launcher() {
        this.setTitle("Login");
        this.setLocation(500,300);
        initComponents();
    }
    
    public Socket getSocket(){
        return this.clientSocket;
    };
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Register_Pane = new javax.swing.JLayeredPane();
        registerTitle_Label = new javax.swing.JLabel();
        Regi_Fname = new javax.swing.JTextField();
        Fname_Label = new javax.swing.JLabel();
        Regi_Lname = new javax.swing.JTextField();
        Lname_Label = new javax.swing.JLabel();
        Regi_Email = new javax.swing.JTextField();
        email_Label = new javax.swing.JLabel();
        Regi_Uname = new javax.swing.JTextField();
        Uname_Label = new javax.swing.JLabel();
        Regi_Password = new javax.swing.JPasswordField();
        password_Label = new javax.swing.JLabel();
        Register_Button = new javax.swing.JButton();
        goto_Login = new javax.swing.JButton();
        Login_Pane = new javax.swing.JLayeredPane();
        loginTitle_Label = new javax.swing.JLabel();
        Login_Username = new javax.swing.JTextField();
        loginUname_Label = new javax.swing.JLabel();
        loginPassword_Label = new javax.swing.JLabel();
        Login_Password = new javax.swing.JPasswordField();
        Login_Button = new javax.swing.JButton();
        newUser_Label = new javax.swing.JLabel();
        goto_Register = new javax.swing.JButton();
        Connect_Pane = new javax.swing.JLayeredPane();
        connectTitle_Label = new javax.swing.JLabel();
        port_Label = new javax.swing.JLabel();
        server_Text = new javax.swing.JTextField();
        IP_Label = new javax.swing.JLabel();
        IP_Text = new javax.swing.JTextField();
        submit_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Register_Pane.setEnabled(false);
        Register_Pane.setOpaque(true);

        registerTitle_Label.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        registerTitle_Label.setText("Register:");

        Fname_Label.setText("First Name:");

        Lname_Label.setText("Last Name:");

        email_Label.setText("Email:");

        Regi_Uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regi_UnameActionPerformed(evt);
            }
        });

        Uname_Label.setText("Username:");

        password_Label.setText("Password");

        Register_Button.setText("Register");
        Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_ButtonActionPerformed(evt);
            }
        });

        goto_Login.setBackground(new java.awt.Color(204, 204, 204));
        goto_Login.setForeground(new java.awt.Color(0, 0, 153));
        goto_Login.setText("<= Back to Login");
        goto_Login.setToolTipText("");
        goto_Login.setBorderPainted(false);
        goto_Login.setContentAreaFilled(false);
        goto_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goto_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goto_LoginActionPerformed(evt);
            }
        });

        Login_Pane.setOpaque(true);

        loginTitle_Label.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        loginTitle_Label.setText("Login:");

        loginUname_Label.setText("Username:");

        loginPassword_Label.setText("Password:");

        Login_Button.setText("Login");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        newUser_Label.setText("New User? ");

        goto_Register.setBackground(new java.awt.Color(204, 204, 204));
        goto_Register.setForeground(new java.awt.Color(0, 0, 153));
        goto_Register.setText("Register =>");
        goto_Register.setToolTipText("");
        goto_Register.setBorderPainted(false);
        goto_Register.setContentAreaFilled(false);
        goto_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goto_Register.setHideActionText(true);
        goto_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goto_RegisterActionPerformed(evt);
            }
        });

        Connect_Pane.setOpaque(true);

        connectTitle_Label.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        connectTitle_Label.setText("Server Connection:");

        port_Label.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        port_Label.setText("Server Port:");

        server_Text.setText("1100");

        IP_Label.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        IP_Label.setText("IP Address:");

        IP_Text.setText("127.0.0.1");
        IP_Text.setToolTipText("");
        IP_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IP_TextActionPerformed(evt);
            }
        });

        submit_Button.setText("Submit");
        submit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Connect_PaneLayout = new javax.swing.GroupLayout(Connect_Pane);
        Connect_Pane.setLayout(Connect_PaneLayout);
        Connect_PaneLayout.setHorizontalGroup(
            Connect_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Connect_PaneLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(connectTitle_Label)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Connect_PaneLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(Connect_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IP_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(port_Label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Connect_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(server_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IP_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(Connect_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Connect_PaneLayout.createSequentialGroup()
                    .addGap(323, 323, 323)
                    .addComponent(submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Connect_PaneLayout.setVerticalGroup(
            Connect_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Connect_PaneLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(connectTitle_Label)
                .addGap(53, 53, 53)
                .addGroup(Connect_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(port_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(server_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Connect_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IP_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IP_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(Connect_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Connect_PaneLayout.createSequentialGroup()
                    .addContainerGap(266, Short.MAX_VALUE)
                    .addComponent(submit_Button)
                    .addContainerGap()))
        );
        Connect_Pane.setLayer(connectTitle_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Connect_Pane.setLayer(port_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Connect_Pane.setLayer(server_Text, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Connect_Pane.setLayer(IP_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Connect_Pane.setLayer(IP_Text, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Connect_Pane.setLayer(submit_Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Login_PaneLayout = new javax.swing.GroupLayout(Login_Pane);
        Login_Pane.setLayout(Login_PaneLayout);
        Login_PaneLayout.setHorizontalGroup(
            Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Login_PaneLayout.createSequentialGroup()
                        .addComponent(newUser_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goto_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PaneLayout.createSequentialGroup()
                        .addGroup(Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Login_PaneLayout.createSequentialGroup()
                                .addGap(0, 70, Short.MAX_VALUE)
                                .addComponent(loginPassword_Label)
                                .addGap(18, 18, 18)
                                .addComponent(Login_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Login_PaneLayout.createSequentialGroup()
                                .addGroup(Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Login_PaneLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(loginTitle_Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PaneLayout.createSequentialGroup()
                                        .addGap(0, 67, Short.MAX_VALUE)
                                        .addComponent(loginUname_Label)
                                        .addGap(18, 18, 18)))
                                .addComponent(Login_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)))
                .addContainerGap())
            .addGroup(Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Login_PaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Connect_Pane)
                    .addContainerGap()))
        );
        Login_PaneLayout.setVerticalGroup(
            Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PaneLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(loginTitle_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUname_Label)
                    .addComponent(Login_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPassword_Label)
                    .addComponent(Login_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUser_Label)
                    .addComponent(goto_Register)
                    .addComponent(Login_Button))
                .addGap(23, 23, 23))
            .addGroup(Login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Login_PaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Connect_Pane)
                    .addContainerGap()))
        );
        Login_Pane.setLayer(loginTitle_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(Login_Username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(loginUname_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(loginPassword_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(Login_Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(Login_Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(newUser_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(goto_Register, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Login_Pane.setLayer(Connect_Pane, javax.swing.JLayeredPane.DRAG_LAYER);

        javax.swing.GroupLayout Register_PaneLayout = new javax.swing.GroupLayout(Register_Pane);
        Register_Pane.setLayout(Register_PaneLayout);
        Register_PaneLayout.setHorizontalGroup(
            Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Register_PaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerTitle_Label)
                    .addGroup(Register_PaneLayout.createSequentialGroup()
                        .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fname_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lname_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Uname_Label, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Regi_Uname)
                            .addComponent(Regi_Fname)
                            .addComponent(Regi_Lname)
                            .addComponent(Regi_Email)
                            .addComponent(Regi_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(Register_PaneLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(goto_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(Register_Button)
                .addGap(14, 14, 14))
            .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Register_PaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Login_Pane)
                    .addContainerGap()))
        );
        Register_PaneLayout.setVerticalGroup(
            Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Register_PaneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(registerTitle_Label)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regi_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fname_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regi_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lname_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regi_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regi_Uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uname_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regi_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register_Button)
                    .addComponent(goto_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(Register_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Register_PaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Login_Pane)
                    .addContainerGap()))
        );
        Register_Pane.setLayer(registerTitle_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(Regi_Fname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(Fname_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(Regi_Lname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(Lname_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(Regi_Email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(email_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(Regi_Uname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(Uname_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(Regi_Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(password_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(Register_Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(goto_Login, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Register_Pane.setLayer(Login_Pane, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Register_Pane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Register_Pane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Class to check if the email is in the correct format
    public class EmailFormatValidator {

        private Pattern pattern;
        private Matcher matcher;

        private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"

               + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        public EmailFormatValidator() {
            pattern = Pattern.compile(EMAIL_PATTERN);
        }

        public boolean validate(final String email) {
            matcher = pattern.matcher(email);
            return matcher.matches();
        }
    }
    
    //Class to check if the IP address is in the correct format
    public static boolean validIP (String ip) {
        try {
            if ( ip == null || ip.isEmpty() ) {
                return false;
            }

            String[] parts = ip.split( "\\." );
            if ( parts.length != 4 ) {
                return false;
            }

            for ( String s : parts ) {
                int i = Integer.parseInt( s );
                if ( (i < 0) || (i > 255) ) {
                    return false;
                }
            }
            if ( ip.endsWith(".") ) {
                return false;
            }

            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    
    private void submit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_ButtonActionPerformed

        try{
            //receive form data
            this.IP = IP_Text.getText();
            this.Port = Integer.parseInt(server_Text.getText());
            //Data Validation
            if (this.IP.equals("")){
                JOptionPane.showMessageDialog(null, "Enter an IP Address!");
                return;
            }
            if (validIP(this.IP)==false){
                JOptionPane.showMessageDialog(null, "Not a valid IP Address :(");
                return;
            }
            if (server_Text.equals("")){
                JOptionPane.showMessageDialog(null, "Enter a port number!");
                return;
            }       
            //Connect to the server
            this.clientSocket = new Socket(IP, Port);
            Connect_Pane.setVisible(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Can't Connect");
        };
    }//GEN-LAST:event_submit_ButtonActionPerformed

    private void IP_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IP_TextActionPerformed

    }//GEN-LAST:event_IP_TextActionPerformed

    private void goto_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goto_RegisterActionPerformed
       Login_Pane.setVisible(false);
    }//GEN-LAST:event_goto_RegisterActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed

        try{
            //Receive form data
            this.userName = Login_Username.getText();
            this.password = Login_Password.getText();
            
            //Data Validation
            if (this.userName.equals("")){
                JOptionPane.showMessageDialog(null, "Enter a username!");
                return;
            }
            if (this.password.equals("")){
                JOptionPane.showMessageDialog(null, "Enter a password!");
                return;
            }
            
            //Send request to server
            DataOutputStream outToServer = new DataOutputStream(
                clientSocket.getOutputStream());
            outToServer.writeBytes("LOGN U " +'\"'+ userName + '\"' + " " + '\"' + password + '\"'+ '\n');
            //Print sent request
            System.out.println("LOGN U " +'\"'+ userName + '\"' + " " + '\"' + password + '\"'+ '\n');

            //Receive server response
            BufferedReader inFromServer = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
            String response = inFromServer.readLine();
            
            //Translate server message response and act accordingly
            switch(response){
                case "LGIR 0": JOptionPane.showMessageDialog(null, "Logged in!");
                SA_Main mainFrame = new SA_Main(this.userName, this.password, this.IP, this.Port, this.clientSocket);
                mainFrame.setVisible(true);
                this.dispose();
                break;
                case "LGIR 10": JOptionPane.showMessageDialog(null, "Error: Account with this username does not exist :(");
                break;
                case "LGIR 20": JOptionPane.showMessageDialog(null, "Error: Incorrect password :(");
                break;
                case "LGIR 30": JOptionPane.showMessageDialog(null, "Error: You are already logged in!");
                break;
                case "LGIR 80": JOptionPane.showMessageDialog(null, "Error: Syntax error :(");
                break;
                default: JOptionPane.showMessageDialog(null, "Error: Syntax error :(");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Can't Login");
        };
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void goto_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goto_LoginActionPerformed
        Login_Pane.setVisible(true);
    }//GEN-LAST:event_goto_LoginActionPerformed

    private void Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_ButtonActionPerformed
        try{
            //Receive form data
            String firstName = Regi_Fname.getText();
            String lastName = Regi_Lname.getText();
            String email = Regi_Email.getText();
            this.userName = Regi_Uname.getText();
            this.password = Regi_Password.getText();

            //Validate that the email field is a valid email
            EmailFormatValidator emailFormatValidator = new EmailFormatValidator();
            Boolean checking = emailFormatValidator.validate(email);
            
            //Data Validation
            if (firstName.equals("")){
                JOptionPane.showMessageDialog(null, "Enter a first name!");
                return;
            }
            if (lastName.equals("")){
                JOptionPane.showMessageDialog(null, "Enter a last name!");
                return;
            }
            if (email.equals("")){
                JOptionPane.showMessageDialog(null, "Enter an email address!");
                return;
            }
            if (checking==false){
                JOptionPane.showMessageDialog(null, "Not a valid email!");
                return;
            }
            if (this.userName.equals("")){
                JOptionPane.showMessageDialog(null, "Enter a username!");
                return;
            }
            if (this.password.equals("")){
                JOptionPane.showMessageDialog(null, "Enter a password!");
                return;
            }
            
            //Send form data to server
            DataOutputStream outToServer = new DataOutputStream(
                clientSocket.getOutputStream());
            outToServer.writeBytes("RGST U " +'\"'+ userName + '\"' + " " + '\"' + password + '\"' +
                " " +'\"'+ firstName + '\"' + " " + '\"' + lastName + '\"' + " " + '\"' + email + '\"' + '\n');
            //Print sent request
            System.out.println("RGST U " +'\"'+ userName + '\"' + " " + '\"' + password + '\"' +
                " " +'\"'+ firstName + '\"' + " " + '\"' + lastName + '\"' + " " + '\"' + email + '\"' + '\n');
            
            //Receive server response
            BufferedReader inFromServer = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
            String response = inFromServer.readLine();
            
            //Translate server response and act accordingly
            switch(response){
                case "RGRP 0": JOptionPane.showMessageDialog(null, "Successfully registered!");
                SA_Main mainFrame = new SA_Main(this.userName, this.password, this.IP, this.Port, this.clientSocket);
                mainFrame.setVisible(true);
                this.dispose();
                break;
                case "RGRP 10": JOptionPane.showMessageDialog(null, "Error: Username already exists :(");
                break;
                case "RGRP 20": JOptionPane.showMessageDialog(null, "Error: Password needs atleast one upper-case and one number");
                break;
                case "RGRP 30": JOptionPane.showMessageDialog(null, "Error: Invalid Email :(");
                break;
                case "RGRP 40": JOptionPane.showMessageDialog(null, "Error: You are already logged in!");
                break;
                case "RGRP 80": JOptionPane.showMessageDialog(null, "Error: Syntax error :(");
                break;
                default: JOptionPane.showMessageDialog(null, "Error: Syntax error :(");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Can't send request");
        };
    }//GEN-LAST:event_Register_ButtonActionPerformed

    private void Regi_UnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regi_UnameActionPerformed

    }//GEN-LAST:event_Regi_UnameActionPerformed

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
            java.util.logging.Logger.getLogger(SA_Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SA_Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SA_Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SA_Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new SA_Launcher().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Connect_Pane;
    private javax.swing.JLabel Fname_Label;
    private javax.swing.JLabel IP_Label;
    private javax.swing.JTextField IP_Text;
    private javax.swing.JLabel Lname_Label;
    private javax.swing.JButton Login_Button;
    private javax.swing.JLayeredPane Login_Pane;
    private javax.swing.JPasswordField Login_Password;
    private javax.swing.JTextField Login_Username;
    private javax.swing.JTextField Regi_Email;
    private javax.swing.JTextField Regi_Fname;
    private javax.swing.JTextField Regi_Lname;
    private javax.swing.JPasswordField Regi_Password;
    private javax.swing.JTextField Regi_Uname;
    private javax.swing.JButton Register_Button;
    private javax.swing.JLayeredPane Register_Pane;
    private javax.swing.JLabel Uname_Label;
    private javax.swing.JLabel connectTitle_Label;
    private javax.swing.JLabel email_Label;
    private javax.swing.JButton goto_Login;
    private javax.swing.JButton goto_Register;
    private javax.swing.JLabel loginPassword_Label;
    private javax.swing.JLabel loginTitle_Label;
    private javax.swing.JLabel loginUname_Label;
    private javax.swing.JLabel newUser_Label;
    private javax.swing.JLabel password_Label;
    private javax.swing.JLabel port_Label;
    private javax.swing.JLabel registerTitle_Label;
    private javax.swing.JTextField server_Text;
    private javax.swing.JButton submit_Button;
    // End of variables declaration//GEN-END:variables
}
