package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4655vb {

    /* renamed from: a, reason: collision with root package name */
    private List f23260a = Collections.emptyList();

    public final List zza() {
        List list = this.f23260a;
        this.f23260a = Collections.emptyList();
        return list;
    }

    public final void zzb(List list) {
        this.f23260a = new ArrayList(list);
    }
}
