package androidx.work;

import H0.j;
import androidx.work.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // H0.j
    public b merge(List<b> list) {
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            map.putAll(it.next().getKeyValueMap());
        }
        aVar.putAll(map);
        return aVar.build();
    }
}
