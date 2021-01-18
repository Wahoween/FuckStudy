package com.fuckstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Arrays;

/**
 * Hello world!
 * @author Dao
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"MATE-INF/spring/provider.xml"});
        context.start();
        System.out.println("服务已启动");
        System.in.read();// 按任意键退出
        System.out.println("服务已GG");
    }
}
