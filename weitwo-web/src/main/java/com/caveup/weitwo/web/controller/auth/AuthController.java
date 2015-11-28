package com.caveup.weitwo.web.controller.auth;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.caveup.weitwo.web.controller.AbstractController;

/**
 * Global Authentication manager
 * 
 * @author xw80329 下午11:33:45
 */
@Controller
@RequestMapping("/auth")
public class AuthController extends AbstractController {

    private static final long serialVersionUID = -22248706779491438L;
    private static final String LOGIN_VIEW = "auth/login";
    private static final String LOGOUT_VIEW = "auth/logout";

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView defaultView = new ModelAndView(LOGIN_VIEW);
        return defaultView;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logoutPage(HttpServletRequest req) {
        logout(req);
        return LOGOUT_VIEW;
    }
}
