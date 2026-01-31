package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3746nc extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private final StackTraceElement[] f21327i;

    public C3746nc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, StackTraceElement[] stackTraceElementArr) {
        super(c1294Eb, "9douHjmTTjq3N4YYUdzzHaKyxIqsB5K92p8t26vKQB1HahpVak+32YHan4LmgLPE", "q6oLc2ULDKRAR1VDdX5lO9/kb0NHjx7PMACMr/7cZL8=", c3357k9, i8, 45);
        this.f21327i = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.f21327i;
        if (stackTraceElementArr != null) {
            C4541ub c4541ub = new C4541ub((String) this.f23266f.invoke(null, stackTraceElementArr));
            synchronized (this.f23265e) {
                try {
                    this.f23265e.zzL(c4541ub.zza.longValue());
                    if (c4541ub.zzb.booleanValue()) {
                        this.f23265e.zzA(c4541ub.zzc.booleanValue() ? Z9.ENUM_FALSE : Z9.ENUM_TRUE);
                    } else {
                        this.f23265e.zzA(Z9.ENUM_FAILURE);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
