package thisJava;

class Node {
    int data;
    Node next;
    Node prev;
};

class LinkedList {
  Node head;
  //constructor to create an empty LinkedList
  LinkedList(){
    head = null;
  }  
};


public class ���������ͱ���_���߿����� { 
  public static void main(String[] args) {
    //create an empty LinkedList
    LinkedList MyList = new LinkedList();

    //Add first node.
    Node first = new Node();
    first.data = 10;
    first.next = null; 
    first.prev = null;
    //linking with head node
    MyList.head = first;

    //Add second node.
    Node second = new Node();
    second.data = 20;
    second.next = null; 
    //linking with first node
    second.prev = first;
    first.next = second;

    //Add third node.
    Node third = new Node();
    third.data = 30;
    third.next = null; 
    //linking with second node
    third.prev = second;
    second.next = third;
  }
}