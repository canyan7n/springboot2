package com.canyan7n.boot2.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :ParameterController
 * @date ：2023/4/22 20:22
 * @description：TODO
 */
@RestController
public class ParameterController {

    @RequestMapping("/person/{id}/{username}")
    public Map<String,Object> test(@PathVariable("id") Integer id,
                                   @PathVariable("username") String name,
                                   @PathVariable Map<String,String> map,
                                   @RequestHeader("Host") String hostname,
                                   @RequestHeader Map<String,String> headers,
                                   @RequestParam(value = "age",required = false) String age,
                                   @RequestParam("email") String email,
                                   @RequestParam("inters") List<String> inters,
                                   @RequestParam Map<String,String> params
                                   /*@CookieValue("_ga") String _ga,*/
                                   /*@CookieValue Cookie cookie*/){
        HashMap<String, Object> hashMap = new HashMap<>();
        // hashMap.put("id",id);
        // hashMap.put("name",name);
        // hashMap.put("map",map);
        hashMap.put("host",hostname);
        hashMap.put("headers",headers);
        hashMap.put("age",age);
        hashMap.put("params",params);
        hashMap.put("inters",inters);
        // hashMap.put("cookies",cookie);
        return hashMap;
    }

    @PostMapping("/save")
    public Map testRequestBody(@RequestBody String userContent){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("userContent",userContent);
        return hashMap;
    }
}
