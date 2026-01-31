package I2;

import android.app.Activity;
import i2.AbstractC5683p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class S extends AbstractC0608l {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2014a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final M f2015b = new M();

    /* renamed from: c, reason: collision with root package name */
    private boolean f2016c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f2017d;

    /* renamed from: e, reason: collision with root package name */
    private Object f2018e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f2019f;

    S() {
    }

    private final void a() {
        AbstractC5683p.checkState(this.f2016c, "Task is not yet complete");
    }

    private final void b() {
        if (this.f2017d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void c() {
        if (this.f2016c) {
            throw C0600d.of(this);
        }
    }

    private final void d() {
        synchronized (this.f2014a) {
            try {
                if (this.f2016c) {
                    this.f2015b.zzb(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnCanceledListener(Activity activity, InterfaceC0601e interfaceC0601e) {
        C c9 = new C(AbstractC0610n.MAIN_THREAD, interfaceC0601e);
        this.f2015b.zza(c9);
        Q.zza(activity).zzb(c9);
        d();
        return this;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnCompleteListener(Activity activity, InterfaceC0602f interfaceC0602f) {
        E e8 = new E(AbstractC0610n.MAIN_THREAD, interfaceC0602f);
        this.f2015b.zza(e8);
        Q.zza(activity).zzb(e8);
        d();
        return this;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnFailureListener(Activity activity, InterfaceC0603g interfaceC0603g) {
        G g8 = new G(AbstractC0610n.MAIN_THREAD, interfaceC0603g);
        this.f2015b.zza(g8);
        Q.zza(activity).zzb(g8);
        d();
        return this;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnSuccessListener(Activity activity, InterfaceC0604h interfaceC0604h) {
        I i8 = new I(AbstractC0610n.MAIN_THREAD, interfaceC0604h);
        this.f2015b.zza(i8);
        Q.zza(activity).zzb(i8);
        d();
        return this;
    }

    @Override // I2.AbstractC0608l
    public final <TContinuationResult> AbstractC0608l continueWith(InterfaceC0599c interfaceC0599c) {
        return continueWith(AbstractC0610n.MAIN_THREAD, interfaceC0599c);
    }

    @Override // I2.AbstractC0608l
    public final <TContinuationResult> AbstractC0608l continueWithTask(InterfaceC0599c interfaceC0599c) {
        return continueWithTask(AbstractC0610n.MAIN_THREAD, interfaceC0599c);
    }

    @Override // I2.AbstractC0608l
    public final Exception getException() {
        Exception exc;
        synchronized (this.f2014a) {
            exc = this.f2019f;
        }
        return exc;
    }

    @Override // I2.AbstractC0608l
    public final Object getResult() {
        Object obj;
        synchronized (this.f2014a) {
            try {
                a();
                b();
                Exception exc = this.f2019f;
                if (exc != null) {
                    throw new C0606j(exc);
                }
                obj = this.f2018e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // I2.AbstractC0608l
    public final boolean isCanceled() {
        return this.f2017d;
    }

    @Override // I2.AbstractC0608l
    public final boolean isComplete() {
        boolean z8;
        synchronized (this.f2014a) {
            z8 = this.f2016c;
        }
        return z8;
    }

    @Override // I2.AbstractC0608l
    public final boolean isSuccessful() {
        boolean z8;
        synchronized (this.f2014a) {
            try {
                z8 = false;
                if (this.f2016c && !this.f2017d && this.f2019f == null) {
                    z8 = true;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // I2.AbstractC0608l
    public final <TContinuationResult> AbstractC0608l onSuccessTask(InterfaceC0607k interfaceC0607k) {
        Executor executor = AbstractC0610n.MAIN_THREAD;
        S s8 = new S();
        this.f2015b.zza(new K(executor, interfaceC0607k, s8));
        d();
        return s8;
    }

    public final void zza(Exception exc) {
        AbstractC5683p.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f2014a) {
            c();
            this.f2016c = true;
            this.f2019f = exc;
        }
        this.f2015b.zzb(this);
    }

    public final void zzb(Object obj) {
        synchronized (this.f2014a) {
            c();
            this.f2016c = true;
            this.f2018e = obj;
        }
        this.f2015b.zzb(this);
    }

    public final boolean zzc() {
        synchronized (this.f2014a) {
            try {
                if (this.f2016c) {
                    return false;
                }
                this.f2016c = true;
                this.f2017d = true;
                this.f2015b.zzb(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(Exception exc) {
        AbstractC5683p.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f2014a) {
            try {
                if (this.f2016c) {
                    return false;
                }
                this.f2016c = true;
                this.f2019f = exc;
                this.f2015b.zzb(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zze(Object obj) {
        synchronized (this.f2014a) {
            try {
                if (this.f2016c) {
                    return false;
                }
                this.f2016c = true;
                this.f2018e = obj;
                this.f2015b.zzb(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I2.AbstractC0608l
    public final <TContinuationResult> AbstractC0608l continueWith(Executor executor, InterfaceC0599c interfaceC0599c) {
        S s8 = new S();
        this.f2015b.zza(new y(executor, interfaceC0599c, s8));
        d();
        return s8;
    }

    @Override // I2.AbstractC0608l
    public final <TContinuationResult> AbstractC0608l continueWithTask(Executor executor, InterfaceC0599c interfaceC0599c) {
        S s8 = new S();
        this.f2015b.zza(new A(executor, interfaceC0599c, s8));
        d();
        return s8;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnCanceledListener(InterfaceC0601e interfaceC0601e) {
        addOnCanceledListener(AbstractC0610n.MAIN_THREAD, interfaceC0601e);
        return this;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnCompleteListener(InterfaceC0602f interfaceC0602f) {
        this.f2015b.zza(new E(AbstractC0610n.MAIN_THREAD, interfaceC0602f));
        d();
        return this;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnFailureListener(InterfaceC0603g interfaceC0603g) {
        addOnFailureListener(AbstractC0610n.MAIN_THREAD, interfaceC0603g);
        return this;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnSuccessListener(InterfaceC0604h interfaceC0604h) {
        addOnSuccessListener(AbstractC0610n.MAIN_THREAD, interfaceC0604h);
        return this;
    }

    @Override // I2.AbstractC0608l
    public final <TContinuationResult> AbstractC0608l onSuccessTask(Executor executor, InterfaceC0607k interfaceC0607k) {
        S s8 = new S();
        this.f2015b.zza(new K(executor, interfaceC0607k, s8));
        d();
        return s8;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnCanceledListener(Executor executor, InterfaceC0601e interfaceC0601e) {
        this.f2015b.zza(new C(executor, interfaceC0601e));
        d();
        return this;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnFailureListener(Executor executor, InterfaceC0603g interfaceC0603g) {
        this.f2015b.zza(new G(executor, interfaceC0603g));
        d();
        return this;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnSuccessListener(Executor executor, InterfaceC0604h interfaceC0604h) {
        this.f2015b.zza(new I(executor, interfaceC0604h));
        d();
        return this;
    }

    @Override // I2.AbstractC0608l
    public final AbstractC0608l addOnCompleteListener(Executor executor, InterfaceC0602f interfaceC0602f) {
        this.f2015b.zza(new E(executor, interfaceC0602f));
        d();
        return this;
    }

    @Override // I2.AbstractC0608l
    public final <X extends Throwable> Object getResult(Class<X> cls) {
        Object obj;
        synchronized (this.f2014a) {
            try {
                a();
                b();
                if (!cls.isInstance(this.f2019f)) {
                    Exception exc = this.f2019f;
                    if (exc == null) {
                        obj = this.f2018e;
                    } else {
                        throw new C0606j(exc);
                    }
                } else {
                    throw cls.cast(this.f2019f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
