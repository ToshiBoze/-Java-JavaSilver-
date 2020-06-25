package com;
import com.sample.Sample;
import com.sample.test.*;

public class Main {
    public static void main(String[] args) {
        new Sample().sample();
        int num = Integer.parseInt(args[0]);
        new Test().test(num);
    }
}
