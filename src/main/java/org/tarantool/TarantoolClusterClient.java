package org.tarantool;

import java.util.concurrent.TimeUnit;

public interface TarantoolClusterClient {
    TarantoolClient nextClient(); // will use strategy to determine next hash
    TarantoolClient nextClientByKey(Object object); // explicitly specifies hash

    void close(); // closes all connections

    boolean isAlive(); // checks that all connections are alive

    void waitAlive() throws InterruptedException; // wait for all connections to become alive

    boolean waitAlive(long timeout, TimeUnit unit) throws InterruptedException; // wait for all connections to become alive
}
