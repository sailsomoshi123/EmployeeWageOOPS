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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a employee rate per hour:");
        int empRatePerHour= sc.nextInt();
        System.out.println("Enter a number of days to calculate wage : ");
        int numOfDays = sc.nextInt();
        System.out.println("Enter a max Working hour : ");
        int maxWorkingHour = sc.nextInt();
        int empHour = 0;
        int totalEmpWages = 0;
        int totalWorkingDays = 0;
        int totalEmpHours = 0;
        while ( totalEmpHours <= maxWorkingHour && totalWorkingDays < numOfDays ) {
            totalWorkingDays++;
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
            System.out.println("day : " + totalWorkingDays + " emp hour : " + empHour );
            totalEmpHours+= empHour;
        }
        totalEmpWages = totalEmpHours * empRatePerHour;
        System.out.println("total employee wage is " + totalEmpWages);
    }
}