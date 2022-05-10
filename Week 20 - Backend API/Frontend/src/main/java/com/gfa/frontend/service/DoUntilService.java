package com.gfa.frontend.service;


import com.gfa.frontend.model.DoUntil;
import com.gfa.frontend.model.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoUntilService {

    public Result sum(DoUntil doUntil) {
        long sum = 0;
        Result r = new Result();
        for (int i = 1; i <= doUntil.getUntil(); i++) {
            sum += i;
        }
        r.setResult(sum);
        return r;
    }

    public  Result factor(DoUntil doUntil){
        long sum = 1;
        Result r = new Result();
        for (int i = 1; i <= doUntil.getUntil(); i++) {
            sum = sum * i;
        }
        r.setResult(sum);
        return r;
    }
}
