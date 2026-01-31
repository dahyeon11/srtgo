package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements InterfaceC1023l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1017f[] f9938a;

    public CompositeGeneratedAdaptersObserver(InterfaceC1017f[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f9938a = generatedAdapters;
    }

    @Override // androidx.lifecycle.InterfaceC1023l
    public void onStateChanged(InterfaceC1025n source, AbstractC1019h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        new s();
        InterfaceC1017f[] interfaceC1017fArr = this.f9938a;
        if (interfaceC1017fArr.length > 0) {
            InterfaceC1017f interfaceC1017f = interfaceC1017fArr[0];
            throw null;
        }
        if (interfaceC1017fArr.length <= 0) {
            return;
        }
        InterfaceC1017f interfaceC1017f2 = interfaceC1017fArr[0];
        throw null;
    }
}
