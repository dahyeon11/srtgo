package com.google.protobuf;

/* loaded from: classes2.dex */
abstract class u1 {

    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5235o f26808a;

        a(AbstractC5235o abstractC5235o) {
            this.f26808a = abstractC5235o;
        }

        @Override // com.google.protobuf.u1.c
        public byte byteAt(int i8) {
            return this.f26808a.byteAt(i8);
        }

        @Override // com.google.protobuf.u1.c
        public int size() {
            return this.f26808a.size();
        }
    }

    class b implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f26809a;

        b(byte[] bArr) {
            this.f26809a = bArr;
        }

        @Override // com.google.protobuf.u1.c
        public byte byteAt(int i8) {
            return this.f26809a[i8];
        }

        @Override // com.google.protobuf.u1.c
        public int size() {
            return this.f26809a.length;
        }
    }

    private interface c {
        byte byteAt(int i8);

        int size();
    }

    static String a(AbstractC5235o abstractC5235o) {
        return b(new a(abstractC5235o));
    }

    static String b(c cVar) {
        StringBuilder sb = new StringBuilder(cVar.size());
        for (int i8 = 0; i8 < cVar.size(); i8++) {
            byte bByteAt = cVar.byteAt(i8);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bByteAt);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String c(byte[] bArr) {
        return b(new b(bArr));
    }

    static String d(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String e(String str) {
        return a(AbstractC5235o.copyFromUtf8(str));
    }
}
