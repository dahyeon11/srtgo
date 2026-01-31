package c2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import maum.m2u.map.Map;

/* loaded from: classes.dex */
public final class y extends w2.d implements v {
    y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // c2.v
    public final void zzc(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelA = a();
        w2.e.zzc(parcelA, tVar);
        w2.e.zzc(parcelA, googleSignInOptions);
        b(101, parcelA);
    }

    @Override // c2.v
    public final void zzd(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelA = a();
        w2.e.zzc(parcelA, tVar);
        w2.e.zzc(parcelA, googleSignInOptions);
        b(102, parcelA);
    }

    @Override // c2.v
    public final void zze(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelA = a();
        w2.e.zzc(parcelA, tVar);
        w2.e.zzc(parcelA, googleSignInOptions);
        b(Map.MapException.CALLED_INTERFACE_FIELD_NUMBER, parcelA);
    }
}
