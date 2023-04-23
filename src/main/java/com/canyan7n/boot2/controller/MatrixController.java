package com.canyan7n.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MatrixController
 * @date ：2023/4/23 11:25
 * @description：TODO
 */
@RestController
public class MatrixController {

    // /sell/car;price=1000;brand=byd,bmw
    @RequestMapping("/sell/{path}")
    public Map testSell(@PathVariable("path") String path,
                    @MatrixVariable("price") Integer price,
                    @MatrixVariable("brand") List<String> brand){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("price",price);
        hashMap.put("brand",brand);
        hashMap.put("path",path);
        return hashMap;
    }

    // /boss/bossid;age=10/empid;age=20
    @RequestMapping("/boss/{bossId}")
    public Map testBoss(@PathVariable("bossId") Integer bossId,
                        @MatrixVariable(value = "age",pathVar = "boosId") Integer bossAge,
                        @MatrixVariable(value = "age",pathVar = "empId") Integer empAge){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("bossAge",bossAge);
        hashMap.put("empAge",empAge);
        hashMap.put("bossId",bossId);
        return hashMap;
    }
}
