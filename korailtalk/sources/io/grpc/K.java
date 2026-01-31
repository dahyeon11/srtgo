package io.grpc;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class K {
    public List<E0> getServices() {
        return Collections.emptyList();
    }

    public final B0 lookupMethod(String str) {
        return lookupMethod(str, null);
    }

    public abstract B0 lookupMethod(String str, String str2);
}
