package i2;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import f2.C5392b;

/* loaded from: classes.dex */
final class g0 extends z2.t {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC5670c f31804b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC5670c abstractC5670c, Looper looper) {
        super(looper);
        this.f31804b = abstractC5670c;
    }

    private static final void a(Message message) {
        h0 h0Var = (h0) message.obj;
        h0Var.b();
        h0Var.zzg();
    }

    private static final boolean b(Message message) {
        int i8 = message.what;
        return i8 == 2 || i8 == 1 || i8 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f31804b.f31732C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i8 = message.what;
        if ((i8 == 1 || i8 == 7 || ((i8 == 4 && !this.f31804b.c()) || message.what == 5)) && !this.f31804b.isConnecting()) {
            a(message);
            return;
        }
        int i9 = message.what;
        if (i9 == 4) {
            this.f31804b.f31758z = new C5392b(message.arg2);
            if (AbstractC5670c.D(this.f31804b)) {
                AbstractC5670c abstractC5670c = this.f31804b;
                if (!abstractC5670c.f31730A) {
                    abstractC5670c.E(3, null);
                    return;
                }
            }
            AbstractC5670c abstractC5670c2 = this.f31804b;
            C5392b c5392b = abstractC5670c2.f31758z != null ? abstractC5670c2.f31758z : new C5392b(8);
            this.f31804b.f31748p.onReportServiceBinding(c5392b);
            this.f31804b.l(c5392b);
            return;
        }
        if (i9 == 5) {
            AbstractC5670c abstractC5670c3 = this.f31804b;
            C5392b c5392b2 = abstractC5670c3.f31758z != null ? abstractC5670c3.f31758z : new C5392b(8);
            this.f31804b.f31748p.onReportServiceBinding(c5392b2);
            this.f31804b.l(c5392b2);
            return;
        }
        if (i9 == 3) {
            Object obj = message.obj;
            C5392b c5392b3 = new C5392b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f31804b.f31748p.onReportServiceBinding(c5392b3);
            this.f31804b.l(c5392b3);
            return;
        }
        if (i9 == 6) {
            this.f31804b.E(5, null);
            AbstractC5670c abstractC5670c4 = this.f31804b;
            if (abstractC5670c4.f31753u != null) {
                abstractC5670c4.f31753u.onConnectionSuspended(message.arg2);
            }
            this.f31804b.m(message.arg2);
            AbstractC5670c.C(this.f31804b, 5, 1, null);
            return;
        }
        if (i9 == 2 && !this.f31804b.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((h0) message.obj).zze();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
