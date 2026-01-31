package u2;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import I2.InterfaceC0599c;
import android.content.Context;
import f2.C5398h;
import g2.C5540b;

/* loaded from: classes2.dex */
public final class r implements X1.b {

    /* renamed from: a, reason: collision with root package name */
    private final X1.b f37117a;

    /* renamed from: b, reason: collision with root package name */
    private final X1.b f37118b;

    public r(Context context) {
        this.f37117a = new p(context, C5398h.getInstance());
        this.f37118b = l.c(context);
    }

    public static /* synthetic */ AbstractC0608l zza(r rVar, AbstractC0608l abstractC0608l) {
        if (abstractC0608l.isSuccessful() || abstractC0608l.isCanceled()) {
            return abstractC0608l;
        }
        Exception exception = abstractC0608l.getException();
        if (!(exception instanceof C5540b)) {
            return abstractC0608l;
        }
        int statusCode = ((C5540b) exception).getStatusCode();
        return (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) ? rVar.f37118b.getAppSetIdInfo() : statusCode == 43000 ? AbstractC0611o.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : statusCode != 15 ? abstractC0608l : AbstractC0611o.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // X1.b
    public final AbstractC0608l getAppSetIdInfo() {
        return this.f37117a.getAppSetIdInfo().continueWithTask(new InterfaceC0599c() { // from class: u2.q
            @Override // I2.InterfaceC0599c
            public final Object then(AbstractC0608l abstractC0608l) {
                return r.zza(this.zza, abstractC0608l);
            }
        });
    }
}
