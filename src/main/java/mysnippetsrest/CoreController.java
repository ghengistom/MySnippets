package mysnippetsrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {
    private String testMessage = "MySnippets Test Response.";

    @RequestMapping("/test")
    public Test test() {
        return new Test(testMessage);
    }
}
