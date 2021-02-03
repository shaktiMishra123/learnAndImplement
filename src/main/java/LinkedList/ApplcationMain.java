package LinkedList;

import java.util.List;

public class ApplcationMain {
  public static void main(String[] args) {

    Node goldNode = new Node<String>("gold"); //[gold,null]
    Node silverNode = new Node<String>("silver"); //[silver,null]
    Node copperNode = new Node<String>("copper"); // [copper,null]
    Node ironNode = new Node<String>("iron"); //[iron,null]
    Node plasticNode = new Node<String>("plastic"); //[plastic,null]
    Node grassNode = new Node<String>("grass"); //[grass,null]
    Node brassNode = new Node<String>("brass"); // [brass,null]


/*
    ironNode.nextAddress    = silverNode;
    silverNode.nextAddress  = grassNode;
    grassNode.nextAddress   = plasticNode;
    plasticNode.nextAddress = brassNode;
    brassNode.nextAddress   = copperNode;
    copperNode.nextAddress  = goldNode;



    ironNode.nextAddress    = silverNode;
    silverNode.nextAddress  = grassNode;
    grassNode.nextAddress   = brassNode;
    plasticNode.nextAddress = brassNode;
    brassNode.nextAddress   = copperNode;
    copperNode.nextAddress  = goldNode;
*/

    LinkedList<String> list = new LinkedList();
    list.printLinkList();
    list.addNodeAtEnd(grassNode);
    list.addNodeAtEnd(brassNode);
    list.addNodeAtEnd(plasticNode);
    list.addNodeAtEnd(goldNode);
    list.addNodeAtEnd(ironNode);
    list.addNodeAtEnd(silverNode);

    list.printLinkList();
    list.addNodeAtBeginning(copperNode);
    list.printLinkList();


    list.deleteNode("copper");
    list.printLinkList();
    list.deleteNode("plastic");
    list.printLinkList();
    list.deleteNode("soil");
    list.printLinkList();


    list.findNode("silver");

/*
    list.printFromNode(plasticNode);
    System.out.println("--------------------------------");
    list.printFromNode(grassNode);
*/

  /*  printableNode = ironNode
  print(printableNode)
  printableNode = ironNode.nextAddress
  print(printableNode)
  printableNode = printableNode.nextAddress
  print(printableNode)
    */











  }

}
