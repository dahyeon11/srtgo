package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4738wG extends AbstractC4400tI implements InterfaceC3990pk {

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f23444b;

    C4738wG(Set set) {
        super(set);
        this.f23444b = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3990pk
    public final synchronized void zza(String str, Bundle bundle) {
        this.f23444b.putAll(bundle);
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.vG
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((U1.a) obj).onAdMetadataChanged();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.f23444b);
    }
}
