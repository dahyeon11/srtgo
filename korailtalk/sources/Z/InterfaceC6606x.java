package z;

import android.content.Context;
import android.util.Size;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: z.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6606x {

    /* renamed from: z.x$a */
    public interface a {
        InterfaceC6606x newInstance(Context context, Object obj, Set<String> set);
    }

    boolean checkSupported(String str, List<H0> list);

    Map<N0, Size> getSuggestedResolutions(String str, List<H0> list, List<N0> list2);

    H0 transformSurfaceConfig(String str, int i8, Size size);
}
