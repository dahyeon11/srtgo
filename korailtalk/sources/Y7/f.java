package Y7;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class f extends b {

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f5671b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f5672c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final int f5673d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5674e;

    public f(CharSequence[]... charSequenceArr) {
        int i8 = Integer.MAX_VALUE;
        int i9 = 0;
        if (charSequenceArr != null) {
            int i10 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.f5671b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
                this.f5672c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
                int length = charSequenceArr2[0].length();
                i8 = length < i8 ? length : i8;
                if (length > i10) {
                    i10 = length;
                }
            }
            i9 = i10;
        }
        this.f5673d = i8;
        this.f5674e = i9;
    }

    @Override // Y7.b
    public int translate(CharSequence charSequence, int i8, Writer writer) throws IOException {
        if (!this.f5672c.contains(Character.valueOf(charSequence.charAt(i8)))) {
            return 0;
        }
        int length = this.f5674e;
        if (i8 + length > charSequence.length()) {
            length = charSequence.length() - i8;
        }
        while (length >= this.f5673d) {
            String str = (String) this.f5671b.get(charSequence.subSequence(i8, i8 + length).toString());
            if (str != null) {
                writer.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
