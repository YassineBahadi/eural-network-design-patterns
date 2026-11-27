package com.yassine;

import com.yassine.neuralnetwork.Connection;
import com.yassine.neuralnetwork.NeuralNetwork;
import com.yassine.neuralnetwork.Neuron;
import com.yassine.neuralnetwork.activation.*;
import com.yassine.neuralnetwork.observer.Dashboard;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Neuron neuron = new Neuron(0.5, new Sigmoid());
//
//        double[] inputs = {2.0};
//
//        Connection connection =
//                new Connection(null, neuron, 0.5);
//
//        neuron.addConnection(connection);
//
//        System.out.println("Sigmoid: " + neuron.calculate(inputs));
//
//        neuron.setActivationFunction(new Identity());
//
//        System.out.println("Identity: " + neuron.calculate(inputs));


        ActivationFunction adapter =
                new ActivationAdapter(new LegacyActivation());

        Neuron neuron = new Neuron(0.5, adapter);

        Connection connection =
                new Connection(null, neuron, 0.5);

        neuron.addConnection(connection);

        System.out.println("Adapter: " +
                neuron.calculate(new double[]{2.0}));

        NeuralNetwork network = new NeuralNetwork();

        System.out.println(network.getState());

// Construction -> Training -> Trained
        network.train();

        System.out.println(network.getState());

// Prédiction autorisée
        double[] result = network.predict(new double[]{1, 2, 3});

// Construction -> Trained avec fit()
        NeuralNetwork network2 = new NeuralNetwork();
        network2.fit();

        System.out.println(network2.getState());

        NeuralNetwork network3 = new NeuralNetwork();

        Dashboard dashboard = new Dashboard();

        network3.addObserver(dashboard);

        network3.train();
    }
}