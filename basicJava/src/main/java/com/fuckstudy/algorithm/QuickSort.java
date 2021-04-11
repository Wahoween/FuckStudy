package com.fuckstudy.algorithm;


import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * 快速排序
 */
public class QuickSort {
    public static void quickSort(int[] arrays,int rightIndex , int leftIndex){
//        if(rightIndex > leftIndex) return;
        int basicNum = arrays[rightIndex];
        int start = rightIndex,end = leftIndex;
        while(start < end){
            while (start < end && arrays[end] >= basicNum){
                end--;
            }
            if(start < end){
                arrays[start++] = arrays[end];
            }

//            out(arrays,start,end);
            while (start < end && arrays[start] < basicNum){
                start++;
            }
            if(start < end){
                arrays[end--] = arrays[start];
            }
//            out(arrays,start,end);
        }

        arrays[start] = basicNum;
//        System.out.println("rightIndex="+rightIndex+"  leftIndex="+leftIndex+"  start="+start+"  end="+end);
        if(rightIndex != start){
            quickSort(arrays,rightIndex,start-1);
        }
        if(start != leftIndex){
            quickSort(arrays,start+1,leftIndex);
        }


    }
    public static void changeNum(int[] arrays,int rightIndex , int leftIndex){
        int x = arrays[rightIndex];
        arrays[rightIndex] = arrays[leftIndex];
        arrays[leftIndex] = x;
    }

    public static void out(int[] arrays,int rightIndex , int leftIndex) {
        for(int x : arrays){
            System.out.print(x+"\t");
        }
        System.out.println("rightIndex="+rightIndex+"leftIndex="+leftIndex);
    }

    public static void out(int[] arrays) {
        for(int x : arrays){
            System.out.print(x+"\t");
        }
    }



    public static void main(String[] args) {
        int size = 10000000;
        Random random = new Random();
        int[] a = new int[size];
        for(int i = 0 ;i<a.length-1 ;i++){
            a[i]= random.nextInt(10000);
        }
        int[] b = a;
//        int[] a={66,435,43,655,3,5645,67,34563,23,56,78};
        long start = new Date().getTime();
        System.out.println(start);
        quickSort(a,0,a.length-1);
        long end = new Date().getTime();
        System.out.println((end - start));
//        out(a);
        //56	23	43	3	5645	66	67	34563	655	435	78
        //56	23	43	3	66	5645	67	34563	655	435	78


//        for(int i = 0 ;i<b.length-1 ;i++){
//            b[i]= random.nextInt(10000);
//        }
//        int[] a={66,435,43,655,3,5645,67,34563,23,56,78};
        start = new Date().getTime();
        System.out.println(start);
        Arrays.sort(a);
        end = new Date().getTime();
        System.out.println((end - start));
        for (int i =0 ;i<size;i++){
            if(a[i] != b[i]){
                System.out.println("false");
            }
        }
    }
}
