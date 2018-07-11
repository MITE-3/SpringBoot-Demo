/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HttpAspect
 * Author:   MITE
 * Date:     2018/7/9 13:19
 * Description: AOP
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.imooc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * 〈一句话功能简述〉<br> 
 * 〈AOP〉
 *
 * @author MITE
 * @create 2018/7/9
 * @since 1.0.0
 */
@Component
@Aspect
public class HttpAspect {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(HttpAspect.class);//Spring内置的日志处理对象

    @Pointcut("execution(public * com.imooc.controller.GirlListController.*(..))")//*对应该类下所有方法，..对应任意参数
    public void log() {
    }

    @Before("log()")
    public void dobefor(JoinPoint joinPoint) {
        logger.info("拦截AOP");
        ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url={}",request.getRequestURL());
        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //类方法
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //参数
        logger.info("args={}",joinPoint.getArgs());
    }

    @After("log()")
    public void afterReturn() {
        logger.info("处理结果");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object) {
        logger.info("return={}",object.toString());
    }
}