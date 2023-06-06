/*This challenge is part of a MyCodeSchool tutorial track and is accompanied by a video lesson.

This is an to practice traversing a linked list. Given a pointer to the head node of a linked list, print each node's  element, one per line. If the head pointer is null (indicating the list is empty), there is nothing to print.

Function Description

Complete the printLinkedList function in the editor below.

printLinkedList has the following parameter(s):

SinglyLinkedListNode head: a reference to the head of the list
Print

For each node, print its  value on a new line (console.log in Javascript).
Input Format

The first line of input contains , the number of elements in the linked list.
The next  lines contain one element each, the  values for each node.

Note: Do not read any input from stdin/console. Complete the printLinkedList function in the editor below.

Constraints

, where  is the  element of the linked list.
Sample Input

2
16
13
Sample Output

16
13
Explanation

There are two elements in the linked list. They are represented as 16 -> 13 -> NULL. So, the printLinkedList function should print 16 and 13 each on a new line.
*/

import java.io.*;
import java.math.*;
import java.securtiy.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class solution{
  
  static class SinglyLinkedLIstNode{
    public int data;
    public SinglyLinkedListNode next;
    
    public SinglyLinkedListNode(int nodeData){
      this.data = nodeData;
      this.next = null;
    }
}
  static class SinglyLinkedList{
    public SinglyLinkedList head;
    public SinlyLinkedList tail;
    
    public SinglyLinkedList(){
      this.head = null;
      this.tail = null;
    }
    public vooid insertNode(int nodeData){
      SinglyLinkedLisyNode node = new SinglyLinkedListNode(nodeData );
      
      if(this.head == null){
        head = node;
      }
      else{
        this.tail.next = node;
      }
      this.tail = null;
    }
  }
  // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
  static void printLinkedList(SinglyLinkedListNode head){
    //SinglyLinkedListNode tempnode = head;
    while(head != null){
      System.out.println(head.data);
      head = head.next;
    }
  }
  
  private static final Scanner scanner = new Scanner(System.in);
  
  public statoc void main(String[] args){
    SinglyLinedList llist= new SinglyLinkedList();
    
    int llistcount = scanner.nextInt(); 
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    for(int i = 0; i < llistcount; i++){
      int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLinkedList(llist.head);

        scanner.close();
    }
}
/*
Test case 1:
Input (stdin)
2
16
13
Your Output (stdout)
16
13
Expected Output
16
13

Result:
success
  
Test case 2:
Input (stdin)
4
17
19
5
12
Your Output (stdout)
17
19
5
12
Expected Output
17

Result:
success
*/
  
  

