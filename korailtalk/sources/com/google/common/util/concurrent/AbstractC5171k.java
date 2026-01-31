package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC5167g;
import f3.A0;
import f3.AbstractC5457d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.util.concurrent.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5171k extends AbstractC5167g {

    /* renamed from: p, reason: collision with root package name */
    private List f25574p;

    /* renamed from: com.google.common.util.concurrent.k$a */
    static final class a extends AbstractC5171k {
        a(AbstractC5457d0 abstractC5457d0, boolean z8) {
            super(abstractC5457d0, z8);
            R();
        }

        @Override // com.google.common.util.concurrent.AbstractC5171k
        public /* bridge */ /* synthetic */ Object combine(List list) {
            return combine((List<b>) list);
        }

        @Override // com.google.common.util.concurrent.AbstractC5171k
        public List<Object> combine(List<b> list) {
            ArrayList arrayListNewArrayListWithCapacity = A0.newArrayListWithCapacity(list.size());
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                b next = it.next();
                arrayListNewArrayListWithCapacity.add(next != null ? next.f25575a : null);
            }
            return Collections.unmodifiableList(arrayListNewArrayListWithCapacity);
        }
    }

    /* renamed from: com.google.common.util.concurrent.k$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Object f25575a;

        b(Object obj) {
            this.f25575a = obj;
        }
    }

    AbstractC5171k(AbstractC5457d0 abstractC5457d0, boolean z8) {
        super(abstractC5457d0, z8, true);
        List listEmptyList = abstractC5457d0.isEmpty() ? Collections.emptyList() : A0.newArrayListWithCapacity(abstractC5457d0.size());
        for (int i8 = 0; i8 < abstractC5457d0.size(); i8++) {
            listEmptyList.add(null);
        }
        this.f25574p = listEmptyList;
    }

    @Override // com.google.common.util.concurrent.AbstractC5167g
    final void M(int i8, Object obj) {
        List list = this.f25574p;
        if (list != null) {
            list.set(i8, new b(obj));
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC5167g
    final void P() {
        List list = this.f25574p;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC5167g
    void W(AbstractC5167g.a aVar) {
        super.W(aVar);
        this.f25574p = null;
    }

    abstract Object combine(List list);
}
