package g2;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import h2.C5592i;
import h2.C5596m;
import i2.AbstractC5683p;

/* renamed from: g2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5548j {
    public static AbstractC5547i canceledPendingResult() {
        C5596m c5596m = new C5596m(Looper.getMainLooper());
        c5596m.cancel();
        return c5596m;
    }

    public static <R extends n> AbstractC5547i immediateFailedResult(R r8, AbstractC5544f abstractC5544f) {
        AbstractC5683p.checkNotNull(r8, "Result must not be null");
        AbstractC5683p.checkArgument(!r8.getStatus().isSuccess(), "Status code must not be SUCCESS");
        x xVar = new x(abstractC5544f, r8);
        xVar.setResult(r8);
        return xVar;
    }

    public static <R extends n> AbstractC5546h immediatePendingResult(R r8) {
        AbstractC5683p.checkNotNull(r8, "Result must not be null");
        y yVar = new y(null);
        yVar.setResult(r8);
        return new C5592i(yVar);
    }

    public static <R extends n> AbstractC5547i canceledPendingResult(R r8) {
        AbstractC5683p.checkNotNull(r8, "Result must not be null");
        AbstractC5683p.checkArgument(r8.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        w wVar = new w(r8);
        wVar.cancel();
        return wVar;
    }

    public static <R extends n> AbstractC5546h immediatePendingResult(R r8, AbstractC5544f abstractC5544f) {
        AbstractC5683p.checkNotNull(r8, "Result must not be null");
        y yVar = new y(abstractC5544f);
        yVar.setResult(r8);
        return new C5592i(yVar);
    }

    public static AbstractC5547i immediatePendingResult(Status status) {
        AbstractC5683p.checkNotNull(status, "Result must not be null");
        C5596m c5596m = new C5596m(Looper.getMainLooper());
        c5596m.setResult(status);
        return c5596m;
    }

    public static AbstractC5547i immediatePendingResult(Status status, AbstractC5544f abstractC5544f) {
        AbstractC5683p.checkNotNull(status, "Result must not be null");
        C5596m c5596m = new C5596m(abstractC5544f);
        c5596m.setResult(status);
        return c5596m;
    }
}
