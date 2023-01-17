package th.ac.ku.restaurantApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeApp {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome restaurant saengchai";
    }
}
