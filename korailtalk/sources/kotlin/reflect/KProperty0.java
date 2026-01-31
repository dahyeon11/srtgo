package kotlin.reflect;

import f7.InterfaceC5519a;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public interface KProperty0<V> extends KProperty<V>, InterfaceC5519a {

    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }

    public interface Getter<V> extends KProperty.Getter<V>, InterfaceC5519a {
        @Override // f7.InterfaceC5519a
        /* synthetic */ Object invoke();
    }

    V get();

    Object getDelegate();

    @Override // kotlin.reflect.KProperty
    Getter<V> getGetter();

    @Override // f7.InterfaceC5519a
    /* synthetic */ Object invoke();
}
