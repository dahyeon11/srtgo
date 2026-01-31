package Y7;

import Q7.C0708l;
import java.io.Writer;

/* loaded from: classes3.dex */
public class a extends b {

    /* renamed from: b, reason: collision with root package name */
    private final b[] f5659b;

    public a(b... bVarArr) {
        this.f5659b = (b[]) C0708l.clone(bVarArr);
    }

    @Override // Y7.b
    public int translate(CharSequence charSequence, int i8, Writer writer) {
        for (b bVar : this.f5659b) {
            int iTranslate = bVar.translate(charSequence, i8, writer);
            if (iTranslate != 0) {
                return iTranslate;
            }
        }
        return 0;
    }
}
