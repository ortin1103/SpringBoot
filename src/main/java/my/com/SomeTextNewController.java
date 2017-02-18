package my.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeTextNewController {
    private static final Logger logger = LoggerFactory.getLogger(SomeTextController.class);
    @Autowired
    ControllerService controllerService;

    @RequestMapping("newtext")
    public String someText(@RequestParam("t") String text) {


        try {
            return controllerService.string(text);

        } catch (EmptyException ex) {
            logger.error("Pustoy zapros", ex);
            return "vvely pustoy zapros, resultat OK";

        } catch (TwoWorldException exp) {
            logger.error("dva slova",exp);
            return exp.getOtvet();

        } catch (Exception e) {
            logger.debug("exception",e);
            e.printStackTrace();
            return "error";

        }
    }
}
