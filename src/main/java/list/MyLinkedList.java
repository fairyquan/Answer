package list;

public class MyLinkedList {
    int size;
    private ListNode head;

    public MyLinkedList() {
        size=0;
        head=new ListNode(0);
    }

    public boolean add(ListNode listNode){
        ListNode cur=head;
        if (listNode!=null){
            for (int i=0;i<size;i++){
                cur=cur.next;
                if (cur==null){
                    break;
                }
            }
            cur.next=listNode;
            size++;
            return true;
        }else {
            return false;
        }
    }
    public boolean add(ListNode listNode,int index){
        ListNode cur=head;
        if (listNode!=null){
            for (int i=0;i<index;i++){
                cur=cur.next;
                if (cur==null){
                    break;
                }
            }
            listNode.next=cur.next;
            cur.next=listNode;
            size++;
            return true;
        }else {
            return false;
        }
    }
    public ListNode get(int index){
        ListNode cur=head;
        if (index>=0 && index<size){
            for (int i=0;i<index;i++){
                cur=cur.next;
            }
            return cur.next;
        }else {
            return null;
        }
    }
    public boolean remove(int index){
        ListNode cur=head;
        if (index>=0 && index<size){
            for (int i=0;i<index;i++){
                cur=cur.next;
            }
            cur.next=cur.next.next;
            size--;
            return true;
        }else {
            return false;
        }
    }
    public void reverse(){
        ListNode pre=null;
        ListNode cur=head.next;
        ListNode temp;
        for (int i=0;i<size;i++){
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        head.next=pre;
    }
    public void reverse2(){
        reverse(null,head.next);
    }


    private boolean reverse(ListNode prev, ListNode cur) {

        if (cur == null) {
            head.next=prev;
            return true;
        }else {
            ListNode temp = cur.next;// 先保存下一个节点
            cur.next = prev;// 反转
            // 更新prev、cur位置
            prev = cur;
            cur = temp;
            return reverse(prev, cur);
        }
    }

}
 class ListNode {
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

     public static void main(String[] args) {
         MyLinkedList myLinkedList = new MyLinkedList();
         myLinkedList.add(new ListNode(1));
         myLinkedList.add(new ListNode(2));
         myLinkedList.add(new ListNode(3));
         myLinkedList.add(new ListNode(4));
         myLinkedList.add(new ListNode(5));

         myLinkedList.reverse2();

         for (int i=0;i<myLinkedList.size;i++){
             System.out.println(myLinkedList.get(i).val);
         }

     }

}
