package spring.love2code;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "hellowworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest request, Model model) {

        String studentName = request.getParameter("studentName").toUpperCase();

        model.addAttribute("message", "Hi, " + studentName);
        ArrayList<String> list = new ArrayList<>();
        list.add("@");
        list.add("1");
        model.addAttribute("List", list);
        return "helloworld";
    }


    @RequestMapping("/processFormVersionThee")
    public String processFormVersionThee(@RequestParam("studentName") String studentName,
                                         Model model) {
        model.addAttribute("message", "Hi, " + studentName.toUpperCase());
        return "helloworld";
    }
}
