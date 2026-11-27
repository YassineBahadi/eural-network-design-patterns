package com.yassine.neuralnetwork;
import com.yassine.neuralnetwork.activation.Identity;
import com.yassine.neuralnetwork.activation.Sigmoid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author pc
 **/
class NeuralNetworkTest {

    @Test
    void shouldCalculateSigmoid() {
        Sigmoid sigmoid = new Sigmoid();

        assertEquals(
                0.5,
                sigmoid.activate(0),
                0.0001
        );
    }

    @Test
    void shouldCalculateIdentity() {
        Identity identity = new Identity();

        assertEquals(5, identity.activate(5));
    }

    @Test
    void shouldStartInConstruction() {
        NeuralNetwork network = new NeuralNetwork();

        assertEquals("CONSTRUCTION", network.getState());
    }

    @Test
    void shouldBecomeTrainedAfterFit() {
        NeuralNetwork network = new NeuralNetwork();

        network.fit();

        assertEquals("TRAINED", network.getState());
    }

    @Test
    void shouldRejectPredictionBeforeTraining() {
        NeuralNetwork network = new NeuralNetwork();

        assertThrows(
                IllegalStateException.class,
                () -> network.predict(new double[]{1, 2})
        );
    }

    @Test
    void shouldBecomeTrainedAfterTraining() {
        NeuralNetwork network = new NeuralNetwork();

        network.train();

        assertEquals("TRAINED", network.getState());
    }
}
