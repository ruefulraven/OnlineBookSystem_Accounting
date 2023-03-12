package com.application.bas.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class AccountingService {

    @JmsListener(destination = "queue-0-1")
    public void listener(String name){
        System.out.println("The name sent from QUEUE-0-1 is:  " + name);
    }
}
