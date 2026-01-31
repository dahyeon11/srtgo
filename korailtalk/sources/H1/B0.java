package H1;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class B0 implements y1.q {

    /* renamed from: a, reason: collision with root package name */
    private final String f1618a;

    /* renamed from: b, reason: collision with root package name */
    private final A0 f1619b;

    public B0(A0 a02) {
        String strZze;
        this.f1619b = a02;
        try {
            strZze = a02.zze();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            strZze = null;
        }
        this.f1618a = strZze;
    }

    @Override // y1.q
    public final String getDescription() {
        return this.f1618a;
    }

    public final String toString() {
        return this.f1618a;
    }

    public final A0 zza() {
        return this.f1619b;
    }
}
