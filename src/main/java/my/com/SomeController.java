package my.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;


@RestController

public class SomeController {


    private static final Logger logger = LoggerFactory.getLogger(SomeController.class);


    @RequestMapping("/")
    public String index() {
        logger.warn("!!Пустой рандом запрос!!");


        String b = Math.random() < 0.5 ? "random ok" : "ramdom ne_ok";
        logger.info(b);

        return b;
    }


}