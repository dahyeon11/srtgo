package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class Pu0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f15418a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private Mu0 f15419b = Mu0.zza;

    /* renamed from: c, reason: collision with root package name */
    private Integer f15420c = null;

    public final Pu0 zza(C1198Bo0 c1198Bo0, int i8, String str, String str2) {
        ArrayList arrayList = this.f15418a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new Ru0(c1198Bo0, i8, str, str2, null));
        return this;
    }

    public final Pu0 zzb(Mu0 mu0) {
        if (this.f15418a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.f15419b = mu0;
        return this;
    }

    public final Pu0 zzc(int i8) {
        if (this.f15418a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.f15420c = Integer.valueOf(i8);
        return this;
    }

    public final Tu0 zzd() throws GeneralSecurityException {
        if (this.f15418a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.f15420c;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.f15418a;
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                int iZza = ((Ru0) arrayList.get(i8)).zza();
                i8++;
                if (iZza == iIntValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        Tu0 tu0 = new Tu0(this.f15419b, Collections.unmodifiableList(this.f15418a), this.f15420c, null);
        this.f15418a = null;
        return tu0;
    }
}
