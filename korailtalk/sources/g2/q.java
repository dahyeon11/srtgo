package g2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e0;

/* loaded from: classes.dex */
public abstract class q {
    public final AbstractC5547i createFailedResult(Status status) {
        return new e0(status);
    }

    public abstract AbstractC5547i onSuccess(n nVar);

    public Status onFailure(Status status) {
        return status;
    }
}
