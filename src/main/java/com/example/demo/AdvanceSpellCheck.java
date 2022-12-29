package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("Child2")
public class AdvanceSpellCheck implements SpellCheck, InitializingBean, DisposableBean {
    @Override
    public String Check() {
        return "This is AdvanceSpellCheck";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AdvanceSpellCheck : Initialized");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("AdvanceSpellCheck : Destroying");
    }


}
