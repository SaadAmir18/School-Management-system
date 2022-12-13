import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Personal {
    private int id;
    private String name;
    private String gender;
    private LocalDate localDate;
    private String phoneNo;
    private String city;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static ArrayList<Personal> read(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student?characterEncoding=latin1", "saad", "saad");
            Statement stmt = con.createStatement();
            ArrayList<Personal> personalsInfo = new ArrayList<>();
            ResultSet rs = stmt.executeQuery(" Select * from personal_info; ");
            while (rs.next()) {
                Personal personal = new Personal();
                personal.setId(rs.getInt(1));
                personal.setName(rs.getString(2));
                personal.setGender(rs.getString(3));
                personal.setLocalDate(rs.getDate(4).toLocalDate());
                personal.setPhoneNo(rs.getString(5));


                personal.setCity(rs.getString(6));

                personalsInfo.add(personal);

                System.out.println(rs.getInt(1) + "  " + rs.getString(2)+ "  " + rs.getString(3)+ "  "+ rs.getDate(4).toLocalDate()+"  "+ rs.getString(5)+"  "+ rs.getString(6));
            }
            con.close();
            return personalsInfo;
        } catch (Exception e) {

            System.out.println(e);

            return new ArrayList<>();
        }


    }

    }

