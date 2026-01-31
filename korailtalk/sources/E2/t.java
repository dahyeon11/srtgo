package e2;

import I2.C0609m;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
abstract class t {

    /* renamed from: a, reason: collision with root package name */
    final int f30287a;

    /* renamed from: b, reason: collision with root package name */
    final C0609m f30288b = new C0609m();

    /* renamed from: c, reason: collision with root package name */
    final int f30289c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f30290d;

    t(int i8, int i9, Bundle bundle) {
        this.f30287a = i8;
        this.f30289c = i9;
        this.f30290d = bundle;
    }

    abstract void a(Bundle bundle);

    final void b(s sVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(sVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
        }
        this.f30288b.setException(sVar);
    }

    final void c(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
        }
        this.f30288b.setResult(obj);
    }

    abstract boolean d();

    public String toString() {
        int i8 = this.f30289c;
        int i9 = this.f30287a;
        boolean zD = d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i8);
        sb.append(" id=");
        sb.append(i9);
        sb.append(" oneWay=");
        sb.append(zD);
        sb.append("}");
        return sb.toString();
    }
}
