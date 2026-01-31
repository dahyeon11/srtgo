package u2;

/* loaded from: classes2.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f37105a;

    /* synthetic */ j(l lVar, i iVar) {
        this.f37105a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA = this.f37105a.a();
        if (jA == -1 || o2.i.getInstance().currentTimeMillis() <= jA) {
            return;
        }
        l.e(this.f37105a.f37107a);
    }
}
