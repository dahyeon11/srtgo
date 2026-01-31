package g2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
final class y extends BasePendingResult {
    public y(AbstractC5544f abstractC5544f) {
        super(abstractC5544f);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final n createFailedResult(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
