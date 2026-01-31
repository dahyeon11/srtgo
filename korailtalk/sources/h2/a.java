package H2;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import i2.AbstractC5683p;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import m2.AbstractC5906a;
import n2.d;
import o2.r;
import o2.t;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: n, reason: collision with root package name */
    private static ScheduledExecutorService f1778n;

    /* renamed from: o, reason: collision with root package name */
    private static volatile InterfaceC0035a f1779o = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Object f1780a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f1781b;

    /* renamed from: c, reason: collision with root package name */
    private WorkSource f1782c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1783d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1784e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1785f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1786g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f1787h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1788i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f1789j;

    /* renamed from: k, reason: collision with root package name */
    private final Set f1790k;

    /* renamed from: l, reason: collision with root package name */
    private int f1791l;

    /* renamed from: m, reason: collision with root package name */
    private AtomicInteger f1792m;

    /* renamed from: H2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0035a {
    }

    public a(Context context, int i8, String str) {
        this(context, i8, str, null, context == null ? null : context.getPackageName());
    }

    private final String a(String str) {
        return this.f1788i ? !TextUtils.isEmpty(str) ? str : this.f1785f : this.f1785f;
    }

    private final List b() {
        return t.getNames(this.f1782c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i8) {
        if (this.f1781b.isHeld()) {
            try {
                this.f1781b.release();
            } catch (RuntimeException e8) {
                if (!e8.getClass().equals(RuntimeException.class)) {
                    throw e8;
                }
                Log.e("WakeLock", String.valueOf(this.f1784e).concat(" was already released!"), e8);
            }
            this.f1781b.isHeld();
        }
    }

    public void acquire(long j8) {
        this.f1792m.incrementAndGet();
        String strA = a(null);
        synchronized (this.f1780a) {
            try {
                if (!this.f1789j.isEmpty() || this.f1791l > 0) {
                    if (!this.f1781b.isHeld()) {
                        this.f1789j.clear();
                        this.f1791l = 0;
                    }
                }
                if (this.f1788i) {
                    Integer[] numArr = (Integer[]) this.f1789j.get(strA);
                    if (numArr == null) {
                        this.f1789j.put(strA, new Integer[]{1});
                        d.getInstance().registerEvent(this.f1787h, n2.c.getEventKey(this.f1781b, strA), 7, this.f1784e, strA, null, this.f1783d, b(), j8);
                        this.f1791l++;
                    } else {
                        numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                        if (!this.f1788i) {
                            d.getInstance().registerEvent(this.f1787h, n2.c.getEventKey(this.f1781b, strA), 7, this.f1784e, strA, null, this.f1783d, b(), j8);
                            this.f1791l++;
                        }
                    }
                } else if (!this.f1788i && this.f1791l == 0) {
                    d.getInstance().registerEvent(this.f1787h, n2.c.getEventKey(this.f1781b, strA), 7, this.f1784e, strA, null, this.f1783d, b(), j8);
                    this.f1791l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1781b.acquire();
        if (j8 > 0) {
            f1778n.schedule(new c(this), j8, TimeUnit.MILLISECONDS);
        }
    }

    public boolean isHeld() {
        return this.f1781b.isHeld();
    }

    public void release() {
        Integer[] numArr;
        if (this.f1792m.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f1784e).concat(" release without a matched acquire!"));
        }
        String strA = a(null);
        synchronized (this.f1780a) {
            try {
                if (!this.f1788i || (numArr = (Integer[]) this.f1789j.get(strA)) == null) {
                    if (!this.f1788i && this.f1791l == 1) {
                        d.getInstance().registerEvent(this.f1787h, n2.c.getEventKey(this.f1781b, strA), 8, this.f1784e, strA, null, this.f1783d, b());
                        this.f1791l--;
                    }
                } else if (numArr[0].intValue() == 1) {
                    this.f1789j.remove(strA);
                    d.getInstance().registerEvent(this.f1787h, n2.c.getEventKey(this.f1781b, strA), 8, this.f1784e, strA, null, this.f1783d, b());
                    this.f1791l--;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() - 1);
                    if (!this.f1788i) {
                        d.getInstance().registerEvent(this.f1787h, n2.c.getEventKey(this.f1781b, strA), 8, this.f1784e, strA, null, this.f1783d, b());
                        this.f1791l--;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c(0);
    }

    public void setReferenceCounted(boolean z8) {
        this.f1781b.setReferenceCounted(z8);
        this.f1788i = z8;
    }

    private a(Context context, int i8, String str, String str2, String str3) {
        this(context, i8, str, null, str3, null);
    }

    private a(Context context, int i8, String str, String str2, String str3, String str4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f1780a = this;
        this.f1788i = true;
        this.f1789j = new HashMap();
        this.f1790k = Collections.synchronizedSet(new HashSet());
        this.f1792m = new AtomicInteger(0);
        AbstractC5683p.checkNotNull(context, "WakeLock: context must not be null");
        AbstractC5683p.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.f1783d = i8;
        this.f1785f = null;
        this.f1786g = null;
        Context applicationContext = context.getApplicationContext();
        this.f1787h = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String strValueOf = String.valueOf(str);
            this.f1784e = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        } else {
            this.f1784e = str;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i8, str);
        this.f1781b = wakeLockNewWakeLock;
        if (t.hasWorkSourcePermission(context)) {
            WorkSource workSourceFromPackage = t.fromPackage(context, r.isEmptyOrWhitespace(str3) ? context.getPackageName() : str3);
            this.f1782c = workSourceFromPackage;
            if (workSourceFromPackage != null && t.hasWorkSourcePermission(applicationContext)) {
                WorkSource workSource = this.f1782c;
                if (workSource != null) {
                    workSource.add(workSourceFromPackage);
                } else {
                    this.f1782c = workSourceFromPackage;
                }
                try {
                    wakeLockNewWakeLock.setWorkSource(this.f1782c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e8) {
                    Log.wtf("WakeLock", e8.toString());
                }
            }
        }
        if (f1778n == null) {
            f1778n = AbstractC5906a.getInstance().newSingleThreadScheduledExecutor();
        }
    }
}
