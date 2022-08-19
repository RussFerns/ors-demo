package com.example.rufernan.orsdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/") 
    public String getHome() {
        return "<div style='background-color:#00264D; color:white; height:100px; margin-bottom:50px; padding: 20px 10px;'><h1>Hello ORS - Java Spring Application</h1></div> <h3>What We Do</h3> <p style='color:grey;''>We administer retirement programs for Michigan's state employees, public school employees, judges, state police, and National Guard members. This includes over 553,000 customers (approximately 267,000 active and 288,000 retired members). Nearly one out of every fourteen Michigan adults living in one out of every nine Michigan households benefits from our services.</p> <div style='background-color:black; color:white; height:50px; margin-top:50px; padding: 10px 10px;'><small><i>&copy; Copyright State of Michigan 2022    <span style='color:yellow'> (8/19/2022@7:45pm) </span></i></small></div>";

    }
    
}
