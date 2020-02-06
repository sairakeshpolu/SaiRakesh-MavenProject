package org.com.learningMaven;
import java.util.Scanner;

public class NewYearGift {
	public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of chocolates you are gifted:");
        n = s.nextInt();
        String choco[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
        {
        	choco[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
            	if (choco[i].compareTo(choco[j])>0) 
                {
                    temp = choco[i];
                    choco[i] = choco[j];
                    choco[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(choco[i] + ",");
        }
        System.out.print(choco[n - 1]);
    }

}
