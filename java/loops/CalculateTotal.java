import java.util.ArrayList;

class CalculateTotal {

    public static void main(String[] args) {
        // expenses is an ArrayList of doubles
        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;

        // Iterate over expenses and sum up the total of all items
        for (int i = 0; i < expenses.size(); i++) {
            total += expenses.get(i); // add the items value to total

        }

        System.out.println(total);

    }

}
