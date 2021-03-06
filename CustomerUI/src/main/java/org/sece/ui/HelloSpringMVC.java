package org.sece.ui;

import org.sece.core.CoreClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Odiljon Sattarov on 1/14/2016.
 */
@Controller
public class HelloSpringMVC {

    @Autowired
    UIClass uiClass;

    @Autowired
    CoreClass coreClass;

    private static List<User> userList = new ArrayList<User>();

    //Initialize the list with some data for index screen
    static {
        userList.add(new User("Bill", "Gates"));
        userList.add(new User("Steve", "Jobs"));
        userList.add(new User("Larry", "Page"));
        userList.add(new User("Sergey", "Brin"));
        userList.add(new User("Larry", "Ellison"));
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("userList", userList);
        return "index";
    }

    public static class User {
        String lastname;
        String firstname;

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public User(String lastname, String firstname) {
            this.lastname = lastname;
            this.firstname = firstname;
        }
    }
}