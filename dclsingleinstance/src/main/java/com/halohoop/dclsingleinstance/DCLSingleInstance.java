/*
 * Copyright (C) 2016, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * DCLSingleInstance.java
 *
 * DCLSingleInstance
 *
 * Author huanghaiqi, Created at 2016-12-26
 *
 * Ver 1.0, 2016-12-26, huanghaiqi, Create file.
 */

package com.halohoop.dclsingleinstance;

public class DCLSingleInstance {
    /**
     * volatile is since JDK5
     */
    private static volatile DCLSingleInstance instance;

    private DCLSingleInstance() {

    }

    public static DCLSingleInstance getInstance() {
        if (instance == null) {
            synchronized (DCLSingleInstance.class) {
                if (instance == null) {
                    return instance = new DCLSingleInstance();
                }
            }
        }
        return instance;
    }
}
