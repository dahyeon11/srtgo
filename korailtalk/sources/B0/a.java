package B0;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public interface a {
    Object create(Context context);

    List<Class<? extends a>> dependencies();
}
