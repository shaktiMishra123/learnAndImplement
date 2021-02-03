package LinkedList;

public class LinkedList<T> {
  Node<T> head;

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




  public void printLinkList(){
    if(head == null){
      System.out.println("No linked list available");
    }
    else {
      printFromNode(head);
    }
  }

  public void printFromNode(Node<T> node){
    Node<T> printableNode = node;  // [iron,*silver] -> [silver,*brass] -> [brass,*grass] -> [grass,*gold], [gold,null]
    while (printableNode != null ){
      System.out.print(printableNode.data + " -> ") ;
      printableNode = printableNode.nextAddress;
    }
    System.out.println();
  }
}
