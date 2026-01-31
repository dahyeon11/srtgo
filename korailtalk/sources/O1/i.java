package o1;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
abstract class i {
    static Executor a() {
        return Executors.newSingleThreadExecutor();
    }
}
