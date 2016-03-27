/**
 * 实现代码文件
 * 
 * @author XXX
 * @since 2016-3-4
 * @version V1.0
 */
package com.routesearch.route;

import java.util.ArrayList;

public final class Route
{
    /**
     * 你需要完成功能的入口
     * 
     * @author DENG Shougang
     * @since 2016-3-25
     * @version V1.0.0
     */
//    class Link{
//        int sourceID[];
//        int destinationID[];
//        int cost[];
//        Link(int length){
//            sourceID=new int[length];
//            destinationID=new int[length];
//            cost=new int[length];
//        }
//    }
    static int[][] graph;
    static int[] link;
    static int[] destinationId;
    static int[] sourceId;
    static int[] cost;

    final static int MAX_THREAD=3;
    final static int MAX_DIFFERENCE=5;
    final static int MAX_LENGTH=400;

    static int[][] leastDistance=new int[MAX_LENGTH][MAX_LENGTH];
    static ArrayList<Integer>[] neighbours=new ArrayList[MAX_LENGTH];
    static ArrayList<Integer>[] neighbours=new ArrayList[MAX_LENGTH];


    public static int getGraphLength(String graphContent){
        int length=0;
        int maxSourceID=0;
        String[] content=graphContent.split("\n");
        String[][] ID=new String[content.length][];
        for (int i=0;i<graphContent.length();i++){
            if (graphContent.codePointAt(i)=='\n'){
                length++;
            }
        }
        link=new int[length];
        sourceId=new int[MAX_LENGTH];
        destinationId=new int[MAX_LENGTH];
        cost=new int[length];
        for (int i=0;i<content.length;i++){
            ID[i]=content[i].split(",");
            link[i]=Integer.parseInt(ID[i][0]);
            sourceId[link[i]]=Integer.parseInt(ID[i][1]);
            destinationId[link[i]]=Integer.parseInt(ID[i][2]);

            cost[link[i]]=Integer.parseInt(ID[i][3]);
        }
        graph=new int[MAX_LENGTH][MAX_LENGTH];
        for (int i=0;i<length;i++){
//            graph[link[i]]=


            System.out.printf("%d ",link[i]);
            System.out.printf("%d ",sourceId[link[i]]);
            System.out.printf("%d ",destinationId[link[i]]);
            System.out.printf("%d\n",cost[link[i]]);
        }
        System.out.printf("Graph length: %d\n",length);
        return length;
    }
    public static void setGraph(String graphContent){
        for (int i=0;i<MAX_LENGTH;i++){
            for (int j=0;j<MAX_LENGTH;j++){
                graph[i][j]=Integer.MAX_VALUE;
                leastDistance[i][j]=Integer.MAX_VALUE;
            }
//            for (int j=0;j<8;j++){
//                neighbours[i][j]=Integer.MAX_VALUE;
//            }
        }
        for (int i=0;i<link.length;i++){
            if (graph[sourceId[link[i]]][destinationId[link[i]]]>cost[link[i]]){
                graph[sourceId[link[i]]][destinationId[link[i]]]=cost[link[i]];
            }
            int j;
            if ((j=neighbours[sourceId[link[i]]].indexOf(destinationId[link[i]]))>=0){
                if(neighbours[sourceId[link[i]]].get(j)>cost[link[i]]){
                    neighbours[sourceId[link[i]]].set(j,cost[link[i]]);
                }
            }

        }

//        String s="";
//        String.valueOf();
    }
    public static void showGraph(){
        for (int i=0;i<link.length;i++){
            System.out.printf("%d ",graph[sourceId[link[i]]][destinationId[link[i]]]);
        }
    }
    public static int getDistance(int source,int destination){
        return graph[source][destination]<Integer.MAX_VALUE?graph[source][destination]:-1;
    }
    public static int setLeastDistance(int source){
//        if (source==destination)
//            return 0;
        if (leastDistance[source].length>0)
            return 0;
        else {
            for (int i=0;i<link.length;i++){

            }
        }

    }
    public static String searchRoute(String graphContent, String condition)
    {
        getGraphLength(graphContent);
        setGraph(graphContent);
//        showGraph();



        return "hello world!";
    }

}