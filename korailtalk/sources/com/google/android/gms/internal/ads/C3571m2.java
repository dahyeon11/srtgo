package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3571m2 extends AbstractC4140r2 {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f20802e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f20803b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20804c;

    /* renamed from: d, reason: collision with root package name */
    private int f20805d;

    public C3571m2(K1 k12) {
        super(k12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4140r2
    protected final boolean a(C4099qh0 c4099qh0) throws C4027q2 {
        if (this.f20803b) {
            c4099qh0.zzL(1);
        } else {
            int iZzm = c4099qh0.zzm();
            int i8 = iZzm >> 4;
            this.f20805d = i8;
            if (i8 == 2) {
                int i9 = f20802e[(iZzm >> 2) & 3];
                O4 o42 = new O4();
                o42.zzX("audio/mpeg");
                o42.zzy(1);
                o42.zzY(i9);
                this.f22333a.zzl(o42.zzad());
                this.f20804c = true;
            } else if (i8 == 7 || i8 == 8) {
                O4 o43 = new O4();
                o43.zzX(i8 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                o43.zzy(1);
                o43.zzY(8000);
                this.f22333a.zzl(o43.zzad());
                this.f20804c = true;
            } else if (i8 != 10) {
                throw new C4027q2("Audio format not supported: " + i8);
            }
            this.f20803b = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4140r2
    protected final boolean b(C4099qh0 c4099qh0, long j8) {
        if (this.f20805d == 2) {
            int iZzb = c4099qh0.zzb();
            this.f22333a.zzq(c4099qh0, iZzb);
            this.f22333a.zzs(j8, 1, iZzb, 0, null);
            return true;
        }
        int iZzm = c4099qh0.zzm();
        if (iZzm != 0 || this.f20804c) {
            if (this.f20805d == 10 && iZzm != 1) {
                return false;
            }
            int iZzb2 = c4099qh0.zzb();
            this.f22333a.zzq(c4099qh0, iZzb2);
            this.f22333a.zzs(j8, 1, iZzb2, 0, null);
            return true;
        }
        int iZzb3 = c4099qh0.zzb();
        byte[] bArr = new byte[iZzb3];
        c4099qh0.zzG(bArr, 0, iZzb3);
        C4706w0 c4706w0Zza = AbstractC4820x0.zza(bArr);
        O4 o42 = new O4();
        o42.zzX("audio/mp4a-latm");
        o42.zzz(c4706w0Zza.zzc);
        o42.zzy(c4706w0Zza.zzb);
        o42.zzY(c4706w0Zza.zza);
        o42.zzL(Collections.singletonList(bArr));
        this.f22333a.zzl(o42.zzad());
        this.f20804c = true;
        return false;
    }
}
