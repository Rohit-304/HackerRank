
/*
We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use , , and  to produce some series :

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use , , and  to produce some series :

We then print each element of our series as a single line of space-separated values.
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int b = sc.nextInt();
            int a = sc.nextInt();
            int n = sc.nextInt();
            int res = a;
            for (int j = 0; j < n; j++)
            {
                res += (int)(Math.pow(2, j) * b);
                System.out.print(Integer.toString(res)  + ' ');
            }
            System.out.print('\n');
        }
        sc.close();
    }
}

/*
Test case 1:
Input (stdin)
2
0 2 10
5 3 5
Your Output (stdout)
2 6 14 30 62 126 254 510 1022 2046 
8 14 26 50 98 
Expected Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Result:
Success

Test case 2:
Input (stdin)
3
3 3 3
0 0 5
6 6 10
Your Output (stdout)
6 12 24 
0 0 0 0 0 
12 24 48 96 192 384 768 1536 3072 6144 
Expected Output
6 12 24
0 0 0 0 0
12 24 48 96 192 384 768 1536 3072 6144

Result:
Success

