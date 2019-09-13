package com.sampleSpringBootApp.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "Controller")
@RequestMapping(value = "")
public class Controller {

    @ApiOperation(value = "test")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "running test API for sample spring boot application";
    }

}
