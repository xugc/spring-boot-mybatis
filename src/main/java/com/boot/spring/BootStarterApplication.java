package com.boot.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration//配置控制  
@EnableAutoConfiguration//启用自动配置  
@ComponentScan//组件扫描 
@SpringBootApplication
public class BootStarterApplication
{
    public static void main( String[] args )
    {
    	SpringApplication.run(BootStarterApplication.class, args);
    }
}
