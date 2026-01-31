package okhttp3.internal.publicsuffix;

import P7.e;
import P7.j;
import P7.n;
import Q7.C;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f34491e = {42};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f34492f = new String[0];

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f34493g = {"*"};

    /* renamed from: h, reason: collision with root package name */
    private static final PublicSuffixDatabase f34494h = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f34495a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f34496b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private byte[] f34497c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f34498d;

    private static String a(byte[] bArr, byte[][] bArr2, int i8) {
        int i9;
        boolean z8;
        int i10;
        int i11;
        int length = bArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = (i12 + length) / 2;
            while (i13 > -1 && bArr[i13] != 10) {
                i13--;
            }
            int i14 = i13 + 1;
            int i15 = 1;
            while (true) {
                i9 = i14 + i15;
                if (bArr[i9] == 10) {
                    break;
                }
                i15++;
            }
            int i16 = i9 - i14;
            int i17 = i8;
            boolean z9 = false;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (z9) {
                    i10 = 46;
                    z8 = false;
                } else {
                    z8 = z9;
                    i10 = bArr2[i17][i18] & 255;
                }
                i11 = i10 - (bArr[i14 + i19] & 255);
                if (i11 == 0) {
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z9 = z8;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        i18 = -1;
                        z9 = true;
                    }
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                if (i11 <= 0) {
                    int i20 = i16 - i19;
                    int length2 = bArr2[i17].length - i18;
                    while (true) {
                        i17++;
                        if (i17 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i17].length;
                    }
                    if (length2 >= i20) {
                        if (length2 <= i20) {
                            return new String(bArr, i14, i16, StandardCharsets.UTF_8);
                        }
                    }
                }
                i12 = i9 + 1;
            }
            length = i13;
        }
        return null;
    }

    private String[] b(String[] strArr) throws InterruptedException {
        String str;
        String strA;
        String strA2;
        int i8 = 0;
        if (this.f34495a.get() || !this.f34495a.compareAndSet(false, true)) {
            try {
                this.f34496b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            d();
        }
        synchronized (this) {
            if (this.f34497c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i9 = 0; i9 < strArr.length; i9++) {
            bArr[i9] = strArr[i9].getBytes(StandardCharsets.UTF_8);
        }
        int i10 = 0;
        while (true) {
            str = null;
            if (i10 >= length) {
                strA = null;
                break;
            }
            strA = a(this.f34497c, bArr, i10);
            if (strA != null) {
                break;
            }
            i10++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i11 = 0; i11 < bArr2.length - 1; i11++) {
                bArr2[i11] = f34491e;
                strA2 = a(this.f34497c, bArr2, i11);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            while (true) {
                if (i8 >= length - 1) {
                    break;
                }
                String strA3 = a(this.f34498d, bArr, i8);
                if (strA3 != null) {
                    str = strA3;
                    break;
                }
                i8++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (strA == null && strA2 == null) {
            return f34493g;
        }
        String[] strArrSplit = strA != null ? strA.split("\\.") : f34492f;
        String[] strArrSplit2 = strA2 != null ? strA2.split("\\.") : f34492f;
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }

    private void c() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        e eVarBuffer = n.buffer(new j(n.source(resourceAsStream)));
        try {
            byte[] bArr = new byte[eVarBuffer.readInt()];
            eVarBuffer.readFully(bArr);
            byte[] bArr2 = new byte[eVarBuffer.readInt()];
            eVarBuffer.readFully(bArr2);
            eVarBuffer.close();
            synchronized (this) {
                this.f34497c = bArr;
                this.f34498d = bArr2;
            }
            this.f34496b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (eVarBuffer != null) {
                    try {
                        eVarBuffer.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private void d() {
        boolean z8 = false;
        while (true) {
            try {
                try {
                    c();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z8 = true;
                } catch (IOException e8) {
                    K7.j.get().log(5, "Failed to read public suffix list", e8);
                    if (z8) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public static PublicSuffixDatabase get() {
        return f34494h;
    }

    public String getEffectiveTldPlusOne(String str) throws InterruptedException {
        int length;
        int length2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrB = b(strArrSplit);
        if (strArrSplit.length == strArrB.length && strArrB[0].charAt(0) != '!') {
            return null;
        }
        if (strArrB[0].charAt(0) == '!') {
            length = strArrSplit.length;
            length2 = strArrB.length;
        } else {
            length = strArrSplit.length;
            length2 = strArrB.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit2 = str.split("\\.");
        for (int i8 = length - length2; i8 < strArrSplit2.length; i8++) {
            sb.append(strArrSplit2[i8]);
            sb.append(C.PACKAGE_SEPARATOR_CHAR);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
