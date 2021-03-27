package DsAlgo.linkedlist.LL;

public class LinkedList {

  Node head;
  public void insertAtTheEnd(int date){

    Node node = new Node();
    node.value = date;
    node.next = null;

    if(head == null){
      head = node;
    }
    else {
      Node tempNode = head;
      while (tempNode.next != null){
           tempNode = tempNode.next;
      }
      tempNode.next = node;
    }
  }


  public void insertAtTheStart(Integer data){
    Node node = new Node();
    node.value = data;
    node.next = null;
    node.next = head;
    head = node;
  }


  public void insertAtSomeIndex(int index, int data){
    Node node = new Node();
    node.value = data;
    node.next = null;

    if(index == 0){
      insertAtTheStart(data);
    }
    else {
      Node tempNode = head;
      for(int i =0 ; i < index - 1 ; i++ ){
        tempNode = tempNode.next;
      }
      node.next = tempNode.next;
      tempNode.next = node;
    }
  }


  public void deleteAtSomeIndex(int index){
      Node tempNode = head;
      Node tempNode2 = null;
      for(int i = 0 ; i < index - 1 ; i ++ ){
       tempNode = tempNode.next;
      }
      tempNode2 = tempNode.next;
      tempNode.next = tempNode2.next;
  }


  public void findAnElementInList(int value){
     Node tempNode = head;
     while (tempNode.next != null){
       if(tempNode.value == value){
         System.out.println("value found is : "+ tempNode.value);
       }
         tempNode = tempNode.next;
     }
    System.out.println("value is not present in linked list");
  }


  public void show(){
    Node tempNode = head;
    while (tempNode.next != null) {
      System.out.println(tempNode.value);
      tempNode = tempNode.next;
    }
    System.out.println(tempNode.value);

  }

}
