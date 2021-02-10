package queue;

public class ApplicationMain {

  public static void main(String[] args) {
    Queue<String> queue = new Queue<>();
    Node<String> shakti = new Node<>("Shakti");
    Node<String> biman = new Node<>("Biman");
    Node<String> nitesh = new Node<>("Nitesh");
    Node<String> deepak = new Node<>("Deepak");
    Node<String> hemanth = new Node<>("Hemanth");

    queue.enqueue(shakti);
    queue.enqueue(biman);
    queue.enqueue(nitesh);
    queue.enqueue(deepak);
    queue.enqueue(hemanth);

    queue.printQueue();

    System.out.println();
    queue.dequeue();

    queue.printQueue();
  }

}
