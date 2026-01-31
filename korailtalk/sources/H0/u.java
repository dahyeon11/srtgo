package H0;

import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u {
    public static u combine(List<u> list) {
        return list.get(0).a(list);
    }

    protected abstract u a(List list);

    public abstract o enqueue();

    public abstract C getWorkInfos();

    public abstract LiveData getWorkInfosLiveData();

    public final u then(n nVar) {
        return then(Collections.singletonList(nVar));
    }

    public abstract u then(List<n> list);
}
