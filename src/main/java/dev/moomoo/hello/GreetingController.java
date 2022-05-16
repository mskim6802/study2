package dev.moomoo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/bye")
    public String greeting() {
        return "bye!";
    }

    @PostMapping("/hi")
    public String greeting2() {
        return "hi!";
    }
}
