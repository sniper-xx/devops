/**
 * Author: SNIPER
 * Date: 2019/10/29 20:52
 * DESCRIPTION: Default controller
 **/
package org.sniper.cloud.devops.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/index")
    public String sayHello(@RequestParam(value = "name",required = false,defaultValue = "world")String name){
        return "hello "+name;
    }
}
