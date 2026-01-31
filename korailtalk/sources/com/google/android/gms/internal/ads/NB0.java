package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class NB0 {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        AbstractC1609Lp.zzb("media3.datasource");
    }

    public final String toString() {
        return "DataSpec[GET" + Q7.X.SPACE + this.zza.toString() + ", " + this.zze + ", " + this.zzf + ", null, " + this.zzg + "]";
    }

    public final LA0 zza() {
        return new LA0(this, null);
    }

    public final boolean zzb(int i8) {
        return (this.zzg & i8) == i8;
    }

    private NB0(Uri uri, long j8, int i8, byte[] bArr, Map map, long j9, long j10, String str, int i9, Object obj) {
        boolean z8 = false;
        boolean z9 = j9 >= 0;
        F10.zzd(z9);
        F10.zzd(z9);
        if (j10 > 0) {
            z8 = true;
        } else if (j10 == -1) {
            j10 = -1;
            z8 = true;
        }
        F10.zzd(z8);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j9;
        this.zzf = j10;
        this.zzg = i9;
    }

    @Deprecated
    public NB0(Uri uri, long j8, long j9, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j8, j9, null, 0, null);
    }
}
