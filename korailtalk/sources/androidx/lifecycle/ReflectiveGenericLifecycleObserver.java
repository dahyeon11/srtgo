package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.C1013b;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC1023l {

    /* renamed from: a, reason: collision with root package name */
    private final Object f10011a;

    /* renamed from: b, reason: collision with root package name */
    private final C1013b.a f10012b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f10011a = obj;
        this.f10012b = C1013b.f10018c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1023l
    public void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f10012b.a(interfaceC1025n, aVar, this.f10011a);
    }
}
