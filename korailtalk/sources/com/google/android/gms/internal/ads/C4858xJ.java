package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.xJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4858xJ extends AbstractC4400tI implements InterfaceC1992Vc {

    /* renamed from: b, reason: collision with root package name */
    private final Map f23682b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f23683c;

    /* renamed from: d, reason: collision with root package name */
    private final C4654va0 f23684d;

    public C4858xJ(Context context, Set set, C4654va0 c4654va0) {
        super(set);
        this.f23682b = new WeakHashMap(1);
        this.f23683c = context;
        this.f23684d = c4654va0;
    }

    public final synchronized void zza(View view) {
        try {
            ViewOnAttachStateChangeListenerC2033Wc viewOnAttachStateChangeListenerC2033Wc = (ViewOnAttachStateChangeListenerC2033Wc) this.f23682b.get(view);
            if (viewOnAttachStateChangeListenerC2033Wc == null) {
                ViewOnAttachStateChangeListenerC2033Wc viewOnAttachStateChangeListenerC2033Wc2 = new ViewOnAttachStateChangeListenerC2033Wc(this.f23683c, view);
                viewOnAttachStateChangeListenerC2033Wc2.zzc(this);
                this.f23682b.put(view, viewOnAttachStateChangeListenerC2033Wc2);
                viewOnAttachStateChangeListenerC2033Wc = viewOnAttachStateChangeListenerC2033Wc2;
            }
            if (this.f23684d.zzY) {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbp)).booleanValue()) {
                    viewOnAttachStateChangeListenerC2033Wc.zzg(((Long) H1.C.zzc().zza(AbstractC4439th.zzbo)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC2033Wc.zzf();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(View view) {
        if (this.f23682b.containsKey(view)) {
            ((ViewOnAttachStateChangeListenerC2033Wc) this.f23682b.get(view)).zze(this);
            this.f23682b.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
    public final synchronized void zzdp(final C1951Uc c1951Uc) {
        a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.wJ
            @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
            public final void zza(Object obj) {
                ((InterfaceC1992Vc) obj).zzdp(c1951Uc);
            }
        });
    }
}
