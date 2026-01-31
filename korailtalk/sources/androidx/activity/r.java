package androidx.activity;

import f7.InterfaceC5519a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6249a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f6250b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5519a f6251c;

    public r(boolean z8) {
        this.f6249a = z8;
    }

    public final void addCancellable(c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f6250b.add(cancellable);
    }

    public final InterfaceC5519a getEnabledChangedCallback$activity_release() {
        return this.f6251c;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void handleOnBackStarted(b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.f6249a;
    }

    public final void remove() {
        Iterator it = this.f6250b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).cancel();
        }
    }

    public final void removeCancellable(c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f6250b.remove(cancellable);
    }

    public final void setEnabled(boolean z8) {
        this.f6249a = z8;
        InterfaceC5519a interfaceC5519a = this.f6251c;
        if (interfaceC5519a != null) {
            interfaceC5519a.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(InterfaceC5519a interfaceC5519a) {
        this.f6251c = interfaceC5519a;
    }
}
