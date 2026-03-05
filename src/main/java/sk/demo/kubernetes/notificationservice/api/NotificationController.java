package sk.demo.kubernetes.notificationservice.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @PostMapping
    public String notify(@RequestBody Map<String, String> body) {
        System.out.println("Sending notification to " + body.get("email"));
        return "Notification sent";
    }
}