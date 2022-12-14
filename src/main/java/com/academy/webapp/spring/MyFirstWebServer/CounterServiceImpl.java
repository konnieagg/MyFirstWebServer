package com.academy.webapp.spring.MyFirstWebServer;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class CounterServiceImpl implements CounterService {

    private static Map<String, Integer> nameCountMap= new HashMap<String , Integer>();

    @Override
    public int counter(String name){
        Integer counter = nameCountMap.get(name);
        if (counter==null) {
            counter=1;
        }
        nameCountMap.put(name,counter + 1);

        return counter;
    }
}
