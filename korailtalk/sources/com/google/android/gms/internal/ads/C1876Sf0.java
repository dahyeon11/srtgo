package com.google.android.gms.internal.ads;

import I2.AbstractC0608l;
import I2.C0609m;
import I2.InterfaceC0599c;
import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Sf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1876Sf0 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile X8 f16316e = X8.UNKNOWN;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f16317a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f16318b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC0608l f16319c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16320d;

    C1876Sf0(Context context, Executor executor, AbstractC0608l abstractC0608l, boolean z8) {
        this.f16317a = context;
        this.f16318b = executor;
        this.f16319c = abstractC0608l;
        this.f16320d = z8;
    }

    static void a(X8 x8) {
        f16316e = x8;
    }

    private final AbstractC0608l b(final int i8, long j8, Exception exc, String str, Map map, String str2) {
        if (!this.f16320d) {
            return this.f16319c.continueWith(this.f16318b, new InterfaceC0599c() { // from class: com.google.android.gms.internal.ads.Of0
                @Override // I2.InterfaceC0599c
                public final Object then(AbstractC0608l abstractC0608l) {
                    return Boolean.valueOf(abstractC0608l.isSuccessful());
                }
            });
        }
        Context context = this.f16317a;
        final R8 r8Zza = Y8.zza();
        r8Zza.zza(context.getPackageName());
        r8Zza.zzf(j8);
        r8Zza.zze(f16316e);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            r8Zza.zzg(stringWriter.toString());
            r8Zza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            r8Zza.zzb(str2);
        }
        if (str != null) {
            r8Zza.zzc(str);
        }
        return this.f16319c.continueWith(this.f16318b, new InterfaceC0599c() { // from class: com.google.android.gms.internal.ads.Pf0
            @Override // I2.InterfaceC0599c
            public final Object then(AbstractC0608l abstractC0608l) {
                int i9 = C1876Sf0.zza;
                if (!abstractC0608l.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i10 = i8;
                C2165Zg0 c2165Zg0Zza = ((C2271ah0) abstractC0608l.getResult()).zza(((Y8) r8Zza.zzbr()).zzaV());
                c2165Zg0Zza.zza(i10);
                c2165Zg0Zza.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public static C1876Sf0 zza(final Context context, Executor executor, boolean z8) {
        final C0609m c0609m = new C0609m();
        if (z8) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Qf0
                @Override // java.lang.Runnable
                public final void run() {
                    c0609m.setResult(C2271ah0.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Rf0
                @Override // java.lang.Runnable
                public final void run() {
                    c0609m.setResult(C2271ah0.zzc());
                }
            });
        }
        return new C1876Sf0(context, executor, c0609m.getTask(), z8);
    }

    public final AbstractC0608l zzb(int i8, String str) {
        return b(i8, 0L, null, null, null, str);
    }

    public final AbstractC0608l zzc(int i8, long j8, Exception exc) {
        return b(i8, j8, exc, null, null, null);
    }

    public final AbstractC0608l zzd(int i8, long j8) {
        return b(i8, j8, null, null, null, null);
    }

    public final AbstractC0608l zze(int i8, long j8, String str) {
        return b(i8, j8, null, null, null, str);
    }

    public final AbstractC0608l zzf(int i8, long j8, String str, Map map) {
        return b(i8, j8, null, str, null, null);
    }
}
