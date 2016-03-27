package main;

/**
 * Created by dengshougang on 16/3/12.
 */

public class RunTimeTest {
    public static void main(String[] args) {
        Runtime rt =  Runtime.getRuntime();
        System.out.println(rt.availableProcessors()+"\n"+rt.freeMemory()+"\n"+rt.maxMemory()+"\n"+rt.totalMemory());

    }

}
