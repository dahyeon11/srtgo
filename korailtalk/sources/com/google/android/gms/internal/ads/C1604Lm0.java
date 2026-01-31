package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Lm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1604Lm0 {

    /* renamed from: b, reason: collision with root package name */
    static final C1604Lm0 f14351b = new C1604Lm0(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    final Throwable f14352a;

    /* renamed from: com.google.android.gms.internal.ads.Lm0$a */
    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    C1604Lm0(Throwable th) {
        th.getClass();
        this.f14352a = th;
    }
}
