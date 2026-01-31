package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5242q0 extends C5244r0 {

    /* renamed from: f, reason: collision with root package name */
    private final K0 f26648f;

    /* renamed from: com.google.protobuf.q0$b */
    static class b implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        private Map.Entry f26649a;

        public C5242q0 getField() {
            return (C5242q0) this.f26649a.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f26649a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C5242q0 c5242q0 = (C5242q0) this.f26649a.getValue();
            if (c5242q0 == null) {
                return null;
            }
            return c5242q0.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof K0) {
                return ((C5242q0) this.f26649a.getValue()).setValue((K0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry entry) {
            this.f26649a = entry;
        }
    }

    /* renamed from: com.google.protobuf.q0$c */
    static class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private Iterator f26650a;

        public c(Iterator<Map.Entry<Object, Object>> it) {
            this.f26650a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26650a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f26650a.remove();
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            Map.Entry<Object, Object> entry = (Map.Entry) this.f26650a.next();
            return entry.getValue() instanceof C5242q0 ? new b(entry) : entry;
        }
    }

    public C5242q0(K0 k02, M m8, AbstractC5235o abstractC5235o) {
        super(m8, abstractC5235o);
        this.f26648f = k02;
    }

    @Override // com.google.protobuf.C5244r0
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.f26702c == this.f26648f;
    }

    @Override // com.google.protobuf.C5244r0
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public K0 getValue() {
        return getValue(this.f26648f);
    }

    @Override // com.google.protobuf.C5244r0
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
