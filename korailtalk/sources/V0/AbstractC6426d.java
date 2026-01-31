package v0;

import androidx.room.h;
import java.util.concurrent.atomic.AtomicBoolean;
import z0.InterfaceC6614f;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6426d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f37210a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final h f37211b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC6614f f37212c;

    public AbstractC6426d(h hVar) {
        this.f37211b = hVar;
    }

    private InterfaceC6614f b() {
        return this.f37211b.compileStatement(createQuery());
    }

    private InterfaceC6614f c(boolean z8) {
        if (!z8) {
            return b();
        }
        if (this.f37212c == null) {
            this.f37212c = b();
        }
        return this.f37212c;
    }

    protected void a() {
        this.f37211b.assertNotMainThread();
    }

    public InterfaceC6614f acquire() {
        a();
        return c(this.f37210a.compareAndSet(false, true));
    }

    protected abstract String createQuery();

    public void release(InterfaceC6614f interfaceC6614f) {
        if (interfaceC6614f == this.f37212c) {
            this.f37210a.set(false);
        }
    }
}
