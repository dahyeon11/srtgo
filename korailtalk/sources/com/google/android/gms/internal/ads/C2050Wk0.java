package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.Wk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2050Wk0 extends AbstractC4218rk0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f17063a;

    /* renamed from: b, reason: collision with root package name */
    final Object f17064b;

    C2050Wk0(Object obj, Object obj2) {
        this.f17063a = obj;
        this.f17064b = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4218rk0, java.util.Map.Entry
    public final Object getKey() {
        return this.f17063a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4218rk0, java.util.Map.Entry
    public final Object getValue() {
        return this.f17064b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4218rk0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
