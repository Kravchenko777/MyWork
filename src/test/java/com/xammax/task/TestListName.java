package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestListName {

    @Test
    void test(){
        List<String> list = new ArrayList<>();
        list.add("Павел");
        list.add("Виктор");
        list.add("люся");

        Collections.sort(list);

        System.out.println(list);

        System.out.println(list.stream().map(m->m.substring(1,m.length())).sorted().collect(Collectors.toList()));

    }
}
