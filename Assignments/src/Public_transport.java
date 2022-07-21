import java.util.*;
public class Public_transport {
    protected String number;
    protected int fuel = 100;
    protected int speed = 0;
    protected int current_passenger;
    protected int max_passenger;

    public String getNumber() {             //unique ID for both class
        UUID one = UUID.randomUUID();
        number = one.toString();
        return number;
    }

    public int getFuel() {                      //fuel status & alert for both class
        if (fuel < 10) {
            System.out.println("주유 필요");
            return fuel;
        } else {
            return fuel;
        }
    }

    public void setFuel(int fuel) {     //bring the value set from Main
        this.fuel += fuel;              //add it up to the original fuel value, in this case given as (protected int fuel=100)
    }

    public void setFuel(){}

    public int getCurrent_passenger() {
        return current_passenger;           //return added number of passengers(original number+value set from the Main)
    }

    public void setCurrent_passenger(int current_passenger) {          //bring the value set from Main
        this.current_passenger += current_passenger;                    //add the passengers
    }

    public int getMax_passenger() {        //get the max passenger ->the number is overridden by the value given in Bus and Taxi respectively
        return max_passenger;
    }

//        public void setMax_passenger ( int max_passenger){
//            this.max_passenger = max_passenger;
//        }

    public void left_passenger() {
        if (getCurrent_passenger() > getMax_passenger()) {          //if the value from getCurrent is bigger than getMax
            System.out.println("최대 승객수 초과");             //alerts no seat
        } else {
            System.out.println("탑승 승객=" + getCurrent_passenger());       //shows how many people are on board
            System.out.println("남은 승객=" + (getMax_passenger() - getCurrent_passenger()));      //shows how many seats are left
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed += speed;
    }
}