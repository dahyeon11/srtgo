package Y7;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public class k extends b {
    @Override // Y7.b
    public int translate(CharSequence charSequence, int i8, Writer writer) throws IOException {
        int i9;
        int i10;
        if (charSequence.charAt(i8) != '\\' || (i9 = i8 + 1) >= charSequence.length() || charSequence.charAt(i9) != 'u') {
            return 0;
        }
        int i11 = 2;
        while (true) {
            i10 = i8 + i11;
            if (i10 >= charSequence.length() || charSequence.charAt(i10) != 'u') {
                break;
            }
            i11++;
        }
        if (i10 < charSequence.length() && charSequence.charAt(i10) == '+') {
            i11++;
        }
        int i12 = i8 + i11;
        int i13 = i12 + 4;
        if (i13 > charSequence.length()) {
            throw new IllegalArgumentException("Less than 4 hex digits in unicode value: '" + ((Object) charSequence.subSequence(i8, charSequence.length())) + "' due to end of CharSequence");
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(i12, i13);
        try {
            writer.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
            return i11 + 4;
        } catch (NumberFormatException e8) {
            throw new IllegalArgumentException("Unable to parse unicode value: " + ((Object) charSequenceSubSequence), e8);
        }
    }
}
