package H1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.C2051Wl;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import com.google.android.gms.internal.ads.InterfaceC2624dm;
import java.util.ArrayList;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: H1.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566q0 extends AbstractC1583Lc implements InterfaceC0571s0 {
    C0566q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // H1.InterfaceC0571s0
    public final float zze() {
        Parcel parcelB = b(7, a());
        float f8 = parcelB.readFloat();
        parcelB.recycle();
        return f8;
    }

    @Override // H1.InterfaceC0571s0
    public final String zzf() {
        Parcel parcelB = b(9, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // H1.InterfaceC0571s0
    public final List zzg() {
        Parcel parcelB = b(13, a());
        ArrayList arrayListCreateTypedArrayList = parcelB.createTypedArrayList(C2051Wl.CREATOR);
        parcelB.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // H1.InterfaceC0571s0
    public final void zzh(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(10, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final void zzi() {
        c(15, a());
    }

    @Override // H1.InterfaceC0571s0
    public final void zzj(boolean z8) {
        Parcel parcelA = a();
        int i8 = AbstractC1664Nc.zza;
        parcelA.writeInt(z8 ? 1 : 0);
        c(17, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final void zzk() {
        c(1, a());
    }

    @Override // H1.InterfaceC0571s0
    public final void zzl(String str, InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        parcelA.writeString(null);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(6, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final void zzm(F0 f02) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, f02);
        c(16, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final void zzn(InterfaceC6172a interfaceC6172a, String str) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeString(str);
        c(5, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final void zzo(InterfaceC1850Rn interfaceC1850Rn) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        c(11, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final void zzp(boolean z8) {
        Parcel parcelA = a();
        int i8 = AbstractC1664Nc.zza;
        parcelA.writeInt(z8 ? 1 : 0);
        c(4, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final void zzq(float f8) {
        Parcel parcelA = a();
        parcelA.writeFloat(f8);
        c(2, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final void zzr(String str) {
        throw null;
    }

    @Override // H1.InterfaceC0571s0
    public final void zzs(InterfaceC2624dm interfaceC2624dm) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC2624dm);
        c(12, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final void zzt(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(18, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final void zzu(M1 m12) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, m12);
        c(14, parcelA);
    }

    @Override // H1.InterfaceC0571s0
    public final boolean zzv() {
        Parcel parcelB = b(8, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }
}
