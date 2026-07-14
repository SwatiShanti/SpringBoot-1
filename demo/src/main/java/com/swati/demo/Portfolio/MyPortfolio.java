package com.swati.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {
    @GetMapping("/myself")
    public String Myself() {
        return """
                <h1>Myself</h1>
                
                <p>Hi, I'm Swati Shanti!</p>
                
                <p>
                Aspiring Cloud Computing and AI Enthusiast.<br>
                Passionate about building web applications, cloud technologies,
                and solving real-world problems.
                </p>
                
                <ul>
                    <li>GitHub: https://github.com/SwatiShanti</li>
                    <li>LinkedIn: https://www.linkedin.com/in/swati-shanti12</li>
                    <li>LeetCode: https://leetcode.com/u/swatishanti/</li>
                </ul>
                """;
    }
    @GetMapping("/skills")
    public String Skills() {
        return """
            <h1>My Skills</h1>

            <ul>
                <li>Languages: Java, Python, C, C++</li>
                <li>Frameworks: Microservices Architecture, Tailwind CSS</li>
                <li>Database: MySQL, MongoDB</li>
                <li>Tools/Platforms: AWS, Azure, Docker, Git, GitHub</li>
                <li>Soft Skills: Problem Solving, Team Collaboration, Time Management</li>
            </ul>
            """;
    }
}
