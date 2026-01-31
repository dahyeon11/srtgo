package com.google.android.gms.common.api.internal;

import I2.C0609m;
import com.google.android.gms.common.api.internal.C1106d;
import g2.C5539a;

/* renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1111i {

    /* renamed from: a, reason: collision with root package name */
    private final C1106d.a f12044a;

    protected AbstractC1111i(C1106d.a aVar) {
        this.f12044a = aVar;
    }

    protected abstract void a(C5539a.b bVar, C0609m c0609m);

    public C1106d.a getListenerKey() {
        return this.f12044a;
    }
}
