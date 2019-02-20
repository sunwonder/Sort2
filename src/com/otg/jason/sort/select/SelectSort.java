package com.otg.jason.sort.select;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2019-02-20 上午9:26
 **/
public class SelectSort {

    public static void main(String[] args) {
        Integer[] pool = new Integer[]{44,12,33,88,11,24,17,64,99,52};

        for(int i= 0;i<pool.length;i++){
            for(int j=i+1;j<pool.length;j++){
                if(pool[i]>pool[j]){
                    int temp = pool[j];
                    pool[j]= pool[i];
                    pool[i]=temp;
                }
            }
            System.out.print(pool[i]);
            System.out.print(",");
        }
    }
}
