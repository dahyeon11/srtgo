package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.u8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4494u8 implements I7 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4266s8 f22980c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f22978a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f22979b = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f22981d = 5242880;

    public C4494u8(InterfaceC4266s8 interfaceC4266s8, int i8) {
        this.f22980c = interfaceC4266s8;
    }

    static int a(InputStream inputStream) {
        return (h(inputStream) << 24) | h(inputStream) | (h(inputStream) << 8) | (h(inputStream) << 16);
    }

    static long b(InputStream inputStream) {
        return (h(inputStream) & 255) | ((h(inputStream) & 255) << 8) | ((h(inputStream) & 255) << 16) | ((h(inputStream) & 255) << 24) | ((h(inputStream) & 255) << 32) | ((h(inputStream) & 255) << 40) | ((h(inputStream) & 255) << 48) | ((h(inputStream) & 255) << 56);
    }

    static String c(C4152r8 c4152r8) {
        return new String(g(c4152r8, b(c4152r8)), "UTF-8");
    }

    static void d(OutputStream outputStream, int i8) throws IOException {
        outputStream.write(i8 & 255);
        outputStream.write((i8 >> 8) & 255);
        outputStream.write((i8 >> 16) & 255);
        outputStream.write((i8 >> 24) & 255);
    }

    static void e(OutputStream outputStream, long j8) throws IOException {
        outputStream.write((byte) j8);
        outputStream.write((byte) (j8 >>> 8));
        outputStream.write((byte) (j8 >>> 16));
        outputStream.write((byte) (j8 >>> 24));
        outputStream.write((byte) (j8 >>> 32));
        outputStream.write((byte) (j8 >>> 40));
        outputStream.write((byte) (j8 >>> 48));
        outputStream.write((byte) (j8 >>> 56));
    }

    static void f(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        e(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] g(C4152r8 c4152r8, long j8) throws IOException {
        long jA = c4152r8.a();
        if (j8 >= 0 && j8 <= jA) {
            int i8 = (int) j8;
            if (i8 == j8) {
                byte[] bArr = new byte[i8];
                new DataInputStream(c4152r8).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j8 + ", maxLength=" + jA);
    }

    private static int h(InputStream inputStream) throws IOException {
        int i8 = inputStream.read();
        if (i8 != -1) {
            return i8;
        }
        throw new EOFException();
    }

    private final void i(String str, C4039q8 c4039q8) {
        if (this.f22978a.containsKey(str)) {
            this.f22979b += c4039q8.f21861a - ((C4039q8) this.f22978a.get(str)).f21861a;
        } else {
            this.f22979b += c4039q8.f21861a;
        }
        this.f22978a.put(str, c4039q8);
    }

    private final void j(String str) {
        C4039q8 c4039q8 = (C4039q8) this.f22978a.remove(str);
        if (c4039q8 != null) {
            this.f22979b -= c4039q8.f21861a;
        }
    }

    private static final String k(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.I7
    public final synchronized H7 zza(String str) {
        C4039q8 c4039q8 = (C4039q8) this.f22978a.get(str);
        if (c4039q8 == null) {
            return null;
        }
        File fileZzg = zzg(str);
        try {
            C4152r8 c4152r8 = new C4152r8(new BufferedInputStream(new FileInputStream(fileZzg)), fileZzg.length());
            try {
                C4039q8 c4039q8A = C4039q8.a(c4152r8);
                if (!TextUtils.equals(str, c4039q8A.f21862b)) {
                    C3241j8.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, c4039q8A.f21862b);
                    j(str);
                    return null;
                }
                byte[] bArrG = g(c4152r8, c4152r8.a());
                H7 h72 = new H7();
                h72.zza = bArrG;
                h72.zzb = c4039q8.f21863c;
                h72.zzc = c4039q8.f21864d;
                h72.zzd = c4039q8.f21865e;
                h72.zze = c4039q8.f21866f;
                h72.zzf = c4039q8.f21867g;
                List<Q7> list = c4039q8.f21868h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (Q7 q72 : list) {
                    treeMap.put(q72.zza(), q72.zzb());
                }
                h72.zzg = treeMap;
                h72.zzh = Collections.unmodifiableList(c4039q8.f21868h);
                return h72;
            } finally {
                c4152r8.close();
            }
        } catch (IOException e8) {
            C3241j8.zza("%s: %s", fileZzg.getAbsolutePath(), e8.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.I7
    public final synchronized void zzb() {
        long length;
        C4152r8 c4152r8;
        File fileZza = this.f22980c.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        length = file.length();
                        c4152r8 = new C4152r8(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        C4039q8 c4039q8A = C4039q8.a(c4152r8);
                        c4039q8A.f21861a = length;
                        i(c4039q8A.f21862b, c4039q8A);
                        c4152r8.close();
                    } catch (Throwable th) {
                        c4152r8.close();
                        throw th;
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            C3241j8.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.I7
    public final synchronized void zzc(String str, boolean z8) {
        H7 h7Zza = zza(str);
        if (h7Zza != null) {
            h7Zza.zzf = 0L;
            h7Zza.zze = 0L;
            zzd(str, h7Zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.I7
    public final synchronized void zzd(String str, H7 h72) {
        try {
            long j8 = this.f22979b;
            int length = h72.zza.length;
            long j9 = j8 + length;
            int i8 = this.f22981d;
            if (j9 <= i8 || length <= i8 * 0.9f) {
                File fileZzg = zzg(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzg));
                    C4039q8 c4039q8 = new C4039q8(str, h72);
                    try {
                        d(bufferedOutputStream, 538247942);
                        f(bufferedOutputStream, c4039q8.f21862b);
                        String str2 = c4039q8.f21863c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        f(bufferedOutputStream, str2);
                        e(bufferedOutputStream, c4039q8.f21864d);
                        e(bufferedOutputStream, c4039q8.f21865e);
                        e(bufferedOutputStream, c4039q8.f21866f);
                        e(bufferedOutputStream, c4039q8.f21867g);
                        List<Q7> list = c4039q8.f21868h;
                        if (list != null) {
                            d(bufferedOutputStream, list.size());
                            for (Q7 q72 : list) {
                                f(bufferedOutputStream, q72.zza());
                                f(bufferedOutputStream, q72.zzb());
                            }
                        } else {
                            d(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(h72.zza);
                        bufferedOutputStream.close();
                        c4039q8.f21861a = fileZzg.length();
                        i(str, c4039q8);
                        if (this.f22979b >= this.f22981d) {
                            if (C3241j8.zzb) {
                                C3241j8.zzd("Pruning old cache entries.", new Object[0]);
                            }
                            long j10 = this.f22979b;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.f22978a.entrySet().iterator();
                            int i9 = 0;
                            while (it.hasNext()) {
                                C4039q8 c4039q82 = (C4039q8) ((Map.Entry) it.next()).getValue();
                                if (zzg(c4039q82.f21862b).delete()) {
                                    this.f22979b -= c4039q82.f21861a;
                                } else {
                                    String str3 = c4039q82.f21862b;
                                    C3241j8.zza("Could not delete cache entry for key=%s, filename=%s", str3, k(str3));
                                }
                                it.remove();
                                i9++;
                                if (this.f22979b < this.f22981d * 0.9f) {
                                    break;
                                }
                            }
                            if (C3241j8.zzb) {
                                C3241j8.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i9), Long.valueOf(this.f22979b - j10), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e8) {
                        C3241j8.zza("%s", e8.toString());
                        bufferedOutputStream.close();
                        C3241j8.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzg.delete()) {
                        C3241j8.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
                    }
                    if (!this.f22980c.zza().exists()) {
                        C3241j8.zza("Re-initializing cache after external clearing.", new Object[0]);
                        this.f22978a.clear();
                        this.f22979b = 0L;
                        zzb();
                    }
                }
            }
        } finally {
        }
    }

    public final File zzg(String str) {
        return new File(this.f22980c.zza(), k(str));
    }

    public final synchronized void zzi(String str) {
        boolean zDelete = zzg(str).delete();
        j(str);
        if (zDelete) {
            return;
        }
        C3241j8.zza("Could not delete cache entry for key=%s, filename=%s", str, k(str));
    }

    public C4494u8(File file, int i8) {
        this.f22980c = new C3925p8(this, file);
    }
}
