package c2;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class u extends w2.c implements r {
    public u() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // w2.c
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            zzp();
        } else {
            if (i8 != 2) {
                return false;
            }
            zzq();
        }
        return true;
    }

    @Override // c2.r
    public abstract /* synthetic */ void zzp();

    @Override // c2.r
    public abstract /* synthetic */ void zzq();
}
