package my.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ControllerServiceImp implements ControllerService {
    private static final Logger logger = LoggerFactory.getLogger(SomeTextController.class);


    @Override
    public String string(String text) throws EmptyException, TwoWorldException {

            if (text.isEmpty()){
               throw new EmptyException("Vvedeno pustoe znachenie") ;

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
            String result =count < 3 ? "ok" : "ne_ok";
            Pattern p = Pattern.compile(".+\\s.+");
            Matcher m=p.matcher(text);

            if ( m.matches())
            {
            throw new TwoWorldException("vvedeno dva slova, resultat: ", result);
            }

            return result;
        }
    }








