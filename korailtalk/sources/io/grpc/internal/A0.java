package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class A0 implements InterfaceC5751h0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f32169b = Logger.getLogger(A0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor f32170c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f32171d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f32172e;

    /* renamed from: f, reason: collision with root package name */
    private static final RuntimeException f32173f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object[] f32174g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f32175a;

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    static {
        /*
            java.lang.Class<io.grpc.internal.A0> r0 = io.grpc.internal.A0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            io.grpc.internal.A0.f32169b = r0
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "add"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L42
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "sum"
            java.lang.reflect.Method r3 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.reflect.Constructor[] r1 = r1.getConstructors()     // Catch: java.lang.Throwable -> L3a
            int r4 = r1.length     // Catch: java.lang.Throwable -> L3a
            r5 = 0
        L2b:
            if (r5 >= r4) goto L3c
            r6 = r1[r5]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L3a
            int r7 = r7.length     // Catch: java.lang.Throwable -> L3a
            if (r7 != 0) goto L37
            goto L3d
        L37:
            int r5 = r5 + 1
            goto L2b
        L3a:
            r1 = move-exception
            goto L45
        L3c:
            r6 = r0
        L3d:
            r1 = r0
            goto L4f
        L3f:
            r1 = move-exception
            r3 = r0
            goto L45
        L42:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L45:
            java.util.logging.Logger r4 = io.grpc.internal.A0.f32169b
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            java.lang.String r6 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            r4.log(r5, r6, r1)
            r6 = r0
        L4f:
            if (r1 != 0) goto L5c
            if (r6 == 0) goto L5c
            io.grpc.internal.A0.f32170c = r6
            io.grpc.internal.A0.f32171d = r2
            io.grpc.internal.A0.f32172e = r3
            io.grpc.internal.A0.f32173f = r0
            goto L69
        L5c:
            io.grpc.internal.A0.f32170c = r0
            io.grpc.internal.A0.f32171d = r0
            io.grpc.internal.A0.f32172e = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            io.grpc.internal.A0.f32173f = r0
        L69:
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            io.grpc.internal.A0.f32174g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.A0.<clinit>():void");
    }

    A0() {
        RuntimeException runtimeException = f32173f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f32175a = f32170c.newInstance(null);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    static boolean a() {
        return f32173f == null;
    }

    @Override // io.grpc.internal.InterfaceC5751h0
    public void add(long j8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            f32171d.invoke(this.f32175a, j8 == 1 ? f32174g : new Object[]{Long.valueOf(j8)});
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // io.grpc.internal.InterfaceC5751h0
    public long value() {
        try {
            return ((Long) f32172e.invoke(this.f32175a, null)).longValue();
        } catch (IllegalAccessException unused) {
            throw new RuntimeException();
        } catch (InvocationTargetException unused2) {
            throw new RuntimeException();
        }
    }
}
