package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3691n5 implements K1 {

    /* renamed from: a, reason: collision with root package name */
    private final K1 f21189a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3122i5 f21190b;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC3349k5 f21196h;

    /* renamed from: i, reason: collision with root package name */
    private Q5 f21197i;

    /* renamed from: c, reason: collision with root package name */
    private final C2319b5 f21191c = new C2319b5();

    /* renamed from: e, reason: collision with root package name */
    private int f21193e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f21194f = 0;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f21195g = AbstractC2281am0.zzf;

    /* renamed from: d, reason: collision with root package name */
    private final C4099qh0 f21192d = new C4099qh0();

    public C3691n5(K1 k12, InterfaceC3122i5 interfaceC3122i5) {
        this.f21189a = k12;
        this.f21190b = interfaceC3122i5;
    }

    private final void b(int i8) {
        int length = this.f21195g.length;
        int i9 = this.f21194f;
        if (length - i9 >= i8) {
            return;
        }
        int i10 = i9 - this.f21193e;
        int iMax = Math.max(i10 + i10, i8 + i10);
        byte[] bArr = this.f21195g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f21193e, bArr2, 0, i10);
        this.f21193e = 0;
        this.f21194f = i10;
        this.f21195g = bArr2;
    }

    final /* synthetic */ void a(long j8, int i8, C2433c5 c2433c5) {
        F10.zzb(this.f21197i);
        AbstractC2394bl0 abstractC2394bl0 = c2433c5.zza;
        long j9 = c2433c5.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC2394bl0.size());
        Iterator<E> it = abstractC2394bl0.iterator();
        while (it.hasNext()) {
            arrayList.add(((C4878xX) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C, arrayList);
        bundle.putLong("d", j9);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        C4099qh0 c4099qh0 = this.f21192d;
        int length = bArrMarshall.length;
        c4099qh0.zzI(bArrMarshall, length);
        this.f21189a.zzq(this.f21192d, length);
        long j10 = c2433c5.zzb;
        if (j10 == -9223372036854775807L) {
            F10.zzf(this.f21197i.zzr == Long.MAX_VALUE);
        } else {
            long j11 = this.f21197i.zzr;
            j8 = j11 == Long.MAX_VALUE ? j8 + j10 : j10 + j11;
        }
        this.f21189a.zzs(j8, i8, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final /* synthetic */ int zzf(UL0 ul0, int i8, boolean z8) {
        return H1.zza(this, ul0, i8, z8);
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final int zzg(UL0 ul0, int i8, boolean z8, int i9) throws EOFException {
        if (this.f21196h == null) {
            return this.f21189a.zzg(ul0, i8, z8, 0);
        }
        b(i8);
        int iZza = ul0.zza(this.f21195g, this.f21194f, i8);
        if (iZza != -1) {
            this.f21194f += iZza;
            return iZza;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final void zzl(Q5 q52) {
        String str = q52.zzn;
        str.getClass();
        F10.zzd(AbstractC4239rv.zzb(str) == 3);
        if (!q52.equals(this.f21197i)) {
            this.f21197i = q52;
            this.f21196h = this.f21190b.zzc(q52) ? this.f21190b.zzb(q52) : null;
        }
        if (this.f21196h == null) {
            this.f21189a.zzl(q52);
            return;
        }
        K1 k12 = this.f21189a;
        O4 o4Zzb = q52.zzb();
        o4Zzb.zzX("application/x-media3-cues");
        o4Zzb.zzz(q52.zzn);
        o4Zzb.zzab(Long.MAX_VALUE);
        o4Zzb.zzD(this.f21190b.zza(q52));
        k12.zzl(o4Zzb.zzad());
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final /* synthetic */ void zzq(C4099qh0 c4099qh0, int i8) {
        H1.zzb(this, c4099qh0, i8);
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final void zzr(C4099qh0 c4099qh0, int i8, int i9) {
        if (this.f21196h == null) {
            this.f21189a.zzr(c4099qh0, i8, i9);
            return;
        }
        b(i8);
        c4099qh0.zzG(this.f21195g, this.f21194f, i8);
        this.f21194f += i8;
    }

    @Override // com.google.android.gms.internal.ads.K1
    public final void zzs(final long j8, final int i8, int i9, int i10, I1 i12) {
        if (this.f21196h == null) {
            this.f21189a.zzs(j8, i8, i9, i10, i12);
            return;
        }
        F10.zze(i12 == null, "DRM on subtitles is not supported");
        int i11 = (this.f21194f - i10) - i9;
        this.f21196h.zza(this.f21195g, i11, i9, C3235j5.zza(), new InterfaceC3462l40() { // from class: com.google.android.gms.internal.ads.m5
            @Override // com.google.android.gms.internal.ads.InterfaceC3462l40
            public final void zza(Object obj) {
                this.zza.a(j8, i8, (C2433c5) obj);
            }
        });
        int i13 = i11 + i9;
        this.f21193e = i13;
        if (i13 == this.f21194f) {
            this.f21193e = 0;
            this.f21194f = 0;
        }
    }
}
