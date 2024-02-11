package Spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicDataController {

    @GetMapping("/public-data")
    public String getPublicData() {
        return "Это открытый ресурс, доступный для всех аутентифицированных пользователей";
    }
}

