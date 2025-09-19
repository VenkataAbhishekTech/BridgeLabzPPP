package Inheritance.MultilevelInheritance;

import java.util.Scanner;

class Order{
    String orderId; 
    String orderDate;

    Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    void displayInfo(){
        System.out.println("Order ID: "+orderId);
        System.out.println("Order Date: "+orderDate);
    }
    void getOrderStatus() {
        displayInfo();
        System.out.println("Status: Order Placed");
    }
}
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Status: Shipped");
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Status: Delivered");
    }
}
public class OrderManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Order Date: ");
        String orderDate = sc.nextLine();
        System.out.print("Enter Tracking Number: ");
        String tracking = sc.nextLine();
        System.out.print("Enter Delivery Date: ");
        String delivery = sc.nextLine();
        DeliveredOrder d = new DeliveredOrder(id, orderDate, tracking, delivery);
        d.getOrderStatus();
        sc.close();
    }
}
