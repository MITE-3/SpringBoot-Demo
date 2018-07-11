/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GirlController
 * Author:   MITE
 * Date:     2018/7/6 9:56
 * Description: 控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.controller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈控制器〉
 *
 * @author MITE
 * @create 2018/7/6
 * @since 1.0.0
 */
//spring4之后加的注解，组合注解,相当于@ResponseBody和@Controller的组合
@RestController
public class GirlController {
    /*@Value("${cupSize}")
    private String cupSize;
    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;*/
    @Autowired
    private GirlProperties girlproperties;
//    @GetMapping
    /*public String getCupSize() {
        return cupSize+","+age;
    }*/
//    @RequestMapping(value={"/say/{id}"},method=RequestMethod.GET)
    @GetMapping(value="/say")
    public Integer sayHello(@RequestParam(value="id",required = false,defaultValue = "0") Integer id) {
        return id;
    }
}