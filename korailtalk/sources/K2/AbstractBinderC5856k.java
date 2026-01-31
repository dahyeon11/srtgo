package k2;

import android.os.Parcel;
import x2.AbstractBinderC6485b;

/* renamed from: k2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5856k extends AbstractBinderC6485b implements l {
    public AbstractBinderC5856k() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // x2.AbstractBinderC6485b
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        zab(parcel.readInt());
        return true;
    }

    public abstract /* synthetic */ void zab(int i8);
}
