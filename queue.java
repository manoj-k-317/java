import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>() ;

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("queue: "+queue);
        System.out.println("poll"+queue.poll());
        System.out.println("peek"+queue.peek());
    }
}
