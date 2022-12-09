


public class MyDeque<T>  {

    private Node<T> lst_head;

    public MyDeque(){
        lst_head=null;
    }

    public boolean isEmpty(){
        return lst_head == null;
    }

    public void addFirst(Node<T> node){
        if(lst_head == null) lst_head = node;
        else {
            Node<T> temp = new Node<T>(lst_head.getValue(), lst_head.getNext());
            node.setNext(temp);
            lst_head = node;
        }
    }

    public void addLast(Node<T> node){
        if (lst_head == null) lst_head = node;
        else if(lst_head.getNext() == null) lst_head.setNext(node);
        else {
            Node<T> temp = lst_head.getNext();
            while(temp.getNext() != null) temp = temp.getNext();
            temp.setNext(node);
        }
    }

    public T removeFirst(){
        if (lst_head == null) return null;
        T val = (T)lst_head.getValue();
        lst_head = lst_head.getNext();
        return val;
    }
    public T removeLast(){
        if (lst_head == null) return null;
        else if (lst_head.getNext() == null) return removeFirst();
        else if (lst_head.getNext().getNext() == null){
            T val = lst_head.getNext().getValue();
            lst_head.setNext(null);
            return val;
        }
        Node<T> last = lst_head.getNext().getNext();
        Node<T> prev = lst_head.getNext();
        while(last.getNext() != null){
            prev = prev.getNext();
            last = last.getNext();
        }
        T val = last.getValue();
        prev.setNext(null);
        return val;
    }
    public T getFirstValue(){
        if (lst_head == null) return null;
        T val = (T)lst_head.getValue();
        return val;
    }
    public T getLastValue(){
        if (lst_head == null) return null;
        Node<T> temp = new Node<>(lst_head.getValue(), lst_head.getNext());
        while(temp.getNext() != null) temp = temp.getNext();
        T val = temp.getValue();
        return val;
    }


    public String toString(){
        if(lst_head == null) return "";
        System.out.print("START:");
        Node<T> temp = new Node<>(lst_head.getValue(), lst_head.getNext());
        while(temp != null) {
            System.out.print(temp+" -> ");
            temp = temp.getNext();
        }
        System.out.println("END");
        return "";

    }


}
