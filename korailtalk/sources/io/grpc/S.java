package io.grpc;

import io.grpc.F0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class S {
    public static List<InterfaceC5788k> getClientInterceptors() {
        return I.a();
    }

    public static List<A0> getServerInterceptors() {
        return I.b();
    }

    public static List<F0.a> getServerStreamTracerFactories() {
        return I.c();
    }

    public static void setInterceptorsTracers(List<InterfaceC5788k> list, List<A0> list2, List<F0.a> list3) {
        I.d(list, list2, list3);
    }
}
