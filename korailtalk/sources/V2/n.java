package v2;

import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class n extends b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ m f37218a;

    n(m mVar) {
        this.f37218a = mVar;
    }

    @Override // v2.b, v2.e, v2.d
    public final void zzb(String str) {
        if (str != null) {
            this.f37218a.setResult((m) new p(str));
        } else {
            this.f37218a.setResult((m) i.h(new Status(3006)));
        }
    }
}
