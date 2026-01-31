package S0;

import I0.i;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class a {
    public static a getInstance(Context context) {
        i.getInstance(context).getRemoteWorkManager();
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }
}
