package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by saryana on 10/29/15.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello World! From Sean on this fancy new AWS Server";
    }
}
