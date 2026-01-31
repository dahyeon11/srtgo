package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class Zy0 extends Qx0 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Object, Zy0> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected CA0 zzt = CA0.zzc();

    protected static Zy0 B(Zy0 zy0, InputStream inputStream) throws IOException {
        Zy0 zy0W = W(zy0, inputStream, Iy0.f13552c);
        V(zy0W);
        return zy0W;
    }

    protected static Zy0 C(Zy0 zy0, InputStream inputStream, Iy0 iy0) throws IOException {
        Zy0 zy0W = W(zy0, inputStream, iy0);
        V(zy0W);
        return zy0W;
    }

    protected static Zy0 D(Zy0 zy0, AbstractC3677my0 abstractC3677my0) throws C4021pz0 {
        Zy0 zy0I = I(zy0, abstractC3677my0, Iy0.f13552c);
        V(zy0I);
        return zy0I;
    }

    protected static Zy0 E(Zy0 zy0, AbstractC4816wy0 abstractC4816wy0) {
        return J(zy0, abstractC4816wy0, Iy0.f13552c);
    }

    protected static Zy0 F(Zy0 zy0, InputStream inputStream) throws C4021pz0 {
        Zy0 zy0N = N(zy0, AbstractC4816wy0.zzI(inputStream, 4096), Iy0.f13552c);
        V(zy0N);
        return zy0N;
    }

    protected static Zy0 G(Zy0 zy0, ByteBuffer byteBuffer) {
        return L(zy0, byteBuffer, Iy0.f13552c);
    }

    protected static Zy0 H(Zy0 zy0, byte[] bArr) throws C4021pz0 {
        Zy0 zy0Y = Y(zy0, bArr, 0, bArr.length, Iy0.f13552c);
        V(zy0Y);
        return zy0Y;
    }

    protected static Zy0 I(Zy0 zy0, AbstractC3677my0 abstractC3677my0, Iy0 iy0) throws C4021pz0 {
        Zy0 zy0X = X(zy0, abstractC3677my0, iy0);
        V(zy0X);
        return zy0X;
    }

    protected static Zy0 J(Zy0 zy0, AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) throws C4021pz0 {
        Zy0 zy0N = N(zy0, abstractC4816wy0, iy0);
        V(zy0N);
        return zy0N;
    }

    protected static Zy0 K(Zy0 zy0, InputStream inputStream, Iy0 iy0) throws C4021pz0 {
        Zy0 zy0N = N(zy0, AbstractC4816wy0.zzI(inputStream, 4096), iy0);
        V(zy0N);
        return zy0N;
    }

    protected static Zy0 L(Zy0 zy0, ByteBuffer byteBuffer, Iy0 iy0) throws C4021pz0 {
        AbstractC4816wy0 abstractC4816wy0A;
        int i8 = AbstractC4816wy0.zzd;
        if (byteBuffer.hasArray()) {
            abstractC4816wy0A = AbstractC4816wy0.a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && MA0.b()) {
            abstractC4816wy0A = new C4588uy0(byteBuffer, false, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            abstractC4816wy0A = AbstractC4816wy0.a(bArr, 0, iRemaining, true);
        }
        Zy0 zy0J = J(zy0, abstractC4816wy0A, iy0);
        V(zy0J);
        return zy0J;
    }

    protected static Zy0 M(Zy0 zy0, byte[] bArr, Iy0 iy0) throws C4021pz0 {
        Zy0 zy0Y = Y(zy0, bArr, 0, bArr.length, iy0);
        V(zy0Y);
        return zy0Y;
    }

    static Zy0 N(Zy0 zy0, AbstractC4816wy0 abstractC4816wy0, Iy0 iy0) throws C4021pz0 {
        Zy0 zy0A = zy0.A();
        try {
            InterfaceC3360kA0 interfaceC3360kA0Zzb = Zz0.zza().zzb(zy0A.getClass());
            interfaceC3360kA0Zzb.zzh(zy0A, C4930xy0.zzq(abstractC4816wy0), iy0);
            interfaceC3360kA0Zzb.zzf(zy0A);
            return zy0A;
        } catch (AA0 e8) {
            C4021pz0 c4021pz0Zza = e8.zza();
            c4021pz0Zza.zzh(zy0A);
            throw c4021pz0Zza;
        } catch (C4021pz0 e9) {
            e = e9;
            if (e.k()) {
                e = new C4021pz0(e);
            }
            e.zzh(zy0A);
            throw e;
        } catch (IOException e10) {
            if (e10.getCause() instanceof C4021pz0) {
                throw ((C4021pz0) e10.getCause());
            }
            C4021pz0 c4021pz0 = new C4021pz0(e10);
            c4021pz0.zzh(zy0A);
            throw c4021pz0;
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof C4021pz0) {
                throw ((C4021pz0) e11.getCause());
            }
            throw e11;
        }
    }

    private int O(InterfaceC3360kA0 interfaceC3360kA0) {
        if (interfaceC3360kA0 != null) {
            return interfaceC3360kA0.zza(this);
        }
        return Zz0.zza().zzb(getClass()).zza(this);
    }

    protected static void P(Class cls, Zy0 zy0) {
        zy0.x();
        zzc.put(cls, zy0);
    }

    protected static final boolean S(Zy0 zy0, boolean z8) {
        byte bByteValue = ((Byte) zy0.q(Yy0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = Zz0.zza().zzb(zy0.getClass()).zzl(zy0);
        if (z8) {
            zy0.r(Yy0.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : zy0);
        }
        return zZzl;
    }

    private static Zy0 V(Zy0 zy0) throws C4021pz0 {
        if (zy0 == null || zy0.zzbw()) {
            return zy0;
        }
        C4021pz0 c4021pz0Zza = zy0.c().zza();
        c4021pz0Zza.zzh(zy0);
        throw c4021pz0Zza;
    }

    private static Zy0 W(Zy0 zy0, InputStream inputStream, Iy0 iy0) throws IOException {
        try {
            int i8 = inputStream.read();
            if (i8 == -1) {
                return null;
            }
            AbstractC4816wy0 abstractC4816wy0ZzI = AbstractC4816wy0.zzI(new Ox0(inputStream, AbstractC4816wy0.zzG(i8, inputStream)), 4096);
            Zy0 zy0N = N(zy0, abstractC4816wy0ZzI, iy0);
            try {
                abstractC4816wy0ZzI.zzz(0);
                return zy0N;
            } catch (C4021pz0 e8) {
                e8.zzh(zy0N);
                throw e8;
            }
        } catch (C4021pz0 e9) {
            if (e9.k()) {
                throw new C4021pz0(e9);
            }
            throw e9;
        } catch (IOException e10) {
            throw new C4021pz0(e10);
        }
    }

    private static Zy0 X(Zy0 zy0, AbstractC3677my0 abstractC3677my0, Iy0 iy0) throws C4021pz0 {
        AbstractC4816wy0 abstractC4816wy0Zzl = abstractC3677my0.zzl();
        Zy0 zy0N = N(zy0, abstractC4816wy0Zzl, iy0);
        try {
            abstractC4816wy0Zzl.zzz(0);
            return zy0N;
        } catch (C4021pz0 e8) {
            e8.zzh(zy0N);
            throw e8;
        }
    }

    private static Zy0 Y(Zy0 zy0, byte[] bArr, int i8, int i9, Iy0 iy0) throws C4021pz0 {
        Zy0 zy0A = zy0.A();
        try {
            InterfaceC3360kA0 interfaceC3360kA0Zzb = Zz0.zza().zzb(zy0A.getClass());
            interfaceC3360kA0Zzb.zzi(zy0A, bArr, i8, i8 + i9, new Vx0(iy0));
            interfaceC3360kA0Zzb.zzf(zy0A);
            return zy0A;
        } catch (AA0 e8) {
            C4021pz0 c4021pz0Zza = e8.zza();
            c4021pz0Zza.zzh(zy0A);
            throw c4021pz0Zza;
        } catch (C4021pz0 e9) {
            e = e9;
            if (e.k()) {
                e = new C4021pz0(e);
            }
            e.zzh(zy0A);
            throw e;
        } catch (IOException e10) {
            if (e10.getCause() instanceof C4021pz0) {
                throw ((C4021pz0) e10.getCause());
            }
            C4021pz0 c4021pz0 = new C4021pz0(e10);
            c4021pz0.zzh(zy0A);
            throw c4021pz0;
        } catch (IndexOutOfBoundsException unused) {
            C4021pz0 c4021pz0I = C4021pz0.i();
            c4021pz0I.zzh(zy0A);
            throw c4021pz0I;
        }
    }

    protected static InterfaceC3110hz0 j() {
        return C2307az0.zzg();
    }

    protected static InterfaceC3110hz0 k(InterfaceC3110hz0 interfaceC3110hz0) {
        int size = interfaceC3110hz0.size();
        return interfaceC3110hz0.zzf(size == 0 ? 10 : size + size);
    }

    protected static InterfaceC3451kz0 l() {
        return Ez0.zzh();
    }

    protected static InterfaceC3451kz0 m(InterfaceC3451kz0 interfaceC3451kz0) {
        int size = interfaceC3451kz0.size();
        return interfaceC3451kz0.zzf(size == 0 ? 10 : size + size);
    }

    protected static InterfaceC3679mz0 n() {
        return C2215aA0.zzd();
    }

    protected static InterfaceC3679mz0 o(InterfaceC3679mz0 interfaceC3679mz0) {
        int size = interfaceC3679mz0.size();
        return interfaceC3679mz0.zzf(size == 0 ? 10 : size + size);
    }

    static Object s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object t(Pz0 pz0, String str, Object[] objArr) {
        return new C2330bA0(pz0, str, objArr);
    }

    static Zy0 z(Class cls) throws ClassNotFoundException {
        Zy0 zy0Zzbt = zzc.get(cls);
        if (zy0Zzbt == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zy0Zzbt = zzc.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (zy0Zzbt == null) {
            zy0Zzbt = ((Zy0) MA0.o(cls)).zzbt();
            if (zy0Zzbt == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zy0Zzbt);
        }
        return zy0Zzbt;
    }

    public static <ContainingType extends Pz0, Type> Xy0 zzbe(ContainingType containingtype, Pz0 pz0, InterfaceC2765ez0 interfaceC2765ez0, int i8, SA0 sa0, boolean z8, Class cls) {
        return new Xy0(containingtype, Collections.emptyList(), pz0, new Wy0(interfaceC2765ez0, i8, sa0, true, z8), cls);
    }

    public static <ContainingType extends Pz0, Type> Xy0 zzbf(ContainingType containingtype, Type type, Pz0 pz0, InterfaceC2765ez0 interfaceC2765ez0, int i8, SA0 sa0, Class cls) {
        return new Xy0(containingtype, type, pz0, new Wy0(interfaceC2765ez0, i8, sa0, false, false), cls);
    }

    Zy0 A() {
        return (Zy0) q(Yy0.NEW_MUTABLE_INSTANCE);
    }

    void Q(int i8) {
        this.zzq = i8;
    }

    boolean R() {
        return h() == 0;
    }

    boolean T() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object U(Yy0 yy0, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.Qx0
    int a() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.Qx0
    int b(InterfaceC3360kA0 interfaceC3360kA0) {
        if (!T()) {
            if (a() != Integer.MAX_VALUE) {
                return a();
            }
            int iO = O(interfaceC3360kA0);
            e(iO);
            return iO;
        }
        int iO2 = O(interfaceC3360kA0);
        if (iO2 >= 0) {
            return iO2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iO2);
    }

    @Override // com.google.android.gms.internal.ads.Qx0
    void e(int i8) {
        if (i8 >= 0) {
            this.zzd = i8 | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Zz0.zza().zzb(getClass()).zzk(this, (Zy0) obj);
    }

    int g() {
        return Zz0.zza().zzb(getClass()).zzb(this);
    }

    int h() {
        return this.zzq;
    }

    public int hashCode() {
        if (T()) {
            return g();
        }
        if (R()) {
            Q(g());
        }
        return h();
    }

    protected final Ty0 i() {
        return (Ty0) q(Yy0.NEW_BUILDER);
    }

    Object p() {
        return q(Yy0.BUILD_MESSAGE_INFO);
    }

    protected Object q(Yy0 yy0) {
        return U(yy0, null, null);
    }

    protected Object r(Yy0 yy0, Object obj) {
        return U(yy0, obj, null);
    }

    public String toString() {
        return Rz0.a(this, super.toString());
    }

    void u() {
        this.zzq = 0;
    }

    void v() {
        e(Integer.MAX_VALUE);
    }

    protected void w() {
        Zz0.zza().zzb(getClass()).zzf(this);
        x();
    }

    void x() {
        this.zzd &= Integer.MAX_VALUE;
    }

    protected final Ty0 y(Zy0 zy0) {
        Ty0 ty0I = i();
        ty0I.zzbj(zy0);
        return ty0I;
    }

    @Override // com.google.android.gms.internal.ads.Qx0
    public Uz0 zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.Qx0, com.google.android.gms.internal.ads.Pz0
    public int zzaY() {
        return b(null);
    }

    public final Xz0 zzbM() {
        return (Xz0) q(Yy0.GET_PARSER);
    }

    @Override // com.google.android.gms.internal.ads.Qx0, com.google.android.gms.internal.ads.Pz0
    /* renamed from: zzbb */
    public final Ty0 zzcY() {
        return (Ty0) q(Yy0.NEW_BUILDER);
    }

    @Override // com.google.android.gms.internal.ads.Qx0, com.google.android.gms.internal.ads.Pz0
    /* renamed from: zzbc */
    public final Ty0 zzcZ() {
        Ty0 ty0 = (Ty0) q(Yy0.NEW_BUILDER);
        ty0.zzbj(this);
        return ty0;
    }

    @Override // com.google.android.gms.internal.ads.Qx0, com.google.android.gms.internal.ads.Pz0, com.google.android.gms.internal.ads.Qz0
    /* renamed from: zzbi */
    public final Zy0 zzbt() {
        return (Zy0) q(Yy0.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.android.gms.internal.ads.Qx0, com.google.android.gms.internal.ads.Pz0, com.google.android.gms.internal.ads.Qz0
    public final boolean zzbw() {
        return S(this, true);
    }

    @Override // com.google.android.gms.internal.ads.Qx0, com.google.android.gms.internal.ads.Pz0
    public void zzda(Dy0 dy0) {
        Zz0.zza().zzb(getClass()).zzj(this, Ey0.zza(dy0));
    }
}
