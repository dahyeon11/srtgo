package I2;

/* loaded from: classes2.dex */
final class w extends AbstractC0597a {

    /* renamed from: a, reason: collision with root package name */
    private final S f2037a = new S();

    w() {
    }

    @Override // I2.AbstractC0597a
    public final boolean isCancellationRequested() {
        return this.f2037a.isComplete();
    }

    @Override // I2.AbstractC0597a
    public final AbstractC0597a onCanceledRequested(InterfaceC0605i interfaceC0605i) {
        this.f2037a.addOnSuccessListener(AbstractC0610n.MAIN_THREAD, new C0612p(this, interfaceC0605i));
        return this;
    }

    public final void zza() {
        this.f2037a.zze(null);
    }
}
