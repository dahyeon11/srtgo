package com.google.android.gms.internal.ads;

import java.util.Set;
import y1.C6514A;

/* loaded from: classes2.dex */
public final class ZJ extends AbstractC4400tI {

    /* renamed from: b, reason: collision with root package name */
    private boolean f17560b;

    protected ZJ(Set set) {
        super(set);
    }

    public final void zza() {
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.WJ
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((C6514A.a) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.UJ
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((C6514A.a) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.f17560b) {
                a(new XJ());
                this.f17560b = true;
            }
            a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.YJ
                @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
                public final void zza(Object obj) {
                    ((C6514A.a) obj).onVideoPlay();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        a(new XJ());
        this.f17560b = true;
    }
}
