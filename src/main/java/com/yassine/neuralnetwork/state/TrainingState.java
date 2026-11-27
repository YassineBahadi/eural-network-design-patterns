package com.yassine.neuralnetwork.state;

import com.yassine.neuralnetwork.NeuralNetwork;

/**
 * @author pc
 **/
public class TrainingState implements NetworkState {

    @Override
    public void train(NeuralNetwork network) {
        throw new IllegalStateException("Already training");
    }

    @Override
    public void fit(NeuralNetwork network) {
        throw new IllegalStateException("Cannot fit while training");
    }

    @Override
    public double[] predict(NeuralNetwork network, double[] input) {
        throw new IllegalStateException("Network is training");
    }

    @Override
    public String getName() {
        return "TRAINING";
    }
}