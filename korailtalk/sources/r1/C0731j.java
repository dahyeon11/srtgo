package R1;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.InterfaceC1319En0;
import com.google.android.gms.internal.ads.InterfaceC3091hq;
import java.util.List;

/* renamed from: R1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0731j implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3091hq f4358a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f4359b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC0733l f4360c;

    C0731j(BinderC0733l binderC0733l, InterfaceC3091hq interfaceC3091hq, boolean z8) {
        this.f4358a = interfaceC3091hq;
        this.f4359b = z8;
        this.f4360c = binderC0733l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        try {
            this.f4358a.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<Uri> list = (List) obj;
        try {
            BinderC0733l.i(this.f4360c, list);
            this.f4358a.zzf(list);
            if (!this.f4360c.f4384n && !this.f4359b) {
                return;
            }
            for (Uri uri : list) {
                if (this.f4360c.p(uri)) {
                    this.f4360c.f4382l.zzc(BinderC0733l.z(uri, this.f4360c.f4392v, "1").toString(), null);
                } else {
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhG)).booleanValue()) {
                        this.f4360c.f4382l.zzc(uri.toString(), null);
                    }
                }
            }
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }
}
