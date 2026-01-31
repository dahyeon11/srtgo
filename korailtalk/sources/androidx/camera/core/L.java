package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0902s0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
abstract class L implements InterfaceC0902s0 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC0902s0 f7443a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f7444b = new HashSet();

    interface a {
        void onImageClose(InterfaceC0902s0 interfaceC0902s0);
    }

    protected L(InterfaceC0902s0 interfaceC0902s0) {
        this.f7443a = interfaceC0902s0;
    }

    synchronized void a(a aVar) {
        this.f7444b.add(aVar);
    }

    protected void b() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f7444b);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onImageClose(this);
        }
    }

    @Override // androidx.camera.core.InterfaceC0902s0, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f7443a.close();
        }
        b();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized Rect getCropRect() {
        return this.f7443a.getCropRect();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized int getFormat() {
        return this.f7443a.getFormat();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized int getHeight() {
        return this.f7443a.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized Image getImage() {
        return this.f7443a.getImage();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized InterfaceC0897p0 getImageInfo() {
        return this.f7443a.getImageInfo();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized InterfaceC0902s0.a[] getPlanes() {
        return this.f7443a.getPlanes();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized int getWidth() {
        return this.f7443a.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC0902s0
    public synchronized void setCropRect(Rect rect) {
        this.f7443a.setCropRect(rect);
    }
}
