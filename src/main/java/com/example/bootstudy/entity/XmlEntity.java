package com.example.bootstudy.entity;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class XmlEntity implements Serializable {
    private static final long serialVersionUID = 8628671589025453683L;

    private String name;
    private Integer age;
    private String code;

    public XmlEntity(String name, Integer age, String code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @XmlElement
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
