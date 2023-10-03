package ie.atu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public Answer calculate(@PathVariable int num1 , @PathVariable int num2 , @PathVariable String operation) {
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
