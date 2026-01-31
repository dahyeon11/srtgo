package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Rb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1826Rb extends AbstractCallableC4657vc {
    public C1826Rb(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9) {
        super(c1294Eb, "d7YRusR2mxxBt1bBYjK2gXVvJl/MfqFw2IiZZVeFOFqksQBErGXLOKgf56kYtWpK", "q4VBjxb/Ij/RcUKEcmQK+TpC64QFNLpq6sfIawaWN1g=", c3357k9, i8, 49);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() throws InvocationTargetException {
        this.f23265e.zzf(Z9.ENUM_FAILURE);
        try {
            this.f23265e.zzf(((Boolean) this.f23266f.invoke(null, this.f23262b.zzb())).booleanValue() ? Z9.ENUM_TRUE : Z9.ENUM_FALSE);
        } catch (InvocationTargetException e8) {
            if (!(e8.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e8;
            }
        }
    }
}
