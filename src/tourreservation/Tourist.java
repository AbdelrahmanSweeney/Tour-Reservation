package tourreservation;
import java.sql.*;
import java.util.logging.Logger;
class Tourist {

    public Tourist(String ssn_Tourist, String name_Tourist, boolean gender_Tourist, String address_Tourist, int age_Tourist, String phone_Tourist, int tour_id_Tourist) {
        this.ssn_Tourist = ssn_Tourist;
        this.name_Tourist = name_Tourist;
        this.gender_Tourist = gender_Tourist;
        this.address_Tourist = address_Tourist;
        this.age_Tourist = age_Tourist;
        this.phone_Tourist = phone_Tourist;
        this.tour_id_Tourist = tour_id_Tourist;
    }
    private static final Logger LOG = Logger.getLogger(Tourist.class.getName());

    public static Logger getLOG() {
        return LOG;
    }

    public String getSsn_Tourist() {
        return ssn_Tourist;
    }

    public String getName_Tourist() {
        return name_Tourist;
    }

    

    public String getAddress_Tourist() {
        return address_Tourist;
    }

    public int getAge_Tourist() {
        return age_Tourist;
    }

    public String getPhone_Tourist() {
        return phone_Tourist;
    }
    
    public boolean isGender_Tourist() {
        return gender_Tourist;
    }

    public int getTour_id_Tourist() {
        return tour_id_Tourist;
    }
    
    private String ssn_Tourist;
    private String name_Tourist;
    private boolean gender_Tourist;
    private String address_Tourist;
    private int age_Tourist;
    private String phone_Tourist;
    private int tour_id_Tourist;

    
}
