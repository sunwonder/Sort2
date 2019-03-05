package com.otg.jason.offer;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2019-03-05 下午11:31
 **/

public class BinaryTreeNode {

    private int val;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    BinaryTreeNode(int x){
        this.val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}
