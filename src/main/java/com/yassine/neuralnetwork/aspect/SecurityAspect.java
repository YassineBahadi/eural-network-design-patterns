package com.yassine.neuralnetwork.aspect;

import com.yassine.neuralnetwork.NeuralNetwork;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author pc
 **/
@Aspect
@Component
public class SecurityAspect {

    @Before("execution(* com.yassine.neuralnetwork.NeuralNetwork.predict(..))")
    public void checkSecurity() {

        System.out.println("[SECURITY] Checking access...");
    }


    @Around("execution(* com.yassine.neuralnetwork.NeuralNetwork.predict(..))")
    public Object securePredict(ProceedingJoinPoint joinPoint)
            throws Throwable {

        NeuralNetwork network = (NeuralNetwork) joinPoint.getTarget();

        if (!network.getState().equals("TRAINED")) {
            throw new SecurityException("Access denied!");
        }

        return joinPoint.proceed();
    }
}