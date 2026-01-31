package I2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: I2.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0613q implements InterfaceC0599c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f2026a;

    C0613q(Collection collection) {
        this.f2026a = collection;
    }

    @Override // I2.InterfaceC0599c
    public final /* bridge */ /* synthetic */ Object then(AbstractC0608l abstractC0608l) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2026a.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0608l) it.next()).getResult());
        }
        return arrayList;
    }
}
