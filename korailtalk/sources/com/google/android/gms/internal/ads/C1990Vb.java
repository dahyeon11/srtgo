package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1990Vb extends AbstractCallableC4657vc {
    public C1990Vb(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        super(c1294Eb, "2/TrxXzdli4Us4FPDPyGZmc5MrxtH8QgmFF/OAjS44SLVVLbzYRftaNDX3sVzVmu", "9ObkV+9nuY0gPBNLH25GoxM7YATuF1pi7IORvVFb3+Q=", c3357k9, i8, 5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        this.f23265e.zzn(-1L);
        this.f23265e.zzm(-1L);
        int[] iArr = (int[]) this.f23266f.invoke(null, this.f23262b.zzb());
        synchronized (this.f23265e) {
            try {
                this.f23265e.zzn(iArr[0]);
                this.f23265e.zzm(iArr[1]);
                int i8 = iArr[2];
                if (i8 != Integer.MIN_VALUE) {
                    this.f23265e.zzl(i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
