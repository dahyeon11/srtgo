package V0;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f5076a = new ArrayList();

    void a(u uVar) {
        this.f5076a.add(uVar);
    }

    public void apply(Path path) {
        for (int size = this.f5076a.size() - 1; size >= 0; size--) {
            f1.j.applyTrimPathIfNeeded(path, (u) this.f5076a.get(size));
        }
    }
}
