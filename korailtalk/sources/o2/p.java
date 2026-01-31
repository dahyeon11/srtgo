package o2;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import i2.AbstractC5683p;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static String f34462a;

    /* renamed from: b, reason: collision with root package name */
    private static int f34463b;

    public static String getMyProcessName() throws Throwable {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (f34462a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f34462a = Application.getProcessName();
            } else {
                int iMyPid = f34463b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f34463b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        str = "/proc/" + iMyPid + "/cmdline";
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String line = bufferedReader.readLine();
                            AbstractC5683p.checkNotNull(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            l.closeQuietly(bufferedReader2);
                            throw th;
                        }
                        l.closeQuietly(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                f34462a = strTrim;
            }
        }
        return f34462a;
    }
}
