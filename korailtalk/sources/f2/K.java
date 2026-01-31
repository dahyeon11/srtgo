package f2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import i2.A0;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class K extends AbstractC5814a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* renamed from: a, reason: collision with root package name */
    private final String f30547a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractBinderC5386B f30548b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30549c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30550d;

    K(String str, AbstractBinderC5386B abstractBinderC5386B, boolean z8, boolean z9) {
        this.f30547a = str;
        this.f30548b = abstractBinderC5386B;
        this.f30549c = z8;
        this.f30550d = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f30547a;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractBinderC5386B abstractBinderC5386B = this.f30548b;
        if (abstractBinderC5386B == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC5386B = null;
        }
        AbstractC5816c.writeIBinder(parcel, 2, abstractBinderC5386B, false);
        AbstractC5816c.writeBoolean(parcel, 3, this.f30549c);
        AbstractC5816c.writeBoolean(parcel, 4, this.f30550d);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    K(String str, IBinder iBinder, boolean z8, boolean z9) {
        this.f30547a = str;
        BinderC5387C binderC5387C = null;
        if (iBinder != null) {
            try {
                InterfaceC6172a interfaceC6172aZzd = A0.zzg(iBinder).zzd();
                byte[] bArr = interfaceC6172aZzd == null ? null : (byte[]) r2.b.unwrap(interfaceC6172aZzd);
                if (bArr != null) {
                    binderC5387C = new BinderC5387C(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e8) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e8);
            }
        }
        this.f30548b = binderC5387C;
        this.f30549c = z8;
        this.f30550d = z9;
    }
}
