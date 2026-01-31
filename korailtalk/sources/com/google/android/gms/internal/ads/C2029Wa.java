package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.android.gms.internal.ads.Wa */
/* loaded from: classes2.dex */
public final class C2029Wa {

    /* renamed from: c */
    private static final ConditionVariable f17012c = new ConditionVariable();

    /* renamed from: d */
    protected static volatile C2271ah0 f17013d = null;

    /* renamed from: e */
    private static volatile Random f17014e = null;

    /* renamed from: a */
    private final C1294Eb f17015a;

    /* renamed from: b */
    protected volatile Boolean f17016b;

    public C2029Wa(C1294Eb c1294Eb) {
        this.f17015a = c1294Eb;
        c1294Eb.zzk().execute(new RunnableC1988Va(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (f17014e == null) {
                synchronized (C2029Wa.class) {
                    try {
                        if (f17014e == null) {
                            f17014e = new Random();
                        }
                    } finally {
                    }
                }
            }
            return f17014e.nextInt();
        }
    }

    public final void zzc(int i8, int i9, long j8, String str, Exception exc) {
        try {
            f17012c.block();
            if (!this.f17016b.booleanValue() || f17013d == null) {
                return;
            }
            R8 r8Zza = Y8.zza();
            r8Zza.zza(this.f17015a.f12813a.getPackageName());
            r8Zza.zzf(j8);
            if (str != null) {
                r8Zza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                r8Zza.zzg(stringWriter.toString());
                r8Zza.zzd(exc.getClass().getName());
            }
            C2165Zg0 c2165Zg0Zza = f17013d.zza(((Y8) r8Zza.zzbr()).zzaV());
            c2165Zg0Zza.zza(i8);
            if (i9 != -1) {
                c2165Zg0Zza.zzb(i9);
            }
            c2165Zg0Zza.zzc();
        } catch (Exception unused) {
        }
    }
}
