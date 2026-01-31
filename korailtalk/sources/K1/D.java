package K1;

import H1.C0534f1;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractC1802Qj0;
import com.google.android.gms.internal.ads.AbstractC4542ub0;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class D extends AbstractC5814a {
    public static final Parcelable.Creator<D> CREATOR = new E();
    public final String zza;
    public final int zzb;

    D(String str, int i8) {
        this.zza = str == null ? "" : str;
        this.zzb = i8;
    }

    public static D zzb(Throwable th) {
        C0534f1 c0534f1Zza = AbstractC4542ub0.zza(th);
        return new D(AbstractC1802Qj0.zzd(th.getMessage()) ? c0534f1Zza.zzb : th.getMessage(), c0534f1Zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeInt(parcel, 2, this.zzb);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final C zza() {
        return new C(this.zza, this.zzb);
    }
}
