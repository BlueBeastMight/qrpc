package icu.chiou.impl;

import icu.chiou.HelloQRpc;

/**
 * Author: chiou
 * createTime: 2023/7/23
 * Description: 具体实现
 */
public class HelloQRpcImpl implements HelloQRpc {
    @Override
    public String say(String msg) {
        return "hello consumer: me too!!!" + msg;
    }
}
