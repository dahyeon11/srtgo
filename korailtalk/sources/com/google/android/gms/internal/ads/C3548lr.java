package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.lr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3548lr {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f20744a = new WeakHashMap();

    public final Future zzb(Context context) {
        return AbstractC4805wt.zza.zzb(new CallableC3320jr(this, context));
    }
}
