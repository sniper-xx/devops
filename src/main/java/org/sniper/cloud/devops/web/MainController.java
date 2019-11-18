/**
 * Author: SNIPER
 * Date: 2019/10/29 20:52
 * DESCRIPTION: Default controller
 **/
package org.sniper.cloud.devops.web;

import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@Slf4j
@RestController
public class MainController {

    @GetMapping("/index")
    public Map<String,String> sayHello(@RequestParam(value = "name",required = false,defaultValue = "world")String name){
        log.debug("user: {}", name);
        return ImmutableMap.of("name",name,
                "date", LocalDateTime.now().toString(),
                "address","重庆市南岸区");
    }
}
