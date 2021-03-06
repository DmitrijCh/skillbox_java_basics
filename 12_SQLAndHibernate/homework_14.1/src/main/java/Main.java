import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "dmitriy";
        String pass = "193105610";

        String query = """
                SELECT p.course_name, COUNT(p.subscription_date) / (MAX(month(p.subscription_date)) - MIN(month(p.subscription_date)) + 1)
                FROM PurchaseList p\s
                WHERE year(p.subscription_date) = 2018
                GROUP BY p.course_name""";
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
