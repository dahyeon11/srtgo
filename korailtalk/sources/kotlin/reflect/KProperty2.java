package kotlin.reflect;

import f7.p;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public interface KProperty2<D, E, V> extends KProperty<V>, p {

    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }

    public interface Getter<D, E, V> extends KProperty.Getter<V>, p {
        @Override // f7.p
        /* synthetic */ Object invoke(Object obj, Object obj2);
    }

    V get(D d9, E e8);

    Object getDelegate(D d9, E e8);

    @Override // kotlin.reflect.KProperty
    Getter<D, E, V> getGetter();

    @Override // f7.p
    /* synthetic */ Object invoke(Object obj, Object obj2);
}
