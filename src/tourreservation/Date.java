package tourreservation;



public class Date {
    double hour;
    String time;
    int day, month, year;
    public String getDate(){
        return ""+hour+":00 "+time+" | "+day+"/"+month+"/"+year;
    }
    
    
}
