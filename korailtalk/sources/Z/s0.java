package z;

import android.util.ArrayMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s0 extends J0 {
    private s0(Map map) {
        super(map);
    }

    public static s0 create() {
        return new s0(new ArrayMap());
    }

    public static s0 from(J0 j02) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : j02.listKeys()) {
            arrayMap.put(str, j02.getTag(str));
        }
        return new s0(arrayMap);
    }

    public void addTagBundle(J0 j02) {
        Map map;
        Map map2 = this.f37731a;
        if (map2 == null || (map = j02.f37731a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void putTag(String str, Object obj) {
        this.f37731a.put(str, obj);
    }
}
