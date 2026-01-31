package com.google.protobuf;

import com.google.protobuf.C5230m0;
import com.google.protobuf.R1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class H1 {

    /* renamed from: f */
    private static final H1 f26164f = new H1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f26165a;

    /* renamed from: b */
    private int[] f26166b;

    /* renamed from: c */
    private Object[] f26167c;

    /* renamed from: d */
    private int f26168d;

    /* renamed from: e */
    private boolean f26169e;

    private H1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i8) {
        int[] iArr = this.f26166b;
        if (i8 > iArr.length) {
            int i9 = this.f26165a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f26166b = Arrays.copyOf(iArr, i8);
            this.f26167c = Arrays.copyOf(this.f26167c, i8);
        }
    }

    private static int c(int[] iArr, int i8) {
        int i9 = 17;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        return i9;
    }

    private static int d(Object[] objArr, int i8) {
        int iHashCode = 17;
        for (int i9 = 0; i9 < i8; i9++) {
            iHashCode = (iHashCode * 31) + objArr[i9].hashCode();
        }
        return iHashCode;
    }

    static H1 f(H1 h12, H1 h13) {
        int i8 = h12.f26165a + h13.f26165a;
        int[] iArrCopyOf = Arrays.copyOf(h12.f26166b, i8);
        System.arraycopy(h13.f26166b, 0, iArrCopyOf, h12.f26165a, h13.f26165a);
        Object[] objArrCopyOf = Arrays.copyOf(h12.f26167c, i8);
        System.arraycopy(h13.f26167c, 0, objArrCopyOf, h12.f26165a, h13.f26165a);
        return new H1(i8, iArrCopyOf, objArrCopyOf, true);
    }

    static H1 g() {
        return new H1();
    }

    public static H1 getDefaultInstance() {
        return f26164f;
    }

    private static boolean h(Object[] objArr, Object[] objArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (!objArr[i9].equals(objArr2[i9])) {
                return false;
            }
        }
        return true;
    }

    private static boolean k(int[] iArr, int[] iArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (iArr[i9] != iArr2[i9]) {
                return false;
            }
        }
        return true;
    }

    private static void m(int i8, Object obj, R1 r12) {
        int tagFieldNumber = P1.getTagFieldNumber(i8);
        int tagWireType = P1.getTagWireType(i8);
        if (tagWireType == 0) {
            r12.writeInt64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            r12.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            r12.writeBytes(tagFieldNumber, (AbstractC5235o) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(C5230m0.d());
            }
            r12.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
        } else if (r12.fieldOrder() == R1.a.ASCENDING) {
            r12.writeStartGroup(tagFieldNumber);
            ((H1) obj).writeTo(r12);
            r12.writeEndGroup(tagFieldNumber);
        } else {
            r12.writeEndGroup(tagFieldNumber);
            ((H1) obj).writeTo(r12);
            r12.writeStartGroup(tagFieldNumber);
        }
    }

    void a() {
        if (!this.f26169e) {
            throw new UnsupportedOperationException();
        }
    }

    H1 e(H1 h12) {
        if (h12.equals(getDefaultInstance())) {
            return this;
        }
        a();
        int i8 = this.f26165a + h12.f26165a;
        b(i8);
        System.arraycopy(h12.f26166b, 0, this.f26166b, this.f26165a, h12.f26165a);
        System.arraycopy(h12.f26167c, 0, this.f26167c, this.f26165a, h12.f26165a);
        this.f26165a = i8;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H1)) {
            return false;
        }
        H1 h12 = (H1) obj;
        int i8 = this.f26165a;
        return i8 == h12.f26165a && k(this.f26166b, h12.f26166b, i8) && h(this.f26167c, h12.f26167c, this.f26165a);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i8 = this.f26168d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f26165a; i10++) {
            int i11 = this.f26166b[i10];
            int tagFieldNumber = P1.getTagFieldNumber(i11);
            int tagWireType = P1.getTagWireType(i11);
            if (tagWireType == 0) {
                iComputeUInt64Size = AbstractC5248t.computeUInt64Size(tagFieldNumber, ((Long) this.f26167c[i10]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = AbstractC5248t.computeFixed64Size(tagFieldNumber, ((Long) this.f26167c[i10]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = AbstractC5248t.computeBytesSize(tagFieldNumber, (AbstractC5235o) this.f26167c[i10]);
            } else if (tagWireType == 3) {
                iComputeUInt64Size = (AbstractC5248t.computeTagSize(tagFieldNumber) * 2) + ((H1) this.f26167c[i10]).getSerializedSize();
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(C5230m0.d());
                }
                iComputeUInt64Size = AbstractC5248t.computeFixed32Size(tagFieldNumber, ((Integer) this.f26167c[i10]).intValue());
            }
            i9 += iComputeUInt64Size;
        }
        this.f26168d = i9;
        return i9;
    }

    public int getSerializedSizeAsMessageSet() {
        int i8 = this.f26168d;
        if (i8 != -1) {
            return i8;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i9 = 0; i9 < this.f26165a; i9++) {
            iComputeRawMessageSetExtensionSize += AbstractC5248t.computeRawMessageSetExtensionSize(P1.getTagFieldNumber(this.f26166b[i9]), (AbstractC5235o) this.f26167c[i9]);
        }
        this.f26168d = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public int hashCode() {
        int i8 = this.f26165a;
        return ((((527 + i8) * 31) + c(this.f26166b, i8)) * 31) + d(this.f26167c, this.f26165a);
    }

    final void i(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f26165a; i9++) {
            M0.d(sb, i8, String.valueOf(P1.getTagFieldNumber(this.f26166b[i9])), this.f26167c[i9]);
        }
    }

    void j(int i8, Object obj) {
        a();
        b(this.f26165a + 1);
        int[] iArr = this.f26166b;
        int i9 = this.f26165a;
        iArr[i9] = i8;
        this.f26167c[i9] = obj;
        this.f26165a = i9 + 1;
    }

    void l(R1 r12) {
        if (r12.fieldOrder() == R1.a.DESCENDING) {
            for (int i8 = this.f26165a - 1; i8 >= 0; i8--) {
                r12.writeMessageSetItem(P1.getTagFieldNumber(this.f26166b[i8]), this.f26167c[i8]);
            }
            return;
        }
        for (int i9 = 0; i9 < this.f26165a; i9++) {
            r12.writeMessageSetItem(P1.getTagFieldNumber(this.f26166b[i9]), this.f26167c[i9]);
        }
    }

    public void makeImmutable() {
        this.f26169e = false;
    }

    public void writeAsMessageSetTo(AbstractC5248t abstractC5248t) {
        for (int i8 = 0; i8 < this.f26165a; i8++) {
            abstractC5248t.writeRawMessageSetExtension(P1.getTagFieldNumber(this.f26166b[i8]), (AbstractC5235o) this.f26167c[i8]);
        }
    }

    public void writeTo(AbstractC5248t abstractC5248t) throws C5230m0.a {
        for (int i8 = 0; i8 < this.f26165a; i8++) {
            int i9 = this.f26166b[i8];
            int tagFieldNumber = P1.getTagFieldNumber(i9);
            int tagWireType = P1.getTagWireType(i9);
            if (tagWireType == 0) {
                abstractC5248t.writeUInt64(tagFieldNumber, ((Long) this.f26167c[i8]).longValue());
            } else if (tagWireType == 1) {
                abstractC5248t.writeFixed64(tagFieldNumber, ((Long) this.f26167c[i8]).longValue());
            } else if (tagWireType == 2) {
                abstractC5248t.writeBytes(tagFieldNumber, (AbstractC5235o) this.f26167c[i8]);
            } else if (tagWireType == 3) {
                abstractC5248t.writeTag(tagFieldNumber, 3);
                ((H1) this.f26167c[i8]).writeTo(abstractC5248t);
                abstractC5248t.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw C5230m0.d();
                }
                abstractC5248t.writeFixed32(tagFieldNumber, ((Integer) this.f26167c[i8]).intValue());
            }
        }
    }

    private H1(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f26168d = -1;
        this.f26165a = i8;
        this.f26166b = iArr;
        this.f26167c = objArr;
        this.f26169e = z8;
    }

    public void writeTo(R1 r12) {
        if (this.f26165a == 0) {
            return;
        }
        if (r12.fieldOrder() == R1.a.ASCENDING) {
            for (int i8 = 0; i8 < this.f26165a; i8++) {
                m(this.f26166b[i8], this.f26167c[i8], r12);
            }
            return;
        }
        for (int i9 = this.f26165a - 1; i9 >= 0; i9--) {
            m(this.f26166b[i9], this.f26167c[i9], r12);
        }
    }
}
