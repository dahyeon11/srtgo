package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1191Bl;
import com.google.android.gms.internal.ads.AbstractBinderC1488Ir;
import com.google.android.gms.internal.ads.AbstractBinderC1527Jp;
import com.google.android.gms.internal.ads.AbstractBinderC1854Rp;
import com.google.android.gms.internal.ads.AbstractBinderC1898Ss;
import com.google.android.gms.internal.ads.AbstractBinderC2847fj;
import com.google.android.gms.internal.ads.AbstractBinderC3646mj;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.InterfaceC1232Cl;
import com.google.android.gms.internal.ads.InterfaceC1568Kp;
import com.google.android.gms.internal.ads.InterfaceC1570Kr;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import com.google.android.gms.internal.ads.InterfaceC1895Sp;
import com.google.android.gms.internal.ads.InterfaceC1939Ts;
import com.google.android.gms.internal.ads.InterfaceC2962gj;
import com.google.android.gms.internal.ads.InterfaceC3760nj;
import com.google.android.gms.internal.ads.InterfaceC4459tr;
import com.google.android.gms.internal.ads.InterfaceC5131zl;
import r2.InterfaceC6172a;

/* renamed from: H1.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536g0 extends AbstractC1583Lc implements InterfaceC0542i0 {
    C0536g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // H1.InterfaceC0542i0
    public final T zzb(InterfaceC6172a interfaceC6172a, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        T q8;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(3, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            q8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            q8 = iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new Q(strongBinder);
        }
        parcelB.recycle();
        return q8;
    }

    @Override // H1.InterfaceC0542i0
    public final X zzc(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        X v8;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, d2Var);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(13, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            v8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            v8 = iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new V(strongBinder);
        }
        parcelB.recycle();
        return v8;
    }

    @Override // H1.InterfaceC0542i0
    public final X zzd(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        X v8;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, d2Var);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(1, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            v8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            v8 = iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new V(strongBinder);
        }
        parcelB.recycle();
        return v8;
    }

    @Override // H1.InterfaceC0542i0
    public final X zze(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        X v8;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, d2Var);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(2, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            v8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            v8 = iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new V(strongBinder);
        }
        parcelB.recycle();
        return v8;
    }

    @Override // H1.InterfaceC0542i0
    public final X zzf(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, int i8) {
        X v8;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, d2Var);
        parcelA.writeString(str);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(10, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            v8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            v8 = iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new V(strongBinder);
        }
        parcelB.recycle();
        return v8;
    }

    @Override // H1.InterfaceC0542i0
    public final InterfaceC0571s0 zzg(InterfaceC6172a interfaceC6172a, int i8) {
        InterfaceC0571s0 c0566q0;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(9, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c0566q0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c0566q0 = iInterfaceQueryLocalInterface instanceof InterfaceC0571s0 ? (InterfaceC0571s0) iInterfaceQueryLocalInterface : new C0566q0(strongBinder);
        }
        parcelB.recycle();
        return c0566q0;
    }

    @Override // H1.InterfaceC0542i0
    public final O0 zzh(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        O0 m02;
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(17, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            m02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            m02 = iInterfaceQueryLocalInterface instanceof O0 ? (O0) iInterfaceQueryLocalInterface : new M0(strongBinder);
        }
        parcelB.recycle();
        return m02;
    }

    @Override // H1.InterfaceC0542i0
    public final InterfaceC2962gj zzi(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a2);
        Parcel parcelB = b(5, parcelA);
        InterfaceC2962gj interfaceC2962gjZzdA = AbstractBinderC2847fj.zzdA(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC2962gjZzdA;
    }

    @Override // H1.InterfaceC0542i0
    public final InterfaceC3760nj zzj(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a2);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a3);
        Parcel parcelB = b(11, parcelA);
        InterfaceC3760nj interfaceC3760njZze = AbstractBinderC3646mj.zze(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC3760njZze;
    }

    @Override // H1.InterfaceC0542i0
    public final InterfaceC1232Cl zzk(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8, InterfaceC5131zl interfaceC5131zl) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        AbstractC1664Nc.zzf(parcelA, interfaceC5131zl);
        Parcel parcelB = b(16, parcelA);
        InterfaceC1232Cl interfaceC1232ClZzb = AbstractBinderC1191Bl.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC1232ClZzb;
    }

    @Override // H1.InterfaceC0542i0
    public final InterfaceC1568Kp zzl(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(15, parcelA);
        InterfaceC1568Kp interfaceC1568KpZzb = AbstractBinderC1527Jp.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC1568KpZzb;
    }

    @Override // H1.InterfaceC0542i0
    public final InterfaceC1895Sp zzm(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        Parcel parcelB = b(8, parcelA);
        InterfaceC1895Sp interfaceC1895SpZzI = AbstractBinderC1854Rp.zzI(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC1895SpZzI;
    }

    @Override // H1.InterfaceC0542i0
    public final InterfaceC4459tr zzn(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        throw null;
    }

    @Override // H1.InterfaceC0542i0
    public final InterfaceC1570Kr zzo(InterfaceC6172a interfaceC6172a, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(12, parcelA);
        InterfaceC1570Kr interfaceC1570KrZzq = AbstractBinderC1488Ir.zzq(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC1570KrZzq;
    }

    @Override // H1.InterfaceC0542i0
    public final InterfaceC1939Ts zzp(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC1850Rn);
        parcelA.writeInt(241806000);
        Parcel parcelB = b(14, parcelA);
        InterfaceC1939Ts interfaceC1939TsZzb = AbstractBinderC1898Ss.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC1939TsZzb;
    }
}
