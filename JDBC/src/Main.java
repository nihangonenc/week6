import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection cn = null;

        try {
            cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental", "postgres", "postgres");
            System.out.println("Veritabanına başarıyla bağlandınız!");

            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM film LIMIT 7;");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("film_id"));
                System.out.println("Title: " + rs.getString("title"));
                System.out.println("Length: " + rs.getInt("length"));
                System.out.println("--------------------------------------");

            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Veritabanı bağlantı hatası: " + e.getMessage());
        }
    }
}