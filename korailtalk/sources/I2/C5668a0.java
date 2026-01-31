package i2;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;
import z2.AbstractC6618a;

/* renamed from: i2.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5668a0 extends AbstractC6618a implements c0 {
    C5668a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // i2.c0
    public final f2.I zze(f2.G g8) {
        Parcel parcelB = b();
        z2.n.zzc(parcelB, g8);
        Parcel parcelA = a(6, parcelB);
        f2.I i8 = (f2.I) z2.n.zza(parcelA, f2.I.CREATOR);
        parcelA.recycle();
        return i8;
    }

    @Override // i2.c0
    public final f2.I zzf(f2.G g8) {
        Parcel parcelB = b();
        z2.n.zzc(parcelB, g8);
        Parcel parcelA = a(8, parcelB);
        f2.I i8 = (f2.I) z2.n.zza(parcelA, f2.I.CREATOR);
        parcelA.recycle();
        return i8;
    }

    @Override // i2.c0
    public final boolean zzg() {
        Parcel parcelA = a(9, b());
        boolean zZzf = z2.n.zzf(parcelA);
        parcelA.recycle();
        return zZzf;
    }

    @Override // i2.c0
    public final boolean zzh(f2.K k8, InterfaceC6172a interfaceC6172a) {
        Parcel parcelB = b();
        z2.n.zzc(parcelB, k8);
        z2.n.zze(parcelB, interfaceC6172a);
        Parcel parcelA = a(5, parcelB);
        boolean zZzf = z2.n.zzf(parcelA);
        parcelA.recycle();
        return zZzf;
    }

    @Override // i2.c0
    public final boolean zzi() {
        Parcel parcelA = a(7, b());
        boolean zZzf = z2.n.zzf(parcelA);
        parcelA.recycle();
        return zZzf;
    }
}
