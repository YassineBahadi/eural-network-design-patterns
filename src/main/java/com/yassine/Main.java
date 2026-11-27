package com.yassine;

import com.yassine.neuralnetwork.Connection;
import com.yassine.neuralnetwork.Neuron;
import com.yassine.neuralnetwork.activation.Identity;
import com.yassine.neuralnetwork.activation.Sigmoid;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Neuron neuron = new Neuron(0.5, new Sigmoid());

        double[] inputs = {2.0};

        Connection connection =
                new Connection(null, neuron, 0.5);

        neuron.addConnection(connection);

        System.out.println("Sigmoid: " + neuron.calculate(inputs));

        neuron.setActivationFunction(new Identity());

        System.out.println("Identity: " + neuron.calculate(inputs));
    }
}