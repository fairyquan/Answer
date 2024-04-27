package stack_queue;

import java.util.Stack;

////package stack_queue;
////
////import java.util.Stack;
////
//public class MyQueue {
//    public int size=0;
//    Stack<Integer> inStack;
//    Stack<Integer> outStack;
//    public MyQueue(){
//        this.inStack=new Stack<>();
//        this.outStack=new Stack<>();
//    }
//
//    public void push(Integer i){
//        inStack.push(i);
//        size = inStack.size();
//    }
//    public Integer pop(){
//        int tempSize=inStack.size();
//        for (int i=0;i<tempSize;i++){
//            outStack.push(inStack.pop());
//        }
//        Integer integer = outStack.pop();
//        tempSize=outStack.size();
//        for (int i=0;i<tempSize;i++){
//            inStack.push(outStack.pop());
//        }
//        size=inStack.size();
//        return integer;
//
//
//    }
//    public int peek(){
//        int tempSize=inStack.size();
//        for (int i=0;i<tempSize;i++){
//            outStack.push(inStack.pop());
//        }
//        Integer integer = outStack.peek();
//        for (int i=0;i<tempSize;i++){
//            inStack.push(outStack.pop());
//        }
//        size=inStack.size();
//        return integer;
//
//    }
//    public boolean isEmpty(){
//        if (size==0){
//            return true;
//        }
//        return false;
//    }
////
////}
public class MyQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    /** Initialize your data structure here. */
    public MyQueue() {
        stackIn = new Stack<>(); // 负责进栈
        stackOut = new Stack<>(); // 负责出栈
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackIn.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        dumpstackIn();
        return stackOut.pop();
    }

    /** Get the front element. */
    public int peek() {
        dumpstackIn();
        return stackOut.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    // 如果stackOut为空，那么将stackIn中的元素全部放到stackOut中
    private void dumpstackIn(){
        if (!stackOut.isEmpty()) return;
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
}
