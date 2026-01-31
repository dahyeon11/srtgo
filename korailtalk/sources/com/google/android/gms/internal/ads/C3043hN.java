package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.hN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3043hN {

    /* renamed from: a, reason: collision with root package name */
    private final K1.T f19790a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.f f19791b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f19792c;

    public C3043hN(K1.T t8, o2.f fVar, Executor executor) {
        this.f19790a = t8;
        this.f19791b = fVar;
        this.f19792c = executor;
    }

    private final Bitmap b(byte[] bArr, BitmapFactory.Options options) {
        long jElapsedRealtime = this.f19791b.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = this.f19791b.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j8 = jElapsedRealtime2 - jElapsedRealtime;
            AbstractC0667v0.zza("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j8 + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }

    final /* synthetic */ Bitmap a(double d9, boolean z8, V7 v72) {
        byte[] bArr = v72.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d9 * 160.0d);
        if (!z8) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgp)).booleanValue()) {
            options.inJustDecodeBounds = true;
            b(bArr, options);
            options.inJustDecodeBounds = false;
            int i8 = options.outWidth * options.outHeight;
            if (i8 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i8 - 1) / ((Integer) H1.C.zzc().zza(AbstractC4439th.zzgq)).intValue())) / 2);
            }
        }
        return b(bArr, options);
    }

    public final com.google.common.util.concurrent.C zzb(String str, final double d9, final boolean z8) {
        return AbstractC1483In0.zzm(this.f19790a.zza(str), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.gN
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return this.zza.a(d9, z8, (V7) obj);
            }
        }, this.f19792c);
    }
}
