package com.yassine.neuralnetwork.decorator;

import com.yassine.neuralnetwork.Layer;

/**
 * @author pc
 **/
public class LoggingDecorator extends LayerDecorator {

    public LoggingDecorator(Layer layer) {
        super(layer);
    }

    @Override
    public double[] process(double[] inputs) {

        System.out.println("Processing layer...");

        double[] outputs = super.process(inputs);

        System.out.println("Layer processed.");

        return outputs;
    }
}