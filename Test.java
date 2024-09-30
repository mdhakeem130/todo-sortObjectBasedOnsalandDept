package com.java.position;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String Object:");
        String a= scanner.next();
        char[] charArray = a.toCharArray();
//        System.out.println(charArray);
        int count=0;
        int secoundInd=-1;

        // Iterate through the char array to find the second 'b'
        for (int i=0;i<charArray.length;i++)
        {
            if (charArray[i] == 'b')
            {
                count++;
                if (count==2)
                {
                   secoundInd=i;
                   break;
                }
            }

        }

        // Output the result
        if (secoundInd != -1) {
            System.out.println("The second occurrence of 'b' is at index " + secoundInd+ ".");
        } else {
            System.out.println("'b' does not occur twice.");
        }
        scanner.close();
    }
}
