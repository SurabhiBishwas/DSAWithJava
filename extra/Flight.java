package extra;

public class Flight {
    private int flightNo;
    private char destination;
    private float distance;
    private float fuel;

    Flight() {
        this.distance=500;
    }

    private void calculate_fuel() {
        if(this.distance<=1000) {
            this.fuel=500;
        }
        else if(this.distance>1000 && this.distance<=2000) {
            this.fuel=1100;
        }
        else if(this.distance>2000) {
            this.fuel=2200;
        }
    }

    private void display_info() {
        System.out.println("Flight No. : "+this.flightNo);
        System.out.println("Destination : "+this.destination);
        System.out.println("Distance : "+this.distance);
        System.out.println("Fuel : "+this.fuel);

    }

    public void information_entry(int flightNo, char destination, float distance) {
        this.flightNo=flightNo;
        this.destination=destination;
        this.distance=distance;
        calculate_fuel();
        display_info();
    }
}
