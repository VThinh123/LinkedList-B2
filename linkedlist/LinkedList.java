/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

public class LinkedList {

    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = NewNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = NewNode;
    }

    public void addNode(int data, int index) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if(index < 0){
            System.out.println("index must positive number");
            return;
        }
        if(index == 0){
                  newNode.next = head;
        head = newNode;
        return;  
        }
        Node temp = head;
        Node prev = null;
        int count = 0;

        while (temp.next != null) {
            if (count == index) {
                break;
            }

            //đưa temp và prev đến vị trí để add newnode
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (count != index){
            System.out.println("\nOut of head");
            return;
        }
        //gan newnode vào
        newNode.next = temp;
        prev.next = newNode;
    }

    public void printListNode() {
        Node list = head;
        while (list != null) {
            System.out.print(list.getData() + "-->");
            list = list.next;

        }
        System.out.print("null");
    }

    public int getNodeByPosition(int index) {
        if (index < 0) {
            System.out.print("index must postive number");
            return 0;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.getData();
            }
            count++;
            temp = temp.next;
        }
        return 0;
    }

    public Node RemoveFirst() {
        if (head == null) {
            System.out.println("Nothings to remove");
            return null;
        } else {
            Node DeleteNode = head;
            head = head.next;
            return DeleteNode;
        }
    }

    public Node RemoveLast() {
        if (head == null) {
            System.out.println("Nothings to remove");
            return null;
        } else {
            if (head.next == null) {
                Node DNode = head;
                head = null;
                return DNode;
            }
        }
        Node temp = head;
        Node deleteNode = null;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        deleteNode = temp.next;
        temp.next = null;
        return deleteNode;
    }

    public Node RemoveNode(int index) {
        if (head == null) {
            System.out.println("Nothings to remove");
            return null;
        }
        if (index == 0) {
            Node DNode = head;
            head = head.next;
            return DNode;
        }
        Node temp = head;
        Node prev = null;
        Node deleteNode = null;
        int count = 0;
        while (temp.next != null) {
            if (count == index) {
                deleteNode = temp;
                if (prev != null) {
                    prev.next = temp.next;
                }
                return deleteNode;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        System.out.println("Nothings to remove");
        return null;
    }
}
