package H1;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C4116qq;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import r2.InterfaceC6172a;

/* renamed from: H1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0526d extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1678b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC1850Rn f1679c;

    C0526d(C0585x c0585x, Context context, InterfaceC1850Rn interfaceC1850Rn) {
        this.f1678b = context;
        this.f1679c = interfaceC1850Rn;
    }

    @Override // H1.AbstractC0588y
    protected final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1678b, "out_of_context_tester");
        return null;
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        Context context = this.f1678b;
        InterfaceC6172a interfaceC6172aWrap = r2.b.wrap(context);
        AbstractC4439th.zza(context);
        if (((Boolean) C.zzc().zza(AbstractC4439th.zzjt)).booleanValue()) {
            return interfaceC0542i0.zzh(interfaceC6172aWrap, this.f1679c, 241806000);
        }
        return null;
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        Context context = this.f1678b;
        InterfaceC6172a interfaceC6172aWrap = r2.b.wrap(context);
        AbstractC4439th.zza(context);
        if (!((Boolean) C.zzc().zza(AbstractC4439th.zzjt)).booleanValue()) {
            return null;
        }
        try {
            return ((P0) L1.r.zzb(this.f1678b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new L1.p() { // from class: H1.c
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return iInterfaceQueryLocalInterface instanceof P0 ? (P0) iInterfaceQueryLocalInterface : new P0(obj);
                }
            })).zze(interfaceC6172aWrap, this.f1679c, 241806000);
        } catch (L1.q | RemoteException | NullPointerException e8) {
            C4116qq.zza(this.f1678b).zzh(e8, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
