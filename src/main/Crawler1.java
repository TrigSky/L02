package main;

import java.util.Scanner;

/**
 * Created by dengshougang on 16/3/13.
 */
class arrr{
    int num;
    int[] arr;
    int p=0;
    arrr(int num){
        this.num=num;
        arr=new int[num];
    }
    public void swap(int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void add(int data){
        int n=p;
        for (int i=0;i<n;i++){
            if (arr[i]==data){
                return;
            }
        }
        arr[p]=data;
        p++;

        while (n>0){
            if (arr[n-1]>data){
                swap(n,n-1);
                n--;
            }
            else {
                break;
            }
        }
    }
    public void show(){
        for (int i=0;i<p;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
public class Crawler1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        arrr a=new arrr(num);
//        Random random=new Random();
        for (int i =0;i<num;i++){
            a.add(input.nextInt());
        }
        a.show();
    }
}
