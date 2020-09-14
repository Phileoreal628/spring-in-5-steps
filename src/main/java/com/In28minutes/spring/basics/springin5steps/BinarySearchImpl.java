package com.In28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("mainAlgo")
    public SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers,int numberToSearchFor)
    {
        int[] sorted = sortAlgorithm.sort(numbers);
        return 3;
    }
}
