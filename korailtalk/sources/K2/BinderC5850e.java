package k2;

import com.google.android.gms.common.api.Status;
import h2.InterfaceC5586c;

/* renamed from: k2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC5850e extends BinderC5847b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5586c f33562a;

    public BinderC5850e(InterfaceC5586c interfaceC5586c) {
        this.f33562a = interfaceC5586c;
    }

    @Override // k2.BinderC5847b, k2.AbstractBinderC5856k, k2.l
    public final void zab(int i8) {
        this.f33562a.setResult(new Status(i8));
    }
}
