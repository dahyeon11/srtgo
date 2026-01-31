package R7;

import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class i {
    static Object a(Field field, Object obj) {
        try {
            Objects.requireNonNull(field, "field");
            return field.get(obj);
        } catch (IllegalAccessException e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
