Practice Problem: Travel Cost & Efficiency Calculator
This program calculates the total distance, fuel consumption, and cost for a trip based on user input, demonstrating all 7 requested concepts.

Java
import java.util.Scanner;

/**
 * Program: TripCalculator
 * Purpose: To calculate trip distance and fuel costs using user input and arithmetic operators.
 * * Concepts used: Comments, Data Types, Variables, Arithmetic Operators, 
 * Precedence, Type Conversion, and Scanner.
 */
public class TripCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 3. Java Variables (Using Proper Naming Conventions)
        System.out.print("Enter your name: ");
        String userName = input.nextLine(); // String name = "Eric" style

        System.out.print("Enter distance from start to midpoint (km): ");
        double distanceStartToMid = input.nextDouble();

        System.out.print("Enter distance from midpoint to destination (km): ");
        double distanceMidToEnd = input.nextDouble();

        System.out.print("Enter fuel price per liter: ");
        double fuelPricePerLiter = input.nextDouble();

        // 4. Arithmetic Operators
        // Calculating Total Distance
        double totalDistance = distanceStartToMid + distanceMidToEnd;

        // 5. Operator Precedence & 6. Type Conversion
        // Requirement: Assume a fixed fuel efficiency of 15 km per liter (integer)
        int efficiencyKmPerLiter = 15;
        
        // Use Type Conversion (Casting) and Precedence
        // Formula: (Total Distance / Efficiency) * Price
        double totalFuelNeeded = totalDistance / (double) efficiencyKmPerLiter; 
        double totalTripCost = totalFuelNeeded * fuelPricePerLiter;

        // Displaying Results
        System.out.println("\n--- Trip Summary for " + userName + " ---");
        System.out.println("Total Distance Traveled: " + totalDistance + " km");
        System.out.println("Fuel Efficiency: " + efficiencyKmPerLiter + " km/L");
        System.out.println("Estimated Total Cost: $" + totalTripCost);

        input.close();
    }
}