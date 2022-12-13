import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
//       Employee em = new Employee();
//        ArrayList<Employee> allEmployees = Employee.findAllEmployees();
//

        //Courses.read();

        //City.read();

   //     City cc1 = new City();
     //   cc1.insert();

        for (Personal personal : Personal.read()) {

            System.out.println(personal.getId());
            // testing
        }


    }


}
