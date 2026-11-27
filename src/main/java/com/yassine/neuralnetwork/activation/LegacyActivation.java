package com.yassine.neuralnetwork.activation;

/**
 * @author pc
 **/
public class LegacyActivation {

    public double compute(double value) {
        return Math.max(0, value);
    }
}