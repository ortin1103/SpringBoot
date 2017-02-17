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
        if (controllerService.string(text)==null)
        {
            return "vveden pustoy zapros";
        }
        String result= controllerService.string(text);
        logger.trace("ok  ne_ok: {}",result);
        return result;
    }
}
