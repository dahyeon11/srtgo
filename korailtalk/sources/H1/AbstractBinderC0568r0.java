package H1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractBinderC1809Qn;
import com.google.android.gms.internal.ads.AbstractBinderC2509cm;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import com.google.android.gms.internal.ads.InterfaceC2624dm;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: H1.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0568r0 extends AbstractBinderC1623Mc implements InterfaceC0571s0 {
    public AbstractBinderC0568r0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        F0 c02;
        switch (i8) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f8 = parcel.readFloat();
                AbstractC1664Nc.zzc(parcel);
                zzq(f8);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzg = AbstractC1664Nc.zzg(parcel);
                AbstractC1664Nc.zzc(parcel);
                zzp(zZzg);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzn(interfaceC6172aAsInterface, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzl(string3, interfaceC6172aAsInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                int i10 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC1850Rn interfaceC1850RnZzf = AbstractBinderC1809Qn.zzf(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzo(interfaceC1850RnZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                InterfaceC2624dm interfaceC2624dmZzc = AbstractBinderC2509cm.zzc(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzs(interfaceC2624dmZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                M1 m12 = (M1) AbstractC1664Nc.zza(parcel, M1.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzu(m12);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c02 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    c02 = iInterfaceQueryLocalInterface instanceof F0 ? (F0) iInterfaceQueryLocalInterface : new C0(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzm(c02);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZzg2 = AbstractC1664Nc.zzg(parcel);
                AbstractC1664Nc.zzc(parcel);
                zzj(zZzg2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ float zze();

    public abstract /* synthetic */ String zzf();

    public abstract /* synthetic */ List zzg();

    public abstract /* synthetic */ void zzh(String str);

    public abstract /* synthetic */ void zzi();

    public abstract /* synthetic */ void zzj(boolean z8);

    public abstract /* synthetic */ void zzk();

    public abstract /* synthetic */ void zzl(String str, InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzm(F0 f02);

    public abstract /* synthetic */ void zzn(InterfaceC6172a interfaceC6172a, String str);

    public abstract /* synthetic */ void zzo(InterfaceC1850Rn interfaceC1850Rn);

    public abstract /* synthetic */ void zzp(boolean z8);

    public abstract /* synthetic */ void zzq(float f8);

    public abstract /* synthetic */ void zzr(String str);

    public abstract /* synthetic */ void zzs(InterfaceC2624dm interfaceC2624dm);

    public abstract /* synthetic */ void zzt(String str);

    public abstract /* synthetic */ void zzu(M1 m12);

    public abstract /* synthetic */ boolean zzv();
}
