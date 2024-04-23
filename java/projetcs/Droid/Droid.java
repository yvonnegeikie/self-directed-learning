public class Droid {
    String name;
    int batteryLevel;

    public String toString() {
        return "Hello, I’m the droid: " + name;
        // Prints Hello, I’m the droid: Codey
    }

    // Define performTask() method
    public String performTask(String task) {
        return name + " is performing task: " + task;
    }

    // Constructor method for Droid
    public Droid(String droidName, int batteryLevel) {
        name = droidName;
        batteryLevel = 100;
    }

    // Battery level drained from performing task
    public void drainBattery() {
        batteryLevel = batteryLevel - 10;
    }

    // New method: energyReport()
    public void energyReport() {
        System.out.println("Battery level: " + batteryLevel);
    }

    public static void main(String[] args) {
        Droid Codey = new Droid("Codey", 100);

        System.out.println(Codey);
        // Prints Droid@2aae9190

        System.out.println(Codey.performTask("dancing"));
        // Prints Codey is performing task: dancing

        System.out.println("Battery level: " + Codey.batteryLevel);
        // Prints Battery level: 0

        // Call the energyReport() method
        Codey.energyReport();
    }
}
