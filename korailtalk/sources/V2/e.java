package v2;

import a2.C0830c;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class e extends q implements d {
    public e() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // v2.q
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            zza((C0830c) r.zza(parcel, C0830c.CREATOR));
        } else {
            if (i8 != 2) {
                return false;
            }
            zzb(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zza(C0830c c0830c);

    public abstract /* synthetic */ void zzb(String str);
}
