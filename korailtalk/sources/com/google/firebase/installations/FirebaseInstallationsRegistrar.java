package com.google.firebase.installations;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import s3.InterfaceC6215c;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements n3.i {
    static /* synthetic */ h lambda$getComponents$0(n3.f fVar) {
        return new g((l3.c) fVar.get(l3.c.class), (y3.h) fVar.get(y3.h.class), (InterfaceC6215c) fVar.get(InterfaceC6215c.class));
    }

    @Override // n3.i
    public List<n3.e> getComponents() {
        return Arrays.asList(n3.e.builder(h.class).add(n3.o.required(l3.c.class)).add(n3.o.required(InterfaceC6215c.class)).add(n3.o.required(y3.h.class)).factory(j.f25730a).build(), y3.g.create("fire-installations", "16.3.3"));
    }
}
