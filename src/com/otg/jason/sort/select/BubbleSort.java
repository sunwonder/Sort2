package com.otg.jason.sort.select;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2019-02-28 下午11:07
 **/
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] pool = new Integer[]{44,12,33,88,11,24,17,64,99,52};

        for(int i=0;i<pool.length;i++){
            for(int j=0;j<pool.length-i-1;j++){
                if(pool[j]>pool[j+1]){
                    int tmp = pool[j];
                    pool[j]= pool[j+1];
                    pool[j+1] = tmp;
                }
            }
        }
        for(int i=0;i<pool.length;i++){
            System.out.println(pool[i]);
        }

    }
}
