package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class TF extends AbstractC4400tI {

    /* renamed from: b, reason: collision with root package name */
    private boolean f16430b;

    public TF(Set set) {
        super(set);
        this.f16430b = false;
    }

    public final synchronized void zza() {
        if (this.f16430b) {
            return;
        }
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.SF
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((VF) obj).zzr();
            }
        });
        this.f16430b = true;
    }
}
