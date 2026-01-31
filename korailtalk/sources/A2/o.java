package A2;

/* loaded from: classes2.dex */
final class o extends n {

    /* renamed from: b, reason: collision with root package name */
    private final m f72b = new m();

    o() {
    }

    @Override // A2.n
    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f72b.zza(th, true).add(th2);
    }
}
