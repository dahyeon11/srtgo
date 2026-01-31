package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.wz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4818wz0 extends Tx0 implements RandomAccess, InterfaceC4932xz0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C4818wz0 f23588c;

    @Deprecated
    public static final InterfaceC4932xz0 zza;

    /* renamed from: b, reason: collision with root package name */
    private final List f23589b;

    static {
        C4818wz0 c4818wz0 = new C4818wz0(false);
        f23588c = c4818wz0;
        zza = c4818wz0;
    }

    public C4818wz0() {
        this(10);
    }

    private static String b(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC3677my0 ? ((AbstractC3677my0) obj).zzx(AbstractC3793nz0.f21377b) : AbstractC3793nz0.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        a();
        this.f23589b.add(i8, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i8, Collection collection) {
        a();
        if (collection instanceof InterfaceC4932xz0) {
            collection = ((InterfaceC4932xz0) collection).zzh();
        }
        boolean zAddAll = this.f23589b.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f23589b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        Object objRemove = this.f23589b.remove(i8);
        ((AbstractList) this).modCount++;
        return b(objRemove);
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        a();
        return b(this.f23589b.set(i8, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23589b.size();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4932xz0
    public final InterfaceC4932xz0 zzd() {
        return zzc() ? new GA0(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4932xz0
    public final Object zze(int i8) {
        return this.f23589b.get(i8);
    }

    @Override // com.google.android.gms.internal.ads.Tx0, com.google.android.gms.internal.ads.InterfaceC3679mz0, com.google.android.gms.internal.ads.InterfaceC3451kz0
    public final /* bridge */ /* synthetic */ InterfaceC3679mz0 zzf(int i8) {
        if (i8 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i8);
        arrayList.addAll(this.f23589b);
        return new C4818wz0(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i8) {
        Object obj = this.f23589b.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3677my0) {
            AbstractC3677my0 abstractC3677my0 = (AbstractC3677my0) obj;
            String strZzx = abstractC3677my0.zzx(AbstractC3793nz0.f21377b);
            if (abstractC3677my0.zzp()) {
                this.f23589b.set(i8, strZzx);
            }
            return strZzx;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = AbstractC3793nz0.zzd(bArr);
        if (RA0.i(bArr)) {
            this.f23589b.set(i8, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4932xz0
    public final List zzh() {
        return Collections.unmodifiableList(this.f23589b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4932xz0
    public final void zzi(AbstractC3677my0 abstractC3677my0) {
        a();
        this.f23589b.add(abstractC3677my0);
        ((AbstractList) this).modCount++;
    }

    public C4818wz0(int i8) {
        ArrayList arrayList = new ArrayList(i8);
        super(true);
        this.f23589b = arrayList;
    }

    private C4818wz0(ArrayList arrayList) {
        super(true);
        this.f23589b = arrayList;
    }

    private C4818wz0(boolean z8) {
        super(false);
        this.f23589b = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.Tx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
