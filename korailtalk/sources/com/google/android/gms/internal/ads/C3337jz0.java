package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3337jz0 extends AbstractList {

    /* renamed from: a, reason: collision with root package name */
    private final List f20339a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3223iz0 f20340b;

    public C3337jz0(List list, InterfaceC3223iz0 interfaceC3223iz0) {
        this.f20339a = list;
        this.f20340b = interfaceC3223iz0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        return this.f20340b.zzb(this.f20339a.get(i8));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20339a.size();
    }
}
