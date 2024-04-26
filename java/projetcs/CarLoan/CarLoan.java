// This is a simple car loan payment calculator that can calculate the car loan amount, interest rate in the loan, length of the loan and the downpayment

public class CarLoan {
    public static void main(String[] args) {

        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        if (loanLength <= 0 || interestRate <= 0) { // Check if loan length and interest rate are valid
            System.out.println("Error! You must take out a valid car loan.");
        } else { // Check if downpayment is enough to pay off the loan
            if (downPayment >= carLoan) {
                System.out.println("The car can be paid in full.");
            } else { // Calculate the remaining ballance and monthly payment
                int remainingBalance = carLoan - downPayment;
                int months = loanLength * 12; // breaks loan length into months
                int monthlyBalance = remainingBalance / months; // monthly payment without interest
                int interest = (monthlyBalance * interestRate) / 100; // monthly payment with interest
                int monthlyPayment = monthlyBalance + interest;
                System.out.println(monthlyPayment); // Print monthly payment. Should print 223
            }
        }

    }
}