package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* renamed from: com.google.android.gms.internal.ads.oi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3873oi0 extends AbstractC1473Ii0 {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f21549a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21550b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21551c;

    /* renamed from: d, reason: collision with root package name */
    private final float f21552d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21553e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21554f;

    /* synthetic */ C3873oi0(IBinder iBinder, String str, int i8, float f8, int i9, int i10, String str2, int i11, String str3, String str4, String str5, AbstractC3759ni0 abstractC3759ni0) {
        this.f21549a = iBinder;
        this.f21550b = str;
        this.f21551c = i8;
        this.f21552d = f8;
        this.f21553e = i11;
        this.f21554f = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1473Ii0) {
            AbstractC1473Ii0 abstractC1473Ii0 = (AbstractC1473Ii0) obj;
            if (this.f21549a.equals(abstractC1473Ii0.zzf()) && ((str = this.f21550b) != null ? str.equals(abstractC1473Ii0.zzh()) : abstractC1473Ii0.zzh() == null) && this.f21551c == abstractC1473Ii0.zzc() && Float.floatToIntBits(this.f21552d) == Float.floatToIntBits(abstractC1473Ii0.zza())) {
                abstractC1473Ii0.zzb();
                abstractC1473Ii0.zzd();
                abstractC1473Ii0.zzj();
                if (this.f21553e == abstractC1473Ii0.zze()) {
                    abstractC1473Ii0.zzi();
                    String str2 = this.f21554f;
                    if (str2 != null ? str2.equals(abstractC1473Ii0.zzg()) : abstractC1473Ii0.zzg() == null) {
                        abstractC1473Ii0.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f21549a.hashCode() ^ 1000003;
        String str = this.f21550b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f21551c) * 1000003) ^ Float.floatToIntBits(this.f21552d);
        int i8 = this.f21553e;
        String str2 = this.f21554f;
        return ((((iHashCode2 * 1525764945) ^ i8) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.f21549a.toString() + ", appId=" + this.f21550b + ", layoutGravity=" + this.f21551c + ", layoutVerticalMargin=" + this.f21552d + ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=" + this.f21553e + ", deeplinkUrl=null, adFieldEnifd=" + this.f21554f + ", thirdPartyAuthCallerId=null}";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final float zza() {
        return this.f21552d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final int zzc() {
        return this.f21551c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final int zze() {
        return this.f21553e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final IBinder zzf() {
        return this.f21549a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final String zzg() {
        return this.f21554f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final String zzh() {
        return this.f21550b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1473Ii0
    public final String zzk() {
        return null;
    }
}
