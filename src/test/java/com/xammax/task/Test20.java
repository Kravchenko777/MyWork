package com.xammax.task;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Test20 {

    @Test
    void test(){

       // String str = "()";
       // String str = "(){}[]";
     //   String str = "12(){}[]";
      //  String str = "1(){}[]";
      //  String str = "({)}[]";
       // String str = "[({})]";
       // String str = " ";

        System.out.println(result("({)}[]"));

    }


    private boolean result(String str){
        int controlLength = str.length();
        if(controlLength%2!=0) return false;
        if(controlLength==0) return true;
        str = str.replace("()","");
        str = str.replace("[]","");
        str = str.replace("{}","");
        if(str.length()==controlLength) return false;
        return result(str);
    }


}
