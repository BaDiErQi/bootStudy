package com.example.bootstudy.api;

import com.example.bootstudy.entity.SwaggerEntity;
import io.swagger.annotations.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(value = "SwaggerController(value)", tags = "SwaggerController(tags)")
public interface SwaggerAPI {

    List<SwaggerEntity> getList();

    @ApiOperation(value = "获取所有Swagger实例", notes = "这是notes")
    List<SwaggerEntity> getListByApi();

    @ApiOperation(value = "获取Swagger实例", notes = "通过id获取Swagger实例")
    @ApiImplicitParam(name = "swaggerId", value = "Swagger的Id", required = true, dataType = "String")
    SwaggerEntity getById(Long id);

    @ApiOperation(value = "获取Swagger实例", notes = "路径变量获取id获取Swagger实例")
    @ApiImplicitParam(name = "swaggerId", value = "Swagger的Id", required = true, dataType = "String", paramType = "path")
    SwaggerEntity getByIdAndPath(Long id);

    @ApiOperation(value = "修改Swagger实例", notes = "参数传递格式为json")
    SwaggerEntity update(@ApiParam(name="对象",value="Updated object",required = true) SwaggerEntity swaggerEntity);

    @ApiOperation(value = "添加Swagger实例",notes = "测试多参的API写法")
    /*@ApiImplicitParams({
            @ApiImplicitParam(name="swaggerEntity",value = "added Object",required = true),
            @ApiImplicitParam(name="haha",value="是否添加",dataType = "Integer")
    })
      这种形式ui上数据类型显示有问题，找不到对应的paramType
    */
    SwaggerEntity add(@ApiParam(name="swaggerEntity",value = "added Object",required = true)SwaggerEntity swaggerEntity,
                      @ApiParam(name="haha",value="是否添加")Integer flag);

    @ApiIgnore
    void delete(Long id);
}
