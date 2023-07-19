package com.quetespring.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String Dcotor1() {
        return "Wlliam Hartnell";
    }
    
    @GetMapping("/doctor/10")
    @ResponseBody
    public String Dcotor10() {
        return "David Tennant";
    }

     @GetMapping("/doctor/13")
    @ResponseBody
    public String Dcotor13() {
        return "Jodie Whittaker";
    }
}