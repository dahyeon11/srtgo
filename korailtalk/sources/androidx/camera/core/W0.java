package androidx.camera.core;

import android.util.SparseArray;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z.InterfaceC6579f0;

/* loaded from: classes.dex */
final class W0 implements InterfaceC6579f0 {

    /* renamed from: e, reason: collision with root package name */
    private final List f7564e;

    /* renamed from: f, reason: collision with root package name */
    private String f7565f;

    /* renamed from: a, reason: collision with root package name */
    final Object f7560a = new Object();

    /* renamed from: b, reason: collision with root package name */
    final SparseArray f7561b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f7562c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private final List f7563d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f7566g = false;

    class a implements c.InterfaceC0123c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7567a;

        a(int i8) {
            this.f7567a = i8;
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0123c
        public Object attachCompleter(c.a aVar) {
            synchronized (W0.this.f7560a) {
                W0.this.f7561b.put(this.f7567a, aVar);
            }
            return "getImageProxy(id: " + this.f7567a + ")";
        }
    }

    W0(List list, String str) {
        this.f7564e = list;
        this.f7565f = str;
        d();
    }

    private void d() {
        synchronized (this.f7560a) {
            try {
                Iterator it = this.f7564e.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    this.f7562c.put(iIntValue, androidx.concurrent.futures.c.getFuture(new a(iIntValue)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(InterfaceC0902s0 interfaceC0902s0) {
        synchronized (this.f7560a) {
            try {
                if (this.f7566g) {
                    return;
                }
                Integer num = (Integer) interfaceC0902s0.getImageInfo().getTagBundle().getTag(this.f7565f);
                if (num == null) {
                    throw new IllegalArgumentException("CaptureId is null.");
                }
                c.a aVar = (c.a) this.f7561b.get(num.intValue());
                if (aVar != null) {
                    this.f7563d.add(interfaceC0902s0);
                    aVar.set(interfaceC0902s0);
                } else {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void b() {
        synchronized (this.f7560a) {
            try {
                if (this.f7566g) {
                    return;
                }
                Iterator it = this.f7563d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0902s0) it.next()).close();
                }
                this.f7563d.clear();
                this.f7562c.clear();
                this.f7561b.clear();
                this.f7566g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void c() {
        synchronized (this.f7560a) {
            try {
                if (this.f7566g) {
                    return;
                }
                Iterator it = this.f7563d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0902s0) it.next()).close();
                }
                this.f7563d.clear();
                this.f7562c.clear();
                this.f7561b.clear();
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6579f0
    public List<Integer> getCaptureIds() {
        return Collections.unmodifiableList(this.f7564e);
    }

    @Override // z.InterfaceC6579f0
    public com.google.common.util.concurrent.C getImageProxy(int i8) {
        com.google.common.util.concurrent.C c9;
        synchronized (this.f7560a) {
            try {
                if (this.f7566g) {
                    throw new IllegalStateException("ImageProxyBundle already closed.");
                }
                c9 = (com.google.common.util.concurrent.C) this.f7562c.get(i8);
                if (c9 == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9;
    }
}
