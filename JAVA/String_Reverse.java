/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
*/
//Using Sring Buffer class
//Using String Builder class

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);  
        sb.reverse();
        String s2 = sb.toString();

        if (A.compareTo(s2) == 0){
            System.out.println("Yes");
        } 
        else {
            System.out.println("No");
        }
    }
}


//********************__________OR__________********************


import java.io.; 
import java.util.;

public class Solution {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    StringBuilder A1 = new StringBuilder();
     A1.append(A);
     A1.reverse();
     String s = A1.toString();
     if(s.equals(A))
     {
        System.out.println("Yes"); 
     }
     else{
         System.out.println("No");
     }
  }
}


/*
Test Case 1:
Input (stdin)
madam
Your Output (stdout)
Yes
Expected Output
Yes

Result:
Success

Test Case 2:
Input (stdin)
java
Your Output (stdout)
No
Expected Output
No

Result:
Success
*/
