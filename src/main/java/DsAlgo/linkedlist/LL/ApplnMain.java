package DsAlgo.linkedlist.LL;

public class ApplnMain {
  public static void main(String[] args) {

    LinkedList list = new LinkedList();

    list.insertAtTheEnd(10);
    list.insertAtTheEnd(20);
    list.insertAtTheEnd(3);

    list.insertAtTheStart(10);
    list.insertAtTheStart(20);
    list.insertAtTheStart(30);

    list.insertAtSomeIndex(0,25);

    list.deleteAtSomeIndex(2);
    list.findAnElementInList(1);



    list.show();


  }
}
