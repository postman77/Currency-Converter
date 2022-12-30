package com.mycompany.currencyconverter;

import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConverter
{
   public static void main(String[] args)
   {
      double amount;
      double cad, usd, euro, yen;
      int choice;
 
      DecimalFormat f = new DecimalFormat("##.##");
 
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Following are the Choices:");
      System.out.println("Enter 1: CAD");
      System.out.println("Enter 2: USD");
      System.out.println("Enter 3: EURO");
      System.out.println("Enter 4: Yen");
 
      System.out.print("\nChoose from above options: ");
      choice = sc.nextInt();
 
      System.out.println("Enter the amount you want to convert?");
      amount = sc.nextFloat();
 
      switch (choice)
      {
         case 1:  // CAD Conversion
            usd = amount * 0.73;
            System.out.println(amount + " CAD = " + f.format(usd) + " USD");
  
            euro = amount * 0.69;
            System.out.println(amount + " CAD = " + f.format(euro) + " Euro");
 
            yen = amount * 97.04;
            System.out.println(amount + " CAD = " + f.format(yen) + " Yen");
            break;
 
         case 2:  // USD Conversion
            cad = amount * 1.36;
            System.out.println(amount + " USD = " + f.format(cad) + " CAD");
  
            euro = amount *0.94;
            System.out.println(amount + " USD = " + f.format(euro) + " Euro");
 
            yen = amount *132.37;
            System.out.println(amount + " USD = " + f.format(yen) + " Yen");
            break;
  
         case 3:  // Euro Conversion
            cad = amount * 1.45;
            System.out.println(amount + " EURO = " + f.format(cad) + " CAD");
 
            usd = amount *1.06;
            System.out.println(amount + " EURO = " + f.format(usd) + " USD");
  
            yen = amount *140.33;
            System.out.println(amount + " EURO = " + f.format(yen) + " Yen");
            break;
 
         case 4:  // Yen Conversion
            cad = amount *0.010;
            System.out.println(amount + " Yen = " + f.format(cad) + " CAD");
 
            usd = amount *0.0076;
            System.out.println(amount + " Yen = " + f.format(usd) + " USD");
 
            euro = amount *0.0071;
            System.out.println(amount + " Yen = " + f.format(euro) + " Euro");
            break;
 
          //Default case
         default:
            System.out.println("Invalid Input");
      }
   }
}