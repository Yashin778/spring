package com.cts.project2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory beanfactory = new ClassPathXmlApplicationContext(
		        "context.xml");
     SetterInjection bean = (SetterInjection) beanfactory.getBean("been_message");
	 String msg = bean.getMessage();
	 System.out.println(msg);
    }
}
