/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Girl
 * Author:   MITE
 * Date:     2018/7/6 13:58
 * Description: 数据库映射类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数据库映射类〉
 *
 * @author MITE
 * @create 2018/7/6
 * @since 1.0.0
 */
@Entity
public class Girl {
    //ID主键，自增
    @Id
    @GeneratedValue
    private Integer id;

    private String cupSize;
    @Min(value = 18,message = "未成年少女禁止入内")
    private Integer age;

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }

    //必须有一个无参的构造方法
    public Girl(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}