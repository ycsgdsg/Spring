package identity.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yc on 2016/3/27.
 */
@Controller
public class DefaultHandler {

    @RequestMapping("/*")
    @ResponseBody
    public String fallbackMethod(){
        return "Default Handler";
    }
}
