package com.gfa.api.service;

import com.gfa.api.model.Handler;
import com.gfa.api.model.Result;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class HandlerService {

    public Result sum(Handler handler){
        Result r = new Result();
        r.setResult(String.valueOf(Arrays.stream(handler.getNumbers()).sum()));
        return r;
    }

    public Result multiply(Handler handler){
        Result r = new Result();
        int m = 1;
        int[] a = handler.getNumbers();
        for (int j : a) {
            m = m * j;
        }
        r.setResult(String.valueOf(m));
        return r;
    }
}
