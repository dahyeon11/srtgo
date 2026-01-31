package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    private static class C0159a {
        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z8 = true;
        for (File file2 : fileArrListFiles) {
            z8 = a(file2) && z8;
        }
        return z8;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        if (a(C0159a.a(context))) {
            aVar.onResultReceived(14, null);
        } else {
            aVar.onResultReceived(15, null);
        }
    }
}
