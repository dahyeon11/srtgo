package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final Map f10065a = new HashMap();

    public boolean approveCall(String name, int i8) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f10065a.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z8 = (iIntValue & i8) != 0;
        this.f10065a.put(name, Integer.valueOf(i8 | iIntValue));
        return !z8;
    }
}
