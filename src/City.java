import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class City {

    private int c_id;
    private String city_names;

    public City(int c_id, String city_names) {
        this.c_id = c_id;
        this.city_names = city_names;
    }

    public City() {

    }


    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getCity_names() {
        return city_names;
    }

    public void setCity_names(String city_names) {
        this.city_names = city_names;
    }

    public static ArrayList<City> read() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student?characterEncoding=latin1", "saad", "saad");
            Statement stmt = con.createStatement();
            ArrayList<City> citiesList = new ArrayList<>();
            ResultSet rs = stmt.executeQuery(" Select * from city; ");
            while (rs.next()) {

                City city = new City();

                city.setC_id(rs.getInt(1));
                city.setCity_names(rs.getString(2));

                citiesList.add(city);

            }
            con.close();
            return citiesList;
        } catch (Exception e) {
            System.out.println(e);

            return new ArrayList<>();
        }


    }

}
