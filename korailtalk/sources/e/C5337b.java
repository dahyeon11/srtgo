package e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5337b {

    /* renamed from: a, reason: collision with root package name */
    private final Set f30134a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f30135b;

    public final void addOnContextAvailableListener(InterfaceC5338c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f30135b;
        if (context != null) {
            listener.onContextAvailable(context);
        }
        this.f30134a.add(listener);
    }

    public final void clearAvailableContext() {
        this.f30135b = null;
    }

    public final void dispatchOnContextAvailable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30135b = context;
        Iterator it = this.f30134a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5338c) it.next()).onContextAvailable(context);
        }
    }

    public final Context peekAvailableContext() {
        return this.f30135b;
    }

    public final void removeOnContextAvailableListener(InterfaceC5338c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30134a.remove(listener);
    }
}
