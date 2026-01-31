package com.google.protobuf;

import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.C5230m0;
import com.google.protobuf.K0;
import com.google.protobuf.R1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class G1 implements K0 {

    /* renamed from: b */
    private static final G1 f26150b = new G1(new TreeMap());

    /* renamed from: c */
    private static final d f26151c = new d();

    /* renamed from: a */
    private final TreeMap f26152a;

    public static final class b implements K0.a {

        /* renamed from: a */
        private TreeMap f26153a = new TreeMap();

        private b() {
        }

        public static b b() {
            return new b();
        }

        private c.a c(int i8) {
            if (i8 == 0) {
                return null;
            }
            c.a aVar = (c.a) this.f26153a.get(Integer.valueOf(i8));
            if (aVar != null) {
                return aVar;
            }
            c.a aVarNewBuilder = c.newBuilder();
            this.f26153a.put(Integer.valueOf(i8), aVarNewBuilder);
            return aVarNewBuilder;
        }

        public b addField(int i8, c cVar) {
            if (i8 > 0) {
                this.f26153a.put(Integer.valueOf(i8), c.newBuilder(cVar));
                return this;
            }
            throw new IllegalArgumentException(i8 + " is not a valid field number.");
        }

        public Map<Integer, c> asMap() {
            TreeMap treeMap = new TreeMap();
            for (Map.Entry entry : this.f26153a.entrySet()) {
                treeMap.put((Integer) entry.getKey(), ((c.a) entry.getValue()).build());
            }
            return Collections.unmodifiableMap(treeMap);
        }

        public b clearField(int i8) {
            if (i8 > 0) {
                if (this.f26153a.containsKey(Integer.valueOf(i8))) {
                    this.f26153a.remove(Integer.valueOf(i8));
                }
                return this;
            }
            throw new IllegalArgumentException(i8 + " is not a valid field number.");
        }

        public boolean hasField(int i8) {
            return this.f26153a.containsKey(Integer.valueOf(i8));
        }

        @Override // com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.K0.a
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            int i8 = inputStream.read();
            if (i8 == -1) {
                return false;
            }
            mergeFrom((InputStream) new AbstractC5196b.a.C0219a(inputStream, r.readRawVarint32(i8, inputStream)));
            return true;
        }

        public b mergeField(int i8, c cVar) {
            if (i8 > 0) {
                if (hasField(i8)) {
                    c(i8).mergeFrom(cVar);
                } else {
                    addField(i8, cVar);
                }
                return this;
            }
            throw new IllegalArgumentException(i8 + " is not a valid field number.");
        }

        public boolean mergeFieldFrom(int i8, r rVar) throws C5230m0.a {
            int tagFieldNumber = P1.getTagFieldNumber(i8);
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                c(tagFieldNumber).addVarint(rVar.readInt64());
                return true;
            }
            if (tagWireType == 1) {
                c(tagFieldNumber).addFixed64(rVar.readFixed64());
                return true;
            }
            if (tagWireType == 2) {
                c(tagFieldNumber).addLengthDelimited(rVar.readBytes());
                return true;
            }
            if (tagWireType == 3) {
                b bVarNewBuilder = G1.newBuilder();
                rVar.readGroup(tagFieldNumber, bVarNewBuilder, K.getEmptyRegistry());
                c(tagFieldNumber).addGroup(bVarNewBuilder.build());
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C5230m0.d();
            }
            c(tagFieldNumber).addFixed32(rVar.readFixed32());
            return true;
        }

        public b mergeLengthDelimitedField(int i8, AbstractC5235o abstractC5235o) {
            if (i8 > 0) {
                c(i8).addLengthDelimited(abstractC5235o);
                return this;
            }
            throw new IllegalArgumentException(i8 + " is not a valid field number.");
        }

        public b mergeVarintField(int i8, int i9) {
            if (i8 > 0) {
                c(i8).addVarint(i9);
                return this;
            }
            throw new IllegalArgumentException(i8 + " is not a valid field number.");
        }

        @Override // com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public G1 build() {
            if (this.f26153a.isEmpty()) {
                return G1.getDefaultInstance();
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry entry : this.f26153a.entrySet()) {
                treeMap.put((Integer) entry.getKey(), ((c.a) entry.getValue()).build());
            }
            return new G1(treeMap);
        }

        @Override // com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public G1 buildPartial() {
            return build();
        }

        @Override // com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public b clear() {
            this.f26153a = new TreeMap();
            return this;
        }

        @Override // com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public G1 getDefaultInstanceForType() {
            return G1.getDefaultInstance();
        }

        @Override // com.google.protobuf.K0.a, com.google.protobuf.H0.a
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public b m395clone() {
            b bVarNewBuilder = G1.newBuilder();
            for (Map.Entry entry : this.f26153a.entrySet()) {
                bVarNewBuilder.f26153a.put((Integer) entry.getKey(), ((c.a) entry.getValue()).m396clone());
            }
            return bVarNewBuilder;
        }

        @Override // com.google.protobuf.K0.a
        public boolean mergeDelimitedFrom(InputStream inputStream, M m8) {
            return mergeDelimitedFrom(inputStream);
        }

        public b mergeFrom(G1 g12) {
            if (g12 != G1.getDefaultInstance()) {
                for (Map.Entry entry : g12.f26152a.entrySet()) {
                    mergeField(((Integer) entry.getKey()).intValue(), (c) entry.getValue());
                }
            }
            return this;
        }

        @Override // com.google.protobuf.K0.a
        public b mergeFrom(r rVar) {
            int tag;
            do {
                tag = rVar.readTag();
                if (tag == 0) {
                    break;
                }
            } while (mergeFieldFrom(tag, rVar));
            return this;
        }

        @Override // com.google.protobuf.K0.a
        public b mergeFrom(AbstractC5235o abstractC5235o) throws C5230m0 {
            try {
                r rVarNewCodedInput = abstractC5235o.newCodedInput();
                mergeFrom(rVarNewCodedInput);
                rVarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (C5230m0 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e9);
            }
        }

        @Override // com.google.protobuf.K0.a
        public b mergeFrom(byte[] bArr) throws C5230m0 {
            try {
                r rVarNewInstance = r.newInstance(bArr);
                mergeFrom(rVarNewInstance);
                rVarNewInstance.checkLastTagWas(0);
                return this;
            } catch (C5230m0 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e9);
            }
        }

        @Override // com.google.protobuf.K0.a
        public b mergeFrom(InputStream inputStream) {
            r rVarNewInstance = r.newInstance(inputStream);
            mergeFrom(rVarNewInstance);
            rVarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public b mergeFrom(r rVar, M m8) {
            return mergeFrom(rVar);
        }

        @Override // com.google.protobuf.K0.a
        public b mergeFrom(AbstractC5235o abstractC5235o, M m8) {
            return mergeFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.K0.a
        public b mergeFrom(byte[] bArr, int i8, int i9) throws C5230m0 {
            try {
                r rVarNewInstance = r.newInstance(bArr, i8, i9);
                mergeFrom(rVarNewInstance);
                rVarNewInstance.checkLastTagWas(0);
                return this;
            } catch (C5230m0 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e9);
            }
        }

        @Override // com.google.protobuf.K0.a
        public b mergeFrom(byte[] bArr, M m8) {
            return mergeFrom(bArr);
        }

        @Override // com.google.protobuf.K0.a
        public b mergeFrom(byte[] bArr, int i8, int i9, M m8) {
            return mergeFrom(bArr, i8, i9);
        }

        @Override // com.google.protobuf.K0.a
        public b mergeFrom(InputStream inputStream, M m8) {
            return mergeFrom(inputStream);
        }

        @Override // com.google.protobuf.K0.a
        public b mergeFrom(K0 k02) {
            if (k02 instanceof G1) {
                return mergeFrom((G1) k02);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static final class c {

        /* renamed from: f */
        private static final c f26154f = newBuilder().build();

        /* renamed from: a */
        private List f26155a;

        /* renamed from: b */
        private List f26156b;

        /* renamed from: c */
        private List f26157c;

        /* renamed from: d */
        private List f26158d;

        /* renamed from: e */
        private List f26159e;

        public static final class a {

            /* renamed from: a */
            private c f26160a = new c();

            private a() {
            }

            public static a b() {
                return new a();
            }

            public a addFixed32(int i8) {
                if (this.f26160a.f26156b == null) {
                    this.f26160a.f26156b = new ArrayList();
                }
                this.f26160a.f26156b.add(Integer.valueOf(i8));
                return this;
            }

            public a addFixed64(long j8) {
                if (this.f26160a.f26157c == null) {
                    this.f26160a.f26157c = new ArrayList();
                }
                this.f26160a.f26157c.add(Long.valueOf(j8));
                return this;
            }

            public a addGroup(G1 g12) {
                if (this.f26160a.f26159e == null) {
                    this.f26160a.f26159e = new ArrayList();
                }
                this.f26160a.f26159e.add(g12);
                return this;
            }

            public a addLengthDelimited(AbstractC5235o abstractC5235o) {
                if (this.f26160a.f26158d == null) {
                    this.f26160a.f26158d = new ArrayList();
                }
                this.f26160a.f26158d.add(abstractC5235o);
                return this;
            }

            public a addVarint(long j8) {
                if (this.f26160a.f26155a == null) {
                    this.f26160a.f26155a = new ArrayList();
                }
                this.f26160a.f26155a.add(Long.valueOf(j8));
                return this;
            }

            public c build() {
                c cVar = new c();
                if (this.f26160a.f26155a == null) {
                    cVar.f26155a = Collections.emptyList();
                } else {
                    cVar.f26155a = Collections.unmodifiableList(new ArrayList(this.f26160a.f26155a));
                }
                if (this.f26160a.f26156b == null) {
                    cVar.f26156b = Collections.emptyList();
                } else {
                    cVar.f26156b = Collections.unmodifiableList(new ArrayList(this.f26160a.f26156b));
                }
                if (this.f26160a.f26157c == null) {
                    cVar.f26157c = Collections.emptyList();
                } else {
                    cVar.f26157c = Collections.unmodifiableList(new ArrayList(this.f26160a.f26157c));
                }
                if (this.f26160a.f26158d == null) {
                    cVar.f26158d = Collections.emptyList();
                } else {
                    cVar.f26158d = Collections.unmodifiableList(new ArrayList(this.f26160a.f26158d));
                }
                if (this.f26160a.f26159e == null) {
                    cVar.f26159e = Collections.emptyList();
                } else {
                    cVar.f26159e = Collections.unmodifiableList(new ArrayList(this.f26160a.f26159e));
                }
                return cVar;
            }

            public a clear() {
                this.f26160a = new c();
                return this;
            }

            public a mergeFrom(c cVar) {
                if (!cVar.f26155a.isEmpty()) {
                    if (this.f26160a.f26155a == null) {
                        this.f26160a.f26155a = new ArrayList();
                    }
                    this.f26160a.f26155a.addAll(cVar.f26155a);
                }
                if (!cVar.f26156b.isEmpty()) {
                    if (this.f26160a.f26156b == null) {
                        this.f26160a.f26156b = new ArrayList();
                    }
                    this.f26160a.f26156b.addAll(cVar.f26156b);
                }
                if (!cVar.f26157c.isEmpty()) {
                    if (this.f26160a.f26157c == null) {
                        this.f26160a.f26157c = new ArrayList();
                    }
                    this.f26160a.f26157c.addAll(cVar.f26157c);
                }
                if (!cVar.f26158d.isEmpty()) {
                    if (this.f26160a.f26158d == null) {
                        this.f26160a.f26158d = new ArrayList();
                    }
                    this.f26160a.f26158d.addAll(cVar.f26158d);
                }
                if (!cVar.f26159e.isEmpty()) {
                    if (this.f26160a.f26159e == null) {
                        this.f26160a.f26159e = new ArrayList();
                    }
                    this.f26160a.f26159e.addAll(cVar.f26159e);
                }
                return this;
            }

            /* renamed from: clone */
            public a m396clone() {
                c cVar = new c();
                if (this.f26160a.f26155a == null) {
                    cVar.f26155a = null;
                } else {
                    cVar.f26155a = new ArrayList(this.f26160a.f26155a);
                }
                if (this.f26160a.f26156b == null) {
                    cVar.f26156b = null;
                } else {
                    cVar.f26156b = new ArrayList(this.f26160a.f26156b);
                }
                if (this.f26160a.f26157c == null) {
                    cVar.f26157c = null;
                } else {
                    cVar.f26157c = new ArrayList(this.f26160a.f26157c);
                }
                if (this.f26160a.f26158d == null) {
                    cVar.f26158d = null;
                } else {
                    cVar.f26158d = new ArrayList(this.f26160a.f26158d);
                }
                if (this.f26160a.f26159e == null) {
                    cVar.f26159e = null;
                } else {
                    cVar.f26159e = new ArrayList(this.f26160a.f26159e);
                }
                a aVar = new a();
                aVar.f26160a = cVar;
                return aVar;
            }
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        public static c getDefaultInstance() {
            return f26154f;
        }

        private Object[] l() {
            return new Object[]{this.f26155a, this.f26156b, this.f26157c, this.f26158d, this.f26159e};
        }

        public void m(int i8, R1 r12) {
            if (r12.fieldOrder() != R1.a.DESCENDING) {
                Iterator it = this.f26158d.iterator();
                while (it.hasNext()) {
                    r12.writeMessageSetItem(i8, (AbstractC5235o) it.next());
                }
            } else {
                List list = this.f26158d;
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    r12.writeMessageSetItem(i8, listIterator.previous());
                }
            }
        }

        public static a newBuilder() {
            return a.b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return Arrays.equals(l(), ((c) obj).l());
            }
            return false;
        }

        public List<Integer> getFixed32List() {
            return this.f26156b;
        }

        public List<Long> getFixed64List() {
            return this.f26157c;
        }

        public List<G1> getGroupList() {
            return this.f26159e;
        }

        public List<AbstractC5235o> getLengthDelimitedList() {
            return this.f26158d;
        }

        public int getSerializedSize(int i8) {
            Iterator it = this.f26155a.iterator();
            int iComputeGroupSize = 0;
            while (it.hasNext()) {
                iComputeGroupSize += AbstractC5248t.computeUInt64Size(i8, ((Long) it.next()).longValue());
            }
            Iterator it2 = this.f26156b.iterator();
            while (it2.hasNext()) {
                iComputeGroupSize += AbstractC5248t.computeFixed32Size(i8, ((Integer) it2.next()).intValue());
            }
            Iterator it3 = this.f26157c.iterator();
            while (it3.hasNext()) {
                iComputeGroupSize += AbstractC5248t.computeFixed64Size(i8, ((Long) it3.next()).longValue());
            }
            Iterator it4 = this.f26158d.iterator();
            while (it4.hasNext()) {
                iComputeGroupSize += AbstractC5248t.computeBytesSize(i8, (AbstractC5235o) it4.next());
            }
            Iterator it5 = this.f26159e.iterator();
            while (it5.hasNext()) {
                iComputeGroupSize += AbstractC5248t.computeGroupSize(i8, (G1) it5.next());
            }
            return iComputeGroupSize;
        }

        public int getSerializedSizeAsMessageSetExtension(int i8) {
            Iterator it = this.f26158d.iterator();
            int iComputeRawMessageSetExtensionSize = 0;
            while (it.hasNext()) {
                iComputeRawMessageSetExtensionSize += AbstractC5248t.computeRawMessageSetExtensionSize(i8, (AbstractC5235o) it.next());
            }
            return iComputeRawMessageSetExtensionSize;
        }

        public List<Long> getVarintList() {
            return this.f26155a;
        }

        public int hashCode() {
            return Arrays.hashCode(l());
        }

        void n(int i8, R1 r12) {
            r12.writeInt64List(i8, this.f26155a, false);
            r12.writeFixed32List(i8, this.f26156b, false);
            r12.writeFixed64List(i8, this.f26157c, false);
            r12.writeBytesList(i8, this.f26158d);
            if (r12.fieldOrder() == R1.a.ASCENDING) {
                for (int i9 = 0; i9 < this.f26159e.size(); i9++) {
                    r12.writeStartGroup(i8);
                    ((G1) this.f26159e.get(i9)).c(r12);
                    r12.writeEndGroup(i8);
                }
                return;
            }
            for (int size = this.f26159e.size() - 1; size >= 0; size--) {
                r12.writeEndGroup(i8);
                ((G1) this.f26159e.get(size)).c(r12);
                r12.writeStartGroup(i8);
            }
        }

        public AbstractC5235o toByteString(int i8) {
            try {
                AbstractC5235o.h hVarJ = AbstractC5235o.j(getSerializedSize(i8));
                writeTo(i8, hVarJ.getCodedOutput());
                return hVarJ.build();
            } catch (IOException e8) {
                throw new RuntimeException("Serializing to a ByteString should never fail with an IOException", e8);
            }
        }

        public void writeAsMessageSetExtensionTo(int i8, AbstractC5248t abstractC5248t) {
            Iterator it = this.f26158d.iterator();
            while (it.hasNext()) {
                abstractC5248t.writeRawMessageSetExtension(i8, (AbstractC5235o) it.next());
            }
        }

        public void writeTo(int i8, AbstractC5248t abstractC5248t) {
            Iterator it = this.f26155a.iterator();
            while (it.hasNext()) {
                abstractC5248t.writeUInt64(i8, ((Long) it.next()).longValue());
            }
            Iterator it2 = this.f26156b.iterator();
            while (it2.hasNext()) {
                abstractC5248t.writeFixed32(i8, ((Integer) it2.next()).intValue());
            }
            Iterator it3 = this.f26157c.iterator();
            while (it3.hasNext()) {
                abstractC5248t.writeFixed64(i8, ((Long) it3.next()).longValue());
            }
            Iterator it4 = this.f26158d.iterator();
            while (it4.hasNext()) {
                abstractC5248t.writeBytes(i8, (AbstractC5235o) it4.next());
            }
            Iterator it5 = this.f26159e.iterator();
            while (it5.hasNext()) {
                abstractC5248t.writeGroup(i8, (G1) it5.next());
            }
        }

        private c() {
        }

        public static a newBuilder(c cVar) {
            return newBuilder().mergeFrom(cVar);
        }
    }

    public static final class d extends AbstractC5199c {
        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public G1 parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = G1.newBuilder();
            try {
                bVarNewBuilder.mergeFrom(rVar);
                return bVarNewBuilder.buildPartial();
            } catch (C5230m0 e8) {
                throw e8.setUnfinishedMessage(bVarNewBuilder.buildPartial());
            } catch (IOException e9) {
                throw new C5230m0(e9).setUnfinishedMessage(bVarNewBuilder.buildPartial());
            }
        }
    }

    /* synthetic */ G1(TreeMap treeMap, a aVar) {
        this(treeMap);
    }

    public static G1 getDefaultInstance() {
        return f26150b;
    }

    public static b newBuilder() {
        return b.b();
    }

    public static G1 parseFrom(r rVar) {
        return newBuilder().mergeFrom(rVar).build();
    }

    public Map<Integer, c> asMap() {
        return (Map) this.f26152a.clone();
    }

    void b(R1 r12) {
        if (r12.fieldOrder() == R1.a.DESCENDING) {
            for (Map.Entry entry : this.f26152a.descendingMap().entrySet()) {
                ((c) entry.getValue()).m(((Integer) entry.getKey()).intValue(), r12);
            }
            return;
        }
        for (Map.Entry entry2 : this.f26152a.entrySet()) {
            ((c) entry2.getValue()).m(((Integer) entry2.getKey()).intValue(), r12);
        }
    }

    void c(R1 r12) {
        if (r12.fieldOrder() == R1.a.DESCENDING) {
            for (Map.Entry entry : this.f26152a.descendingMap().entrySet()) {
                ((c) entry.getValue()).n(((Integer) entry.getKey()).intValue(), r12);
            }
            return;
        }
        for (Map.Entry entry2 : this.f26152a.entrySet()) {
            ((c) entry2.getValue()).n(((Integer) entry2.getKey()).intValue(), r12);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G1) && this.f26152a.equals(((G1) obj).f26152a);
    }

    public c getField(int i8) {
        c cVar = (c) this.f26152a.get(Integer.valueOf(i8));
        return cVar == null ? c.getDefaultInstance() : cVar;
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int serializedSize = 0;
        if (!this.f26152a.isEmpty()) {
            for (Map.Entry entry : this.f26152a.entrySet()) {
                serializedSize += ((c) entry.getValue()).getSerializedSize(((Integer) entry.getKey()).intValue());
            }
        }
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int serializedSizeAsMessageSetExtension = 0;
        for (Map.Entry entry : this.f26152a.entrySet()) {
            serializedSizeAsMessageSetExtension += ((c) entry.getValue()).getSerializedSizeAsMessageSetExtension(((Integer) entry.getKey()).intValue());
        }
        return serializedSizeAsMessageSetExtension;
    }

    public boolean hasField(int i8) {
        return this.f26152a.containsKey(Integer.valueOf(i8));
    }

    public int hashCode() {
        if (this.f26152a.isEmpty()) {
            return 0;
        }
        return this.f26152a.hashCode();
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.K0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            AbstractC5248t abstractC5248tNewInstance = AbstractC5248t.newInstance(bArr);
            writeTo(abstractC5248tNewInstance);
            abstractC5248tNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e8);
        }
    }

    @Override // com.google.protobuf.K0
    public AbstractC5235o toByteString() {
        try {
            AbstractC5235o.h hVarJ = AbstractC5235o.j(getSerializedSize());
            writeTo(hVarJ.getCodedOutput());
            return hVarJ.build();
        } catch (IOException e8) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e8);
        }
    }

    public String toString() {
        return t1.printer().printToString(this);
    }

    public void writeAsMessageSetTo(AbstractC5248t abstractC5248t) {
        for (Map.Entry entry : this.f26152a.entrySet()) {
            ((c) entry.getValue()).writeAsMessageSetExtensionTo(((Integer) entry.getKey()).intValue(), abstractC5248t);
        }
    }

    @Override // com.google.protobuf.K0
    public void writeDelimitedTo(OutputStream outputStream) {
        AbstractC5248t abstractC5248tNewInstance = AbstractC5248t.newInstance(outputStream);
        abstractC5248tNewInstance.writeUInt32NoTag(getSerializedSize());
        writeTo(abstractC5248tNewInstance);
        abstractC5248tNewInstance.flush();
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        for (Map.Entry entry : this.f26152a.entrySet()) {
            ((c) entry.getValue()).writeTo(((Integer) entry.getKey()).intValue(), abstractC5248t);
        }
    }

    private G1(TreeMap treeMap) {
        this.f26152a = treeMap;
    }

    public static b newBuilder(G1 g12) {
        return newBuilder().mergeFrom(g12);
    }

    public static G1 parseFrom(AbstractC5235o abstractC5235o) {
        return newBuilder().mergeFrom(abstractC5235o).build();
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public G1 getDefaultInstanceForType() {
        return f26150b;
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.H0
    public final d getParserForType() {
        return f26151c;
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    @Override // com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        return newBuilder().mergeFrom(this);
    }

    public static G1 parseFrom(byte[] bArr) {
        return newBuilder().mergeFrom(bArr).build();
    }

    public static G1 parseFrom(InputStream inputStream) {
        return newBuilder().mergeFrom(inputStream).build();
    }

    @Override // com.google.protobuf.K0
    public void writeTo(OutputStream outputStream) {
        AbstractC5248t abstractC5248tNewInstance = AbstractC5248t.newInstance(outputStream);
        writeTo(abstractC5248tNewInstance);
        abstractC5248tNewInstance.flush();
    }
}
