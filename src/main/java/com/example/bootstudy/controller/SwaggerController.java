package com.example.bootstudy.controller;

import com.example.bootstudy.api.SwaggerAPI;
import com.example.bootstudy.entity.SwaggerEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SwaggerController implements SwaggerAPI {

    @GetMapping(value = "getList")
    @Override
    public List<SwaggerEntity> getList() {
        ArrayList<SwaggerEntity> list = new ArrayList<>();
        list.add(new SwaggerEntity(1, "名称1", "描述1"));
        list.add(new SwaggerEntity(2, "名称2", "描述2"));
        list.add(new SwaggerEntity(3, "名称3", "描述3"));
        return list;
    }

    @GetMapping(value = "getListByApi")
    @Override
    public List<SwaggerEntity> getListByApi() {
        return getList();
    }
}
