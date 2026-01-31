package H1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.InterfaceC1756Ph;
import com.google.android.gms.internal.ads.InterfaceC1871Sd;
import com.google.android.gms.internal.ads.InterfaceC2403bq;
import com.google.android.gms.internal.ads.InterfaceC2746eq;
import com.google.android.gms.internal.ads.InterfaceC4801wr;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class V extends AbstractC1583Lc implements X {
    V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // H1.X
    public final void zzA() {
        c(11, a());
    }

    @Override // H1.X
    public final void zzB() {
        c(6, a());
    }

    @Override // H1.X
    public final void zzC(G g8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, g8);
        c(20, parcelA);
    }

    @Override // H1.X
    public final void zzD(J j8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, j8);
        c(7, parcelA);
    }

    @Override // H1.X
    public final void zzE(InterfaceC0521b0 interfaceC0521b0) {
        throw null;
    }

    @Override // H1.X
    public final void zzF(d2 d2Var) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, d2Var);
        c(13, parcelA);
    }

    @Override // H1.X
    public final void zzG(InterfaceC0533f0 interfaceC0533f0) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC0533f0);
        c(8, parcelA);
    }

    @Override // H1.X
    public final void zzH(InterfaceC1871Sd interfaceC1871Sd) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC1871Sd);
        c(40, parcelA);
    }

    @Override // H1.X
    public final void zzI(j2 j2Var) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, j2Var);
        c(39, parcelA);
    }

    @Override // H1.X
    public final void zzJ(InterfaceC0554m0 interfaceC0554m0) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC0554m0);
        c(45, parcelA);
    }

    @Override // H1.X
    public final void zzK(Z0 z02) {
        throw null;
    }

    @Override // H1.X
    public final void zzL(boolean z8) {
        Parcel parcelA = a();
        int i8 = AbstractC1664Nc.zza;
        parcelA.writeInt(z8 ? 1 : 0);
        c(34, parcelA);
    }

    @Override // H1.X
    public final void zzM(InterfaceC2403bq interfaceC2403bq) {
        throw null;
    }

    @Override // H1.X
    public final void zzN(boolean z8) {
        Parcel parcelA = a();
        int i8 = AbstractC1664Nc.zza;
        parcelA.writeInt(z8 ? 1 : 0);
        c(22, parcelA);
    }

    @Override // H1.X
    public final void zzO(InterfaceC1756Ph interfaceC1756Ph) {
        throw null;
    }

    @Override // H1.X
    public final void zzP(L0 l02) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, l02);
        c(42, parcelA);
    }

    @Override // H1.X
    public final void zzQ(InterfaceC2746eq interfaceC2746eq, String str) {
        throw null;
    }

    @Override // H1.X
    public final void zzR(String str) {
        throw null;
    }

    @Override // H1.X
    public final void zzS(InterfaceC4801wr interfaceC4801wr) {
        throw null;
    }

    @Override // H1.X
    public final void zzT(String str) {
        throw null;
    }

    @Override // H1.X
    public final void zzU(R1 r12) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, r12);
        c(29, parcelA);
    }

    @Override // H1.X
    public final void zzW(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(44, parcelA);
    }

    @Override // H1.X
    public final void zzX() {
        throw null;
    }

    @Override // H1.X
    public final boolean zzY() {
        Parcel parcelB = b(46, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // H1.X
    public final boolean zzZ() {
        Parcel parcelB = b(23, a());
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // H1.X
    public final boolean zzaa() {
        throw null;
    }

    @Override // H1.X
    public final boolean zzab(Y1 y12) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, y12);
        Parcel parcelB = b(4, parcelA);
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // H1.X
    public final void zzac(C0545j0 c0545j0) {
        throw null;
    }

    @Override // H1.X
    public final Bundle zzd() {
        throw null;
    }

    @Override // H1.X
    public final d2 zzg() {
        Parcel parcelB = b(12, a());
        d2 d2Var = (d2) AbstractC1664Nc.zza(parcelB, d2.CREATOR);
        parcelB.recycle();
        return d2Var;
    }

    @Override // H1.X
    public final J zzi() {
        J h8;
        Parcel parcelB = b(33, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            h8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            h8 = iInterfaceQueryLocalInterface instanceof J ? (J) iInterfaceQueryLocalInterface : new H(strongBinder);
        }
        parcelB.recycle();
        return h8;
    }

    @Override // H1.X
    public final InterfaceC0533f0 zzj() {
        InterfaceC0533f0 c0524c0;
        Parcel parcelB = b(32, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c0524c0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            c0524c0 = iInterfaceQueryLocalInterface instanceof InterfaceC0533f0 ? (InterfaceC0533f0) iInterfaceQueryLocalInterface : new C0524c0(strongBinder);
        }
        parcelB.recycle();
        return c0524c0;
    }

    @Override // H1.X
    public final S0 zzk() {
        S0 q02;
        Parcel parcelB = b(41, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            q02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            q02 = iInterfaceQueryLocalInterface instanceof S0 ? (S0) iInterfaceQueryLocalInterface : new Q0(strongBinder);
        }
        parcelB.recycle();
        return q02;
    }

    @Override // H1.X
    public final V0 zzl() {
        V0 t02;
        Parcel parcelB = b(26, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            t02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            t02 = iInterfaceQueryLocalInterface instanceof V0 ? (V0) iInterfaceQueryLocalInterface : new T0(strongBinder);
        }
        parcelB.recycle();
        return t02;
    }

    @Override // H1.X
    public final InterfaceC6172a zzn() {
        Parcel parcelB = b(1, a());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC6172aAsInterface;
    }

    @Override // H1.X
    public final String zzr() {
        Parcel parcelB = b(31, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // H1.X
    public final String zzs() {
        throw null;
    }

    @Override // H1.X
    public final String zzt() {
        throw null;
    }

    @Override // H1.X
    public final void zzx() {
        c(2, a());
    }

    @Override // H1.X
    public final void zzy(Y1 y12, M m8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, y12);
        AbstractC1664Nc.zzf(parcelA, m8);
        c(43, parcelA);
    }

    @Override // H1.X
    public final void zzz() {
        c(5, a());
    }
}
