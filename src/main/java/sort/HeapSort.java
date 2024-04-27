package sort;

import java.util.Arrays;

public class HeapSort {
    private final int[] array;
    public HeapSort(int[] array){
        this.array=array;
    }

    /**
     * 排序方法
     */
    public void sort(){
        /*
         *  第一步：将数组堆化
         *  beginIndex = 第一个非叶子节点。
         *  从第一个非叶子节点开始即可。无需从最后一个叶子节点开始。
         *  叶子节点可以看作已符合堆要求的节点，根节点就是它自己且自己以下值为最大。
         */
        int len = array.length - 1;
        int beginIndex = (len - 1) / 2;
        for(int i = beginIndex; i >= 0; i--){
            maxHeapify(i, len);
        }

        /*
         * 第二步：对堆化数据排序
         * 每次都是移出最顶层的根节点A[0]，与最尾部节点位置调换，同时遍历长度 - 1。
         * 然后从新整理被换到根节点的末尾元素，使其符合堆的特性。
         * 直至未排序的堆长度为 0。
         */
        for(int i = len; i > 0; i--){
            swap(0, i);
            maxHeapify(0, i - 1);
        }
    }
    /**
     * 调整索引为 index 处的数据，使其符合堆的特性。
     *
     * @param index 需要堆化处理的数据的索引
     * @param len 未排序的堆（数组）的长度
     */
    private void maxHeapify(int index,int len){
        int left = (index*2) + 1; // 左子节点索引..
        int right = left + 1;           // 右子节点索引
        int cMax = left;             // 子节点值最大索引，默认左子节点。

        if(left > len) return;       // 左子节点索引超出计算范围，直接返回。
        if(right <= len && array[right] > array[left]){// 先判断左右子节点，哪个较大。
            cMax = right;
        }
        if(array[cMax] > array[index]){
            swap(cMax, index);      // 如果父节点被子节点调换，
            maxHeapify(cMax, len);  // 则需要继续判断换下后的父节点是否符合堆的特性。
        }
    }

    /**
     * 交换两个元素位置
     *
     * @param i
     * @param j
     */
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums={4,1,9,3,6,8,7,5,2};
        new HeapSort(nums).sort();
        System.out.println(Arrays.toString(nums));

    }
}
