package f3;

import java.util.Map;

/* renamed from: f3.T, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5447T extends X implements Map.Entry {
    protected AbstractC5447T() {
    }

    protected abstract Map.Entry a();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return a().getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return a().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return a().hashCode();
    }

    public Object setValue(Object obj) {
        return a().setValue(obj);
    }
}
