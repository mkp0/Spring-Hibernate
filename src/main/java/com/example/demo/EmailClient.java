package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Parent")
@Scope("prototype")
public class EmailClient {
    public SpellCheck spellCheck;

    @Autowired
    @Qualifier("Child2")
    public void setSpellCheck(SpellCheck spellCheck) {
        this.spellCheck = spellCheck;
    }

    public EmailClient(){;

    }
//    public EmailClient(SpellCheck spellCheck){;
//        this.spellCheck = spellCheck;
//    }

    public String CheckSpelling(){
        return spellCheck.Check();
    }
}
