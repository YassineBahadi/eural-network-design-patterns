package com.yassine.neuralnetwork;

import com.yassine.neuralnetwork.observer.NetworkObserver;
import com.yassine.neuralnetwork.state.ConstructionState;
import com.yassine.neuralnetwork.state.NetworkState;
import com.yassine.neuralnetwork.state.TrainedState;
import com.yassine.neuralnetwork.state.TrainingState;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 **/
public class NeuralNetwork {

    private List<Layer> layers = new ArrayList<>();

    private NetworkState state = new ConstructionState();

    private List<NetworkObserver> observers = new ArrayList<>();

    public void addLayer(Layer layer) {
        layers.add(layer);
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setState(NetworkState state) {
        this.state = state;
        notifyObservers();
    }

    public String getState() {
        return state.getName();
    }

    public void train() {
        if (state instanceof TrainingState) {
            // Simulation d'un entraînement
            setState(new TrainedState());
        } else {
            state.train(this);
        }
    }

    public void fit() {
        state.fit(this);
    }

    public double[] predict(double[] input) {
        return state.predict(this, input);
    }

    public double[] compute(double[] input) {
        double[] current = input;

        for (Layer layer : layers) {
            double[] output = new double[layer.getNeurons().size()];

            for (int i = 0; i < output.length; i++) {
                output[i] = layer.getNeurons().get(i).calculate(current);
            }

            current = output;
        }

        return current;
    }

    public void addObserver(NetworkObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NetworkObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (NetworkObserver observer : observers) {
            observer.update(getState());
        }
    }

}