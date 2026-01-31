package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c extends D3.c {

    /* renamed from: p, reason: collision with root package name */
    private static final Writer f26018p = new a();

    /* renamed from: q, reason: collision with root package name */
    private static final o f26019q = new o("closed");

    /* renamed from: m, reason: collision with root package name */
    private final List f26020m;

    /* renamed from: n, reason: collision with root package name */
    private String f26021n;

    /* renamed from: o, reason: collision with root package name */
    private i f26022o;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            throw new AssertionError();
        }
    }

    public c() {
        super(f26018p);
        this.f26020m = new ArrayList();
        this.f26022o = k.INSTANCE;
    }

    private i l() {
        return (i) this.f26020m.get(r0.size() - 1);
    }

    private void m(i iVar) {
        if (this.f26021n != null) {
            if (!iVar.isJsonNull() || getSerializeNulls()) {
                ((l) l()).add(this.f26021n, iVar);
            }
            this.f26021n = null;
            return;
        }
        if (this.f26020m.isEmpty()) {
            this.f26022o = iVar;
            return;
        }
        i iVarL = l();
        if (!(iVarL instanceof f)) {
            throw new IllegalStateException();
        }
        ((f) iVarL).add(iVar);
    }

    @Override // D3.c
    public D3.c beginArray() {
        f fVar = new f();
        m(fVar);
        this.f26020m.add(fVar);
        return this;
    }

    @Override // D3.c
    public D3.c beginObject() {
        l lVar = new l();
        m(lVar);
        this.f26020m.add(lVar);
        return this;
    }

    @Override // D3.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f26020m.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f26020m.add(f26019q);
    }

    @Override // D3.c
    public D3.c endArray() {
        if (this.f26020m.isEmpty() || this.f26021n != null) {
            throw new IllegalStateException();
        }
        if (!(l() instanceof f)) {
            throw new IllegalStateException();
        }
        this.f26020m.remove(r0.size() - 1);
        return this;
    }

    @Override // D3.c
    public D3.c endObject() {
        if (this.f26020m.isEmpty() || this.f26021n != null) {
            throw new IllegalStateException();
        }
        if (!(l() instanceof l)) {
            throw new IllegalStateException();
        }
        this.f26020m.remove(r0.size() - 1);
        return this;
    }

    @Override // D3.c, java.io.Flushable
    public void flush() {
    }

    public i get() {
        if (this.f26020m.isEmpty()) {
            return this.f26022o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f26020m);
    }

    @Override // D3.c
    public D3.c jsonValue(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // D3.c
    public D3.c name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f26020m.isEmpty() || this.f26021n != null) {
            throw new IllegalStateException();
        }
        if (!(l() instanceof l)) {
            throw new IllegalStateException();
        }
        this.f26021n = str;
        return this;
    }

    @Override // D3.c
    public D3.c nullValue() {
        m(k.INSTANCE);
        return this;
    }

    @Override // D3.c
    public D3.c value(String str) {
        if (str == null) {
            return nullValue();
        }
        m(new o(str));
        return this;
    }

    @Override // D3.c
    public D3.c value(boolean z8) {
        m(new o(Boolean.valueOf(z8)));
        return this;
    }

    @Override // D3.c
    public D3.c value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        m(new o(bool));
        return this;
    }

    @Override // D3.c
    public D3.c value(float f8) {
        if (!isLenient() && (Float.isNaN(f8) || Float.isInfinite(f8))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f8);
        }
        m(new o(Float.valueOf(f8)));
        return this;
    }

    @Override // D3.c
    public D3.c value(double d9) {
        if (!isLenient() && (Double.isNaN(d9) || Double.isInfinite(d9))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d9);
        }
        m(new o(Double.valueOf(d9)));
        return this;
    }

    @Override // D3.c
    public D3.c value(long j8) {
        m(new o(Long.valueOf(j8)));
        return this;
    }

    @Override // D3.c
    public D3.c value(Number number) {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m(new o(number));
        return this;
    }
}
