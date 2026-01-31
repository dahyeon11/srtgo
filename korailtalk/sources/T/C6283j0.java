package t;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z.InterfaceC6606x;

/* renamed from: t.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6283j0 implements InterfaceC6606x {

    /* renamed from: a, reason: collision with root package name */
    private final Map f36692a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6272e f36693b;

    /* renamed from: t.j0$a */
    class a implements InterfaceC6272e {
        a() {
        }

        @Override // t.InterfaceC6272e
        public CamcorderProfile get(int i8, int i9) {
            return CamcorderProfile.get(i8, i9);
        }

        @Override // t.InterfaceC6272e
        public boolean hasProfile(int i8, int i9) {
            return CamcorderProfile.hasProfile(i8, i9);
        }
    }

    public C6283j0(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }

    private void a(Context context, u.P p8, Set set) {
        Z.h.checkNotNull(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f36692a.put(str, new c1(context, str, p8, this.f36693b));
        }
    }

    @Override // z.InterfaceC6606x
    public boolean checkSupported(String str, List<z.H0> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        c1 c1Var = (c1) this.f36692a.get(str);
        if (c1Var != null) {
            return c1Var.b(list);
        }
        return false;
    }

    @Override // z.InterfaceC6606x
    public Map<z.N0, Size> getSuggestedResolutions(String str, List<z.H0> list, List<z.N0> list2) {
        Z.h.checkArgument(!list2.isEmpty(), "No new use cases to be bound.");
        c1 c1Var = (c1) this.f36692a.get(str);
        if (c1Var != null) {
            return c1Var.y(list, list2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // z.InterfaceC6606x
    public z.H0 transformSurfaceConfig(String str, int i8, Size size) {
        c1 c1Var = (c1) this.f36692a.get(str);
        if (c1Var != null) {
            return c1Var.L(i8, size);
        }
        return null;
    }

    C6283j0(Context context, InterfaceC6272e interfaceC6272e, Object obj, Set set) {
        this.f36692a = new HashMap();
        Z.h.checkNotNull(interfaceC6272e);
        this.f36693b = interfaceC6272e;
        a(context, obj instanceof u.P ? (u.P) obj : u.P.from(context), set);
    }
}
