package main;

import java.util.Scanner;

class Node{
    String[] str=new String[27];
    Node(){
        for(int i=0;i<26;i++){
            str[i]="";
        }
    }
    public void add(char c,int level){
        str[level]+=c;
    }
    public void show(){
        for (int i=0;i<26;i++){
            if (str[i]!=null&&str[i].compareTo("")!=0)
            System.out.println(str[i]);
        }
    }
    public int getLevel(char c){
        int le=0;
        for (int i=0;i<26;i++){
            if (str[i].indexOf(c)>=0){
                le=i;
                break;
            }
            if (i==25){
                return 0;
            }
        }
        int index=str[le].indexOf(c);
        int lev=1;
        while (true){
            if (index*2>=str[le+lev].length()){
                return lev;
            }
            index*=2;
            lev++;
            if (str[le+lev].compareTo("")==0){
                return lev;
            }
            if (index>26){
                break;
            }
        }
        return 0;
    }
}
public class GitL01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        Node node=new Node();
        for (int i=0;i<str.length()-1;i+=2){
            node.add(str.charAt(i),str.codePointAt(i+1)-48);
        }
        node.show();
        String search=input.nextLine();
        for (int i=0;i<search.length();i++){
            System.out.print(node.getLevel(search.charAt(i)));
            if (i!=search.length()-1)
                System.out.print(" ");
        }
    }
}
