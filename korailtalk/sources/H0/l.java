package H0;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static l f1592a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final int f1593b = 20;

    public static class a extends l {

        /* renamed from: c, reason: collision with root package name */
        private int f1594c;

        public a(int i8) {
            super(i8);
            this.f1594c = i8;
        }

        @Override // H0.l
        public void debug(String str, String str2, Throwable... thArr) {
            if (this.f1594c > 3 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // H0.l
        public void error(String str, String str2, Throwable... thArr) {
            if (this.f1594c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // H0.l
        public void info(String str, String str2, Throwable... thArr) {
            if (this.f1594c > 4 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // H0.l
        public void verbose(String str, String str2, Throwable... thArr) {
            if (this.f1594c > 2 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // H0.l
        public void warning(String str, String str2, Throwable... thArr) {
            if (this.f1594c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public l(int i8) {
    }

    public static synchronized l get() {
        try {
            if (f1592a == null) {
                f1592a = new a(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1592a;
    }

    public static synchronized void setLogger(l lVar) {
        f1592a = lVar;
    }

    public static String tagWithPrefix(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i8 = f1593b;
        if (length >= i8) {
            sb.append(str.substring(0, i8));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void debug(String str, String str2, Throwable... thArr);

    public abstract void error(String str, String str2, Throwable... thArr);

    public abstract void info(String str, String str2, Throwable... thArr);

    public abstract void verbose(String str, String str2, Throwable... thArr);

    public abstract void warning(String str, String str2, Throwable... thArr);
}
