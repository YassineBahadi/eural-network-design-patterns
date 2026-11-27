package com.yassine.neuralnetwork.observer;

/**
 * @author pc
 **/
public class Dashboard implements NetworkObserver {

    @Override
    public void update(String state) {
        System.out.println(
                "[DASHBOARD] Network state changed to: " + state
        );
    }
}