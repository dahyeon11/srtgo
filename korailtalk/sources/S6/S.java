package S6;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class S {
    public static final <K, V> V getOrImplicitDefaultNullable(Map<K, ? extends V> map, K k8) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof O) {
            return (V) ((O) map).getOrImplicitDefault(k8);
        }
        V v8 = map.get(k8);
        if (v8 != null || map.containsKey(k8)) {
            return v8;
        }
        throw new NoSuchElementException("Key " + k8 + " is missing in the map.");
    }

    public static final <K, V> Map<K, V> withDefault(Map<K, ? extends V> map, f7.l defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof O ? withDefault(((O) map).getMap(), defaultValue) : new P(map, defaultValue);
    }

    public static final <K, V> Map<K, V> withDefaultMutable(Map<K, V> map, f7.l defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof Y ? withDefaultMutable(((Y) map).getMap(), defaultValue) : new Z(map, defaultValue);
    }
}
