package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dengshougang on 16/3/13.
 */
public class Regex1{
    public static String regexMatcher(String pattern,String data) {
        // 按指定模式在字符串查找
        String line = data;
        pattern = "(.*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
        return m.group();
    }
    public static void main( String args[] ){
        String  data="This order was placed for QT3000! OK?";
        System.out.println(regexMatcher("",data));
    }

}
