class Coffee {

    public static void main(String[] args) {

        // initialize cupsOfCoffee
        int cupsOfCoffee = 1;
        // add while loop with counter
        while (cupsOfCoffee <= 100) {
            cupsOfCoffee++; 
            // counter iterates through cupsOfCoffee adding 1 until it reaches 100
            System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
            // prints Fry drinks cup of coffee #2 ... Fry drinks cup of coffee #100
        }

        // refactor using a for loop 
        for (int cupsOfCoffee = 1; cupsOfCoffee <= 100; cupsOfCoffee++) {
            System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
    }
}