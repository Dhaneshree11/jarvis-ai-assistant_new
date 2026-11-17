
package jarvis.assistant.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestDemoController {

    @PostMapping("/api/demo")
    public ResponseEntity<String> receiveMessage(
            @RequestBody String message) {

        String reply = "Jarvis received: " + message;

        return ResponseEntity.ok(reply);
    }
}
