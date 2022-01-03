package com.wage;
import java.util.Scanner;

public class EmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        EmployeeWageComputation totalWage = new EmployeeWageComputation();
        totalWage.totalEmpWage();
    }
    void totalEmpWage() {
        System.out.println("welcome to employee wage computation");
        final int NUM_OF_DAYS = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a employee rate per hour:");
        int empRatePerHour= sc.nextInt();
        int empWages = 0;
        int empHour = 0;
        int totalEmpWages = 0;
        for ( int day=0; day<=NUM_OF_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() *10)%3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHour = 8;
                    break;
                case IS_PART_TIME:
                    empHour = 4;
                    break;
                default:
                    empHour = 0;
            }
            empWages = empHour * empRatePerHour;
            totalEmpWages += empWages;
            System.out.println(" employee wage is " + empWages);
        }
        System.out.println("total employee wage is " + totalEmpWages);
    }
}