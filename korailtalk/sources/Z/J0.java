package z;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class J0 {

    /* renamed from: b, reason: collision with root package name */
    private static final J0 f37730b = new J0(new ArrayMap());

    /* renamed from: a, reason: collision with root package name */
    protected final Map f37731a;

    protected J0(Map map) {
        this.f37731a = map;
    }

    public static J0 create(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new J0(arrayMap);
    }

    public static J0 emptyBundle() {
        return f37730b;
    }

    public static J0 from(J0 j02) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : j02.listKeys()) {
            arrayMap.put(str, j02.getTag(str));
        }
        return new J0(arrayMap);
    }

    public Object getTag(String str) {
        return this.f37731a.get(str);
    }

    public Set<String> listKeys() {
        return this.f37731a.keySet();
    }
}
