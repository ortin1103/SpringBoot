package my.com;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class SomeTextController {
    private static final Logger logger = LoggerFactory.getLogger(SomeTextController.class);

    @RequestMapping("/sometext")
    public String someText(@RequestParam("text") String text) {

        logger.debug("Enter text: {}", text);

        return lowerString(text);


    }
   public String lowerString(String string){
        String lower= string.toLowerCase();
        int count = 0;
        for (int i = 0; i < lower.length(); ++i) {
            Character character = lower.charAt(i);
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};

            logger.trace("Vowels: {}", vowels);
            if (Arrays.binarySearch(vowels, character) >= 0) {
                count += 1;

            }
        }

        logger.debug("Колличество согласных "+String.valueOf(count));

        if (count == 0) {

            logger.warn("Vvely pustoy zapros dlya sometext");
        }

        String result = count < 3 ? "ok" : "ne_ok";

        logger.trace("Return result {}", result);

        return result;
    }

}


