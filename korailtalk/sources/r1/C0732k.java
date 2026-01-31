package R1;

import Q7.C0709m;
import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.InterfaceC1319En0;
import y1.EnumC6522c;

/* renamed from: R1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0732k implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC0733l f4361a;

    C0732k(BinderC0733l binderC0733l) {
        this.f4361a = binderC0733l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        G1.u.zzo().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        W.zzd(this.f4361a.f4381k, null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", EnumC6522c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", C0709m.TRUE), new Pair("sgi_rn", Integer.toString(this.f4361a.f4368C.get())));
        L1.n.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjI)).booleanValue() || this.f4361a.f4367B.get()) {
            return;
        }
        if (this.f4361a.f4368C.getAndIncrement() < ((Integer) H1.C.zzc().zza(AbstractC4439th.zzjJ)).intValue()) {
            this.f4361a.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        L1.n.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjI)).booleanValue()) {
            W.zzd(this.f4361a.f4381k, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", EnumC6522c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", C0709m.TRUE), new Pair("sgi_rn", Integer.toString(this.f4361a.f4368C.get())));
            this.f4361a.f4367B.set(true);
        }
    }
}
