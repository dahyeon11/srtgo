package com.google.android.gms.internal.ads;

import B1.e;
import H1.C0564p1;
import Q7.C0709m;
import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y1.C6515B;

/* renamed from: com.google.android.gms.internal.ads.xo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4909xo implements N1.A {

    /* renamed from: a, reason: collision with root package name */
    private final Date f23791a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23792b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f23793c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23794d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f23795e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23796f;

    /* renamed from: g, reason: collision with root package name */
    private final C1840Ri f23797g;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f23799i;

    /* renamed from: k, reason: collision with root package name */
    private final String f23801k;

    /* renamed from: h, reason: collision with root package name */
    private final List f23798h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final Map f23800j = new HashMap();

    public C4909xo(Date date, int i8, Set set, Location location, boolean z8, int i9, C1840Ri c1840Ri, List list, boolean z9, int i10, String str) {
        this.f23791a = date;
        this.f23792b = i8;
        this.f23793c = set;
        this.f23795e = location;
        this.f23794d = z8;
        this.f23796f = i9;
        this.f23797g = c1840Ri;
        this.f23799i = z9;
        this.f23801k = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if (C0709m.TRUE.equals(strArrSplit[2])) {
                            this.f23800j.put(strArrSplit[1], Boolean.TRUE);
                        } else if (C0709m.FALSE.equals(strArrSplit[2])) {
                            this.f23800j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f23798h.add(str2);
                }
            }
        }
    }

    @Override // N1.A
    public final float getAdVolume() {
        return C0564p1.zzf().zza();
    }

    @Override // N1.A, N1.f
    @Deprecated
    public final Date getBirthday() {
        return this.f23791a;
    }

    @Override // N1.A, N1.f
    @Deprecated
    public final int getGender() {
        return this.f23792b;
    }

    @Override // N1.A, N1.f
    public final Set<String> getKeywords() {
        return this.f23793c;
    }

    @Override // N1.A, N1.f
    public final Location getLocation() {
        return this.f23795e;
    }

    @Override // N1.A
    public final B1.e getNativeAdOptions() {
        e.a aVar = new e.a();
        C1840Ri c1840Ri = this.f23797g;
        if (c1840Ri == null) {
            return aVar.build();
        }
        int i8 = c1840Ri.zza;
        if (i8 == 2) {
            aVar.setAdChoicesPlacement(c1840Ri.zze);
        } else {
            if (i8 != 3) {
                if (i8 == 4) {
                    aVar.setRequestCustomMuteThisAd(c1840Ri.zzg);
                    aVar.setMediaAspectRatio(c1840Ri.zzh);
                }
            }
            H1.R1 r12 = c1840Ri.zzf;
            if (r12 != null) {
                aVar.setVideoOptions(new C6515B(r12));
            }
            aVar.setAdChoicesPlacement(c1840Ri.zze);
        }
        aVar.setReturnUrlsForImageAssets(c1840Ri.zzb);
        aVar.setImageOrientation(c1840Ri.zzc);
        aVar.setRequestMultipleImages(c1840Ri.zzd);
        return aVar.build();
    }

    @Override // N1.A
    public final Q1.d getNativeAdRequestOptions() {
        return C1840Ri.zza(this.f23797g);
    }

    @Override // N1.A
    public final boolean isAdMuted() {
        return C0564p1.zzf().zzw();
    }

    @Override // N1.A, N1.f
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f23799i;
    }

    @Override // N1.A, N1.f
    public final boolean isTesting() {
        return this.f23794d;
    }

    @Override // N1.A
    public final boolean isUnifiedNativeAdRequested() {
        return this.f23798h.contains("6");
    }

    @Override // N1.A, N1.f
    public final int taggedForChildDirectedTreatment() {
        return this.f23796f;
    }

    @Override // N1.A
    public final Map zza() {
        return this.f23800j;
    }

    @Override // N1.A
    public final boolean zzb() {
        return this.f23798h.contains("3");
    }
}
