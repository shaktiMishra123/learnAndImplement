package stack;

public class Node<T> {
  T data;
  Node<T> nextPointer;

  public Node(T data) {
    this.data = data;
  }
}
