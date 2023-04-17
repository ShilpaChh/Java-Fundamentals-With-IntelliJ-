package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController // this annotation tells Spring boot that this class shd be used as a controller to handle the requests
public class HelloWorldController {

    @GetMapping("/") // this annotation tells Spring boot which specific request the next method shd handle
    // and it's going to handle the request which is a get '/' request
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

    // stop and restart the bootRun from Gradle. This then refreshes the page with this above message.
    // now to have a template we need to add Dependency in build.grale file in dependencies section for Thymeleaf

    public ModelAndView index() {
        return new ModelAndView("home");
    }

    // CH14 - Exercise:
    // Annotation for Links page:
    @GetMapping("/links")
    public ModelAndView links(){
        return new ModelAndView("links"); // now create a new HTML, links file in templates
    }

    @GetMapping("/quotes")
    public ModelAndView quotes(){
        return new ModelAndView("quotes"); // now create a new HTML, quotes file in templates
    }

}