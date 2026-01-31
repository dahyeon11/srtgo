package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l0 {
    public static final Status zaa = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a, reason: collision with root package name */
    final Set f12074a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b, reason: collision with root package name */
    private final k0 f12075b = new k0(this);

    final void a(BasePendingResult basePendingResult) {
        this.f12074a.add(basePendingResult);
        basePendingResult.zan(this.f12075b);
    }

    public final void zab() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f12074a.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                this.f12074a.remove(basePendingResult);
            }
        }
    }
}
