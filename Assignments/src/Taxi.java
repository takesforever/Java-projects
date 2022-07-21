public class Taxi extends Public_transport{
private int max_passenger = 4;
private int current_passenger;
private String destination;
private int totalkm;
private int basic_distance=1;
private int taxifare=3000;
private int taxiplusfare=1000;
private int totalearned;
private String status = "일반";
private int fuel = 100;

    public Taxi(){}

    @Override
    public int getMax_passenger() {     //overriding the max_passenger from PT
        return max_passenger;           //so the return would be 4
    }

    @Override
    public int getCurrent_passenger() {
        return current_passenger;
    }

    @Override
    public void setCurrent_passenger(int current_passenger) {
        this.current_passenger = current_passenger;
    }

    public String getDestination() {       //return the newly set destination from setDestination
        return destination;
    }

    public void setDestination(String destination) {    //destination set from the Main
        this.destination = destination;
    }

    public int getTotalkm() {       //same as destination
        return totalkm;
    }

    public void setTotalkm(int totalkm) {
        this.totalkm = totalkm;
    }

    public int getTaxifare() {
        return taxifare;
    }

    public int getTaxiplusfare() {
        return taxifare+(taxiplusfare*(totalkm-basic_distance));
    }

    public void setTaxiplusfare(int taxiplusfare) {
        this.taxiplusfare = taxiplusfare;
    }

    public int getTotalearned() {
        return totalearned;
    }

    public void setTotalearned() {
        this.totalearned = totalearned+getTaxiplusfare();
    }

    public Taxi(int current_passenger, String destination, int totalkm) {
        this.current_passenger = current_passenger;
        this.destination = destination;
        this.totalkm = totalkm;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel += fuel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }

    public void change_status(){
        this.status = (this.status == "일반") ? "운행중" : "탑승불가";
        System.out.println("상태=" + getStatus());
    }
}