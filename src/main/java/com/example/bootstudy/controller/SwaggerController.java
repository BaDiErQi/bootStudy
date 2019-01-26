package com.example.bootstudy.controller;

import com.example.bootstudy.api.SwaggerAPI;
import com.example.bootstudy.entity.SwaggerEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SwaggerController implements SwaggerAPI {

    List<SwaggerEntity> list;
    SwaggerEntity swaggerEntity1;
    SwaggerEntity swaggerEntity2;
    SwaggerEntity swaggerEntity3;

    {
        swaggerEntity1 = new SwaggerEntity(1, "小明", "真的牛");
        swaggerEntity2 = new SwaggerEntity(2, "小红", "真帅");
        swaggerEntity3 = new SwaggerEntity(3, "小青", "真丑");
        list = new ArrayList<>();
        list.add(swaggerEntity1);
        list.add(swaggerEntity2);
        list.add(swaggerEntity3);
    }

    @Override
    @GetMapping(value = "getList")
    public List<SwaggerEntity> getList() {
        return list;
    }

    @Override
    @GetMapping(value = "getListByApi")
    public List<SwaggerEntity> getListByApi() {
        return list;
    }

    @Override
    @GetMapping(value = "getById")
    public SwaggerEntity getById(@RequestParam("swaggerId")Long id) {
        return swaggerEntity1;
    }

    @Override
    @GetMapping(value = "getById/{swaggerId}")
    public SwaggerEntity getByIdAndPath(@PathVariable("swaggerId")Long id) {
        return swaggerEntity1;
    }

    @Override
    @PutMapping(value = "update")
    public SwaggerEntity update(@RequestBody SwaggerEntity swaggerEntity) {
        return swaggerEntity;
    }

    @Override
    @PostMapping(value = "add/{haha}")
    public SwaggerEntity add(@RequestBody SwaggerEntity swaggerEntity, @PathVariable("haha") Integer flag) {
        return swaggerEntity;
    }

    @Override
    @DeleteMapping(value = "delete")
    public void delete(@RequestParam("id") Long id) {

    }
}
