package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class EM0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f12800a = new AtomicLong();
    public final NB0 zza;
    public final Uri zzb;
    public final Map zzc;

    public EM0(long j8, NB0 nb0, Uri uri, Map map, long j9, long j10, long j11) {
        this.zza = nb0;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return f12800a.getAndIncrement();
    }
}
