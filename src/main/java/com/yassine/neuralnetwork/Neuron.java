package com.yassine.neuralnetwork;

import com.yassine.neuralnetwork.activation.ActivationFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 **/
public class Neuron {
    private double bias;
    private List<Connection> connections = new ArrayList<>();

    private ActivationFunction activationFunction;

    public Neuron(double bias) {
        this.bias = bias;
    }

    public Neuron(double bias, ActivationFunction activationFunction) {
        this.bias = bias;
        this.activationFunction = activationFunction;
    }

    public void addConnection(Connection connection) {
        connections.add(connection);
    }




    public double getBias() {
        return bias;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public double calculate(double[] inputs) {
        double sum = bias;

        for (int i = 0; i < connections.size(); i++) {
            sum += inputs[i] * connections.get(i).getWeight();
        }

        return activationFunction.activate(sum);
    }

    public void setActivationFunction(ActivationFunction activationFunction) {
        this.activationFunction = activationFunction;
    }

}