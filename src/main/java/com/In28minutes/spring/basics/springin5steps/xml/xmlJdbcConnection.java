package com.In28minutes.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


public class xmlJdbcConnection {
    public xmlJdbcConnection() {
        System.out.println("JDBC");
    }
}
