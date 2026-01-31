package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4165rE0 implements Ky0 {

    /* renamed from: a, reason: collision with root package name */
    private final Ky0 f22403a;

    /* renamed from: b, reason: collision with root package name */
    private long f22404b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f22405c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map f22406d = Collections.emptyMap();

    public C4165rE0(Ky0 ky0) {
        this.f22403a = ky0;
    }

    @Override // com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) {
        int iZza = this.f22403a.zza(bArr, i8, i9);
        if (iZza != -1) {
            this.f22404b += iZza;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) {
        this.f22405c = nb0.zza;
        this.f22406d = Collections.emptyMap();
        long jZzb = this.f22403a.zzb(nb0);
        Uri uriZzc = zzc();
        uriZzc.getClass();
        this.f22405c = uriZzc;
        this.f22406d = zze();
        return jZzb;
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        return this.f22403a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        this.f22403a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final Map zze() {
        return this.f22403a.zze();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzf(InterfaceC4279sE0 interfaceC4279sE0) {
        interfaceC4279sE0.getClass();
        this.f22403a.zzf(interfaceC4279sE0);
    }

    public final long zzg() {
        return this.f22404b;
    }

    public final Uri zzh() {
        return this.f22405c;
    }

    public final Map zzi() {
        return this.f22406d;
    }
}
