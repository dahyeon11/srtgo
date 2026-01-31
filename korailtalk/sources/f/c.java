package F;

import E.f;
import android.media.MediaCodec;
import androidx.camera.core.K0;
import androidx.camera.core.q1;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import z.S;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1120a;

    public c() {
        this.f1120a = E.a.get(f.class) != null;
    }

    private int b(S s8) {
        if (s8.getContainerClass() == MediaCodec.class || s8.getContainerClass() == q1.class) {
            return 2;
        }
        return s8.getContainerClass() == K0.class ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int c(S s8, S s9) {
        return b(s8) - b(s9);
    }

    public void sort(List<S> list) {
        if (this.f1120a) {
            Collections.sort(list, new Comparator() { // from class: F.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return this.f1119a.c((S) obj, (S) obj2);
                }
            });
        }
    }
}
