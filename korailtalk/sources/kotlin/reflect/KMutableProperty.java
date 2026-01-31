package kotlin.reflect;

import R6.G;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public interface KMutableProperty<V> extends KProperty<V> {

    public static final class DefaultImpls {
        public static /* synthetic */ void getSetter$annotations() {
        }
    }

    public interface Setter<V> extends KProperty.Accessor<V>, KFunction<G> {
    }

    Setter<V> getSetter();
}
