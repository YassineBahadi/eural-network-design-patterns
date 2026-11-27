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

    public double[] process(double[] inputs) {
        double[] outputs = new double[neurons.size()];

        for (int i = 0; i < neurons.size(); i++) {
            outputs[i] = neurons.get(i).calculate(inputs);
        }

        return outputs;
    }
}