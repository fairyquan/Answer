package my_priority_queue;

import java.util.Arrays;

public class MyPriorityQueue {
    private  int size;//优先队列的大小
    private  int capacity;//数组的容量
    private  int value[];//储存的值

    public MyPriorityQueue() {
        this.capacity = 10;
        this.value = new int[capacity];
        this.size=0;
    }
    public MyPriorityQueue(int capacity) {
        this.capacity = capacity;
        this.value = new int[capacity];
        this.size=0;
    }

    /**
     * 插入元素
     * @param number
     */
    public void add(int number) {
        if(size==capacity)//扩容
        {
            capacity*=1.5;
            value= Arrays.copyOf(value,capacity);
        }
        value[size++]=number;//先加到末尾
        int index=size-1;
        while (index>=1) {//进行交换
            if(value[index]<value[index/2]) {
                swap(index,index/2,value);
                index=index/2;
            }
            else//不需要交换即停止
                break;
        }
    }
    public int peek() {
        return  value[0];
    }

    /**
     * 抛出队头
     * @return
     */
    public int pop() {
        int val=value[0];//呆返回数据额
        value[0]=value[--size];//将最后一个元素赋值在堆头
        int index=0,leftChild=0,rightChild=0;
        while (true)
        {
            leftChild=index*2+1;
            rightChild=index*2+2;
            if(leftChild>=size)//左孩子必须满足在条件内
                break;
            else if(rightChild<size&&value[rightChild]<value[index]&&value[rightChild]<value[leftChild])
            {//右孩子更小
                swap(index,rightChild,value);
                index=rightChild;
            }
            else if(value[leftChild]<value[index])
            {//左孩子更小
                swap(index,leftChild,value);
                index=leftChild;
            }
            else //不需要 它自己最小
                break;
        }
        return  val;
    }
    //交换两个元素
    public  void swap(int i,int j,int arr[]) {
        int team=arr[i];
        arr[i]=arr[j];
        arr[j]=team;
    }

    public int size() {
        return  size;
    }

}
