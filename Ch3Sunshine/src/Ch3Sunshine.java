/*
    Program for Sunshine Seashore Rentals. Project will be used to demonstrate
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch3Sunshine {
    //Global Variables
    static int cHours, cMins;
    static double cCost;
    static String oCost;
    static Scanner inputDevice;
    static DecimalFormat dollarAmt;
    public static void main(String[] args) {
        init();
        int iMin = inputTime();
        calcs(iMin);
        CompanyMotto.getMotto();
        output();



    }

    private static void output() {
        oCost = dollarAmt.format(cCost);
        System.out.printf("%-10s%5s%-10s%5s%-10s\n", "Hours", "", "Minutes", "", "Cost");
        System.out.printf("%3s%15s%-10s%1s%-5s", cHours, "", cMins, "", oCost);
        System.out.println();
    }

    private static void calcs(int iMin) {
        cHours = iMin / 60;
        cMins = iMin % 60;
        cCost = (cHours * 40) + cMins;



    }

    private static int inputTime() {
        int iMin;
        System.out.println("Enter your rental time in minutes: ");
        String iData = inputDevice.nextLine();
        try {
            iMin = Integer.parseInt(iData);
        }
        catch (Exception e) {
            System.out.println("Error. Entry must be a numeric value.");
            System.out.println("Minutes assigned a value of 60");
            iMin = 60;
        }
        return iMin;

    }

    private static void init() {
        inputDevice = new Scanner(System.in);
        dollarAmt = new DecimalFormat("$#,###.00");
    }
}
