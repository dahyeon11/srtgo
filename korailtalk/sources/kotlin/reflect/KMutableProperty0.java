package kotlin.reflect;

import f7.l;
import kotlin.reflect.KMutableProperty;

/* loaded from: classes3.dex */
public interface KMutableProperty0<V> extends KProperty0<V>, KMutableProperty<V> {

    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }

    public interface Setter<V> extends KMutableProperty.Setter<V>, l {
        @Override // f7.l
        /* synthetic */ Object invoke(Object obj);
    }

    @Override // kotlin.reflect.KMutableProperty
    Setter<V> getSetter();

    @Override // kotlin.reflect.KProperty0, f7.InterfaceC5519a
    /* synthetic */ Object invoke();

    void set(V v8);
}
