package z;

import androidx.camera.core.InterfaceC0898q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z.i0 */
/* loaded from: classes.dex */
public class C6585i0 implements InterfaceC0898q {

    /* renamed from: a */
    private int f37815a;

    public C6585i0(int i8) {
        this.f37815a = i8;
    }

    @Override // androidx.camera.core.InterfaceC0898q
    public List<androidx.camera.core.r> filter(List<androidx.camera.core.r> list) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.r rVar : list) {
            Z.h.checkArgument(rVar instanceof InterfaceC6552A, "The camera info doesn't contain internal implementation.");
            Integer lensFacing = ((InterfaceC6552A) rVar).getLensFacing();
            if (lensFacing != null && lensFacing.intValue() == this.f37815a) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.core.InterfaceC0898q
    public /* bridge */ /* synthetic */ Z getIdentifier() {
        return super.getIdentifier();
    }

    public int getLensFacing() {
        return this.f37815a;
    }
}
