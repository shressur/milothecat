package com.example.milothecat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String HelloKitty(){
        return "<p>\uD83D\uDE3A <strong>Greetings</strong>. Milo says, <em>\"Meow meow\"</em></p>" +
                "<p>Milo is hungry. Feed him at: <em>/feed-milo</em></p>";
    }
    @GetMapping("/feed-milo")
    public String PurringKitty(){
        return "\uD83D\uDE38 Milo is happy. Milo says, <em>\"Purr purr\"</em>";
    }
}
