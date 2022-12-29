package com.example.demo;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {

//    @Bean("Parent")
//    public EmailClient emailClient(){
//        EmailClient tmp = new EmailClient();
//        tmp.setSpellCheck(normalSpellCheck());
//        return tmp;
//    }
//
//    @Bean("Child1")
//    public NormalSpellCheck normalSpellCheck(){
//        return new NormalSpellCheck();
//    }
//
//    @Bean("Child2")
//    public AdvanceSpellCheck advanceSpellCheck(){
//        return new AdvanceSpellCheck();
//    }


}
