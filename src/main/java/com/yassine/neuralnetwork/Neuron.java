package com.yassine.neuralnetwork;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 **/
public class Neuron {
    private double bias;
    private List<Connection> connections = new ArrayList<>();

    public Neuron(double bias) {
        this.bias = bias;
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
}