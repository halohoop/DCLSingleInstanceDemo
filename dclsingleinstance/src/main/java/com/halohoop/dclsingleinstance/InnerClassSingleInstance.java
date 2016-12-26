/*
 * Copyright (C) 2016, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * InnerClassSingleInstance.java
 *
 * only when the class is loaded will load SingletonHolder and execute InnerClassSingleInstance().
 *
 * Author huanghaiqi, Created at 2016-12-26
 *
 * Ver 1.0, 2016-12-26, huanghaiqi, Create file.
 */

package com.halohoop.dclsingleinstance;

public class InnerClassSingleInstance {

    private InnerClassSingleInstance() {
    }

    private static class SingletonHolder {
        private final static InnerClassSingleInstance instance = new InnerClassSingleInstance();
    }

    public static InnerClassSingleInstance getInstance() {
        return SingletonHolder.instance;
    }
}
