package Y7;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public class i extends b {
    private boolean a(char c9) {
        return c9 >= '0' && c9 <= '7';
    }

    private boolean b(char c9) {
        return c9 >= '0' && c9 <= '3';
    }

    @Override // Y7.b
    public int translate(CharSequence charSequence, int i8, Writer writer) throws IOException {
        int length = (charSequence.length() - i8) - 1;
        StringBuilder sb = new StringBuilder();
        if (charSequence.charAt(i8) != '\\' || length <= 0) {
            return 0;
        }
        int i9 = i8 + 1;
        if (!a(charSequence.charAt(i9))) {
            return 0;
        }
        int i10 = i8 + 2;
        int i11 = i8 + 3;
        sb.append(charSequence.charAt(i9));
        if (length > 1 && a(charSequence.charAt(i10))) {
            sb.append(charSequence.charAt(i10));
            if (length > 2 && b(charSequence.charAt(i9)) && a(charSequence.charAt(i11))) {
                sb.append(charSequence.charAt(i11));
            }
        }
        writer.write(Integer.parseInt(sb.toString(), 8));
        return sb.length() + 1;
    }
}
