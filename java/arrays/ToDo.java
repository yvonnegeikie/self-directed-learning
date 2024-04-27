
// Import ArrayList using java.util
import java.util.ArrayList;

class ToDos {

    public static void main(String[] args) {
        // ArrayList called toDoList is empty ()
        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";

        // Add more to-dos here:
        // Initialize two new String variables: toDo2 and toDo3
        String toDo2 = "Feed the cat";
        String toDo3 = "Empty the bins";
        // Add to-dos to toDoList
        // Use .add() to add toDo1, toDo2, and toDo3 to toDoList
        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        System.out.println(toDoList);

    }

    // Sherlock and Poirot list of things to do
    public static void main(String[] args) {

        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        // Print the size of each ArrayList below:
        System.out.println(poirotsToDos.size());
        System.out.println(sherlocksToDos.size());

        // Print the name of the detective with the larger to-do list:
        System.out.println("Poirot");

        // Print Sherlock's third to-do:
        System.out.println("Sherlock's third to-do:");
        System.out.println(sherlocksToDos.get(2));

        // Print Poirot's second to-do:
        System.out.println("\nPoirot's second to-do:");
        System.out.println(poirotsToDos.get(1));

        // Remove list items using remove() method:
        sherlocksToDos.remove("visit the crime scene");
        sherlocksToDos.remove("play violin");
        poirotsToDos.remove("visit the crime scene");

        System.out.println(sherlocksToDos.toString() + "\n");
        System.out.println(poirotsToDos.toString());

        // Calculate to-dos until case is solved using indexOf() method
        sherlocksToDos.indexOf("solve the case");

        // Change the value printed:
        System.out.println(sherlocksToDos.indexOf("solve the case"));
    }

}