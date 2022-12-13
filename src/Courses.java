import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Courses {
    private int cr_id;
    private String courseName;

    public Courses(int cr_id, String courseName) {
        this.cr_id=cr_id;
        this.courseName=courseName;
    }

    public Courses() {

    }

    public int getCr_id() {
        return cr_id;
    }

    public void setCr_id(int cr_id) {
        this.cr_id = cr_id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public static ArrayList<Courses> read(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student?characterEncoding=latin1", "saad", "saad");
            Statement stmt = con.createStatement();
            ArrayList<Courses> courseList = new ArrayList<>();
            ResultSet rs = stmt.executeQuery("select * from courses");
            while (rs.next()) {

                Courses courses= new Courses();


                courses.setCr_id(rs.getInt(1));
                courses.setCourseName(rs.getString(2));

                courseList.add(courses);

                System.out.println(rs.getInt(1)+ "  "+ rs.getString(2));
            }

            con.close();
            return courseList;
        } catch (Exception e) {
            System.out.println(e);

            return new ArrayList<>();
        }


    }


}
