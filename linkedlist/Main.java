/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

import java.util.Scanner;

/**
 *
 * @author LENOVO LEGION
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ListNode = new LinkedList();
        //in ra node tu lon toi nho
//        ListNode.addFirst(1);
//        ListNode.addFirst(2);
//        ListNode.addFirst(3);
//        ListNode.addFirst(4);
//        ListNode.addFirst(5);

        // in ra tu nho toi lon
//        ListNode.addLast(1);
//        ListNode.addLast(2);
//        ListNode.addLast(3);
//        ListNode.addLast(4);
//        ListNode.addLast(5);
//        ListNode.RemoveFirst();
//        ListNode.RemoveLast();
//        ListNode.RemoveNode(2);
//        System.out.println("List node:");
//        ListNode.printListNode();      
        //add node tai mot vi tri nhat dinh
//        System.out.println("\nEnter value: ");
//        int value = sc.nextInt();    
//        System.out.println("Enter index to add node: ");
//        int index = sc.nextInt();
//        ListNode.addNode(value, index);
//        System.out.println("List node after add:");
//        ListNode.printListNode();
        //In ra gia tri tai mot vi tri nhat dinh
//        System.out.print("\nEnter position(positive number): ");
//        int value = sc.nextInt();
//        int result = ListNode.getNodeByPosition(value);
//        System.out.println("Value at position " + value + " : " + result);
//-------------------------------------------------------------------------------
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();

        System.out.println("\n");

        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.dequeue();
    }
}
