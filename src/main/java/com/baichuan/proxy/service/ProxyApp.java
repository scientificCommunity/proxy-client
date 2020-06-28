package com.baichuan.proxy.service;

/**
 * @author kun
 * @date 2020-06-11 17:54
 */
public class ProxyApp {
    public static void main(String[] args) {
        new ProxyServer().init().start(9004);
    }
}
