package list;
//移除数组元素
public class Solution1 {
    /**
     * 添加虚节点方式
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        // 因为删除可能涉及到头节点，所以设置dummy节点，统一操作
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre=cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
    public static class ListNode {
        // 结点的值
        int val;

        // 下一个结点
        ListNode next;

        // 节点的构造函数(无参)
        public ListNode() {
        }

        // 节点的构造函数(有一个参数)
        public ListNode(int val) {
            this.val = val;
        }

        // 节点的构造函数(有两个参数)
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        ListNode headNode = new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(4, null))));
        ListNode tempNode=headNode;
        while (tempNode!=null){
            System.out.println(tempNode.val);
            tempNode=tempNode.next;
        }
        System.out.println("----------------------");
        ListNode head = new Solution1().removeElements(headNode, 1);
        tempNode=head;
        while (tempNode!=null){
            System.out.println(tempNode.val);
            tempNode=tempNode.next;
        }

    }

}


