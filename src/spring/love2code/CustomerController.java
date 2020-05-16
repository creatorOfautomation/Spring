package spring.love2code;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer,
                              BindingResult bindingResult) {

        System.out.println("customer.getFirstName() = " + customer.getFirstName());
        System.out.println("customer.getLastName() = " + customer.getLastName() + "|");
        System.out.println("bindingResult = " + bindingResult);
        System.out.println("\n\n\n");
        if (bindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}
