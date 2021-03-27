package DsAlgo.linkedlist;

public class LinkedList {

  // Node -- a -> null
  // head = a -> null, tail = a -> null

  // Node -- b -> null
  // temp =
  Node head;
  Node tail;
//Add a new element to the start of the list
  public void addToBeginning(Node node){
    if (isEmpty()){
      head = tail= node;
    }
    else {
      Node temp  = head;
      head = node;
      head.nextNodeAddr = temp;
    }
  }

//Add a new element to the end of the list

  public void addElementToEnd(Node node){
  if(isEmpty()){
    head = tail = node;
  }
  else {
    tail.nextNodeAddr = node;
    tail = node;

  }

  }


//delete a element
// 1 -> 2 -> 3 -> 4 -> 5
  public boolean deleteElement(int value){
     Node previous = null ;
     Node current ;
     if(isEmpty()){
       return false;
     }
     else if(head == tail ){
       if(head.value == value){
         head = tail = null;
         return true;
       }
       else {
         return false;
       }
     }
     else {
       current = head;
       while (current.nextNodeAddr != null){
         if(current.value == value){
            previous = current.nextNodeAddr;
            current.nextNodeAddr = previous.nextNodeAddr;
         }
       }
       return true;
     }
  }


//Find a element in the list

  public Node findAnElementInList(int value){
    Node tempNode = head;
    while (tempNode.nextNodeAddr != null){
      if(tempNode.value == value){
        return tempNode;
      }
      tempNode = tempNode.nextNodeAddr;
    }
    return null;
  }

//CHeck for IsEmpty

  public Boolean isEmpty(){
   // return head == null;
    if(head == null)
      return true;
    else return false;
  }


//Return the first element of the list

  public Node getFirstNode(){
    return head;
  }



//Return the last element of the list

  public Node getLastNode(){
    return tail;
  }
}
