package com.yassine.neuralnetwork;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 **/
public class Layer {
    protected List<Neuron> neurons = new ArrayList<>();

    public void addNeuron(Neuron neuron) {
        neurons.add(neuron);
    }

    public List<Neuron> getNeurons() {
        return neurons;
    }
}