package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* loaded from: classes2.dex */
public final class Hx0 extends Dv0 {

    /* renamed from: e, reason: collision with root package name */
    private NB0 f13370e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f13371f;

    /* renamed from: g, reason: collision with root package name */
    private int f13372g;

    /* renamed from: h, reason: collision with root package name */
    private int f13373h;

    public Hx0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = this.f13373h;
        if (i10 == 0) {
            return -1;
        }
        int iMin = Math.min(i9, i10);
        byte[] bArr2 = this.f13371f;
        int i11 = AbstractC2281am0.zza;
        System.arraycopy(bArr2, this.f13372g, bArr, i8, iMin);
        this.f13372g += iMin;
        this.f13373h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) throws C3565lz0, C1901Sv {
        b(nb0);
        this.f13370e = nb0;
        Uri uriNormalizeScheme = nb0.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        F10.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i8 = AbstractC2281am0.zza;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw C1901Sv.zzb("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f13371f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e8) {
                throw C1901Sv.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e8);
            }
        } else {
            this.f13371f = URLDecoder.decode(str, AbstractC3647mj0.zza.name()).getBytes(AbstractC3647mj0.zzc);
        }
        long j8 = nb0.zze;
        int length = this.f13371f.length;
        if (j8 > length) {
            this.f13371f = null;
            throw new C3565lz0(2008);
        }
        int i9 = (int) j8;
        this.f13372g = i9;
        int i10 = length - i9;
        this.f13373h = i10;
        long j9 = nb0.zzf;
        if (j9 != -1) {
            this.f13373h = (int) Math.min(i10, j9);
        }
        c(nb0);
        long j10 = nb0.zzf;
        return j10 != -1 ? j10 : this.f13373h;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        NB0 nb0 = this.f13370e;
        if (nb0 != null) {
            return nb0.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        if (this.f13371f != null) {
            this.f13371f = null;
            a();
        }
        this.f13370e = null;
    }
}
