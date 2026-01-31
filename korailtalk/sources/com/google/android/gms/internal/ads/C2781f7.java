package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2781f7 {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public C2781f7(int i8, String str, int i9, List list, byte[] bArr) {
        this.zza = i8;
        this.zzb = str;
        this.zzc = i9;
        this.zzd = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i8 = this.zzc;
        if (i8 != 2) {
            return i8 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
