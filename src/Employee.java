import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Employee {


    private int id;
    private String name;

    private City city;
    private Courses course;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {

        return city;
    }

    public void setCity(City city) {

        this.city = city;

    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public static ArrayList<Employee> findAllEmployees() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student?characterEncoding=latin1", "saad", "saad");
            Statement stmt = con.createStatement();
            ArrayList<Employee> employees = new ArrayList<>();
            ResultSet rs = stmt.executeQuery("SELECT e.`id`,e.`employee_name`,c.`c_id`,c.`city`,cr.`crid`,cr.`course_name`FROM employee e INNER JOIN city c ON e.city=c.c_id INNER JOIN courses cr ON e.`course`=cr.`crid`;   ");
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt(1));
                employee.setName(rs.getString(2));
                City ci = new City(rs.getInt(3), rs.getString(4));
                employee.setCity(ci);
                Courses cr = new Courses(rs.getInt(5), rs.getString(6));
                employee.setCourse(cr);
                employees.add(employee);
            }
            con.close();
            return employees;
        } catch (Exception e) {
            System.out.println(e);
            return new ArrayList<>();
        }


    }

}




