package com.yassine.neuralnetwork.decorator;

import com.yassine.neuralnetwork.Layer;

/**
 * @author pc
 **/
public class NormalizationDecorator extends LayerDecorator {

    public NormalizationDecorator(Layer layer) {
        super(layer);
    }

    @Override
    public double[] process(double[] inputs) {

        double[] outputs = super.process(inputs);

        double sum = 0;

        for (double value : outputs) {
            sum += value;
        }

        if (sum != 0) {
            for (int i = 0; i < outputs.length; i++) {
                outputs[i] /= sum;
            }
        }

        return outputs;
    }
}