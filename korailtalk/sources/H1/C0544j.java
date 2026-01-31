package H1;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC1314El;
import com.google.android.gms.internal.ads.BinderC1396Gl;
import com.google.android.gms.internal.ads.BinderC4789wl;
import com.google.android.gms.internal.ads.InterfaceC1355Fl;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;

/* renamed from: H1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0544j extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1700b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC1850Rn f1701c;

    C0544j(C0585x c0585x, Context context, InterfaceC1850Rn interfaceC1850Rn, C1.a aVar) {
        this.f1700b = context;
        this.f1701c = interfaceC1850Rn;
    }

    @Override // H1.AbstractC0588y
    protected final /* synthetic */ Object zza() {
        return new BinderC1396Gl();
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzk(r2.b.wrap(this.f1700b), this.f1701c, 241806000, new BinderC4789wl(null));
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        try {
            return ((InterfaceC1355Fl) L1.r.zzb(this.f1700b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new L1.p() { // from class: H1.i
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    return AbstractBinderC1314El.zzb(obj);
                }
            })).zze(r2.b.wrap(this.f1700b), this.f1701c, 241806000, new BinderC4789wl(null));
        } catch (L1.q | RemoteException | NullPointerException unused) {
            return null;
        }
    }
}
