// Removing Elements During Traversal

import java.util.ArrayList;

class Lunch {

    // Method to remove "ant" elements from an ArrayList of strings
    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
        // Iterate through the ArrayList
        for (int i = 0; i < lunchBox.size(); i++) {
            if (lunchBox.get(i) == "ant") {
                lunchBox.remove(lunchBox.get(i));
                // Decrement the index to maintain iteration order
                i--;
            }

        }
        return lunchBox;
        // Return the modified ArrayList
        // prints [apple, sandwich]
    }

    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");
        lunchContainer = removeAnts(lunchContainer);
        System.out.println(lunchContainer);

    }
}