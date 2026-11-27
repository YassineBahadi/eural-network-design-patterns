package com.yassine.neuralnetwork.state;

import com.yassine.neuralnetwork.NeuralNetwork;

/**
 * @author pc
 **/
public class ConstructionState implements NetworkState {

    @Override
    public void train(NeuralNetwork network) {
        network.setState(new TrainingState());
        network.train();
    }

    @Override
    public void fit(NeuralNetwork network) {
        network.setState(new TrainedState());
    }

    @Override
    public double[] predict(NeuralNetwork network, double[] input) {
        throw new IllegalStateException("Network is not trained");
    }

    @Override
    public String getName() {
        return "CONSTRUCTION";
    }
}