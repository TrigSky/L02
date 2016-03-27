package main;

import java.io.*;
/**
 * Created by dengshougang on 16/3/12.
 */
public class FileTest {
    public static String readFile(String path){
        File file=new File(path);
        String result="";
        try {
            int hasRead;
            char[] chars=new char[1024];
            FileReader fileReader=new FileReader(file);
            while ((hasRead=fileReader.read(chars))>0)
                result+=(new String(chars,0,hasRead));
            fileReader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return result;
        }
    }
    public static boolean writeFile(String path,String data){
        try {
//            FileWriter fileWriter=new FileWriter(file);
            Writer ow = new OutputStreamWriter(new FileOutputStream (path));
            ow.write(data);
            ow.close();
        }
        catch (Exception e ){
            e.printStackTrace();
        }
        return true;
    }
    public static String xpathResult(String data){
//        HTML html=new HTML(UrlUtils.fixAllRelativeHrefs(rawText, request.getUrl()));
        String result="";


        return result;
    }
    public static void main(String[] args) {
        String path="/Users/dengshougang/Dropbox/Java/python/CrawlerInfo/School/URPStudentInfo copy/011110001.txt";
        writeFile(path,"wdasdasdaew2qe");
        System.out.println(readFile(path));
    }
}
