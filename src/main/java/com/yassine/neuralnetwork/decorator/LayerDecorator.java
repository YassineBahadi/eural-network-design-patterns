package com.yassine.neuralnetwork.decorator;

import com.yassine.neuralnetwork.Layer;

/**
 * @author pc
 **/
public abstract class LayerDecorator extends Layer {

    protected Layer layer;

    public LayerDecorator(Layer layer) {
        this.layer = layer;
    }

    @Override
    public double[] process(double[] inputs) {
        return layer.process(inputs);
    }
}
