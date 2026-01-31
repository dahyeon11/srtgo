package G2;

import android.os.Parcel;
import x2.AbstractBinderC6485b;
import x2.AbstractC6486c;

/* loaded from: classes2.dex */
public abstract class e extends AbstractBinderC6485b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // x2.AbstractBinderC6485b
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                zab((l) AbstractC6486c.zaa(parcel, l.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zab(l lVar);
}
