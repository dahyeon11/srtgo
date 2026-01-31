package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.kc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3404kc extends AbstractCallableC4657vc {
    public C3404kc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        super(c1294Eb, "0njjbCFUq6vJ1UgnErUI7KEtLgZLN7V9IJ5yZ3QtzXmjMaTjzKInpeDNakYTgh0P", "C8NIMy/t/HZjKrbJt0Xe/Cv+czK1jvEhHHQsIVfXSJE=", c3357k9, i8, 73);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        try {
            this.f23265e.zzI(((Boolean) this.f23266f.invoke(null, this.f23262b.zzb())).booleanValue() ? Z9.ENUM_TRUE : Z9.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.f23265e.zzI(Z9.ENUM_FAILURE);
        }
    }
}
