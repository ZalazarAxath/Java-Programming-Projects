public class Fan {
    // Constants to denote fan speed
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private data fields
    private int speed = SLOW;  // Set default speed as SLOW
    private boolean on = false;  // Set default state as off
    private double radius = 5.0;  // Set default radius as 5
    private String color = "blue";  // Set default color as blue

    // No argument constructor that creates a default fan
    public Fan() {}

    // Accessor and mutator methods for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Determine on/off state
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Determine the radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Determine the color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Return a string description of the fan
    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan color: " + color + ", radius: " + radius + " (fan is off)";
        }
    }
}
