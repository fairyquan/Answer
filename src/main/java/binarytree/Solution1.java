package binarytree;

import java.util.*;
import java.util.stream.Collectors;
//二叉树的遍历
public class Solution1 {
    public List<List<Integer>> resList = new ArrayList<List<Integer>>();
    //递归遍历
    public List<Integer> traversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        recurrence(root,result);
        return result;
    }
    public void recurrence(TreeNode root, List<Integer> result){
        if (root!=null){

            recurrence(root.left,result);
            result.add(root.val);//放中间就是中序遍历，放后面就是后序遍历
            recurrence(root.right,result);
        }
    }
    //迭代遍历
    //前序遍历
    public List<Integer> preorder(TreeNode root){
        List<Integer> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        Stack<TreeNode> stack=new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()){
                TreeNode treeNode=stack.pop();
                result.add(treeNode.val);
                if (treeNode.right!=null){
                    stack.push(treeNode.right);
                }
                if (treeNode.left!=null){
                    stack.push(treeNode.left);
                }
            }
        return result;
    }
    //后序遍历
    public List<Integer> postorder(TreeNode root){
        List<Integer> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode treeNode=stack.pop();
            result.add(treeNode.val);
            if (treeNode.left!=null){
                stack.push(treeNode.left);
            }
            if (treeNode.right!=null){
                stack.push(treeNode.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
    //中序遍历
    public List<Integer> inorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            if (cur != null){
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }
    //统一风格写法
    //前序
    public List<Integer> preorderTraversal(TreeNode root){

        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if (node.right != null) st.push(node.right);  // 添加右节点（空节点不入栈）
                if (node.left != null) st.push(node.left);    // 添加左节点（空节点不入栈）
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop();           // 将空节点弹出
                node = st.peek();    // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }
    //中序
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if (node.right!=null) st.push(node.right);  // 添加右节点（空节点不入栈）
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

                if (node.left!=null) st.push(node.left);    // 添加左节点（空节点不入栈）
            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop();           // 将空节点弹出
                node = st.peek();    // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }
    //后序
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
//                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
//                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。
                if (node.right!=null) st.push(node.right);  // 添加右节点（空节点不入栈）
                if (node.left!=null) st.push(node.left);    // 添加左节点（空节点不入栈）
            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop();           // 将空节点弹出
                node = st.peek();    // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }
    //层序遍历
    //迭代法——借组队列
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if (root==null) return result;
        Deque<TreeNode> deque=new LinkedList<>();

        deque.offer(root);
        while (!deque.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int size=deque.size();
            while (size-->0){
                TreeNode node = deque.poll();
                temp.add(node.val);
                if(node.left!=null) deque.offer(node.left);
                if (node.right!=null) deque.offer(node.right);
            }
            result.add(temp);
        }
        return result;
    }
    //递归法
    public List<List<Integer>> levelOrder2(TreeNode root){
        checkFun(root,0);
        return resList;
    }
    public void checkFun(TreeNode node, Integer deep) {
        if (node == null) return;
        deep++;

        if (resList.size() < deep) {
            //当层级增加时，list的Item也增加，利用list的索引值进行层级界定
            List<Integer> item = new ArrayList<>();
            resList.add(item);
        }
        resList.get(deep - 1).add(node.val);

        checkFun(node.left, deep);
        checkFun(node.right, deep);
    }
    public List<Double> avg(TreeNode root){
        levelOrder2(root);
        List<Double> res=new ArrayList<>();
        for (int i=0;i<resList.size();i++){
            List<Integer> list = resList.get(i);
            Double sum=0.0;
            for (int j=0;j<list.size();j++){
                sum+=list.get(j).doubleValue();
            }
            res.add(sum/list.size());
        }
        return res;

    }






    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode treeNode2=new TreeNode(4);
        TreeNode treeNode3=new TreeNode(6);
        TreeNode treeNode4=new TreeNode(1);
        TreeNode treeNode5=new TreeNode(2);
        TreeNode treeNode6=new TreeNode(7);
        TreeNode treeNode7=new TreeNode(8);
        root.left=treeNode2;
        treeNode2.left=treeNode4;
        treeNode2.right=treeNode5;
        root.right=treeNode3;
        treeNode3.left=treeNode6;
        treeNode3.right=treeNode7;
        //List<Integer> list = new Solution1().traversal(root);
        //List<Integer> list = new Solution1().preorder(root);
        //List<Integer> list = new Solution1().postorder(root);
        //List<Integer> list = new Solution1().inorder(root);
        //List<Integer> list=new Solution1().preorderTraversal(root);
        //List<Integer> list=new Solution1().inorderTraversal(root);
        //List<Integer> list=new Solution1().postorderTraversal(root);
        //List<List<Integer>> list=new Solution1().levelOrder2(root);
        List<Double> list = new Solution1().avg(root);

        System.out.println(list);
    }
}
