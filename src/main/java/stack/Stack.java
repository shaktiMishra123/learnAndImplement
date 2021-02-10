package stack;


public class Stack<T> {

  Node<T> top;
  public void push(Node<T> node){
    if(isEmpty()){
      top = node;
    }
    else {
      node.nextPointer = top;
      top = node;
    }
  }

  public Node<T> pop(){
    if(isEmpty()){
      return null;
    }
    else {
      Node<T> popNode = top;
      top = top.nextPointer;
      return popNode;
    }
  }

  public void printStack(){
    Node<T> temp = top;
    while (temp != null){
      System.out.println(temp.data);
      temp= temp.nextPointer;
    }
  }

  public boolean isEmpty(){
    return top == null;
  }

}
