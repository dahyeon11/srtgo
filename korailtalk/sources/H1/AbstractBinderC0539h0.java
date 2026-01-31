package H1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractBinderC1809Qn;
import com.google.android.gms.internal.ads.AbstractBinderC5017yl;
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

/* renamed from: H1.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0539h0 extends AbstractBinderC1623Mc implements InterfaceC0542i0 {
    public AbstractBinderC0539h0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                d2 d2Var = (d2) AbstractC1664Nc.zza(parcel, d2.CREATOR);
                String string = parcel.readString();
                InterfaceC1850Rn interfaceC1850RnZzf = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                X xZzd = zzd(interfaceC6172aAsInterface, d2Var, string, interfaceC1850RnZzf, i10);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, xZzd);
                return true;
            case 2:
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                d2 d2Var2 = (d2) AbstractC1664Nc.zza(parcel, d2.CREATOR);
                String string2 = parcel.readString();
                InterfaceC1850Rn interfaceC1850RnZzf2 = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                X xZze = zze(interfaceC6172aAsInterface2, d2Var2, string2, interfaceC1850RnZzf2, i11);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, xZze);
                return true;
            case 3:
                InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                InterfaceC1850Rn interfaceC1850RnZzf3 = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                T tZzb = zzb(interfaceC6172aAsInterface3, string3, interfaceC1850RnZzf3, i12);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, tZzb);
                return true;
            case 4:
                InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, null);
                return true;
            case 5:
                InterfaceC6172a interfaceC6172aAsInterface4 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC6172a interfaceC6172aAsInterface5 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                InterfaceC2962gj interfaceC2962gjZzi = zzi(interfaceC6172aAsInterface4, interfaceC6172aAsInterface5);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC2962gjZzi);
                return true;
            case 6:
                InterfaceC6172a interfaceC6172aAsInterface6 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC1850Rn interfaceC1850RnZzf4 = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                InterfaceC4459tr interfaceC4459trZzn = zzn(interfaceC6172aAsInterface6, interfaceC1850RnZzf4, i13);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC4459trZzn);
                return true;
            case 7:
                InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, null);
                return true;
            case 8:
                InterfaceC6172a interfaceC6172aAsInterface7 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                InterfaceC1895Sp interfaceC1895SpZzm = zzm(interfaceC6172aAsInterface7);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC1895SpZzm);
                return true;
            case 9:
                InterfaceC6172a interfaceC6172aAsInterface8 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                InterfaceC0571s0 interfaceC0571s0Zzg = zzg(interfaceC6172aAsInterface8, i14);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC0571s0Zzg);
                return true;
            case 10:
                InterfaceC6172a interfaceC6172aAsInterface9 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                d2 d2Var3 = (d2) AbstractC1664Nc.zza(parcel, d2.CREATOR);
                String string4 = parcel.readString();
                int i15 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                X xZzf = zzf(interfaceC6172aAsInterface9, d2Var3, string4, i15);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, xZzf);
                return true;
            case 11:
                InterfaceC6172a interfaceC6172aAsInterface10 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC6172a interfaceC6172aAsInterface11 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC6172a interfaceC6172aAsInterface12 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                InterfaceC3760nj interfaceC3760njZzj = zzj(interfaceC6172aAsInterface10, interfaceC6172aAsInterface11, interfaceC6172aAsInterface12);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC3760njZzj);
                return true;
            case 12:
                InterfaceC6172a interfaceC6172aAsInterface13 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                InterfaceC1850Rn interfaceC1850RnZzf5 = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                InterfaceC1570Kr interfaceC1570KrZzo = zzo(interfaceC6172aAsInterface13, string5, interfaceC1850RnZzf5, i16);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC1570KrZzo);
                return true;
            case 13:
                InterfaceC6172a interfaceC6172aAsInterface14 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                d2 d2Var4 = (d2) AbstractC1664Nc.zza(parcel, d2.CREATOR);
                String string6 = parcel.readString();
                InterfaceC1850Rn interfaceC1850RnZzf6 = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                X xZzc = zzc(interfaceC6172aAsInterface14, d2Var4, string6, interfaceC1850RnZzf6, i17);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, xZzc);
                return true;
            case 14:
                InterfaceC6172a interfaceC6172aAsInterface15 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC1850Rn interfaceC1850RnZzf7 = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                InterfaceC1939Ts interfaceC1939TsZzp = zzp(interfaceC6172aAsInterface15, interfaceC1850RnZzf7, i18);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC1939TsZzp);
                return true;
            case 15:
                InterfaceC6172a interfaceC6172aAsInterface16 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC1850Rn interfaceC1850RnZzf8 = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                InterfaceC1568Kp interfaceC1568KpZzl = zzl(interfaceC6172aAsInterface16, interfaceC1850RnZzf8, i19);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC1568KpZzl);
                return true;
            case 16:
                InterfaceC6172a interfaceC6172aAsInterface17 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC1850Rn interfaceC1850RnZzf9 = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                InterfaceC5131zl interfaceC5131zlZzc = AbstractBinderC5017yl.zzc(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                InterfaceC1232Cl interfaceC1232ClZzk = zzk(interfaceC6172aAsInterface17, interfaceC1850RnZzf9, i20, interfaceC5131zlZzc);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC1232ClZzk);
                return true;
            case 17:
                InterfaceC6172a interfaceC6172aAsInterface18 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC1850Rn interfaceC1850RnZzf10 = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                O0 o0Zzh = zzh(interfaceC6172aAsInterface18, interfaceC1850RnZzf10, i21);
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, o0Zzh);
                return true;
            default:
                return false;
        }
    }

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ T zzb(InterfaceC6172a interfaceC6172a, String str, InterfaceC1850Rn interfaceC1850Rn, int i8);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ X zzc(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ X zzd(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ X zze(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ X zzf(InterfaceC6172a interfaceC6172a, d2 d2Var, String str, int i8);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ InterfaceC0571s0 zzg(InterfaceC6172a interfaceC6172a, int i8);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ O0 zzh(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ InterfaceC2962gj zzi(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ InterfaceC3760nj zzj(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ InterfaceC1232Cl zzk(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8, InterfaceC5131zl interfaceC5131zl);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ InterfaceC1568Kp zzl(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ InterfaceC1895Sp zzm(InterfaceC6172a interfaceC6172a);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ InterfaceC4459tr zzn(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ InterfaceC1570Kr zzo(InterfaceC6172a interfaceC6172a, String str, InterfaceC1850Rn interfaceC1850Rn, int i8);

    @Override // H1.InterfaceC0542i0
    public abstract /* synthetic */ InterfaceC1939Ts zzp(InterfaceC6172a interfaceC6172a, InterfaceC1850Rn interfaceC1850Rn, int i8);
}
