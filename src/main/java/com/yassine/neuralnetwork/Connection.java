package com.yassine.neuralnetwork;

/**
 * @author pc
 **/
public class Connection {
    private Neuron source;
    private Neuron destination;
    private double weight;

    public Connection(Neuron source, Neuron destination, double weight) {
        if (weight < 0 || weight > 1)
            throw new IllegalArgumentException("Weight must be between 0 and 1");

        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Neuron getSource() {
        return source;
    }

    public Neuron getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0 || weight > 1)
            throw new IllegalArgumentException("Weight must be between 0 and 1");

        this.weight = weight;
    }
}