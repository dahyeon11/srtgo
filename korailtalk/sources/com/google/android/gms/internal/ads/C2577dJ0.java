package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.dJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2577dJ0 {
    public static final C2577dJ0 zza;

    /* renamed from: a, reason: collision with root package name */
    private final C2462cJ0 f18573a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18574b;
    public final String zzb;

    static {
        zza = AbstractC2281am0.zza < 31 ? new C2577dJ0("") : new C2577dJ0(C2462cJ0.zza, "");
    }

    private C2577dJ0(C2462cJ0 c2462cJ0, String str) {
        this.f18573a = c2462cJ0;
        this.zzb = str;
        this.f18574b = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2577dJ0)) {
            return false;
        }
        C2577dJ0 c2577dJ0 = (C2577dJ0) obj;
        return Objects.equals(this.zzb, c2577dJ0.zzb) && Objects.equals(this.f18573a, c2577dJ0.f18573a) && Objects.equals(this.f18574b, c2577dJ0.f18574b);
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, this.f18573a, this.f18574b);
    }

    public final LogSessionId zza() {
        C2462cJ0 c2462cJ0 = this.f18573a;
        c2462cJ0.getClass();
        return c2462cJ0.zzb;
    }

    public C2577dJ0(LogSessionId logSessionId, String str) {
        this(new C2462cJ0(logSessionId), str);
    }

    public C2577dJ0(String str) {
        F10.zzf(AbstractC2281am0.zza < 31);
        this.zzb = str;
        this.f18573a = null;
        this.f18574b = new Object();
    }
}
