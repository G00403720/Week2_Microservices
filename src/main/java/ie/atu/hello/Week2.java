package ie.atu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Week2 {
    @GetMapping("/hello") //the website asking for something
    public String hello(){
        return "Hello, World!";
    }
    @GetMapping("/hello/{name}")
    public String greetByName(@PathVariable String name){ // this is to get something after the /
        return  "Hello, " + name;
    }
    @GetMapping("/details")
    public String details(@RequestParam String name ,@RequestParam int age){ //This is for getting something after the ?
        return  "Hello, " + name + age;
    }

}