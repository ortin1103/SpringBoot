package my.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ControllerServiceImp implements ControllerService {
    private static final Logger logger = LoggerFactory.getLogger(SomeTextController.class);


    @Override
    public String string(String text) {

            if (text.isEmpty()){
               throw new Exception();

            }

            logger.debug("vvely text: {}", text);
            String lowtext = text.toLowerCase();
            logger.trace("lowerCase: " + lowtext);

            int count = 0;
            for (int i = 0; i < lowtext.length(); ++i)
            {
                Character character = text.charAt(i);
                char[] vowels = {'a', 'e', 'i', 'o', 'u'};


                if (Arrays.binarySearch(vowels, character) >= 0)
                {
                    count += 1;
                }
            }
            logger.trace("vowels is: {}", count);
            return count < 3 ? "ok" : "ne_ok";
        }
    }








