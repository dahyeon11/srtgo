package i2;

import android.os.Bundle;
import f2.C5392b;

/* loaded from: classes.dex */
public final class l0 extends AbstractC5663W {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC5670c f31820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(AbstractC5670c abstractC5670c, int i8, Bundle bundle) {
        super(abstractC5670c, i8, null);
        this.f31820e = abstractC5670c;
    }

    @Override // i2.AbstractC5663W
    protected final void c(C5392b c5392b) {
        if (this.f31820e.c() && AbstractC5670c.D(this.f31820e)) {
            AbstractC5670c.z(this.f31820e, 16);
        } else {
            this.f31820e.f31748p.onReportServiceBinding(c5392b);
            this.f31820e.l(c5392b);
        }
    }

    @Override // i2.AbstractC5663W
    protected final boolean d() {
        this.f31820e.f31748p.onReportServiceBinding(C5392b.RESULT_SUCCESS);
        return true;
    }
}
