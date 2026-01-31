package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4088qc extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f21962i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f21963j = new Object();

    public C4088qc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        super(c1294Eb, "5kY1EQ+6snGNdZX1BEywItRy0EAwZ4DbRiPucqHAgfZR8kr75HzXIMEIf0cE9z11", "NtWyZSC7qBNyKPaXbOjRpNaZGUUAwpDpvYkB4v1ZH9M=", c3357k9, i8, 33);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        if (f21962i == null) {
            synchronized (f21963j) {
                try {
                    if (f21962i == null) {
                        f21962i = (Long) this.f23266f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f23265e) {
            this.f23265e.zzac(f21962i.longValue());
        }
    }
}
