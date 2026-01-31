package z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: z.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6599p0 {

    /* renamed from: a, reason: collision with root package name */
    private Set f37840a = new HashSet();

    public void addAll(List<Object> list) {
        this.f37840a.addAll(list);
    }

    @Override // 
    public abstract AbstractC6599p0 clone();

    public List<Object> getAllItems() {
        return Collections.unmodifiableList(new ArrayList(this.f37840a));
    }
}
