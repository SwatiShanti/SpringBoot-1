package com.swati.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/MySelf")
    public String MySelf(){
        return """
                <h1>MySelf Swati</h1>
                <p> I am a quick learner Adaptable</p>
                <ul>
                <li>https://github.com/SwatiShanti</li>
                <li>https://leetcode.com/u/swatishanti/</li>
                """;

    }
}
