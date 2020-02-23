package stark;

import java.util.Scanner;

class Node3
{
    int data;
    Node3 next;

    public Node3(int data) {
        this.data = data;
        next = null;
    }
}
public class MyStackLinkList {

    Node3 top;

    public MyStackLinkList() {
        this.top = null;
    }

    void push(Node3 newnode)
    {
        newnode.next = top;
        top = newnode;
    }
    void pop()
    {
        if(top == null)
        {
            System.out.println("Stack Underflow.");
        }
        else
        {
            top = top.next;
        }
    }
    void traverse()
    {
        if(top == null)
        {
            System.out.println("Stack Empty.");
        }
        else {
            Node3 temp = top;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}

class MyStackLinkListMain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStackLinkList obj = new MyStackLinkList();
        while(true)
        {
            System.out.println("Enter 1 to push data into stack: ");
            System.out.println("Enter 2 to pop data from stack: ");
            System.out.println("Enter 3 to traverse the stack: ");
            System.out.println("Enter 4 to exit: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the data to push:");
                    int d = sc.nextInt();
                    Node3 n3 = new Node3(d);
                    obj.push(n3);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct option.");
            }
        }
    }
}
