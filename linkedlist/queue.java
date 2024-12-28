/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author LENOVO LEGION
 */
public class queue {
    private Node front;// phần từ đầu hàng đợi
    private Node rear;//phần tử cuối hàng đợi

    public queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
            System.out.println(data + " added to queue");
            return;
        }
        rear.next = newNode;// noi vao cuoi hang doi
        rear = newNode;// dat node moi lam phan tu cuoi cung trong hang doi
        System.out.println(data + " added to queue");
    }
    
    public int dequeue(){
        if(rear == null){
            System.out.println("queue is empty");
            return -1;
        }
        int dequeueData = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        System.out.println(dequeueData + " removed from queue");
        return dequeueData;
    }
}

