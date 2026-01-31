package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class K1 extends AbstractList implements InterfaceC5249t0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5249t0 f26181a;

    class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        ListIterator f26182a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26183b;

        a(int i8) {
            this.f26183b = i8;
            this.f26182a = K1.this.f26181a.listIterator(i8);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f26182a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f26182a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f26182a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f26182a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public String next() {
            return (String) this.f26182a.next();
        }

        @Override // java.util.ListIterator
        public String previous() {
            return (String) this.f26182a.previous();
        }

        @Override // java.util.ListIterator
        public void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Iterator f26185a;

        b() {
            this.f26185a = K1.this.f26181a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26185a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public String next() {
            return (String) this.f26185a.next();
        }
    }

    public K1(InterfaceC5249t0 interfaceC5249t0) {
        this.f26181a = interfaceC5249t0;
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public void add(AbstractC5235o abstractC5235o) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public boolean addAllByteString(Collection<? extends AbstractC5235o> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.f26181a.asByteArrayList());
    }

    @Override // com.google.protobuf.InterfaceC5249t0, com.google.protobuf.InterfaceC5207e1
    public List<AbstractC5235o> asByteStringList() {
        return Collections.unmodifiableList(this.f26181a.asByteStringList());
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public byte[] getByteArray(int i8) {
        return this.f26181a.getByteArray(i8);
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public AbstractC5235o getByteString(int i8) {
        return this.f26181a.getByteString(i8);
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public Object getRaw(int i8) {
        return this.f26181a.getRaw(i8);
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public List<?> getUnderlyingElements() {
        return this.f26181a.getUnderlyingElements();
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public InterfaceC5249t0 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i8) {
        return new a(i8);
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public void mergeFrom(InterfaceC5249t0 interfaceC5249t0) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public void set(int i8, AbstractC5235o abstractC5235o) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26181a.size();
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i8) {
        return (String) this.f26181a.get(i8);
    }

    @Override // com.google.protobuf.InterfaceC5249t0
    public void set(int i8, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
