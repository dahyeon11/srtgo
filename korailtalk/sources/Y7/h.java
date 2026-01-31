package Y7;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* loaded from: classes3.dex */
public class h extends b {

    /* renamed from: b, reason: collision with root package name */
    private final EnumSet f5678b;

    public enum a {
        semiColonRequired,
        semiColonOptional,
        errorIfNoSemiColon
    }

    public h(a... aVarArr) {
        if (aVarArr.length > 0) {
            this.f5678b = EnumSet.copyOf((Collection) Arrays.asList(aVarArr));
        } else {
            this.f5678b = EnumSet.copyOf((Collection) Collections.singletonList(a.semiColonRequired));
        }
    }

    public boolean isSet(a aVar) {
        EnumSet enumSet = this.f5678b;
        return enumSet != null && enumSet.contains(aVar);
    }

    @Override // Y7.b
    public int translate(CharSequence charSequence, int i8, Writer writer) throws IOException {
        int i9;
        int length = charSequence.length();
        if (charSequence.charAt(i8) == '&' && i8 < length - 2 && charSequence.charAt(i8 + 1) == '#') {
            int i10 = i8 + 2;
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == 'x' || cCharAt == 'X') {
                i10 = i8 + 3;
                if (i10 == length) {
                    return 0;
                }
                i9 = 1;
            } else {
                i9 = 0;
            }
            int i11 = i10;
            while (i11 < length && ((charSequence.charAt(i11) >= '0' && charSequence.charAt(i11) <= '9') || ((charSequence.charAt(i11) >= 'a' && charSequence.charAt(i11) <= 'f') || (charSequence.charAt(i11) >= 'A' && charSequence.charAt(i11) <= 'F')))) {
                i11++;
            }
            int i12 = (i11 == length || charSequence.charAt(i11) != ';') ? 0 : 1;
            if (i12 == 0) {
                if (isSet(a.semiColonRequired)) {
                    return 0;
                }
                if (isSet(a.errorIfNoSemiColon)) {
                    throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            try {
                int i13 = i9 != 0 ? Integer.parseInt(charSequence.subSequence(i10, i11).toString(), 16) : Integer.parseInt(charSequence.subSequence(i10, i11).toString(), 10);
                if (i13 > 65535) {
                    char[] chars = Character.toChars(i13);
                    writer.write(chars[0]);
                    writer.write(chars[1]);
                } else {
                    writer.write(i13);
                }
                return ((i11 + 2) - i10) + i9 + i12;
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
