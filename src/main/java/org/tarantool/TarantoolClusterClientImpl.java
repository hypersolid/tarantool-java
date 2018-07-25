package org.tarantool;

import java.util.concurrent.TimeUnit;


public class TarantoolClusterClientImpl implements TarantoolClusterClient {
    TarantoolClusterClientImpl(String[] addresses, TarantoolClientFactory factory, TarantoolClientConfig config, TarantoolClusterStrategy strategy) {
        // TODO loop through addresses and create new client for each address
        // every client will have the same config options
        // strategy will provide nextClient() and nextClientByKey(Object object) implementations
    }

    public TarantoolClient nextClient() {return null;}
    public TarantoolClient nextClientByKey(Object object) {return null;}

    public void close() {}

    public boolean isAlive() {return false;}

    public void waitAlive() throws InterruptedException {}

    public boolean waitAlive(long timeout, TimeUnit unit) throws InterruptedException { return false; }
}
