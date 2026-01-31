package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f10158a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f10159b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) {
        e.h(inputStream);
        int iJ = e.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            e.j(inputStream);
            for (int iJ2 = e.j(inputStream); iJ2 > 0; iJ2--) {
                e.h(inputStream);
            }
            iJ--;
        }
    }

    static boolean B(OutputStream outputStream, byte[] bArr, d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, p.f10170a)) {
            N(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, p.f10171b)) {
            M(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, p.f10173d)) {
            K(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, p.f10172c)) {
            L(outputStream, dVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, p.f10174e)) {
            return false;
        }
        J(outputStream, dVarArr);
        return true;
    }

    private static void C(OutputStream outputStream, d dVar) throws IOException {
        int[] iArr = dVar.f10144h;
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            e.p(outputStream, i10 - i9);
            i8++;
            i9 = i10;
        }
    }

    private static q D(d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i8 = 2;
            for (d dVar : dVarArr) {
                e.q(byteArrayOutputStream, dVar.f10139c);
                e.q(byteArrayOutputStream, dVar.f10140d);
                e.q(byteArrayOutputStream, dVar.f10143g);
                String strJ = j(dVar.f10137a, dVar.f10138b, p.f10170a);
                int iK = e.k(strJ);
                e.p(byteArrayOutputStream, iK);
                i8 = i8 + 14 + iK;
                e.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i8 == byteArray.length) {
                q qVar = new q(f.DEX_FILES, i8, byteArray, false);
                byteArrayOutputStream.close();
                return qVar;
            }
            throw e.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f10158a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, d dVar) throws IOException {
        I(outputStream, dVar);
        C(outputStream, dVar);
        H(outputStream, dVar);
    }

    private static void G(OutputStream outputStream, d dVar, String str) throws IOException {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f10141e);
        e.q(outputStream, dVar.f10142f);
        e.q(outputStream, dVar.f10139c);
        e.q(outputStream, dVar.f10143g);
        e.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, d dVar) throws IOException {
        byte[] bArr = new byte[k(dVar.f10143g)];
        for (Map.Entry entry : dVar.f10145i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, dVar);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, d dVar) throws IOException {
        int i8 = 0;
        for (Map.Entry entry : dVar.f10145i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                e.p(outputStream, iIntValue - i8);
                e.p(outputStream, 0);
                i8 = iIntValue;
            }
        }
    }

    private static void J(OutputStream outputStream, d[] dVarArr) throws IOException {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String strJ = j(dVar.f10137a, dVar.f10138b, p.f10174e);
            e.p(outputStream, e.k(strJ));
            e.p(outputStream, dVar.f10145i.size());
            e.p(outputStream, dVar.f10144h.length);
            e.q(outputStream, dVar.f10139c);
            e.n(outputStream, strJ);
            Iterator it = dVar.f10145i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i8 : dVar.f10144h) {
                e.p(outputStream, i8);
            }
        }
    }

    private static void K(OutputStream outputStream, d[] dVarArr) throws IOException {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            int size = dVar.f10145i.size() * 4;
            String strJ = j(dVar.f10137a, dVar.f10138b, p.f10173d);
            e.p(outputStream, e.k(strJ));
            e.p(outputStream, dVar.f10144h.length);
            e.q(outputStream, size);
            e.q(outputStream, dVar.f10139c);
            e.n(outputStream, strJ);
            Iterator it = dVar.f10145i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, ((Integer) it.next()).intValue());
                e.p(outputStream, 0);
            }
            for (int i8 : dVar.f10144h) {
                e.p(outputStream, i8);
            }
        }
    }

    private static void L(OutputStream outputStream, d[] dVarArr) throws IOException {
        byte[] bArrB = b(dVarArr, p.f10172c);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, bArrB);
    }

    private static void M(OutputStream outputStream, d[] dVarArr) throws IOException {
        byte[] bArrB = b(dVarArr, p.f10171b);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, bArrB);
    }

    private static void N(OutputStream outputStream, d[] dVarArr) throws IOException {
        O(outputStream, dVarArr);
    }

    private static void O(OutputStream outputStream, d[] dVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length2 = p.f10170a.length + f10158a.length + 4 + (arrayList.size() * 16);
        e.q(outputStream, arrayList.size());
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            q qVar = (q) arrayList.get(i8);
            e.q(outputStream, qVar.f10177a.getValue());
            e.q(outputStream, length2);
            if (qVar.f10180d) {
                byte[] bArr = qVar.f10179c;
                long length3 = bArr.length;
                byte[] bArrB = e.b(bArr);
                arrayList2.add(bArrB);
                e.q(outputStream, bArrB.length);
                e.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(qVar.f10179c);
                e.q(outputStream, qVar.f10179c.length);
                e.q(outputStream, 0L);
                length = qVar.f10179c.length;
            }
            length2 += length;
        }
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            outputStream.write((byte[]) arrayList2.get(i9));
        }
    }

    private static int a(d dVar) {
        Iterator it = dVar.f10145i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    private static byte[] b(d[] dVarArr, byte[] bArr) throws IOException {
        int i8 = 0;
        int iK = 0;
        for (d dVar : dVarArr) {
            iK += e.k(j(dVar.f10137a, dVar.f10138b, bArr)) + 16 + (dVar.f10141e * 2) + dVar.f10142f + k(dVar.f10143g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, p.f10172c)) {
            int length = dVarArr.length;
            while (i8 < length) {
                d dVar2 = dVarArr[i8];
                G(byteArrayOutputStream, dVar2, j(dVar2.f10137a, dVar2.f10138b, bArr));
                F(byteArrayOutputStream, dVar2);
                i8++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                G(byteArrayOutputStream, dVar3, j(dVar3.f10137a, dVar3.f10138b, bArr));
            }
            int length2 = dVarArr.length;
            while (i8 < length2) {
                F(byteArrayOutputStream, dVarArr[i8]);
                i8++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw e.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    private static q c(d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            try {
                d dVar = dVarArr[i9];
                e.p(byteArrayOutputStream, i9);
                e.p(byteArrayOutputStream, dVar.f10141e);
                i8 = i8 + 4 + (dVar.f10141e * 2);
                C(byteArrayOutputStream, dVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i8 == byteArray.length) {
            q qVar = new q(f.CLASSES, i8, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw e.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
    }

    private static q d(d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            try {
                d dVar = dVarArr[i9];
                int iA = a(dVar);
                byte[] bArrE = e(dVar);
                byte[] bArrF = f(dVar);
                e.p(byteArrayOutputStream, i9);
                int length = bArrE.length + 2 + bArrF.length;
                e.q(byteArrayOutputStream, length);
                e.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i8 = i8 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i8 == byteArray.length) {
            q qVar = new q(f.METHODS, i8, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw e.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static d i(d[] dVarArr, String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i8 = 0; i8 < dVarArr.length; i8++) {
            if (dVarArr[i8].f10138b.equals(strH)) {
                return dVarArr[i8];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String strA = p.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + p.a(bArr) + str2;
    }

    private static int k(int i8) {
        return y(i8 * 2) / 8;
    }

    private static int l(int i8, int i9, int i10) {
        if (i8 == 1) {
            throw e.c("HOT methods are not stored in the bitmap");
        }
        if (i8 == 2) {
            return i9;
        }
        if (i8 == 4) {
            return i9 + i10;
        }
        throw e.c("Unexpected flag: " + i8);
    }

    private static int[] m(InputStream inputStream, int i8) {
        int[] iArr = new int[i8];
        int iH = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            iH += e.h(inputStream);
            iArr[i9] = iH;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i8, int i9) {
        int i10 = bitSet.get(l(2, i8, i9)) ? 2 : 0;
        return bitSet.get(l(4, i8, i9)) ? i10 | 4 : i10;
    }

    static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, p.f10171b.length);
        }
        throw e.c("Invalid magic");
    }

    private static void p(InputStream inputStream, d dVar) {
        int iAvailable = inputStream.available() - dVar.f10142f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += e.h(inputStream);
            dVar.f10145i.put(Integer.valueOf(iH), 1);
            for (int iH2 = e.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw e.c("Read too much data during profile line parse");
        }
    }

    static d[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, d[] dVarArr) {
        if (Arrays.equals(bArr, p.f10175f)) {
            if (Arrays.equals(p.f10170a, bArr2)) {
                throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, dVarArr);
        }
        if (Arrays.equals(bArr, p.f10176g)) {
            return t(inputStream, bArr2, dVarArr);
        }
        throw e.c("Unsupported meta version");
    }

    static d[] r(InputStream inputStream, byte[] bArr, d[] dVarArr) throws IOException {
        if (!Arrays.equals(bArr, p.f10175f)) {
            throw e.c("Unsupported meta version");
        }
        int iJ = e.j(inputStream);
        byte[] bArrE = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            d[] dVarArrS = s(byteArrayInputStream, iJ, dVarArr);
            byteArrayInputStream.close();
            return dVarArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] s(InputStream inputStream, int i8, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i8 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i8];
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int iH = e.h(inputStream);
            iArr[i9] = e.h(inputStream);
            strArr[i9] = e.f(inputStream, iH);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            d dVar = dVarArr[i10];
            if (!dVar.f10138b.equals(strArr[i10])) {
                throw e.c("Order of dexfiles in metadata did not match baseline");
            }
            int i11 = iArr[i10];
            dVar.f10141e = i11;
            dVar.f10144h = m(inputStream, i11);
        }
        return dVarArr;
    }

    static d[] t(InputStream inputStream, byte[] bArr, d[] dVarArr) throws IOException {
        int iH = e.h(inputStream);
        byte[] bArrE = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            d[] dVarArrU = u(byteArrayInputStream, bArr, iH, dVarArr);
            byteArrayInputStream.close();
            return dVarArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] u(InputStream inputStream, byte[] bArr, int i8, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i8 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        for (int i9 = 0; i9 < i8; i9++) {
            e.h(inputStream);
            String strF = e.f(inputStream, e.h(inputStream));
            long jI = e.i(inputStream);
            int iH = e.h(inputStream);
            d dVarI = i(dVarArr, strF);
            if (dVarI == null) {
                throw e.c("Missing profile key: " + strF);
            }
            dVarI.f10140d = jI;
            int[] iArrM = m(inputStream, iH);
            if (Arrays.equals(bArr, p.f10174e)) {
                dVarI.f10141e = iH;
                dVarI.f10144h = iArrM;
            }
        }
        return dVarArr;
    }

    private static void v(InputStream inputStream, d dVar) {
        BitSet bitSetValueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f10143g * 2)));
        int i8 = 0;
        while (true) {
            int i9 = dVar.f10143g;
            if (i8 >= i9) {
                return;
            }
            int iN = n(bitSetValueOf, i8, i9);
            if (iN != 0) {
                Integer num = (Integer) dVar.f10145i.get(Integer.valueOf(i8));
                if (num == null) {
                    num = 0;
                }
                dVar.f10145i.put(Integer.valueOf(i8), Integer.valueOf(iN | num.intValue()));
            }
            i8++;
        }
    }

    static d[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, p.f10171b)) {
            throw e.c("Unsupported version");
        }
        int iJ = e.j(inputStream);
        byte[] bArrE = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            d[] dVarArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return dVarArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] x(InputStream inputStream, String str, int i8) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int iH = e.h(inputStream);
            int iH2 = e.h(inputStream);
            dVarArr[i9] = new d(str, e.f(inputStream, iH), e.i(inputStream), 0L, iH2, (int) e.i(inputStream), (int) e.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i10 = 0; i10 < i8; i10++) {
            d dVar = dVarArr[i10];
            p(inputStream, dVar);
            dVar.f10144h = m(inputStream, dVar.f10141e);
            v(inputStream, dVar);
        }
        return dVarArr;
    }

    private static int y(int i8) {
        return (i8 + 7) & (-8);
    }

    private static void z(byte[] bArr, int i8, int i9, d dVar) {
        int iL = l(i8, i9, dVar.f10143g);
        int i10 = iL / 8;
        bArr[i10] = (byte) ((1 << (iL % 8)) | bArr[i10]);
    }
}
