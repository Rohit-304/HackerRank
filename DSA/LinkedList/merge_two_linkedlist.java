/*
This challenge is part of a tutorial track by MyCodeSchool

Given pointers to the heads of two sorted linked lists, merge them into a single, sorted linked list. Either head pointer may be null meaning that the corresponding list is empty.

Example
 refers to 
 refers to 

The new list is 

Function Description

Complete the mergeLists function in the editor below.

mergeLists has the following parameters:

SinglyLinkedListNode pointer headA: a reference to the head of a list
SinglyLinkedListNode pointer headB: a reference to the head of a list
Returns

SinglyLinkedListNode pointer: a reference to the head of the merged list

Input Format
The first line contains an integer , the number of test cases.

The format for each test case is as follows:

The first line contains an integer , the length of the first linked list.
The next  lines contain an integer each, the elements of the linked list.
The next line contains an integer , the length of the second linked list.
The next  lines contain an integer each, the elements of the second linked list.

Constraints, where  is the  element of the list.

Sample Input
1
3
1
2
3
2
3
4

Sample Output
1 2 3 3 4 

Explanation
The first linked list is: 

The second linked list is: 

Hence, the merged linked list is: 

*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temphead = null;
        SinglyLinkedListNode temp  = null;
        
        while(head1 != null || head2 != null){
            
            if(head1 != null && head2 != null && head1.data <= head2.data){
                
                if(temphead == null){
                    temphead = head1;
                    temp = temphead;
                    head1 = head1.next;
                }else{
                    temp.next = head1;
                    temp = temp.next;
                    head1 = head1.next;
                }
                
            }else if(head1 != null && head2 != null && head2.data < head1.data){
                
                if(temphead == null){
                    temphead = head2;
                    temp = temphead;
                    head2 = head2.next;
                }else{
                    temp.next = head2;
                    temp = temp.next;
                    head2 = head2.next;
                }
            
            }else if(head1 == null && head2 != null){
                
                if(temphead == null){
                    temphead = head2;
                    temp = temphead;
                    head2 = head2.next;
                }else{
                    temp.next = head2;
                    temp = temp.next;
                    head2 = head2.next;
                }
                
            }else if(head2 == null && head1 != null){
                
                if(temphead == null){
                    temphead = head1;
                    temp = temphead;
                    head1 = head1.next;
                }else{
                    temp.next = head1;
                    temp = temp.next;
                    head1 = head1.next;
                }
            }
        }
        
        return temphead;

    }

    private static final Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }
          
          	SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printSinglyLinkedList(llist3, " ", bufferedWriter);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}


/*
Test Case 1:
Compiler Message
Success
Input (stdin)
1
3
1
2
3
2
3
4
Expected Output
1 2 3 3 4 


Test Case 2:
Compiler Message
Success
Input (stdin)
1
3
4
5
6
3
1
2
10
Expected Output
1 2 4 5 6 10 

*/


