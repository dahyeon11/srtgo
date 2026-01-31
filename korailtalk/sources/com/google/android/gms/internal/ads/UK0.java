package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes2.dex */
public final class UK0 {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f16647d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, AbstractC5358c.FS, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f16648e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, AbstractC5358c.VT, -103, 87, 83, 1, AbstractC5358c.DLE, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    private ByteBuffer f16649a = NS.zza;

    /* renamed from: c, reason: collision with root package name */
    private int f16651c = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f16650b = 2;

    private static final void a(ByteBuffer byteBuffer, long j8, int i8, int i9, boolean z8) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z8 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j8);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i8);
        byteBuffer.putInt(0);
        byteBuffer.put(AbstractC1317Em0.zza(i9));
    }

    public final void zza(BE0 be0, List list) {
        int length;
        ByteBuffer byteBuffer = be0.zzc;
        byteBuffer.getClass();
        if (byteBuffer.limit() - be0.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f16650b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = be0.zzc;
        int iPosition = byteBuffer2.position();
        int iLimit = byteBuffer2.limit();
        int i8 = iLimit - iPosition;
        int i9 = (i8 + 255) / 255;
        int i10 = i9 + 27 + i8;
        if (this.f16650b == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i10 += length + 44;
        } else {
            length = 0;
        }
        if (this.f16649a.capacity() < i10) {
            this.f16649a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f16649a.clear();
        }
        ByteBuffer byteBuffer3 = this.f16649a;
        if (this.f16650b == 2) {
            if (bArr != null) {
                a(byteBuffer3, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer3.put(AbstractC1317Em0.zza(length2));
                byteBuffer3.put(bArr);
                int i11 = length2 + 28;
                byteBuffer3.putInt(22, AbstractC2281am0.zze(byteBuffer3.array(), byteBuffer3.arrayOffset(), i11, 0));
                byteBuffer3.position(i11);
            } else {
                byteBuffer3.put(f16647d);
            }
            byteBuffer3.put(f16648e);
        }
        int iZzc = this.f16651c + AbstractC4936y1.zzc(byteBuffer2);
        this.f16651c = iZzc;
        a(byteBuffer3, iZzc, this.f16650b, i9, false);
        for (int i12 = 0; i12 < i9; i12++) {
            if (i8 >= 255) {
                byteBuffer3.put((byte) -1);
                i8 -= 255;
            } else {
                byteBuffer3.put((byte) i8);
                i8 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer3.put(byteBuffer2.get(iPosition));
            iPosition++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.f16650b == 2) {
            byteBuffer3.putInt(length + 66, AbstractC2281am0.zze(byteBuffer3.array(), byteBuffer3.arrayOffset() + length + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, AbstractC2281am0.zze(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.f16650b++;
        this.f16649a = byteBuffer3;
        be0.zzb();
        be0.zzi(this.f16649a.remaining());
        be0.zzc.put(this.f16649a);
        be0.zzj();
    }

    public final void zzb() {
        this.f16649a = NS.zza;
        this.f16651c = 0;
        this.f16650b = 2;
    }
}
