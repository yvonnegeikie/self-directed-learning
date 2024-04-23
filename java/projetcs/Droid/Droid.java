public class Droid {
    String name;
    int batteryLevel;

    public String toString() {
        return "Hello, I’m the droid: " + name;
        // Prints Hello, I’m the droid: Codey
    }

    // Constructor method for Droid
    public Droid(String droidName, int batteryLevel) {
        name = droidName;
        batteryLevel = 100;
    }

    public static void main(String[] args) {
        Droid Codey = new Droid("Codey", 100);

        System.out.println(Codey);
        // Prints Droid@2aae9190
    }
}
