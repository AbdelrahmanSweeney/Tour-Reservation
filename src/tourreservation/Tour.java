package tourreservation;

import java.sql.Date;
import java.sql.Time;

class Tour {
//
    public Tour(){}
    public Tour(Date s_date_Tour, String destination_Tour, String veichle_Tour, int price_Tour, Date f_date_Tour, int size_Tour) {
        this.id_Tour = id_Tour;
        this.s_date_Tour = s_date_Tour;
        this.destination_Tour = destination_Tour;
        this.veichle_Tour = veichle_Tour;
        this.price_Tour = price_Tour;
        this.f_date_Tour = f_date_Tour;
        this.size_Tour = size_Tour;
    }

    public int getId_Tour() {
        return id_Tour;
    }

    public Date getS_date_Tour() {
        return s_date_Tour;
    }

    public String getDestination_Tour() {
        return destination_Tour;
    }

    public String getVeichle_Tour() {
        return veichle_Tour;
    }

    public int getPrice_Tour() {
        return price_Tour;
    }

    public Date getF_date_Tour() {
        return f_date_Tour;
    }

    public int getSize_Tour() {
        return size_Tour;
    }

    
    
    private int id_Tour;
    private Date s_date_Tour;
    private String destination_Tour;
    private String veichle_Tour ;
    private int price_Tour;
    private Date f_date_Tour;
    private int size_Tour;
    
    
    
}
