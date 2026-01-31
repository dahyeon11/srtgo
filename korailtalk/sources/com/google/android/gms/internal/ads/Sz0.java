package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class Sz0 implements InterfaceC3360kA0 {

    /* renamed from: p */
    private static final int[] f16360p = new int[0];

    /* renamed from: q */
    private static final Unsafe f16361q = MA0.q();

    /* renamed from: a */
    private final int[] f16362a;

    /* renamed from: b */
    private final Object[] f16363b;

    /* renamed from: c */
    private final int f16364c;

    /* renamed from: d */
    private final int f16365d;

    /* renamed from: e */
    private final Pz0 f16366e;

    /* renamed from: f */
    private final boolean f16367f;

    /* renamed from: g */
    private final boolean f16368g;

    /* renamed from: h */
    private final int[] f16369h;

    /* renamed from: i */
    private final int f16370i;

    /* renamed from: j */
    private final int f16371j;

    /* renamed from: k */
    private final Dz0 f16372k;

    /* renamed from: l */
    private final BA0 f16373l;

    /* renamed from: m */
    private final Jy0 f16374m;

    /* renamed from: n */
    private final Vz0 f16375n;

    /* renamed from: o */
    private final Jz0 f16376o;

    private Sz0(int[] iArr, Object[] objArr, int i8, int i9, Pz0 pz0, int i10, boolean z8, int[] iArr2, int i11, int i12, Vz0 vz0, Dz0 dz0, BA0 ba0, Jy0 jy0, Jz0 jz0) {
        this.f16362a = iArr;
        this.f16363b = objArr;
        this.f16364c = i8;
        this.f16365d = i9;
        this.f16368g = pz0 instanceof Zy0;
        boolean z9 = false;
        if (jy0 != null && jy0.j(pz0)) {
            z9 = true;
        }
        this.f16367f = z9;
        this.f16369h = iArr2;
        this.f16370i = i11;
        this.f16371j = i12;
        this.f16375n = vz0;
        this.f16372k = dz0;
        this.f16373l = ba0;
        this.f16374m = jy0;
        this.f16366e = pz0;
        this.f16376o = jz0;
    }

    private final int A(int i8) {
        if (i8 < this.f16364c || i8 > this.f16365d) {
            return -1;
        }
        return C(i8, 0);
    }

    private final int B(int i8) {
        return this.f16362a[i8 + 2];
    }

    private final int C(int i8, int i9) {
        int length = (this.f16362a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f16362a[i11];
            if (i8 == i12) {
                return i11;
            }
            if (i8 < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    private static int D(int i8) {
        return (i8 >>> 20) & 255;
    }

    private final int E(int i8) {
        return this.f16362a[i8 + 1];
    }

    private static long F(Object obj, long j8) {
        return ((Long) MA0.p(obj, j8)).longValue();
    }

    private final InterfaceC2880fz0 G(int i8) {
        int i9 = i8 / 3;
        return (InterfaceC2880fz0) this.f16363b[i9 + i9 + 1];
    }

    private final InterfaceC3360kA0 H(int i8) {
        Object[] objArr = this.f16363b;
        int i9 = i8 / 3;
        int i10 = i9 + i9;
        InterfaceC3360kA0 interfaceC3360kA0 = (InterfaceC3360kA0) objArr[i10];
        if (interfaceC3360kA0 != null) {
            return interfaceC3360kA0;
        }
        InterfaceC3360kA0 interfaceC3360kA0Zzb = Zz0.zza().zzb((Class) objArr[i10 + 1]);
        this.f16363b[i10] = interfaceC3360kA0Zzb;
        return interfaceC3360kA0Zzb;
    }

    private final Object I(Object obj, int i8, Object obj2, BA0 ba0, Object obj3) {
        int i9 = this.f16362a[i8];
        Object objP = MA0.p(obj, E(i8) & 1048575);
        if (objP == null || G(i8) == null) {
            return obj2;
        }
        android.support.v4.media.session.f.a(J(i8));
        throw null;
    }

    private final Object J(int i8) {
        int i9 = i8 / 3;
        return this.f16363b[i9 + i9];
    }

    private final Object a(Object obj, int i8) {
        InterfaceC3360kA0 interfaceC3360kA0H = H(i8);
        int iE = E(i8) & 1048575;
        if (!n(obj, i8)) {
            return interfaceC3360kA0H.zze();
        }
        Object object = f16361q.getObject(obj, iE);
        if (q(object)) {
            return object;
        }
        Object objZze = interfaceC3360kA0H.zze();
        if (object != null) {
            interfaceC3360kA0H.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object b(Object obj, int i8, int i9) {
        InterfaceC3360kA0 interfaceC3360kA0H = H(i9);
        if (!r(obj, i8, i9)) {
            return interfaceC3360kA0H.zze();
        }
        Object object = f16361q.getObject(obj, E(i9) & 1048575);
        if (q(object)) {
            return object;
        }
        Object objZze = interfaceC3360kA0H.zze();
        if (object != null) {
            interfaceC3360kA0H.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void d(Object obj) {
        if (!q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void e(Object obj, Object obj2, int i8) {
        if (n(obj2, i8)) {
            int iE = E(i8) & 1048575;
            Unsafe unsafe = f16361q;
            long j8 = iE;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f16362a[i8] + " is present but null: " + obj2.toString());
            }
            InterfaceC3360kA0 interfaceC3360kA0H = H(i8);
            if (!n(obj, i8)) {
                if (q(object)) {
                    Object objZze = interfaceC3360kA0H.zze();
                    interfaceC3360kA0H.zzg(objZze, object);
                    unsafe.putObject(obj, j8, objZze);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                h(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!q(object2)) {
                Object objZze2 = interfaceC3360kA0H.zze();
                interfaceC3360kA0H.zzg(objZze2, object2);
                unsafe.putObject(obj, j8, objZze2);
                object2 = objZze2;
            }
            interfaceC3360kA0H.zzg(object2, object);
        }
    }

    private final void f(Object obj, Object obj2, int i8) {
        int i9 = this.f16362a[i8];
        if (r(obj2, i9, i8)) {
            int iE = E(i8) & 1048575;
            Unsafe unsafe = f16361q;
            long j8 = iE;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f16362a[i8] + " is present but null: " + obj2.toString());
            }
            InterfaceC3360kA0 interfaceC3360kA0H = H(i8);
            if (!r(obj, i9, i8)) {
                if (q(object)) {
                    Object objZze = interfaceC3360kA0H.zze();
                    interfaceC3360kA0H.zzg(objZze, object);
                    unsafe.putObject(obj, j8, objZze);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                i(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!q(object2)) {
                Object objZze2 = interfaceC3360kA0H.zze();
                interfaceC3360kA0H.zzg(objZze2, object2);
                unsafe.putObject(obj, j8, objZze2);
                object2 = objZze2;
            }
            interfaceC3360kA0H.zzg(object2, object);
        }
    }

    private final void g(Object obj, int i8, InterfaceC2444cA0 interfaceC2444cA0) {
        long j8 = i8 & 1048575;
        if (m(i8)) {
            MA0.D(obj, j8, interfaceC2444cA0.zzu());
        } else if (this.f16368g) {
            MA0.D(obj, j8, interfaceC2444cA0.zzt());
        } else {
            MA0.D(obj, j8, interfaceC2444cA0.zzp());
        }
    }

    private final void h(Object obj, int i8) {
        int iB = B(i8);
        long j8 = 1048575 & iB;
        if (j8 == 1048575) {
            return;
        }
        MA0.B(obj, j8, (1 << (iB >>> 20)) | MA0.l(obj, j8));
    }

    private final void i(Object obj, int i8, int i9) {
        MA0.B(obj, B(i9) & 1048575, i8);
    }

    private final void j(Object obj, int i8, Object obj2) {
        f16361q.putObject(obj, E(i8) & 1048575, obj2);
        h(obj, i8);
    }

    private final void k(Object obj, int i8, int i9, Object obj2) {
        f16361q.putObject(obj, E(i9) & 1048575, obj2);
        i(obj, i8, i9);
    }

    private final boolean l(Object obj, Object obj2, int i8) {
        return n(obj, i8) == n(obj2, i8);
    }

    private static boolean m(int i8) {
        return (i8 & 536870912) != 0;
    }

    private final boolean n(Object obj, int i8) {
        int iB = B(i8);
        long j8 = iB & 1048575;
        if (j8 != 1048575) {
            return (MA0.l(obj, j8) & (1 << (iB >>> 20))) != 0;
        }
        int iE = E(i8);
        long j9 = iE & 1048575;
        switch (D(iE)) {
            case 0:
                return Double.doubleToRawLongBits(MA0.j(obj, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(MA0.k(obj, j9)) != 0;
            case 2:
                return MA0.n(obj, j9) != 0;
            case 3:
                return MA0.n(obj, j9) != 0;
            case 4:
                return MA0.l(obj, j9) != 0;
            case 5:
                return MA0.n(obj, j9) != 0;
            case 6:
                return MA0.l(obj, j9) != 0;
            case 7:
                return MA0.H(obj, j9);
            case 8:
                Object objP = MA0.p(obj, j9);
                if (objP instanceof String) {
                    return !((String) objP).isEmpty();
                }
                if (objP instanceof AbstractC3677my0) {
                    return !AbstractC3677my0.zzb.equals(objP);
                }
                throw new IllegalArgumentException();
            case 9:
                return MA0.p(obj, j9) != null;
            case 10:
                return !AbstractC3677my0.zzb.equals(MA0.p(obj, j9));
            case 11:
                return MA0.l(obj, j9) != 0;
            case 12:
                return MA0.l(obj, j9) != 0;
            case 13:
                return MA0.l(obj, j9) != 0;
            case 14:
                return MA0.n(obj, j9) != 0;
            case 15:
                return MA0.l(obj, j9) != 0;
            case 16:
                return MA0.n(obj, j9) != 0;
            case 17:
                return MA0.p(obj, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean o(Object obj, int i8, int i9, int i10, int i11) {
        return i9 == 1048575 ? n(obj, i8) : (i10 & i11) != 0;
    }

    private static boolean p(Object obj, int i8, InterfaceC3360kA0 interfaceC3360kA0) {
        return interfaceC3360kA0.zzl(MA0.p(obj, i8 & 1048575));
    }

    private static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Zy0) {
            return ((Zy0) obj).T();
        }
        return true;
    }

    private final boolean r(Object obj, int i8, int i9) {
        return MA0.l(obj, (long) (B(i9) & 1048575)) == i8;
    }

    private static boolean s(Object obj, long j8) {
        return ((Boolean) MA0.p(obj, j8)).booleanValue();
    }

    private static final void t(int i8, Object obj, UA0 ua0) {
        if (obj instanceof String) {
            ua0.zzG(i8, (String) obj);
        } else {
            ua0.zzd(i8, (AbstractC3677my0) obj);
        }
    }

    static CA0 v(Object obj) {
        Zy0 zy0 = (Zy0) obj;
        CA0 ca0 = zy0.zzt;
        if (ca0 != CA0.zzc()) {
            return ca0;
        }
        CA0 ca0C = CA0.c();
        zy0.zzt = ca0C;
        return ca0C;
    }

    /* JADX WARN: Removed duplicated region for block: B:349:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.ads.Sz0 w(java.lang.Class r33, com.google.android.gms.internal.ads.Mz0 r34, com.google.android.gms.internal.ads.Vz0 r35, com.google.android.gms.internal.ads.Dz0 r36, com.google.android.gms.internal.ads.BA0 r37, com.google.android.gms.internal.ads.Jy0 r38, com.google.android.gms.internal.ads.Jz0 r39) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Sz0.w(java.lang.Class, com.google.android.gms.internal.ads.Mz0, com.google.android.gms.internal.ads.Vz0, com.google.android.gms.internal.ads.Dz0, com.google.android.gms.internal.ads.BA0, com.google.android.gms.internal.ads.Jy0, com.google.android.gms.internal.ads.Jz0):com.google.android.gms.internal.ads.Sz0");
    }

    private static double x(Object obj, long j8) {
        return ((Double) MA0.p(obj, j8)).doubleValue();
    }

    private static float y(Object obj, long j8) {
        return ((Float) MA0.p(obj, j8)).floatValue();
    }

    private static int z(Object obj, long j8) {
        return ((Integer) MA0.p(obj, j8)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:1161:0x0cbb, code lost:
    
        if (r14 == 1048575) goto L1163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1162:0x0cbd, code lost:
    
        r29.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1163:0x0cc3, code lost:
    
        r10 = r6.f16370i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1165:0x0cc8, code lost:
    
        if (r10 >= r6.f16371j) goto L1271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1166:0x0cca, code lost:
    
        I(r34, r6.f16369h[r10], null, r6.f16373l, r34);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1167:0x0cdd, code lost:
    
        if (r9 != 0) goto L1172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1168:0x0cdf, code lost:
    
        if (r8 != r12) goto L1170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1171:0x0ce6, code lost:
    
        throw com.google.android.gms.internal.ads.C4021pz0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1172:0x0ce7, code lost:
    
        if (r8 > r12) goto L1175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1173:0x0ce9, code lost:
    
        if (r11 != r9) goto L1175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1174:0x0ceb, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1176:0x0cf0, code lost:
    
        throw com.google.android.gms.internal.ads.C4021pz0.g();
     */
    /* JADX WARN: Removed duplicated region for block: B:1054:0x0965 A[PHI: r7 r8 r10 r11 r12 r14 r15 r29
  0x0965: PHI (r7v28 byte[]) = (r7v10 byte[]), (r7v11 byte[]), (r7v13 byte[]), (r7v19 byte[]), (r7v26 byte[]), (r7v33 byte[]) binds: [B:1048:0x093b, B:1032:0x08dd, B:1016:0x0888, B:941:0x0712, B:837:0x052a, B:821:0x04c5] A[DONT_GENERATE, DONT_INLINE]
  0x0965: PHI (r8v155 int) = (r8v97 int), (r8v98 int), (r8v100 int), (r8v125 int), (r8v153 int), (r8v161 int) binds: [B:1048:0x093b, B:1032:0x08dd, B:1016:0x0888, B:941:0x0712, B:837:0x052a, B:821:0x04c5] A[DONT_GENERATE, DONT_INLINE]
  0x0965: PHI (r10v89 com.google.android.gms.internal.ads.Vx0) = 
  (r10v71 com.google.android.gms.internal.ads.Vx0)
  (r10v72 com.google.android.gms.internal.ads.Vx0)
  (r10v74 com.google.android.gms.internal.ads.Vx0)
  (r10v77 com.google.android.gms.internal.ads.Vx0)
  (r10v88 com.google.android.gms.internal.ads.Vx0)
  (r10v94 com.google.android.gms.internal.ads.Vx0)
 binds: [B:1048:0x093b, B:1032:0x08dd, B:1016:0x0888, B:941:0x0712, B:837:0x052a, B:821:0x04c5] A[DONT_GENERATE, DONT_INLINE]
  0x0965: PHI (r11v64 int) = (r11v35 int), (r11v36 int), (r11v38 int), (r11v48 int), (r11v62 int), (r11v68 int) binds: [B:1048:0x093b, B:1032:0x08dd, B:1016:0x0888, B:941:0x0712, B:837:0x052a, B:821:0x04c5] A[DONT_GENERATE, DONT_INLINE]
  0x0965: PHI (r12v48 int) = (r12v19 int), (r12v20 int), (r12v22 int), (r12v37 int), (r12v45 int), (r12v51 int) binds: [B:1048:0x093b, B:1032:0x08dd, B:1016:0x0888, B:941:0x0712, B:837:0x052a, B:821:0x04c5] A[DONT_GENERATE, DONT_INLINE]
  0x0965: PHI (r14v70 int) = (r14v54 int), (r14v55 int), (r14v57 int), (r14v60 int), (r14v68 int), (r14v75 int) binds: [B:1048:0x093b, B:1032:0x08dd, B:1016:0x0888, B:941:0x0712, B:837:0x052a, B:821:0x04c5] A[DONT_GENERATE, DONT_INLINE]
  0x0965: PHI (r15v32 int) = (r15v14 int), (r15v15 int), (r15v17 int), (r15v23 int), (r15v30 int), (r15v36 int) binds: [B:1048:0x093b, B:1032:0x08dd, B:1016:0x0888, B:941:0x0712, B:837:0x052a, B:821:0x04c5] A[DONT_GENERATE, DONT_INLINE]
  0x0965: PHI (r29v24 sun.misc.Unsafe) = 
  (r29v6 sun.misc.Unsafe)
  (r29v7 sun.misc.Unsafe)
  (r29v9 sun.misc.Unsafe)
  (r29v15 sun.misc.Unsafe)
  (r29v22 sun.misc.Unsafe)
  (r29v27 sun.misc.Unsafe)
 binds: [B:1048:0x093b, B:1032:0x08dd, B:1016:0x0888, B:941:0x0712, B:837:0x052a, B:821:0x04c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1182:0x0968 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1185:0x0c40 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1223:0x0c51 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1256:0x097d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int u(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.Vx0 r39) throws com.google.android.gms.internal.ads.C4021pz0 {
        /*
            Method dump skipped, instructions count: 3458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Sz0.u(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.Vx0):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0482  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Sz0.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final int zzb(Object obj) {
        int i8;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16362a.length; i11 += 3) {
            int iE = E(i11);
            int[] iArr = this.f16362a;
            int i12 = 1048575 & iE;
            int iD = D(iE);
            int i13 = iArr[i11];
            long j8 = i12;
            int iHashCode = 37;
            switch (iD) {
                case 0:
                    i8 = i10 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(MA0.j(obj, j8));
                    byte[] bArr = AbstractC3793nz0.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 1:
                    i8 = i10 * 53;
                    iFloatToIntBits = Float.floatToIntBits(MA0.k(obj, j8));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 2:
                    i8 = i10 * 53;
                    jDoubleToLongBits = MA0.n(obj, j8);
                    byte[] bArr2 = AbstractC3793nz0.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 3:
                    i8 = i10 * 53;
                    jDoubleToLongBits = MA0.n(obj, j8);
                    byte[] bArr3 = AbstractC3793nz0.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 4:
                    i8 = i10 * 53;
                    iFloatToIntBits = MA0.l(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 5:
                    i8 = i10 * 53;
                    jDoubleToLongBits = MA0.n(obj, j8);
                    byte[] bArr4 = AbstractC3793nz0.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 6:
                    i8 = i10 * 53;
                    iFloatToIntBits = MA0.l(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 7:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC3793nz0.zza(MA0.H(obj, j8));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 8:
                    i8 = i10 * 53;
                    iFloatToIntBits = ((String) MA0.p(obj, j8)).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object objP = MA0.p(obj, j8);
                    if (objP != null) {
                        iHashCode = objP.hashCode();
                    }
                    i10 = i9 + iHashCode;
                    break;
                case 10:
                    i8 = i10 * 53;
                    iFloatToIntBits = MA0.p(obj, j8).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 11:
                    i8 = i10 * 53;
                    iFloatToIntBits = MA0.l(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 12:
                    i8 = i10 * 53;
                    iFloatToIntBits = MA0.l(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 13:
                    i8 = i10 * 53;
                    iFloatToIntBits = MA0.l(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 14:
                    i8 = i10 * 53;
                    jDoubleToLongBits = MA0.n(obj, j8);
                    byte[] bArr5 = AbstractC3793nz0.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 15:
                    i8 = i10 * 53;
                    iFloatToIntBits = MA0.l(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 16:
                    i8 = i10 * 53;
                    jDoubleToLongBits = MA0.n(obj, j8);
                    byte[] bArr6 = AbstractC3793nz0.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 17:
                    i9 = i10 * 53;
                    Object objP2 = MA0.p(obj, j8);
                    if (objP2 != null) {
                        iHashCode = objP2.hashCode();
                    }
                    i10 = i9 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i8 = i10 * 53;
                    iFloatToIntBits = MA0.p(obj, j8).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 50:
                    i8 = i10 * 53;
                    iFloatToIntBits = MA0.p(obj, j8).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(x(obj, j8));
                        byte[] bArr7 = AbstractC3793nz0.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = Float.floatToIntBits(y(obj, j8));
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = F(obj, j8);
                        byte[] bArr8 = AbstractC3793nz0.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = F(obj, j8);
                        byte[] bArr9 = AbstractC3793nz0.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case s4.z.PUSH_TYPE_DEPARTURE /* 55 */:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = z(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = F(obj, j8);
                        byte[] bArr10 = AbstractC3793nz0.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = z(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = AbstractC3793nz0.zza(s(obj, j8));
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = ((String) MA0.p(obj, j8)).hashCode();
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case s7.x.FROZEN_SHIFT /* 60 */:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = MA0.p(obj, j8).hashCode();
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case s7.x.CLOSED_SHIFT /* 61 */:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = MA0.p(obj, j8).hashCode();
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = z(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = z(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = z(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = F(obj, j8);
                        byte[] bArr11 = AbstractC3793nz0.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = z(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = F(obj, j8);
                        byte[] bArr12 = AbstractC3793nz0.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = MA0.p(obj, j8).hashCode();
                        i10 = i8 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i10 * 53) + this.f16373l.d(obj).hashCode();
        return this.f16367f ? (iHashCode2 * 53) + this.f16374m.b(obj).f15178a.hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final Object zze() {
        return ((Zy0) this.f16366e).A();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x006b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = q(r8)
            if (r0 != 0) goto L8
            goto L8f
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.Zy0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.Zy0 r0 = (com.google.android.gms.internal.ads.Zy0) r0
            r0.v()
            r0.u()
            r0.x()
        L18:
            int[] r0 = r7.f16362a
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L81
            int r2 = r7.E(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = D(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6b
            r5 = 60
            if (r2 == r5) goto L53
            r5 = 68
            if (r2 == r5) goto L53
            switch(r2) {
                case 17: goto L6b;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L7e
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.Sz0.f16361q
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7e
            r6 = r5
            com.google.android.gms.internal.ads.Iz0 r6 = (com.google.android.gms.internal.ads.Iz0) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L7e
        L4d:
            com.google.android.gms.internal.ads.Dz0 r2 = r7.f16372k
            r2.b(r8, r3)
            goto L7e
        L53:
            int[] r2 = r7.f16362a
            r2 = r2[r1]
            boolean r2 = r7.r(r8, r2, r1)
            if (r2 == 0) goto L7e
            com.google.android.gms.internal.ads.kA0 r2 = r7.H(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.Sz0.f16361q
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L7e
        L6b:
            boolean r2 = r7.n(r8, r1)
            if (r2 == 0) goto L7e
            com.google.android.gms.internal.ads.kA0 r2 = r7.H(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.Sz0.f16361q
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L7e:
            int r1 = r1 + 3
            goto L1b
        L81:
            com.google.android.gms.internal.ads.BA0 r0 = r7.f16373l
            r0.m(r8)
            boolean r0 = r7.f16367f
            if (r0 == 0) goto L8f
            com.google.android.gms.internal.ads.Jy0 r0 = r7.f16374m
            r0.f(r8)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Sz0.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final void zzg(Object obj, Object obj2) {
        d(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.f16362a.length; i8 += 3) {
            int iE = E(i8);
            int i9 = 1048575 & iE;
            int[] iArr = this.f16362a;
            int iD = D(iE);
            int i10 = iArr[i8];
            long j8 = i9;
            switch (iD) {
                case 0:
                    if (n(obj2, i8)) {
                        MA0.z(obj, j8, MA0.j(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n(obj2, i8)) {
                        MA0.A(obj, j8, MA0.k(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (n(obj2, i8)) {
                        MA0.C(obj, j8, MA0.n(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (n(obj2, i8)) {
                        MA0.C(obj, j8, MA0.n(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (n(obj2, i8)) {
                        MA0.B(obj, j8, MA0.l(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (n(obj2, i8)) {
                        MA0.C(obj, j8, MA0.n(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (n(obj2, i8)) {
                        MA0.B(obj, j8, MA0.l(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (n(obj2, i8)) {
                        MA0.x(obj, j8, MA0.H(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (n(obj2, i8)) {
                        MA0.D(obj, j8, MA0.p(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    e(obj, obj2, i8);
                    break;
                case 10:
                    if (n(obj2, i8)) {
                        MA0.D(obj, j8, MA0.p(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (n(obj2, i8)) {
                        MA0.B(obj, j8, MA0.l(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (n(obj2, i8)) {
                        MA0.B(obj, j8, MA0.l(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (n(obj2, i8)) {
                        MA0.B(obj, j8, MA0.l(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (n(obj2, i8)) {
                        MA0.C(obj, j8, MA0.n(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (n(obj2, i8)) {
                        MA0.B(obj, j8, MA0.l(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (n(obj2, i8)) {
                        MA0.C(obj, j8, MA0.n(obj2, j8));
                        h(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    e(obj, obj2, i8);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.f16372k.c(obj, obj2, j8);
                    break;
                case 50:
                    int i11 = AbstractC3702nA0.zza;
                    MA0.D(obj, j8, Jz0.zzb(MA0.p(obj, j8), MA0.p(obj2, j8)));
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case 53:
                case 54:
                case s4.z.PUSH_TYPE_DEPARTURE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (r(obj2, i10, i8)) {
                        MA0.D(obj, j8, MA0.p(obj2, j8));
                        i(obj, i10, i8);
                        break;
                    } else {
                        break;
                    }
                case s7.x.FROZEN_SHIFT /* 60 */:
                    f(obj, obj2, i8);
                    break;
                case s7.x.CLOSED_SHIFT /* 61 */:
                case 62:
                case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(obj2, i10, i8)) {
                        MA0.D(obj, j8, MA0.p(obj2, j8));
                        i(obj, i10, i8);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    f(obj, obj2, i8);
                    break;
            }
        }
        AbstractC3702nA0.q(this.f16373l, obj, obj2);
        if (this.f16367f) {
            AbstractC3702nA0.p(this.f16374m, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:382:0x061e A[Catch: all -> 0x00f8, TryCatch #5 {all -> 0x00f8, blocks: (B:273:0x00d6, B:380:0x0619, B:382:0x061e, B:383:0x0623, B:324:0x02dc, B:326:0x02e5, B:327:0x02f5, B:328:0x0305, B:329:0x0315, B:330:0x0325, B:331:0x0335, B:332:0x0345, B:333:0x0355, B:334:0x0366, B:335:0x0377, B:336:0x0388, B:337:0x0399, B:338:0x03aa, B:339:0x03bb, B:340:0x03d7, B:341:0x03e8, B:342:0x03f9, B:343:0x040e, B:345:0x0417, B:346:0x0429, B:347:0x043b, B:348:0x044c, B:349:0x045d, B:350:0x046e, B:351:0x047f, B:352:0x0490, B:353:0x04a1, B:354:0x04b2, B:355:0x04c3, B:356:0x04d8, B:357:0x04ea, B:358:0x04fc, B:359:0x050e, B:360:0x0520, B:362:0x052d, B:365:0x0534, B:366:0x053a, B:367:0x0545, B:368:0x0557, B:369:0x0569, B:370:0x057e, B:371:0x0589, B:372:0x059b, B:373:0x05ad, B:374:0x05bf, B:375:0x05d1, B:376:0x05e3, B:377:0x05f5, B:378:0x0607), top: B:410:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x064e A[LOOP:2: B:393:0x064a->B:395:0x064e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0629 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:431:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.InterfaceC2444cA0 r19, com.google.android.gms.internal.ads.Iy0 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Sz0.zzh(java.lang.Object, com.google.android.gms.internal.ads.cA0, com.google.android.gms.internal.ads.Iy0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final void zzi(Object obj, byte[] bArr, int i8, int i9, Vx0 vx0) throws C4021pz0 {
        u(obj, bArr, i8, i9, 0, vx0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0024  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.gms.internal.ads.UA0 r25) {
        /*
            Method dump skipped, instructions count: 1836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Sz0.zzj(java.lang.Object, com.google.android.gms.internal.ads.UA0):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    public final boolean zzk(Object obj, Object obj2) {
        boolean zA;
        for (int i8 = 0; i8 < this.f16362a.length; i8 += 3) {
            int iE = E(i8);
            long j8 = iE & 1048575;
            switch (D(iE)) {
                case 0:
                    if (!l(obj, obj2, i8) || Double.doubleToLongBits(MA0.j(obj, j8)) != Double.doubleToLongBits(MA0.j(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!l(obj, obj2, i8) || Float.floatToIntBits(MA0.k(obj, j8)) != Float.floatToIntBits(MA0.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!l(obj, obj2, i8) || MA0.n(obj, j8) != MA0.n(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!l(obj, obj2, i8) || MA0.n(obj, j8) != MA0.n(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!l(obj, obj2, i8) || MA0.l(obj, j8) != MA0.l(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!l(obj, obj2, i8) || MA0.n(obj, j8) != MA0.n(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!l(obj, obj2, i8) || MA0.l(obj, j8) != MA0.l(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!l(obj, obj2, i8) || MA0.H(obj, j8) != MA0.H(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!l(obj, obj2, i8) || !AbstractC3702nA0.a(MA0.p(obj, j8), MA0.p(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!l(obj, obj2, i8) || !AbstractC3702nA0.a(MA0.p(obj, j8), MA0.p(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!l(obj, obj2, i8) || !AbstractC3702nA0.a(MA0.p(obj, j8), MA0.p(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!l(obj, obj2, i8) || MA0.l(obj, j8) != MA0.l(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!l(obj, obj2, i8) || MA0.l(obj, j8) != MA0.l(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!l(obj, obj2, i8) || MA0.l(obj, j8) != MA0.l(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!l(obj, obj2, i8) || MA0.n(obj, j8) != MA0.n(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!l(obj, obj2, i8) || MA0.l(obj, j8) != MA0.l(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!l(obj, obj2, i8) || MA0.n(obj, j8) != MA0.n(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!l(obj, obj2, i8) || !AbstractC3702nA0.a(MA0.p(obj, j8), MA0.p(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zA = AbstractC3702nA0.a(MA0.p(obj, j8), MA0.p(obj2, j8));
                    break;
                case 50:
                    zA = AbstractC3702nA0.a(MA0.p(obj, j8), MA0.p(obj2, j8));
                    break;
                case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case 53:
                case 54:
                case s4.z.PUSH_TYPE_DEPARTURE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case s7.x.FROZEN_SHIFT /* 60 */:
                case s7.x.CLOSED_SHIFT /* 61 */:
                case 62:
                case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jB = B(i8) & 1048575;
                    if (MA0.l(obj, jB) != MA0.l(obj2, jB) || !AbstractC3702nA0.a(MA0.p(obj, j8), MA0.p(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zA) {
                return false;
            }
        }
        if (!this.f16373l.d(obj).equals(this.f16373l.d(obj2))) {
            return false;
        }
        if (this.f16367f) {
            return this.f16374m.b(obj).equals(this.f16374m.b(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x009c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3360kA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Sz0.zzl(java.lang.Object):boolean");
    }
}
