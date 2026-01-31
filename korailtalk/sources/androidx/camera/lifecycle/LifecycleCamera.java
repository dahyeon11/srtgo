package androidx.camera.lifecycle;

import androidx.camera.core.InterfaceC0888l;
import androidx.camera.core.InterfaceC0892n;
import androidx.camera.core.h1;
import androidx.camera.core.r;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.InterfaceC1024m;
import androidx.lifecycle.InterfaceC1025n;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import z.InterfaceC6553B;
import z.InterfaceC6601s;

/* loaded from: classes.dex */
final class LifecycleCamera implements InterfaceC1024m, InterfaceC0888l {

    /* renamed from: b */
    private final InterfaceC1025n f7909b;

    /* renamed from: c */
    private final C.e f7910c;

    /* renamed from: a */
    private final Object f7908a = new Object();

    /* renamed from: d */
    private volatile boolean f7911d = false;

    /* renamed from: e */
    private boolean f7912e = false;

    /* renamed from: f */
    private boolean f7913f = false;

    LifecycleCamera(InterfaceC1025n interfaceC1025n, C.e eVar) {
        this.f7909b = interfaceC1025n;
        this.f7910c = eVar;
        if (interfaceC1025n.getLifecycle().getCurrentState().isAtLeast(AbstractC1019h.b.STARTED)) {
            eVar.attachUseCases();
        } else {
            eVar.detachUseCases();
        }
        interfaceC1025n.getLifecycle().addObserver(this);
    }

    void a(Collection collection) {
        synchronized (this.f7908a) {
            this.f7910c.addUseCases(collection);
        }
    }

    void b(Collection collection) {
        synchronized (this.f7908a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f7910c.getUseCases());
            this.f7910c.removeUseCases(arrayList);
        }
    }

    void c() {
        synchronized (this.f7908a) {
            C.e eVar = this.f7910c;
            eVar.removeUseCases(eVar.getUseCases());
        }
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public InterfaceC0892n getCameraControl() {
        return this.f7910c.getCameraControl();
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public r getCameraInfo() {
        return this.f7910c.getCameraInfo();
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public LinkedHashSet<InterfaceC6553B> getCameraInternals() {
        return this.f7910c.getCameraInternals();
    }

    public C.e getCameraUseCaseAdapter() {
        return this.f7910c;
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public InterfaceC6601s getExtendedConfig() {
        return this.f7910c.getExtendedConfig();
    }

    public InterfaceC1025n getLifecycleOwner() {
        InterfaceC1025n interfaceC1025n;
        synchronized (this.f7908a) {
            interfaceC1025n = this.f7909b;
        }
        return interfaceC1025n;
    }

    public List<h1> getUseCases() {
        List<h1> listUnmodifiableList;
        synchronized (this.f7908a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f7910c.getUseCases());
        }
        return listUnmodifiableList;
    }

    public boolean isActive() {
        boolean z8;
        synchronized (this.f7908a) {
            z8 = this.f7911d;
        }
        return z8;
    }

    public boolean isBound(h1 h1Var) {
        boolean zContains;
        synchronized (this.f7908a) {
            zContains = this.f7910c.getUseCases().contains(h1Var);
        }
        return zContains;
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public boolean isUseCasesCombinationSupported(h1... h1VarArr) {
        return this.f7910c.isUseCasesCombinationSupported(h1VarArr);
    }

    @v(AbstractC1019h.a.ON_DESTROY)
    public void onDestroy(InterfaceC1025n interfaceC1025n) {
        synchronized (this.f7908a) {
            C.e eVar = this.f7910c;
            eVar.removeUseCases(eVar.getUseCases());
        }
    }

    @v(AbstractC1019h.a.ON_PAUSE)
    public void onPause(InterfaceC1025n interfaceC1025n) {
        this.f7910c.setActiveResumingMode(false);
    }

    @v(AbstractC1019h.a.ON_RESUME)
    public void onResume(InterfaceC1025n interfaceC1025n) {
        this.f7910c.setActiveResumingMode(true);
    }

    @v(AbstractC1019h.a.ON_START)
    public void onStart(InterfaceC1025n interfaceC1025n) {
        synchronized (this.f7908a) {
            try {
                if (!this.f7912e && !this.f7913f) {
                    this.f7910c.attachUseCases();
                    this.f7911d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @v(AbstractC1019h.a.ON_STOP)
    public void onStop(InterfaceC1025n interfaceC1025n) {
        synchronized (this.f7908a) {
            try {
                if (!this.f7912e && !this.f7913f) {
                    this.f7910c.detachUseCases();
                    this.f7911d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public void setExtendedConfig(InterfaceC6601s interfaceC6601s) {
        this.f7910c.setExtendedConfig(interfaceC6601s);
    }

    public void suspend() {
        synchronized (this.f7908a) {
            try {
                if (this.f7912e) {
                    return;
                }
                onStop(this.f7909b);
                this.f7912e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unsuspend() {
        synchronized (this.f7908a) {
            try {
                if (this.f7912e) {
                    this.f7912e = false;
                    if (this.f7909b.getLifecycle().getCurrentState().isAtLeast(AbstractC1019h.b.STARTED)) {
                        onStart(this.f7909b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
