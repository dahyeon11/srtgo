package K6;

import P7.n;
import P7.w;
import com.google.firebase.messaging.AbstractC5186c;
import com.kakao.sdk.common.Constants;
import io.grpc.internal.U;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final P7.f f2918a = P7.f.encodeUtf8(":");

    /* renamed from: b, reason: collision with root package name */
    private static final d[] f2919b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f2920c;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f2921a;

        /* renamed from: b, reason: collision with root package name */
        private final P7.e f2922b;

        /* renamed from: c, reason: collision with root package name */
        private int f2923c;

        /* renamed from: d, reason: collision with root package name */
        private int f2924d;

        /* renamed from: e, reason: collision with root package name */
        d[] f2925e;

        /* renamed from: f, reason: collision with root package name */
        int f2926f;

        /* renamed from: g, reason: collision with root package name */
        int f2927g;

        /* renamed from: h, reason: collision with root package name */
        int f2928h;

        a(int i8, w wVar) {
            this(i8, i8, wVar);
        }

        private void a() {
            int i8 = this.f2924d;
            int i9 = this.f2928h;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    d(i9 - i8);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f2925e, (Object) null);
            this.f2926f = this.f2925e.length - 1;
            this.f2927g = 0;
            this.f2928h = 0;
        }

        private int c(int i8) {
            return this.f2926f + 1 + i8;
        }

        private int d(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f2925e.length;
                while (true) {
                    length--;
                    i9 = this.f2926f;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.f2925e[length].f2916a;
                    i8 -= i11;
                    this.f2928h -= i11;
                    this.f2927g--;
                    i10++;
                }
                d[] dVarArr = this.f2925e;
                System.arraycopy(dVarArr, i9 + 1, dVarArr, i9 + 1 + i10, this.f2927g);
                this.f2926f += i10;
            }
            return i10;
        }

        private P7.f e(int i8) throws IOException {
            if (h(i8)) {
                return f.f2919b[i8].name;
            }
            int iC = c(i8 - f.f2919b.length);
            if (iC >= 0) {
                d[] dVarArr = this.f2925e;
                if (iC < dVarArr.length) {
                    return dVarArr[iC].name;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void g(int i8, d dVar) {
            this.f2921a.add(dVar);
            int i9 = dVar.f2916a;
            if (i8 != -1) {
                i9 -= this.f2925e[c(i8)].f2916a;
            }
            int i10 = this.f2924d;
            if (i9 > i10) {
                b();
                return;
            }
            int iD = d((this.f2928h + i9) - i10);
            if (i8 == -1) {
                int i11 = this.f2927g + 1;
                d[] dVarArr = this.f2925e;
                if (i11 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f2926f = this.f2925e.length - 1;
                    this.f2925e = dVarArr2;
                }
                int i12 = this.f2926f;
                this.f2926f = i12 - 1;
                this.f2925e[i12] = dVar;
                this.f2927g++;
            } else {
                this.f2925e[i8 + c(i8) + iD] = dVar;
            }
            this.f2928h += i9;
        }

        private boolean h(int i8) {
            return i8 >= 0 && i8 <= f.f2919b.length - 1;
        }

        private int i() {
            return this.f2922b.readByte() & 255;
        }

        private void l(int i8) throws IOException {
            if (h(i8)) {
                this.f2921a.add(f.f2919b[i8]);
                return;
            }
            int iC = c(i8 - f.f2919b.length);
            if (iC >= 0) {
                d[] dVarArr = this.f2925e;
                if (iC <= dVarArr.length - 1) {
                    this.f2921a.add(dVarArr[iC]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void n(int i8) {
            g(-1, new d(e(i8), j()));
        }

        private void o() {
            g(-1, new d(f.e(j()), j()));
        }

        private void p(int i8) throws IOException {
            this.f2921a.add(new d(e(i8), j()));
        }

        private void q() throws IOException {
            this.f2921a.add(new d(f.e(j()), j()));
        }

        void f(int i8) {
            this.f2923c = i8;
            this.f2924d = i8;
            a();
        }

        public List<d> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.f2921a);
            this.f2921a.clear();
            return arrayList;
        }

        P7.f j() {
            int i8 = i();
            boolean z8 = (i8 & 128) == 128;
            int iM = m(i8, 127);
            return z8 ? P7.f.of(h.get().c(this.f2922b.readByteArray(iM))) : this.f2922b.readByteString(iM);
        }

        void k() throws IOException {
            while (!this.f2922b.exhausted()) {
                byte b9 = this.f2922b.readByte();
                int i8 = b9 & 255;
                if (i8 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b9 & 128) == 128) {
                    l(m(i8, 127) - 1);
                } else if (i8 == 64) {
                    o();
                } else if ((b9 & 64) == 64) {
                    n(m(i8, 63) - 1);
                } else if ((b9 & 32) == 32) {
                    int iM = m(i8, 31);
                    this.f2924d = iM;
                    if (iM < 0 || iM > this.f2923c) {
                        throw new IOException("Invalid dynamic table size update " + this.f2924d);
                    }
                    a();
                } else if (i8 == 16 || i8 == 0) {
                    q();
                } else {
                    p(m(i8, 15) - 1);
                }
            }
        }

        int m(int i8, int i9) {
            int i10 = i8 & i9;
            if (i10 < i9) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int i12 = i();
                if ((i12 & 128) == 0) {
                    return i9 + (i12 << i11);
                }
                i9 += (i12 & 127) << i11;
                i11 += 7;
            }
        }

        a(int i8, int i9, w wVar) {
            this.f2921a = new ArrayList();
            this.f2925e = new d[8];
            this.f2926f = r0.length - 1;
            this.f2927g = 0;
            this.f2928h = 0;
            this.f2923c = i8;
            this.f2924d = i9;
            this.f2922b = n.buffer(wVar);
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final P7.c f2929a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f2930b;

        /* renamed from: c, reason: collision with root package name */
        int f2931c;

        /* renamed from: d, reason: collision with root package name */
        private int f2932d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2933e;

        /* renamed from: f, reason: collision with root package name */
        private int f2934f;

        /* renamed from: g, reason: collision with root package name */
        d[] f2935g;

        /* renamed from: h, reason: collision with root package name */
        int f2936h;

        /* renamed from: i, reason: collision with root package name */
        private int f2937i;

        /* renamed from: j, reason: collision with root package name */
        private int f2938j;

        b(P7.c cVar) {
            this(4096, false, cVar);
        }

        private void a() {
            Arrays.fill(this.f2935g, (Object) null);
            this.f2937i = this.f2935g.length - 1;
            this.f2936h = 0;
            this.f2938j = 0;
        }

        private int b(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f2935g.length;
                while (true) {
                    length--;
                    i9 = this.f2937i;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.f2935g[length].f2916a;
                    i8 -= i11;
                    this.f2938j -= i11;
                    this.f2936h--;
                    i10++;
                }
                d[] dVarArr = this.f2935g;
                System.arraycopy(dVarArr, i9 + 1, dVarArr, i9 + 1 + i10, this.f2936h);
                this.f2937i += i10;
            }
            return i10;
        }

        private void c(d dVar) {
            int i8 = dVar.f2916a;
            int i9 = this.f2934f;
            if (i8 > i9) {
                a();
                return;
            }
            b((this.f2938j + i8) - i9);
            int i10 = this.f2936h + 1;
            d[] dVarArr = this.f2935g;
            if (i10 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f2937i = this.f2935g.length - 1;
                this.f2935g = dVarArr2;
            }
            int i11 = this.f2937i;
            this.f2937i = i11 - 1;
            this.f2935g[i11] = dVar;
            this.f2936h++;
            this.f2938j += i8;
        }

        void d(P7.f fVar) throws IOException {
            if (!this.f2930b || h.get().e(fVar.toByteArray()) >= fVar.size()) {
                f(fVar.size(), 127, 0);
                this.f2929a.write(fVar);
                return;
            }
            P7.c cVar = new P7.c();
            h.get().d(fVar.toByteArray(), cVar.outputStream());
            P7.f byteString = cVar.readByteString();
            f(byteString.size(), 127, 128);
            this.f2929a.write(byteString);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void e(java.util.List r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: K6.f.b.e(java.util.List):void");
        }

        void f(int i8, int i9, int i10) {
            if (i8 < i9) {
                this.f2929a.writeByte(i8 | i10);
                return;
            }
            this.f2929a.writeByte(i10 | i9);
            int i11 = i8 - i9;
            while (i11 >= 128) {
                this.f2929a.writeByte(128 | (i11 & 127));
                i11 >>>= 7;
            }
            this.f2929a.writeByte(i11);
        }

        b(int i8, boolean z8, P7.c cVar) {
            this.f2932d = Integer.MAX_VALUE;
            this.f2935g = new d[8];
            this.f2937i = r0.length - 1;
            this.f2931c = i8;
            this.f2934f = i8;
            this.f2930b = z8;
            this.f2929a = cVar;
        }
    }

    static {
        d dVar = new d(d.TARGET_AUTHORITY, "");
        P7.f fVar = d.TARGET_METHOD;
        d dVar2 = new d(fVar, "GET");
        d dVar3 = new d(fVar, U.HTTP_METHOD);
        P7.f fVar2 = d.TARGET_PATH;
        d dVar4 = new d(fVar2, "/");
        d dVar5 = new d(fVar2, "/index.html");
        P7.f fVar3 = d.TARGET_SCHEME;
        d dVar6 = new d(fVar3, "http");
        d dVar7 = new d(fVar3, Constants.SCHEME);
        P7.f fVar4 = d.RESPONSE_STATUS;
        f2919b = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(fVar4, "200"), new d(fVar4, "204"), new d(fVar4, "206"), new d(fVar4, "304"), new d(fVar4, "400"), new d(fVar4, "404"), new d(fVar4, "500"), new d("accept-charset", ""), new d(U.CONTENT_ACCEPT_ENCODING, "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d(U.CONTENT_ENCODING, ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d(AbstractC5186c.a.FROM, ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d(com.kakao.sdk.template.Constants.LINK, ""), new d(com.kakao.sdk.template.Constants.TYPE_LOCATION, ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f2920c = f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static P7.f e(P7.f fVar) throws IOException {
        int size = fVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            byte b9 = fVar.getByte(i8);
            if (b9 >= 65 && b9 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.utf8());
            }
        }
        return fVar;
    }

    private static Map f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f2919b.length);
        int i8 = 0;
        while (true) {
            d[] dVarArr = f2919b;
            if (i8 >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i8].name)) {
                linkedHashMap.put(dVarArr[i8].name, Integer.valueOf(i8));
            }
            i8++;
        }
    }
}
