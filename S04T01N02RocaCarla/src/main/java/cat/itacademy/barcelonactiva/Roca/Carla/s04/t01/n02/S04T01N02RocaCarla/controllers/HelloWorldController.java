package cat.itacademy.barcelonactiva.Roca.Carla.s04.t01.n02.S04T01N02RocaCarla.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String salute (@RequestParam(defaultValue = "UNKNOWN")String name){
        return "Hello " +name +", you're executing a Maven project";

    }
    @GetMapping (value = {"/HelloWorld2/{name}", "/HelloWorld2"})

    public String salute2 (@PathVariable(required=false) String name){
        if (name == null){
            name="UNKNOWN";
        }
        return "Hello " +name +", you're executing a Maven project";
    }
}
