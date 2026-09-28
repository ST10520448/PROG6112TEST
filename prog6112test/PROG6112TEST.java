/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112test;

import java.util.Scanner;

/**
 *
 * @author Student
 */
import java.util.Scanner;


public class PROG6112TEST {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Single arrays
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        
        //2D arrays for sales for Cape Town, Port Elizabeth, Pretoria
        int[][] sales = {
             {1000, 2000, 3000},  // Cape Town
            {2000, 3000, 4000},  // Port Elizabeth
            {1500, 1100, 1200}   // Pretoria
        };
        
        //Printing the report 
        System.out.println("NUMBER 1 ELECTRONICS REPORT");
        System.out.println("----------------------------");
        System.out.println("City\t\tPS5\\tXbox\\tSwitch");
        System.out.println("----------------------------");
        
        //
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t" + sales[i][0] + "\t" + sales[i][1] + "\t" + sales[i][2]);
        }
        System.out.println("---------------------------");
        System.out.println("CONSOLE TOTALS FOR EACH CITY");
        System.out.println("---------------------------");
        
        int maxTotal = 0;
        String topCity = " ";
        
        for (int i = 0; i < cities.length; i++) {
             int total = sales[i][0] + sales[i][1] + sales[i][2];
            System.out.println(cities[i] + "\t" + total);

            if (total > maxTotal) {
                maxTotal = total;
                topCity = cities[i];
            }
        }

        System.out.println("------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
    }
}

   
