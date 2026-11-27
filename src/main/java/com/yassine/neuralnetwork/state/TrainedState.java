package com.yassine.neuralnetwork.state;

import com.yassine.neuralnetwork.NeuralNetwork;

/**
 * @author pc
 **/
public class TrainedState implements NetworkState {

    @Override
    public void train(NeuralNetwork network) {
        network.setState(new TrainingState());
        network.train();
    }

    @Override
    public void fit(NeuralNetwork network) {
        throw new IllegalStateException("Network already trained");
    }

    @Override
    public double[] predict(NeuralNetwork network, double[] input) {
        return network.compute(input);
    }

    @Override
    public String getName() {
        return "TRAINED";
    }
}