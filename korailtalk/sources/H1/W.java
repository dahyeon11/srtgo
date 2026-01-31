package H1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractBinderC1715Oh;
import com.google.android.gms.internal.ads.AbstractBinderC1830Rd;
import com.google.android.gms.internal.ads.AbstractBinderC2288aq;
import com.google.android.gms.internal.ads.AbstractBinderC2631dq;
import com.google.android.gms.internal.ads.AbstractBinderC4687vr;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.InterfaceC1756Ph;
import com.google.android.gms.internal.ads.InterfaceC1871Sd;
import com.google.android.gms.internal.ads.InterfaceC2403bq;
import com.google.android.gms.internal.ads.InterfaceC2746eq;
import com.google.android.gms.internal.ads.InterfaceC4801wr;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public abstract class W extends AbstractBinderC1623Mc implements X {
    public W() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static X zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new V(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        J h8 = null;
        InterfaceC0554m0 c0548k0 = null;
        M k8 = null;
        L0 j02 = null;
        InterfaceC0521b0 z8 = null;
        C0545j0 c0545j0 = null;
        G e8 = null;
        InterfaceC0533f0 c0524c0 = null;
        switch (i8) {
            case 1:
                InterfaceC6172a interfaceC6172aZzn = zzn();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzaa = zzaa();
                parcel2.writeNoException();
                int i10 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzaa ? 1 : 0);
                return true;
            case 4:
                Y1 y12 = (Y1) AbstractC1664Nc.zza(parcel, Y1.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                boolean zZzab = zzab(y12);
                parcel2.writeNoException();
                parcel2.writeInt(zZzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    h8 = iInterfaceQueryLocalInterface instanceof J ? (J) iInterfaceQueryLocalInterface : new H(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzD(h8);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    c0524c0 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0533f0 ? (InterfaceC0533f0) iInterfaceQueryLocalInterface2 : new C0524c0(strongBinder2);
                }
                AbstractC1664Nc.zzc(parcel);
                zzG(c0524c0);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                d2 d2VarZzg = zzg();
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, d2VarZzg);
                return true;
            case 13:
                d2 d2Var = (d2) AbstractC1664Nc.zza(parcel, d2.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzF(d2Var);
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC2403bq interfaceC2403bqZzb = AbstractBinderC2288aq.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzM(interfaceC2403bqZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC2746eq interfaceC2746eqZzb = AbstractBinderC2631dq.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzQ(interfaceC2746eqZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                InterfaceC1756Ph interfaceC1756PhZzb = AbstractBinderC1715Oh.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzO(interfaceC1756PhZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    e8 = iInterfaceQueryLocalInterface3 instanceof G ? (G) iInterfaceQueryLocalInterface3 : new E(strongBinder3);
                }
                AbstractC1664Nc.zzc(parcel);
                zzC(e8);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c0545j0 = iInterfaceQueryLocalInterface4 instanceof C0545j0 ? (C0545j0) iInterfaceQueryLocalInterface4 : new C0545j0(strongBinder4);
                }
                AbstractC1664Nc.zzc(parcel);
                zzac(c0545j0);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZzg = AbstractC1664Nc.zzg(parcel);
                AbstractC1664Nc.zzc(parcel);
                zzN(zZzg);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                int i11 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzZ ? 1 : 0);
                return true;
            case 24:
                InterfaceC4801wr interfaceC4801wrZzb = AbstractBinderC4687vr.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzS(interfaceC4801wrZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                V0 v0Zzl = zzl();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, v0Zzl);
                return true;
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                R1 r12 = (R1) AbstractC1664Nc.zza(parcel, R1.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzU(r12);
                parcel2.writeNoException();
                return true;
            case 30:
                Z0 z02 = (Z0) AbstractC1664Nc.zza(parcel, Z0.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzK(z02);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                InterfaceC0533f0 interfaceC0533f0Zzj = zzj();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC0533f0Zzj);
                return true;
            case 33:
                J jZzi = zzi();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, jZzi);
                return true;
            case 34:
                boolean zZzg2 = AbstractC1664Nc.zzg(parcel);
                AbstractC1664Nc.zzc(parcel);
                zzL(zZzg2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    z8 = iInterfaceQueryLocalInterface5 instanceof InterfaceC0521b0 ? (InterfaceC0521b0) iInterfaceQueryLocalInterface5 : new Z(strongBinder5);
                }
                AbstractC1664Nc.zzc(parcel);
                zzE(z8);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                AbstractC1664Nc.zze(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                j2 j2Var = (j2) AbstractC1664Nc.zza(parcel, j2.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzI(j2Var);
                parcel2.writeNoException();
                return true;
            case 40:
                InterfaceC1871Sd interfaceC1871SdZze = AbstractBinderC1830Rd.zze(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzH(interfaceC1871SdZze);
                parcel2.writeNoException();
                return true;
            case 41:
                S0 s0Zzk = zzk();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, s0Zzk);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    j02 = iInterfaceQueryLocalInterface6 instanceof L0 ? (L0) iInterfaceQueryLocalInterface6 : new J0(strongBinder6);
                }
                AbstractC1664Nc.zzc(parcel);
                zzP(j02);
                parcel2.writeNoException();
                return true;
            case 43:
                Y1 y13 = (Y1) AbstractC1664Nc.zza(parcel, Y1.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    k8 = iInterfaceQueryLocalInterface7 instanceof M ? (M) iInterfaceQueryLocalInterface7 : new K(strongBinder7);
                }
                AbstractC1664Nc.zzc(parcel);
                zzy(y13, k8);
                parcel2.writeNoException();
                return true;
            case 44:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzW(interfaceC6172aAsInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    c0548k0 = iInterfaceQueryLocalInterface8 instanceof InterfaceC0554m0 ? (InterfaceC0554m0) iInterfaceQueryLocalInterface8 : new C0548k0(strongBinder8);
                }
                AbstractC1664Nc.zzc(parcel);
                zzJ(c0548k0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                int i12 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzY ? 1 : 0);
                return true;
        }
    }

    public abstract /* synthetic */ void zzA();

    public abstract /* synthetic */ void zzB();

    public abstract /* synthetic */ void zzC(G g8);

    public abstract /* synthetic */ void zzD(J j8);

    public abstract /* synthetic */ void zzE(InterfaceC0521b0 interfaceC0521b0);

    public abstract /* synthetic */ void zzF(d2 d2Var);

    public abstract /* synthetic */ void zzG(InterfaceC0533f0 interfaceC0533f0);

    public abstract /* synthetic */ void zzH(InterfaceC1871Sd interfaceC1871Sd);

    public abstract /* synthetic */ void zzI(j2 j2Var);

    public abstract /* synthetic */ void zzJ(InterfaceC0554m0 interfaceC0554m0);

    public abstract /* synthetic */ void zzK(Z0 z02);

    public abstract /* synthetic */ void zzL(boolean z8);

    public abstract /* synthetic */ void zzM(InterfaceC2403bq interfaceC2403bq);

    public abstract /* synthetic */ void zzN(boolean z8);

    public abstract /* synthetic */ void zzO(InterfaceC1756Ph interfaceC1756Ph);

    public abstract /* synthetic */ void zzP(L0 l02);

    public abstract /* synthetic */ void zzQ(InterfaceC2746eq interfaceC2746eq, String str);

    public abstract /* synthetic */ void zzR(String str);

    public abstract /* synthetic */ void zzS(InterfaceC4801wr interfaceC4801wr);

    public abstract /* synthetic */ void zzT(String str);

    public abstract /* synthetic */ void zzU(R1 r12);

    public abstract /* synthetic */ void zzW(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzX();

    public abstract /* synthetic */ boolean zzY();

    public abstract /* synthetic */ boolean zzZ();

    public abstract /* synthetic */ boolean zzaa();

    public abstract /* synthetic */ boolean zzab(Y1 y12);

    public abstract /* synthetic */ void zzac(C0545j0 c0545j0);

    public abstract /* synthetic */ Bundle zzd();

    public abstract /* synthetic */ d2 zzg();

    public abstract /* synthetic */ J zzi();

    public abstract /* synthetic */ InterfaceC0533f0 zzj();

    public abstract /* synthetic */ S0 zzk();

    public abstract /* synthetic */ V0 zzl();

    public abstract /* synthetic */ InterfaceC6172a zzn();

    public abstract /* synthetic */ String zzr();

    public abstract /* synthetic */ String zzs();

    public abstract /* synthetic */ String zzt();

    public abstract /* synthetic */ void zzx();

    public abstract /* synthetic */ void zzy(Y1 y12, M m8);

    public abstract /* synthetic */ void zzz();
}
