package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Mi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1635Mi extends AbstractBinderC1963Ui {

    /* renamed from: i, reason: collision with root package name */
    private static final int f14685i;

    /* renamed from: j, reason: collision with root package name */
    static final int f14686j;

    /* renamed from: k, reason: collision with root package name */
    static final int f14687k;

    /* renamed from: a, reason: collision with root package name */
    private final String f14688a;

    /* renamed from: b, reason: collision with root package name */
    private final List f14689b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f14690c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final int f14691d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14692e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14693f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14694g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14695h;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f14685i = iRgb;
        f14686j = Color.rgb(204, 204, 204);
        f14687k = iRgb;
    }

    public BinderC1635Mi(String str, List list, Integer num, Integer num2, Integer num3, int i8, int i9, boolean z8) {
        this.f14688a = str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            BinderC1758Pi binderC1758Pi = (BinderC1758Pi) list.get(i10);
            this.f14689b.add(binderC1758Pi);
            this.f14690c.add(binderC1758Pi);
        }
        this.f14691d = num != null ? num.intValue() : f14686j;
        this.f14692e = num2 != null ? num2.intValue() : f14687k;
        this.f14693f = num3 != null ? num3.intValue() : 12;
        this.f14694g = i8;
        this.f14695h = i9;
    }

    public final int zzb() {
        return this.f14694g;
    }

    public final int zzc() {
        return this.f14695h;
    }

    public final int zzd() {
        return this.f14691d;
    }

    public final int zze() {
        return this.f14692e;
    }

    public final int zzf() {
        return this.f14693f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1963Ui, com.google.android.gms.internal.ads.InterfaceC2004Vi
    public final String zzg() {
        return this.f14688a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1963Ui, com.google.android.gms.internal.ads.InterfaceC2004Vi
    public final List zzh() {
        return this.f14690c;
    }

    public final List zzi() {
        return this.f14689b;
    }
}
