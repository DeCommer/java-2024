import java.util.Scanner;
import java.sql.*;

//Right click in this file and select Run Java

public class Startjdbc {
    // Connect to your database.
    public static void main(String[] args) {

        String URL = "jdbc:mysql://10.0.1.14:3306/hot_sauces"; //database connection
        String USER;
        String PASS;
        String QUERY = "SELECT id, sauce_name, location, flavor_type, heat_rating, flavor_rating, comments FROM hot_sauces"; // table query construction
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your User name: ");
        USER = input.nextLine();
        
        System.out.print("Enter your password: ");
        PASS = input.nextLine();

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connected");
            //
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);

            //Printing out the query
            System.out.println("---------------------------------");
            while(rs.next()){
                //Display values in a while loop

                int id = rs.getInt("id");
                String sauce_name = rs.getString("sauce_name");
                String location = rs.getString("location");
                String flavor_type = rs.getString("flavor_type");
                int heat_rating = rs.getInt("heat_rating");
                int flavor_rating = rs.getInt("flavor_rating");
                String comments = rs.getString("comments");
                
                //output values
                System.out.println(id + " " + 
                                sauce_name + ", " + 
                                location + ", " + 
                                flavor_type + ", " + 
                                heat_rating + ", " + 
                                flavor_rating + ", " + 
                                comments);
             }
             System.out.println("---------------------------------");
        
        }catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        input.close();
    }
}
