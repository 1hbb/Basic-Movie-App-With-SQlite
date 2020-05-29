import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.concurrent.ExecutionException;


public class Database {
    static private Connection c;


    // mysql database connection
    public static Connection getCon() throws Exception{

        if (c == null){
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");

        }

        return c;
    }

    //For  insert, update, delete data
    public static void setData( String s) throws Exception{
        Database.getCon().createStatement().executeUpdate(s);
    }

    // for search data
    public static ResultSet getData(String s) throws Exception {
        return Database.getCon().createStatement().executeQuery(s);
    }


}
