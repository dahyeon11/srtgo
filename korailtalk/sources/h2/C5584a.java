package h2;

import com.google.android.gms.common.api.Status;
import i2.C5669b;

/* renamed from: h2.a */
/* loaded from: classes.dex */
public class C5584a implements InterfaceC5595l {
    @Override // h2.InterfaceC5595l
    public final Exception getException(Status status) {
        return C5669b.fromStatus(status);
    }
}
