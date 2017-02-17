package my.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ContrillerServiseImp implements ControllerServise {

    String text;

    public void setText(String text) {
        this.text = text;
    }

    boolean i;

    @Override
    public String lowerString() {

        return text = text.toLowerCase();
    }

    @Override
    public boolean isToken() {
        int count = 0;
        for (int i = 0; i < text.length(); ++i) {
            Character character = text.charAt(i);
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};


            if (Arrays.binarySearch(vowels, character) >= 0) {
                count += 1;
            }


        }
       return i = count < 3 ? true : false;
    }
}




