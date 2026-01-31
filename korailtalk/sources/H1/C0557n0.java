package H1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1809Qn;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;

/* renamed from: H1.n0 */
/* loaded from: classes.dex */
public final class C0557n0 extends AbstractC1583Lc implements InterfaceC0563p0 {
    C0557n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // H1.InterfaceC0563p0
    public final InterfaceC1850Rn getAdapterCreator() {
        Parcel parcelB = b(2, a());
        InterfaceC1850Rn interfaceC1850RnZzf = AbstractBinderC1809Qn.zzf(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC1850RnZzf;
    }

    @Override // H1.InterfaceC0563p0
    public final C0575t1 getLiteSdkVersion() {
        Parcel parcelB = b(1, a());
        C0575t1 c0575t1 = (C0575t1) AbstractC1664Nc.zza(parcelB, C0575t1.CREATOR);
        parcelB.recycle();
        return c0575t1;
    }
}
