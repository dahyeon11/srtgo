package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import y1.C6521b;

/* renamed from: H1.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534f1 extends AbstractC5814a {
    public static final Parcelable.Creator<C0534f1> CREATOR = new G1();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public C0534f1 zzd;
    public IBinder zze;

    public C0534f1(int i8, String str, String str2, C0534f1 c0534f1, IBinder iBinder) {
        this.zza = i8;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = c0534f1;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeString(parcel, 2, this.zzb, false);
        AbstractC5816c.writeString(parcel, 3, this.zzc, false);
        AbstractC5816c.writeParcelable(parcel, 4, this.zzd, i8, false);
        AbstractC5816c.writeIBinder(parcel, 5, this.zze, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final C6521b zza() {
        C6521b c6521b;
        C0534f1 c0534f1 = this.zzd;
        if (c0534f1 == null) {
            c6521b = null;
        } else {
            String str = c0534f1.zzc;
            c6521b = new C6521b(c0534f1.zza, c0534f1.zzb, str);
        }
        return new C6521b(this.zza, this.zzb, this.zzc, c6521b);
    }

    public final y1.n zzb() {
        C6521b c6521b;
        C0534f1 c0534f1 = this.zzd;
        S0 q02 = null;
        if (c0534f1 == null) {
            c6521b = null;
        } else {
            c6521b = new C6521b(c0534f1.zza, c0534f1.zzb, c0534f1.zzc);
        }
        int i8 = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            q02 = iInterfaceQueryLocalInterface instanceof S0 ? (S0) iInterfaceQueryLocalInterface : new Q0(iBinder);
        }
        return new y1.n(i8, str, str2, c6521b, y1.y.zza(q02));
    }
}
