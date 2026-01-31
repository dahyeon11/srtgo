package H1;

import com.google.android.gms.internal.ads.AbstractBinderC2509cm;
import java.util.ArrayList;
import java.util.List;

/* renamed from: H1.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC0561o1 extends AbstractBinderC2509cm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0564p1 f1723a;

    /* synthetic */ BinderC0561o1(C0564p1 c0564p1, AbstractC0558n1 abstractC0558n1) {
        this.f1723a = c0564p1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2509cm, com.google.android.gms.internal.ads.InterfaceC2624dm
    public final void zzb(List list) {
        ArrayList arrayList;
        synchronized (this.f1723a.f1729a) {
            this.f1723a.f1731c = false;
            this.f1723a.f1732d = true;
            arrayList = new ArrayList(this.f1723a.f1730b);
            this.f1723a.f1730b.clear();
        }
        C0564p1.k(list);
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.f.a(arrayList.get(0));
        throw null;
    }
}
