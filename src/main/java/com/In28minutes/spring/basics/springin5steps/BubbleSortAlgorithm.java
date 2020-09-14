package com.In28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mainAlgo")
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers)
    {
        return numbers;
    }
}
