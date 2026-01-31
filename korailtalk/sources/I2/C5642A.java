package i2;

import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

/* renamed from: i2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5642A {
    public final Set<Scope> zaa;

    public C5642A(Set<Scope> set) {
        AbstractC5683p.checkNotNull(set);
        this.zaa = Collections.unmodifiableSet(set);
    }
}
