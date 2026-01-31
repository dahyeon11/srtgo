package kotlin.reflect;

import f7.p;
import kotlin.reflect.KMutableProperty;

/* loaded from: classes3.dex */
public interface KMutableProperty1<T, V> extends KProperty1<T, V>, KMutableProperty<V> {

    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }

    public interface Setter<T, V> extends KMutableProperty.Setter<V>, p {
        @Override // f7.p
        /* synthetic */ Object invoke(Object obj, Object obj2);
    }

    @Override // kotlin.reflect.KMutableProperty
    Setter<T, V> getSetter();

    @Override // kotlin.reflect.KProperty1, f7.l
    /* synthetic */ Object invoke(Object obj);

    void set(T t8, V v8);
}
