package com.otg.jason.offer;

import java.util.Stack;

/**
 * 两个栈组成一个队列
 *
 * @author jason.guan
 * @create 2019-03-06 下午3:04
 **/
public class QueueStack {

    /**
     * 栈 先进后出
     * 栈 A 6 7 8
     * 栈 B 5 4 3 2 1
     * 队列 先进先出      1 2 3 4 5 6
     */
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();


    public void push(Integer val){
        stackIn.push(val);
    }

    public Integer pop() {

        if (!stackOut.isEmpty()) {
            return stackOut.pop();
        } else {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
            if (!stackOut.isEmpty()) {
                return stackOut.pop();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        QueueStack queue = new QueueStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        queue.push(5);
        queue.push(6);
        queue.push(7);

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());




    }
}
