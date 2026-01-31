package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.g6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2894g6 implements InterfaceC2777f5 {

    /* renamed from: a, reason: collision with root package name */
    private final List f19298a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f19299b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f19300c;

    public C2894g6(List list) {
        this.f19298a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.f19299b = new long[size + size];
        for (int i8 = 0; i8 < list.size(); i8++) {
            V5 v52 = (V5) list.get(i8);
            long[] jArr = this.f19299b;
            int i9 = i8 + i8;
            jArr[i9] = v52.zzb;
            jArr[i9 + 1] = v52.zzc;
        }
        long[] jArr2 = this.f19299b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f19300c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2777f5
    public final int zza() {
        return this.f19300c.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2777f5
    public final long zzb(int i8) {
        F10.zzd(i8 >= 0);
        F10.zzd(i8 < this.f19300c.length);
        return this.f19300c[i8];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2777f5
    public final List zzc(long j8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < this.f19298a.size(); i8++) {
            long[] jArr = this.f19299b;
            int i9 = i8 + i8;
            if (jArr[i9] <= j8 && j8 < jArr[i9 + 1]) {
                V5 v52 = (V5) this.f19298a.get(i8);
                C4878xX c4878xX = v52.zza;
                if (c4878xX.zzg == -3.4028235E38f) {
                    arrayList2.add(v52);
                } else {
                    arrayList.add(c4878xX);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.f6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((V5) obj).zzb, ((V5) obj2).zzb);
            }
        });
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            C4649vW c4649vWZzb = ((V5) arrayList2.get(i10)).zza.zzb();
            c4649vWZzb.zze((-1) - i10, 1);
            arrayList.add(c4649vWZzb.zzp());
        }
        return arrayList;
    }
}
