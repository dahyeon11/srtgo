package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i2.AbstractC5681n;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.Cr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1242Cr extends AbstractC5814a {
    public static final Parcelable.Creator<C1242Cr> CREATOR = new C1283Dr();
    public final String zza;
    public final int zzb;

    public C1242Cr(String str, int i8) {
        this.zza = str;
        this.zzb = i8;
    }

    public static C1242Cr zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C1242Cr(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1242Cr)) {
            C1242Cr c1242Cr = (C1242Cr) obj;
            if (AbstractC5681n.equal(this.zza, c1242Cr.zza)) {
                if (AbstractC5681n.equal(Integer.valueOf(this.zzb), Integer.valueOf(c1242Cr.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC5681n.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 2, str, false);
        AbstractC5816c.writeInt(parcel, 3, this.zzb);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
