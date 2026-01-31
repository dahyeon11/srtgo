package f2;

import android.os.RemoteException;
import android.util.Log;
import i2.A0;
import i2.AbstractC5683p;
import i2.InterfaceC5664X;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import r2.InterfaceC6172a;

/* renamed from: f2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractBinderC5386B extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f30525a;

    protected AbstractBinderC5386B(byte[] bArr) {
        AbstractC5683p.checkArgument(bArr.length == 25);
        this.f30525a = Arrays.hashCode(bArr);
    }

    protected static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    abstract byte[] c();

    public final boolean equals(Object obj) {
        InterfaceC6172a interfaceC6172aZzd;
        if (obj != null && (obj instanceof InterfaceC5664X)) {
            try {
                InterfaceC5664X interfaceC5664X = (InterfaceC5664X) obj;
                if (interfaceC5664X.zzc() == this.f30525a && (interfaceC6172aZzd = interfaceC5664X.zzd()) != null) {
                    return Arrays.equals(c(), (byte[]) r2.b.unwrap(interfaceC6172aZzd));
                }
                return false;
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f30525a;
    }

    @Override // i2.A0, i2.InterfaceC5664X
    public final int zzc() {
        return this.f30525a;
    }

    @Override // i2.A0, i2.InterfaceC5664X
    public final InterfaceC6172a zzd() {
        return r2.b.wrap(c());
    }
}
