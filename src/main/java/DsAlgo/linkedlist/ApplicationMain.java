package DsAlgo.linkedlist;

public class ApplicationMain {
  public static void main(String[] args) {

    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);

    LinkedList list = new LinkedList();
/*    list.addToBeginning(a);
    list.addToBeginning(b);
    list.addToBeginning(c);
    list.addToBeginning(d);
    list.addToBeginning(e);*/
    //list.addToBeginning(b);


    list.addElementToEnd(a);
    list.addElementToEnd(b);
    list.addElementToEnd(c);
    list.addElementToEnd(d);
    list.addElementToEnd(e);
    printList(a);

    System.out.println(list.findAnElementInList(5));


/*    a.nextNodeAddr = b;
    b.nextNodeAddr = c;
    c.nextNodeAddr = d;


    printList(a);
    System.out.println();
    System.out.println();
    System.out.println();

    a.nextNodeAddr = d;

    printList(a);

    LinkedList list = new LinkedList();
    list.addToBeginning(e);

    System.out.println();
    System.out.println();
    System.out.println();

    printList(a);*/

  }


  // O(n) -- time complexity
  public static void printList(Node node){
    Node temp = node;
    while (temp != null){
      System.out.println(temp.value);
      temp = temp.nextNodeAddr;
    }
   /* System.out.println(temp.value + " " + temp.nextNodeAddr);
    System.out.println(temp.nextNodeAddr.value + " " + temp.nextNodeAddr.nextNodeAddr.value);
   */
  }

}

