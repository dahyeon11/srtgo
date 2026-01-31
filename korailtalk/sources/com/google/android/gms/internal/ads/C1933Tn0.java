package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.Tn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1933Tn0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16522a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Logger f16523b;

    C1933Tn0(Class cls) {
        this.f16522a = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f16523b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = this.f16523b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f16522a);
                this.f16523b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
