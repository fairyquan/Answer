package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue;
    public MyStack(){
        queue=new LinkedList<>();
    }
    public void push(int x){
        queue.offer(x);
        int size=queue.size();
        size--;
        while (size-->0){
            queue.offer(queue.peek());
            queue.poll();
        }

    }
    public int pop(){
        return queue.poll();
    }
    public int top(){
        return queue.peek();
    }
    public boolean empty(){
        return queue.isEmpty();
    }
}
