package com.gfa.api.controler;

import com.gfa.api.model.Error;
import com.gfa.api.model.Handler;
import com.gfa.api.model.Result;
import com.gfa.api.service.HandlerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class ApiController {

    private final HandlerService handlerService;

    @PostMapping("/arrays")
    public ResponseEntity<?> arrayHandler(@RequestBody Handler handler) {
        Result r = new Result();
        return switch (handler.getWhat()) {
            case "sum" -> ResponseEntity.ok(handlerService.sum(handler));
            case "multiply" -> ResponseEntity.ok(handlerService.multiply(handler));
            default -> ResponseEntity.ok(new Error("Please provide what to do with the numbers!"));
        };
    }
}
