package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.bx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2417bx {

    /* renamed from: a, reason: collision with root package name */
    private L1.a f18212a;

    /* renamed from: b, reason: collision with root package name */
    private Context f18213b;

    /* renamed from: c, reason: collision with root package name */
    private long f18214c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference f18215d;

    public final C2417bx zzd(long j8) {
        this.f18214c = j8;
        return this;
    }

    public final C2417bx zze(Context context) {
        this.f18215d = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f18213b = context;
        return this;
    }

    public final C2417bx zzf(L1.a aVar) {
        this.f18212a = aVar;
        return this;
    }
}
