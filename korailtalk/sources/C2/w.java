package c2;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import maum.m2u.map.Map;

/* loaded from: classes.dex */
public abstract class w extends w2.c implements t {
    public w() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // w2.c
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 101:
                zzc((GoogleSignInAccount) w2.e.zzc(parcel, GoogleSignInAccount.CREATOR), (Status) w2.e.zzc(parcel, Status.CREATOR));
                break;
            case 102:
                zze((Status) w2.e.zzc(parcel, Status.CREATOR));
                break;
            case Map.MapException.CALLED_INTERFACE_FIELD_NUMBER /* 103 */:
                zzf((Status) w2.e.zzc(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzc(GoogleSignInAccount googleSignInAccount, Status status);

    public abstract /* synthetic */ void zze(Status status);

    public abstract /* synthetic */ void zzf(Status status);
}
