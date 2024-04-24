// This program defines a class for an online store order, initializes two orders with different values, and calculates and prints the shipping cost for each order

public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;

    // Constructor method
    public Order(boolean filled, double cost, String shippingMethod, String coupon) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
        couponCode = coupon;
    }

    // Ship() method
    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    // CalculateShipping() method
    public double calculateShipping() {
        if (shipping.equals("Regular")) {
            return 0;
        } else if (shipping.equals("Express")) {
            // Add nested conditionals
            if (couponCode.equals("ship50")) {
                return .85;
            } else {
                return 1.75;
            }
        } else {
            return .50;
        }
    }

    // Main method
    public static void main(String[] args) {
        Order book = new Order(true, 9.99, "Express", "ship50");
        Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");

        book.ship();
        chemistrySet.ship();
    }
}