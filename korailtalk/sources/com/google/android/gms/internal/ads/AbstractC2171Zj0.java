package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Zj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2171Zj0 extends AbstractC4105qk0 implements InterfaceC3651ml0 {
    protected AbstractC2171Zj0(Map map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC4105qk0
    final Collection f(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4105qk0
    final Collection g(Object obj, Collection collection) {
        return i(obj, (List) collection, null);
    }
}
