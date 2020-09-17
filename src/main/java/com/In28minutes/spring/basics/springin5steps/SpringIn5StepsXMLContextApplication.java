package com.In28minutes.spring.basics.springin5steps;

import com.In28minutes.spring.basics.springin5steps.xml.xmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            xmlPersonDAO personDAO = applicationContext.getBean(xmlPersonDAO.class);


            logger.info("{}",personDAO);
            logger.info("{}",personDAO.getXmljdbcConnection());

        }
    }
}
