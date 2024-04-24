public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    // COnstructor method
    public Reservation(int count, int capacity, boolean open) {
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }
    // // Using the OR operator to check if both conditions are met
    // public Reservation(int count, int capacity, boolean open) {
    // if (guestCount < 1 || guestCount > 8) {
    // System.out.println("Invalid reservation!");
    // }

    // If both conditions are met, reservations confirmed, else denied
    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    // Use NOT ! operator for more sincinct code and less conditionals
    public void informUser() {
        // Write conditional here
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    // Main method
    public static void main(String[] args) {
        Reservation partyOfThree = new Reservation(3, 12, true);
        Reservation partyOfFour = new Reservation(4, 3, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}
