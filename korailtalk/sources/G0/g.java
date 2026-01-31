package G0;

import android.os.Handler;
import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;

/* loaded from: classes.dex */
public abstract class g {
    public abstract void close();

    public abstract WebMessagePort getFrameworkPort();

    public abstract InvocationHandler getInvocationHandler();

    public abstract void postMessage(f fVar);

    public abstract void setWebMessageCallback(a aVar);

    public abstract void setWebMessageCallback(Handler handler, a aVar);

    public static abstract class a {
        public void onMessage(g gVar, f fVar) {
        }
    }
}
