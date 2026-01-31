package com.google.android.gms.common.api.internal;

import I2.C0609m;
import com.google.android.gms.common.api.internal.C1106d;
import f2.C5394d;
import g2.C5539a;

/* renamed from: com.google.android.gms.common.api.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1108f {

    /* renamed from: a, reason: collision with root package name */
    private final C1106d f12022a;

    /* renamed from: b, reason: collision with root package name */
    private final C5394d[] f12023b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12024c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12025d;

    protected AbstractC1108f(C1106d c1106d, C5394d[] c5394dArr, boolean z8, int i8) {
        this.f12022a = c1106d;
        this.f12023b = c5394dArr;
        this.f12024c = z8;
        this.f12025d = i8;
    }

    protected abstract void a(C5539a.b bVar, C0609m c0609m);

    public void clearListener() {
        this.f12022a.clear();
    }

    public C1106d.a getListenerKey() {
        return this.f12022a.getListenerKey();
    }

    public C5394d[] getRequiredFeatures() {
        return this.f12023b;
    }

    public final int zaa() {
        return this.f12025d;
    }

    public final boolean zab() {
        return this.f12024c;
    }
}
