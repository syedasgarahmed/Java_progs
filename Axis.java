/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;

import java.util.Arrays;
public class Axis {
   public static void main(String args[] ) throws ArrayIndexOutOfBoundsException {
 Scanner sc = new Scanner(System.in);
   System.out.print("Enter N");

    int length,i,j;
length=Integer.parseInt(sc.nextLine());
    char arr[] [] = new char[999][999];
   // while(++pos < length){
	   for(i=0;i<length;i++)
	   {
		   for(j=0;j<9;j++)
		   {
                int aat=0;
      System.out.print("Enter string :");
      arr[i][j] = sc.next().charAt(aat);
	  aat++;
    }
	   }
 for(i=0;i<length;i++)
	   {
		   for(j=0;j<9;j++)
		   {

      System.out.print("\t"+arr[i][j]);

      //arr[i][j] = sc.nextLine();
    }
		  System.out.println();
	   }
    // to read the already populated string array1
   // for(String s: arr){
     // System.out.println(s);
    }
  }
 
