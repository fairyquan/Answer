package stack_queue;

import java.util.*;

public class Solution4 {
    public int[] findWindowMAx(int[] nums,int k){
        MyQueue myQueue=new MyQueue();
        int[] res=new int[nums.length-k+1];
        int i=0;
        int j=k-1;
        for (int i1=0;i1<k;i1++){
            myQueue.add(nums[i1]);
        }
        while (j<nums.length-1){
           if (nums[i]==myQueue.peek()){
               res[j-k+1]=myQueue.peek();
               myQueue.poll(nums[i]);
           }else {
               res[j-k+1]=myQueue.peek();
           }
           myQueue.add(nums[j+1]);
           i++;
           j++;
        }
        res[nums.length-k]=myQueue.peek();
        return res;
    }
    //单调队列
    class MyQueue {
        Deque<Integer> deque = new LinkedList<>();
        //弹出元素时，比较当前要弹出的数值是否等于队列出口的数值，如果相等则弹出
        //同时判断队列当前是否为空
        void poll(int val) {
            if (!deque.isEmpty() && val == deque.peek()) {
                deque.poll();
            }
        }
        //添加元素时，如果要添加的元素大于入口处的元素，就将入口元素弹出
        //保证队列元素单调递减
        //比如此时队列元素3,1，2将要入队，比1大，所以1弹出，此时队列：3,2
        void add(int val) {
            while (!deque.isEmpty() && val > deque.getLast()) {
                deque.removeLast();
            }
            deque.add(val);
        }
        //队列队顶元素始终为最大值
        int peek() {
            return deque.peek();
        }
    }

    public static void main(String[] args) {
        int[] windowMAx = new Solution4().findWindowMAx(new int[]{3, 1, 2, 5, 4, 3, 6, 8,9,7}, 3);
        System.out.println(Arrays.toString(windowMAx));
    }
}
