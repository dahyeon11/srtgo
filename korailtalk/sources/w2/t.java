package w2;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class t extends c implements u {
    public t() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // w2.c
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            zzc((Status) e.zzc(parcel, Status.CREATOR), (Credential) e.zzc(parcel, Credential.CREATOR));
        } else if (i8 == 2) {
            zzd((Status) e.zzc(parcel, Status.CREATOR));
        } else {
            if (i8 != 3) {
                return false;
            }
            zzc((Status) e.zzc(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzc(Status status, Credential credential);

    public abstract /* synthetic */ void zzc(Status status, String str);

    public abstract /* synthetic */ void zzd(Status status);
}
