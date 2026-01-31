package f3;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;

/* renamed from: f3.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5460f implements Map.Entry {
    AbstractC5460f() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return e3.r.equal(getKey(), entry.getKey()) && e3.r.equal(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + SimpleComparison.EQUAL_TO_OPERATION + getValue();
    }
}
