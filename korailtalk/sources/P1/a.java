package P1;

import N1.n;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import y1.C6528i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3679a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3680b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f3681c;

    /* renamed from: d, reason: collision with root package name */
    private final C6528i f3682d;

    public a(Context context, List<n> list, Bundle bundle, C6528i c6528i) {
        this.f3679a = context;
        this.f3680b = list;
        this.f3681c = bundle;
        this.f3682d = c6528i;
    }

    public C6528i getAdSize() {
        return this.f3682d;
    }

    @Deprecated
    public n getConfiguration() {
        List list = this.f3680b;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (n) this.f3680b.get(0);
    }

    public List<n> getConfigurations() {
        return this.f3680b;
    }

    public Context getContext() {
        return this.f3679a;
    }

    public Bundle getNetworkExtras() {
        return this.f3681c;
    }
}
