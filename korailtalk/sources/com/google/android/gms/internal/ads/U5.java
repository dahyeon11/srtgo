package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class U5 {

    /* renamed from: f, reason: collision with root package name */
    private int f16583f;

    /* renamed from: h, reason: collision with root package name */
    private int f16585h;

    /* renamed from: n, reason: collision with root package name */
    private float f16591n;

    /* renamed from: a, reason: collision with root package name */
    private String f16578a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f16579b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set f16580c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private String f16581d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f16582e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16584g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16586i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f16587j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f16588k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f16589l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f16590m = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f16592o = -1;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16593p = false;

    private static int a(int i8, String str, String str2, int i9) {
        if (str.isEmpty() || i8 == -1) {
            return i8;
        }
        if (str.equals(str2)) {
            return i8 + i9;
        }
        return -1;
    }

    public final float zza() {
        return this.f16591n;
    }

    public final int zzb() {
        if (this.f16586i) {
            return this.f16585h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final int zzc() {
        if (this.f16584g) {
            return this.f16583f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final int zzd() {
        return this.f16590m;
    }

    public final int zze() {
        return this.f16592o;
    }

    public final int zzf(String str, String str2, Set set, String str3) {
        if (this.f16578a.isEmpty() && this.f16579b.isEmpty() && this.f16580c.isEmpty() && this.f16581d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f16578a, str, 1073741824), this.f16579b, str2, 2), this.f16581d, str3, 4);
        if (iA == -1 || !set.containsAll(this.f16580c)) {
            return 0;
        }
        return iA + (this.f16580c.size() * 4);
    }

    public final int zzg() {
        int i8 = this.f16588k;
        if (i8 == -1 && this.f16589l == -1) {
            return -1;
        }
        return (i8 == 1 ? 1 : 0) | (this.f16589l == 1 ? 2 : 0);
    }

    public final U5 zzh(int i8) {
        this.f16585h = i8;
        this.f16586i = true;
        return this;
    }

    public final U5 zzi(boolean z8) {
        this.f16588k = 1;
        return this;
    }

    public final U5 zzj(boolean z8) {
        this.f16593p = z8;
        return this;
    }

    public final U5 zzk(int i8) {
        this.f16583f = i8;
        this.f16584g = true;
        return this;
    }

    public final U5 zzl(String str) {
        this.f16582e = AbstractC2963gj0.zza(str);
        return this;
    }

    public final U5 zzm(float f8) {
        this.f16591n = f8;
        return this;
    }

    public final U5 zzn(int i8) {
        this.f16590m = i8;
        return this;
    }

    public final U5 zzo(boolean z8) {
        this.f16589l = 1;
        return this;
    }

    public final U5 zzp(int i8) {
        this.f16592o = i8;
        return this;
    }

    public final U5 zzq(boolean z8) {
        this.f16587j = 1;
        return this;
    }

    public final String zzr() {
        return this.f16582e;
    }

    public final void zzs(String[] strArr) {
        this.f16580c = new HashSet(Arrays.asList(strArr));
    }

    public final void zzt(String str) {
        this.f16578a = str;
    }

    public final void zzu(String str) {
        this.f16579b = str;
    }

    public final void zzv(String str) {
        this.f16581d = str;
    }

    public final boolean zzw() {
        return this.f16593p;
    }

    public final boolean zzx() {
        return this.f16586i;
    }

    public final boolean zzy() {
        return this.f16584g;
    }

    public final boolean zzz() {
        return this.f16587j == 1;
    }
}
