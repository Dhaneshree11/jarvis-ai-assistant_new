
package jarvis.assistant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @GetMapping("/api/health")
    public String checkHealth() {
        return "Jarvis is running successfully!";
    }
}
