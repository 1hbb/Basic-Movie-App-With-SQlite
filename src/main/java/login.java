import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class login extends JFrame {

    private String userID;
    private String category1;
    private String category2;
    private String category3;
    private ArrayList<String> list = new ArrayList<String>();
    private int suggest;



    login() {



        //Login page components
        final JFrame f = new JFrame("Login Screen");



        JButton b = new JButton("Login"); // Submit buton
        b.setBounds(200,150,90,40); //submit button size

        JButton create_button = new JButton("Create Account");
        create_button.setBounds(300,150,120,40);


        JLabel username_label = new JLabel(); // label for username
        username_label.setText("Mail:");

        username_label.setBounds(10,10,100,100);

        JLabel password_label = new JLabel(); // label for password
        password_label.setText("Password:");
        password_label.setBounds(10,50,100,100);

        final JTextField username_textfield = new JTextField();
        username_textfield.setBounds(200,40,220,40);

        final JPasswordField user_password = new JPasswordField();
        user_password.setBounds(200,90,220,40);



        //Create Account Page Components

        final JFrame create_account_frame = new JFrame("Create Account");

        JLabel create_user_name = new JLabel();
        create_user_name.setText("Name:");
        create_user_name.setBounds(10,10,100,100);

        final JTextField create_getUsername = new JTextField();
        create_getUsername.setBounds(100,43,220,40);

        JLabel create_birth_date = new JLabel();
        create_birth_date.setText("Birth Day:");
        create_birth_date.setBounds(10,50,100,100);

        final JTextField get_bitrhDate = new JTextField();
        get_bitrhDate.setBounds(100,80,220,40);


        JLabel create_mail = new JLabel();
        create_mail.setText("e-mail:");
        create_mail.setBounds(10,90,100,100);

        final JTextField create_getMail = new JTextField();
        create_getMail.setBounds(100,120,220,40);

        JLabel create_password = new JLabel();
        create_password.setText("Password:");
        create_password.setBounds(10,130,100,100);



        final JPasswordField create_getPassword = new JPasswordField();
        create_getPassword.setBounds(100,160,220,40);


        JButton create_account_button = new JButton("Create Account");
        create_account_button.setBounds(100,220,220,40);

        JButton back_to_login_screen = new JButton("Go Login Screen");
        back_to_login_screen.setBounds(100,270,220,40);

        // select content type with during create account (with checkbox)
        // Aksiyon, Belgesel, Bilim Kurgu ve Fantastik Yapımlar, Bilim ve Doğa, Çocuk ve Aile, Dramalar, Gerilim, Komedi, Korku, Romantizm

        JLabel select3type = new JLabel();
        select3type.setText("3 ADET KATEGORİ SEÇİN");
        select3type.setBounds(480,20,200,20);


        final JCheckBox c1 = new JCheckBox();
        c1.setText("Aksiyon");
        c1.setBounds(450,45,100,20);

        final JCheckBox c2 = new JCheckBox();
        c2.setText("Belgesel");
        c2.setBounds(450,65,100,20);

        final JCheckBox c3 = new JCheckBox();
        c3.setText("Bilim Kurgu ve Fantastik Yapımlar");
        c3.setBounds(450,85,250,20);

        final JCheckBox c4 = new JCheckBox();
        c4.setText("Bilim ve Doğa");
        c4.setBounds(450,105,200,20);

        final JCheckBox c5 = new JCheckBox();
        c5.setText("Çocuk ve Aile");
        c5.setBounds(450,125,200,20);

        final JCheckBox c6 = new JCheckBox();
        c6.setText("Dramalar");
        c6.setBounds(450,145,200,20);

        final JCheckBox c7 = new JCheckBox();
        c7.setText("Gerilim");
        c7.setBounds(450,165,200,20);

        final JCheckBox c8 = new JCheckBox();
        c8.setText("Komedi");
        c8.setBounds(450,185,200,20);

        final JCheckBox c9 = new JCheckBox();
        c9.setText("Korku");
        c9.setBounds(450,205,200,20);

        final JCheckBox c10 = new JCheckBox();
        c10.setText("Romantizm");
        c10.setBounds(450,225,200,20);




        // Adding component to login page jframe
        f.add(b);
        f.add(username_label);
        f.add(password_label);
        f.add(username_textfield);
        f.add(user_password);
        f.add(create_button);

        f.setSize(500,300);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //Create Account Frame settings
        create_account_frame.add(create_mail);
        create_account_frame.add(create_password);
        create_account_frame.add(create_getMail);
        create_account_frame.add(create_getPassword);
        create_account_frame.add(create_account_button);
        create_account_frame.add(back_to_login_screen);
        create_account_frame.add(create_user_name);
        create_account_frame.add(create_getUsername);
        create_account_frame.add(create_birth_date);
        create_account_frame.add(get_bitrhDate);

        create_account_frame.add(c1);
        create_account_frame.add(c2);
        create_account_frame.add(c3);
        create_account_frame.add(c4);
        create_account_frame.add(c5);
        create_account_frame.add(c6);
        create_account_frame.add(c7);
        create_account_frame.add(c8);
        create_account_frame.add(c9);
        create_account_frame.add(c10);

        create_account_frame.add(select3type);


        create_account_frame.setSize(700,400);

        create_account_frame.setLayout(null);
        create_account_frame.setLocationRelativeTo(null);
        create_account_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        // Add maain page to Jframe

        final JFrame mainPage = new JFrame("Anasayfa");


        // Create main page components

        final JTextField searchBox = new JTextField();
        searchBox.setBounds(500,10,500,40);

        JButton searchButton = new JButton("SEARCH");
        searchButton.setBounds(1000,10,100,40);

        final JLabel welcome_username = new JLabel();
        welcome_username.setBounds(10,10,300,50);
        welcome_username.setFont(new Font("Times",Font.PLAIN,20));
        welcome_username.setForeground(Color.DARK_GRAY);



        final JPanel moviesGrid = new JPanel(new GridLayout(4,4));
        moviesGrid.setBounds(200,400,1200,450);

        moviesGrid.setBackground(Color.GRAY);


        final JPanel mainPage_suggestion = new JPanel();
        mainPage_suggestion.setBounds(350,100,800,250);
        mainPage_suggestion.setBackground(Color.GREEN);

        mainPage_suggestion.setVisible(true);


        // Add components to main page

        mainPage.add(welcome_username);
        mainPage.add(searchBox);
        mainPage.add(mainPage_suggestion);



        mainPage.add(searchButton);
        mainPage.setSize(1500,900);
        mainPage.setLayout(null);
        mainPage.setLocationRelativeTo(null);
        mainPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //Action listener for back to login screen form create account screen
        back_to_login_screen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(true);
                create_account_frame.dispose();
            }
        });



        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                // calculate movie played time variables
                final long[] startTime = {0};


                // remove all components
                moviesGrid.removeAll();


                try {
                    ResultSet search = Database.getData("SELECT program_name FROM program " +
                            "WHERE program_name LIKE '%" + searchBox.getText() + "%'");
                    ResultSet get_category_code = Database.getData("SELECT type_id FROM type " +
                            "WHERE type_name LIKE '%" + searchBox.getText() + "%'");

                    while (get_category_code.next()){
                        //System.out.println(search_for_category.getString("type_id"));
                        ResultSet search_for_category = Database.getData("SELECT program_name FROM program " +
                                "WHERE program_genre LIKE '" + get_category_code.getString("type_id") + "'");
                        while (search_for_category.next()){
                            final String s = search_for_category.getString("program_name");
                            JButton b = new JButton(s);
                            b.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent e) {


                                    JFrame watchMovie = new JFrame(s);

                                    JLabel movieName = new JLabel(s);
                                    movieName.setBounds(30,5,150,40);

                                    JButton watchButton = new JButton("watch");
                                    watchButton.setBounds(30,180,130,50);

                                    JButton stopButton = new JButton("stop");
                                    stopButton.setBounds(165,180,130,50);

                                    watchButton.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            // Start Playing Movie

                                            startTime[0] = System.currentTimeMillis();
                                        }
                                    });

                                    stopButton.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            //stop movie
                                            long endTime   = System.currentTimeMillis();
                                            long totalTime = endTime - startTime[0];
                                            System.out.println((int)totalTime/1000);

                                        }
                                    });

                                    watchMovie.add(stopButton);
                                    watchMovie.add(watchButton);
                                    watchMovie.add(movieName);


                                    watchMovie.setSize(300,300);
                                    watchMovie.setLayout(null);
                                    watchMovie.setLocationRelativeTo(null);
                                    watchMovie.setVisible(true);
                                    watchMovie.setDefaultCloseOperation(DISPOSE_ON_CLOSE);




                                }
                            });

                            moviesGrid.add(b);
                        }
                    }




                    while (search.next()){

                        System.out.println(search.getString("program_name"));
                        final String s = search.getString("program_name");
                        JButton b = new JButton(s);
                        b.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent e) {

                                JFrame watchMovie = new JFrame(s);

                                JLabel movieName = new JLabel(s);
                                movieName.setBounds(80,5,150,40);

                                JButton watchButton = new JButton("watch");
                                watchButton.setBounds(30,180,130,50);

                                JButton stopButton = new JButton("stop");
                                stopButton.setBounds(165,180,130,50);

                                watchButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        // Start Playing Movie


                                    }
                                });

                                stopButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        //stop movie


                                    }
                                });

                                watchMovie.add(stopButton);
                                watchMovie.add(watchButton);
                                watchMovie.add(movieName);


                                watchMovie.setSize(300,300);
                                watchMovie.setLayout(null);
                                watchMovie.setLocationRelativeTo(null);
                                watchMovie.setVisible(true);
                                watchMovie.setDefaultCloseOperation(DISPOSE_ON_CLOSE);


                            }
                        });

                        moviesGrid.add(b);

                    }

                    //moviesGrid.repaint();
                    mainPage.add(moviesGrid);


                    mainPage.invalidate();
                    mainPage.revalidate();
                    mainPage.repaint();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });

        //mainPage.setVisible(true);



        //Action listener for login button

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // User Login verify from mysql database
                try {
                    ResultSet res = Database.getData("SELECT * FROM user WHERE user_mail ='"+ username_textfield.getText()+
                            "' AND user_password='"+ String.valueOf(user_password.getPassword()) +"'" );
                    if (res.next()){
                        System.out.println("Login Succes");
                        //ResultSet userName = Database.getData("SELECT * FROM users WH");
                        welcome_username.setText("Hoşgeldiniz "+res.getString("user_name"));
                        mainPage.setVisible(true);
                        f.dispose();
                    }
                    else{
                        System.out.println("worng e-mail or password ");
                        JOptionPane.showMessageDialog(f,"worng e-mail or password");
                    }



                } catch (Exception ex) {
                    ex.printStackTrace();
                }



            }
        });

        //Action listener for create account button

        create_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                create_account_frame.setVisible(true);

            }
        });



        create_account_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Boolean inputStatus = null;
                Boolean emailCheck = null;

                if(create_getUsername.getText().trim().isEmpty() != true &&
                        create_getMail.getText().trim().isEmpty() != true &&
                        String.valueOf(create_getPassword.getPassword()).trim().isEmpty() != true &&
                        get_bitrhDate.getText().trim().isEmpty() != true
                ){
                    inputStatus = true;

                }



                ResultSet checkUser = null;
                try {
                    // check is user already exists
                    checkUser = Database.getData("SELECT * FROM user WHERE user_mail='"+create_getMail.getText()+"'");
                    if (checkUser.next()){
                        System.out.println("mail already exists");
                        JOptionPane.showMessageDialog(create_account_frame,"Bu mail adresi daha önce kullanılmış.");
                        emailCheck=false;

                    }

                    else if (inputStatus == true) {
                        // Add user to mysql database
                        Database.setData("INSERT INTO user(user_name,user_mail,user_password,user_birthday) " +
                                "VALUES("+
                                "'" + create_getUsername.getText() + "'" + "," +
                                "'" + create_getMail.getText()  + "'" + "," +
                                "'" + String.valueOf(create_getPassword.getPassword()) + "'" + "," +
                                "'" + get_bitrhDate.getText() +"'" +
                                ");"
                        );

                        // if everythin is ok
                        suggest = 1;
                        if (suggest == 1){
                            mainPage_suggestion.setVisible(true);

                        }
                        f.setVisible(true);
                        create_account_frame.dispose();

                    }




                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(create_account_frame,"Kayıt Bilgilerini Boş Bırakamazsınız!");
                    ex.printStackTrace();

                }


                int control = 0;

                if (c1.isSelected()){
                    if( control  < 4){
                        list.add("100");
                        control++;
                    }
                }
                if (c2.isSelected()){
                    if( control  < 4){
                        list.add("101");
                        control++;
                    }
                }
                if (c3.isSelected()){

                    if( control  < 4){
                        list.add("102");
                        control++;
                    }
                }
                if (c4.isSelected()){

                    if( control  < 4){
                        list.add("103");
                        control++;
                    }
                }
                if (c5.isSelected()){

                    if( control  < 4){
                        list.add("104");
                        control++;
                    }
                }
                if (c6.isSelected()){

                    if( control  < 4){
                        list.add("105");
                        control++;
                    }
                }
                if (c7.isSelected()){

                    if( control  < 4){
                        list.add("106");
                        control++;
                    }
                }

                if (c8.isSelected()){

                    if( control  < 4){
                        list.add("107");
                        control++;
                    }
                }
                if (c9.isSelected()){

                    if( control  < 4){
                        list.add("108");
                        control++;
                    }
                }
                if (c10.isSelected()){

                    if( control  < 4){
                        list.add("109");
                        control++;
                    }
                }




            }
        });

    }


    public static void user_interface() {

        new login();

    }


}
