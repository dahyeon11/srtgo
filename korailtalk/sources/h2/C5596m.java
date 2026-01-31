package h2;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import g2.AbstractC5544f;

/* renamed from: h2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5596m extends BasePendingResult {
    @Deprecated
    public C5596m(Looper looper) {
        super(looper);
    }

    public C5596m(AbstractC5544f abstractC5544f) {
        super(abstractC5544f);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ g2.n createFailedResult(Status status) {
        return status;
    }
}
