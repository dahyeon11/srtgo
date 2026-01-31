package J3;

import com.j256.ormlite.stmt.query.SimpleComparison;

/* loaded from: classes2.dex */
final class b extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f2579c;

    /* renamed from: d, reason: collision with root package name */
    private final short f2580d;

    b(g gVar, int i8, int i9) {
        super(gVar);
        this.f2579c = (short) i8;
        this.f2580d = (short) i9;
    }

    @Override // J3.g
    public void appendTo(M3.a aVar, byte[] bArr) {
        int i8 = 0;
        while (true) {
            short s8 = this.f2580d;
            if (i8 >= s8) {
                return;
            }
            if (i8 == 0 || (i8 == 31 && s8 <= 62)) {
                aVar.appendBits(31, 5);
                short s9 = this.f2580d;
                if (s9 > 62) {
                    aVar.appendBits(s9 - 31, 16);
                } else if (i8 == 0) {
                    aVar.appendBits(Math.min((int) s9, 31), 5);
                } else {
                    aVar.appendBits(s9 - 31, 5);
                }
            }
            aVar.appendBits(bArr[this.f2579c + i8], 8);
            i8++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(SimpleComparison.LESS_THAN_OPERATION);
        sb.append((int) this.f2579c);
        sb.append("::");
        sb.append((this.f2579c + this.f2580d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
