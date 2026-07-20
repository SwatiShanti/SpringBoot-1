package com.swati.demo.Scope;

import com.swati.demo.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")


public class LPU {
    LPU(){
        System.out.println("Lpu rank 1");
    }
    public void adimission(Student student){
        System.out.println("adimission");
    }
    public void exam(){
        System.out.println("exam");
    }
    public void prepClasses(Student student){
        System.out.println("prepClasses");
    }

}
