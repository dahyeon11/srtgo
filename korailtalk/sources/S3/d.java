package S3;

/* loaded from: classes2.dex */
final class d extends k {
    d() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }

    @Override // S3.k
    public int getDataLengthForInterleavedBlock(int i8) {
        return i8 <= 8 ? 156 : 155;
    }

    @Override // S3.k
    public int getInterleavedBlockCount() {
        return 10;
    }
}
