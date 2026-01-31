package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class Q extends Surface {

    /* renamed from: c, reason: collision with root package name */
    private static int f15672c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f15673d;

    /* renamed from: a, reason: collision with root package name */
    private final O f15674a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15675b;
    public final boolean zza;

    /* synthetic */ Q(O o8, SurfaceTexture surfaceTexture, boolean z8, P p8) {
        super(surfaceTexture);
        this.f15674a = o8;
        this.zza = z8;
    }

    public static Q zza(Context context, boolean z8) {
        boolean z9 = true;
        if (z8 && !zzb(context)) {
            z9 = false;
        }
        F10.zzf(z9);
        return new O().zza(z8 ? f15672c : 0);
    }

    public static synchronized boolean zzb(Context context) {
        try {
            if (!f15673d) {
                f15672c = AbstractC4263s60.zzb(context) ? AbstractC4263s60.zzc() ? 1 : 2 : 0;
                f15673d = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15672c != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f15674a) {
            try {
                if (!this.f15675b) {
                    this.f15674a.zzb();
                    this.f15675b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
