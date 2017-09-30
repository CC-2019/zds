package zds.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zds.api.ZdsService;

@Controller
public class GreetingController {

    @Autowired
    private ZdsService zdsService;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="test") String name, Model model) {

        String value = zdsService.hello(name);

        model.addAttribute("name", value);
        return "greeting";
    }

}