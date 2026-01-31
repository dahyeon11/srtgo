package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements B0.a {

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        public static void postFrameCallback(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.l
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j8) {
                    runnable.run();
                }
            });
        }
    }

    private static class b {
        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.k
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                h.writeProfile(context);
            }
        });
    }

    void d(final Context context) {
        a.postFrameCallback(new Runnable() { // from class: androidx.profileinstaller.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f10153a.f(context);
            }
        });
    }

    @Override // B0.a
    public List<Class<? extends B0.a>> dependencies() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void f(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? b.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: androidx.profileinstaller.j
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.i(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    @Override // B0.a
    public c create(Context context) {
        d(context.getApplicationContext());
        return new c();
    }
}
