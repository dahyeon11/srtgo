package B2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: B2.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0456o extends AbstractC0442a implements InterfaceC0458q {
    C0456o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // B2.InterfaceC0458q
    public final int zzd() {
        Parcel parcelB = b(2, a());
        int i8 = parcelB.readInt();
        parcelB.recycle();
        return i8;
    }

    @Override // B2.InterfaceC0458q
    public final void zze(String str, String str2, Bundle bundle, long j8) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        AbstractC0444c.zze(parcelA, bundle);
        parcelA.writeLong(j8);
        c(1, parcelA);
    }
}
