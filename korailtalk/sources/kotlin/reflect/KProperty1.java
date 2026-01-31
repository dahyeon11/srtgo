package kotlin.reflect;

import f7.l;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public interface KProperty1<T, V> extends KProperty<V>, l {

    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }

    public interface Getter<T, V> extends KProperty.Getter<V>, l {
        @Override // f7.l
        /* synthetic */ Object invoke(Object obj);
    }

    V get(T t8);

    Object getDelegate(T t8);

    @Override // kotlin.reflect.KProperty
    Getter<T, V> getGetter();

    @Override // f7.l
    /* synthetic */ Object invoke(Object obj);
}
