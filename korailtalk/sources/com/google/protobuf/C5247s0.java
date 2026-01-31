package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5247s0 extends AbstractC5202d implements InterfaceC5249t0, RandomAccess {

    @Deprecated
    public static final InterfaceC5249t0 EMPTY;

    /* renamed from: c, reason: collision with root package name */
    private static final C5247s0 f26718c;

    /* renamed from: b, reason: collision with root package name */
    private final List f26719b;

    /* renamed from: com.google.protobuf.s0$a */
    private static class a extends AbstractList implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        private final C5247s0 f26720a;

        a(C5247s0 c5247s0) {
            this.f26720a = c5247s0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26720a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i8, byte[] bArr) {
            this.f26720a.i(i8, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int i8) {
            return this.f26720a.getByteArray(i8);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int i8) {
            String strRemove = this.f26720a.remove(i8);
            ((AbstractList) this).modCount++;
            return C5247s0.j(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int i8, byte[] bArr) {
            Object objN = this.f26720a.n(i8, bArr);
            ((AbstractList) this).modCount++;
            return C5247s0.j(objN);
        }
    }

    /* renamed from: com.google.protobuf.s0$b */
    private static class b extends AbstractList implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        private final C5247s0 f26721a;

        b(C5247s0 c5247s0) {
            this.f26721a = c5247s0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26721a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i8, AbstractC5235o abstractC5235o) {
            this.f26721a.h(i8, abstractC5235o);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public AbstractC5235o get(int i8) {
            return this.f26721a.getByteString(i8);
        }

        @Override // java.util.AbstractList, java.util.List
        public AbstractC5235o remove(int i8) {
            String strRemove = this.f26721a.remove(i8);
            ((AbstractList) this).modCount++;
            return C5247s0.k(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public AbstractC5235o set(int i8, AbstractC5235o abstractC5235o) {
            Object objM = this.f26721a.m(i8, abstractC5235o);
            ((AbstractList) this).modCount++;
            return C5247s0.k(objM);
        }
    }

    static {
        C5247s0 c5247s0 = new C5247s0();
        f26718c = c5247s0;
        c5247s0.makeImmutable();
        EMPTY = c5247s0;
    }

    public C5247s0() {
        this(10);
    }

    public static C5247s0 emptyList() {
        return f26718c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i8, AbstractC5235o abstractC5235o) {
        a();
        this.f26719b.add(i8, abstractC5235o);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i8, byte[] bArr) {
        a();
        this.f26719b.add(i8, bArr);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] j(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? AbstractC5227l0.toByteArray((String) obj) : ((AbstractC5235o) obj).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC5235o k(Object obj) {
        return obj instanceof AbstractC5235o ? (AbstractC5235o) obj : obj instanceof String ? AbstractC5235o.copyFromUtf8((String) obj) : AbstractC5235o.copyFrom((byte[]) obj);
    }

    private static String l(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC5235o ? ((AbstractC5235o) obj).toStringUtf8() : AbstractC5227l0.toStringUtf8((byte[]) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object m(int i8, AbstractC5235o abstractC5235o) {
        a();
        return this.f26719b.set(i8, abstractC5235o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object n(int i8, byte[] bArr) {
        a();
        return this.f26719b.set(i8, bArr);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public boolean addAllByteArray(Collection<byte[]> collection) {
        a();
        boolean zAddAll = this.f26719b.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public boolean addAllByteString(Collection<? extends AbstractC5235o> collection) {
        a();
        boolean zAddAll = this.f26719b.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public List<byte[]> asByteArrayList() {
        return new a(this);
    }

    @Override // com.google.protobuf.InterfaceC5249t0, com.google.protobuf.InterfaceC5207e1
    public List<AbstractC5235o> asByteStringList() {
        return new b(this);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f26719b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC5249t0
    public byte[] getByteArray(int i8) {
        Object obj = this.f26719b.get(i8);
        byte[] bArrJ = j(obj);
        if (bArrJ != obj) {
            this.f26719b.set(i8, bArrJ);
        }
        return bArrJ;
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public AbstractC5235o getByteString(int i8) {
        Object obj = this.f26719b.get(i8);
        AbstractC5235o abstractC5235oK = k(obj);
        if (abstractC5235oK != obj) {
            this.f26719b.set(i8, abstractC5235oK);
        }
        return abstractC5235oK;
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public Object getRaw(int i8) {
        return this.f26719b.get(i8);
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f26719b);
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public InterfaceC5249t0 getUnmodifiableView() {
        return isModifiable() ? new K1(this) : this;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractC5202d, com.google.protobuf.AbstractC5227l0.i
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public void mergeFrom(InterfaceC5249t0 interfaceC5249t0) {
        a();
        for (Object obj : interfaceC5249t0.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f26719b.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f26719b.add(obj);
            }
        }
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26719b.size();
    }

    public C5247s0(int i8) {
        this(new ArrayList(i8));
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection<? extends String> collection) {
        a();
        if (collection instanceof InterfaceC5249t0) {
            collection = ((InterfaceC5249t0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f26719b.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i8) {
        Object obj = this.f26719b.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5235o) {
            AbstractC5235o abstractC5235o = (AbstractC5235o) obj;
            String stringUtf8 = abstractC5235o.toStringUtf8();
            if (abstractC5235o.isValidUtf8()) {
                this.f26719b.set(i8, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = AbstractC5227l0.toStringUtf8(bArr);
        if (AbstractC5227l0.isValidUtf8(bArr)) {
            this.f26719b.set(i8, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // com.google.protobuf.AbstractC5202d, com.google.protobuf.AbstractC5227l0.i, com.google.protobuf.AbstractC5227l0.f
    public C5247s0 mutableCopyWithCapacity(int i8) {
        if (i8 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i8);
        arrayList.addAll(this.f26719b);
        return new C5247s0(arrayList);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public String set(int i8, String str) {
        a();
        return l(this.f26719b.set(i8, str));
    }

    public C5247s0(InterfaceC5249t0 interfaceC5249t0) {
        this.f26719b = new ArrayList(interfaceC5249t0.size());
        addAll(interfaceC5249t0);
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public void add(int i8, String str) {
        a();
        this.f26719b.add(i8, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC5202d, java.util.AbstractList, java.util.List
    public String remove(int i8) {
        a();
        Object objRemove = this.f26719b.remove(i8);
        ((AbstractList) this).modCount++;
        return l(objRemove);
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public void set(int i8, AbstractC5235o abstractC5235o) {
        m(i8, abstractC5235o);
    }

    public C5247s0(List<String> list) {
        this(new ArrayList(list));
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public void add(AbstractC5235o abstractC5235o) {
        a();
        this.f26719b.add(abstractC5235o);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public void set(int i8, byte[] bArr) {
        n(i8, bArr);
    }

    private C5247s0(ArrayList arrayList) {
        this.f26719b = arrayList;
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public void add(byte[] bArr) {
        a();
        this.f26719b.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
