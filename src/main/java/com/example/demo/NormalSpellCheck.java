package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("Child1")
public class NormalSpellCheck implements  SpellCheck, InitializingBean, DisposableBean
{
    @Override
    public String Check() {
        return "This is NormalSpellCheck";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("NormalSpellCheck : Initialized");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("NormalSpellCheck : Destroying");
    }
}
