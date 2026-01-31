package I2;

import java.util.concurrent.ExecutionException;

/* renamed from: I2.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0617v implements InterfaceC0616u {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2029a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f2030b;

    /* renamed from: c, reason: collision with root package name */
    private final S f2031c;

    /* renamed from: d, reason: collision with root package name */
    private int f2032d;

    /* renamed from: e, reason: collision with root package name */
    private int f2033e;

    /* renamed from: f, reason: collision with root package name */
    private int f2034f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f2035g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2036h;

    public C0617v(int i8, S s8) {
        this.f2030b = i8;
        this.f2031c = s8;
    }

    private final void a() {
        if (this.f2032d + this.f2033e + this.f2034f == this.f2030b) {
            if (this.f2035g == null) {
                if (this.f2036h) {
                    this.f2031c.zzc();
                    return;
                } else {
                    this.f2031c.zzb(null);
                    return;
                }
            }
            this.f2031c.zza(new ExecutionException(this.f2033e + " out of " + this.f2030b + " underlying tasks failed", this.f2035g));
        }
    }

    @Override // I2.InterfaceC0616u, I2.InterfaceC0601e
    public final void onCanceled() {
        synchronized (this.f2029a) {
            this.f2034f++;
            this.f2036h = true;
            a();
        }
    }

    @Override // I2.InterfaceC0616u, I2.InterfaceC0603g
    public final void onFailure(Exception exc) {
        synchronized (this.f2029a) {
            this.f2033e++;
            this.f2035g = exc;
            a();
        }
    }

    @Override // I2.InterfaceC0616u, I2.InterfaceC0604h
    public final void onSuccess(Object obj) {
        synchronized (this.f2029a) {
            this.f2032d++;
            a();
        }
    }
}
