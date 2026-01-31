package H1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import y1.C6515B;

/* loaded from: classes.dex */
public final class R1 extends AbstractC5814a {
    public static final Parcelable.Creator<R1> CREATOR = new S1();
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;

    public R1(C6515B c6515b) {
        this(c6515b.getStartMuted(), c6515b.getCustomControlsRequested(), c6515b.getClickToExpandRequested());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z8 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBoolean(parcel, 2, z8);
        AbstractC5816c.writeBoolean(parcel, 3, this.zzb);
        AbstractC5816c.writeBoolean(parcel, 4, this.zzc);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public R1(boolean z8, boolean z9, boolean z10) {
        this.zza = z8;
        this.zzb = z9;
        this.zzc = z10;
    }
}
