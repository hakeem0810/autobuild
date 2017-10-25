package cn.cmccgs.autobuild.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/")
    String home(){
    	//add comment to test git hooks
    	int a = 5;
    	a = a-1;
        return "hello world";
    }
}