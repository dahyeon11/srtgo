package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4850xF extends AbstractC4400tI implements InterfaceC0517a {
    public C4850xF(Set set) {
        super(set);
    }

    @Override // H1.InterfaceC0517a
    public final void onAdClicked() {
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.wF
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((InterfaceC0517a) obj).onAdClicked();
            }
        });
    }
}
