package H1;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC1690Np;
import com.google.android.gms.internal.ads.InterfaceC1731Op;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;

/* renamed from: H1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0538h extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1698b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC1850Rn f1699c;

    C0538h(C0585x c0585x, Context context, InterfaceC1850Rn interfaceC1850Rn) {
        this.f1698b = context;
        this.f1699c = interfaceC1850Rn;
    }

    @Override // H1.AbstractC0588y
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzl(r2.b.wrap(this.f1698b), this.f1699c, 241806000);
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        try {
            return ((InterfaceC1731Op) L1.r.zzb(this.f1698b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new L1.p() { // from class: H1.g
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    return AbstractBinderC1690Np.zzb(obj);
                }
            })).zze(r2.b.wrap(this.f1698b), this.f1699c, 241806000);
        } catch (L1.q | RemoteException | NullPointerException unused) {
            return null;
        }
    }
}
