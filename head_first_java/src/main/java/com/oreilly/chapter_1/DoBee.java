package com.oreilly.chapter_1;

//page43
public class DoBee {
    public String echo(String say, String say2, String say3) {
        int x = 1;
        String result = "";
        while (x < 3) {
            result += say+say2;
            x = x + 1;
        }
        if (x == 3) {
            result = result + say3;
        }
        return result;
    }
}
