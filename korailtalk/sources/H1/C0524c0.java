package H1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;

/* renamed from: H1.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524c0 extends AbstractC1583Lc implements InterfaceC0533f0 {
    C0524c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // H1.InterfaceC0533f0
    public final void zzc(String str, String str2) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        c(1, parcelA);
    }
}
