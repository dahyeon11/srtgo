package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes2.dex */
final class O5 {

    /* renamed from: a, reason: collision with root package name */
    private String f15024a;

    /* renamed from: b, reason: collision with root package name */
    private int f15025b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15026c;

    /* renamed from: d, reason: collision with root package name */
    private int f15027d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15028e;

    /* renamed from: k, reason: collision with root package name */
    private float f15034k;

    /* renamed from: l, reason: collision with root package name */
    private String f15035l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f15038o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f15039p;

    /* renamed from: r, reason: collision with root package name */
    private H5 f15041r;

    /* renamed from: f, reason: collision with root package name */
    private int f15029f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f15030g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f15031h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f15032i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f15033j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f15036m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f15037n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f15040q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f15042s = Float.MAX_VALUE;

    public final O5 zzA(boolean z8) {
        this.f15040q = z8 ? 1 : 0;
        return this;
    }

    public final O5 zzB(H5 h52) {
        this.f15041r = h52;
        return this;
    }

    public final O5 zzC(boolean z8) {
        this.f15030g = z8 ? 1 : 0;
        return this;
    }

    public final String zzD() {
        return this.f15024a;
    }

    public final String zzE() {
        return this.f15035l;
    }

    public final boolean zzF() {
        return this.f15040q == 1;
    }

    public final boolean zzG() {
        return this.f15028e;
    }

    public final boolean zzH() {
        return this.f15026c;
    }

    public final boolean zzI() {
        return this.f15029f == 1;
    }

    public final boolean zzJ() {
        return this.f15030g == 1;
    }

    public final float zza() {
        return this.f15034k;
    }

    public final float zzb() {
        return this.f15042s;
    }

    public final int zzc() {
        if (this.f15028e) {
            return this.f15027d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int zzd() {
        if (this.f15026c) {
            return this.f15025b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int zze() {
        return this.f15033j;
    }

    public final int zzf() {
        return this.f15037n;
    }

    public final int zzg() {
        return this.f15036m;
    }

    public final int zzh() {
        int i8 = this.f15031h;
        if (i8 == -1 && this.f15032i == -1) {
            return -1;
        }
        return (i8 == 1 ? 1 : 0) | (this.f15032i == 1 ? 2 : 0);
    }

    public final Layout.Alignment zzi() {
        return this.f15039p;
    }

    public final Layout.Alignment zzj() {
        return this.f15038o;
    }

    public final H5 zzk() {
        return this.f15041r;
    }

    public final O5 zzl(O5 o52) {
        int i8;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (o52 != null) {
            if (!this.f15026c && o52.f15026c) {
                zzo(o52.f15025b);
            }
            if (this.f15031h == -1) {
                this.f15031h = o52.f15031h;
            }
            if (this.f15032i == -1) {
                this.f15032i = o52.f15032i;
            }
            if (this.f15024a == null && (str = o52.f15024a) != null) {
                this.f15024a = str;
            }
            if (this.f15029f == -1) {
                this.f15029f = o52.f15029f;
            }
            if (this.f15030g == -1) {
                this.f15030g = o52.f15030g;
            }
            if (this.f15037n == -1) {
                this.f15037n = o52.f15037n;
            }
            if (this.f15038o == null && (alignment2 = o52.f15038o) != null) {
                this.f15038o = alignment2;
            }
            if (this.f15039p == null && (alignment = o52.f15039p) != null) {
                this.f15039p = alignment;
            }
            if (this.f15040q == -1) {
                this.f15040q = o52.f15040q;
            }
            if (this.f15033j == -1) {
                this.f15033j = o52.f15033j;
                this.f15034k = o52.f15034k;
            }
            if (this.f15041r == null) {
                this.f15041r = o52.f15041r;
            }
            if (this.f15042s == Float.MAX_VALUE) {
                this.f15042s = o52.f15042s;
            }
            if (!this.f15028e && o52.f15028e) {
                zzm(o52.f15027d);
            }
            if (this.f15036m == -1 && (i8 = o52.f15036m) != -1) {
                this.f15036m = i8;
            }
        }
        return this;
    }

    public final O5 zzm(int i8) {
        this.f15027d = i8;
        this.f15028e = true;
        return this;
    }

    public final O5 zzn(boolean z8) {
        this.f15031h = z8 ? 1 : 0;
        return this;
    }

    public final O5 zzo(int i8) {
        this.f15025b = i8;
        this.f15026c = true;
        return this;
    }

    public final O5 zzp(String str) {
        this.f15024a = str;
        return this;
    }

    public final O5 zzq(float f8) {
        this.f15034k = f8;
        return this;
    }

    public final O5 zzr(int i8) {
        this.f15033j = i8;
        return this;
    }

    public final O5 zzs(String str) {
        this.f15035l = str;
        return this;
    }

    public final O5 zzt(boolean z8) {
        this.f15032i = z8 ? 1 : 0;
        return this;
    }

    public final O5 zzu(boolean z8) {
        this.f15029f = z8 ? 1 : 0;
        return this;
    }

    public final O5 zzv(Layout.Alignment alignment) {
        this.f15039p = alignment;
        return this;
    }

    public final O5 zzw(int i8) {
        this.f15037n = i8;
        return this;
    }

    public final O5 zzx(int i8) {
        this.f15036m = i8;
        return this;
    }

    public final O5 zzy(float f8) {
        this.f15042s = f8;
        return this;
    }

    public final O5 zzz(Layout.Alignment alignment) {
        this.f15038o = alignment;
        return this;
    }
}
