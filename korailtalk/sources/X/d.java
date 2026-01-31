package x;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f37483a;

    public d(String str) {
        this.f37483a = str;
    }

    public List<Size> get(int i8) {
        w.k kVar = (w.k) w.i.get(w.k.class);
        return kVar == null ? new ArrayList() : kVar.getExcludedSizes(this.f37483a, i8);
    }
}
