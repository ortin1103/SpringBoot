package my.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SomeController {

    @RequestMapping("/")

    public String index() {

       return Math.random()<0.5?"ok":"ne_ok";

    }




}