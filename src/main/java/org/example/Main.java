package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of types of items: ");
        int typesNumber = 0;
        while(input.hasNext()) {
            if(input.hasNextInt()){
                typesNumber = input.nextInt();
                if (typesNumber <= 0) {
                    System.out.println("Value must be positive. Setting value to 1.");
                    typesNumber = 1;
                }
                else {
                    System.out.println("Number of types of items: "+typesNumber);
                }
                break;
            }
            else{
                System.out.println("Invalid Input. Please try again.");
                input.next();
            }
        }
        System.out.println("Enter seed: ");
        int seed = 0;
        while(input.hasNext()) {
            if(input.hasNextInt()){
                seed = input.nextInt();
                System.out.println("Seed: "+seed);
                break;
            }
            else{
                System.out.println("Invalid Input. Please try again.");
                input.next();
            }
        }
        System.out.println("Enter knapsack capacity: ");
        int capacity = 0;
        while(input.hasNext()) {
            if(input.hasNextInt()){
                capacity = input.nextInt();
                if (capacity <= 0) {
                    System.out.println("Value must be positive. Setting value to 15.");
                    capacity = 15;
                }
                else {
                    System.out.println("Knapsack capacity: "+capacity);
                }
                break;
            }
            else{
                System.out.println("Invalid Input. Please try again.");
                input.next();
            }
        }
        input.close();
        Problem problem = new Problem(typesNumber,seed,1,10);
        Result result = problem.Solve(capacity);
        String init = problem.toString();
        System.out.println(init);
        String res = result.toString();
        System.out.println(res);

    }
}