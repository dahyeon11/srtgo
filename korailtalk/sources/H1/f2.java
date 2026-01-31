package H1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f2 extends AbstractC5814a {
    public static final Parcelable.Creator<f2> CREATOR = new g2();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final long zzd;

    public f2(int i8, int i9, String str, long j8) {
        this.zza = i8;
        this.zzb = i9;
        this.zzc = str;
        this.zzd = j8;
    }

    public static f2 zza(JSONObject jSONObject) {
        return new f2(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeInt(parcel, 2, this.zzb);
        AbstractC5816c.writeString(parcel, 3, this.zzc, false);
        AbstractC5816c.writeLong(parcel, 4, this.zzd);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
