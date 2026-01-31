package H1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public abstract class N0 extends AbstractBinderC1623Mc implements O0 {
    public N0() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        String string = parcel.readString();
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
        InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
        AbstractC1664Nc.zzc(parcel);
        zze(string, interfaceC6172aAsInterface, interfaceC6172aAsInterface2);
        parcel2.writeNoException();
        return true;
    }

    @Override // H1.O0
    public abstract /* synthetic */ void zze(String str, InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2);
}
