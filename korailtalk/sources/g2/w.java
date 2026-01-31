package g2;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
final class w extends BasePendingResult {

    /* renamed from: p, reason: collision with root package name */
    private final n f31315p;

    public w(n nVar) {
        super(Looper.getMainLooper());
        this.f31315p = nVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final n createFailedResult(Status status) {
        if (status.getStatusCode() == this.f31315p.getStatus().getStatusCode()) {
            return this.f31315p;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
