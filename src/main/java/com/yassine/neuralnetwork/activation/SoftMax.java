package com.yassine.neuralnetwork.activation;

/**
 * @author pc
 **/
public class SoftMax implements ActivationFunction {

    @Override
    public double activate(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }

    public double[] activate(double[] values) {
        double max = java.util.Arrays.stream(values)
                .max().orElse(0);

        double sum = 0;
        double[] result = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = Math.exp(values[i] - max);
            sum += result[i];
        }

        for (int i = 0; i < result.length; i++) {
            result[i] /= sum;
        }

        return result;
    }
}