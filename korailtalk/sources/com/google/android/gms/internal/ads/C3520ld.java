package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.ld */
/* loaded from: classes2.dex */
public final class C3520ld {

    /* renamed from: a */
    private final int f20688a;

    /* renamed from: b */
    private final int f20689b;

    /* renamed from: c */
    private final int f20690c;

    /* renamed from: d */
    private final boolean f20691d;

    /* renamed from: e */
    private final C1134Ad f20692e;

    /* renamed from: f */
    private final C1421Hd f20693f;

    /* renamed from: n */
    private int f20701n;

    /* renamed from: g */
    private final Object f20694g = new Object();

    /* renamed from: h */
    private final ArrayList f20695h = new ArrayList();

    /* renamed from: i */
    private final ArrayList f20696i = new ArrayList();

    /* renamed from: j */
    private final ArrayList f20697j = new ArrayList();

    /* renamed from: k */
    private int f20698k = 0;

    /* renamed from: l */
    private int f20699l = 0;

    /* renamed from: m */
    private int f20700m = 0;

    /* renamed from: o */
    private String f20702o = "";

    /* renamed from: p */
    private String f20703p = "";

    /* renamed from: q */
    private String f20704q = "";

    public C3520ld(int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z8) {
        this.f20688a = i8;
        this.f20689b = i9;
        this.f20690c = i10;
        this.f20691d = z8;
        this.f20692e = new C1134Ad(i11);
        this.f20693f = new C1421Hd(i12, i13, i14);
    }

    private final void c(String str, boolean z8, float f8, float f9, float f10, float f11) {
        if (str != null) {
            if (str.length() < this.f20690c) {
                return;
            }
            synchronized (this.f20694g) {
                try {
                    this.f20695h.add(str);
                    this.f20698k += str.length();
                    if (z8) {
                        this.f20696i.add(str);
                        this.f20697j.add(new C4773wd(f8, f9, f10, f11, this.f20696i.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String d(ArrayList arrayList, int i8) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            sb.append((String) arrayList.get(i9));
            sb.append(' ');
            i9++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    final int a(int i8, int i9) {
        return this.f20691d ? this.f20689b : (i8 * this.f20688a) + (i9 * this.f20689b);
    }

    final int b() {
        return this.f20698k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3520ld)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C3520ld) obj).f20702o;
        return str != null && str.equals(this.f20702o);
    }

    public final int hashCode() {
        return this.f20702o.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.f20695h;
        return "ActivityContent fetchId: " + this.f20699l + " score:" + this.f20701n + " total_length:" + this.f20698k + "\n text: " + d(arrayList, 100) + "\n viewableText" + d(this.f20696i, 100) + "\n signture: " + this.f20702o + "\n viewableSignture: " + this.f20703p + "\n viewableSignatureForVertical: " + this.f20704q;
    }

    public final int zzb() {
        return this.f20701n;
    }

    public final String zzd() {
        return this.f20702o;
    }

    public final String zze() {
        return this.f20703p;
    }

    public final String zzf() {
        return this.f20704q;
    }

    public final void zzg() {
        synchronized (this.f20694g) {
            this.f20700m--;
        }
    }

    public final void zzh() {
        synchronized (this.f20694g) {
            this.f20700m++;
        }
    }

    public final void zzi() {
        synchronized (this.f20694g) {
            this.f20701n -= 100;
        }
    }

    public final void zzj(int i8) {
        this.f20699l = i8;
    }

    public final void zzk(String str, boolean z8, float f8, float f9, float f10, float f11) {
        c(str, z8, f8, f9, f10, f11);
    }

    public final void zzl(String str, boolean z8, float f8, float f9, float f10, float f11) {
        c(str, z8, f8, f9, f10, f11);
        synchronized (this.f20694g) {
            try {
                if (this.f20700m < 0) {
                    L1.n.zze("ActivityContent: negative number of WebViews.");
                }
                zzm();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzm() {
        synchronized (this.f20694g) {
            try {
                int iA = a(this.f20698k, this.f20699l);
                if (iA > this.f20701n) {
                    this.f20701n = iA;
                    if (!G1.u.zzo().zzi().zzP()) {
                        this.f20702o = this.f20692e.zza(this.f20695h);
                        this.f20703p = this.f20692e.zza(this.f20696i);
                    }
                    if (!G1.u.zzo().zzi().zzQ()) {
                        this.f20704q = this.f20693f.zza(this.f20696i, this.f20697j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzn() {
        synchronized (this.f20694g) {
            try {
                int iA = a(this.f20698k, this.f20699l);
                if (iA > this.f20701n) {
                    this.f20701n = iA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzo() {
        boolean z8;
        synchronized (this.f20694g) {
            z8 = this.f20700m == 0;
        }
        return z8;
    }
}
