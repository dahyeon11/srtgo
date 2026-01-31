package kotlin.reflect;

import f7.q;
import kotlin.reflect.KMutableProperty;

/* loaded from: classes3.dex */
public interface KMutableProperty2<D, E, V> extends KProperty2<D, E, V>, KMutableProperty<V> {

    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }

    public interface Setter<D, E, V> extends KMutableProperty.Setter<V>, q {
        @Override // f7.q
        /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3);
    }

    @Override // kotlin.reflect.KMutableProperty
    Setter<D, E, V> getSetter();

    @Override // kotlin.reflect.KProperty2, f7.p
    /* synthetic */ Object invoke(Object obj, Object obj2);

    void set(D d9, E e8, V v8);
}
