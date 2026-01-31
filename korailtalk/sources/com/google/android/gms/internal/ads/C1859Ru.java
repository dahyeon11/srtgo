package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Ru, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1859Ru {

    /* renamed from: a, reason: collision with root package name */
    private long f16157a;

    public final long zza(ByteBuffer byteBuffer) {
        O8 o8;
        N8 n8;
        long j8 = this.f16157a;
        if (j8 > 0) {
            return j8;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new J8(new C1777Pu(byteBufferDuplicate), C1941Tu.f16540c).zze().iterator();
            while (true) {
                o8 = null;
                if (!it.hasNext()) {
                    n8 = null;
                    break;
                }
                L8 l8 = (L8) it.next();
                if (l8 instanceof N8) {
                    n8 = (N8) l8;
                    break;
                }
            }
            Iterator it2 = n8.zze().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                L8 l82 = (L8) it2.next();
                if (l82 instanceof O8) {
                    o8 = (O8) l82;
                    break;
                }
            }
            long jZzd = (o8.zzd() * 1000) / o8.zze();
            this.f16157a = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
