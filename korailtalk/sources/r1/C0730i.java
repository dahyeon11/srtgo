package R1;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.InterfaceC1319En0;
import com.google.android.gms.internal.ads.InterfaceC3091hq;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: R1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0730i implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3091hq f4355a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f4356b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC0733l f4357c;

    C0730i(BinderC0733l binderC0733l, InterfaceC3091hq interfaceC3091hq, boolean z8) {
        this.f4355a = interfaceC3091hq;
        this.f4356b = z8;
        this.f4357c = binderC0733l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        try {
            this.f4355a.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f4355a.zzf(arrayList);
            if (!this.f4357c.f4383m && !this.f4356b) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (this.f4357c.q(uri)) {
                    this.f4357c.f4382l.zzc(BinderC0733l.z(uri, this.f4357c.f4392v, "1").toString(), null);
                } else {
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhG)).booleanValue()) {
                        this.f4357c.f4382l.zzc(uri.toString(), null);
                    }
                }
            }
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }
}
