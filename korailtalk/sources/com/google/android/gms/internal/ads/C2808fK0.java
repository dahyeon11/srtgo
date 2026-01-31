package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.fK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2808fK0 extends AbstractC3963pT {

    /* renamed from: h, reason: collision with root package name */
    private int[] f19162h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f19163i;

    C2808fK0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT, com.google.android.gms.internal.ads.NS
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.f19163i;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f21766a.zze) * this.f21767b.zze);
        while (iPosition < iLimit) {
            for (int i8 : iArr) {
                byteBufferA.putShort(byteBuffer.getShort(i8 + i8 + iPosition));
            }
            iPosition += this.f21766a.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    public final KR zzi(KR kr2) throws C3620mS {
        int[] iArr = this.f19162h;
        if (iArr == null) {
            return KR.zza;
        }
        if (kr2.zzd != 2) {
            throw new C3620mS("Unhandled input format:", kr2);
        }
        boolean z8 = kr2.zzc != iArr.length;
        int i8 = 0;
        while (true) {
            int length = iArr.length;
            if (i8 >= length) {
                return z8 ? new KR(kr2.zzb, length, 2) : KR.zza;
            }
            int i9 = iArr[i8];
            if (i9 >= kr2.zzc) {
                throw new C3620mS("Unhandled input format:", kr2);
            }
            z8 |= i9 != i8;
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    protected final void zzk() {
        this.f19163i = this.f19162h;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    protected final void zzm() {
        this.f19163i = null;
        this.f19162h = null;
    }

    public final void zzo(int[] iArr) {
        this.f19162h = iArr;
    }
}
