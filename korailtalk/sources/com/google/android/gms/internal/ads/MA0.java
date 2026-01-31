package com.google.android.gms.internal.ads;

import com.kakao.sdk.template.Constants;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class MA0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f14543a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f14544b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f14545c;

    /* renamed from: d, reason: collision with root package name */
    private static final KA0 f14546d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f14547e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f14548f;

    /* renamed from: g, reason: collision with root package name */
    static final long f14549g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f14550h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f14551i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.MA0.<clinit>():void");
    }

    static void A(Object obj, long j8, float f8) {
        f14546d.zzh(obj, j8, f8);
    }

    static void B(Object obj, long j8, int i8) {
        f14546d.f13758a.putInt(obj, j8, i8);
    }

    static void C(Object obj, long j8, long j9) {
        f14546d.f13758a.putLong(obj, j8, j9);
    }

    static void D(Object obj, long j8, Object obj2) {
        f14546d.f13758a.putObject(obj, j8, obj2);
    }

    static /* bridge */ /* synthetic */ boolean E(Object obj, long j8) {
        return ((byte) ((f14546d.f13758a.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean F(Object obj, long j8) {
        return ((byte) ((f14546d.f13758a.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    static boolean G(Class cls) {
        int i8 = Ux0.zza;
        try {
            Class cls2 = f14544b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean H(Object obj, long j8) {
        return f14546d.zzi(obj, j8);
    }

    static boolean a() {
        return f14548f;
    }

    static boolean b() {
        return f14547e;
    }

    private static int c(Class cls) {
        if (f14548f) {
            return f14546d.f13758a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int d(Class cls) {
        if (f14548f) {
            return f14546d.f13758a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field e() {
        int i8 = Ux0.zza;
        Field fieldF = f(Buffer.class, "effectiveDirectAddress");
        if (fieldF != null) {
            return fieldF;
        }
        Field fieldF2 = f(Buffer.class, Constants.ADDRESS);
        if (fieldF2 == null || fieldF2.getType() != Long.TYPE) {
            return null;
        }
        return fieldF2;
    }

    private static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Object obj, long j8, byte b9) {
        KA0 ka0 = f14546d;
        long j9 = (-4) & j8;
        int i8 = ka0.f13758a.getInt(obj, j9);
        int i9 = ((~((int) j8)) & 3) << 3;
        ka0.f13758a.putInt(obj, j9, ((255 & b9) << i9) | (i8 & (~(255 << i9))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Object obj, long j8, byte b9) {
        KA0 ka0 = f14546d;
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        ka0.f13758a.putInt(obj, j9, ((255 & b9) << i8) | (ka0.f13758a.getInt(obj, j9) & (~(255 << i8))));
    }

    static byte i(long j8) {
        return f14546d.zza(j8);
    }

    static double j(Object obj, long j8) {
        return f14546d.zzb(obj, j8);
    }

    static float k(Object obj, long j8) {
        return f14546d.zzc(obj, j8);
    }

    static int l(Object obj, long j8) {
        return f14546d.f13758a.getInt(obj, j8);
    }

    static long m(ByteBuffer byteBuffer) {
        KA0 ka0 = f14546d;
        return ka0.f13758a.getLong(byteBuffer, f14550h);
    }

    static long n(Object obj, long j8) {
        return f14546d.f13758a.getLong(obj, j8);
    }

    static Object o(Class cls) {
        try {
            return f14543a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    static Object p(Object obj, long j8) {
        return f14546d.f13758a.getObject(obj, j8);
    }

    static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new HA0());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void r(Throwable th) {
        Logger.getLogger(MA0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void w(long j8, byte[] bArr, long j9, long j10) {
        f14546d.zzd(j8, bArr, j9, j10);
    }

    static void x(Object obj, long j8, boolean z8) {
        f14546d.zze(obj, j8, z8);
    }

    static void y(byte[] bArr, long j8, byte b9) {
        f14546d.zzf(bArr, f14549g + j8, b9);
    }

    static void z(Object obj, long j8, double d9) {
        f14546d.zzg(obj, j8, d9);
    }
}
