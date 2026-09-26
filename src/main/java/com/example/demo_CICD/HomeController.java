package com.example.demo_CICD;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/")
    ResponseEntity<String> home(){
        return ResponseEntity.ok("Hello from the Web App. My name is Abhishek !");
    }
}
