package hotel.management.sysetm;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;

    public conn(){
        try{
          c = DriverManager.getConnection("jdbc:mysql:///projecthms","root","Dhoni@786");
          s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){

    }
}
