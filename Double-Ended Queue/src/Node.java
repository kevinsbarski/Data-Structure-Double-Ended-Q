public class Node<T> {
    private T value;
    private Node<T> next;

    private static int counter=1;

    public Node(T val){
        this.value = val;
        next = null;

    }

    public Node(T val, Node<T> nextNode){
        this.value = val;
        next = nextNode;

    }
    public T getValue(){
        return this.value;
    }

    public void setValue(T val){
        this.value = val;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public String toString(){
//        String nextString = "NULL";
//        if(next != null) nextString = "{" + next.getValue() + "}";
//        return "{"+value.toString() + "}\t->\t " + nextString;
        return "{"+value.toString()+"}";
    }

    public static Node<Integer> createNode(){
        return new Node<Integer>(counter++);
    }

}

