// program that determines whether there is a protein in a strand of DNA

public class DNA {

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // String variable dna set to dna1 sequence
        String dna = dna3;

        // find the length of the dna string
        int length = dna.length();
        System.out.println("Length: " + length);

        // Find the start codon and stop codon:
        // Find the index where ATG begins using indexOf()
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        // if statement that checks for a start codon and a stop codon that is not -1
        // (nagative) AND that the number is divisible by 3
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println("Condition 1 and 2 and 3 are satisfied.");

            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein.");
        }

        // Test code with each DNA strand. These should be the results:
        // dna1: Contains a protein
        // dna2: Does not contain a protein
        // dna3: Contains a protein

    }
}
