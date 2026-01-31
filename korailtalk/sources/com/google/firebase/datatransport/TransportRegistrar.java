package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Collections;
import java.util.List;
import m1.g;
import n3.e;
import n3.f;
import n3.i;
import n3.o;
import o1.q;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements i {
    static /* synthetic */ g lambda$getComponents$0(f fVar) {
        q.initialize((Context) fVar.get(Context.class));
        return q.getInstance().newFactory(com.google.android.datatransport.cct.a.LEGACY_INSTANCE);
    }

    @Override // n3.i
    public List<e> getComponents() {
        return Collections.singletonList(e.builder(g.class).add(o.required(Context.class)).factory(a.f25606a).build());
    }
}
