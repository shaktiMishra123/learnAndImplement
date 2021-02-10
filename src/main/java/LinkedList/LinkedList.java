package LinkedList;

import java.util.HashSet;

public class LinkedList<T> {
  Node<T> head;
 // time complexity O(n)
  public void addNodeAtEnd(Node<T> node) {
    if (head == null) {
      head = node;
    }
    // (head ) [iron,*gold] -> [gold,*silver] -> [silver,*grass] -> {temp}[grass , *brass] -> [brass,null]
    else {
      // (head)  [iron,*gold] ->[gold,*silver] ->  {temp}[silver,*copper] -> [copper,null]
      // (node) [copper,null]
      Node<T> temp;
      temp = head;
      while (temp.nextAddress != null) {
        temp = temp.nextAddress;
      }
      temp.nextAddress = node;
      //temp.nextAddress.nextAddress.nextAddress = node;
    }

  }
//time Complexity O(1)
  public void addNodeAtBeginning(Node<T> node){
    if(head == null){
      head = node;
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
        System.out.println(String.format("found Node at position : %s",counter));
        return temp;
      }
      else {
        temp = temp.nextAddress;
      }
      counter++;
    }
    System.out.println(String.format("No node found for value %s",value));
    return null;
  }

  // [gold,*silver] -> [silver,*copper] -> [copper,*iron] -> [iron,*plastic] -> [plastic,null]
  //node = [gold,*silver]
  // temp = [silver,*copper]
  //address = [[silver,*copper],[copper,*iron] ]
  // space complexity O(n)
  // time complexity O(n)
  // Finding a looped linked list
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

  //null(prev) -> (current)[shakti,*Biman] -> (next)[Biman,*Nitesh] -> [Nitesh,*Deepak] -> [Deepak,null] -> null
  //null(prev) -> [shakti,null] -> [Biman,*Shakti] -> (prev)[Nitesh,*Biman] -> (prev)[Deepak,*Nitesh] -> null(next)(current)
  //prev = null
  //
  //[Deepak,*Nitesh] -> [Nitesh,*Biman] -> [Biman,*Shakti] -> [Shakti,null]
//Space complexity O(1)
  //Time complexity O(n)
  public void reverseLink(){
    Node<T> current = head;
    Node<T> next ;
    Node<T> previous = null ;
    while (current != null){
          next = current.nextAddress;
          current.nextAddress = previous;
          previous = current;
          current = next;
    }
    head = previous;
  }
}


