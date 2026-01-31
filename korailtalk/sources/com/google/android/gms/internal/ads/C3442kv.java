package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3442kv extends AbstractC2986gv {
    public C3442kv(InterfaceC4579uu interfaceC4579uu) {
        super(interfaceC4579uu);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final boolean zzt(String str) {
        String strZzf = L1.g.zzf(str);
        InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) this.f19447c.get();
        if (interfaceC4579uu != null && strZzf != null) {
            interfaceC4579uu.zzt(strZzf, this);
        }
        L1.n.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
