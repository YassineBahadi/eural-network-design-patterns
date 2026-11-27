package com.yassine.neuralnetwork.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author pc
 **/

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.yassine.neuralnetwork..*(..))")
    public Object log(ProceedingJoinPoint joinPoint)
            throws Throwable {

        System.out.println(
                "[LOG] Entering: " +
                        joinPoint.getSignature().getName()
        );

        Object result = joinPoint.proceed();

        System.out.println(
                "[LOG] Exiting: " +
                        joinPoint.getSignature().getName()
        );

        return result;
    }
}
