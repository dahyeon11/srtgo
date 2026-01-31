package f3;

import java.util.Map;
import java.util.Set;

/* renamed from: f3.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5476n extends Map {
    Object forcePut(Object obj, Object obj2);

    InterfaceC5476n inverse();

    @Override // java.util.Map
    Object put(Object obj, Object obj2);

    @Override // java.util.Map
    void putAll(Map<Object, Object> map);

    @Override // f3.InterfaceC5476n
    Set<Object> values();
}
