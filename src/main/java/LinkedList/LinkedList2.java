package LinkedList;

import java.util.HashSet;

public class LinkedList2<T> {
  Node<T> head;
  Node<T> tail;
 // time complexity O(1)
  public void addNodeAtEnd(Node<T> node) {
    if (head == null) {
      head = node;
      tail = node;
    }
    // (head ) [iron,*gold] -> [gold,*silver] -> [silver,*grass] -> {temp}[grass , *brass] -> [brass,null]
    else {
      // (head)  [iron,*gold] ->[gold,*silver] ->  {temp}[silver,*copper] -> [copper,null]
      // (node) [copper,null]
      tail.nextAddress = node;
      tail = node;
      //temp.nextAddress.nextAddress.nextAddress = node;
    }

  }
//time Complexity O(1)
  public void addNodeAtBeginning(Node<T> node){
    if(head == null){
      head = tail = node;
    } // (head ){temp} [iron,*gold] -> [gold,*silver] -> [silver,*grass] -> [grass , *brass] -> [brass,null]
    // [copper,null]
    // (head) [copper,*iron] -> [iron,*gold] -> [gold,*silver] -> [silver,*grass] -> [grass , *brass] -> [brass,null]
    else {
      Node<T> temp;
      temp = head;
      node.nextAddress = temp;
      head = node;
    }
  }

  //Time Complexity O(n)
  public boolean deleteNode(T value){
    if(head == null){
      System.out.println("No element to Delete");
      return false;
    }
    else if(head == tail){
      if(head.data.equals(value)){
        head = tail = null;
        return true;
      }
      else {
        return false;
      }
    }
    else {
      // [grass , *brass]  --
      // (head ) [iron,*gold] -> [gold,*silver] ->[silver,*grass] -> {current}[grass , *brass] -> [brass,*copper] -> [copper,null]
      // (head ) [iron,*gold] -> [gold,*silver] ->{previous} [silver,*grass] -> [grass , *brass] -> [brass,*copper] -> [copper,null]
      // (head ) [iron,*gold] -> [gold,*silver] -> [silver,*brass] ->  [brass,*copper] -> [copper,null]
      if(head.data.equals(value)){
        head = head.nextAddress;
        return true;
      }
      Node<T> current=head.nextAddress;
      Node<T> previous = head ;
      while (current != null ){
        if(current.data.equals(value)){
          previous.nextAddress = current.nextAddress;
          return true;
        }
        previous = current;
        current = current.nextAddress;

      }

    }
    System.out.println("No element found");
    return false;
  }


  //find node in linked list
// Time Complexity O(n)
  public Node<T> findNode(T value){
    Node<T> temp = head;
    int counter =0;
    while (temp != null){
      if(temp.data.equals(value)) {
        System.out.printf("found Node at position : %s%n",counter);
        return temp;
      }
      else {
        temp = temp.nextAddress;
      }
      counter++;
    }
    System.out.printf("No node found for value %s%n",value);
    return null;
  }

  // [gold,*silver] -> [silver,*copper] -> [copper,*iron] -> [iron,*plastic] -> [plastic,null]
  //node = [gold,*silver]
  // temp = [silver,*copper]
  //address = [[silver,*copper],[copper,*iron] ]
  // space complexity O(n)
  // time complexity O(n)
  public boolean isLoopedLinkedList(Node<T> node){
    Node<T> temp=node;
    //List<Node<T>> address = new java.util.LinkedList<Node<T>>();
    HashSet<Node<T>> address = new HashSet<Node<T>>();
    while (temp != null){
      if(address.contains(temp.nextAddress)){
        System.out.println("looped linkedList");
        return true;
      }
      address.add(temp.nextAddress);
      temp = temp.nextAddress;
    }
    System.out.println("Linked list is not Looped");
  return false;
  }



// Time Complexity O(n)
  public void printLinkList(){
    if(head == null){
      System.out.println("No linked list available");
    }
    else {
      printFromNode(head);
    }
  }

  // Time Complexity O(n)
  public void printFromNode(Node<T> node){
    Node<T> printableNode = node;  // [iron,*silver] -> [silver,*brass] -> [brass,*grass] -> [grass,*gold], [gold,null]
    while (printableNode != null ){
      System.out.print(printableNode.data + " -> ") ;
      printableNode = printableNode.nextAddress;
    }
    System.out.println();
  }
}
