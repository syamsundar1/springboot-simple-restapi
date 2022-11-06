package com.restful.webservices.restful.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeFiltering filtering(){
        return new SomeFiltering("vale1","value2","value3");
    }

}
