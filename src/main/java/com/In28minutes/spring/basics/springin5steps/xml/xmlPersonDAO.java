package com.In28minutes.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class xmlPersonDAO {


    xmlJdbcConnection xmljdbcConnection;


    public xmlJdbcConnection getXmljdbcConnection() {
        return xmljdbcConnection;
    }

    public void setXmljdbcConnection(xmlJdbcConnection xmljdbcConnection) {
        this.xmljdbcConnection = xmljdbcConnection;
    }
}
