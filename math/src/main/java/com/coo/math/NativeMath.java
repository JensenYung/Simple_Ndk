package com.coo.math;

/**
 * Created by jensen on 7/6/16.
 */
public class NativeMath {

    static {
        System.loadLibrary("NativeMath");
    }

    private static native int nativeAdd(int a, int b);

    public static int add(int a, int b) {
        return nativeAdd(a, b);
    }
}
