import java.util.ArrayList;

class Playlist {
    // ArrayList called desertIslandPlaylist that can hold String values
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // Use add() to add several (more than five) of your favorite songs to
        // desertIslandPlaylist
        desertIslandPlaylist.add("Song1");
        desertIslandPlaylist.add("Song2");
        desertIslandPlaylist.add("Song3");
        desertIslandPlaylist.add("Song4");
        desertIslandPlaylist.add("Song5");
        desertIslandPlaylist.add("Song6");
        desertIslandPlaylist.add("Song7");
        desertIslandPlaylist.add("Song8");

        // Print desertIslandPlaylist to the terminal - use java Playlist
        System.out.println(desertIslandPlaylist); // [Song1, song2, Song3, Song4, Song5, Song6, Song7, Song8]

        // Use remove() so there are 5 songs in the playlist
        desertIslandPlaylist.remove("Song1");
        desertIslandPlaylist.remove("Song2");
        desertIslandPlaylist.remove("Song3");

        // check the number of songs on your playlist using size()
        System.out.println(desertIslandPlaylist.size()); // prints 5 songs in playlist

        // Get the indices of the songs you want to swap
        int indexA = desertIslandPlaylist.indexOf("Song8"); // Song a
        int indexB = desertIslandPlaylist.indexOf("Song7"); // Song B

        // Create a new String variable called tempA and initialize it with the value of
        // song a
        String tempA = desertIslandPlaylist.get(indexA);

        // Call set() on desertIslandPlaylist to rewrite the song at the index of a with
        // song b.
        desertIslandPlaylist.set(indexB, tempA);

        System.out.println(desertIslandPlaylist);
        // Prints:
        // Song 4
        // Song 5
        // Song 6
        // Song 8
        // Song 8
    }
}