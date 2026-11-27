package com.yassine.neuralnetwork.activation;

/**
 * @author pc
 **/
public class ActivationAdapter implements ActivationFunction {

    private LegacyActivation legacyActivation;

    public ActivationAdapter(LegacyActivation legacyActivation) {
        this.legacyActivation = legacyActivation;
    }

    @Override
    public double activate(double x) {
        return legacyActivation.compute(x);
    }
}
