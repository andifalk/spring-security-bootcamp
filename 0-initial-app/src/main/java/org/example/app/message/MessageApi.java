package org.example.app.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageApi {

    private final MessageService messageService;

    public MessageApi(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/public/message")
    public String publicMessage() {
        return messageService.publicMessage();
    }

    @GetMapping("/private/message")
    public String privateMessage() {
        return messageService.privateMessage("user");
    }

    @GetMapping("/admin")
    public String admin() {
        return messageService.admin("user");
    }
}
