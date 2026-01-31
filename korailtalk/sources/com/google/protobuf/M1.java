package com.google.protobuf;

import e3.AbstractC5358c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class M1 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f26221a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i8) throws C5230m0 {
            if (m(b10) || (((b9 << AbstractC5358c.FS) + (b10 + 112)) >> 30) != 0 || m(b11) || m(b12)) {
                throw C5230m0.c();
            }
            int iR = ((b9 & 7) << 18) | (r(b10) << 12) | (r(b11) << 6) | r(b12);
            cArr[i8] = l(iR);
            cArr[i8 + 1] = q(iR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b9, char[] cArr, int i8) {
            cArr[i8] = (char) b9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b9, byte b10, byte b11, char[] cArr, int i8) throws C5230m0 {
            if (m(b10) || ((b9 == -32 && b10 < -96) || ((b9 == -19 && b10 >= -96) || m(b11)))) {
                throw C5230m0.c();
            }
            cArr[i8] = (char) (((b9 & AbstractC5358c.SI) << 12) | (r(b10) << 6) | r(b11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b9, byte b10, char[] cArr, int i8) throws C5230m0 {
            if (b9 < -62 || m(b10)) {
                throw C5230m0.c();
            }
            cArr[i8] = (char) (((b9 & AbstractC5358c.US) << 6) | r(b10));
        }

        private static char l(int i8) {
            return (char) ((i8 >>> 10) + 55232);
        }

        private static boolean m(byte b9) {
            return b9 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b9) {
            return b9 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b9) {
            return b9 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b9) {
            return b9 < -32;
        }

        private static char q(int i8) {
            return (char) ((i8 & 1023) + 56320);
        }

        private static int r(byte b9) {
            return b9 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        private static int m(ByteBuffer byteBuffer, int i8, int i9) {
            int iM = i8 + M1.m(byteBuffer, i8, i9);
            while (iM < i9) {
                int i10 = iM + 1;
                byte b9 = byteBuffer.get(iM);
                if (b9 >= 0) {
                    iM = i10;
                } else if (b9 < -32) {
                    if (i10 >= i9) {
                        return b9;
                    }
                    if (b9 < -62 || byteBuffer.get(i10) > -65) {
                        return -1;
                    }
                    iM += 2;
                } else {
                    if (b9 >= -16) {
                        if (i10 >= i9 - 2) {
                            return M1.q(byteBuffer, b9, i10, i9 - i10);
                        }
                        int i11 = iM + 2;
                        byte b10 = byteBuffer.get(i10);
                        if (b10 <= -65 && (((b9 << AbstractC5358c.FS) + (b10 + 112)) >> 30) == 0) {
                            int i12 = iM + 3;
                            if (byteBuffer.get(i11) <= -65) {
                                iM += 4;
                                if (byteBuffer.get(i12) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i9 - 1) {
                        return M1.q(byteBuffer, b9, i10, i9 - i10);
                    }
                    int i13 = iM + 2;
                    byte b11 = byteBuffer.get(i10);
                    if (b11 > -65 || ((b9 == -32 && b11 < -96) || ((b9 == -19 && b11 >= -96) || byteBuffer.get(i13) > -65))) {
                        return -1;
                    }
                    iM += 3;
                }
            }
            return 0;
        }

        final String a(ByteBuffer byteBuffer, int i8, int i9) {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i8, i9);
            }
            return byteBuffer.isDirect() ? d(byteBuffer, i8, i9) : c(byteBuffer, i8, i9);
        }

        abstract String b(byte[] bArr, int i8, int i9);

        final String c(ByteBuffer byteBuffer, int i8, int i9) throws C5230m0 {
            if ((i8 | i9 | ((byteBuffer.limit() - i8) - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            int i10 = i8 + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i8 < i10) {
                byte b9 = byteBuffer.get(i8);
                if (!a.n(b9)) {
                    break;
                }
                i8++;
                a.i(b9, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (i8 < i10) {
                int i13 = i8 + 1;
                byte b10 = byteBuffer.get(i8);
                if (a.n(b10)) {
                    int i14 = i12 + 1;
                    a.i(b10, cArr, i12);
                    while (i13 < i10) {
                        byte b11 = byteBuffer.get(i13);
                        if (!a.n(b11)) {
                            break;
                        }
                        i13++;
                        a.i(b11, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    i8 = i13;
                } else if (a.p(b10)) {
                    if (i13 >= i10) {
                        throw C5230m0.c();
                    }
                    i8 += 2;
                    a.k(b10, byteBuffer.get(i13), cArr, i12);
                    i12++;
                } else if (a.o(b10)) {
                    if (i13 >= i10 - 1) {
                        throw C5230m0.c();
                    }
                    int i15 = i8 + 2;
                    i8 += 3;
                    a.j(b10, byteBuffer.get(i13), byteBuffer.get(i15), cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw C5230m0.c();
                    }
                    byte b12 = byteBuffer.get(i13);
                    int i16 = i8 + 3;
                    byte b13 = byteBuffer.get(i8 + 2);
                    i8 += 4;
                    a.h(b10, b12, b13, byteBuffer.get(i16), cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        abstract String d(ByteBuffer byteBuffer, int i8, int i9);

        abstract int e(CharSequence charSequence, byte[] bArr, int i8, int i9);

        final void f(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                AbstractC5236o0.e(byteBuffer, M1.i(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                h(charSequence, byteBuffer);
            } else {
                g(charSequence, byteBuffer);
            }
        }

        final void g(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i8 = 0;
            while (i8 < length) {
                try {
                    char cCharAt = charSequence.charAt(i8);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i8, (byte) cCharAt);
                    i8++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (byteBuffer.position() + Math.max(i8, (iPosition - byteBuffer.position()) + 1)));
                }
            }
            if (i8 == length) {
                AbstractC5236o0.e(byteBuffer, iPosition + i8);
                return;
            }
            iPosition += i8;
            while (i8 < length) {
                char cCharAt2 = charSequence.charAt(i8);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i9 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i9, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i9;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i9;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (byteBuffer.position() + Math.max(i8, (iPosition - byteBuffer.position()) + 1)));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i10 = i8 + 1;
                        if (i10 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i12 = iPosition + 2;
                                        try {
                                            byteBuffer.put(i11, (byte) (((codePoint >>> 12) & 63) | 128));
                                            iPosition += 3;
                                            byteBuffer.put(i12, (byte) (((codePoint >>> 6) & 63) | 128));
                                            byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                            i8 = i10;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i8 = i10;
                                            iPosition = i12;
                                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (byteBuffer.position() + Math.max(i8, (iPosition - byteBuffer.position()) + 1)));
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i11;
                                        i8 = i10;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (byteBuffer.position() + Math.max(i8, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                } else {
                                    i8 = i10;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new d(i8, length);
                    }
                    int i13 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i13, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i8++;
                iPosition++;
            }
            AbstractC5236o0.e(byteBuffer, iPosition);
        }

        abstract void h(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean i(ByteBuffer byteBuffer, int i8, int i9) {
            return k(0, byteBuffer, i8, i9) == 0;
        }

        final boolean j(byte[] bArr, int i8, int i9) {
            return l(0, bArr, i8, i9) == 0;
        }

        final int k(int i8, ByteBuffer byteBuffer, int i9, int i10) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? o(i8, byteBuffer, i9, i10) : n(i8, byteBuffer, i9, i10);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return l(i8, byteBuffer.array(), i9 + iArrayOffset, iArrayOffset + i10);
        }

        abstract int l(int i8, byte[] bArr, int i9, int i10);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final int n(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.M1.a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.protobuf.M1.a(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.protobuf.M1.b(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M1.b.n(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int o(int i8, ByteBuffer byteBuffer, int i9, int i10);
    }

    static final class c extends b {
        c() {
        }

        private static int p(byte[] bArr, int i8, int i9) {
            while (i8 < i9 && bArr[i8] >= 0) {
                i8++;
            }
            if (i8 >= i9) {
                return 0;
            }
            return q(bArr, i8, i9);
        }

        private static int q(byte[] bArr, int i8, int i9) {
            while (i8 < i9) {
                int i10 = i8 + 1;
                byte b9 = bArr[i8];
                if (b9 < 0) {
                    if (b9 < -32) {
                        if (i10 >= i9) {
                            return b9;
                        }
                        if (b9 >= -62) {
                            i8 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b9 >= -16) {
                        if (i10 >= i9 - 2) {
                            return M1.r(bArr, i10, i9);
                        }
                        int i11 = i8 + 2;
                        byte b10 = bArr[i10];
                        if (b10 <= -65 && (((b9 << AbstractC5358c.FS) + (b10 + 112)) >> 30) == 0) {
                            int i12 = i8 + 3;
                            if (bArr[i11] <= -65) {
                                i8 += 4;
                                if (bArr[i12] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i9 - 1) {
                        return M1.r(bArr, i10, i9);
                    }
                    int i13 = i8 + 2;
                    byte b11 = bArr[i10];
                    if (b11 <= -65 && ((b9 != -32 || b11 >= -96) && (b9 != -19 || b11 < -96))) {
                        i8 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                i8 = i10;
            }
            return 0;
        }

        @Override // com.google.protobuf.M1.b
        String b(byte[] bArr, int i8, int i9) throws C5230m0 {
            if ((i8 | i9 | ((bArr.length - i8) - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            int i10 = i8 + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i8 < i10) {
                byte b9 = bArr[i8];
                if (!a.n(b9)) {
                    break;
                }
                i8++;
                a.i(b9, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (i8 < i10) {
                int i13 = i8 + 1;
                byte b10 = bArr[i8];
                if (a.n(b10)) {
                    int i14 = i12 + 1;
                    a.i(b10, cArr, i12);
                    while (i13 < i10) {
                        byte b11 = bArr[i13];
                        if (!a.n(b11)) {
                            break;
                        }
                        i13++;
                        a.i(b11, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    i8 = i13;
                } else if (a.p(b10)) {
                    if (i13 >= i10) {
                        throw C5230m0.c();
                    }
                    i8 += 2;
                    a.k(b10, bArr[i13], cArr, i12);
                    i12++;
                } else if (a.o(b10)) {
                    if (i13 >= i10 - 1) {
                        throw C5230m0.c();
                    }
                    int i15 = i8 + 2;
                    i8 += 3;
                    a.j(b10, bArr[i13], bArr[i15], cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw C5230m0.c();
                    }
                    byte b12 = bArr[i13];
                    int i16 = i8 + 3;
                    byte b13 = bArr[i8 + 2];
                    i8 += 4;
                    a.h(b10, b12, b13, bArr[i16], cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // com.google.protobuf.M1.b
        String d(ByteBuffer byteBuffer, int i8, int i9) {
            return c(byteBuffer, i8, i9);
        }

        @Override // com.google.protobuf.M1.b
        int e(CharSequence charSequence, byte[] bArr, int i8, int i9) {
            int i10;
            int i11;
            char cCharAt;
            int length = charSequence.length();
            int i12 = i9 + i8;
            int i13 = 0;
            while (i13 < length && (i11 = i13 + i8) < i12 && (cCharAt = charSequence.charAt(i13)) < 128) {
                bArr[i11] = (byte) cCharAt;
                i13++;
            }
            if (i13 == length) {
                return i8 + length;
            }
            int i14 = i8 + i13;
            while (i13 < length) {
                char cCharAt2 = charSequence.charAt(i13);
                if (cCharAt2 < 128 && i14 < i12) {
                    bArr[i14] = (byte) cCharAt2;
                    i14++;
                } else if (cCharAt2 < 2048 && i14 <= i12 - 2) {
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) ((cCharAt2 >>> 6) | 960);
                    i14 += 2;
                    bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i14 > i12 - 3) {
                        if (i14 > i12 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i13 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i10)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i14);
                        }
                        int i16 = i13 + 1;
                        if (i16 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i16);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i17 = i14 + 3;
                                bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i14 += 4;
                                bArr[i17] = (byte) ((codePoint & 63) | 128);
                                i13 = i16;
                            } else {
                                i13 = i16;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    bArr[i14] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i18 = i14 + 2;
                    bArr[i14 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i14 += 3;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                }
                i13++;
            }
            return i14;
        }

        @Override // com.google.protobuf.M1.b
        void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            g(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.M1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int l(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.M1.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.protobuf.M1.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.protobuf.M1.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = p(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M1.c.l(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.M1.b
        int o(int i8, ByteBuffer byteBuffer, int i9, int i10) {
            return n(i8, byteBuffer, i9, i10);
        }
    }

    static class d extends IllegalArgumentException {
        d(int i8, int i9) {
            super("Unpaired surrogate at index " + i8 + " of " + i9);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean p() {
            return L1.K() && L1.L();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int q(long r10, int r12) {
            /*
                int r0 = s(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = com.google.protobuf.L1.x(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = com.google.protobuf.L1.x(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = u(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.L1.x(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = com.google.protobuf.L1.x(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = u(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.L1.x(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = com.google.protobuf.L1.x(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = com.google.protobuf.L1.x(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M1.e.q(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int r(byte[] r10, long r11, int r13) {
            /*
                int r0 = t(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.protobuf.L1.y(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.protobuf.L1.y(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = v(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.L1.y(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.protobuf.L1.y(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = v(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.L1.y(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.protobuf.L1.y(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.protobuf.L1.y(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M1.e.r(byte[], long, int):int");
        }

        private static int s(long j8, int i8) {
            if (i8 < 16) {
                return 0;
            }
            int i9 = (int) ((-j8) & 7);
            int i10 = i9;
            while (i10 > 0) {
                long j9 = 1 + j8;
                if (L1.x(j8) < 0) {
                    return i9 - i10;
                }
                i10--;
                j8 = j9;
            }
            int i11 = i8 - i9;
            while (i11 >= 8 && (L1.E(j8) & (-9187201950435737472L)) == 0) {
                j8 += 8;
                i11 -= 8;
            }
            return i8 - i11;
        }

        private static int t(byte[] bArr, long j8, int i8) {
            int i9 = 0;
            if (i8 < 16) {
                return 0;
            }
            int i10 = 8 - (((int) j8) & 7);
            while (i9 < i10) {
                long j9 = 1 + j8;
                if (L1.y(bArr, j8) < 0) {
                    return i9;
                }
                i9++;
                j8 = j9;
            }
            while (true) {
                int i11 = i9 + 8;
                if (i11 > i8 || (L1.F(bArr, L1.f26195h + j8) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j8 += 8;
                i9 = i11;
            }
            while (i9 < i8) {
                long j10 = j8 + 1;
                if (L1.y(bArr, j8) < 0) {
                    return i9;
                }
                i9++;
                j8 = j10;
            }
            return i8;
        }

        private static int u(long j8, int i8, int i9) {
            if (i9 == 0) {
                return M1.n(i8);
            }
            if (i9 == 1) {
                return M1.o(i8, L1.x(j8));
            }
            if (i9 == 2) {
                return M1.p(i8, L1.x(j8), L1.x(j8 + 1));
            }
            throw new AssertionError();
        }

        private static int v(byte[] bArr, int i8, long j8, int i9) {
            if (i9 == 0) {
                return M1.n(i8);
            }
            if (i9 == 1) {
                return M1.o(i8, L1.y(bArr, j8));
            }
            if (i9 == 2) {
                return M1.p(i8, L1.y(bArr, j8), L1.y(bArr, j8 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.M1.b
        String b(byte[] bArr, int i8, int i9) throws C5230m0 {
            Charset charset = AbstractC5227l0.f26567b;
            String str = new String(bArr, i8, i9, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i8, i9 + i8))) {
                throw C5230m0.c();
            }
            return str;
        }

        @Override // com.google.protobuf.M1.b
        String d(ByteBuffer byteBuffer, int i8, int i9) throws C5230m0 {
            if ((i8 | i9 | ((byteBuffer.limit() - i8) - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            long jK = L1.k(byteBuffer) + i8;
            long j8 = i9 + jK;
            char[] cArr = new char[i9];
            int i10 = 0;
            while (jK < j8) {
                byte bX = L1.x(jK);
                if (!a.n(bX)) {
                    break;
                }
                jK++;
                a.i(bX, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (jK < j8) {
                long j9 = jK + 1;
                byte bX2 = L1.x(jK);
                if (a.n(bX2)) {
                    int i12 = i11 + 1;
                    a.i(bX2, cArr, i11);
                    while (j9 < j8) {
                        byte bX3 = L1.x(j9);
                        if (!a.n(bX3)) {
                            break;
                        }
                        j9++;
                        a.i(bX3, cArr, i12);
                        i12++;
                    }
                    i11 = i12;
                    jK = j9;
                } else if (a.p(bX2)) {
                    if (j9 >= j8) {
                        throw C5230m0.c();
                    }
                    jK += 2;
                    a.k(bX2, L1.x(j9), cArr, i11);
                    i11++;
                } else if (a.o(bX2)) {
                    if (j9 >= j8 - 1) {
                        throw C5230m0.c();
                    }
                    long j10 = 2 + jK;
                    jK += 3;
                    a.j(bX2, L1.x(j9), L1.x(j10), cArr, i11);
                    i11++;
                } else {
                    if (j9 >= j8 - 2) {
                        throw C5230m0.c();
                    }
                    byte bX4 = L1.x(j9);
                    long j11 = 3 + jK;
                    byte bX5 = L1.x(2 + jK);
                    jK += 4;
                    a.h(bX2, bX4, bX5, L1.x(j11), cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // com.google.protobuf.M1.b
        int e(CharSequence charSequence, byte[] bArr, int i8, int i9) {
            long j8;
            String str;
            String str2;
            int i10;
            long j9;
            long j10;
            char cCharAt;
            long j11 = i8;
            long j12 = i9 + j11;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i9 || bArr.length - i9 < i8) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i8 + i9));
            }
            int i11 = 0;
            while (true) {
                j8 = 1;
                if (i11 >= length || (cCharAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                L1.S(bArr, j11, (byte) cCharAt);
                i11++;
                j11 = 1 + j11;
            }
            if (i11 == length) {
                return (int) j11;
            }
            while (i11 < length) {
                char cCharAt2 = charSequence.charAt(i11);
                if (cCharAt2 >= 128 || j11 >= j12) {
                    if (cCharAt2 >= 2048 || j11 > j12 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j11 > j12 - 3) {
                            if (j11 > j12 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i10)))) {
                                    throw new d(i11, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j11);
                            }
                            int i12 = i11 + 1;
                            if (i12 != length) {
                                char cCharAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j9 = 1;
                                    L1.S(bArr, j11, (byte) ((codePoint >>> 18) | 240));
                                    j10 = j12;
                                    L1.S(bArr, j11 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j13 = j11 + 3;
                                    L1.S(bArr, j11 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j11 += 4;
                                    L1.S(bArr, j13, (byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            throw new d(i11 - 1, length);
                        }
                        L1.S(bArr, j11, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j14 = j11 + 2;
                        L1.S(bArr, j11 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j11 += 3;
                        L1.S(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j15 = j11 + j8;
                        L1.S(bArr, j11, (byte) ((cCharAt2 >>> 6) | 960));
                        j11 += 2;
                        L1.S(bArr, j15, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j10 = j12;
                    j9 = 1;
                } else {
                    L1.S(bArr, j11, (byte) cCharAt2);
                    j10 = j12;
                    str2 = str4;
                    j9 = j8;
                    j11 += j8;
                    str = str3;
                }
                i11++;
                str3 = str;
                str4 = str2;
                j8 = j9;
                j12 = j10;
            }
            return (int) j11;
        }

        @Override // com.google.protobuf.M1.b
        void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j8;
            char c9;
            long j9;
            int i8;
            int i9;
            char c10;
            char cCharAt;
            long jK = L1.k(byteBuffer);
            long jPosition = byteBuffer.position() + jK;
            long jLimit = byteBuffer.limit() + jK;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i10 = 0;
            while (true) {
                j8 = 1;
                c9 = 128;
                if (i10 >= length || (cCharAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                L1.R(jPosition, (byte) cCharAt);
                i10++;
                jPosition = 1 + jPosition;
            }
            if (i10 == length) {
                AbstractC5236o0.e(byteBuffer, (int) (jPosition - jK));
                return;
            }
            while (i10 < length) {
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt2 >= c9 || jPosition >= jLimit) {
                    if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                        j9 = jK;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i8 = i10 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i8)))) {
                                    throw new d(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            i9 = i10 + 1;
                            if (i9 != length) {
                                char cCharAt3 = charSequence.charAt(i9);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    L1.R(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c10 = 128;
                                    L1.R(jPosition + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j10 = jPosition + 3;
                                    L1.R(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    L1.R(j10, (byte) ((codePoint & 63) | 128));
                                } else {
                                    i10 = i9;
                                }
                            }
                            throw new d(i10 - 1, length);
                        }
                        long j11 = jPosition + j8;
                        L1.R(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j12 = jPosition + 2;
                        L1.R(j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        L1.R(j12, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        j9 = jK;
                        long j13 = jPosition + j8;
                        L1.R(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        L1.R(j13, (byte) ((cCharAt2 & '?') | 128));
                    }
                    i9 = i10;
                    c10 = 128;
                } else {
                    L1.R(jPosition, (byte) cCharAt2);
                    j9 = jK;
                    i9 = i10;
                    c10 = c9;
                    jPosition += j8;
                }
                c9 = c10;
                jK = j9;
                j8 = 1;
                i10 = i9 + 1;
            }
            AbstractC5236o0.e(byteBuffer, (int) (jPosition - jK));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.L1.y(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.L1.y(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.M1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int l(int r11, byte[] r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M1.e.l(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.L1.x(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.L1.x(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.L1.x(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.M1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int o(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M1.e.o(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f26221a = (!e.p() || AbstractC5205e.c()) ? new c() : new e();
    }

    static String g(ByteBuffer byteBuffer, int i8, int i9) {
        return f26221a.a(byteBuffer, i8, i9);
    }

    static String h(byte[] bArr, int i8, int i9) {
        return f26221a.b(bArr, i8, i9);
    }

    static int i(CharSequence charSequence, byte[] bArr, int i8, int i9) {
        return f26221a.e(charSequence, bArr, i8, i9);
    }

    static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        f26221a.f(charSequence, byteBuffer);
    }

    static int k(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int iL = length;
        while (true) {
            if (i8 < length) {
                char cCharAt = charSequence.charAt(i8);
                if (cCharAt >= 2048) {
                    iL += l(charSequence, i8);
                    break;
                }
                iL += (127 - cCharAt) >>> 31;
                i8++;
            } else {
                break;
            }
        }
        if (iL >= length) {
            return iL;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iL + 4294967296L));
    }

    private static int l(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        while (i8 < length) {
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt < 2048) {
                i9 += (127 - cCharAt) >>> 31;
            } else {
                i9 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i8) < 65536) {
                        throw new d(i8, length);
                    }
                    i8++;
                }
            }
            i8++;
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(ByteBuffer byteBuffer, int i8, int i9) {
        int i10 = i9 - 7;
        int i11 = i8;
        while (i11 < i10 && (byteBuffer.getLong(i11) & (-9187201950435737472L)) == 0) {
            i11 += 8;
        }
        return i11 - i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int i8) {
        if (i8 > -12) {
            return -1;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int i8, int i9) {
        if (i8 > -12 || i9 > -65) {
            return -1;
        }
        return i8 ^ (i9 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(int i8, int i9, int i10) {
        if (i8 > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i8 ^ (i9 << 8)) ^ (i10 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(ByteBuffer byteBuffer, int i8, int i9, int i10) {
        if (i10 == 0) {
            return n(i8);
        }
        if (i10 == 1) {
            return o(i8, byteBuffer.get(i9));
        }
        if (i10 == 2) {
            return p(i8, byteBuffer.get(i9), byteBuffer.get(i9 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(byte[] bArr, int i8, int i9) {
        byte b9 = bArr[i8 - 1];
        int i10 = i9 - i8;
        if (i10 == 0) {
            return n(b9);
        }
        if (i10 == 1) {
            return o(b9, bArr[i8]);
        }
        if (i10 == 2) {
            return p(b9, bArr[i8], bArr[i8 + 1]);
        }
        throw new AssertionError();
    }

    static boolean s(ByteBuffer byteBuffer) {
        return f26221a.i(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static boolean t(byte[] bArr) {
        return f26221a.j(bArr, 0, bArr.length);
    }

    static boolean u(byte[] bArr, int i8, int i9) {
        return f26221a.j(bArr, i8, i9);
    }

    static int v(int i8, ByteBuffer byteBuffer, int i9, int i10) {
        return f26221a.k(i8, byteBuffer, i9, i10);
    }

    static int w(int i8, byte[] bArr, int i9, int i10) {
        return f26221a.l(i8, bArr, i9, i10);
    }
}
