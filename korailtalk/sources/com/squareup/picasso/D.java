package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
abstract class D {

    /* renamed from: a, reason: collision with root package name */
    static final StringBuilder f29737a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private static final P7.f f29738b = P7.f.encodeUtf8("RIFF");

    /* renamed from: c, reason: collision with root package name */
    private static final P7.f f29739c = P7.f.encodeUtf8("WEBP");

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    private static class b extends Thread {
        b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    static class c implements ThreadFactory {
        c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    static long a(File file) {
        long blockCountLong;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            blockCountLong = 5242880;
        }
        return Math.max(Math.min(blockCountLong, 52428800L), 5242880L);
    }

    static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) o(context, "activity");
        return (int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7);
    }

    static void c() {
        if (!r()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static void d() {
        if (r()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    static Object e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static File f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static String g(w wVar) {
        StringBuilder sb = f29737a;
        String strH = h(wVar, sb);
        sb.setLength(0);
        return strH;
    }

    static String h(w wVar, StringBuilder sb) {
        String str = wVar.stableKey;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(wVar.stableKey);
        } else {
            Uri uri = wVar.uri;
            if (uri != null) {
                String string = uri.toString();
                sb.ensureCapacity(string.length() + 50);
                sb.append(string);
            } else {
                sb.ensureCapacity(50);
                sb.append(wVar.resourceId);
            }
        }
        sb.append('\n');
        if (wVar.rotationDegrees != 0.0f) {
            sb.append("rotation:");
            sb.append(wVar.rotationDegrees);
            if (wVar.hasRotationPivot) {
                sb.append('@');
                sb.append(wVar.rotationPivotX);
                sb.append('x');
                sb.append(wVar.rotationPivotY);
            }
            sb.append('\n');
        }
        if (wVar.hasSize()) {
            sb.append("resize:");
            sb.append(wVar.targetWidth);
            sb.append('x');
            sb.append(wVar.targetHeight);
            sb.append('\n');
        }
        if (wVar.centerCrop) {
            sb.append("centerCrop:");
            sb.append(wVar.centerCropGravity);
            sb.append('\n');
        } else if (wVar.centerInside) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List<F6.e> list = wVar.transformations;
        if (list == null || list.size() <= 0) {
            return sb.toString();
        }
        android.support.v4.media.session.f.a(wVar.transformations.get(0));
        throw null;
    }

    static void i(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    static int j(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static String k(RunnableC5295c runnableC5295c) {
        return l(runnableC5295c, "");
    }

    static String l(RunnableC5295c runnableC5295c, String str) {
        StringBuilder sb = new StringBuilder(str);
        AbstractC5293a abstractC5293aH = runnableC5295c.h();
        if (abstractC5293aH != null) {
            sb.append(abstractC5293aH.f29742b.c());
        }
        List listI = runnableC5295c.i();
        if (listI != null) {
            int size = listI.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (i8 > 0 || abstractC5293aH != null) {
                    sb.append(", ");
                }
                sb.append(((AbstractC5293a) listI.get(i8)).f29742b.c());
            }
        }
        return sb.toString();
    }

    static int m(Resources resources, w wVar) throws FileNotFoundException {
        Uri uri;
        int i8 = wVar.resourceId;
        if (i8 != 0 || (uri = wVar.uri) == null) {
            return i8;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + wVar.uri);
        }
        List<String> pathSegments = wVar.uri.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + wVar.uri);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.uri);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + wVar.uri);
    }

    static Resources n(Context context, w wVar) throws FileNotFoundException {
        Uri uri;
        if (wVar.resourceId != 0 || (uri = wVar.uri) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + wVar.uri);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.uri);
        }
    }

    static Object o(Context context, String str) {
        return context.getSystemService(str);
    }

    static boolean p(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean q(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    static boolean r() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean s(P7.e eVar) {
        return eVar.rangeEquals(0L, f29738b) && eVar.rangeEquals(8L, f29739c);
    }

    static void t(String str, String str2, String str3) {
        u(str, str2, str3, "");
    }

    static void u(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4);
    }
}
