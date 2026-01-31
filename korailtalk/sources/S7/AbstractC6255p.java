package s7;

import R6.q;

/* renamed from: s7.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6255p {
    static {
        Object objM67constructorimpl;
        try {
            q.a aVar = R6.q.Companion;
            objM67constructorimpl = R6.q.m67constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            q.a aVar2 = R6.q.Companion;
            objM67constructorimpl = R6.q.m67constructorimpl(R6.r.createFailure(th));
        }
        R6.q.m73isSuccessimpl(objM67constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return true;
    }
}
