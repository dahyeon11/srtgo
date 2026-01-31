package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.kakao.sdk.user.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.ads.Sb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1868Sb0 implements InterfaceC1827Rb0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f16307a;

    public C1868Sb0(H1.Y1 y12, String str, int i8, String str2, H1.j2 j2Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i8));
        }
        if (hashSet.contains(Constants.BIRTHDAY)) {
            arrayList.add(Long.valueOf(y12.zzb));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(y12.zzc));
        } else if (hashSet.contains("npa")) {
            arrayList.add(y12.zzc.getString("npa"));
        }
        if (hashSet.contains(Constants.GENDER)) {
            arrayList.add(Integer.valueOf(y12.zzd));
        }
        if (hashSet.contains("keywords")) {
            List list = y12.zze;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(y12.zzf));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(y12.zzg));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(y12.zzh));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(y12.zzi);
        }
        if (hashSet.contains(com.kakao.sdk.template.Constants.TYPE_LOCATION)) {
            Location location = y12.zzk;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(y12.zzl);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(y12.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(y12.zzn));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = y12.zzo;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(y12.zzp);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(y12.zzq);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(y12.zzr));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(y12.zzt));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(y12.zzu);
        }
        if (hashSet.contains("orientation")) {
            if (j2Var != null) {
                arrayList.add(Integer.valueOf(j2Var.zza));
            } else {
                arrayList.add(null);
            }
        }
        this.f16307a = arrayList.toArray();
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1827Rb0
    public final boolean equals(Object obj) {
        if (obj instanceof C1868Sb0) {
            return Arrays.equals(this.f16307a, ((C1868Sb0) obj).f16307a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1827Rb0
    public final int hashCode() {
        return Arrays.hashCode(this.f16307a);
    }

    public final String toString() {
        Object[] objArr = this.f16307a;
        return "[PoolKey#" + Arrays.hashCode(objArr) + Q7.X.SPACE + Arrays.toString(objArr) + "]";
    }
}
