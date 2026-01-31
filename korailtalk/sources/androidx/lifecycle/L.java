package androidx.lifecycle;

import k0.AbstractC5837a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class L {
    public static final AbstractC5837a defaultCreationExtras(N owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC1018g ? ((InterfaceC1018g) owner).getDefaultViewModelCreationExtras() : AbstractC5837a.C0336a.INSTANCE;
    }

    public static final /* synthetic */ <VM extends J> VM get(K k8) {
        Intrinsics.checkNotNullParameter(k8, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) k8.get(J.class);
    }
}
