package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import f2.C5392b;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    private static c f25103e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f25104a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f25105b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    private C0202c f25106c;

    /* renamed from: d, reason: collision with root package name */
    private C0202c f25107d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.c((C0202c) message.obj);
            return true;
        }
    }

    interface b {
        void dismiss(int i8);

        void show();
    }

    /* renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    private static class C0202c {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference f25109a;

        /* renamed from: b, reason: collision with root package name */
        int f25110b;

        /* renamed from: c, reason: collision with root package name */
        boolean f25111c;

        C0202c(int i8, b bVar) {
            this.f25109a = new WeakReference(bVar);
            this.f25110b = i8;
        }

        boolean a(b bVar) {
            return bVar != null && this.f25109a.get() == bVar;
        }
    }

    private c() {
    }

    private boolean a(C0202c c0202c, int i8) {
        b bVar = (b) c0202c.f25109a.get();
        if (bVar == null) {
            return false;
        }
        this.f25105b.removeCallbacksAndMessages(c0202c);
        bVar.dismiss(i8);
        return true;
    }

    static c b() {
        if (f25103e == null) {
            f25103e = new c();
        }
        return f25103e;
    }

    private boolean d(b bVar) {
        C0202c c0202c = this.f25106c;
        return c0202c != null && c0202c.a(bVar);
    }

    private boolean e(b bVar) {
        C0202c c0202c = this.f25107d;
        return c0202c != null && c0202c.a(bVar);
    }

    private void f(C0202c c0202c) {
        int i8 = c0202c.f25110b;
        if (i8 == -2) {
            return;
        }
        if (i8 <= 0) {
            i8 = i8 == -1 ? C5392b.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.f25105b.removeCallbacksAndMessages(c0202c);
        Handler handler = this.f25105b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0202c), i8);
    }

    private void g() {
        C0202c c0202c = this.f25107d;
        if (c0202c != null) {
            this.f25106c = c0202c;
            this.f25107d = null;
            b bVar = (b) c0202c.f25109a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f25106c = null;
            }
        }
    }

    void c(C0202c c0202c) {
        synchronized (this.f25104a) {
            try {
                if (this.f25106c == c0202c || this.f25107d == c0202c) {
                    a(c0202c, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void dismiss(b bVar, int i8) {
        synchronized (this.f25104a) {
            try {
                if (d(bVar)) {
                    a(this.f25106c, i8);
                } else if (e(bVar)) {
                    a(this.f25107d, i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isCurrent(b bVar) {
        boolean zD;
        synchronized (this.f25104a) {
            zD = d(bVar);
        }
        return zD;
    }

    public boolean isCurrentOrNext(b bVar) {
        boolean z8;
        synchronized (this.f25104a) {
            try {
                z8 = d(bVar) || e(bVar);
            } finally {
            }
        }
        return z8;
    }

    public void onDismissed(b bVar) {
        synchronized (this.f25104a) {
            try {
                if (d(bVar)) {
                    this.f25106c = null;
                    if (this.f25107d != null) {
                        g();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onShown(b bVar) {
        synchronized (this.f25104a) {
            try {
                if (d(bVar)) {
                    f(this.f25106c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void pauseTimeout(b bVar) {
        synchronized (this.f25104a) {
            try {
                if (d(bVar)) {
                    C0202c c0202c = this.f25106c;
                    if (!c0202c.f25111c) {
                        c0202c.f25111c = true;
                        this.f25105b.removeCallbacksAndMessages(c0202c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void restoreTimeoutIfPaused(b bVar) {
        synchronized (this.f25104a) {
            try {
                if (d(bVar)) {
                    C0202c c0202c = this.f25106c;
                    if (c0202c.f25111c) {
                        c0202c.f25111c = false;
                        f(c0202c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void show(int i8, b bVar) {
        synchronized (this.f25104a) {
            try {
                if (d(bVar)) {
                    C0202c c0202c = this.f25106c;
                    c0202c.f25110b = i8;
                    this.f25105b.removeCallbacksAndMessages(c0202c);
                    f(this.f25106c);
                    return;
                }
                if (e(bVar)) {
                    this.f25107d.f25110b = i8;
                } else {
                    this.f25107d = new C0202c(i8, bVar);
                }
                C0202c c0202c2 = this.f25106c;
                if (c0202c2 == null || !a(c0202c2, 4)) {
                    this.f25106c = null;
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
