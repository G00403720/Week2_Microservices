package ie.atu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @GetMapping("/calculate")
    public Answer calculate(@RequestParam int num1 , @RequestParam int num2 , @RequestParam String operation) {
        if (operation == "add"){
            return new Answer(operation,num1 + num2);
        }
        if (operation == "subtract"){
          return new Answer(operation,num1 - num2);
        }
        if (operation == "multiply"){
            return new Answer(operation,num1 * num2);
        }
        if (operation == "divide"){
            return new Answer(operation,num1 / num2);
        }
        return  new Answer("",0);
    }
}
