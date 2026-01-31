package com.google.android.gms.internal.ads;

import android.app.Activity;

/* renamed from: com.google.android.gms.internal.ads.lW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3510lW extends IW {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f20678a;

    /* renamed from: b, reason: collision with root package name */
    private final J1.u f20679b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20680c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20681d;

    /* synthetic */ C3510lW(Activity activity, J1.u uVar, String str, String str2, AbstractC3396kW abstractC3396kW) {
        this.f20678a = activity;
        this.f20679b = uVar;
        this.f20680c = str;
        this.f20681d = str2;
    }

    public final boolean equals(Object obj) {
        J1.u uVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IW) {
            IW iw = (IW) obj;
            if (this.f20678a.equals(iw.zza()) && ((uVar = this.f20679b) != null ? uVar.equals(iw.zzb()) : iw.zzb() == null) && ((str = this.f20680c) != null ? str.equals(iw.zzc()) : iw.zzc() == null) && ((str2 = this.f20681d) != null ? str2.equals(iw.zzd()) : iw.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f20678a.hashCode() ^ 1000003;
        J1.u uVar = this.f20679b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (uVar == null ? 0 : uVar.hashCode())) * 1000003;
        String str = this.f20680c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f20681d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        J1.u uVar = this.f20679b;
        return "OfflineUtilsParams{activity=" + this.f20678a.toString() + ", adOverlay=" + String.valueOf(uVar) + ", gwsQueryId=" + this.f20680c + ", uri=" + this.f20681d + "}";
    }

    @Override // com.google.android.gms.internal.ads.IW
    public final Activity zza() {
        return this.f20678a;
    }

    @Override // com.google.android.gms.internal.ads.IW
    public final J1.u zzb() {
        return this.f20679b;
    }

    @Override // com.google.android.gms.internal.ads.IW
    public final String zzc() {
        return this.f20680c;
    }

    @Override // com.google.android.gms.internal.ads.IW
    public final String zzd() {
        return this.f20681d;
    }
}
