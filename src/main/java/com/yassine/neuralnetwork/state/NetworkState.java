package com.yassine.neuralnetwork.state;

import com.yassine.neuralnetwork.NeuralNetwork;

/**
 * @author pc
 **/
public interface NetworkState {
    void train(NeuralNetwork network);
    void fit(NeuralNetwork network);
    double[] predict(NeuralNetwork network, double[] input);
    String getName();
}