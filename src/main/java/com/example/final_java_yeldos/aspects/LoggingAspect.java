package com.example.final_java_yeldos.aspects;

import com.example.final_java_yeldos.model.Department;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Slf4j
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.final_java_yeldos.service.AuthorService.*())")
    public void before(JoinPoint joinPoint) {
        log.info("Before method invoked::" + joinPoint.getSignature());
    }

    @After("execution(* com.example.final_java_yeldos.service.AuthorService.*())")
    public void after(JoinPoint joinPoint) {
        log.info("After method invoked::" + joinPoint.getSignature());
    }


    @AfterReturning("execution(* com.example.final_java_yeldos.service.BookService.findAllBook())")
    public void afterReturning(JoinPoint joinPoint) {
        log.info("AfterReturning method invoked::" + joinPoint.getSignature());
    }

    @AfterThrowing("execution(* com.example.final_java_yeldos.service.BookService.*())")
    public void afterThrowing(JoinPoint joinPoint) {
        log.info("AfterReturning method invoked::" + joinPoint.getSignature());
    }

    @Pointcut("execution(* com.example.final_java_yeldos.service.DepartmentService.*())")
    public void loggingPointCutCompanyService(){

    }

    @Around("loggingPointCutCompanyService()")
    public Object beforeInfo(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        log.info("Before around:::" + proceedingJoinPoint.getSignature());
        Object obj = proceedingJoinPoint.proceed();
        if (obj instanceof Department) {
            log.info("After method invoked:::" + proceedingJoinPoint.getSignature());
        }
        else {
            log.info("Before method invoked:::" + proceedingJoinPoint.getSignature());
        }
        return obj;
    }

}
