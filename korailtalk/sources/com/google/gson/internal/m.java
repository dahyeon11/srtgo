package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.r;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class m {
    public static com.google.gson.i parse(D3.a aVar) {
        boolean z8;
        try {
            try {
                aVar.peek();
                z8 = false;
            } catch (D3.d e8) {
                throw new r(e8);
            } catch (IOException e9) {
                throw new com.google.gson.j(e9);
            } catch (NumberFormatException e10) {
                throw new r(e10);
            }
        } catch (EOFException e11) {
            e = e11;
            z8 = true;
        }
        try {
            return (com.google.gson.i) TypeAdapters.JSON_ELEMENT.read(aVar);
        } catch (EOFException e12) {
            e = e12;
            if (z8) {
                return com.google.gson.k.INSTANCE;
            }
            throw new r(e);
        }
    }

    public static void write(com.google.gson.i iVar, D3.c cVar) {
        TypeAdapters.JSON_ELEMENT.write(cVar, iVar);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    private static final class b extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f26069a;

        /* renamed from: b, reason: collision with root package name */
        private final a f26070b = new a();

        private static class a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            private char[] f26071a;

            /* renamed from: b, reason: collision with root package name */
            private String f26072b;

            private a() {
            }

            void a(char[] cArr) {
                this.f26071a = cArr;
                this.f26072b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i8) {
                return this.f26071a[i8];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f26071a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i8, int i9) {
                return new String(this.f26071a, i8, i9 - i8);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f26072b == null) {
                    this.f26072b = new String(this.f26071a);
                }
                return this.f26072b;
            }
        }

        b(Appendable appendable) {
            this.f26069a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) throws IOException {
            this.f26070b.a(cArr);
            this.f26069a.append(this.f26070b, i8, i9 + i8);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f26069a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i8) throws IOException {
            this.f26069a.append((char) i8);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i8, int i9) throws IOException {
            this.f26069a.append(charSequence, i8, i9);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i8, int i9) throws IOException {
            Objects.requireNonNull(str);
            this.f26069a.append(str, i8, i9 + i8);
        }
    }
}
