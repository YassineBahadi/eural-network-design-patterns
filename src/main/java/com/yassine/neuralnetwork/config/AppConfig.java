package com.yassine.neuralnetwork.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author pc
 **/
@Configuration
@ComponentScan("com.yassine.neuralnetwork")
@EnableAspectJAutoProxy
public class AppConfig {
}