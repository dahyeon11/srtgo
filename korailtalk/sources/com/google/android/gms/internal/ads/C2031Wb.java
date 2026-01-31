package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2031Wb extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f17018i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f17019j = new Object();

    public C2031Wb(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        super(c1294Eb, "KvkOAolI09ZSAixqGUOtipMDBdKXVlslzVnQOpfDZOEJW+xbFKrK173Gu3h1RVkI", "SkMlFTLt8H3eQLYvgf87g2pXBfp4xPpxL3RMs974XSU=", c3357k9, i8, 44);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        if (f17018i == null) {
            synchronized (f17019j) {
                try {
                    if (f17018i == null) {
                        f17018i = (Long) this.f23266f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f23265e) {
            this.f23265e.zzp(f17018i.longValue());
        }
    }
}
