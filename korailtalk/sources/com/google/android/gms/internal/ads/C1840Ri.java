package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Ri, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1840Ri extends AbstractC5814a {
    public static final Parcelable.Creator<C1840Ri> CREATOR = new C1881Si();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final H1.R1 zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public C1840Ri(int i8, boolean z8, int i9, boolean z9, int i10, H1.R1 r12, boolean z10, int i11, int i12, boolean z11, int i13) {
        this.zza = i8;
        this.zzb = z8;
        this.zzc = i9;
        this.zzd = z9;
        this.zze = i10;
        this.zzf = r12;
        this.zzg = z10;
        this.zzh = i11;
        this.zzj = z11;
        this.zzi = i12;
        this.zzk = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Q1.d zza(com.google.android.gms.internal.ads.C1840Ri r5) {
        /*
            Q1.d$a r0 = new Q1.d$a
            r0.<init>()
            if (r5 != 0) goto Lc
            Q1.d r5 = r0.build()
            return r5
        Lc:
            int r1 = r5.zza
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.zzg
            r0.setRequestCustomMuteThisAd(r1)
            int r1 = r5.zzh
            r0.setMediaAspectRatio(r1)
            int r1 = r5.zzi
            boolean r4 = r5.zzj
            r0.enableCustomClickGestureDirection(r1, r4)
            int r1 = r5.zzk
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.zzi(r2)
        L39:
            H1.R1 r1 = r5.zzf
            if (r1 == 0) goto L45
            y1.B r2 = new y1.B
            r2.<init>(r1)
            r0.setVideoOptions(r2)
        L45:
            int r1 = r5.zze
            r0.setAdChoicesPlacement(r1)
        L4a:
            boolean r1 = r5.zzb
            r0.setReturnUrlsForImageAssets(r1)
            boolean r5 = r5.zzd
            r0.setRequestMultipleImages(r5)
            Q1.d r5 = r0.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1840Ri.zza(com.google.android.gms.internal.ads.Ri):Q1.d");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeBoolean(parcel, 2, this.zzb);
        AbstractC5816c.writeInt(parcel, 3, this.zzc);
        AbstractC5816c.writeBoolean(parcel, 4, this.zzd);
        AbstractC5816c.writeInt(parcel, 5, this.zze);
        AbstractC5816c.writeParcelable(parcel, 6, this.zzf, i8, false);
        AbstractC5816c.writeBoolean(parcel, 7, this.zzg);
        AbstractC5816c.writeInt(parcel, 8, this.zzh);
        AbstractC5816c.writeInt(parcel, 9, this.zzi);
        AbstractC5816c.writeBoolean(parcel, 10, this.zzj);
        AbstractC5816c.writeInt(parcel, 11, this.zzk);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Deprecated
    public C1840Ri(B1.e eVar) {
        this(4, eVar.shouldReturnUrlsForImageAssets(), eVar.getImageOrientation(), eVar.shouldRequestMultipleImages(), eVar.getAdChoicesPlacement(), eVar.getVideoOptions() != null ? new H1.R1(eVar.getVideoOptions()) : null, eVar.zza(), eVar.getMediaAspectRatio(), 0, false, 0);
    }
}
