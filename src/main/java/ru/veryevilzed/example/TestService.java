package ru.veryevilzed.example;

import org.springframework.stereotype.Service;


/**
 * Created by zed on 11.08.16.
 */
@Service
public class TestService {

    public void Test(MyContext context, int val, int[] b) {
        System.out.println(b.length);
        context.index += val;
    }

    public void Test2(Integer i, int val) {
        i += val;
    }
}
