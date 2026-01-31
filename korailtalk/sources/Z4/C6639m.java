package z4;

import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.widget.Toast;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import n4.AbstractC5959j;
import r4.C6174a;

/* renamed from: z4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6639m {
    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b9 : bArr) {
            String hexString = Integer.toHexString(b9 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static File b(Context context) {
        File file = new File(f() ? context.getExternalCacheDir() : context.getFilesDir(), C6174a.THUMBS_FOLDER);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static File c(Context context, String str) {
        if (!f()) {
            return null;
        }
        File file = new File(context.getExternalCacheDir(), str);
        if (file.exists()) {
            return file;
        }
        file.mkdir();
        return file;
    }

    private static File d(Context context, String str, String str2, boolean z8) {
        File folder = getFolder(context, str);
        C6630d.isNotNull(folder);
        if (!C6630d.isNotNull(folder) || getAvailableStorageSize(folder) < C6174a.MIN_STORAGE_SIZE) {
            if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
                Toast.makeText(context, context.getString(AbstractC5959j.common_can_not_use_external_cache_dir), 1).show();
            }
            return null;
        }
        if (z8) {
            str2 = e(str2) + ".tmp";
        }
        File file = new File(folder, str2);
        if (!C6630d.isNull(file) || !Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            return file;
        }
        Toast.makeText(context, context.getString(AbstractC5959j.common_can_not_use_external_cache_dir), 1).show();
        return file;
    }

    public static void deleteDir(File file) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (C6630d.isNull(fileArrListFiles)) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    deleteDir(file2);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static String e(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    private static boolean f() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static long getAvailableStorageSize(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public static File getFile(Context context, String str, String str2) {
        return d(context, str, str2, false);
    }

    public static File getFolder(Context context, String str) {
        if (C6174a.VOLATILITY_FOLDER.equals(str)) {
            return c(context, str);
        }
        if (C6174a.NON_VOLATILE_FOLDER.equals(str)) {
            return c(context, str);
        }
        if (C6174a.QR_FOLDER.equals(str)) {
            return c(context, str);
        }
        if (C6174a.THUMBS_FOLDER.equals(str)) {
            return b(context);
        }
        return null;
    }

    public static File getMD5File(Context context, String str, String str2) {
        return d(context, str, str2, true);
    }
}
