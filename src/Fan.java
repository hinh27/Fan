public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;


    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue" ;

public Fan(int speed, boolean on, double radius,String color){
    this.speed=speed;
    this.on= on;
    this. radius= radius;
    this.color=color;
}
    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        String s = "";
        switch (speed) {
            case SLOW: s = "SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST";
        }
        return s;
    }

    public String toString() {
        if (on == true) {
            return "\nFan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius + "\nfan is on\n";
        } else {
            return "\nFan color: "+getSpeed() + ", color: " + color   + ", radius: " + radius + "\nfan is off\n";
        }
    }
}

