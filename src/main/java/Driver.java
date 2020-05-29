import java.awt.*;
import java.sql.*;

public class Driver {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub


        sqliteDatabase.createDatabase();

        login.user_interface();

        //gridMovies.Frame();

        //createAccount.create();

        /*ResultSet res =Database.getData("SELECT * FROM users WHERE user_mail='1fobofobi@gmail.com'");

        while (res.next()){
            System.out.println(res.getString("user_name")+ " "+ res.getString("user_password"));
        }*/
    }

}