package L1;

/* loaded from: classes.dex */
final class e extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f3008a;

    e(g gVar, String str) {
        this.f3008a = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new s(null).zza(this.f3008a);
    }
}
