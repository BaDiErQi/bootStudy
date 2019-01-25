package com.example.bootstudy.api;

import com.example.bootstudy.entity.SwaggerEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@Api(value="SwaggerController(value)",tags = "SwaggerController(tags)")
public interface SwaggerAPI {

    List<SwaggerEntity> getList();

    @ApiOperation(value="获取所有Swagger实例",notes = "这是notes")
    List<SwaggerEntity> getListByApi();
}
