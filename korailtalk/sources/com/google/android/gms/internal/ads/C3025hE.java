package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.hE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3025hE {

    /* renamed from: a, reason: collision with root package name */
    private final Object f19776a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f19777b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f19778c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f19779d = new ConcurrentHashMap();

    public final int zza(String str) {
        Integer num = (Integer) this.f19777b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzb(String str) {
        Long l8 = (Long) this.f19779d.get(str);
        if (l8 == null) {
            return -1L;
        }
        return l8.longValue();
    }

    public final void zzc(String str) {
        synchronized (this.f19776a) {
            try {
                Integer num = (Integer) this.f19777b.get(str);
                this.f19777b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(String str, String str2, long j8) {
        Long l8 = (Long) this.f19778c.get(str2);
        if (l8 == null) {
            return;
        }
        this.f19778c.remove(str2);
        this.f19779d.put(str, Long.valueOf(j8 - l8.longValue()));
    }

    public final void zze(String str, long j8) {
        this.f19778c.put(str, Long.valueOf(j8));
    }
}
