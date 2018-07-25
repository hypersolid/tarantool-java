package org.tarantool;

public class TarantoolClusterStrategyRoundRobin implements TarantoolClusterStrategy {

    private int currenctInstance;
    private final int numberOfInstances;

    public TarantoolClusterStrategyRoundRobin(int numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    public synchronized int nextInstance() {
        return currenctInstance++;
    }

    public int getInstanceByKey(Object object) {
        return object.hashCode() % numberOfInstances; // TODO: implement
    }
}
