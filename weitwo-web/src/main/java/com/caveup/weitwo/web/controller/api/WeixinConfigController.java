package com.caveup.weitwo.web.controller.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.caveup.weitwo.web.config.WxMsg;
import com.caveup.weitwo.web.controller.AbstractController;

/**
 * WEIXIN API request. anybody can access it
 * 
 * @author xw80329 下午6:14:14
 */
@Controller
public class WeixinConfigController extends AbstractController {

    private static final long serialVersionUID = -22248706779491438L;
    private static final Logger LOGGER = LoggerFactory.getLogger(WeixinConfigController.class);

    @RequestMapping("/api")
    @ResponseBody
    public String api(HttpServletRequest req, HttpServletResponse resp) {
        LOGGER.info("Index request");
        String signature = req.getParameter("signature");
        String nonce = req.getParameter("nonce");
        String timestamp = req.getParameter("timestamp");
        String echostr = req.getParameter("echostr");

        String responseMsg = null;
        if (StringUtils.isNotBlank(echostr)) {
            if (!wxService.checkSignature(signature, timestamp, nonce, echostr)) {
                responseMsg = WxMsg.M_REQUEST_INVALID;
            }
            responseMsg = wxService.getEchoTxt(echostr);
        }

        // common business
        LOGGER.info(responseMsg);
        return responseMsg;
    }

}
