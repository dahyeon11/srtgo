package I2;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
final class r implements InterfaceC0599c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f2027a;

    r(Collection collection) {
        this.f2027a = collection;
    }

    @Override // I2.InterfaceC0599c
    public final /* bridge */ /* synthetic */ Object then(AbstractC0608l abstractC0608l) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f2027a);
        return AbstractC0611o.forResult(arrayList);
    }
}
