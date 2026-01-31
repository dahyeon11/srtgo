package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class QQ extends TQ {

    /* renamed from: l */
    private final S1.a f15771l;

    public QQ(Executor executor, L1.s sVar, S1.a aVar, S1.c cVar, Context context) {
        super(executor, sVar, cVar, context);
        this.f15771l = aVar;
        aVar.set(this.f16469b);
    }

    public final Map zza() {
        return new HashMap(this.f16469b);
    }
}
