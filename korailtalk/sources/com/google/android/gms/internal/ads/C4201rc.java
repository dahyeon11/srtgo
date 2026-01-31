package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4201rc extends AbstractCallableC4657vc {
    public C4201rc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        super(c1294Eb, "5HcA415u1KU8m2yVlDZBhQQK+0IFNRmmWPxuAq0DnfPzSdJ/uWlnYMD1kKfkH6cZ", "u7Ufq5yuXkEXg69T8jpWuOOX55Q9g2DSVI1gtbNUvY8=", c3357k9, i8, 48);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        this.f23265e.zzaa(Z9.ENUM_FAILURE);
        boolean zBooleanValue = ((Boolean) this.f23266f.invoke(null, this.f23262b.zzb())).booleanValue();
        synchronized (this.f23265e) {
            try {
                if (zBooleanValue) {
                    this.f23265e.zzaa(Z9.ENUM_TRUE);
                } else {
                    this.f23265e.zzaa(Z9.ENUM_FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
