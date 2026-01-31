package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.w;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import z3.InterfaceC6622c;

/* loaded from: classes2.dex */
public abstract class TypeAdapters {
    public static final TypeAdapter ATOMIC_BOOLEAN;
    public static final w ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter ATOMIC_INTEGER;
    public static final TypeAdapter ATOMIC_INTEGER_ARRAY;
    public static final w ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final w ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter BIG_DECIMAL;
    public static final TypeAdapter BIG_INTEGER;
    public static final TypeAdapter BIT_SET;
    public static final w BIT_SET_FACTORY;
    public static final TypeAdapter BOOLEAN;
    public static final TypeAdapter BOOLEAN_AS_STRING;
    public static final w BOOLEAN_FACTORY;
    public static final TypeAdapter BYTE;
    public static final w BYTE_FACTORY;
    public static final TypeAdapter CALENDAR;
    public static final w CALENDAR_FACTORY;
    public static final TypeAdapter CHARACTER;
    public static final w CHARACTER_FACTORY;
    public static final TypeAdapter CLASS;
    public static final w CLASS_FACTORY;
    public static final TypeAdapter CURRENCY;
    public static final w CURRENCY_FACTORY;
    public static final TypeAdapter DOUBLE;
    public static final w ENUM_FACTORY;
    public static final TypeAdapter FLOAT;
    public static final TypeAdapter INET_ADDRESS;
    public static final w INET_ADDRESS_FACTORY;
    public static final TypeAdapter INTEGER;
    public static final w INTEGER_FACTORY;
    public static final TypeAdapter JSON_ELEMENT;
    public static final w JSON_ELEMENT_FACTORY;
    public static final TypeAdapter LAZILY_PARSED_NUMBER;
    public static final TypeAdapter LOCALE;
    public static final w LOCALE_FACTORY;
    public static final TypeAdapter LONG;
    public static final TypeAdapter SHORT;
    public static final w SHORT_FACTORY;
    public static final TypeAdapter STRING;
    public static final TypeAdapter STRING_BUFFER;
    public static final w STRING_BUFFER_FACTORY;
    public static final TypeAdapter STRING_BUILDER;
    public static final w STRING_BUILDER_FACTORY;
    public static final w STRING_FACTORY;
    public static final TypeAdapter URI;
    public static final w URI_FACTORY;
    public static final TypeAdapter URL;
    public static final w URL_FACTORY;
    public static final TypeAdapter UUID;
    public static final w UUID_FACTORY;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$1 */
    class AnonymousClass1 extends TypeAdapter {
        AnonymousClass1() {
        }

