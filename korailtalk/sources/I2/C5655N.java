package i2;

import I2.C0609m;
import com.google.android.gms.common.api.Status;
import g2.AbstractC5547i;
import i2.C5682o;
import java.util.concurrent.TimeUnit;

/* renamed from: i2.N */
/* loaded from: classes.dex */
final class C5655N implements AbstractC5547i.a {

    /* renamed from: a */
    final /* synthetic */ AbstractC5547i f31713a;

    /* renamed from: b */
    final /* synthetic */ C0609m f31714b;

    /* renamed from: c */
    final /* synthetic */ C5682o.a f31715c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC5658Q f31716d;

    C5655N(AbstractC5547i abstractC5547i, C0609m c0609m, C5682o.a aVar, InterfaceC5658Q interfaceC5658Q) {
        this.f31713a = abstractC5547i;
        this.f31714b = c0609m;
        this.f31715c = aVar;
        this.f31716d = interfaceC5658Q;
    }

    @Override // g2.AbstractC5547i.a
    public final void onComplete(Status status) {
        if (!status.isSuccess()) {
            this.f31714b.setException(C5669b.fromStatus(status));
        } else {
            this.f31714b.setResult(this.f31715c.convert(this.f31713a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
