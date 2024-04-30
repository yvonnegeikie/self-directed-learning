//2. The length() string method returns the length ⁠— total number of characters ⁠— of a String
public class TweetCounter {
    public static void main(String[] args) {

        String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";

        // What's the character count?
        System.out.println(tweet.length());
        // prints 83
    }
}

// 3. The concat() method concatenates one string to the end of another string.
// Concatenation is the operation of joining two strings together.
public class CombineNames {
    public static void main(String[] args) {

        // Add your first names:
        String firstName = "Yvonne ";
        String lastName = "Geikie";

        // What's the full name?
        System.out.println(firstName.concat(lastName));

    }
}

// 4. With objects, such as Strings, we can’t use the primitive equality
// operator == to check for equality between two strings. To test equality with
// strings, we use a built-in method called equals().
public class Password {
    public static void main(String[] args) {

        String password = "correcthorsebatterystaple";

        // Write the code:
        System.out.println(password.equals("jhskfhkdjf"));

    }
}

// 5. indexOf
public class MorseCode {
    public static void main(String[] args) {

        String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";

        // Write the code:
        System.out.println(code.indexOf(". .- -"));
        // prints 87
    }
}

// 6. charAt() method returns the character located at a String‘s specified
// index
public class Initials {
    public static void main(String[] args) {

        // Add a first name and a last name:
        String firstName = "Yvonne ";
        String lastName = "Geikie";

        // What are the initials?
        System.out.println(firstName.charAt(0));
        System.out.println(lastName.charAt(0));
    }
}

// 7. substring() extracts a substring from a string starting at the index
// provided and continuing to the end of the string, or from the start/end of 2
// index points provided
public class Poetry {
    public static void main(String[] args) {

        String line = "The Heav'ns and all the Constellations rung";
        // Change the arguments:
        System.out.println(line.substring(4, 11));
        // prints Heav'ns
    }
}

// 8. toUpperCase() / toLowerCase()
public class Hashtag {
    public static void main(String[] args) {

        String hashtag = "#100DaysOfCode";

        // Make the hashtag lowercase:
        System.out.println(hashtag.toLowerCase());
        // prints #100daysofcode
    }
}
