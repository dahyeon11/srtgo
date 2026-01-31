package com.google.android.gms.internal.ads;

import android.os.IBinder;
import e3.AbstractC5358c;

/* renamed from: com.google.android.gms.internal.ads.mi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3645mi0 extends AbstractC1432Hi0 {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f20969a;

    /* renamed from: b, reason: collision with root package name */
    private String f20970b;

    /* renamed from: c, reason: collision with root package name */
    private int f20971c;

    /* renamed from: d, reason: collision with root package name */
    private float f20972d;

    /* renamed from: e, reason: collision with root package name */
    private int f20973e;

    /* renamed from: f, reason: collision with root package name */
    private String f20974f;

    /* renamed from: g, reason: collision with root package name */
    private byte f20975g;

    C3645mi0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1432Hi0
    public final AbstractC1432Hi0 zza(String str) {
        this.f20974f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1432Hi0
    public final AbstractC1432Hi0 zzb(String str) {
        this.f20970b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1432Hi0
    public final AbstractC1432Hi0 zzc(int i8) {
        this.f20975g = (byte) (this.f20975g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1432Hi0
    public final AbstractC1432Hi0 zzd(int i8) {
        this.f20971c = i8;
        this.f20975g = (byte) (this.f20975g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1432Hi0
    public final AbstractC1432Hi0 zze(float f8) {
        this.f20972d = f8;
        this.f20975g = (byte) (this.f20975g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1432Hi0
    public final AbstractC1432Hi0 zzf(int i8) {
        this.f20975g = (byte) (this.f20975g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1432Hi0
    public final AbstractC1432Hi0 zzg(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.f20969a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1432Hi0
    public final AbstractC1432Hi0 zzh(int i8) {
        this.f20973e = i8;
        this.f20975g = (byte) (this.f20975g | AbstractC5358c.DLE);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1432Hi0
    public final AbstractC1473Ii0 zzi() {
        IBinder iBinder;
        if (this.f20975g == 31 && (iBinder = this.f20969a) != null) {
            return new C3873oi0(iBinder, this.f20970b, this.f20971c, this.f20972d, 0, 0, null, this.f20973e, null, this.f20974f, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f20969a == null) {
            sb.append(" windowToken");
        }
        if ((this.f20975g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f20975g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f20975g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f20975g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f20975g & AbstractC5358c.DLE) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
