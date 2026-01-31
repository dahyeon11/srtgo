package g2;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class p implements o {
    public abstract void onFailure(Status status);

    @Override // g2.o
    public final void onResult(n nVar) {
        Status status = nVar.getStatus();
        if (status.isSuccess()) {
            onSuccess(nVar);
            return;
        }
        onFailure(status);
        if (nVar instanceof InterfaceC5549k) {
            try {
                ((InterfaceC5549k) nVar).release();
            } catch (RuntimeException e8) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(nVar)), e8);
            }
        }
    }

    public abstract void onSuccess(n nVar);
}
