
public class BankAccount {
  public static void main(String[] args) {
    // The ballance in my bank account
    double balance = 1000.75;
    double amountToWithdraw = 250;

    double updatedBalance = balance - amountToWithdraw;
    // I give some money to my friends for tickets
    double amountForEachFriend = updatedBalance / 3;
    // I can purchase a ticket if I have at least $250, will be true
    boolean canPurchaseTicket = amountForEachFriend >= 250;
    // Print the amount of money I gave each friend
    System.out.println(canPurchaseTicket);
    System.out.println("I gave each friend " + amountForEachFriend);

  }
}
