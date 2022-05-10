package com.gfa.api.controler;

import com.gfa.api.model.Handler;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ApiController {

    @PostMapping("/arrays")
    public ResponseEntity<?> arrayHandler(@RequestBody Handler handler){
        switch (handler.getWhat()){
            case"sum" :

        }
    }
}
