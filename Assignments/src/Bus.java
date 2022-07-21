public class Bus extends Public_transport {
    final private int max_passenger=30;
    private int current_passenger;
    final private int busfare = 1000;
    private String status = "운행중";

    @Override
    public int getMax_passenger() {         //overriding the max_passenger from PT to 30(private int max_passenger=30)
        return max_passenger;               //so the return here would be 30
    }

    @Override
    public int getCurrent_passenger() {
        if ((current_passenger < max_passenger) && (status == "운행중")) {
        }
        return current_passenger;
    }

    @Override
    public void setCurrent_passenger(int current_passenger) {
        this.current_passenger = current_passenger;
    }

    public int getBusfare() {
        return busfare*current_passenger;       //private int busfare=1000 so return would be 1000*current_passenger(no override, so it will be the same number from the PT)
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
        if (getFuel()<10){
           status="차고지행";
        }
    }
    public void change_status(){
        this.status = (this.status=="운행중") ? "차고지행" : "운행중";
        System.out.println("상태=" + getStatus());
    }
}