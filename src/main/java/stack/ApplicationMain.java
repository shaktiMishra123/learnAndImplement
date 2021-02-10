package stack;

public class ApplicationMain {
  public static void main(String[] args) {
    Stack<String> stack = new Stack();

    Node<String> goldPlate = new Node<>("goldPlate");
    Node<String> silverPlate = new Node<>("silverPlate");
    Node<String> ironPlate = new Node<>("ironPlate");
    Node<String> copperPlate = new Node<>("copperPlate");
    Node<String> brassPlate = new Node<>("brassPlate");
    Node<String> grassPlate = new Node<>("grassPlate");


    stack.push(goldPlate);
    stack.push(silverPlate);
    stack.push(ironPlate);
    stack.push(copperPlate);
    stack.push(brassPlate);
    stack.push(grassPlate);

    stack.printStack();

    System.out.println("-------------------");

    System.out.println(stack.pop().data);
    System.out.println(stack.pop().data);



    System.out.println("-------------------");

    stack.printStack();


  }
}
