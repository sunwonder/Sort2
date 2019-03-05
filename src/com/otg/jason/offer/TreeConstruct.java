package com.otg.jason.offer;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2019-03-05 下午11:30
 **/
public class TreeConstruct {

    public static void main(String[] args) {
            // 二叉树的先序序列
            int[] preOrder = { 1, 2, 4, 7, 3, 5, 6, 8 };
            // 二叉树的中序序列
            int[] inOrder = { 4, 7, 2, 1, 5, 3, 8, 6 };
            BinaryTreeNode root = reconstructe(preOrder, inOrder);
            printPostOrder(root); // 后序打印二叉树

    }

    public static BinaryTreeNode reconstructe(int[] preOrder,int[] inOrder){
        if (preOrder == null || inOrder == null || preOrder.length == 0 || inOrder.length == 0 || preOrder.length != inOrder.length) {
            return null;
        }

        BinaryTreeNode root = new BinaryTreeNode(preOrder[0]);
        root.setLeft(null);
        root.setRight(null);

        int leftcount=0;
        for(int in:inOrder){
            if(in == root.getVal()){
                break;
            }else{
                leftcount++;
            }
        }
        int rightcount= inOrder.length-leftcount-1;
        if(leftcount>0){
            int[] leftPreOrder = new int[leftcount];
            int[] leftInOrder = new int[leftcount];
            for(int i=0;i<leftcount;i++){
                leftPreOrder[i]= preOrder[i+1];
                leftInOrder[i]= inOrder[i];
            }
            BinaryTreeNode left =reconstructe(leftPreOrder,leftInOrder);
            root.setLeft(left);
        }

        if(rightcount>0){
            int[] rightPreOrder = new int[rightcount];
            int[] rightInOrder = new int[rightcount];
            for(int i=0;i<rightcount;i++){
                rightPreOrder[i]= preOrder[leftcount+1+i];
                rightInOrder[i]= inOrder[leftcount+1+i];
            }
            BinaryTreeNode right =reconstructe(rightPreOrder,rightInOrder);
            root.setRight(right);
        }





        return root;
    }

    /**
     * 后序遍历二叉树（递归实现）
     */
    public static void printPostOrder(BinaryTreeNode root) {
        if (root != null) {
            System.out.println(root.getVal());
            printPostOrder(root.getLeft());
            printPostOrder(root.getRight());

        }
    }
}
