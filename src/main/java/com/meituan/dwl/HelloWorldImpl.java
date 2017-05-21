package com.meituan.dwl;

import org.apache.thrift.TException;

/**
 * Created by dongwenlong on 23/04/2017.
 */
public class HelloWorldImpl implements HelloWorldService.Iface {
    public HelloWorldImpl() {
    }
    @Override
    public String sayHello(String username) throws TException {
        return "Hi," + username + " welcome to jianshu";
    }
}
