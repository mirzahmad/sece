package org.sece.admin;

import org.sece.core.CoreClass;
import org.sece.core.catalog.repo.jpa.TestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mirza on 1/13/16.
 */
@Component
public class AdminClass {

    public String say() {
        return "Hi from AdminClass";
    }
}
