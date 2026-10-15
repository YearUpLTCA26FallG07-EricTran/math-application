package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
// Question 1:
// declare variables here
    double bobSalary = 50000 ;
    double garySalary = 60000;
    double highestSalary = Math.max(bobSalary, garySalary);
    System.out.println("The highest salary is : " + highestSalary);

//Question 2:
//Find and display the smallest of two variables named carPrice and
//truckPrice. Set the variables to any value you want.
    double carPrice = 34000 ;
    double truckPrice = 40000;
    double smallest_price = Math.min(carPrice, truckPrice);
    System.out.println("The lowest price is : " + smallest_price);

//Question 3:
//Find and display the area of a circle whose radius is 7.25
// A = pi r^2
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);

//Question 4:
// Find and display the square root of a variable after it is set to 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);
//Question 5:
//Find and display the distance between the points (5, 10) and (85, 50)
        double x = 5;
        double y = 10;
        double x2 = 85;
        double y2 = 50;

        double deltax = x2 - x;
        double deltay = y2 - y;
        double distance = Math.hypot(deltax, deltay);
        System.out.println("The distance is : " + distance);

//Question 6:
//Find and display the absolute (positive) value of a variable after it is set to -3.8
    double negative = -3.8;
    double absolute = Math.abs(negative);
        System.out.println("The number absolute is : " + absolute);

//Question 7:
//Find and display a random number between 0 and 1
double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1: " + randomNumber);

//Question 8:
//Calculate how many minutes are in 24 days, use a variable for each value you
//calculate with. BONUS: How many milliseconds?
int days = 24;
int hours = days * 60;
int minutes = hours * 60;
int total = minutes;
        System.out.println("Total minutes in 24 days " + minutes);

// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
    }
}