package J3;

import com.j256.ormlite.stmt.query.SimpleComparison;

/* loaded from: classes2.dex */
final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f2588c;

    /* renamed from: d, reason: collision with root package name */
    private final short f2589d;

    e(g gVar, int i8, int i9) {
        super(gVar);
        this.f2588c = (short) i8;
        this.f2589d = (short) i9;
    }

    @Override // J3.g
    void appendTo(M3.a aVar, byte[] bArr) {
        aVar.appendBits(this.f2588c, this.f2589d);
    }

    public String toString() {
        short s8 = this.f2588c;
        short s9 = this.f2589d;
        return SimpleComparison.LESS_THAN_OPERATION + Integer.toBinaryString((s8 & ((1 << s9) - 1)) | (1 << s9) | (1 << this.f2589d)).substring(1) + '>';
    }
}
