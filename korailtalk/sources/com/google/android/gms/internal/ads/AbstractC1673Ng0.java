package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Ng0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1673Ng0 {
    public static File zza(File file, boolean z8) {
        if (z8 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File zzb(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(zzc(str, file), str2);
    }

    public static File zzc(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        zza(file2, false);
        return file2;
    }

    public static boolean zzd(File file) {
        boolean z8;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z8 = true;
            for (int i8 = 0; i8 < fileArrListFiles.length; i8++) {
                File file2 = fileArrListFiles[i8];
                z8 = file2 != null && zzd(file2) && z8;
            }
        } else {
            z8 = true;
        }
        return file.delete() && z8;
    }

    public static boolean zze(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            o2.l.closeQuietly(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            o2.l.closeQuietly(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            o2.l.closeQuietly(fileOutputStream2);
            throw th;
        }
    }
}
