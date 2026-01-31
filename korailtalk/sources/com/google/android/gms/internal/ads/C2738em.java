package com.google.android.gms.internal.ads;

import F1.a;

/* renamed from: com.google.android.gms.internal.ads.em, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2738em implements F1.a {

    /* renamed from: a, reason: collision with root package name */
    private final a.EnumC0028a f18814a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18815b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18816c;

    public C2738em(a.EnumC0028a enumC0028a, String str, int i8) {
        this.f18814a = enumC0028a;
        this.f18815b = str;
        this.f18816c = i8;
    }

    @Override // F1.a
    public final String getDescription() {
        return this.f18815b;
    }

    @Override // F1.a
    public final a.EnumC0028a getInitializationState() {
        return this.f18814a;
    }

    @Override // F1.a
    public final int getLatency() {
        return this.f18816c;
    }
}
