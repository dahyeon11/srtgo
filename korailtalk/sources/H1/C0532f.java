package H1;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2021Vs;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import com.google.android.gms.internal.ads.InterfaceC2062Ws;

/* renamed from: H1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0532f extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1681b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC1850Rn f1682c;

    C0532f(C0585x c0585x, Context context, InterfaceC1850Rn interfaceC1850Rn) {
        this.f1681b = context;
        this.f1682c = interfaceC1850Rn;
    }

    @Override // H1.AbstractC0588y
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzp(r2.b.wrap(this.f1681b), this.f1682c, 241806000);
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        try {
            return ((InterfaceC2062Ws) L1.r.zzb(this.f1681b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new L1.p() { // from class: H1.e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    return AbstractBinderC2021Vs.zzb(obj);
                }
            })).zze(r2.b.wrap(this.f1681b), this.f1682c, 241806000);
        } catch (L1.q | RemoteException | NullPointerException unused) {
            return null;
        }
    }
}
