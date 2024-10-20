/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package magicslip;

/**
 *
 * @author leroy
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Magicslip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputDevice = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$0.00");

        final double BlenderPrice = 39.25;
        final double tax = 0.15;
        String name, address, suburb, city;
        int zip, blender;

        JOptionPane.showMessageDialog(null, "Please enter your details below:");

        name = JOptionPane.showInputDialog("Enter your Name:");
        address = JOptionPane.showInputDialog("Enter your Address:");
        city = JOptionPane.showInputDialog("Enter your City:");
        suburb = JOptionPane.showInputDialog("Enter your Suburb:");
        zip = Integer.parseInt(JOptionPane.showInputDialog("Enter your Zip Code:"));
        blender = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity of blender order:"));

        // Calculation 
        double AmountDueBeforeTax = blender * BlenderPrice;
        double salesTax = AmountDueBeforeTax * tax;
        double netDue = salesTax + AmountDueBeforeTax;

        StringBuilder orderSummary = new StringBuilder();
        
        orderSummary.append("--------Order Summary--------\n");
        orderSummary.append("Customer Name: ").append(name).append("\n");
        orderSummary.append("Customer Address: ").append(address).append(", ").append(city).append(", ").append(suburb).append(", ").append(zip).append("\n");
        orderSummary.append("There are ").append(blender).append(" Blenders ordered @: ").append(df.format(BlenderPrice)).append(" each\n");
        orderSummary.append("\n--------------------------\n");
        orderSummary.append("Price per blender: ").append(df.format(BlenderPrice)).append("\n");
        orderSummary.append("Sales Tax (15%): ").append(df.format(salesTax)).append("\n");
        orderSummary.append("\n--------------------------\n");
        orderSummary.append("Net Amount Due: ").append(df.format(netDue)).append("\n");
        orderSummary.append("\n--------------------------\n");

        JOptionPane.showMessageDialog(null, orderSummary.toString());
    }

}
