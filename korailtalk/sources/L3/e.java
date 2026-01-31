package l3;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
public class e extends Exception {
    protected e() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super(str);
        AbstractC5683p.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, Throwable th) {
        super(str, th);
        AbstractC5683p.checkNotEmpty(str, "Detail message must not be empty");
    }
}
