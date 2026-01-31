package I7;

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

/* loaded from: classes3.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    static final c[] f2363a;

    /* renamed from: b, reason: collision with root package name */
    static final Map f2364b;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f2365a;

        /* renamed from: b, reason: collision with root package name */
        private final P7.e f2366b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2367c;

        /* renamed from: d, reason: collision with root package name */
        private int f2368d;

        /* renamed from: e, reason: collision with root package name */
        c[] f2369e;

        /* renamed from: f, reason: collision with root package name */
        int f2370f;

        /* renamed from: g, reason: collision with root package name */
        int f2371g;

        /* renamed from: h, reason: collision with root package name */
        int f2372h;

        a(int i8, w wVar) {
            this(i8, i8, wVar);
        }

        private void a() {
            int i8 = this.f2368d;
            int i9 = this.f2372h;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    d(i9 - i8);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f2369e, (Object) null);
            this.f2370f = this.f2369e.length - 1;
            this.f2371g = 0;
            this.f2372h = 0;
        }

        private int c(int i8) {
            return this.f2370f + 1 + i8;
        }

        private int d(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f2369e.length;
                while (true) {
                    length--;
                    i9 = this.f2370f;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.f2369e[length].f2362a;
                    i8 -= i11;
                    this.f2372h -= i11;
                    this.f2371g--;
                    i10++;
                }
                c[] cVarArr = this.f2369e;
                System.arraycopy(cVarArr, i9 + 1, cVarArr, i9 + 1 + i10, this.f2371g);
                this.f2370f += i10;
            }
            return i10;
        }

        private P7.f e(int i8) throws IOException {
            if (g(i8)) {
                return d.f2363a[i8].name;
            }
            int iC = c(i8 - d.f2363a.length);
            if (iC >= 0) {
                c[] cVarArr = this.f2369e;
                if (iC < cVarArr.length) {
                    return cVarArr[iC].name;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void f(int i8, c cVar) {
            this.f2365a.add(cVar);
            int i9 = cVar.f2362a;
            if (i8 != -1) {
                i9 -= this.f2369e[c(i8)].f2362a;
            }
            int i10 = this.f2368d;
            if (i9 > i10) {
                b();
                return;
            }
            int iD = d((this.f2372h + i9) - i10);
            if (i8 == -1) {
                int i11 = this.f2371g + 1;
                c[] cVarArr = this.f2369e;
                if (i11 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f2370f = this.f2369e.length - 1;
                    this.f2369e = cVarArr2;
                }
                int i12 = this.f2370f;
                this.f2370f = i12 - 1;
                this.f2369e[i12] = cVar;
                this.f2371g++;
            } else {
                this.f2369e[i8 + c(i8) + iD] = cVar;
            }
            this.f2372h += i9;
        }

        private boolean g(int i8) {
            return i8 >= 0 && i8 <= d.f2363a.length - 1;
        }

        private int h() {
            return this.f2366b.readByte() & 255;
        }

        private void k(int i8) throws IOException {
            if (g(i8)) {
                this.f2365a.add(d.f2363a[i8]);
                return;
            }
            int iC = c(i8 - d.f2363a.length);
            if (iC >= 0) {
                c[] cVarArr = this.f2369e;
                if (iC < cVarArr.length) {
                    this.f2365a.add(cVarArr[iC]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void m(int i8) {
            f(-1, new c(e(i8), i()));
        }

        private void n() {
            f(-1, new c(d.a(i()), i()));
        }

        private void o(int i8) throws IOException {
            this.f2365a.add(new c(e(i8), i()));
        }

        private void p() throws IOException {
            this.f2365a.add(new c(d.a(i()), i()));
        }

        public List<c> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.f2365a);
            this.f2365a.clear();
            return arrayList;
        }

        P7.f i() {
            int iH = h();
            boolean z8 = (iH & 128) == 128;
            int iL = l(iH, 127);
            return z8 ? P7.f.of(k.get().c(this.f2366b.readByteArray(iL))) : this.f2366b.readByteString(iL);
        }

        void j() throws IOException {
            while (!this.f2366b.exhausted()) {
                byte b9 = this.f2366b.readByte();
                int i8 = b9 & 255;
                if (i8 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b9 & 128) == 128) {
                    k(l(i8, 127) - 1);
                } else if (i8 == 64) {
                    n();
                } else if ((b9 & 64) == 64) {
                    m(l(i8, 63) - 1);
                } else if ((b9 & 32) == 32) {
                    int iL = l(i8, 31);
                    this.f2368d = iL;
                    if (iL < 0 || iL > this.f2367c) {
                        throw new IOException("Invalid dynamic table size update " + this.f2368d);
                    }
                    a();
                } else if (i8 == 16 || i8 == 0) {
                    p();
                } else {
                    o(l(i8, 15) - 1);
                }
            }
        }

        int l(int i8, int i9) {
            int i10 = i8 & i9;
            if (i10 < i9) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int iH = h();
                if ((iH & 128) == 0) {
                    return i9 + (iH << i11);
                }
                i9 += (iH & 127) << i11;
                i11 += 7;
            }
        }

        a(int i8, int i9, w wVar) {
            this.f2365a = new ArrayList();
            this.f2369e = new c[8];
            this.f2370f = r0.length - 1;
            this.f2371g = 0;
            this.f2372h = 0;
            this.f2367c = i8;
            this.f2368d = i9;
            this.f2366b = P7.n.buffer(wVar);
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final P7.c f2373a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2374b;

        /* renamed from: c, reason: collision with root package name */
        private int f2375c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2376d;

        /* renamed from: e, reason: collision with root package name */
        int f2377e;

        /* renamed from: f, reason: collision with root package name */
        int f2378f;

        /* renamed from: g, reason: collision with root package name */
        c[] f2379g;

        /* renamed from: h, reason: collision with root package name */
        int f2380h;

        /* renamed from: i, reason: collision with root package name */
        int f2381i;

        /* renamed from: j, reason: collision with root package name */
        int f2382j;

        b(P7.c cVar) {
            this(4096, true, cVar);
        }

        private void a() {
            int i8 = this.f2378f;
            int i9 = this.f2382j;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    c(i9 - i8);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f2379g, (Object) null);
            this.f2380h = this.f2379g.length - 1;
            this.f2381i = 0;
            this.f2382j = 0;
        }

        private int c(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f2379g.length;
                while (true) {
                    length--;
                    i9 = this.f2380h;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.f2379g[length].f2362a;
                    i8 -= i11;
                    this.f2382j -= i11;
                    this.f2381i--;
                    i10++;
                }
                c[] cVarArr = this.f2379g;
                System.arraycopy(cVarArr, i9 + 1, cVarArr, i9 + 1 + i10, this.f2381i);
                c[] cVarArr2 = this.f2379g;
                int i12 = this.f2380h;
                Arrays.fill(cVarArr2, i12 + 1, i12 + 1 + i10, (Object) null);
                this.f2380h += i10;
            }
            return i10;
        }

        private void d(c cVar) {
            int i8 = cVar.f2362a;
            int i9 = this.f2378f;
            if (i8 > i9) {
                b();
                return;
            }
            c((this.f2382j + i8) - i9);
            int i10 = this.f2381i + 1;
            c[] cVarArr = this.f2379g;
            if (i10 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f2380h = this.f2379g.length - 1;
                this.f2379g = cVarArr2;
            }
            int i11 = this.f2380h;
            this.f2380h = i11 - 1;
            this.f2379g[i11] = cVar;
            this.f2381i++;
            this.f2382j += i8;
        }

        void e(int i8) {
            this.f2377e = i8;
            int iMin = Math.min(i8, 16384);
            int i9 = this.f2378f;
            if (i9 == iMin) {
                return;
            }
            if (iMin < i9) {
                this.f2375c = Math.min(this.f2375c, iMin);
            }
            this.f2376d = true;
            this.f2378f = iMin;
            a();
        }

        void f(P7.f fVar) {
            if (!this.f2374b || k.get().e(fVar) >= fVar.size()) {
                h(fVar.size(), 127, 0);
                this.f2373a.write(fVar);
                return;
            }
            P7.c cVar = new P7.c();
            k.get().d(fVar, cVar);
            P7.f byteString = cVar.readByteString();
            h(byteString.size(), 127, 128);
            this.f2373a.write(byteString);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void g(java.util.List r14) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: I7.d.b.g(java.util.List):void");
        }

        void h(int i8, int i9, int i10) {
            if (i8 < i9) {
                this.f2373a.writeByte(i8 | i10);
                return;
            }
            this.f2373a.writeByte(i10 | i9);
            int i11 = i8 - i9;
            while (i11 >= 128) {
                this.f2373a.writeByte(128 | (i11 & 127));
                i11 >>>= 7;
            }
            this.f2373a.writeByte(i11);
        }

        b(int i8, boolean z8, P7.c cVar) {
            this.f2375c = Integer.MAX_VALUE;
            this.f2379g = new c[8];
            this.f2380h = r0.length - 1;
            this.f2381i = 0;
            this.f2382j = 0;
            this.f2377e = i8;
            this.f2378f = i8;
            this.f2374b = z8;
            this.f2373a = cVar;
        }
    }

    static {
        c cVar = new c(c.TARGET_AUTHORITY, "");
        P7.f fVar = c.TARGET_METHOD;
        c cVar2 = new c(fVar, "GET");
        c cVar3 = new c(fVar, U.HTTP_METHOD);
        P7.f fVar2 = c.TARGET_PATH;
        c cVar4 = new c(fVar2, "/");
        c cVar5 = new c(fVar2, "/index.html");
        P7.f fVar3 = c.TARGET_SCHEME;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, Constants.SCHEME);
        P7.f fVar4 = c.RESPONSE_STATUS;
        f2363a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c(U.CONTENT_ACCEPT_ENCODING, "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c(U.CONTENT_ENCODING, ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c(AbstractC5186c.a.FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c(com.kakao.sdk.template.Constants.LINK, ""), new c(com.kakao.sdk.template.Constants.TYPE_LOCATION, ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f2364b = b();
    }

    static P7.f a(P7.f fVar) throws IOException {
        int size = fVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            byte b9 = fVar.getByte(i8);
            if (b9 >= 65 && b9 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.utf8());
            }
        }
        return fVar;
    }

    private static Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f2363a.length);
        int i8 = 0;
        while (true) {
            c[] cVarArr = f2363a;
            if (i8 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i8].name)) {
                linkedHashMap.put(cVarArr[i8].name, Integer.valueOf(i8));
            }
            i8++;
        }
    }
}
