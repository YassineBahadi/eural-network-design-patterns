package com.yassine.neuralnetwork.activation;

/**
 * @author pc
 **/
public class Identity implements ActivationFunction {

    @Override
    public double activate(double x) {
        return x;
    }
}