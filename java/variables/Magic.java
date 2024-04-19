public class Magic {
    public static void main(String[] args) {
        // Maths magic trick!
        // myNumber original number is 1
        int myNumber = 1;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        // always prints the number 3 for any whole number (int) used other than 0
        System.out.println(stepSix);

        // Magic number variable
        int myNumber2 = 1;
        int magicNumber = myNumber2 * myNumber2;

        magicNumber += myNumber2;
        magicNumber /= myNumber2;
        magicNumber += 17;
        magicNumber -= myNumber2;
        magicNumber /= 6;

        System.out.println(magicNumber);

    }
}
