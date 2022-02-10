package com.fl.git;

public class TestFor {
    public static void main(String[] args) {
        int[][]arr = {{2,1,1},{0,1,1},{1,0,1}};
        int m=arr.length;
        int n=arr[0].length;
        int num=0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(arr[i][j]==2){
                    System.out.println("这是里2"+"  "+i+" "+j);
                }
                //空格子
                if(arr[i][j]==0)System.out.println("这里是0"+"  "+i+" "+j);
                else System.out.println("这里是else"+"  "+i+" "+j);
                System.out.println("---------------"+ ++num);
        }
    }
    }
}
