/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author LENOVO LEGION
 */
    public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed success");
    }
    
    public int pop(){
        if(top == null){
            System.out.println("Stack is empty can not pop");
            return -1;
        }
        int popNode = top.data;// gan gia tri cua dinh stack vao node can pop 
        top = top.next;
        System.out.println(popNode + " poped from stack");
        return popNode;
    }
}
