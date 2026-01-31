package H0;

import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.C;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class w {
    protected w() {
    }

    @Deprecated
    public static w getInstance() {
        I0.i iVar = I0.i.getInstance();
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static void initialize(Context context, androidx.work.a aVar) {
        I0.i.initialize(context, aVar);
    }

    public final u beginUniqueWork(String str, f fVar, n nVar) {
        return beginUniqueWork(str, fVar, Collections.singletonList(nVar));
    }

    public abstract u beginUniqueWork(String str, f fVar, List<n> list);

    public final u beginWith(n nVar) {
        return beginWith(Collections.singletonList(nVar));
    }

    public abstract u beginWith(List<n> list);

    public abstract o cancelAllWork();

    public abstract o cancelAllWorkByTag(String str);

    public abstract o cancelUniqueWork(String str);

    public abstract o cancelWorkById(UUID uuid);

    public abstract PendingIntent createCancelPendingIntent(UUID uuid);

    public final o enqueue(y yVar) {
        return enqueue(Collections.singletonList(yVar));
    }

    public abstract o enqueue(List<? extends y> list);

    public abstract o enqueueUniquePeriodicWork(String str, e eVar, q qVar);

    public o enqueueUniqueWork(String str, f fVar, n nVar) {
        return enqueueUniqueWork(str, fVar, Collections.singletonList(nVar));
    }

    public abstract o enqueueUniqueWork(String str, f fVar, List<n> list);

    public abstract C getLastCancelAllTimeMillis();

    public abstract LiveData getLastCancelAllTimeMillisLiveData();

    public abstract C getWorkInfoById(UUID uuid);

    public abstract LiveData getWorkInfoByIdLiveData(UUID uuid);

    public abstract C getWorkInfos(x xVar);

    public abstract C getWorkInfosByTag(String str);

    public abstract LiveData getWorkInfosByTagLiveData(String str);

    public abstract C getWorkInfosForUniqueWork(String str);

    public abstract LiveData getWorkInfosForUniqueWorkLiveData(String str);

    public abstract LiveData getWorkInfosLiveData(x xVar);

    public abstract o pruneWork();

    public static w getInstance(Context context) {
        return I0.i.getInstance(context);
    }
}
