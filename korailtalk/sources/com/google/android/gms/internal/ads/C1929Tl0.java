package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Tl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1929Tl0 extends AbstractC2737el0 {

    /* renamed from: g, reason: collision with root package name */
    static final AbstractC2737el0 f16512g = new C1929Tl0(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    private final transient Object f16513d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f16514e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f16515f;

    private C1929Tl0(Object obj, Object[] objArr, int i8) {
        this.f16513d = obj;
        this.f16514e = objArr;
        this.f16515f = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static C1929Tl0 d(int i8, Object[] objArr, C2623dl0 c2623dl0) {
        short[] sArr;
        char c9;
        char c10;
        Object[] objArr2;
        int i9 = i8;
        Object[] objArrCopyOf = objArr;
        if (i9 == 0) {
            return (C1929Tl0) f16512g;
        }
        Object obj = null;
        int i10 = 1;
        if (i9 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            AbstractC4560uk0.b(obj2, obj3);
            return new C1929Tl0(null, objArrCopyOf, 1);
        }
        AbstractC1188Bj0.zzb(i9, objArrCopyOf.length >> 1, "index");
        int iE = AbstractC2967gl0.e(i8);
        if (i9 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            AbstractC4560uk0.b(obj4, obj5);
            i9 = 1;
            c9 = 1;
            c10 = 2;
        } else {
            int i11 = iE - 1;
            char c11 = 65535;
            if (iE <= 128) {
                byte[] bArr = new byte[iE];
                Arrays.fill(bArr, (byte) -1);
                int i12 = 0;
                int i13 = 0;
                while (i12 < i9) {
                    int i14 = i13 + i13;
                    int i15 = i12 + i12;
                    Object obj6 = objArrCopyOf[i15];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i15 ^ i10];
                    Objects.requireNonNull(obj7);
                    AbstractC4560uk0.b(obj6, obj7);
                    int iA = AbstractC1886Sk0.a(obj6.hashCode());
                    while (true) {
                        int i16 = iA & i11;
                        int i17 = bArr[i16] & 255;
                        if (i17 == 255) {
                            bArr[i16] = (byte) i14;
                            if (i13 < i12) {
                                objArrCopyOf[i14] = obj6;
                                objArrCopyOf[i14 ^ 1] = obj7;
                            }
                            i13++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i17])) {
                                int i18 = i17 ^ 1;
                                Object obj8 = objArrCopyOf[i18];
                                Objects.requireNonNull(obj8);
                                C2508cl0 c2508cl0 = new C2508cl0(obj6, obj7, obj8);
                                objArrCopyOf[i18] = obj7;
                                obj = c2508cl0;
                                break;
                            }
                            iA = i16 + 1;
                        }
                    }
                    i12++;
                    i10 = 1;
                }
                if (i13 == i9) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i13), obj};
                    c10 = 2;
                    c9 = 1;
                }
            } else {
                if (iE <= 32768) {
                    sArr = new short[iE];
                    Arrays.fill(sArr, (short) -1);
                    int i19 = 0;
                    for (int i20 = 0; i20 < i9; i20++) {
                        int i21 = i19 + i19;
                        int i22 = i20 + i20;
                        Object obj9 = objArrCopyOf[i22];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i22 ^ 1];
                        Objects.requireNonNull(obj10);
                        AbstractC4560uk0.b(obj9, obj10);
                        int iA2 = AbstractC1886Sk0.a(obj9.hashCode());
                        while (true) {
                            int i23 = iA2 & i11;
                            char c12 = (char) sArr[i23];
                            if (c12 == 65535) {
                                sArr[i23] = (short) i21;
                                if (i19 < i20) {
                                    objArrCopyOf[i21] = obj9;
                                    objArrCopyOf[i21 ^ 1] = obj10;
                                }
                                i19++;
                            } else {
                                if (obj9.equals(objArrCopyOf[c12])) {
                                    int i24 = c12 ^ 1;
                                    Object obj11 = objArrCopyOf[i24];
                                    Objects.requireNonNull(obj11);
                                    C2508cl0 c2508cl02 = new C2508cl0(obj9, obj10, obj11);
                                    objArrCopyOf[i24] = obj10;
                                    obj = c2508cl02;
                                    break;
                                }
                                iA2 = i23 + 1;
                            }
                        }
                    }
                    if (i19 != i9) {
                        Integer numValueOf = Integer.valueOf(i19);
                        c9 = 1;
                        c10 = 2;
                        objArr2 = new Object[]{sArr, numValueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i25 = 1;
                    sArr = new int[iE];
                    Arrays.fill((int[]) sArr, -1);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < i9) {
                        int i28 = i27 + i27;
                        int i29 = i26 + i26;
                        Object obj12 = objArrCopyOf[i29];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i29 ^ i25];
                        Objects.requireNonNull(obj13);
                        AbstractC4560uk0.b(obj12, obj13);
                        int iA3 = AbstractC1886Sk0.a(obj12.hashCode());
                        while (true) {
                            int i30 = iA3 & i11;
                            ?? r15 = sArr[i30];
                            if (r15 == c11) {
                                sArr[i30] = i28;
                                if (i27 < i26) {
                                    objArrCopyOf[i28] = obj12;
                                    objArrCopyOf[i28 ^ 1] = obj13;
                                }
                                i27++;
                            } else {
                                if (obj12.equals(objArrCopyOf[r15])) {
                                    int i31 = r15 ^ 1;
                                    Object obj14 = objArrCopyOf[i31];
                                    Objects.requireNonNull(obj14);
                                    C2508cl0 c2508cl03 = new C2508cl0(obj12, obj13, obj14);
                                    objArrCopyOf[i31] = obj13;
                                    obj = c2508cl03;
                                    break;
                                }
                                iA3 = i30 + 1;
                                c11 = 65535;
                            }
                        }
                        i26++;
                        i25 = 1;
                        c11 = 65535;
                    }
                    if (i27 != i9) {
                        c9 = 1;
                        c10 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i27), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c9 = 1;
            }
            c10 = 2;
            c9 = 1;
        }
        boolean z8 = obj instanceof Object[];
        Object obj15 = obj;
        if (z8) {
            Object[] objArr3 = (Object[]) obj;
            C2508cl0 c2508cl04 = (C2508cl0) objArr3[c10];
            if (c2623dl0 == null) {
                throw c2508cl04.a();
            }
            c2623dl0.f18677c = c2508cl04;
            Object obj16 = objArr3[0];
            int iIntValue = ((Integer) objArr3[c9]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj15 = obj16;
            i9 = iIntValue;
        }
        return new C1929Tl0(obj15, objArrCopyOf, i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2737el0
    final AbstractC2009Vk0 a() {
        return new C1888Sl0(this.f16514e, 1, this.f16515f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2737el0
    final AbstractC2967gl0 b() {
        return new C1806Ql0(this, this.f16514e, 0, this.f16515f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2737el0
    final AbstractC2967gl0 c() {
        return new C1847Rl0(this, new C1888Sl0(this.f16514e, 0, this.f16515f));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.ads.AbstractC2737el0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.f16515f
            java.lang.Object[] r2 = r9.f16514e
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.f16513d
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.AbstractC1886Sk0.a(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.AbstractC1886Sk0.a(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.AbstractC1886Sk0.a(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1929Tl0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f16515f;
    }
}
