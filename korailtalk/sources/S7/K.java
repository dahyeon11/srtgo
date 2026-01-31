package s7;

/* loaded from: classes3.dex */
public final class K {
    public final String symbol;

    public K(String str) {
        this.symbol = str;
    }

    public String toString() {
        return '<' + this.symbol + '>';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T unbox(Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }
}
