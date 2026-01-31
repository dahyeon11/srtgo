package g2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
final class x extends BasePendingResult {

    /* renamed from: p, reason: collision with root package name */
    private final n f31316p;

    public x(AbstractC5544f abstractC5544f, n nVar) {
        super(abstractC5544f);
        this.f31316p = nVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final n createFailedResult(Status status) {
        return this.f31316p;
    }
}
