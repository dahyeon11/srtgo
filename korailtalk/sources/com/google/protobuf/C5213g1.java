package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.g1 */
/* loaded from: classes2.dex */
public class C5213g1 implements AbstractC5193a.b {

    /* renamed from: a */
    private AbstractC5193a.b f26506a;

    /* renamed from: b */
    private List f26507b;

    /* renamed from: c */
    private boolean f26508c;

    /* renamed from: d */
    private List f26509d;

    /* renamed from: e */
    private boolean f26510e;

    /* renamed from: f */
    private b f26511f;

    /* renamed from: g */
    private a f26512g;

    /* renamed from: h */
    private c f26513h;

    /* renamed from: com.google.protobuf.g1$a */
    private static class a extends AbstractList implements List, RandomAccess {

        /* renamed from: a */
        C5213g1 f26514a;

        a(C5213g1 c5213g1) {
            this.f26514a = c5213g1;
        }

        void a() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26514a.getCount();
        }

        @Override // java.util.AbstractList, java.util.List
        public AbstractC5193a.AbstractC0218a get(int i8) {
            return this.f26514a.getBuilder(i8);
        }
    }

    /* renamed from: com.google.protobuf.g1$b */
    private static class b extends AbstractList implements List, RandomAccess {

        /* renamed from: a */
        C5213g1 f26515a;

        b(C5213g1 c5213g1) {
            this.f26515a = c5213g1;
        }

        void a() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26515a.getCount();
        }

        @Override // java.util.AbstractList, java.util.List
        public AbstractC5193a get(int i8) {
            return this.f26515a.getMessage(i8);
        }
    }

    /* renamed from: com.google.protobuf.g1$c */
    private static class c extends AbstractList implements List, RandomAccess {

        /* renamed from: a */
        C5213g1 f26516a;

        c(C5213g1 c5213g1) {
            this.f26516a = c5213g1;
        }

        void a() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26516a.getCount();
        }

        @Override // java.util.AbstractList, java.util.List
        public N0 get(int i8) {
            return this.f26516a.getMessageOrBuilder(i8);
        }
    }

    public C5213g1(List<AbstractC5193a> list, boolean z8, AbstractC5193a.b bVar, boolean z9) {
        this.f26507b = list;
        this.f26508c = z8;
        this.f26506a = bVar;
        this.f26510e = z9;
    }

    private void a() {
        if (this.f26509d == null) {
            this.f26509d = new ArrayList(this.f26507b.size());
            for (int i8 = 0; i8 < this.f26507b.size(); i8++) {
                this.f26509d.add(null);
            }
        }
    }

    private void b() {
        if (this.f26508c) {
            return;
        }
        this.f26507b = new ArrayList(this.f26507b);
        this.f26508c = true;
    }

    private AbstractC5193a c(int i8, boolean z8) {
        List list = this.f26509d;
        if (list == null) {
            return (AbstractC5193a) this.f26507b.get(i8);
        }
        C5228l1 c5228l1 = (C5228l1) list.get(i8);
        return c5228l1 == null ? (AbstractC5193a) this.f26507b.get(i8) : z8 ? c5228l1.build() : c5228l1.getMessage();
    }

    private void d() {
        b bVar = this.f26511f;
        if (bVar != null) {
            bVar.a();
        }
        a aVar = this.f26512g;
        if (aVar != null) {
            aVar.a();
        }
        c cVar = this.f26513h;
        if (cVar != null) {
            cVar.a();
        }
    }

    private void e() {
        AbstractC5193a.b bVar;
        if (!this.f26510e || (bVar = this.f26506a) == null) {
            return;
        }
        bVar.markDirty();
        this.f26510e = false;
    }

    public C5213g1 addAllMessages(Iterable<AbstractC5193a> iterable) {
        int size;
        Iterator<AbstractC5193a> it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC5227l0.a(it.next());
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            size = collection.size();
        } else {
            size = -1;
        }
        b();
        if (size >= 0) {
            List list = this.f26507b;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator<AbstractC5193a> it2 = iterable.iterator();
        while (it2.hasNext()) {
            addMessage(it2.next());
        }
        e();
        d();
        return this;
    }

    public AbstractC5193a.AbstractC0218a addBuilder(AbstractC5193a abstractC5193a) {
        b();
        a();
        C5228l1 c5228l1 = new C5228l1(abstractC5193a, this, this.f26510e);
        this.f26507b.add(null);
        this.f26509d.add(c5228l1);
        e();
        d();
        return c5228l1.getBuilder();
    }

    public C5213g1 addMessage(AbstractC5193a abstractC5193a) {
        AbstractC5227l0.a(abstractC5193a);
        b();
        this.f26507b.add(abstractC5193a);
        List list = this.f26509d;
        if (list != null) {
            list.add(null);
        }
        e();
        d();
        return this;
    }

    public List<AbstractC5193a> build() {
        this.f26510e = true;
        boolean z8 = this.f26508c;
        if (!z8 && this.f26509d == null) {
            return this.f26507b;
        }
        if (!z8) {
            for (int i8 = 0; i8 < this.f26507b.size(); i8++) {
                H0 h02 = (H0) this.f26507b.get(i8);
                C5228l1 c5228l1 = (C5228l1) this.f26509d.get(i8);
                if (c5228l1 == null || c5228l1.build() == h02) {
                }
            }
            return this.f26507b;
        }
        b();
        for (int i9 = 0; i9 < this.f26507b.size(); i9++) {
            this.f26507b.set(i9, c(i9, true));
        }
        List<AbstractC5193a> listUnmodifiableList = Collections.unmodifiableList(this.f26507b);
        this.f26507b = listUnmodifiableList;
        this.f26508c = false;
        return listUnmodifiableList;
    }

    public void clear() {
        this.f26507b = Collections.emptyList();
        this.f26508c = false;
        List<C5228l1> list = this.f26509d;
        if (list != null) {
            for (C5228l1 c5228l1 : list) {
                if (c5228l1 != null) {
                    c5228l1.dispose();
                }
            }
            this.f26509d = null;
        }
        e();
        d();
    }

    public void dispose() {
        this.f26506a = null;
    }

    public AbstractC5193a.AbstractC0218a getBuilder(int i8) {
        a();
        C5228l1 c5228l1 = (C5228l1) this.f26509d.get(i8);
        if (c5228l1 == null) {
            C5228l1 c5228l12 = new C5228l1((AbstractC5193a) this.f26507b.get(i8), this, this.f26510e);
            this.f26509d.set(i8, c5228l12);
            c5228l1 = c5228l12;
        }
        return c5228l1.getBuilder();
    }

    public List<AbstractC5193a.AbstractC0218a> getBuilderList() {
        if (this.f26512g == null) {
            this.f26512g = new a(this);
        }
        return this.f26512g;
    }

    public int getCount() {
        return this.f26507b.size();
    }

    public AbstractC5193a getMessage(int i8) {
        return c(i8, false);
    }

    public List<AbstractC5193a> getMessageList() {
        if (this.f26511f == null) {
            this.f26511f = new b(this);
        }
        return this.f26511f;
    }

    public N0 getMessageOrBuilder(int i8) {
        List list = this.f26509d;
        if (list == null) {
            return (N0) this.f26507b.get(i8);
        }
        C5228l1 c5228l1 = (C5228l1) list.get(i8);
        return c5228l1 == null ? (N0) this.f26507b.get(i8) : c5228l1.getMessageOrBuilder();
    }

    public List<N0> getMessageOrBuilderList() {
        if (this.f26513h == null) {
            this.f26513h = new c(this);
        }
        return this.f26513h;
    }

    public boolean isEmpty() {
        return this.f26507b.isEmpty();
    }

    @Override // com.google.protobuf.AbstractC5193a.b
    public void markDirty() {
        e();
    }

    public void remove(int i8) {
        C5228l1 c5228l1;
        b();
        this.f26507b.remove(i8);
        List list = this.f26509d;
        if (list != null && (c5228l1 = (C5228l1) list.remove(i8)) != null) {
            c5228l1.dispose();
        }
        e();
        d();
    }

    public C5213g1 setMessage(int i8, AbstractC5193a abstractC5193a) {
        C5228l1 c5228l1;
        AbstractC5227l0.a(abstractC5193a);
        b();
        this.f26507b.set(i8, abstractC5193a);
        List list = this.f26509d;
        if (list != null && (c5228l1 = (C5228l1) list.set(i8, null)) != null) {
            c5228l1.dispose();
        }
        e();
        d();
        return this;
    }

    public C5213g1 addMessage(int i8, AbstractC5193a abstractC5193a) {
        AbstractC5227l0.a(abstractC5193a);
        b();
        this.f26507b.add(i8, abstractC5193a);
        List list = this.f26509d;
        if (list != null) {
            list.add(i8, null);
        }
        e();
        d();
        return this;
    }

    public AbstractC5193a.AbstractC0218a addBuilder(int i8, AbstractC5193a abstractC5193a) {
        b();
        a();
        C5228l1 c5228l1 = new C5228l1(abstractC5193a, this, this.f26510e);
        this.f26507b.add(i8, null);
        this.f26509d.add(i8, c5228l1);
        e();
        d();
        return c5228l1.getBuilder();
    }
}
