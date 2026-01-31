package io.grpc;

import io.grpc.C5713a;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public abstract class J {
    public static final C5713a.c TRANSPORT_ATTR_REMOTE_ADDR = C5713a.c.create("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");
    public static final C5713a.c TRANSPORT_ATTR_LOCAL_ADDR = C5713a.c.create("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");
    public static final C5713a.c TRANSPORT_ATTR_SSL_SESSION = C5713a.c.create("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    private static String a(String str, int i8) {
        try {
            return new URI(null, null, str, i8, null, null, null).getAuthority();
        } catch (URISyntaxException e8) {
            throw new IllegalArgumentException("Invalid host or port: " + str + Q7.X.SPACE + i8, e8);
        }
    }

    public static AbstractC5722e0 newChannelBuilder(String str, AbstractC5725g abstractC5725g) {
        return C5726g0.getDefaultRegistry().d(str, abstractC5725g);
    }

    public static AbstractC5722e0 newChannelBuilderForAddress(String str, int i8, AbstractC5725g abstractC5725g) {
        return newChannelBuilder(a(str, i8), abstractC5725g);
    }

    public static v0 newServerBuilderForPort(int i8, z0 z0Var) {
        return D0.getDefaultRegistry().b(i8, z0Var);
    }
}
