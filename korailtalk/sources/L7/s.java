package l7;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class s {
    public static final <T extends Appendable> T append(T t8, CharSequence... value) throws IOException {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (CharSequence charSequence : value) {
            t8.append(charSequence);
        }
        return t8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void appendElement(Appendable appendable, T t8, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t8));
            return;
        }
        if (t8 == 0 ? true : t8 instanceof CharSequence) {
            appendable.append((CharSequence) t8);
        } else if (t8 instanceof Character) {
            appendable.append(((Character) t8).charValue());
        } else {
            appendable.append(String.valueOf(t8));
        }
    }

    public static final <T extends Appendable> T appendRange(T t8, CharSequence value, int i8, int i9) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        T t9 = (T) t8.append(value, i8, i9);
        Intrinsics.checkNotNull(t9, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t9;
    }
}
