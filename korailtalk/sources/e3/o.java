package e3;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f30399a;

    class a extends o {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30400b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o oVar, String str) {
            super(oVar, null);
            this.f30400b = str;
        }

        @Override // e3.o
        CharSequence c(Object obj) {
            return obj == null ? this.f30400b : o.this.c(obj);
        }

        @Override // e3.o
        public o skipNulls() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // e3.o
        public o useForNull(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    class b extends o {
        b(o oVar) {
            super(oVar, null);
        }

        @Override // e3.o
        public <A extends Appendable> A appendTo(A a9, Iterator<? extends Object> it) throws IOException {
            w.checkNotNull(a9, "appendable");
            w.checkNotNull(it, "parts");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    a9.append(o.this.c(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a9.append(o.this.f30399a);
                    a9.append(o.this.c(next2));
                }
            }
            return a9;
        }

        @Override // e3.o
        public o useForNull(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // e3.o
        public d withKeyValueSeparator(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    class c extends AbstractList {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f30403a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f30404b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f30405c;

        c(Object[] objArr, Object obj, Object obj2) {
            this.f30403a = objArr;
            this.f30404b = obj;
            this.f30405c = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i8) {
            return i8 != 0 ? i8 != 1 ? this.f30403a[i8 - 2] : this.f30405c : this.f30404b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30403a.length + 2;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final o f30406a;

        /* renamed from: b, reason: collision with root package name */
        private final String f30407b;

        /* synthetic */ d(o oVar, String str, a aVar) {
            this(oVar, str);
        }

        public <A extends Appendable> A appendTo(A a9, Map<?, ?> map) {
            return (A) appendTo((d) a9, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public d useForNull(String str) {
            return new d(this.f30406a.useForNull(str), this.f30407b);
        }

        private d(o oVar, String str) {
            this.f30406a = oVar;
            this.f30407b = (String) w.checkNotNull(str);
        }

        public StringBuilder appendTo(StringBuilder sb, Map<?, ?> map) {
            return appendTo(sb, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        public <A extends Appendable> A appendTo(A a9, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return (A) appendTo((d) a9, iterable.iterator());
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), it).toString();
        }

        public <A extends Appendable> A appendTo(A a9, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            w.checkNotNull(a9);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a9.append(this.f30406a.c(next.getKey()));
                a9.append(this.f30407b);
                a9.append(this.f30406a.c(next.getValue()));
                while (it.hasNext()) {
                    a9.append(this.f30406a.f30399a);
                    Map.Entry<?, ?> next2 = it.next();
                    a9.append(this.f30406a.c(next2.getKey()));
                    a9.append(this.f30407b);
                    a9.append(this.f30406a.c(next2.getValue()));
                }
            }
            return a9;
        }

        public StringBuilder appendTo(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb, iterable.iterator());
        }

        public StringBuilder appendTo(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                appendTo((d) sb, it);
                return sb;
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    /* synthetic */ o(o oVar, a aVar) {
        this(oVar);
    }

    private static Iterable b(Object obj, Object obj2, Object[] objArr) {
        w.checkNotNull(objArr);
        return new c(objArr, obj, obj2);
    }

    public static o on(String str) {
        return new o(str);
    }

    public <A extends Appendable> A appendTo(A a9, Iterable<? extends Object> iterable) {
        return (A) appendTo((o) a9, iterable.iterator());
    }

    CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String join(Iterable<? extends Object> iterable) {
        return join(iterable.iterator());
    }

    public o skipNulls() {
        return new b(this);
    }

    public o useForNull(String str) {
        w.checkNotNull(str);
        return new a(this, str);
    }

    public d withKeyValueSeparator(char c9) {
        return withKeyValueSeparator(String.valueOf(c9));
    }

    private o(String str) {
        this.f30399a = (String) w.checkNotNull(str);
    }

    public static o on(char c9) {
        return new o(String.valueOf(c9));
    }

    public <A extends Appendable> A appendTo(A a9, Iterator<? extends Object> it) throws IOException {
        w.checkNotNull(a9);
        if (it.hasNext()) {
            a9.append(c(it.next()));
            while (it.hasNext()) {
                a9.append(this.f30399a);
                a9.append(c(it.next()));
            }
        }
        return a9;
    }

    public final String join(Iterator<? extends Object> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public d withKeyValueSeparator(String str) {
        return new d(this, str, null);
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    private o(o oVar) {
        this.f30399a = oVar.f30399a;
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
        return join(b(obj, obj2, objArr));
    }

    public final <A extends Appendable> A appendTo(A a9, Object[] objArr) {
        return (A) appendTo((o) a9, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    public final <A extends Appendable> A appendTo(A a9, Object obj, Object obj2, Object... objArr) {
        return (A) appendTo((o) a9, b(obj, obj2, objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb, Iterable<? extends Object> iterable) {
        return appendTo(sb, iterable.iterator());
    }

    public final StringBuilder appendTo(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            appendTo((o) sb, it);
            return sb;
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public final StringBuilder appendTo(StringBuilder sb, Object[] objArr) {
        return appendTo(sb, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb, Object obj, Object obj2, Object... objArr) {
        return appendTo(sb, b(obj, obj2, objArr));
    }
}
