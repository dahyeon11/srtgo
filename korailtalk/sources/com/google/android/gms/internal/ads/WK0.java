package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class WK0 extends AbstractC3963pT {

    /* renamed from: h, reason: collision with root package name */
    private static final int f16965h = Float.floatToIntBits(Float.NaN);

    WK0() {
    }

    private static void c(int i8, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i8 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f16965h) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT, com.google.android.gms.internal.ads.NS
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i8 = iLimit - iPosition;
        int i9 = this.f21766a.zzd;
        if (i9 == 21) {
            byteBufferA = a((i8 / 3) * 4);
            while (iPosition < iLimit) {
                c(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferA);
                iPosition += 3;
            }
        } else if (i9 == 22) {
            byteBufferA = a(i8);
            while (iPosition < iLimit) {
                int i10 = byteBuffer.get(iPosition) & 255;
                int i11 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                c(i10 | i11 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferA);
                iPosition += 4;
            }
        } else if (i9 == 1342177280) {
            byteBufferA = a((i8 / 3) * 4);
            while (iPosition < iLimit) {
                c(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferA);
                iPosition += 3;
            }
        } else {
            if (i9 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferA = a(i8);
            while (iPosition < iLimit) {
                int i12 = byteBuffer.get(iPosition + 3) & 255;
                int i13 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                c(i12 | i13 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferA);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    public final KR zzi(KR kr2) throws C3620mS {
        int i8 = kr2.zzd;
        int i9 = AbstractC2281am0.zza;
        if (i8 == 21 || i8 == 1342177280 || i8 == 22 || i8 == 1610612736) {
            return new KR(kr2.zzb, kr2.zzc, 4);
        }
        if (i8 == 4) {
            return KR.zza;
        }
        throw new C3620mS("Unhandled input format:", kr2);
    }
}
