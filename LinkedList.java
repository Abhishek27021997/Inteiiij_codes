import java.util.*;

public class LinkedList {
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //AddFirst Function
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head == null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    //AddLast Function
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        Node currnode=head;
          while(currnode.next !=null){
                currnode=currnode.next;
        }

        currnode.next=newnode;
        newnode.next=null;
    }

    //Printing Function
    public void printlist(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data + " -> ");
            currnode=currnode.next;
        }

        System.out.println("NULL");
        }

    //deletefirst
    public void deletefirst(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        head=head.next;
    }

    //deletelast
    public void deletelast(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node firstnode=head;
        Node secondnode=head.next;
        while(secondnode.next!=null){
            secondnode=secondnode.next;
            firstnode=firstnode.next;
        }

        firstnode.next=null;
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addlast("best");
        list.addfirst("is");
        list.addfirst("Mishra");
        list.addfirst("Abhishek");
        list.addfirst("Testing");
        list.printlist();

        list.deletefirst();
        list.addlast("Testing");
        list.printlist();

        list.deletelast();
        list.printlist();



    }
}
