package com.caveup.weitwo.web.controller.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.caveup.weitwo.web.controller.AbstractController;

@Controller
@RequestMapping("/admin")
public class AdminController extends AbstractController {

    private static final long serialVersionUID = -22248706779491438L;
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);

    @RequestMapping("/index")
    public String index() {
        LOGGER.info("admin/index page");
        return "admin/index";
    }
}
