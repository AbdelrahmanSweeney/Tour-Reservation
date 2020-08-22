package tourreservation;
import java.sql.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Database {
    
    public static Connection openConnection(){
        try{
            String connection = "jdbc:mysql://localhost:3306/tourreservation";
            String id = "root";
            String password = "01283210887";
            Connection cn = DriverManager.getConnection(connection, id, password);
            System.out.println("Successfully Connected");
            return cn;
        }catch(Exception e){System.err.println(e);}
        return null;
    }
    
    
    
    public static void addTour(int id_Tour, Date s_date_Tour, String destination_Tour, String veichle_Tour, int price_Tour, Date f_date_Tour, int size_Tour){
        
        try{
            Connection cn = openConnection();
        
            
                PreparedStatement st = cn.prepareStatement("insert into tour(id_Tour, s_date_Tour,"
                        + " destination_Tour,veichle_Tour, price_Tour, f_date_Tour, size_Tour)"
                        + "values ("+id_Tour+",'"+s_date_Tour+"' , '"+destination_Tour+"', '"+veichle_Tour+"', "+price_Tour+", '"+f_date_Tour+"'"
                                + ","+size_Tour+")");
                st.executeUpdate();
                System.out.println("Tour Added");

        }catch(Exception e ){System.err.println(e);}
    }
    
    
    public static void addTourist(String ssn_Tourist, String name_Tourist, boolean gender_Tourist,
                 String address_Tourist, int age_Tourist, String phone_Tourist, int tour_id_Tourist){
        try {
            Connection cn = openConnection();
            PreparedStatement st = cn.prepareStatement("insert into tourist (ssn_Tourist, name_Tourist, gender_Tourist,"
                + " address_Tourist, age_Tourist, phone_Tourist, tour_id_Tourist)"
                + "values ("+ssn_Tourist+", '"+name_Tourist+"', "+gender_Tourist+", '"+address_Tourist+"', "
                        + ""+age_Tourist+", '"+phone_Tourist+"', "+tour_id_Tourist+")");
            st.executeUpdate();
            System.out.println("Tourist Added");
        }catch (Exception e ){System.err.println(e);}
    }
    
    public static void addEmployee(int id_Employee, String name_Employee, String user_Employee,
                String pass_Employee, int age_Employee, boolean gender_Employee, String phone_Employee, int salary_Employee, String func_Employee){
        try {
            Connection cn = openConnection();
            PreparedStatement st = cn.prepareStatement("insert into tourist (ssn_Tourist, name_Tourist, gender_Tourist,"
                + " address_Tourist, age_Tourist, phone_Tourist)"
                + "values ("+id_Employee+", '"+name_Employee+"', '"+user_Employee+"', '"+pass_Employee+"', "+age_Employee+", "+gender_Employee+", '"+phone_Employee+"', "+salary_Employee+", '"+func_Employee+"')");
            System.out.println("Employee Added");
        }catch (Exception e ){System.err.println(e);}
    }
    
    
    
    
    public static ArrayList<Tour> getTour(){
        ArrayList<Tour> tourlist = new ArrayList<>();
        try{
            Connection cn = openConnection();
        
            
                Statement st = cn.createStatement();
                ResultSet result = st.executeQuery("select * from tour ");
                
                Tour tour;
                while(result.next()){
                    tour = new Tour ( result.getDate("s_date_Tour"), 
                            result.getString("destination_Tour"), result.getString("veichle_Tour"), 
                            result.getInt("price_Tour"), result.getDate("f_date_Tour"), result.getInt("size_Tour"));
                    tourlist.add(tour);
                }
                
            System.out.println("Tour Selected");
        }catch(Exception e ){System.err.println(e);}
        return tourlist;
    }
    
    
    
    public static ArrayList<Tour> getTour( String place ){
        ArrayList<Tour> tourlist = new ArrayList<>();
        try{
            Connection cn = openConnection();
        
            
                Statement st = cn.createStatement();
                ResultSet result = st.executeQuery("select * from tour where destination_Tour = '"+place+"'");
                
                Tour tour;
                while(result.next()){
                    tour = new Tour ( result.getDate("s_date_Tour"),
                            result.getString("destination_Tour"), result.getString("veichle_Tour"),
                            result.getInt("price_Tour"), result.getDate("f_date_Tour"), result.getInt("size_Tour"));
                    tourlist.add(tour);
                }
                
            System.out.println("Tour Selected");
        }catch(Exception e ){System.err.println(e);}
        return tourlist;
    }
    
    
    
    
    
    
    
    
    
    
    
    public static ArrayList<Tour> getTour(int id_Tour){
        ArrayList<Tour> tourlist = new ArrayList<>();
        try{
            Connection cn = openConnection();
        
            
                Statement st = cn.createStatement();
                ResultSet result = st.executeQuery("select * from tour where id_Tour = "+id_Tour+"");
                
                Tour tour;
                while(result.next()){
                    tour = new Tour (result.getDate("s_date_Tour")
                            , result.getString("destination_Tour"), result.getString("veichle_Tour")
                            , result.getInt("price_Tour"), result.getDate("f_date_Tour"), result.getInt("size_Tour"));
                    tourlist.add(tour);
                }
                
            System.out.println("Tour Selected");
        }catch(Exception e ){System.err.println(e);}
        return tourlist;
    }
    
    
    
    
    
    public static ArrayList<Tourist> getTourist(int ssn_Tourist){
        ArrayList<Tourist> touristlist = new ArrayList<>();
        try{
            Connection cn = openConnection();
        
            
                Statement st = cn.createStatement();
                ResultSet result = st.executeQuery("select * from tourist where ssn_Tourist ="+ssn_Tourist+" ");
                
                Tourist tourist;
                while(result.next()){
                    tourist = new Tourist (result.getString("ssn_Tourist"), result.getString("name_Tourist"),
                            result.getBoolean("gender_Tourist"), result.getString("address_Tourist"),
                            result.getInt("age_Tourist"), result.getString("phone_Tourist"), result.getInt("tour_id_Tourist"));
                    touristlist.add(tourist);
                }
                
            System.out.println("Tourist Selected");
        }catch(Exception e ){System.err.println(e);}
        return touristlist;
    }
    
    public static ArrayList<Tourist> getTourist(){
        ArrayList<Tourist> touristlist = new ArrayList<>();
        try{
            Connection cn = openConnection();
        
            
                Statement st = cn.createStatement();
                ResultSet result = st.executeQuery("select * from tourist");
                
                Tourist tourist;
                while(result.next()){
                    tourist = new Tourist (result.getString("ssn_Tourist"), result.getString("name_Tourist"),
                            result.getBoolean("gender_Tourist"), result.getString("address_Tourist"),
                            result.getInt("age_Tourist"), result.getString("phone_Tourist"), result.getInt("tour_id_Tourist"));
                    touristlist.add(tourist);
                }
                
            System.out.println("Tourist Selected");
        }catch(Exception e ){System.err.println(e);}
        return touristlist;
    }
    
    
    
    public static ArrayList<Employee> getEmployee(int id_Employee){
        ArrayList<Employee> employeelist = new ArrayList<>();
        try{
            Connection cn = openConnection();
        
            
                Statement st = cn.createStatement();
                ResultSet result = st.executeQuery("select * from employee where id_Employee ="+id_Employee+" ");
                
                Employee employee;
                while(result.next()){
                    employee = new Employee (result.getInt("id_Employee"), result.getString("name_Employee"),
                            result.getInt("age_Employee"), result.getBoolean("gender_Employee"), result.getString("phone_Eployee"),
                            result.getString("user_Employee"), result.getString("pass_Employee"),
                            result.getInt("salary_Employee"), result.getString("func_Employee"));
                    employeelist.add(employee);
                }
                
            System.out.println("Employee Selected");
        }catch(Exception e ){System.err.println(e);}
        return employeelist;
    }
    
    public static void setTour(int id_Tour, Date s_date_Tour, String destination_Tour, String veichle_Tour, int price_Tour, Date f_date_Tour, int size_Tour){
        try {
            Connection cn = openConnection();
            PreparedStatement st = cn.prepareStatement("update tour set "+id_Tour+",'"+s_date_Tour+"' , '"+destination_Tour+"', '"+veichle_Tour+"', "+price_Tour+", '"+f_date_Tour+"'"
                                + ","+size_Tour+"");
            st.executeUpdate();
            System.out.println("Tour Edited");
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }
    
    
    public static void setTourist(String ssn_Tourist, String name_Tourist, boolean gender_Tourist, String address_Tourist, int age_Tourist, String phone_Tourist, int tour_id_Tourist){
        try {
            Connection cn = openConnection();
            PreparedStatement st = cn.prepareStatement("update tourist set ssn_Tourist = '"+ssn_Tourist+"' , name_Tourist = '"+name_Tourist+"', gender_Tourist = ,"+gender_Tourist+""
                + " address_Tourist = '"+address_Tourist+"', age_Tourist = "+age_Tourist+" , phone_Tourist = '"+phone_Tourist+"' "
                    + "where ssn_Tourist = '"+ssn_Tourist+"', tour_id_Tourist = "+tour_id_Tourist+" ");
            st.executeUpdate();
            System.out.println("Tourist Edited");
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }
    
    
    
    
    public static void setEmployee(int id_Employee, String name_employee){
        try {
            Connection cn = openConnection();
            PreparedStatement st = cn.prepareStatement("update employee set id_employee = , name_employee = '', user_employee = '',"
                + " pass_employee = '', age_employee = , gender_employee = , phone_employee = '' "
                    + "where id_Eployee = "+id_Employee+"");
            st.executeUpdate();
            System.out.println("Employee Edited");
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }
    
    
    
    public static void removeTour(int id_Tour){
        try {
            Connection cn = openConnection();
            PreparedStatement st = cn.prepareStatement("delete from tour  where id_Tour = "+id_Tour+"");
            st.executeUpdate();
            System.out.println("Tour Deleted");
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }
    
    
    
    public static void removeTourist(int ssn_Tourist){
        try {
            Connection cn = openConnection();
            PreparedStatement st = cn.prepareStatement("delete from tourist  where id_Eployee = "+ssn_Tourist+"");
            st.executeUpdate();
            System.out.println("Tourist Deleted");
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }
    
    
    
    
    public static void removeEmployee(int id_Employee){
        try {
            Connection cn = openConnection();
            PreparedStatement st = cn.prepareStatement("delete from employee  where id_Eployee = "+id_Employee+"");
            st.executeUpdate();
            System.out.println("Employee Deleted");
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }
    
    
    public static boolean checkTourist(String ssn_Tourist){
        
        try{
            Connection cn = openConnection();
        
            
                Statement st = cn.createStatement();
                ResultSet result = st.executeQuery("select * from tourist where ssn_Tourist ="+ssn_Tourist+" ");
                
                Tourist tourist;
                if(true){
                    System.out.println("The Tourist is Exit");
                }else{System.out.println("Welcome");}
        
        }catch(Exception e ){System.err.println(e);}
        
        return false;
        
    }
    
    
    
    
    
}
