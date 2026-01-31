package x;

import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import z.AbstractC6584i;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final w.e f37481a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f37482b;

    public c(w.e eVar) {
        this.f37481a = eVar;
        this.f37482b = eVar != null ? new HashSet(eVar.getSupportedResolutions()) : Collections.emptySet();
    }

    public boolean hasQuirk() {
        return this.f37481a != null;
    }

    public boolean hasValidVideoResolution(AbstractC6584i abstractC6584i) {
        if (abstractC6584i == null) {
            return false;
        }
        if (this.f37481a == null) {
            return true;
        }
        return this.f37482b.contains(new Size(abstractC6584i.getVideoFrameWidth(), abstractC6584i.getVideoFrameHeight()));
    }
}
