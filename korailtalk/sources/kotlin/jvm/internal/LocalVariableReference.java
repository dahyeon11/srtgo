package kotlin.jvm.internal;

import R6.C0751e;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes3.dex */
public class LocalVariableReference extends PropertyReference0 {
    @Override // kotlin.reflect.KProperty0
    public Object get() {
        LocalVariableReferencesKt.notSupportedError();
        throw new C0751e();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        LocalVariableReferencesKt.notSupportedError();
        throw new C0751e();
    }
}
