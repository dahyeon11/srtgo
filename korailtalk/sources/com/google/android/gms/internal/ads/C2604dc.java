package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2604dc extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f18640i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f18641j = new Object();

    public C2604dc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        super(c1294Eb, "tnRfJM39LV6MDlXml8e8fAfi5JhKcsRyFSmagsP97rbE/0XgA5fRVLlLbAYUcu57", "TvLSh+Eka5RyCXMK4IvAvP4vfksx/KqJwxjzSKu7qQs=", c3357k9, i8, 22);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        if (f18640i == null) {
            synchronized (f18641j) {
                try {
                    if (f18640i == null) {
                        f18640i = (Long) this.f23266f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f23265e) {
            this.f23265e.zzB(f18640i.longValue());
        }
    }
}
