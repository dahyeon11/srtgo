package Y7;

import java.io.Writer;

/* loaded from: classes3.dex */
public abstract class c extends b {
    @Override // Y7.b
    public final int translate(CharSequence charSequence, int i8, Writer writer) {
        return translate(Character.codePointAt(charSequence, i8), writer) ? 1 : 0;
    }

    public abstract boolean translate(int i8, Writer writer);
}
