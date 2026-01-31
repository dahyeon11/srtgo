package D7;

import C7.A;
import C7.C;
import C7.I;
import C7.K;
import C7.z;
import P7.o;
import P7.w;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public abstract class e {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final I EMPTY_REQUEST;
    public static final K EMPTY_RESPONSE;

    /* renamed from: d */
    private static final Method f955d;

    /* renamed from: e */
    private static final Pattern f956e;
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final z EMPTY_HEADERS = z.of(new String[0]);

    /* renamed from: a */
    private static final o f952a = o.of(P7.f.decodeHex("efbbbf"), P7.f.decodeHex("feff"), P7.f.decodeHex("fffe"), P7.f.decodeHex("0000ffff"), P7.f.decodeHex("ffff0000"));

    /* renamed from: b */
    private static final Charset f953b = Charset.forName("UTF-32BE");

    /* renamed from: c */
    private static final Charset f954c = Charset.forName("UTF-32LE");
    public static final TimeZone UTC = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> NATURAL_ORDER = new c();

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        Method declaredMethod = null;
        EMPTY_RESPONSE = K.create((C) null, bArr);
        EMPTY_REQUEST = I.create((C) null, bArr);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f955d = declaredMethod;
        f956e = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static void addSuppressedIfPossible(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f955d;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    private static boolean b(String str) {
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static Charset bomAwareCharset(P7.e eVar, Charset charset) {
        int iSelect = eVar.select(f952a);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iSelect == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iSelect == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iSelect == 3) {
            return f953b;
        }
        if (iSelect == 4) {
            return f954c;
        }
        throw new AssertionError();
    }

    private static boolean c(String str, int i8, int i9, byte[] bArr, int i10) {
        int i11 = i10;
        while (i8 < i9) {
            if (i11 == bArr.length) {
                return false;
            }
            if (i11 != i10) {
                if (str.charAt(i8) != '.') {
                    return false;
                }
                i8++;
            }
            int i12 = i8;
            int i13 = 0;
            while (i12 < i9) {
                char cCharAt = str.charAt(i12);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i13 == 0 && i8 != i12) || (i13 = ((i13 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i12++;
            }
            if (i12 - i8 == 0) {
                return false;
            }
            bArr[i11] = (byte) i13;
            i11++;
            i8 = i12;
        }
        return i11 == i10 + 4;
    }

    public static String canonicalizeHost(String str) {
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (b(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressD = (str.startsWith("[") && str.endsWith("]")) ? d(str, 1, str.length() - 1) : d(str, 0, str.length());
        if (inetAddressD == null) {
            return null;
        }
        byte[] address = inetAddressD.getAddress();
        if (address.length == 16) {
            return e(address);
        }
        if (address.length == 4) {
            return inetAddressD.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + "'");
    }

    public static int checkDuration(String str, long j8, TimeUnit timeUnit) {
        if (j8 < 0) {
            throw new IllegalArgumentException(str + " < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j8);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str + " too large.");
        }
        if (millis != 0 || j8 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str + " too small.");
    }

    public static void checkOffsetAndCount(long j8, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j8 || j8 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] concat(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0079, code lost:
    
        if (r4 == 16) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x007b, code lost:
    
        if (r5 != (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x007d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x007e, code lost:
    
        r12 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r12, r12);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x008e, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0094, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress d(java.lang.String r12, int r13, int r14) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            r7 = 0
            if (r13 >= r14) goto L79
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r13 + 2
            r9 = 2
            if (r8 > r14) goto L27
            java.lang.String r10 = "::"
            boolean r10 = r12.regionMatches(r13, r10, r2, r9)
            if (r10 == 0) goto L27
            if (r5 == r3) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r14) goto L25
            goto L79
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L34
            java.lang.String r8 = ":"
            r10 = 1
            boolean r8 = r12.regionMatches(r13, r8, r2, r10)
            if (r8 == 0) goto L36
            int r13 = r13 + 1
        L34:
            r6 = r13
            goto L4b
        L36:
            java.lang.String r8 = "."
            boolean r13 = r12.regionMatches(r13, r8, r2, r10)
            if (r13 == 0) goto L4a
            int r13 = r4 + (-2)
            boolean r12 = c(r12, r6, r14, r1, r13)
            if (r12 != 0) goto L47
            return r7
        L47:
            int r4 = r4 + 2
            goto L79
        L4a:
            return r7
        L4b:
            r8 = r2
            r13 = r6
        L4d:
            if (r13 >= r14) goto L60
            char r10 = r12.charAt(r13)
            int r10 = decodeHexDigit(r10)
            if (r10 != r3) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r10
            int r13 = r13 + 1
            goto L4d
        L60:
            int r10 = r13 - r6
            if (r10 == 0) goto L78
            r11 = 4
            if (r10 <= r11) goto L68
            goto L78
        L68:
            int r7 = r4 + 1
            int r10 = r8 >>> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r1[r4] = r10
            int r4 = r4 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L78:
            return r7
        L79:
            if (r4 == r0) goto L8a
            if (r5 != r3) goto L7e
            return r7
        L7e:
            int r12 = r4 - r5
            int r13 = 16 - r12
            java.lang.System.arraycopy(r1, r5, r1, r13, r12)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L8a:
            java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8f
            return r12
        L8f:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: D7.e.d(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int decodeHexDigit(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return c9 - '0';
        }
        if (c9 >= 'a' && c9 <= 'f') {
            return c9 - 'W';
        }
        if (c9 < 'A' || c9 > 'F') {
            return -1;
        }
        return c9 - '7';
    }

    public static int delimiterOffset(String str, int i8, int i9, String str2) {
        while (i8 < i9) {
            if (str2.indexOf(str.charAt(i8)) != -1) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static boolean discard(w wVar, int i8, TimeUnit timeUnit) {
        try {
            return skipAll(wVar, i8, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    private static String e(byte[] bArr) {
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = i10;
            while (i12 < 16 && bArr[i12] == 0 && bArr[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i8 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        P7.c cVar = new P7.c();
        while (i9 < bArr.length) {
            if (i9 == i8) {
                cVar.writeByte(58);
                i9 += i11;
                if (i9 == 16) {
                    cVar.writeByte(58);
                }
            } else {
                if (i9 > 0) {
                    cVar.writeByte(58);
                }
                cVar.writeHexadecimalUnsignedLong(((bArr[i9] & 255) << 8) | (bArr[i9 + 1] & 255));
                i9 += 2;
            }
        }
        return cVar.readUtf8();
    }

    public static /* synthetic */ Thread f(String str, boolean z8, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z8);
        return thread;
    }

    public static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String getSystemProperty(String str, String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    public static String hostHeader(A a9, boolean z8) {
        String strHost;
        if (a9.host().contains(":")) {
            strHost = "[" + a9.host() + "]";
        } else {
            strHost = a9.host();
        }
        if (!z8 && a9.port() == A.defaultPort(a9.scheme())) {
            return strHost;
        }
        return strHost + ":" + a9.port();
    }

    public static <T> List<T> immutableList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static int indexOf(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (comparator.compare(strArr[i8], str) == 0) {
                return i8;
            }
        }
        return -1;
    }

    public static int indexOfControlOrNonAscii(String str) {
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i8;
            }
        }
        return -1;
    }

    public static String[] intersect(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i8]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i8++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean nonEmptyIntersection(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e8) {
            throw new AssertionError("No System TLS", e8);
        }
    }

    public static boolean sameConnection(A a9, A a10) {
        return a9.host().equals(a10.host()) && a9.port() == a10.port() && a9.scheme().equals(a10.scheme());
    }

    public static boolean skipAll(w wVar, int i8, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = wVar.timeout().hasDeadline() ? wVar.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        wVar.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i8)) + jNanoTime);
        try {
            P7.c cVar = new P7.c();
            while (wVar.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                cVar.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                wVar.timeout().clearDeadline();
                return true;
            }
            wVar.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                wVar.timeout().clearDeadline();
                return false;
            }
            wVar.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                wVar.timeout().clearDeadline();
            } else {
                wVar.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static int skipLeadingAsciiWhitespace(String str, int i8, int i9) {
        while (i8 < i9) {
            char cCharAt = str.charAt(i8);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static int skipTrailingAsciiWhitespace(String str, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10 + 1;
            }
        }
        return i8;
    }

    public static ThreadFactory threadFactory(final String str, final boolean z8) {
        return new ThreadFactory() { // from class: D7.d
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return e.f(str, z8, runnable);
            }
        };
    }

    public static List<I7.c> toHeaderBlock(z zVar) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < zVar.size(); i8++) {
            arrayList.add(new I7.c(zVar.name(i8), zVar.value(i8)));
        }
        return arrayList;
    }

    public static z toHeaders(List<I7.c> list) {
        z.a aVar = new z.a();
        for (I7.c cVar : list) {
            a.instance.addLenient(aVar, cVar.name.utf8(), cVar.value.utf8());
        }
        return aVar.build();
    }

    public static String trimSubstring(String str, int i8, int i9) {
        int iSkipLeadingAsciiWhitespace = skipLeadingAsciiWhitespace(str, i8, i9);
        return str.substring(iSkipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace(str, iSkipLeadingAsciiWhitespace, i9));
    }

    public static boolean verifyAsIpAddress(String str) {
        return f956e.matcher(str).matches();
    }

    public static int delimiterOffset(String str, int i8, int i9, char c9) {
        while (i8 < i9) {
            if (str.charAt(i8) == c9) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    @SafeVarargs
    public static <T> List<T> immutableList(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static void closeQuietly(Socket socket) throws IOException {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e8) {
                if (!isAndroidGetsocknameError(e8)) {
                    throw e8;
                }
            } catch (RuntimeException e9) {
                throw e9;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeQuietly(ServerSocket serverSocket) throws IOException {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }
}
