package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.core.app.AbstractC0918b;
import androidx.core.app.E;
import androidx.core.view.C1004z;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0918b extends androidx.core.content.a {

    /* renamed from: androidx.core.app.b$a */
    static class a {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    static class C0127b {
        static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* renamed from: androidx.core.app.b$c */
    static class c {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i8) {
            activity.requestPermissions(strArr, i8);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$d */
    static class d {
        static <T> T a(Activity activity, int i8) {
            return (T) activity.requireViewById(i8);
        }
    }

    /* renamed from: androidx.core.app.b$e */
    static class e {
        static Display a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        static void b(Activity activity, androidx.core.content.b bVar, Bundle bundle) {
            activity.setLocusContext(bVar == null ? null : bVar.toLocusId(), bundle);
        }
    }

    /* renamed from: androidx.core.app.b$f */
    static class f {
        static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: androidx.core.app.b$g */
    static class g {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$h */
    public interface h {
        void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.b$i */
    public interface i {
    }

    /* renamed from: androidx.core.app.b$j */
    public interface j {
        void validateRequestPermissionsRequestCode(int i8);
    }

    /* renamed from: androidx.core.app.b$k */
    static class k extends SharedElementCallback {

        /* renamed from: a, reason: collision with root package name */
        private final E f8707a;

        k(E e8) {
            this.f8707a = e8;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f8707a.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f8707a.onCreateSnapshotView(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f8707a.onMapSharedElements(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f8707a.onRejectSharedElements(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f8707a.onSharedElementEnd(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f8707a.onSharedElementStart(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f8707a.onSharedElementsArrived(list, list2, new E.a() { // from class: androidx.core.app.c
                @Override // androidx.core.app.E.a
                public final void onSharedElementsReady() {
                    AbstractC0918b.c.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Activity activity) {
        if (activity.isFinishing() || AbstractC0921e.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void finishAffinity(Activity activity) {
        activity.finishAffinity();
    }

    public static void finishAfterTransition(Activity activity) {
        a.a(activity);
    }

    public static i getPermissionCompatDelegate() {
        return null;
    }

    public static Uri getReferrer(Activity activity) {
        return C0127b.a(activity);
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean isLaunchedFromBubble(Activity activity) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31) {
            return f.a(activity);
        }
        if (i8 == 30) {
            return (e.a(activity) == null || e.a(activity).getDisplayId() == 0) ? false : true;
        }
        if (i8 == 29) {
            return (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
        }
        return false;
    }

    public static void postponeEnterTransition(Activity activity) {
        a.b(activity);
    }

    public static void recreate(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0918b.c(activity);
                }
            });
        }
    }

    public static C1004z requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
        return C1004z.request(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestPermissions(Activity activity, String[] strArr, int i8) {
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (TextUtils.isEmpty(strArr[i9])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i9], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i9));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (!hashSet.contains(Integer.valueOf(i11))) {
                    strArr2[i10] = strArr[i11];
                    i10++;
                }
            }
        }
        if (activity instanceof j) {
            ((j) activity).validateRequestPermissionsRequestCode(i8);
        }
        c.b(activity, strArr, i8);
    }

    public static <T extends View> T requireViewById(Activity activity, int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) d.a(activity, i8);
        }
        T t8 = (T) activity.findViewById(i8);
        if (t8 != null) {
            return t8;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(Activity activity, E e8) {
        a.c(activity, e8 != null ? new k(e8) : null);
    }

    public static void setExitSharedElementCallback(Activity activity, E e8) {
        a.d(activity, e8 != null ? new k(e8) : null);
    }

    public static void setLocusContext(Activity activity, androidx.core.content.b bVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            e.b(activity, bVar, bundle);
        }
    }

    public static void setPermissionCompatDelegate(i iVar) {
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i8 >= 32 ? g.a(activity, str) : i8 == 31 ? f.b(activity, str) : c.c(activity, str);
        }
        return false;
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i8, Bundle bundle) {
        activity.startActivityForResult(intent, i8, bundle);
    }

    public static void startIntentSenderForResult(Activity activity, IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11, bundle);
    }

    public static void startPostponedEnterTransition(Activity activity) {
        a.e(activity);
    }
}
