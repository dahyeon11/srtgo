package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class Px0 implements Oz0 {
    private String a(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    private static void c(Iterable iterable, List list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    protected static AA0 d(Pz0 pz0) {
        return new AA0(pz0);
    }

    protected static void e(Iterable iterable, List list) {
        byte[] bArr = AbstractC3793nz0.zzd;
        iterable.getClass();
        if (!(iterable instanceof InterfaceC4932xz0)) {
            if (iterable instanceof Yz0) {
                list.addAll((Collection) iterable);
                return;
            } else {
                c(iterable, list);
                return;
            }
        }
        List listZzh = ((InterfaceC4932xz0) iterable).zzh();
        InterfaceC4932xz0 interfaceC4932xz0 = (InterfaceC4932xz0) list;
        int size = list.size();
        for (Object obj : listZzh) {
            if (obj == null) {
                String str = "Element at index " + (interfaceC4932xz0.size() - size) + " is null.";
                int size2 = interfaceC4932xz0.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    interfaceC4932xz0.remove(size2);
                }
            } else if (obj instanceof AbstractC3677my0) {
                interfaceC4932xz0.zzi((AbstractC3677my0) obj);
            } else {
                interfaceC4932xz0.add((String) obj);
            }
        }
    }

    protected abstract Px0 b(Qx0 qx0);

    @Override // 
    public abstract Px0 zzaP();

    public Px0 zzaE(AbstractC3677my0 abstractC3677my0) throws C4021pz0 {
        try {
            AbstractC4816wy0 abstractC4816wy0Zzl = abstractC3677my0.zzl();
            zzaR(abstractC4816wy0Zzl);
            abstractC4816wy0Zzl.zzz(0);
            return this;
        } catch (C4021pz0 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException(a("ByteString"), e9);
        }
    }

    /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public Px0 zzaR(AbstractC4816wy0 abstractC4816wy0) {
        return zzaW(abstractC4816wy0, Iy0.f13552c);
    }

    @Override // com.google.android.gms.internal.ads.Oz0
    /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public Px0 zzaS(Pz0 pz0) {
        if (zzbt().getClass().isInstance(pz0)) {
            return b((Qx0) pz0);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public Px0 zzaH(InputStream inputStream) {
        AbstractC4816wy0 abstractC4816wy0ZzI = AbstractC4816wy0.zzI(inputStream, 4096);
        zzaR(abstractC4816wy0ZzI);
        abstractC4816wy0ZzI.zzz(0);
        return this;
    }

    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public Px0 zzaU(byte[] bArr) {
        return zzaZ(bArr, 0, bArr.length);
    }

    public Px0 zzaJ(AbstractC3677my0 abstractC3677my0, Iy0 iy0) throws C4021pz0 {
        try {
            AbstractC4816wy0 abstractC4816wy0Zzl = abstractC3677my0.zzl();
            zzaW(abstractC4816wy0Zzl, iy0);
            abstractC4816wy0Zzl.zzz(0);
            return this;
        } catch (C4021pz0 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException(a("ByteString"), e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Oz0
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract Px0 zzaW(AbstractC4816wy0 abstractC4816wy0, Iy0 iy0);

    public Px0 zzaL(InputStream inputStream, Iy0 iy0) {
        AbstractC4816wy0 abstractC4816wy0ZzI = AbstractC4816wy0.zzI(inputStream, 4096);
        zzaW(abstractC4816wy0ZzI, iy0);
        abstractC4816wy0ZzI.zzz(0);
        return this;
    }

    /* renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public Px0 zzaY(byte[] bArr, Iy0 iy0) {
        return zzba(bArr, 0, bArr.length, iy0);
    }

    @Override // 
    /* renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public Px0 zzaZ(byte[] bArr, int i8, int i9) throws C4021pz0 {
        try {
            AbstractC4816wy0 abstractC4816wy0A = AbstractC4816wy0.a(bArr, i8, i9, false);
            zzaR(abstractC4816wy0A);
            abstractC4816wy0A.zzz(0);
            return this;
        } catch (C4021pz0 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException(a("byte array"), e9);
        }
    }

    @Override // 
    /* renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public Px0 zzba(byte[] bArr, int i8, int i9, Iy0 iy0) throws C4021pz0 {
        try {
            AbstractC4816wy0 abstractC4816wy0A = AbstractC4816wy0.a(bArr, i8, i9, false);
            zzaW(abstractC4816wy0A, iy0);
            abstractC4816wy0A.zzz(0);
            return this;
        } catch (C4021pz0 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException(a("byte array"), e9);
        }
    }

    public /* bridge */ /* synthetic */ Oz0 zzaQ(AbstractC3677my0 abstractC3677my0) throws C4021pz0 {
        zzaE(abstractC3677my0);
        return this;
    }

    public /* bridge */ /* synthetic */ Oz0 zzaT(InputStream inputStream) {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ Oz0 zzaV(AbstractC3677my0 abstractC3677my0, Iy0 iy0) throws C4021pz0 {
        zzaJ(abstractC3677my0, iy0);
        return this;
    }

    public /* bridge */ /* synthetic */ Oz0 zzaX(InputStream inputStream, Iy0 iy0) {
        zzaL(inputStream, iy0);
        return this;
    }

    public boolean zzbe(InputStream inputStream) {
        return zzbf(inputStream, Iy0.f13552c);
    }

    public boolean zzbf(InputStream inputStream, Iy0 iy0) throws IOException {
        int i8 = inputStream.read();
        if (i8 == -1) {
            return false;
        }
        zzaL(new Ox0(inputStream, AbstractC4816wy0.zzG(i8, inputStream)), iy0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Oz0
    public abstract /* synthetic */ Pz0 zzbr();

    @Override // com.google.android.gms.internal.ads.Oz0
    public abstract /* synthetic */ Pz0 zzbs();

    @Override // com.google.android.gms.internal.ads.Oz0, com.google.android.gms.internal.ads.Qz0
    public abstract /* synthetic */ Pz0 zzbt();

    @Override // com.google.android.gms.internal.ads.Oz0, com.google.android.gms.internal.ads.Qz0
    public abstract /* synthetic */ boolean zzbw();
}
