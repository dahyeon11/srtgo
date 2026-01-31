package io.grpc;

import io.grpc.AbstractC5786j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.grpc.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5792m {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5786j f33260a = new a();

    /* renamed from: io.grpc.m$a */
    class a extends AbstractC5786j {
        a() {
        }

        @Override // io.grpc.AbstractC5786j
        public void cancel(String str, Throwable th) {
        }

        @Override // io.grpc.AbstractC5786j
        public void halfClose() {
        }

        @Override // io.grpc.AbstractC5786j
        public boolean isReady() {
            return false;
        }

        @Override // io.grpc.AbstractC5786j
        public void request(int i8) {
        }

        @Override // io.grpc.AbstractC5786j
        public void sendMessage(Object obj) {
        }

        @Override // io.grpc.AbstractC5786j
        public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
        }
    }

    /* renamed from: io.grpc.m$b */
    private static class b extends AbstractC5723f {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5723f f33261a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5788k f33262b;

        /* synthetic */ b(AbstractC5723f abstractC5723f, InterfaceC5788k interfaceC5788k, AbstractC5790l abstractC5790l) {
            this(abstractC5723f, interfaceC5788k);
        }

        @Override // io.grpc.AbstractC5723f
        public String authority() {
            return this.f33261a.authority();
        }

        @Override // io.grpc.AbstractC5723f
        public <ReqT, RespT> AbstractC5786j newCall(C5730i0 c5730i0, C5721e c5721e) {
            return this.f33262b.interceptCall(c5730i0, c5721e, this.f33261a);
        }

        private b(AbstractC5723f abstractC5723f, InterfaceC5788k interfaceC5788k) {
            this.f33261a = abstractC5723f;
            this.f33262b = (InterfaceC5788k) e3.w.checkNotNull(interfaceC5788k, "interceptor");
        }
    }

    public static AbstractC5723f intercept(AbstractC5723f abstractC5723f, InterfaceC5788k... interfaceC5788kArr) {
        return intercept(abstractC5723f, (List<? extends InterfaceC5788k>) Arrays.asList(interfaceC5788kArr));
    }

    public static AbstractC5723f interceptForward(AbstractC5723f abstractC5723f, InterfaceC5788k... interfaceC5788kArr) {
        return interceptForward(abstractC5723f, (List<? extends InterfaceC5788k>) Arrays.asList(interfaceC5788kArr));
    }

    public static AbstractC5723f intercept(AbstractC5723f abstractC5723f, List<? extends InterfaceC5788k> list) {
        e3.w.checkNotNull(abstractC5723f, "channel");
        Iterator<? extends InterfaceC5788k> it = list.iterator();
        while (it.hasNext()) {
            abstractC5723f = new b(abstractC5723f, it.next(), null);
        }
        return abstractC5723f;
    }

    public static AbstractC5723f interceptForward(AbstractC5723f abstractC5723f, List<? extends InterfaceC5788k> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return intercept(abstractC5723f, arrayList);
    }
}
