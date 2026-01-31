package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3908p {

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator f21603g = new Comparator() { // from class: com.google.android.gms.internal.ads.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C3794o) obj).zza - ((C3794o) obj2).zza;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f21604h = new Comparator() { // from class: com.google.android.gms.internal.ads.m
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C3794o) obj).zzc, ((C3794o) obj2).zzc);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private int f21608d;

    /* renamed from: e, reason: collision with root package name */
    private int f21609e;

    /* renamed from: f, reason: collision with root package name */
    private int f21610f;

    /* renamed from: b, reason: collision with root package name */
    private final C3794o[] f21606b = new C3794o[5];

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f21605a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private int f21607c = -1;

    public C3908p(int i8) {
    }

    public final float zza(float f8) {
        if (this.f21607c != 0) {
            Collections.sort(this.f21605a, f21604h);
            this.f21607c = 0;
        }
        float f9 = this.f21609e;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f21605a.size(); i9++) {
            float f10 = 0.5f * f9;
            C3794o c3794o = (C3794o) this.f21605a.get(i9);
            i8 += c3794o.zzb;
            if (i8 >= f10) {
                return c3794o.zzc;
            }
        }
        if (this.f21605a.isEmpty()) {
            return Float.NaN;
        }
        return ((C3794o) this.f21605a.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i8, float f8) {
        C3794o c3794o;
        if (this.f21607c != 1) {
            Collections.sort(this.f21605a, f21603g);
            this.f21607c = 1;
        }
        int i9 = this.f21610f;
        if (i9 > 0) {
            C3794o[] c3794oArr = this.f21606b;
            int i10 = i9 - 1;
            this.f21610f = i10;
            c3794o = c3794oArr[i10];
        } else {
            c3794o = new C3794o(null);
        }
        int i11 = this.f21608d;
        this.f21608d = i11 + 1;
        c3794o.zza = i11;
        c3794o.zzb = i8;
        c3794o.zzc = f8;
        this.f21605a.add(c3794o);
        this.f21609e += i8;
        while (true) {
            int i12 = this.f21609e;
            if (i12 <= 2000) {
                return;
            }
            int i13 = i12 - 2000;
            C3794o c3794o2 = (C3794o) this.f21605a.get(0);
            int i14 = c3794o2.zzb;
            if (i14 <= i13) {
                this.f21609e -= i14;
                this.f21605a.remove(0);
                int i15 = this.f21610f;
                if (i15 < 5) {
                    C3794o[] c3794oArr2 = this.f21606b;
                    this.f21610f = i15 + 1;
                    c3794oArr2[i15] = c3794o2;
                }
            } else {
                c3794o2.zzb = i14 - i13;
                this.f21609e -= i13;
            }
        }
    }

    public final void zzc() {
        this.f21605a.clear();
        this.f21607c = -1;
        this.f21608d = 0;
        this.f21609e = 0;
    }
}
