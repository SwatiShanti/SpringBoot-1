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
    @GetMapping("/education")
    public String Education() {
        return """
            <h1>Education</h1>

            <ul>
                <li>
                    <h3>Lovely Professional University</h3>
                    <p>B.Tech - Computer Science and Engineering</p>
                    <p>2023 - 2027</p>
                </li>

                <br>

                <li>
                    <h3>R. Lal College, Khagaria</h3>
                    <p>Intermediate</p>
                    <p>2022 - 2023</p>
                </li>

                <br>

                <li>
                    <h3>Sri Banarasi H.S. School, Khagaria</h3>
                    <p>Matriculation</p>
                    <p>2020 - 2021</p>
                </li>
            </ul>
            """;
    }
}
