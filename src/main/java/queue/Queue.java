package queue;

public class Queue<T> {
  private Node<T> front;
  private Node<T> rear;

  // (front)[shakti,*Biman] ->[Biman,*Nitesh] -> [Nitesh, null](rear)
  // [Deepak,null]

  // (front)[shakti,*Biman] ->[Biman,*Nitesh] -> [Nitesh, null] [Deepak,null] (rear)
  //O(1)
  public void enqueue(Node<T> node){
    if(isEmpty()){
      rear = node;
      front = node;
    }
    else {
      rear.next = node;
      rear = node;
    }
  }

  // (front)[hemanth,*shakti] ->[shakti,*Biman] ->[Biman,*Nitesh] -> [Nitesh, null](rear)

  //[hemanth,*shakti]
  //O(1)
  public Node<T> dequeue(){
    Node<T> temp = front;
    if(isEmpty()){

    }
    else if(front==rear) {
      front = rear = null;
    }
    else {
      front = front.next;
    }
    return temp;
  }

  //O(n)
  public void printQueue(){
    Node<T> temp = front;
    while (temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public boolean isEmpty(){
    return front == null;
  }
}
