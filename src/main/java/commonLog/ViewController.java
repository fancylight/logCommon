package commonLog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <h3>webMvc</h3>
 *
 * @author : ck
 * @date : 2020-07-23 16:42
 **/
@Controller
public class ViewController {
    @RequestMapping(method = RequestMethod.GET,path = "/view/**/{viewName}")
    public ModelAndView view(@PathVariable String viewName){
        return new ModelAndView(viewName);
    }
}
