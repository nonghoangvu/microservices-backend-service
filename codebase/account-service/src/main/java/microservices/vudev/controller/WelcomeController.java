package microservices.vudev.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WelcomeController {

    private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/welcome")
    public String welcome() {
        log.info("Welcome to the account service");
        return "Welcome to Account service";
    }

    @GetMapping("/redis-info")
    public String getRedisInfo(@Value("${redis.host}") String host,
                               @Value("${redis.port}") String port) {
        return String.format("host=%s, port=%s", host, port);
    }
}
