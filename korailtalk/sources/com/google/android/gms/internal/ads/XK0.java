package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class XK0 extends AbstractC3963pT {

    /* renamed from: h, reason: collision with root package name */
    private int f17230h;

    /* renamed from: i, reason: collision with root package name */
    private int f17231i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f17232j;

    /* renamed from: k, reason: collision with root package name */
    private int f17233k;

    /* renamed from: l, reason: collision with root package name */
    private byte[] f17234l = AbstractC2281am0.zzf;

    /* renamed from: m, reason: collision with root package name */
    private int f17235m;

    /* renamed from: n, reason: collision with root package name */
    private long f17236n;

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT, com.google.android.gms.internal.ads.NS
    public final ByteBuffer zzb() {
        int i8;
        if (super.zzh() && (i8 = this.f17235m) > 0) {
            a(i8).put(this.f17234l, 0, this.f17235m).flip();
            this.f17235m = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT, com.google.android.gms.internal.ads.NS
    public final void zze(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i8 = iLimit - iPosition;
        if (i8 == 0) {
            return;
        }
        int iMin = Math.min(i8, this.f17233k);
        this.f17236n += iMin / this.f21766a.zze;
        this.f17233k -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f17233k <= 0) {
            int i9 = i8 - iMin;
            int length = (this.f17235m + i9) - this.f17234l.length;
            ByteBuffer byteBufferA = a(length);
            int iMax = Math.max(0, Math.min(length, this.f17235m));
            byteBufferA.put(this.f17234l, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i9));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferA.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i10 = i9 - iMax2;
            int i11 = this.f17235m - iMax;
            this.f17235m = i11;
            byte[] bArr = this.f17234l;
            System.arraycopy(bArr, iMax, bArr, 0, i11);
            byteBuffer.get(this.f17234l, this.f17235m, i10);
            this.f17235m += i10;
            byteBufferA.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT, com.google.android.gms.internal.ads.NS
    public final boolean zzh() {
        return super.zzh() && this.f17235m == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    public final KR zzi(KR kr2) throws C3620mS {
        if (kr2.zzd != 2) {
            throw new C3620mS("Unhandled input format:", kr2);
        }
        this.f17232j = true;
        return (this.f17230h == 0 && this.f17231i == 0) ? KR.zza : kr2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    protected final void zzk() {
        if (this.f17232j) {
            this.f17232j = false;
            int i8 = this.f17231i;
            int i9 = this.f21766a.zze;
            this.f17234l = new byte[i8 * i9];
            this.f17233k = this.f17230h * i9;
        }
        this.f17235m = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    protected final void zzl() {
        if (this.f17232j) {
            if (this.f17235m > 0) {
                this.f17236n += r0 / this.f21766a.zze;
            }
            this.f17235m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    protected final void zzm() {
        this.f17234l = AbstractC2281am0.zzf;
    }

    public final long zzo() {
        return this.f17236n;
    }

    public final void zzp() {
        this.f17236n = 0L;
    }

    public final void zzq(int i8, int i9) {
        this.f17230h = i8;
        this.f17231i = i9;
    }
}
