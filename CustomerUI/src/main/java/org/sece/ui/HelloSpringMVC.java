package org.sece.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by Odiljon Sattarov on 1/14/2016.
 */
@Controller
public class HelloSpringMVC {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "sayHello";
    }
}