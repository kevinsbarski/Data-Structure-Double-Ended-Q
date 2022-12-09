public class Main {

    public static <T> void reverseDequeue(MyDeque myDequeue){
        MyDeque<T> tmp = new MyDeque<T>();
        while(!myDequeue.isEmpty() ) tmp.addLast(new Node<T>((T)myDequeue.removeLast()));
        while(!tmp.isEmpty()) myDequeue.addLast(new Node<T>((T)tmp.removeFirst()));
    }

    public static void main(String[] args){

        MyDeque<Integer> queue = new MyDeque<>();
        for(int i = 1; i <= 10; i++) queue.addLast(Node.createNode());//delete the heaara leater


        System.out.println(queue);
//        System.out.println(queue.removeFirst());
//        System.out.println(queue);
//        System.out.println(queue.removeLast());
//        System.out.println(queue);
        reverseDequeue(queue);
        System.out.println(queue);
    }


}
