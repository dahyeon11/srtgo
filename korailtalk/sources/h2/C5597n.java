package h2;

import I2.AbstractC0608l;
import I2.C0609m;
import com.google.android.gms.common.api.Status;
import g2.C5540b;

/* renamed from: h2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5597n {
    public static void setResultOrApiException(Status status, C0609m c0609m) {
        setResultOrApiException(status, null, c0609m);
    }

    @Deprecated
    public static AbstractC0608l toVoidTaskThatFailsOnFalse(AbstractC0608l abstractC0608l) {
        return abstractC0608l.continueWith(new P());
    }

    public static <ResultT> boolean trySetResultOrApiException(Status status, ResultT resultt, C0609m c0609m) {
        return status.isSuccess() ? c0609m.trySetResult(resultt) : c0609m.trySetException(new C5540b(status));
    }

    public static <TResult> void setResultOrApiException(Status status, TResult tresult, C0609m c0609m) {
        if (status.isSuccess()) {
            c0609m.setResult(tresult);
        } else {
            c0609m.setException(new C5540b(status));
        }
    }
}
