package com.example.bootstudy.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="Swagger实体类",description = "用做测试用")
public class SwaggerEntity implements Serializable {

    @ApiModelProperty(value = "实体类ID",hidden = true)
    private Integer id;

    @ApiModelProperty(value = "实体名称")
    private String entityName;

    @ApiModelProperty(value = "实体描述")
    private String desc;
}
