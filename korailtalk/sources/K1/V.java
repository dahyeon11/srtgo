package K1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public abstract class V extends AbstractBinderC1623Mc implements W {
    public V() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            boolean zZzf = zzf(interfaceC6172aAsInterface, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else if (i8 == 2) {
            InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            AbstractC1664Nc.zzc(parcel);
            zze(interfaceC6172aAsInterface2);
            parcel2.writeNoException();
        } else {
            if (i8 != 3) {
                return false;
            }
            InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            I1.a aVar = (I1.a) AbstractC1664Nc.zza(parcel, I1.a.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            boolean zZzg = zzg(interfaceC6172aAsInterface3, aVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }

    @Override // K1.W
    public abstract /* synthetic */ void zze(InterfaceC6172a interfaceC6172a);

    @Override // K1.W
    public abstract /* synthetic */ boolean zzf(InterfaceC6172a interfaceC6172a, String str, String str2);

    @Override // K1.W
    public abstract /* synthetic */ boolean zzg(InterfaceC6172a interfaceC6172a, I1.a aVar);
}
