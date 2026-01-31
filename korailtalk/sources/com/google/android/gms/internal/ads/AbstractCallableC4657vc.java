package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.vc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractCallableC4657vc implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f23261a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    protected final C1294Eb f23262b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f23263c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f23264d;

    /* renamed from: e, reason: collision with root package name */
    protected final C3357k9 f23265e;

    /* renamed from: f, reason: collision with root package name */
    protected Method f23266f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f23267g;

    /* renamed from: h, reason: collision with root package name */
    protected final int f23268h;

    public AbstractCallableC4657vc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        this.f23262b = c1294Eb;
        this.f23263c = str;
        this.f23264d = str2;
        this.f23265e = c3357k9;
        this.f23267g = i8;
        this.f23268h = i9;
    }

    protected abstract void a();

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        zzl();
        return null;
    }

    public Void zzl() {
        int i8;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzj = this.f23262b.zzj(this.f23263c, this.f23264d);
            this.f23266f = methodZzj;
            if (methodZzj == null) {
                return null;
            }
            a();
            C2029Wa c2029WaZzd = this.f23262b.zzd();
            if (c2029WaZzd == null || (i8 = this.f23267g) == Integer.MIN_VALUE) {
                return null;
            }
            c2029WaZzd.zzc(this.f23268h, i8, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
