package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4543uc {

    /* renamed from: a, reason: collision with root package name */
    private final C1294Eb f23079a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23080b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23081c;

    /* renamed from: e, reason: collision with root package name */
    private final Class[] f23083e;

    /* renamed from: d, reason: collision with root package name */
    private volatile Method f23082d = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f23084f = new CountDownLatch(1);

    public C4543uc(C1294Eb c1294Eb, String str, String str2, Class... clsArr) {
        this.f23079a = c1294Eb;
        this.f23080b = str;
        this.f23081c = str2;
        this.f23083e = clsArr;
        c1294Eb.zzk().submit(new RunnableC4429tc(this));
    }

    static /* bridge */ /* synthetic */ void a(C4543uc c4543uc) {
        try {
            C1294Eb c1294Eb = c4543uc.f23079a;
            Class<?> clsLoadClass = c1294Eb.zzi().loadClass(c4543uc.b(c1294Eb.zzu(), c4543uc.f23080b));
            if (clsLoadClass != null) {
                c4543uc.f23082d = clsLoadClass.getMethod(c4543uc.b(c4543uc.f23079a.zzu(), c4543uc.f23081c), c4543uc.f23083e);
            }
        } catch (C3061hb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            c4543uc.f23084f.countDown();
            throw th;
        }
        c4543uc.f23084f.countDown();
    }

    private final String b(byte[] bArr, String str) {
        return new String(this.f23079a.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.f23082d != null) {
            return this.f23082d;
        }
        try {
            if (this.f23084f.await(2L, TimeUnit.SECONDS)) {
                return this.f23082d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
