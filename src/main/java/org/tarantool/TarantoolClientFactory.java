package org.tarantool;

public interface TarantoolClientFactory {
    int buildClient(String address);
}
