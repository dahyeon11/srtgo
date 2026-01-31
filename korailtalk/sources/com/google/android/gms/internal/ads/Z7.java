package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class Z7 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final C3128i8 f17500a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17501b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17502c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17503d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f17504e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2325b8 f17505f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f17506g;

    /* renamed from: h, reason: collision with root package name */
    private C2210a8 f17507h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17508i;

    /* renamed from: j, reason: collision with root package name */
    private H7 f17509j;

    /* renamed from: k, reason: collision with root package name */
    private Y7 f17510k;

    /* renamed from: l, reason: collision with root package name */
    private final M7 f17511l;

    public Z7(int i8, String str, InterfaceC2325b8 interfaceC2325b8) {
        Uri uri;
        String host;
        this.f17500a = C3128i8.zza ? new C3128i8() : null;
        this.f17504e = new Object();
        int iHashCode = 0;
        this.f17508i = false;
        this.f17509j = null;
        this.f17501b = i8;
        this.f17502c = str;
        this.f17505f = interfaceC2325b8;
        this.f17511l = new M7();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f17503d = iHashCode;
    }

    protected abstract C2554d8 a(V7 v72);

    protected abstract void c(Object obj);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f17506g.intValue() - ((Z7) obj).f17506g.intValue();
    }

    final void d(String str) {
        C2210a8 c2210a8 = this.f17507h;
        if (c2210a8 != null) {
            c2210a8.a(this);
        }
        if (C3128i8.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new X7(this, str, id));
            } else {
                this.f17500a.zza(str, id);
                this.f17500a.zzb(toString());
            }
        }
    }

    final void e() {
        Y7 y72;
        synchronized (this.f17504e) {
            y72 = this.f17510k;
        }
        if (y72 != null) {
            y72.zza(this);
        }
    }

    final void f(C2554d8 c2554d8) {
        Y7 y72;
        synchronized (this.f17504e) {
            y72 = this.f17510k;
        }
        if (y72 != null) {
            y72.zzb(this, c2554d8);
        }
    }

    final void g(int i8) {
        C2210a8 c2210a8 = this.f17507h;
        if (c2210a8 != null) {
            c2210a8.b(this, i8);
        }
    }

    final void h(Y7 y72) {
        synchronized (this.f17504e) {
            this.f17510k = y72;
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f17503d));
        zzw();
        return "[ ] " + this.f17502c + Q7.X.SPACE + "0x".concat(strValueOf) + " NORMAL " + this.f17506g;
    }

    public final int zza() {
        return this.f17501b;
    }

    public final int zzb() {
        return this.f17511l.zzb();
    }

    public final int zzc() {
        return this.f17503d;
    }

    public final H7 zzd() {
        return this.f17509j;
    }

    public final Z7 zze(H7 h72) {
        this.f17509j = h72;
        return this;
    }

    public final Z7 zzf(C2210a8 c2210a8) {
        this.f17507h = c2210a8;
        return this;
    }

    public final Z7 zzg(int i8) {
        this.f17506g = Integer.valueOf(i8);
        return this;
    }

    public final String zzj() {
        int i8 = this.f17501b;
        String str = this.f17502c;
        if (i8 == 0) {
            return str;
        }
        return Integer.toString(1) + g5.e.STATE_NAME_NONE + str;
    }

    public final String zzk() {
        return this.f17502c;
    }

    public Map zzl() {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (C3128i8.zza) {
            this.f17500a.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(C2898g8 c2898g8) {
        InterfaceC2325b8 interfaceC2325b8;
        synchronized (this.f17504e) {
            interfaceC2325b8 = this.f17505f;
        }
        interfaceC2325b8.zza(c2898g8);
    }

    public final void zzq() {
        synchronized (this.f17504e) {
            this.f17508i = true;
        }
    }

    public final boolean zzv() {
        boolean z8;
        synchronized (this.f17504e) {
            z8 = this.f17508i;
        }
        return z8;
    }

    public final boolean zzw() {
        synchronized (this.f17504e) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final M7 zzy() {
        return this.f17511l;
    }
}
