package com.yassine.neuralnetwork;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 **/
public class NeuralNetwork {
    private List<Layer> layers = new ArrayList<>();

    public void addLayer(Layer layer) {
        layers.add(layer);
    }

    public List<Layer> getLayers() {
        return layers;
    }
}
