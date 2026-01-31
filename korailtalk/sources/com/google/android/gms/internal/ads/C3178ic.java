package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ic, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3178ic extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private static volatile String f19960i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f19961j = new Object();

    public C3178ic(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        super(c1294Eb, "+pOuZc4XP/KXmz3ZcR0Th/zrptiqFMKeADXdr6ffDtBODTAlpCvFIUU/DK0sXoAh", "l4qa5EABhdRHJHltXD4U8dy0wNZl4oyoZ9TbFONnMI4=", c3357k9, i8, 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        this.f23265e.zzG("E");
        if (f19960i == null) {
            synchronized (f19961j) {
                try {
                    if (f19960i == null) {
                        f19960i = (String) this.f23266f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f23265e) {
            this.f23265e.zzG(f19960i);
        }
    }
}
