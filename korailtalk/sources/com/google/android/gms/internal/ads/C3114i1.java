package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3114i1 implements Comparator, Parcelable {
    public static final Parcelable.Creator<C3114i1> CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    private final H0[] f19878a;

    /* renamed from: b, reason: collision with root package name */
    private int f19879b;
    public final String zza;
    public final int zzb;

    C3114i1(Parcel parcel) {
        this.zza = parcel.readString();
        H0[] h0Arr = (H0[]) parcel.createTypedArray(H0.CREATOR);
        int i8 = AbstractC2281am0.zza;
        this.f19878a = h0Arr;
        this.zzb = h0Arr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        H0 h02 = (H0) obj;
        H0 h03 = (H0) obj2;
        UUID uuid = AbstractC4285sH0.zza;
        return uuid.equals(h02.zza) ? !uuid.equals(h03.zza) ? 1 : 0 : h02.zza.compareTo(h03.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3114i1.class == obj.getClass()) {
            C3114i1 c3114i1 = (C3114i1) obj;
            if (AbstractC2281am0.zzG(this.zza, c3114i1.zza) && Arrays.equals(this.f19878a, c3114i1.f19878a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f19879b;
        if (i8 != 0) {
            return i8;
        }
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f19878a);
        this.f19879b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.f19878a, 0);
    }

    public final H0 zza(int i8) {
        return this.f19878a[i8];
    }

    public final C3114i1 zzb(String str) {
        return AbstractC2281am0.zzG(this.zza, str) ? this : new C3114i1(str, false, this.f19878a);
    }

    private C3114i1(String str, boolean z8, H0... h0Arr) {
        this.zza = str;
        h0Arr = z8 ? (H0[]) h0Arr.clone() : h0Arr;
        this.f19878a = h0Arr;
        this.zzb = h0Arr.length;
        Arrays.sort(h0Arr, this);
    }

    public C3114i1(String str, H0... h0Arr) {
        this(null, true, h0Arr);
    }

    public C3114i1(List list) {
        this(null, false, (H0[]) list.toArray(new H0[0]));
    }
}
