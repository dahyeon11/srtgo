package androidx.work;

import H0.l;
import H0.w;
import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements B0.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11097a = l.tagWithPrefix("WrkMgrInitializer");

    @Override // B0.a
    public List<Class<? extends B0.a>> dependencies() {
        return Collections.emptyList();
    }

    @Override // B0.a
    public w create(Context context) {
        l.get().debug(f11097a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        w.initialize(context, new a.b().build());
        return w.getInstance(context);
    }
}
