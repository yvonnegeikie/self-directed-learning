public class MadLibs {
    /*
     * This program generates a mad libbed story.
     * Author: YG
     * Date: Today
     */
    public static void main(String[] args) {
        // Assign variables
        String name1 = "Bonnie";
        String adjective1 = "Fierce";
        String adjective2 = "Bold";
        String adjective3 = "Itchy";
        String verb1 = "Slither";
        String noun1 = "Bum";
        String noun2 = "Magic";
        String noun3 = "Beach";
        String noun4 = "Teacher";
        String noun5 = "Sleep";
        String noun6 = "Lipbalm";
        String name2 = "Millie";
        int number = 2099;
        String place1 = "Glengregor";

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1
                + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}