        @Override // com.google.gson.TypeAdapter
        public Class read(D3.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$10 */
    class AnonymousClass10 extends TypeAdapter {
        AnonymousClass10() {
        }

        @Override // com.google.gson.TypeAdapter
        public AtomicIntegerArray read(D3.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.beginArray();
            while (aVar.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.nextInt()));
                } catch (NumberFormatException e8) {
                    throw new r(e8);
                }
            }
            aVar.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i8 = 0; i8 < size; i8++) {
                atomicIntegerArray.set(i8, ((Integer) arrayList.get(i8)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.beginArray();
            int length = atomicIntegerArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                cVar.value(atomicIntegerArray.get(i8));
            }
            cVar.endArray();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$11 */
    class AnonymousClass11 extends TypeAdapter {
        AnonymousClass11() {
        }

        @Override // com.google.gson.TypeAdapter
        public Number read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                return Long.valueOf(aVar.nextLong());
            } catch (NumberFormatException e8) {
                throw new r(e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
            } else {
                cVar.value(number.longValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$12 */
    class AnonymousClass12 extends TypeAdapter {
        AnonymousClass12() {
        }

        @Override // com.google.gson.TypeAdapter
        public Number read(D3.a aVar) throws IOException {
            if (aVar.peek() != D3.b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$13 */
    class AnonymousClass13 extends TypeAdapter {
        AnonymousClass13() {
        }

        @Override // com.google.gson.TypeAdapter
        public Number read(D3.a aVar) throws IOException {
            if (aVar.peek() != D3.b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
            } else {
                cVar.value(number.doubleValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$14 */
    class AnonymousClass14 extends TypeAdapter {
        AnonymousClass14() {
        }

        @Override // com.google.gson.TypeAdapter
        public Character read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            if (strNextString.length() == 1) {
                return Character.valueOf(strNextString.charAt(0));
            }
            throw new r("Expecting character, got: " + strNextString + "; at " + aVar.getPreviousPath());
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Character ch) throws IOException {
            cVar.value(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$15 */
    class AnonymousClass15 extends TypeAdapter {
        AnonymousClass15() {
        }

        @Override // com.google.gson.TypeAdapter
        public String read(D3.a aVar) throws IOException {
            D3.b bVarPeek = aVar.peek();
            if (bVarPeek != D3.b.NULL) {
                return bVarPeek == D3.b.BOOLEAN ? Boolean.toString(aVar.nextBoolean()) : aVar.nextString();
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, String str) throws IOException {
            cVar.value(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$16 */
    class AnonymousClass16 extends TypeAdapter {
        AnonymousClass16() {
        }

        @Override // com.google.gson.TypeAdapter
        public BigDecimal read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            try {
                return new BigDecimal(strNextString);
            } catch (NumberFormatException e8) {
                throw new r("Failed parsing '" + strNextString + "' as BigDecimal; at path " + aVar.getPreviousPath(), e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.value(bigDecimal);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$17 */
    class AnonymousClass17 extends TypeAdapter {
        AnonymousClass17() {
        }

        @Override // com.google.gson.TypeAdapter
        public BigInteger read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            try {
                return new BigInteger(strNextString);
            } catch (NumberFormatException e8) {
                throw new r("Failed parsing '" + strNextString + "' as BigInteger; at path " + aVar.getPreviousPath(), e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, BigInteger bigInteger) throws IOException {
            cVar.value(bigInteger);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$18 */
    class AnonymousClass18 extends TypeAdapter {
        AnonymousClass18() {
        }

        @Override // com.google.gson.TypeAdapter
        public com.google.gson.internal.f read(D3.a aVar) throws IOException {
            if (aVar.peek() != D3.b.NULL) {
                return new com.google.gson.internal.f(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, com.google.gson.internal.f fVar) throws IOException {
            cVar.value(fVar);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$19 */
    class AnonymousClass19 extends TypeAdapter {
        AnonymousClass19() {
        }

        @Override // com.google.gson.TypeAdapter
        public StringBuilder read(D3.a aVar) throws IOException {
            if (aVar.peek() != D3.b.NULL) {
                return new StringBuilder(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, StringBuilder sb) throws IOException {
            cVar.value(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$2 */
    class AnonymousClass2 extends TypeAdapter {
        AnonymousClass2() {
        }

        @Override // com.google.gson.TypeAdapter
        public BitSet read(D3.a aVar) throws IOException, NumberFormatException {
            BitSet bitSet = new BitSet();
            aVar.beginArray();
            D3.b bVarPeek = aVar.peek();
            int i8 = 0;
            while (bVarPeek != D3.b.END_ARRAY) {
                int i9 = f.f26009a[bVarPeek.ordinal()];
                boolean zNextBoolean = true;
                if (i9 == 1 || i9 == 2) {
                    int iNextInt = aVar.nextInt();
                    if (iNextInt == 0) {
                        zNextBoolean = false;
                    } else if (iNextInt != 1) {
                        throw new r("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + aVar.getPreviousPath());
                    }
                } else {
                    if (i9 != 3) {
                        throw new r("Invalid bitset value type: " + bVarPeek + "; at path " + aVar.getPath());
                    }
                    zNextBoolean = aVar.nextBoolean();
                }
                if (zNextBoolean) {
                    bitSet.set(i8);
                }
                i8++;
                bVarPeek = aVar.peek();
            }
            aVar.endArray();
            return bitSet;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, BitSet bitSet) throws IOException {
            cVar.beginArray();
            int length = bitSet.length();
            for (int i8 = 0; i8 < length; i8++) {
                cVar.value(bitSet.get(i8) ? 1L : 0L);
            }
            cVar.endArray();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$20 */
    class AnonymousClass20 extends TypeAdapter {
        AnonymousClass20() {
        }

        @Override // com.google.gson.TypeAdapter
        public StringBuffer read(D3.a aVar) throws IOException {
            if (aVar.peek() != D3.b.NULL) {
                return new StringBuffer(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.value(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$21 */
    class AnonymousClass21 extends TypeAdapter {
        AnonymousClass21() {
        }

        @Override // com.google.gson.TypeAdapter
        public URL read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            if ("null".equals(strNextString)) {
                return null;
            }
            return new URL(strNextString);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, URL url) throws IOException {
            cVar.value(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$22 */
    class AnonymousClass22 extends TypeAdapter {
        AnonymousClass22() {
        }

        @Override // com.google.gson.TypeAdapter
        public URI read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                String strNextString = aVar.nextString();
                if ("null".equals(strNextString)) {
                    return null;
                }
                return new URI(strNextString);
            } catch (URISyntaxException e8) {
                throw new j(e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, URI uri) throws IOException {
            cVar.value(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$23 */
    class AnonymousClass23 extends TypeAdapter {
        AnonymousClass23() {
        }

        @Override // com.google.gson.TypeAdapter
        public InetAddress read(D3.a aVar) throws IOException {
            if (aVar.peek() != D3.b.NULL) {
                return InetAddress.getByName(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, InetAddress inetAddress) throws IOException {
            cVar.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$24 */
    class AnonymousClass24 extends TypeAdapter {
        AnonymousClass24() {
        }

        @Override // com.google.gson.TypeAdapter
        public UUID read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            try {
                return UUID.fromString(strNextString);
            } catch (IllegalArgumentException e8) {
                throw new r("Failed parsing '" + strNextString + "' as UUID; at path " + aVar.getPreviousPath(), e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, UUID uuid) throws IOException {
            cVar.value(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$25 */
    class AnonymousClass25 extends TypeAdapter {
        AnonymousClass25() {
        }

        @Override // com.google.gson.TypeAdapter
        public Currency read(D3.a aVar) throws IOException {
            String strNextString = aVar.nextString();
            try {
                return Currency.getInstance(strNextString);
            } catch (IllegalArgumentException e8) {
                throw new r("Failed parsing '" + strNextString + "' as Currency; at path " + aVar.getPreviousPath(), e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Currency currency) throws IOException {
            cVar.value(currency.getCurrencyCode());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$26 */
    class AnonymousClass26 extends TypeAdapter {
        AnonymousClass26() {
        }

        @Override // com.google.gson.TypeAdapter
        public Calendar read(D3.a aVar) throws IOException, NumberFormatException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            aVar.beginObject();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (aVar.peek() != D3.b.END_OBJECT) {
                String strNextName = aVar.nextName();
                int iNextInt = aVar.nextInt();
                if ("year".equals(strNextName)) {
                    i8 = iNextInt;
                } else if ("month".equals(strNextName)) {
                    i9 = iNextInt;
                } else if ("dayOfMonth".equals(strNextName)) {
                    i10 = iNextInt;
                } else if ("hourOfDay".equals(strNextName)) {
                    i11 = iNextInt;
                } else if ("minute".equals(strNextName)) {
                    i12 = iNextInt;
                } else if ("second".equals(strNextName)) {
                    i13 = iNextInt;
                }
            }
            aVar.endObject();
            return new GregorianCalendar(i8, i9, i10, i11, i12, i13);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.nullValue();
                return;
            }
            cVar.beginObject();
            cVar.name("year");
            cVar.value(calendar.get(1));
            cVar.name("month");
            cVar.value(calendar.get(2));
            cVar.name("dayOfMonth");
            cVar.value(calendar.get(5));
            cVar.name("hourOfDay");
            cVar.value(calendar.get(11));
            cVar.name("minute");
            cVar.value(calendar.get(12));
            cVar.name("second");
            cVar.value(calendar.get(13));
            cVar.endObject();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$27 */
    class AnonymousClass27 extends TypeAdapter {
        AnonymousClass27() {
        }

        @Override // com.google.gson.TypeAdapter
        public Locale read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.nextString(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Locale locale) throws IOException {
            cVar.value(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$28 */
    class AnonymousClass28 extends TypeAdapter {
        AnonymousClass28() {
        }

        private i a(D3.a aVar, D3.b bVar) throws IOException {
            int i8 = f.f26009a[bVar.ordinal()];
            if (i8 == 1) {
                return new o(new com.google.gson.internal.f(aVar.nextString()));
            }
            if (i8 == 2) {
                return new o(aVar.nextString());
            }
            if (i8 == 3) {
                return new o(Boolean.valueOf(aVar.nextBoolean()));
            }
            if (i8 == 6) {
                aVar.nextNull();
                return k.INSTANCE;
            }
            throw new IllegalStateException("Unexpected token: " + bVar);
        }

        private i b(D3.a aVar, D3.b bVar) throws IOException {
            int i8 = f.f26009a[bVar.ordinal()];
            if (i8 == 4) {
                aVar.beginArray();
                return new com.google.gson.f();
            }
            if (i8 != 5) {
                return null;
            }
            aVar.beginObject();
            return new l();
        }

        @Override // com.google.gson.TypeAdapter
        public i read(D3.a aVar) throws IOException {
            if (aVar instanceof com.google.gson.internal.bind.b) {
                return ((com.google.gson.internal.bind.b) aVar).u();
            }
            D3.b bVarPeek = aVar.peek();
            i iVarB = b(aVar, bVarPeek);
            if (iVarB == null) {
                return a(aVar, bVarPeek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.hasNext()) {
                    String strNextName = iVarB instanceof l ? aVar.nextName() : null;
                    D3.b bVarPeek2 = aVar.peek();
                    i iVarB2 = b(aVar, bVarPeek2);
                    boolean z8 = iVarB2 != null;
                    if (iVarB2 == null) {
                        iVarB2 = a(aVar, bVarPeek2);
                    }
                    if (iVarB instanceof com.google.gson.f) {
                        ((com.google.gson.f) iVarB).add(iVarB2);
                    } else {
                        ((l) iVarB).add(strNextName, iVarB2);
                    }
                    if (z8) {
                        arrayDeque.addLast(iVarB);
                        iVarB = iVarB2;
                    }
                } else {
                    if (iVarB instanceof com.google.gson.f) {
                        aVar.endArray();
                    } else {
                        aVar.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return iVarB;
                    }
                    iVarB = (i) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, i iVar) throws IOException {
            if (iVar == null || iVar.isJsonNull()) {
                cVar.nullValue();
                return;
            }
            if (iVar.isJsonPrimitive()) {
                o asJsonPrimitive = iVar.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    cVar.value(asJsonPrimitive.getAsNumber());
                    return;
                } else if (asJsonPrimitive.isBoolean()) {
                    cVar.value(asJsonPrimitive.getAsBoolean());
                    return;
                } else {
                    cVar.value(asJsonPrimitive.getAsString());
                    return;
                }
            }
            if (iVar.isJsonArray()) {
                cVar.beginArray();
                Iterator<i> it = iVar.getAsJsonArray().iterator();
                while (it.hasNext()) {
                    write(cVar, it.next());
                }
                cVar.endArray();
                return;
            }
            if (!iVar.isJsonObject()) {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
            cVar.beginObject();
            for (Map.Entry<String, i> entry : iVar.getAsJsonObject().entrySet()) {
                cVar.name(entry.getKey());
                write(cVar, entry.getValue());
            }
            cVar.endObject();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$3 */
    class AnonymousClass3 extends TypeAdapter {
        AnonymousClass3() {
        }

        @Override // com.google.gson.TypeAdapter
        public Boolean read(D3.a aVar) throws IOException {
            D3.b bVarPeek = aVar.peek();
            if (bVarPeek != D3.b.NULL) {
                return bVarPeek == D3.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.nextString())) : Boolean.valueOf(aVar.nextBoolean());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Boolean bool) throws IOException {
            cVar.value(bool);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$34 */
    class AnonymousClass34 implements w {

        /* renamed from: a */
        final /* synthetic */ Class f25990a;

        /* renamed from: b */
        final /* synthetic */ TypeAdapter f25991b;

        /* renamed from: com.google.gson.internal.bind.TypeAdapters$34$1 */
        class AnonymousClass1 extends TypeAdapter {

            /* renamed from: a */
            final /* synthetic */ Class f25992a;

            AnonymousClass1(Class cls) {
                cls = cls;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [T1, java.lang.Object] */
            @Override // com.google.gson.TypeAdapter
            public T1 read(D3.a aVar) {
                ?? r02 = typeAdapter.read(aVar);
                if (r02 == 0 || cls.isInstance(r02)) {
                    return r02;
                }
                throw new r("Expected a " + cls.getName() + " but was " + r02.getClass().getName() + "; at path " + aVar.getPreviousPath());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, T1 t12) {
                typeAdapter.write(cVar, t12);
            }
        }

        AnonymousClass34(Class cls, TypeAdapter typeAdapter) {
            cls = cls;
            typeAdapter = typeAdapter;
        }

        @Override // com.google.gson.w
        public <T2> TypeAdapter create(Gson gson, C3.a aVar) {
            Class<?> rawType = aVar.getRawType();
            if (cls.isAssignableFrom(rawType)) {
                return new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1

                    /* renamed from: a */
                    final /* synthetic */ Class f25992a;

                    AnonymousClass1(Class rawType2) {
                        cls = rawType2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [T1, java.lang.Object] */
                    @Override // com.google.gson.TypeAdapter
                    public T1 read(D3.a aVar2) {
                        ?? r02 = typeAdapter.read(aVar2);
                        if (r02 == 0 || cls.isInstance(r02)) {
                            return r02;
                        }
                        throw new r("Expected a " + cls.getName() + " but was " + r02.getClass().getName() + "; at path " + aVar2.getPreviousPath());
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(D3.c cVar, T1 t12) {
                        typeAdapter.write(cVar, t12);
                    }
                };
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$4 */
    class AnonymousClass4 extends TypeAdapter {
        AnonymousClass4() {
        }

        @Override // com.google.gson.TypeAdapter
        public Boolean read(D3.a aVar) throws IOException {
            if (aVar.peek() != D3.b.NULL) {
                return Boolean.valueOf(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Boolean bool) throws IOException {
            cVar.value(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$5 */
    class AnonymousClass5 extends TypeAdapter {
        AnonymousClass5() {
        }

        @Override // com.google.gson.TypeAdapter
        public Number read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 255 && iNextInt >= -128) {
                    return Byte.valueOf((byte) iNextInt);
                }
                throw new r("Lossy conversion from " + iNextInt + " to byte; at path " + aVar.getPreviousPath());
            } catch (NumberFormatException e8) {
                throw new r(e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
            } else {
                cVar.value(number.byteValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$6 */
    class AnonymousClass6 extends TypeAdapter {
        AnonymousClass6() {
        }

        @Override // com.google.gson.TypeAdapter
        public Number read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 65535 && iNextInt >= -32768) {
                    return Short.valueOf((short) iNextInt);
                }
                throw new r("Lossy conversion from " + iNextInt + " to short; at path " + aVar.getPreviousPath());
            } catch (NumberFormatException e8) {
                throw new r(e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
            } else {
                cVar.value(number.shortValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$7 */
    class AnonymousClass7 extends TypeAdapter {
        AnonymousClass7() {
        }

        @Override // com.google.gson.TypeAdapter
        public Number read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(aVar.nextInt());
            } catch (NumberFormatException e8) {
                throw new r(e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
            } else {
                cVar.value(number.intValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$8 */
    class AnonymousClass8 extends TypeAdapter {
        AnonymousClass8() {
        }

        @Override // com.google.gson.TypeAdapter
        public AtomicInteger read(D3.a aVar) {
            try {
                return new AtomicInteger(aVar.nextInt());
            } catch (NumberFormatException e8) {
                throw new r(e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.value(atomicInteger.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$9 */
    class AnonymousClass9 extends TypeAdapter {
        AnonymousClass9() {
        }

        @Override // com.google.gson.TypeAdapter
        public AtomicBoolean read(D3.a aVar) {
            return new AtomicBoolean(aVar.nextBoolean());
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.value(atomicBoolean.get());
        }
    }

    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter {

        /* renamed from: a */
        private final Map f25994a = new HashMap();

        /* renamed from: b */
        private final Map f25995b = new HashMap();

        /* renamed from: c */
        private final Map f25996c = new HashMap();

        class a implements PrivilegedAction {

            /* renamed from: a */
            final /* synthetic */ Class f25997a;

            a(Class cls) {
                this.f25997a = cls;
            }

            @Override // java.security.PrivilegedAction
            public Field[] run() throws SecurityException {
                Field[] declaredFields = this.f25997a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String strName = r42.name();
                    String string = r42.toString();
                    InterfaceC6622c interfaceC6622c = (InterfaceC6622c) field.getAnnotation(InterfaceC6622c.class);
                    if (interfaceC6622c != null) {
                        strName = interfaceC6622c.value();
                        for (String str : interfaceC6622c.alternate()) {
                            this.f25994a.put(str, r42);
                        }
                    }
                    this.f25994a.put(strName, r42);
                    this.f25995b.put(string, r42);
                    this.f25996c.put(r42, strName);
                }
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public T read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            T t8 = (T) this.f25994a.get(strNextString);
            return t8 == null ? (T) this.f25995b.get(strNextString) : t8;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, T t8) throws IOException {
            cVar.value(t8 == null ? null : (String) this.f25996c.get(t8));
        }
    }

    class a implements w {
        a() {
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            Class<? super Object> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    }

    class b implements w {

        /* renamed from: a */
        final /* synthetic */ C3.a f25999a;

        /* renamed from: b */
        final /* synthetic */ TypeAdapter f26000b;

        b(C3.a aVar, TypeAdapter typeAdapter) {
            this.f25999a = aVar;
            this.f26000b = typeAdapter;
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            if (aVar.equals(this.f25999a)) {
                return this.f26000b;
            }
            return null;
        }
    }

    class c implements w {

        /* renamed from: a */
        final /* synthetic */ Class f26001a;

        /* renamed from: b */
        final /* synthetic */ TypeAdapter f26002b;

        c(Class cls, TypeAdapter typeAdapter) {
            this.f26001a = cls;
            this.f26002b = typeAdapter;
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            if (aVar.getRawType() == this.f26001a) {
                return this.f26002b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f26001a.getName() + ",adapter=" + this.f26002b + "]";
        }
    }

    class d implements w {

        /* renamed from: a */
        final /* synthetic */ Class f26003a;

        /* renamed from: b */
        final /* synthetic */ Class f26004b;

        /* renamed from: c */
        final /* synthetic */ TypeAdapter f26005c;

        d(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.f26003a = cls;
            this.f26004b = cls2;
            this.f26005c = typeAdapter;
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            Class<Object> rawType = aVar.getRawType();
            if (rawType == this.f26003a || rawType == this.f26004b) {
                return this.f26005c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f26004b.getName() + "+" + this.f26003a.getName() + ",adapter=" + this.f26005c + "]";
        }
    }

    class e implements w {

        /* renamed from: a */
        final /* synthetic */ Class f26006a;

        /* renamed from: b */
        final /* synthetic */ Class f26007b;

        /* renamed from: c */
        final /* synthetic */ TypeAdapter f26008c;

        e(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.f26006a = cls;
            this.f26007b = cls2;
            this.f26008c = typeAdapter;
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            Class<Object> rawType = aVar.getRawType();
            if (rawType == this.f26006a || rawType == this.f26007b) {
                return this.f26008c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f26006a.getName() + "+" + this.f26007b.getName() + ",adapter=" + this.f26008c + "]";
        }
    }

    static /* synthetic */ class f {

        /* renamed from: a */
        static final /* synthetic */ int[] f26009a;

        static {
            int[] iArr = new int[D3.b.values().length];
            f26009a = iArr;
            try {
                iArr[D3.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26009a[D3.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26009a[D3.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26009a[D3.b.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26009a[D3.b.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26009a[D3.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        TypeAdapter typeAdapterNullSafe = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            AnonymousClass1() {
            }

            @Override // com.google.gson.TypeAdapter
            public Class read(D3.a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        CLASS = typeAdapterNullSafe;
        CLASS_FACTORY = newFactory(Class.class, typeAdapterNullSafe);
        TypeAdapter typeAdapterNullSafe2 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            AnonymousClass2() {
            }

            @Override // com.google.gson.TypeAdapter
            public BitSet read(D3.a aVar) throws IOException, NumberFormatException {
                BitSet bitSet = new BitSet();
                aVar.beginArray();
                D3.b bVarPeek = aVar.peek();
                int i8 = 0;
                while (bVarPeek != D3.b.END_ARRAY) {
                    int i9 = f.f26009a[bVarPeek.ordinal()];
                    boolean zNextBoolean = true;
                    if (i9 == 1 || i9 == 2) {
                        int iNextInt = aVar.nextInt();
                        if (iNextInt == 0) {
                            zNextBoolean = false;
                        } else if (iNextInt != 1) {
                            throw new r("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + aVar.getPreviousPath());
                        }
                    } else {
                        if (i9 != 3) {
                            throw new r("Invalid bitset value type: " + bVarPeek + "; at path " + aVar.getPath());
                        }
                        zNextBoolean = aVar.nextBoolean();
                    }
                    if (zNextBoolean) {
                        bitSet.set(i8);
                    }
                    i8++;
                    bVarPeek = aVar.peek();
                }
                aVar.endArray();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, BitSet bitSet) throws IOException {
                cVar.beginArray();
                int length = bitSet.length();
                for (int i8 = 0; i8 < length; i8++) {
                    cVar.value(bitSet.get(i8) ? 1L : 0L);
                }
                cVar.endArray();
            }
        }.nullSafe();
        BIT_SET = typeAdapterNullSafe2;
        BIT_SET_FACTORY = newFactory(BitSet.class, typeAdapterNullSafe2);
        AnonymousClass3 anonymousClass3 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            AnonymousClass3() {
            }

            @Override // com.google.gson.TypeAdapter
            public Boolean read(D3.a aVar) throws IOException {
                D3.b bVarPeek = aVar.peek();
                if (bVarPeek != D3.b.NULL) {
                    return bVarPeek == D3.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.nextString())) : Boolean.valueOf(aVar.nextBoolean());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Boolean bool) throws IOException {
                cVar.value(bool);
            }
        };
        BOOLEAN = anonymousClass3;
        BOOLEAN_AS_STRING = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            AnonymousClass4() {
            }

            @Override // com.google.gson.TypeAdapter
            public Boolean read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return Boolean.valueOf(aVar.nextString());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Boolean bool) throws IOException {
                cVar.value(bool == null ? "null" : bool.toString());
            }
        };
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, anonymousClass3);
        AnonymousClass5 anonymousClass5 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            AnonymousClass5() {
            }

            @Override // com.google.gson.TypeAdapter
            public Number read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                try {
                    int iNextInt = aVar.nextInt();
                    if (iNextInt <= 255 && iNextInt >= -128) {
                        return Byte.valueOf((byte) iNextInt);
                    }
                    throw new r("Lossy conversion from " + iNextInt + " to byte; at path " + aVar.getPreviousPath());
                } catch (NumberFormatException e8) {
                    throw new r(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.nullValue();
                } else {
                    cVar.value(number.byteValue());
                }
            }
        };
        BYTE = anonymousClass5;
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, anonymousClass5);
        AnonymousClass6 anonymousClass6 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            AnonymousClass6() {
            }

            @Override // com.google.gson.TypeAdapter
            public Number read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                try {
                    int iNextInt = aVar.nextInt();
                    if (iNextInt <= 65535 && iNextInt >= -32768) {
                        return Short.valueOf((short) iNextInt);
                    }
                    throw new r("Lossy conversion from " + iNextInt + " to short; at path " + aVar.getPreviousPath());
                } catch (NumberFormatException e8) {
                    throw new r(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.nullValue();
                } else {
                    cVar.value(number.shortValue());
                }
            }
        };
        SHORT = anonymousClass6;
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, anonymousClass6);
        AnonymousClass7 anonymousClass7 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            AnonymousClass7() {
            }

            @Override // com.google.gson.TypeAdapter
            public Number read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.nextInt());
                } catch (NumberFormatException e8) {
                    throw new r(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.nullValue();
                } else {
                    cVar.value(number.intValue());
                }
            }
        };
        INTEGER = anonymousClass7;
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, anonymousClass7);
        TypeAdapter typeAdapterNullSafe3 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            AnonymousClass8() {
            }

            @Override // com.google.gson.TypeAdapter
            public AtomicInteger read(D3.a aVar) {
                try {
                    return new AtomicInteger(aVar.nextInt());
                } catch (NumberFormatException e8) {
                    throw new r(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, AtomicInteger atomicInteger) throws IOException {
                cVar.value(atomicInteger.get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = typeAdapterNullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, typeAdapterNullSafe3);
        TypeAdapter typeAdapterNullSafe4 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            AnonymousClass9() {
            }

            @Override // com.google.gson.TypeAdapter
            public AtomicBoolean read(D3.a aVar) {
                return new AtomicBoolean(aVar.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, AtomicBoolean atomicBoolean) throws IOException {
                cVar.value(atomicBoolean.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = typeAdapterNullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, typeAdapterNullSafe4);
        TypeAdapter typeAdapterNullSafe5 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            AnonymousClass10() {
            }

            @Override // com.google.gson.TypeAdapter
            public AtomicIntegerArray read(D3.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.beginArray();
                while (aVar.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.nextInt()));
                    } catch (NumberFormatException e8) {
                        throw new r(e8);
                    }
                }
                aVar.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i8 = 0; i8 < size; i8++) {
                    atomicIntegerArray.set(i8, ((Integer) arrayList.get(i8)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                cVar.beginArray();
                int length = atomicIntegerArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    cVar.value(atomicIntegerArray.get(i8));
                }
                cVar.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY = typeAdapterNullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, typeAdapterNullSafe5);
        LONG = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            AnonymousClass11() {
            }

            @Override // com.google.gson.TypeAdapter
            public Number read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.nextLong());
                } catch (NumberFormatException e8) {
                    throw new r(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.nullValue();
                } else {
                    cVar.value(number.longValue());
                }
            }
        };
        FLOAT = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            AnonymousClass12() {
            }

            @Override // com.google.gson.TypeAdapter
            public Number read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return Float.valueOf((float) aVar.nextDouble());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.nullValue();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                cVar.value(number);
            }
        };
        DOUBLE = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            AnonymousClass13() {
            }

            @Override // com.google.gson.TypeAdapter
            public Number read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return Double.valueOf(aVar.nextDouble());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.nullValue();
                } else {
                    cVar.value(number.doubleValue());
                }
            }
        };
        AnonymousClass14 anonymousClass14 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            AnonymousClass14() {
            }

            @Override // com.google.gson.TypeAdapter
            public Character read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                String strNextString = aVar.nextString();
                if (strNextString.length() == 1) {
                    return Character.valueOf(strNextString.charAt(0));
                }
                throw new r("Expecting character, got: " + strNextString + "; at " + aVar.getPreviousPath());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Character ch) throws IOException {
                cVar.value(ch == null ? null : String.valueOf(ch));
            }
        };
        CHARACTER = anonymousClass14;
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, anonymousClass14);
        AnonymousClass15 anonymousClass15 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            AnonymousClass15() {
            }

            @Override // com.google.gson.TypeAdapter
            public String read(D3.a aVar) throws IOException {
                D3.b bVarPeek = aVar.peek();
                if (bVarPeek != D3.b.NULL) {
                    return bVarPeek == D3.b.BOOLEAN ? Boolean.toString(aVar.nextBoolean()) : aVar.nextString();
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, String str) throws IOException {
                cVar.value(str);
            }
        };
        STRING = anonymousClass15;
        BIG_DECIMAL = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            AnonymousClass16() {
            }

            @Override // com.google.gson.TypeAdapter
            public BigDecimal read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                String strNextString = aVar.nextString();
                try {
                    return new BigDecimal(strNextString);
                } catch (NumberFormatException e8) {
                    throw new r("Failed parsing '" + strNextString + "' as BigDecimal; at path " + aVar.getPreviousPath(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, BigDecimal bigDecimal) throws IOException {
                cVar.value(bigDecimal);
            }
        };
        BIG_INTEGER = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            AnonymousClass17() {
            }

            @Override // com.google.gson.TypeAdapter
            public BigInteger read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                String strNextString = aVar.nextString();
                try {
                    return new BigInteger(strNextString);
                } catch (NumberFormatException e8) {
                    throw new r("Failed parsing '" + strNextString + "' as BigInteger; at path " + aVar.getPreviousPath(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, BigInteger bigInteger) throws IOException {
                cVar.value(bigInteger);
            }
        };
        LAZILY_PARSED_NUMBER = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            AnonymousClass18() {
            }

            @Override // com.google.gson.TypeAdapter
            public com.google.gson.internal.f read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return new com.google.gson.internal.f(aVar.nextString());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, com.google.gson.internal.f fVar) throws IOException {
                cVar.value(fVar);
            }
        };
        STRING_FACTORY = newFactory(String.class, anonymousClass15);
        AnonymousClass19 anonymousClass19 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            AnonymousClass19() {
            }

            @Override // com.google.gson.TypeAdapter
            public StringBuilder read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return new StringBuilder(aVar.nextString());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, StringBuilder sb) throws IOException {
                cVar.value(sb == null ? null : sb.toString());
            }
        };
        STRING_BUILDER = anonymousClass19;
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, anonymousClass19);
        AnonymousClass20 anonymousClass20 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            AnonymousClass20() {
            }

            @Override // com.google.gson.TypeAdapter
            public StringBuffer read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return new StringBuffer(aVar.nextString());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, StringBuffer stringBuffer) throws IOException {
                cVar.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = anonymousClass20;
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, anonymousClass20);
        AnonymousClass21 anonymousClass21 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            AnonymousClass21() {
            }

            @Override // com.google.gson.TypeAdapter
            public URL read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                String strNextString = aVar.nextString();
                if ("null".equals(strNextString)) {
                    return null;
                }
                return new URL(strNextString);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, URL url) throws IOException {
                cVar.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = anonymousClass21;
        URL_FACTORY = newFactory(URL.class, anonymousClass21);
        AnonymousClass22 anonymousClass22 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            AnonymousClass22() {
            }

            @Override // com.google.gson.TypeAdapter
            public URI read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                try {
                    String strNextString = aVar.nextString();
                    if ("null".equals(strNextString)) {
                        return null;
                    }
                    return new URI(strNextString);
                } catch (URISyntaxException e8) {
                    throw new j(e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, URI uri) throws IOException {
                cVar.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = anonymousClass22;
        URI_FACTORY = newFactory(URI.class, anonymousClass22);
        AnonymousClass23 anonymousClass23 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            AnonymousClass23() {
            }

            @Override // com.google.gson.TypeAdapter
            public InetAddress read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return InetAddress.getByName(aVar.nextString());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, InetAddress inetAddress) throws IOException {
                cVar.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = anonymousClass23;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, anonymousClass23);
        AnonymousClass24 anonymousClass24 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            AnonymousClass24() {
            }

            @Override // com.google.gson.TypeAdapter
            public UUID read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                String strNextString = aVar.nextString();
                try {
                    return UUID.fromString(strNextString);
                } catch (IllegalArgumentException e8) {
                    throw new r("Failed parsing '" + strNextString + "' as UUID; at path " + aVar.getPreviousPath(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, UUID uuid) throws IOException {
                cVar.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = anonymousClass24;
        UUID_FACTORY = newFactory(UUID.class, anonymousClass24);
        TypeAdapter typeAdapterNullSafe6 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            AnonymousClass25() {
            }

            @Override // com.google.gson.TypeAdapter
            public Currency read(D3.a aVar) throws IOException {
                String strNextString = aVar.nextString();
                try {
                    return Currency.getInstance(strNextString);
                } catch (IllegalArgumentException e8) {
                    throw new r("Failed parsing '" + strNextString + "' as Currency; at path " + aVar.getPreviousPath(), e8);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Currency currency) throws IOException {
                cVar.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = typeAdapterNullSafe6;
        CURRENCY_FACTORY = newFactory(Currency.class, typeAdapterNullSafe6);
        AnonymousClass26 anonymousClass26 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            AnonymousClass26() {
            }

            @Override // com.google.gson.TypeAdapter
            public Calendar read(D3.a aVar) throws IOException, NumberFormatException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                aVar.beginObject();
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (aVar.peek() != D3.b.END_OBJECT) {
                    String strNextName = aVar.nextName();
                    int iNextInt = aVar.nextInt();
                    if ("year".equals(strNextName)) {
                        i8 = iNextInt;
                    } else if ("month".equals(strNextName)) {
                        i9 = iNextInt;
                    } else if ("dayOfMonth".equals(strNextName)) {
                        i10 = iNextInt;
                    } else if ("hourOfDay".equals(strNextName)) {
                        i11 = iNextInt;
                    } else if ("minute".equals(strNextName)) {
                        i12 = iNextInt;
                    } else if ("second".equals(strNextName)) {
                        i13 = iNextInt;
                    }
                }
                aVar.endObject();
                return new GregorianCalendar(i8, i9, i10, i11, i12, i13);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    cVar.nullValue();
                    return;
                }
                cVar.beginObject();
                cVar.name("year");
                cVar.value(calendar.get(1));
                cVar.name("month");
                cVar.value(calendar.get(2));
                cVar.name("dayOfMonth");
                cVar.value(calendar.get(5));
                cVar.name("hourOfDay");
                cVar.value(calendar.get(11));
                cVar.name("minute");
                cVar.value(calendar.get(12));
                cVar.name("second");
                cVar.value(calendar.get(13));
                cVar.endObject();
            }
        };
        CALENDAR = anonymousClass26;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, anonymousClass26);
        AnonymousClass27 anonymousClass27 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            AnonymousClass27() {
            }

            @Override // com.google.gson.TypeAdapter
            public Locale read(D3.a aVar) throws IOException {
                if (aVar.peek() == D3.b.NULL) {
                    aVar.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.nextString(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Locale locale) throws IOException {
                cVar.value(locale == null ? null : locale.toString());
            }
        };
        LOCALE = anonymousClass27;
        LOCALE_FACTORY = newFactory(Locale.class, anonymousClass27);
        AnonymousClass28 anonymousClass28 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            AnonymousClass28() {
            }

            private i a(D3.a aVar, D3.b bVar) throws IOException {
                int i8 = f.f26009a[bVar.ordinal()];
                if (i8 == 1) {
                    return new o(new com.google.gson.internal.f(aVar.nextString()));
                }
                if (i8 == 2) {
                    return new o(aVar.nextString());
                }
                if (i8 == 3) {
                    return new o(Boolean.valueOf(aVar.nextBoolean()));
                }
                if (i8 == 6) {
                    aVar.nextNull();
                    return k.INSTANCE;
                }
                throw new IllegalStateException("Unexpected token: " + bVar);
            }

            private i b(D3.a aVar, D3.b bVar) throws IOException {
                int i8 = f.f26009a[bVar.ordinal()];
                if (i8 == 4) {
                    aVar.beginArray();
                    return new com.google.gson.f();
                }
                if (i8 != 5) {
                    return null;
                }
                aVar.beginObject();
                return new l();
            }

            @Override // com.google.gson.TypeAdapter
            public i read(D3.a aVar) throws IOException {
                if (aVar instanceof com.google.gson.internal.bind.b) {
                    return ((com.google.gson.internal.bind.b) aVar).u();
                }
                D3.b bVarPeek = aVar.peek();
                i iVarB = b(aVar, bVarPeek);
                if (iVarB == null) {
                    return a(aVar, bVarPeek);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.hasNext()) {
                        String strNextName = iVarB instanceof l ? aVar.nextName() : null;
                        D3.b bVarPeek2 = aVar.peek();
                        i iVarB2 = b(aVar, bVarPeek2);
                        boolean z8 = iVarB2 != null;
                        if (iVarB2 == null) {
                            iVarB2 = a(aVar, bVarPeek2);
                        }
                        if (iVarB instanceof com.google.gson.f) {
                            ((com.google.gson.f) iVarB).add(iVarB2);
                        } else {
                            ((l) iVarB).add(strNextName, iVarB2);
                        }
                        if (z8) {
                            arrayDeque.addLast(iVarB);
                            iVarB = iVarB2;
                        }
                    } else {
                        if (iVarB instanceof com.google.gson.f) {
                            aVar.endArray();
                        } else {
                            aVar.endObject();
                        }
                        if (arrayDeque.isEmpty()) {
                            return iVarB;
                        }
                        iVarB = (i) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, i iVar) throws IOException {
                if (iVar == null || iVar.isJsonNull()) {
                    cVar.nullValue();
                    return;
                }
                if (iVar.isJsonPrimitive()) {
                    o asJsonPrimitive = iVar.getAsJsonPrimitive();
                    if (asJsonPrimitive.isNumber()) {
                        cVar.value(asJsonPrimitive.getAsNumber());
                        return;
                    } else if (asJsonPrimitive.isBoolean()) {
                        cVar.value(asJsonPrimitive.getAsBoolean());
                        return;
                    } else {
                        cVar.value(asJsonPrimitive.getAsString());
                        return;
                    }
                }
                if (iVar.isJsonArray()) {
                    cVar.beginArray();
                    Iterator<i> it = iVar.getAsJsonArray().iterator();
                    while (it.hasNext()) {
                        write(cVar, it.next());
                    }
                    cVar.endArray();
                    return;
                }
                if (!iVar.isJsonObject()) {
                    throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
                }
                cVar.beginObject();
                for (Map.Entry<String, i> entry : iVar.getAsJsonObject().entrySet()) {
                    cVar.name(entry.getKey());
                    write(cVar, entry.getValue());
                }
                cVar.endObject();
            }
        };
        JSON_ELEMENT = anonymousClass28;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(i.class, anonymousClass28);
        ENUM_FACTORY = new a();
    }

    public static <TT> w newFactory(C3.a aVar, TypeAdapter typeAdapter) {
        return new b(aVar, typeAdapter);
    }

    public static <TT> w newFactoryForMultipleTypes(Class<TT> cls, Class<? extends TT> cls2, TypeAdapter typeAdapter) {
        return new e(cls, cls2, typeAdapter);
    }

    public static <T1> w newTypeHierarchyFactory(Class<T1> cls, TypeAdapter typeAdapter) {
        return new w() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* renamed from: a */
            final /* synthetic */ Class f25990a;

            /* renamed from: b */
            final /* synthetic */ TypeAdapter f25991b;

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$34$1 */
            class AnonymousClass1 extends TypeAdapter {

                /* renamed from: a */
                final /* synthetic */ Class f25992a;

                AnonymousClass1(Class rawType2) {
                    cls = rawType2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v2, types: [T1, java.lang.Object] */
                @Override // com.google.gson.TypeAdapter
                public T1 read(D3.a aVar2) {
                    ?? r02 = typeAdapter.read(aVar2);
                    if (r02 == 0 || cls.isInstance(r02)) {
                        return r02;
                    }
                    throw new r("Expected a " + cls.getName() + " but was " + r02.getClass().getName() + "; at path " + aVar2.getPreviousPath());
                }

                @Override // com.google.gson.TypeAdapter
                public void write(D3.c cVar, T1 t12) {
                    typeAdapter.write(cVar, t12);
                }
            }

            AnonymousClass34(Class cls2, TypeAdapter typeAdapter2) {
                cls = cls2;
                typeAdapter = typeAdapter2;
            }

            @Override // com.google.gson.w
            public <T2> TypeAdapter create(Gson gson, C3.a aVar) {
                Class rawType2 = aVar.getRawType();
                if (cls.isAssignableFrom(rawType2)) {
                    return new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1

                        /* renamed from: a */
                        final /* synthetic */ Class f25992a;

                        AnonymousClass1(Class rawType22) {
                            cls = rawType22;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v2, types: [T1, java.lang.Object] */
                        @Override // com.google.gson.TypeAdapter
                        public T1 read(D3.a aVar2) {
                            ?? r02 = typeAdapter.read(aVar2);
                            if (r02 == 0 || cls.isInstance(r02)) {
                                return r02;
                            }
                            throw new r("Expected a " + cls.getName() + " but was " + r02.getClass().getName() + "; at path " + aVar2.getPreviousPath());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(D3.c cVar, T1 t12) {
                            typeAdapter.write(cVar, t12);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> w newFactory(Class<TT> cls, TypeAdapter typeAdapter) {
        return new c(cls, typeAdapter);
    }

    public static <TT> w newFactory(Class<TT> cls, Class<TT> cls2, TypeAdapter typeAdapter) {
        return new d(cls, cls2, typeAdapter);
    }
}
