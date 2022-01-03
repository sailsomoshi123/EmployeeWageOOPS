package com.wage;
import java.util.Scanner;

public class EmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    int empHour = 0;
    public static void main(String[] args) {
        EmployeeWageComputation empHour= new EmployeeWageComputation();
        EmployeeWageComputation empWage = new EmployeeWageComputation();
        empWage.dailyEmployeeWage(empHour.employeeHour());
    }
    void dailyEmployeeWage (int empHour) {
        System.out.println("welcome to employee wage computation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee rate per hour: ");
        int empRatePerHour = sc.nextInt();
        int empWages = empHour * empRatePerHour;
        System.out.println("employee wage is " + empWages);
    }
    int employeeHour() {
        int empCheck = (int)Math.floor(Math.random() * 10) % 3;
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
        return empHour;
    }
}
