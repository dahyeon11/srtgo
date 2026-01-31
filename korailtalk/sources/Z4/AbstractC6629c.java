package z4;

/* renamed from: z4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6629c {
    public static /* synthetic */ String a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i8 = 1; i8 < charSequenceArr.length; i8++) {
                sb.append(charSequence);
                sb.append(charSequenceArr[i8]);
            }
        }
        return sb.toString();
    }
}
