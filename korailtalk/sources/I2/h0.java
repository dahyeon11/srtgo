package i2;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f31810a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31811b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5670c f31812c;

    public h0(AbstractC5670c abstractC5670c, Object obj) {
        this.f31812c = abstractC5670c;
        this.f31810a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void zze() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f31810a;
                if (this.f31811b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f31811b = true;
        }
        zzg();
    }

    public final void zzf() {
        synchronized (this) {
            this.f31810a = null;
        }
    }

    public final void zzg() {
        zzf();
        synchronized (this.f31812c.f31750r) {
            this.f31812c.f31750r.remove(this);
        }
    }
}
