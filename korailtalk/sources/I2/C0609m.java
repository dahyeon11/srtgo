package I2;

/* renamed from: I2.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0609m {

    /* renamed from: a, reason: collision with root package name */
    private final S f2023a = new S();

    public C0609m() {
    }

    public AbstractC0608l getTask() {
        return this.f2023a;
    }

    public void setException(Exception exc) {
        this.f2023a.zza(exc);
    }

    public void setResult(Object obj) {
        this.f2023a.zzb(obj);
    }

    public boolean trySetException(Exception exc) {
        return this.f2023a.zzd(exc);
    }

    public boolean trySetResult(Object obj) {
        return this.f2023a.zze(obj);
    }

    public C0609m(AbstractC0597a abstractC0597a) {
        abstractC0597a.onCanceledRequested(new N(this));
    }
}
