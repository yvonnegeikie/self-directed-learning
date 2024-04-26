import java.util.Arrays;

public class Classroom {

    public static void main(String[] args) {
        // String array with 4 elements for student names
        String[] students = { "Sade", "Alexus", "Sam", "Koma" };

        // Store the averages of the students most recent math test
        double[] mathScores = new double[4];
        mathScores[0] = 94.5; // Sade got a 94.5 on the test
        mathScores[2] = 76.8; // Sam got a 76.8 on the test

        System.out.println("The number of students in the class is " + students.length); // Prints the number of
                                                                                         // students
    }
}
