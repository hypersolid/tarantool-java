package org.tarantool;

public interface TarantoolClusterStrategy {
    int nextInstance();
    int getInstanceByKey(Object object);
}
