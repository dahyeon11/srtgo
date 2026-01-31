package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5200c0;
import com.google.protobuf.AbstractC5206e0;
import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.C5242q0;
import com.google.protobuf.C5269x;
import com.google.protobuf.E;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.K0;
import com.google.protobuf.O0;
import com.google.protobuf.P1;
import com.google.protobuf.W;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.f0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5209f0 extends AbstractC5193a implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected G1 unknownFields;

    /* renamed from: com.google.protobuf.f0$a */
    class a implements c {

        /* renamed from: a */
        final /* synthetic */ AbstractC5193a.b f26433a;

        a(AbstractC5193a.b bVar) {
            this.f26433a = bVar;
        }

        @Override // com.google.protobuf.AbstractC5209f0.c, com.google.protobuf.AbstractC5193a.b
        public void markDirty() {
            this.f26433a.markDirty();
        }
    }

    /* renamed from: com.google.protobuf.f0$b */
    public static abstract class b extends AbstractC5193a.AbstractC0218a {
        private c builderParent;
        private boolean isClean;
        private com.google.protobuf.f0$b.a meAsParent;
        private Object unknownFieldsOrBuilder;

        /* renamed from: com.google.protobuf.f0$b$a */
        private class a implements c {
            private a() {
            }

            @Override // com.google.protobuf.AbstractC5209f0.c, com.google.protobuf.AbstractC5193a.b
            public void markDirty() {
                b.this.onChanged();
            }

            /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        protected b() {
            this(null);
        }

        public Map c() {
            TreeMap treeMap = new TreeMap();
            List<C5269x.g> fields = internalGetFieldAccessorTable().f26442a.getFields();
            int fieldCount = 0;
            while (fieldCount < fields.size()) {
                C5269x.g oneofFieldDescriptor = fields.get(fieldCount);
                C5269x.l containingOneof = oneofFieldDescriptor.getContainingOneof();
                if (containingOneof != null) {
                    fieldCount += containingOneof.getFieldCount() - 1;
                    if (hasOneof(containingOneof)) {
                        oneofFieldDescriptor = getOneofFieldDescriptor(containingOneof);
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                } else if (oneofFieldDescriptor.isRepeated()) {
                    List list = (List) getField(oneofFieldDescriptor);
                    if (!list.isEmpty()) {
                        treeMap.put(oneofFieldDescriptor, list);
                    }
                } else if (hasField(oneofFieldDescriptor)) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
                fieldCount++;
            }
            return treeMap;
        }

        private b d(G1 g12) {
            this.unknownFieldsOrBuilder = g12;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public abstract /* synthetic */ H0 build();

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public /* bridge */ /* synthetic */ K0 build() {
            return super.build();
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public abstract /* synthetic */ H0 buildPartial();

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public /* bridge */ /* synthetic */ K0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a
        void dispose() {
            this.builderParent = null;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Map<C5269x.g, Object> getAllFields() {
            return Collections.unmodifiableMap(c());
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public abstract /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public /* bridge */ /* synthetic */ K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return internalGetFieldAccessorTable().f26442a;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Object getField(C5269x.g gVar) {
            Object obj = internalGetFieldAccessorTable().d(gVar).get(this);
            return gVar.isRepeated() ? Collections.unmodifiableList((List) obj) : obj;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public H0.a getFieldBuilder(C5269x.g gVar) {
            return internalGetFieldAccessorTable().d(gVar).getBuilder(this);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public C5269x.g getOneofFieldDescriptor(C5269x.l lVar) {
            return internalGetFieldAccessorTable().e(lVar).get(this);
        }

        protected c getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new a(this, null);
            }
            return this.meAsParent;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Object getRepeatedField(C5269x.g gVar, int i8) {
            return internalGetFieldAccessorTable().d(gVar).getRepeated(this, i8);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public H0.a getRepeatedFieldBuilder(C5269x.g gVar, int i8) {
            return internalGetFieldAccessorTable().d(gVar).getRepeatedBuilder(this, i8);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public int getRepeatedFieldCount(C5269x.g gVar) {
            return internalGetFieldAccessorTable().d(gVar).getRepeatedCount(this);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a
        protected G1.b getUnknownFieldSetBuilder() {
            Object obj = this.unknownFieldsOrBuilder;
            if (obj instanceof G1) {
                this.unknownFieldsOrBuilder = ((G1) obj).toBuilder();
            }
            onChanged();
            return (G1.b) this.unknownFieldsOrBuilder;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public final G1 getUnknownFields() {
            Object obj = this.unknownFieldsOrBuilder;
            return obj instanceof G1 ? (G1) obj : ((G1.b) obj).buildPartial();
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public boolean hasField(C5269x.g gVar) {
            return internalGetFieldAccessorTable().d(gVar).has(this);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public boolean hasOneof(C5269x.l lVar) {
            return internalGetFieldAccessorTable().e(lVar).has(this);
        }

        protected abstract g internalGetFieldAccessorTable();

        protected B0 internalGetMapField(int i8) {
            throw new IllegalArgumentException("No map fields found in " + getClass().getName());
        }

        protected B0 internalGetMutableMapField(int i8) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        protected boolean isClean() {
            return this.isClean;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public boolean isInitialized() {
            for (C5269x.g gVar : getDescriptorForType().getFields()) {
                if (gVar.isRequired() && !hasField(gVar)) {
                    return false;
                }
                if (gVar.getJavaType() == C5269x.g.b.MESSAGE) {
                    if (gVar.isRepeated()) {
                        Iterator it = ((List) getField(gVar)).iterator();
                        while (it.hasNext()) {
                            if (!((H0) it.next()).isInitialized()) {
                                return false;
                            }
                        }
                    } else if (hasField(gVar) && !((H0) getField(gVar)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a
        protected void markClean() {
            this.isClean = true;
        }

        protected final void mergeUnknownLengthDelimitedField(int i8, AbstractC5235o abstractC5235o) {
            getUnknownFieldSetBuilder().mergeLengthDelimitedField(i8, abstractC5235o);
        }

        protected final void mergeUnknownVarintField(int i8, int i9) {
            getUnknownFieldSetBuilder().mergeVarintField(i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public H0.a newBuilderForField(C5269x.g gVar) {
            return internalGetFieldAccessorTable().d(gVar).newBuilder();
        }

        protected void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        protected final void onChanged() {
            c cVar;
            if (!this.isClean || (cVar = this.builderParent) == null) {
                return;
            }
            cVar.markDirty();
            this.isClean = false;
        }

        protected boolean parseUnknownField(r rVar, M m8, int i8) {
            return rVar.d() ? rVar.skipField(i8) : getUnknownFieldSetBuilder().mergeFieldFrom(i8, rVar);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a
        protected void setUnknownFieldSetBuilder(G1.b bVar) {
            this.unknownFieldsOrBuilder = bVar;
            onChanged();
        }

        protected b setUnknownFieldsProto3(G1 g12) {
            return d(g12);
        }

        protected b(c cVar) {
            this.unknownFieldsOrBuilder = G1.getDefaultInstance();
            this.builderParent = cVar;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b addRepeatedField(C5269x.g gVar, Object obj) {
            internalGetFieldAccessorTable().d(gVar).addRepeated(this, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b clearField(C5269x.g gVar) {
            internalGetFieldAccessorTable().d(gVar).clear(this);
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b setField(C5269x.g gVar, Object obj) {
            internalGetFieldAccessorTable().d(gVar).set(this, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b setRepeatedField(C5269x.g gVar, int i8, Object obj) {
            internalGetFieldAccessorTable().d(gVar).setRepeated(this, i8, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b setUnknownFields(G1 g12) {
            return d(g12);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b clearOneof(C5269x.l lVar) {
            internalGetFieldAccessorTable().e(lVar).clear(this);
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeUnknownFields(G1 g12) {
            if (G1.getDefaultInstance().equals(g12)) {
                return this;
            }
            if (G1.getDefaultInstance().equals(this.unknownFieldsOrBuilder)) {
                this.unknownFieldsOrBuilder = g12;
                onChanged();
                return this;
            }
            getUnknownFieldSetBuilder().mergeFrom(g12);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public b clear() {
            this.unknownFieldsOrBuilder = G1.getDefaultInstance();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
        /* renamed from: clone */
        public b mo3clone() {
            b bVar = (b) getDefaultInstanceForType().newBuilderForType();
            bVar.mergeFrom(buildPartial());
            return bVar;
        }
    }

    /* renamed from: com.google.protobuf.f0$c */
    public interface c extends AbstractC5193a.b {
        @Override // com.google.protobuf.AbstractC5193a.b
        /* synthetic */ void markDirty();
    }

    /* renamed from: com.google.protobuf.f0$d */
    public static abstract class d extends b implements f {

        /* renamed from: a */
        private W.b f26436a;

        protected d() {
        }

        public W f() {
            W.b bVar = this.f26436a;
            return bVar == null ? W.emptySet() : bVar.buildPartial();
        }

        private void g() {
            if (this.f26436a == null) {
                this.f26436a = W.newBuilder();
            }
        }

        private void j(C5269x.g gVar) {
            if (gVar.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        private void k(I i8) {
            if (i8.getDescriptor().getContainingType() == getDescriptorForType()) {
                return;
            }
            throw new IllegalArgumentException("Extension is for type \"" + i8.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + getDescriptorForType().getFullName() + "\".");
        }

        public final <T> d addExtension(J j8, T t8) {
            I iG = AbstractC5209f0.g(j8);
            k(iG);
            g();
            this.f26436a.addRepeatedField(iG.getDescriptor(), iG.e(t8));
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public abstract /* synthetic */ H0 build();

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public /* bridge */ /* synthetic */ K0 build() {
            return super.build();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public abstract /* synthetic */ H0 buildPartial();

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public /* bridge */ /* synthetic */ K0 buildPartial() {
            return super.buildPartial();
        }

        public final <T> d clearExtension(J j8) {
            I iG = AbstractC5209f0.g(j8);
            k(iG);
            g();
            this.f26436a.clearField(iG.getDescriptor());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Map<C5269x.g, Object> getAllFields() {
            Map mapC = c();
            W.b bVar = this.f26436a;
            if (bVar != null) {
                mapC.putAll(bVar.getAllFields());
            }
            return Collections.unmodifiableMap(mapC);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public abstract /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public /* bridge */ /* synthetic */ K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(J j8) {
            I iG = AbstractC5209f0.g(j8);
            k(iG);
            C5269x.g descriptor = iG.getDescriptor();
            W.b bVar = this.f26436a;
            Object field = bVar == null ? null : bVar.getField(descriptor);
            return field == null ? descriptor.isRepeated() ? (T) Collections.emptyList() : descriptor.getJavaType() == C5269x.g.b.MESSAGE ? (T) iG.getMessageDefaultInstance() : (T) iG.b(descriptor.getDefaultValue()) : (T) iG.b(field);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> int getExtensionCount(J j8) {
            I iG = AbstractC5209f0.g(j8);
            k(iG);
            C5269x.g descriptor = iG.getDescriptor();
            W.b bVar = this.f26436a;
            if (bVar == null) {
                return 0;
            }
            return bVar.getRepeatedFieldCount(descriptor);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Object getField(C5269x.g gVar) {
            if (!gVar.isExtension()) {
                return super.getField(gVar);
            }
            j(gVar);
            W.b bVar = this.f26436a;
            Object field = bVar == null ? null : bVar.getField(gVar);
            return field == null ? gVar.getJavaType() == C5269x.g.b.MESSAGE ? E.getDefaultInstance(gVar.getMessageType()) : gVar.getDefaultValue() : field;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public H0.a getFieldBuilder(C5269x.g gVar) {
            if (!gVar.isExtension()) {
                return super.getFieldBuilder(gVar);
            }
            j(gVar);
            if (gVar.getJavaType() != C5269x.g.b.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            g();
            Object objC = this.f26436a.c(gVar);
            if (objC == null) {
                E.c cVarNewBuilder = E.newBuilder(gVar.getMessageType());
                this.f26436a.setField(gVar, cVarNewBuilder);
                onChanged();
                return cVarNewBuilder;
            }
            if (objC instanceof H0.a) {
                return (H0.a) objC;
            }
            if (!(objC instanceof H0)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            H0.a builder = ((H0) objC).toBuilder();
            this.f26436a.setField(gVar, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Object getRepeatedField(C5269x.g gVar, int i8) {
            if (!gVar.isExtension()) {
                return super.getRepeatedField(gVar, i8);
            }
            j(gVar);
            W.b bVar = this.f26436a;
            if (bVar != null) {
                return bVar.getRepeatedField(gVar, i8);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public H0.a getRepeatedFieldBuilder(C5269x.g gVar, int i8) {
            if (!gVar.isExtension()) {
                return super.getRepeatedFieldBuilder(gVar, i8);
            }
            j(gVar);
            g();
            if (gVar.getJavaType() != C5269x.g.b.MESSAGE) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Object objD = this.f26436a.d(gVar, i8);
            if (objD instanceof H0.a) {
                return (H0.a) objD;
            }
            if (!(objD instanceof H0)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            H0.a builder = ((H0) objD).toBuilder();
            this.f26436a.setRepeatedField(gVar, i8, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public int getRepeatedFieldCount(C5269x.g gVar) {
            if (!gVar.isExtension()) {
                return super.getRepeatedFieldCount(gVar);
            }
            j(gVar);
            W.b bVar = this.f26436a;
            if (bVar == null) {
                return 0;
            }
            return bVar.getRepeatedFieldCount(gVar);
        }

        protected boolean h() {
            W.b bVar = this.f26436a;
            return bVar == null || bVar.isInitialized();
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> boolean hasExtension(J j8) {
            I iG = AbstractC5209f0.g(j8);
            k(iG);
            W.b bVar = this.f26436a;
            return bVar != null && bVar.hasField(iG.getDescriptor());
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public boolean hasField(C5269x.g gVar) {
            if (!gVar.isExtension()) {
                return super.hasField(gVar);
            }
            j(gVar);
            W.b bVar = this.f26436a;
            return bVar != null && bVar.hasField(gVar);
        }

        protected final void i(e eVar) {
            if (eVar.f26437a != null) {
                g();
                this.f26436a.mergeFrom(eVar.f26437a);
                onChanged();
            }
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public boolean isInitialized() {
            return super.isInitialized() && h();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public H0.a newBuilderForField(C5269x.g gVar) {
            return gVar.isExtension() ? E.newBuilder(gVar.getMessageType()) : super.newBuilderForField(gVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected boolean parseUnknownField(r rVar, M m8, int i8) {
            g();
            return O0.g(rVar, rVar.d() ? null : getUnknownFieldSetBuilder(), m8, getDescriptorForType(), new O0.d(this.f26436a), i8);
        }

        public final <T> d setExtension(J j8, T t8) {
            I iG = AbstractC5209f0.g(j8);
            k(iG);
            g();
            this.f26436a.setField(iG.getDescriptor(), iG.f(t8));
            onChanged();
            return this;
        }

        protected d(c cVar) {
            super(cVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public d addRepeatedField(C5269x.g gVar, Object obj) {
            if (gVar.isExtension()) {
                j(gVar);
                g();
                this.f26436a.addRepeatedField(gVar, obj);
                onChanged();
                return this;
            }
            return (d) super.addRepeatedField(gVar, obj);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public d clearField(C5269x.g gVar) {
            if (gVar.isExtension()) {
                j(gVar);
                g();
                this.f26436a.clearField(gVar);
                onChanged();
                return this;
            }
            return (d) super.clearField(gVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public d setField(C5269x.g gVar, Object obj) {
            if (gVar.isExtension()) {
                j(gVar);
                g();
                this.f26436a.setField(gVar, obj);
                onChanged();
                return this;
            }
            return (d) super.setField(gVar, obj);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public d setRepeatedField(C5269x.g gVar, int i8, Object obj) {
            if (gVar.isExtension()) {
                j(gVar);
                g();
                this.f26436a.setRepeatedField(gVar, i8, obj);
                onChanged();
                return this;
            }
            return (d) super.setRepeatedField(gVar, i8, obj);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> boolean hasExtension(I i8) {
            return hasExtension((J) i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public d clear() {
            this.f26436a = null;
            return (d) super.clear();
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> int getExtensionCount(I i8) {
            return getExtensionCount((J) i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> boolean hasExtension(AbstractC5200c0.g gVar) {
            return hasExtension((J) gVar);
        }

        public final <T> d clearExtension(I i8) {
            return clearExtension((J) i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> int getExtensionCount(AbstractC5200c0.g gVar) {
            return getExtensionCount((J) gVar);
        }

        public final <T> d addExtension(I i8, T t8) {
            return addExtension((J) i8, (I) t8);
        }

        public <T> d clearExtension(AbstractC5200c0.g gVar) {
            return clearExtension((J) gVar);
        }

        public final <T> d setExtension(J j8, int i8, T t8) {
            I iG = AbstractC5209f0.g(j8);
            k(iG);
            g();
            this.f26436a.setRepeatedField(iG.getDescriptor(), i8, iG.e(t8));
            onChanged();
            return this;
        }

        public <T> d addExtension(AbstractC5200c0.g gVar, T t8) {
            return addExtension((J) gVar, (AbstractC5200c0.g) t8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(J j8, int i8) {
            I iG = AbstractC5209f0.g(j8);
            k(iG);
            C5269x.g descriptor = iG.getDescriptor();
            W.b bVar = this.f26436a;
            if (bVar != null) {
                return (T) iG.d(bVar.getRepeatedField(descriptor, i8));
            }
            throw new IndexOutOfBoundsException();
        }

        public final <T> d setExtension(I i8, T t8) {
            return setExtension((J) i8, (I) t8);
        }

        public <T> d setExtension(AbstractC5200c0.g gVar, T t8) {
            return setExtension((J) gVar, (AbstractC5200c0.g) t8);
        }

        public final <T> d setExtension(I i8, int i9, T t8) {
            return setExtension((J) i8, i9, (int) t8);
        }

        public <T> d setExtension(AbstractC5200c0.g gVar, int i8, T t8) {
            return setExtension((J) gVar, i8, (int) t8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(I i8) {
            return (T) getExtension((J) i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(AbstractC5200c0.g gVar) {
            return (T) getExtension((J) gVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(I i8, int i9) {
            return (T) getExtension((J) i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(AbstractC5200c0.g gVar, int i8) {
            return (T) getExtension((J) gVar, i8);
        }
    }

    /* renamed from: com.google.protobuf.f0$f */
    public interface f extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        <T> T getExtension(I i8);

        <T> T getExtension(I i8, int i9);

        <T> T getExtension(J j8);

        <T> T getExtension(J j8, int i8);

        <T> T getExtension(AbstractC5200c0.g gVar);

        <T> T getExtension(AbstractC5200c0.g gVar, int i8);

        <T> int getExtensionCount(I i8);

        <T> int getExtensionCount(J j8);

        <T> int getExtensionCount(AbstractC5200c0.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        <T> boolean hasExtension(I i8);

        <T> boolean hasExtension(J j8);

        <T> boolean hasExtension(AbstractC5200c0.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.google.protobuf.f0$h */
    public static final class h {

        /* renamed from: a */
        static final h f26499a = new h();

        private h() {
        }
    }

    protected AbstractC5209f0() {
        this.unknownFields = G1.getDefaultInstance();
    }

    protected static boolean canUseUnsafe() {
        return L1.K() && L1.L();
    }

    protected static int computeStringSize(int i8, Object obj) {
        return obj instanceof String ? AbstractC5248t.computeStringSize(i8, (String) obj) : AbstractC5248t.computeBytesSize(i8, (AbstractC5235o) obj);
    }

    protected static int computeStringSizeNoTag(Object obj) {
        return obj instanceof String ? AbstractC5248t.computeStringSizeNoTag((String) obj) : AbstractC5248t.computeBytesSizeNoTag((AbstractC5235o) obj);
    }

    protected static AbstractC5227l0.a emptyBooleanList() {
        return C5229m.emptyList();
    }

    protected static AbstractC5227l0.b emptyDoubleList() {
        return C5271y.emptyList();
    }

    protected static AbstractC5227l0.f emptyFloatList() {
        return Y.emptyList();
    }

    protected static AbstractC5227l0.g emptyIntList() {
        return C5224k0.emptyList();
    }

    protected static AbstractC5227l0.h emptyLongList() {
        return C5270x0.emptyList();
    }

    static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    public static I g(J j8) {
        if (j8.a()) {
            throw new IllegalArgumentException("Expected non-lite extension.");
        }
        return (I) j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map h(boolean r7) {
        /*
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            com.google.protobuf.f0$g r1 = r6.internalGetFieldAccessorTable()
            com.google.protobuf.x$b r1 = com.google.protobuf.AbstractC5209f0.g.a(r1)
            java.util.List r1 = r1.getFields()
            r2 = 0
        L12:
            int r3 = r1.size()
            if (r2 >= r3) goto L70
            java.lang.Object r3 = r1.get(r2)
            com.google.protobuf.x$g r3 = (com.google.protobuf.C5269x.g) r3
            com.google.protobuf.x$l r4 = r3.getContainingOneof()
            if (r4 == 0) goto L37
            int r3 = r4.getFieldCount()
            int r3 = r3 + (-1)
            int r2 = r2 + r3
            boolean r3 = r6.hasOneof(r4)
            if (r3 != 0) goto L32
            goto L6d
        L32:
            com.google.protobuf.x$g r3 = r6.getOneofFieldDescriptor(r4)
            goto L54
        L37:
            boolean r4 = r3.isRepeated()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r6.getField(r3)
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L6d
            r0.put(r3, r4)
            goto L6d
        L4d:
            boolean r4 = r6.hasField(r3)
            if (r4 != 0) goto L54
            goto L6d
        L54:
            if (r7 == 0) goto L66
            com.google.protobuf.x$g$b r4 = r3.getJavaType()
            com.google.protobuf.x$g$b r5 = com.google.protobuf.C5269x.g.b.STRING
            if (r4 != r5) goto L66
            java.lang.Object r4 = r6.getFieldRaw(r3)
            r0.put(r3, r4)
            goto L6d
        L66:
            java.lang.Object r4 = r6.getField(r3)
            r0.put(r3, r4)
        L6d:
            int r2 = r2 + 1
            goto L12
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC5209f0.h(boolean):java.util.Map");
    }

    public static Method i(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e8) {
            throw new IllegalStateException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e8);
        }
    }

    protected static boolean isStringEmpty(Object obj) {
        return obj instanceof String ? ((String) obj).isEmpty() : ((AbstractC5235o) obj).isEmpty();
    }

    public static Object j(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new IllegalStateException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new IllegalStateException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    private static void k(AbstractC5248t abstractC5248t, Map map, C5274z0 c5274z0, int i8, boolean z8) {
        if (map.containsKey(Boolean.valueOf(z8))) {
            abstractC5248t.writeMessage(i8, c5274z0.newBuilderForType().setKey(Boolean.valueOf(z8)).setValue(map.get(Boolean.valueOf(z8))).build());
        }
    }

    private static void l(AbstractC5248t abstractC5248t, Map map, C5274z0 c5274z0, int i8) {
        for (Map.Entry entry : map.entrySet()) {
            abstractC5248t.writeMessage(i8, c5274z0.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
    }

    protected static <ListT extends AbstractC5227l0.i> ListT makeMutableCopy(ListT listt) {
        int size = listt.size();
        return (ListT) listt.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static AbstractC5227l0.g mutableCopy(AbstractC5227l0.g gVar) {
        return (AbstractC5227l0.g) makeMutableCopy(gVar);
    }

    protected static AbstractC5227l0.a newBooleanList() {
        return new C5229m();
    }

    protected static AbstractC5227l0.b newDoubleList() {
        return new C5271y();
    }

    protected static AbstractC5227l0.f newFloatList() {
        return new Y();
    }

    protected static AbstractC5227l0.g newIntList() {
        return new C5224k0();
    }

    protected static AbstractC5227l0.h newLongList() {
        return new C5270x0();
    }

    protected static <M extends H0> M parseDelimitedWithIOException(Z0 z02, InputStream inputStream) throws IOException {
        try {
            return (M) z02.parseDelimitedFrom(inputStream);
        } catch (C5230m0 e8) {
            throw e8.unwrapIOException();
        }
    }

    protected static <M extends H0> M parseWithIOException(Z0 z02, InputStream inputStream) throws IOException {
        try {
            return (M) z02.parseFrom(inputStream);
        } catch (C5230m0 e8) {
            throw e8.unwrapIOException();
        }
    }

    protected static <V> void serializeBooleanMapTo(AbstractC5248t abstractC5248t, B0 b02, C5274z0 c5274z0, int i8) {
        Map<Object, Object> map = b02.getMap();
        if (!abstractC5248t.i()) {
            l(abstractC5248t, map, c5274z0, i8);
        } else {
            k(abstractC5248t, map, c5274z0, i8, false);
            k(abstractC5248t, map, c5274z0, i8, true);
        }
    }

    protected static <V> void serializeIntegerMapTo(AbstractC5248t abstractC5248t, B0 b02, C5274z0 c5274z0, int i8) {
        Map<Object, Object> map = b02.getMap();
        if (!abstractC5248t.i()) {
            l(abstractC5248t, map, c5274z0, i8);
            return;
        }
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Object> it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((Integer) it.next()).intValue();
            i9++;
        }
        Arrays.sort(iArr);
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = iArr[i10];
            abstractC5248t.writeMessage(i8, c5274z0.newBuilderForType().setKey(Integer.valueOf(i11)).setValue(map.get(Integer.valueOf(i11))).build());
        }
    }

    protected static <V> void serializeLongMapTo(AbstractC5248t abstractC5248t, B0 b02, C5274z0 c5274z0, int i8) {
        Map<Object, Object> map = b02.getMap();
        if (!abstractC5248t.i()) {
            l(abstractC5248t, map, c5274z0, i8);
            return;
        }
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Object> it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            jArr[i9] = ((Long) it.next()).longValue();
            i9++;
        }
        Arrays.sort(jArr);
        for (int i10 = 0; i10 < size; i10++) {
            long j8 = jArr[i10];
            abstractC5248t.writeMessage(i8, c5274z0.newBuilderForType().setKey(Long.valueOf(j8)).setValue(map.get(Long.valueOf(j8))).build());
        }
    }

    protected static <V> void serializeStringMapTo(AbstractC5248t abstractC5248t, B0 b02, C5274z0 c5274z0, int i8) {
        Map<Object, Object> map = b02.getMap();
        if (!abstractC5248t.i()) {
            l(abstractC5248t, map, c5274z0, i8);
            return;
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            abstractC5248t.writeMessage(i8, c5274z0.newBuilderForType().setKey(str).setValue(map.get(str)).build());
        }
    }

    static void setAlwaysUseFieldBuildersForTesting(boolean z8) {
        alwaysUseFieldBuilders = z8;
    }

    protected static void writeString(AbstractC5248t abstractC5248t, int i8, Object obj) {
        if (obj instanceof String) {
            abstractC5248t.writeString(i8, (String) obj);
        } else {
            abstractC5248t.writeBytes(i8, (AbstractC5235o) obj);
        }
    }

    protected static void writeStringNoTag(AbstractC5248t abstractC5248t, Object obj) {
        if (obj instanceof String) {
            abstractC5248t.writeStringNoTag((String) obj);
        } else {
            abstractC5248t.writeBytesNoTag((AbstractC5235o) obj);
        }
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public Map<C5269x.g, Object> getAllFields() {
        return Collections.unmodifiableMap(h(false));
    }

    Map<C5269x.g, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(h(true));
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public abstract /* synthetic */ H0 getDefaultInstanceForType();

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public /* bridge */ /* synthetic */ K0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5269x.b getDescriptorForType() {
        return internalGetFieldAccessorTable().f26442a;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public Object getField(C5269x.g gVar) {
        return internalGetFieldAccessorTable().d(gVar).get(this);
    }

    Object getFieldRaw(C5269x.g gVar) {
        return internalGetFieldAccessorTable().d(gVar).getRaw(this);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public C5269x.g getOneofFieldDescriptor(C5269x.l lVar) {
        return internalGetFieldAccessorTable().e(lVar).get(this);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public Object getRepeatedField(C5269x.g gVar, int i8) {
        return internalGetFieldAccessorTable().d(gVar).getRepeated(this, i8);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public int getRepeatedFieldCount(C5269x.g gVar) {
        return internalGetFieldAccessorTable().d(gVar).getRepeatedCount(this);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iE = O0.e(this, getAllFieldsRaw());
        this.memoizedSize = iE;
        return iE;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public G1 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public boolean hasField(C5269x.g gVar) {
        return internalGetFieldAccessorTable().d(gVar).has(this);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public boolean hasOneof(C5269x.l lVar) {
        return internalGetFieldAccessorTable().e(lVar).has(this);
    }

    protected abstract g internalGetFieldAccessorTable();

    protected B0 internalGetMapField(int i8) {
        throw new IllegalArgumentException("No map fields found in " + getClass().getName());
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public boolean isInitialized() {
        for (C5269x.g gVar : getDescriptorForType().getFields()) {
            if (gVar.isRequired() && !hasField(gVar)) {
                return false;
            }
            if (gVar.getJavaType() == C5269x.g.b.MESSAGE) {
                if (gVar.isRepeated()) {
                    Iterator it = ((List) getField(gVar)).iterator();
                    while (it.hasNext()) {
                        if (!((H0) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(gVar) && !((H0) getField(gVar)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    protected void makeExtensionsImmutable() {
    }

    @Deprecated
    protected void mergeFromAndMakeImmutableInternal(r rVar, M m8) throws C5230m0 {
        InterfaceC5219i1 interfaceC5219i1SchemaFor = C5201c1.getInstance().schemaFor((C5201c1) this);
        try {
            interfaceC5219i1SchemaFor.mergeFrom(this, C5246s.forCodedInput(rVar), m8);
            interfaceC5219i1SchemaFor.makeImmutable(this);
        } catch (C5230m0 e8) {
            throw e8.setUnfinishedMessage(this);
        } catch (IOException e9) {
            throw new C5230m0(e9).setUnfinishedMessage(this);
        }
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public abstract /* synthetic */ H0.a newBuilderForType();

    protected abstract H0.a newBuilderForType(c cVar);

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public /* bridge */ /* synthetic */ K0.a newBuilderForType() {
        return super.newBuilderForType();
    }

    protected abstract Object newInstance(h hVar);

    protected boolean parseUnknownField(r rVar, G1.b bVar, M m8, int i8) {
        return rVar.d() ? rVar.skipField(i8) : bVar.mergeFieldFrom(i8, rVar);
    }

    protected boolean parseUnknownFieldProto3(r rVar, G1.b bVar, M m8, int i8) {
        return parseUnknownField(rVar, bVar, m8, i8);
    }

    void setUnknownFields(G1 g12) {
        this.unknownFields = g12;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public abstract /* synthetic */ H0.a toBuilder();

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public /* bridge */ /* synthetic */ K0.a toBuilder() {
        return super.toBuilder();
    }

    protected Object writeReplace() {
        return new AbstractC5206e0.g(this);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        O0.l(this, getAllFieldsRaw(), abstractC5248t, false);
    }

    /* renamed from: com.google.protobuf.f0$e */
    public static abstract class e extends AbstractC5209f0 implements f {

        /* renamed from: a */
        private final W f26437a;

        /* renamed from: com.google.protobuf.f0$e$a */
        protected class a {

            /* renamed from: a */
            private final Iterator f26438a;

            /* renamed from: b */
            private Map.Entry f26439b;

            /* renamed from: c */
            private final boolean f26440c;

            /* synthetic */ a(e eVar, boolean z8, a aVar) {
                this(z8);
            }

            public void writeUntil(int i8, AbstractC5248t abstractC5248t) {
                while (true) {
                    Map.Entry entry = this.f26439b;
                    if (entry == null || ((C5269x.g) entry.getKey()).getNumber() >= i8) {
                        return;
                    }
                    C5269x.g gVar = (C5269x.g) this.f26439b.getKey();
                    if (!this.f26440c || gVar.getLiteJavaType() != P1.c.MESSAGE || gVar.isRepeated()) {
                        W.writeField(gVar, this.f26439b.getValue(), abstractC5248t);
                    } else if (this.f26439b instanceof C5242q0.b) {
                        abstractC5248t.writeRawMessageSetExtension(gVar.getNumber(), ((C5242q0.b) this.f26439b).getField().toByteString());
                    } else {
                        abstractC5248t.writeMessageSetExtension(gVar.getNumber(), (H0) this.f26439b.getValue());
                    }
                    if (this.f26438a.hasNext()) {
                        this.f26439b = (Map.Entry) this.f26438a.next();
                    } else {
                        this.f26439b = null;
                    }
                }
            }

            private a(boolean z8) {
                Iterator<Map.Entry<W.c, Object>> it = e.this.f26437a.iterator();
                this.f26438a = it;
                if (it.hasNext()) {
                    this.f26439b = it.next();
                }
                this.f26440c = z8;
            }
        }

        protected e() {
            this.f26437a = W.newFieldSet();
        }

        private void r(C5269x.g gVar) {
            if (gVar.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        private void s(I i8) {
            if (i8.getDescriptor().getContainingType() == getDescriptorForType()) {
                return;
            }
            throw new IllegalArgumentException("Extension is for type \"" + i8.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + getDescriptorForType().getFullName() + "\".");
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
        public Map<C5269x.g, Object> getAllFields() {
            Map mapH = h(false);
            mapH.putAll(p());
            return Collections.unmodifiableMap(mapH);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Map<C5269x.g, Object> getAllFieldsRaw() {
            Map mapH = h(false);
            mapH.putAll(p());
            return Collections.unmodifiableMap(mapH);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public abstract /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public /* bridge */ /* synthetic */ K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(J j8) {
            I iG = AbstractC5209f0.g(j8);
            s(iG);
            C5269x.g descriptor = iG.getDescriptor();
            Object field = this.f26437a.getField(descriptor);
            return field == null ? descriptor.isRepeated() ? (T) Collections.emptyList() : descriptor.getJavaType() == C5269x.g.b.MESSAGE ? (T) iG.getMessageDefaultInstance() : (T) iG.b(descriptor.getDefaultValue()) : (T) iG.b(field);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> int getExtensionCount(J j8) {
            I iG = AbstractC5209f0.g(j8);
            s(iG);
            return this.f26437a.getRepeatedFieldCount(iG.getDescriptor());
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
        public Object getField(C5269x.g gVar) {
            if (!gVar.isExtension()) {
                return super.getField(gVar);
            }
            r(gVar);
            Object field = this.f26437a.getField(gVar);
            return field == null ? gVar.isRepeated() ? Collections.emptyList() : gVar.getJavaType() == C5269x.g.b.MESSAGE ? E.getDefaultInstance(gVar.getMessageType()) : gVar.getDefaultValue() : field;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
        public Object getRepeatedField(C5269x.g gVar, int i8) {
            if (!gVar.isExtension()) {
                return super.getRepeatedField(gVar, i8);
            }
            r(gVar);
            return this.f26437a.getRepeatedField(gVar, i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
        public int getRepeatedFieldCount(C5269x.g gVar) {
            if (!gVar.isExtension()) {
                return super.getRepeatedFieldCount(gVar);
            }
            r(gVar);
            return this.f26437a.getRepeatedFieldCount(gVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> boolean hasExtension(J j8) {
            I iG = AbstractC5209f0.g(j8);
            s(iG);
            return this.f26437a.hasField(iG.getDescriptor());
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
        public boolean hasField(C5269x.g gVar) {
            if (!gVar.isExtension()) {
                return super.hasField(gVar);
            }
            r(gVar);
            return this.f26437a.hasField(gVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public boolean isInitialized() {
            return super.isInitialized() && n();
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected void makeExtensionsImmutable() {
            this.f26437a.makeImmutable();
        }

        protected boolean n() {
            return this.f26437a.isInitialized();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public abstract /* synthetic */ H0.a newBuilderForType();

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public /* bridge */ /* synthetic */ K0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        protected int o() {
            return this.f26437a.getSerializedSize();
        }

        protected Map p() {
            return this.f26437a.getAllFields();
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected boolean parseUnknownField(r rVar, G1.b bVar, M m8, int i8) {
            if (rVar.d()) {
                bVar = null;
            }
            return O0.g(rVar, bVar, m8, getDescriptorForType(), new O0.c(this.f26437a), i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected boolean parseUnknownFieldProto3(r rVar, G1.b bVar, M m8, int i8) {
            return parseUnknownField(rVar, bVar, m8, i8);
        }

        protected a q() {
            return new a(this, false, null);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public abstract /* synthetic */ H0.a toBuilder();

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public /* bridge */ /* synthetic */ K0.a toBuilder() {
            return super.toBuilder();
        }

        protected e(d dVar) {
            super(dVar);
            this.f26437a = dVar.f();
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> boolean hasExtension(I i8) {
            return hasExtension((J) i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> int getExtensionCount(I i8) {
            return getExtensionCount((J) i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> boolean hasExtension(AbstractC5200c0.g gVar) {
            return hasExtension((J) gVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> int getExtensionCount(AbstractC5200c0.g gVar) {
            return getExtensionCount((J) gVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(J j8, int i8) {
            I iG = AbstractC5209f0.g(j8);
            s(iG);
            return (T) iG.d(this.f26437a.getRepeatedField(iG.getDescriptor(), i8));
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(I i8) {
            return (T) getExtension((J) i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(AbstractC5200c0.g gVar) {
            return (T) getExtension((J) gVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(I i8, int i9) {
            return (T) getExtension((J) i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5209f0.f
        public final <T> T getExtension(AbstractC5200c0.g gVar, int i8) {
            return (T) getExtension((J) gVar, i8);
        }
    }

    /* renamed from: com.google.protobuf.f0$g */
    public static final class g {

        /* renamed from: a */
        private final C5269x.b f26442a;

        /* renamed from: b */
        private final a[] f26443b;

        /* renamed from: c */
        private String[] f26444c;

        /* renamed from: d */
        private final c[] f26445d;

        /* renamed from: e */
        private volatile boolean f26446e;

        /* renamed from: com.google.protobuf.f0$g$a */
        private interface a {
            void addRepeated(b bVar, Object obj);

            void clear(b bVar);

            Object get(b bVar);

            Object get(AbstractC5209f0 abstractC5209f0);

            H0.a getBuilder(b bVar);

            Object getRaw(AbstractC5209f0 abstractC5209f0);

            Object getRepeated(b bVar, int i8);

            Object getRepeated(AbstractC5209f0 abstractC5209f0, int i8);

            H0.a getRepeatedBuilder(b bVar, int i8);

            int getRepeatedCount(b bVar);

            int getRepeatedCount(AbstractC5209f0 abstractC5209f0);

            boolean has(b bVar);

            boolean has(AbstractC5209f0 abstractC5209f0);

            H0.a newBuilder();

            void set(b bVar, Object obj);

            void setRepeated(b bVar, int i8, Object obj);
        }

        /* renamed from: com.google.protobuf.f0$g$b */
        private static class b implements a {

            /* renamed from: a */
            private final C5269x.g f26447a;

            /* renamed from: b */
            private final H0 f26448b;

            b(C5269x.g gVar, Class cls) {
                this.f26447a = gVar;
                this.f26448b = c((AbstractC5209f0) AbstractC5209f0.j(AbstractC5209f0.i(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).f();
            }

            private H0 a(H0 h02) {
                if (h02 == null) {
                    return null;
                }
                return this.f26448b.getClass().isInstance(h02) ? h02 : this.f26448b.toBuilder().mergeFrom(h02).build();
            }

            private B0 b(b bVar) {
                return bVar.internalGetMapField(this.f26447a.getNumber());
            }

            private B0 c(AbstractC5209f0 abstractC5209f0) {
                return abstractC5209f0.internalGetMapField(this.f26447a.getNumber());
            }

            private B0 d(b bVar) {
                return bVar.internalGetMutableMapField(this.f26447a.getNumber());
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void addRepeated(b bVar, Object obj) {
                d(bVar).g().add(a((H0) obj));
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void clear(b bVar) {
                d(bVar).g().clear();
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object get(AbstractC5209f0 abstractC5209f0) {
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < getRepeatedCount(abstractC5209f0); i8++) {
                    arrayList.add(getRepeated(abstractC5209f0, i8));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public H0.a getBuilder(b bVar) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object getRaw(AbstractC5209f0 abstractC5209f0) {
                return get(abstractC5209f0);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object getRepeated(AbstractC5209f0 abstractC5209f0, int i8) {
                return c(abstractC5209f0).e().get(i8);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public H0.a getRepeatedBuilder(b bVar, int i8) {
                throw new UnsupportedOperationException("Map fields cannot be repeated");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public int getRepeatedCount(AbstractC5209f0 abstractC5209f0) {
                return c(abstractC5209f0).e().size();
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public boolean has(AbstractC5209f0 abstractC5209f0) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public H0.a newBuilder() {
                return this.f26448b.newBuilderForType();
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void set(b bVar, Object obj) {
                clear(bVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    addRepeated(bVar, it.next());
                }
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void setRepeated(b bVar, int i8, Object obj) {
                d(bVar).g().set(i8, a((H0) obj));
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object getRepeated(b bVar, int i8) {
                return b(bVar).e().get(i8);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public int getRepeatedCount(b bVar) {
                return b(bVar).e().size();
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public boolean has(b bVar) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object get(b bVar) {
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < getRepeatedCount(bVar); i8++) {
                    arrayList.add(getRepeated(bVar, i8));
                }
                return Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: com.google.protobuf.f0$g$e */
        private static class e implements a {

            /* renamed from: a */
            protected final Class f26462a;

            /* renamed from: b */
            protected final a f26463b;

            /* renamed from: com.google.protobuf.f0$g$e$a */
            interface a {
                void addRepeated(b bVar, Object obj);

                void clear(b bVar);

                Object get(b bVar);

                Object get(AbstractC5209f0 abstractC5209f0);

                Object getRepeated(b bVar, int i8);

                Object getRepeated(AbstractC5209f0 abstractC5209f0, int i8);

                int getRepeatedCount(b bVar);

                int getRepeatedCount(AbstractC5209f0 abstractC5209f0);

                void setRepeated(b bVar, int i8, Object obj);
            }

            /* renamed from: com.google.protobuf.f0$g$e$b */
            private static final class b implements a {

                /* renamed from: a */
                private final Method f26464a;

                /* renamed from: b */
                private final Method f26465b;

                /* renamed from: c */
                private final Method f26466c;

                /* renamed from: d */
                private final Method f26467d;

                /* renamed from: e */
                private final Method f26468e;

                /* renamed from: f */
                private final Method f26469f;

                /* renamed from: g */
                private final Method f26470g;

                /* renamed from: h */
                private final Method f26471h;

                /* renamed from: i */
                private final Method f26472i;

                b(C5269x.g gVar, String str, Class cls, Class cls2) {
                    this.f26464a = AbstractC5209f0.i(cls, "get" + str + "List", new Class[0]);
                    this.f26465b = AbstractC5209f0.i(cls2, "get" + str + "List", new Class[0]);
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    sb.append(str);
                    String string = sb.toString();
                    Class cls3 = Integer.TYPE;
                    Method methodI = AbstractC5209f0.i(cls, string, cls3);
                    this.f26466c = methodI;
                    this.f26467d = AbstractC5209f0.i(cls2, "get" + str, cls3);
                    Class<?> returnType = methodI.getReturnType();
                    this.f26468e = AbstractC5209f0.i(cls2, "set" + str, cls3, returnType);
                    this.f26469f = AbstractC5209f0.i(cls2, "add" + str, returnType);
                    this.f26470g = AbstractC5209f0.i(cls, "get" + str + "Count", new Class[0]);
                    this.f26471h = AbstractC5209f0.i(cls2, "get" + str + "Count", new Class[0]);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("clear");
                    sb2.append(str);
                    this.f26472i = AbstractC5209f0.i(cls2, sb2.toString(), new Class[0]);
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.e.a
                public void addRepeated(b bVar, Object obj) {
                    AbstractC5209f0.j(this.f26469f, bVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.e.a
                public void clear(b bVar) {
                    AbstractC5209f0.j(this.f26472i, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.e.a
                public Object get(AbstractC5209f0 abstractC5209f0) {
                    return AbstractC5209f0.j(this.f26464a, abstractC5209f0, new Object[0]);
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.e.a
                public Object getRepeated(AbstractC5209f0 abstractC5209f0, int i8) {
                    return AbstractC5209f0.j(this.f26466c, abstractC5209f0, Integer.valueOf(i8));
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.e.a
                public int getRepeatedCount(AbstractC5209f0 abstractC5209f0) {
                    return ((Integer) AbstractC5209f0.j(this.f26470g, abstractC5209f0, new Object[0])).intValue();
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.e.a
                public void setRepeated(b bVar, int i8, Object obj) {
                    AbstractC5209f0.j(this.f26468e, bVar, Integer.valueOf(i8), obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.e.a
                public Object get(b bVar) {
                    return AbstractC5209f0.j(this.f26465b, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.e.a
                public Object getRepeated(b bVar, int i8) {
                    return AbstractC5209f0.j(this.f26467d, bVar, Integer.valueOf(i8));
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.e.a
                public int getRepeatedCount(b bVar) {
                    return ((Integer) AbstractC5209f0.j(this.f26471h, bVar, new Object[0])).intValue();
                }
            }

            e(C5269x.g gVar, String str, Class cls, Class cls2) {
                b bVar = new b(gVar, str, cls, cls2);
                this.f26462a = bVar.f26466c.getReturnType();
                this.f26463b = a(bVar);
            }

            static a a(b bVar) {
                return bVar;
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void addRepeated(b bVar, Object obj) {
                this.f26463b.addRepeated(bVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void clear(b bVar) {
                this.f26463b.clear(bVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object get(AbstractC5209f0 abstractC5209f0) {
                return this.f26463b.get(abstractC5209f0);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public H0.a getBuilder(b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object getRaw(AbstractC5209f0 abstractC5209f0) {
                return get(abstractC5209f0);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object getRepeated(AbstractC5209f0 abstractC5209f0, int i8) {
                return this.f26463b.getRepeated(abstractC5209f0, i8);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public H0.a getRepeatedBuilder(b bVar, int i8) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public int getRepeatedCount(AbstractC5209f0 abstractC5209f0) {
                return this.f26463b.getRepeatedCount(abstractC5209f0);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public boolean has(AbstractC5209f0 abstractC5209f0) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public H0.a newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void set(b bVar, Object obj) {
                clear(bVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    addRepeated(bVar, it.next());
                }
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void setRepeated(b bVar, int i8, Object obj) {
                this.f26463b.setRepeated(bVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object get(b bVar) {
                return this.f26463b.get(bVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object getRepeated(b bVar, int i8) {
                return this.f26463b.getRepeated(bVar, i8);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public int getRepeatedCount(b bVar) {
                return this.f26463b.getRepeatedCount(bVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public boolean has(b bVar) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }
        }

        /* renamed from: com.google.protobuf.f0$g$f */
        private static final class f extends e {

            /* renamed from: c */
            private final Method f26473c;

            /* renamed from: d */
            private final Method f26474d;

            f(C5269x.g gVar, String str, Class cls, Class cls2) {
                super(gVar, str, cls, cls2);
                this.f26473c = AbstractC5209f0.i(this.f26462a, "newBuilder", new Class[0]);
                this.f26474d = AbstractC5209f0.i(cls2, "get" + str + "Builder", Integer.TYPE);
            }

            private Object b(Object obj) {
                return this.f26462a.isInstance(obj) ? obj : ((H0.a) AbstractC5209f0.j(this.f26473c, null, new Object[0])).mergeFrom((H0) obj).build();
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.e, com.google.protobuf.AbstractC5209f0.g.a
            public void addRepeated(b bVar, Object obj) {
                super.addRepeated(bVar, b(obj));
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.e, com.google.protobuf.AbstractC5209f0.g.a
            public H0.a getRepeatedBuilder(b bVar, int i8) {
                return (H0.a) AbstractC5209f0.j(this.f26474d, bVar, Integer.valueOf(i8));
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.e, com.google.protobuf.AbstractC5209f0.g.a
            public H0.a newBuilder() {
                return (H0.a) AbstractC5209f0.j(this.f26473c, null, new Object[0]);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.e, com.google.protobuf.AbstractC5209f0.g.a
            public void setRepeated(b bVar, int i8, Object obj) {
                super.setRepeated(bVar, i8, b(obj));
            }
        }

        /* renamed from: com.google.protobuf.f0$g$h */
        private static class h implements a {

            /* renamed from: a */
            protected final Class f26482a;

            /* renamed from: b */
            protected final C5269x.g f26483b;

            /* renamed from: c */
            protected final boolean f26484c;

            /* renamed from: d */
            protected final boolean f26485d;

            /* renamed from: e */
            protected final a f26486e;

            /* renamed from: com.google.protobuf.f0$g$h$a */
            private interface a {
                void clear(b bVar);

                Object get(b bVar);

                Object get(AbstractC5209f0 abstractC5209f0);

                int getOneofFieldNumber(b bVar);

                int getOneofFieldNumber(AbstractC5209f0 abstractC5209f0);

                boolean has(b bVar);

                boolean has(AbstractC5209f0 abstractC5209f0);

                void set(b bVar, Object obj);
            }

            /* renamed from: com.google.protobuf.f0$g$h$b */
            private static final class b implements a {

                /* renamed from: a */
                private final Method f26487a;

                /* renamed from: b */
                private final Method f26488b;

                /* renamed from: c */
                private final Method f26489c;

                /* renamed from: d */
                private final Method f26490d;

                /* renamed from: e */
                private final Method f26491e;

                /* renamed from: f */
                private final Method f26492f;

                /* renamed from: g */
                private final Method f26493g;

                /* renamed from: h */
                private final Method f26494h;

                b(C5269x.g gVar, String str, Class cls, Class cls2, String str2, boolean z8, boolean z9) {
                    Method methodI;
                    Method methodI2;
                    Method methodI3;
                    Method methodI4 = AbstractC5209f0.i(cls, "get" + str, new Class[0]);
                    this.f26487a = methodI4;
                    this.f26488b = AbstractC5209f0.i(cls2, "get" + str, new Class[0]);
                    this.f26489c = AbstractC5209f0.i(cls2, "set" + str, methodI4.getReturnType());
                    Method methodI5 = null;
                    if (z9) {
                        methodI = AbstractC5209f0.i(cls, "has" + str, new Class[0]);
                    } else {
                        methodI = null;
                    }
                    this.f26490d = methodI;
                    if (z9) {
                        methodI2 = AbstractC5209f0.i(cls2, "has" + str, new Class[0]);
                    } else {
                        methodI2 = null;
                    }
                    this.f26491e = methodI2;
                    this.f26492f = AbstractC5209f0.i(cls2, "clear" + str, new Class[0]);
                    if (z8) {
                        methodI3 = AbstractC5209f0.i(cls, "get" + str2 + "Case", new Class[0]);
                    } else {
                        methodI3 = null;
                    }
                    this.f26493g = methodI3;
                    if (z8) {
                        methodI5 = AbstractC5209f0.i(cls2, "get" + str2 + "Case", new Class[0]);
                    }
                    this.f26494h = methodI5;
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.h.a
                public void clear(b bVar) {
                    AbstractC5209f0.j(this.f26492f, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.h.a
                public Object get(AbstractC5209f0 abstractC5209f0) {
                    return AbstractC5209f0.j(this.f26487a, abstractC5209f0, new Object[0]);
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.h.a
                public int getOneofFieldNumber(AbstractC5209f0 abstractC5209f0) {
                    return ((AbstractC5227l0.c) AbstractC5209f0.j(this.f26493g, abstractC5209f0, new Object[0])).getNumber();
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.h.a
                public boolean has(AbstractC5209f0 abstractC5209f0) {
                    return ((Boolean) AbstractC5209f0.j(this.f26490d, abstractC5209f0, new Object[0])).booleanValue();
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.h.a
                public void set(b bVar, Object obj) {
                    AbstractC5209f0.j(this.f26489c, bVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.h.a
                public Object get(b bVar) {
                    return AbstractC5209f0.j(this.f26488b, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.h.a
                public int getOneofFieldNumber(b bVar) {
                    return ((AbstractC5227l0.c) AbstractC5209f0.j(this.f26494h, bVar, new Object[0])).getNumber();
                }

                @Override // com.google.protobuf.AbstractC5209f0.g.h.a
                public boolean has(b bVar) {
                    return ((Boolean) AbstractC5209f0.j(this.f26491e, bVar, new Object[0])).booleanValue();
                }
            }

            h(C5269x.g gVar, String str, Class cls, Class cls2, String str2) {
                boolean z8 = (gVar.getContainingOneof() == null || gVar.getContainingOneof().isSynthetic()) ? false : true;
                this.f26484c = z8;
                boolean z9 = gVar.getFile().getSyntax() == C5269x.h.b.PROTO2 || gVar.hasOptionalKeyword() || (!z8 && gVar.getJavaType() == C5269x.g.b.MESSAGE);
                this.f26485d = z9;
                b bVar = new b(gVar, str, cls, cls2, str2, z8, z9);
                this.f26483b = gVar;
                this.f26482a = bVar.f26487a.getReturnType();
                this.f26486e = a(bVar);
            }

            static a a(b bVar) {
                return bVar;
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void addRepeated(b bVar, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void clear(b bVar) {
                this.f26486e.clear(bVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object get(AbstractC5209f0 abstractC5209f0) {
                return this.f26486e.get(abstractC5209f0);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public H0.a getBuilder(b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object getRaw(AbstractC5209f0 abstractC5209f0) {
                return get(abstractC5209f0);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object getRepeated(AbstractC5209f0 abstractC5209f0, int i8) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public H0.a getRepeatedBuilder(b bVar, int i8) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public int getRepeatedCount(AbstractC5209f0 abstractC5209f0) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public boolean has(AbstractC5209f0 abstractC5209f0) {
                return !this.f26485d ? this.f26484c ? this.f26486e.getOneofFieldNumber(abstractC5209f0) == this.f26483b.getNumber() : !get(abstractC5209f0).equals(this.f26483b.getDefaultValue()) : this.f26486e.has(abstractC5209f0);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public H0.a newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void set(b bVar, Object obj) {
                this.f26486e.set(bVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public void setRepeated(b bVar, int i8, Object obj) {
                throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object get(b bVar) {
                return this.f26486e.get(bVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public Object getRepeated(b bVar, int i8) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public int getRepeatedCount(b bVar) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.a
            public boolean has(b bVar) {
                if (!this.f26485d) {
                    if (this.f26484c) {
                        return this.f26486e.getOneofFieldNumber(bVar) == this.f26483b.getNumber();
                    }
                    return !get(bVar).equals(this.f26483b.getDefaultValue());
                }
                return this.f26486e.has(bVar);
            }
        }

        /* renamed from: com.google.protobuf.f0$g$i */
        private static final class i extends h {

            /* renamed from: f */
            private final Method f26495f;

            /* renamed from: g */
            private final Method f26496g;

            i(C5269x.g gVar, String str, Class cls, Class cls2, String str2) {
                super(gVar, str, cls, cls2, str2);
                this.f26495f = AbstractC5209f0.i(this.f26482a, "newBuilder", new Class[0]);
                this.f26496g = AbstractC5209f0.i(cls2, "get" + str + "Builder", new Class[0]);
            }

            private Object b(Object obj) {
                return this.f26482a.isInstance(obj) ? obj : ((H0.a) AbstractC5209f0.j(this.f26495f, null, new Object[0])).mergeFrom((H0) obj).buildPartial();
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.h, com.google.protobuf.AbstractC5209f0.g.a
            public H0.a getBuilder(b bVar) {
                return (H0.a) AbstractC5209f0.j(this.f26496g, bVar, new Object[0]);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.h, com.google.protobuf.AbstractC5209f0.g.a
            public H0.a newBuilder() {
                return (H0.a) AbstractC5209f0.j(this.f26495f, null, new Object[0]);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.h, com.google.protobuf.AbstractC5209f0.g.a
            public void set(b bVar, Object obj) {
                super.set(bVar, b(obj));
            }
        }

        /* renamed from: com.google.protobuf.f0$g$j */
        private static final class j extends h {

            /* renamed from: f */
            private final Method f26497f;

            /* renamed from: g */
            private final Method f26498g;

            j(C5269x.g gVar, String str, Class cls, Class cls2, String str2) {
                super(gVar, str, cls, cls2, str2);
                this.f26497f = AbstractC5209f0.i(cls, "get" + str + "Bytes", new Class[0]);
                this.f26498g = AbstractC5209f0.i(cls2, "set" + str + "Bytes", AbstractC5235o.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.h, com.google.protobuf.AbstractC5209f0.g.a
            public Object getRaw(AbstractC5209f0 abstractC5209f0) {
                return AbstractC5209f0.j(this.f26497f, abstractC5209f0, new Object[0]);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.h, com.google.protobuf.AbstractC5209f0.g.a
            public void set(b bVar, Object obj) {
                if (obj instanceof AbstractC5235o) {
                    AbstractC5209f0.j(this.f26498g, bVar, obj);
                } else {
                    super.set(bVar, obj);
                }
            }
        }

        public g(C5269x.b bVar, String[] strArr, Class<? extends AbstractC5209f0> cls, Class<? extends b> cls2) {
            this(bVar, strArr);
            ensureFieldAccessorsInitialized(cls, cls2);
        }

        public a d(C5269x.g gVar) {
            if (gVar.getContainingType() != this.f26442a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (gVar.isExtension()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return this.f26443b[gVar.getIndex()];
        }

        public c e(C5269x.l lVar) {
            if (lVar.getContainingType() == this.f26442a) {
                return this.f26445d[lVar.getIndex()];
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        public g ensureFieldAccessorsInitialized(Class<? extends AbstractC5209f0> cls, Class<? extends b> cls2) {
            if (this.f26446e) {
                return this;
            }
            synchronized (this) {
                try {
                    if (this.f26446e) {
                        return this;
                    }
                    int length = this.f26443b.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        C5269x.g gVar = this.f26442a.getFields().get(i8);
                        String str = gVar.getContainingOneof() != null ? this.f26444c[gVar.getContainingOneof().getIndex() + length] : null;
                        if (gVar.isRepeated()) {
                            if (gVar.getJavaType() == C5269x.g.b.MESSAGE) {
                                if (gVar.isMapField()) {
                                    this.f26443b[i8] = new b(gVar, cls);
                                } else {
                                    this.f26443b[i8] = new f(gVar, this.f26444c[i8], cls, cls2);
                                }
                            } else if (gVar.getJavaType() == C5269x.g.b.ENUM) {
                                this.f26443b[i8] = new d(gVar, this.f26444c[i8], cls, cls2);
                            } else {
                                this.f26443b[i8] = new e(gVar, this.f26444c[i8], cls, cls2);
                            }
                        } else if (gVar.getJavaType() == C5269x.g.b.MESSAGE) {
                            this.f26443b[i8] = new i(gVar, this.f26444c[i8], cls, cls2, str);
                        } else if (gVar.getJavaType() == C5269x.g.b.ENUM) {
                            this.f26443b[i8] = new C0221g(gVar, this.f26444c[i8], cls, cls2, str);
                        } else if (gVar.getJavaType() == C5269x.g.b.STRING) {
                            this.f26443b[i8] = new j(gVar, this.f26444c[i8], cls, cls2, str);
                        } else {
                            this.f26443b[i8] = new h(gVar, this.f26444c[i8], cls, cls2, str);
                        }
                        i8++;
                    }
                    int length2 = this.f26445d.length;
                    for (int i9 = 0; i9 < length2; i9++) {
                        this.f26445d[i9] = new c(this.f26442a, i9, this.f26444c[i9 + length], cls, cls2);
                    }
                    this.f26446e = true;
                    this.f26444c = null;
                    return this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: com.google.protobuf.f0$g$c */
        private static class c {

            /* renamed from: a */
            private final C5269x.b f26449a;

            /* renamed from: b */
            private final Method f26450b;

            /* renamed from: c */
            private final Method f26451c;

            /* renamed from: d */
            private final Method f26452d;

            /* renamed from: e */
            private final C5269x.g f26453e;

            c(C5269x.b bVar, int i8, String str, Class cls, Class cls2) {
                this.f26449a = bVar;
                C5269x.l lVar = bVar.getOneofs().get(i8);
                if (lVar.isSynthetic()) {
                    this.f26450b = null;
                    this.f26451c = null;
                    this.f26453e = lVar.getFields().get(0);
                } else {
                    this.f26450b = AbstractC5209f0.i(cls, "get" + str + "Case", new Class[0]);
                    this.f26451c = AbstractC5209f0.i(cls2, "get" + str + "Case", new Class[0]);
                    this.f26453e = null;
                }
                this.f26452d = AbstractC5209f0.i(cls2, "clear" + str, new Class[0]);
            }

            public void clear(b bVar) {
                AbstractC5209f0.j(this.f26452d, bVar, new Object[0]);
            }

            public C5269x.g get(AbstractC5209f0 abstractC5209f0) {
                C5269x.g gVar = this.f26453e;
                if (gVar != null) {
                    if (abstractC5209f0.hasField(gVar)) {
                        return this.f26453e;
                    }
                    return null;
                }
                int number = ((AbstractC5227l0.c) AbstractC5209f0.j(this.f26450b, abstractC5209f0, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f26449a.findFieldByNumber(number);
                }
                return null;
            }

            public boolean has(AbstractC5209f0 abstractC5209f0) {
                C5269x.g gVar = this.f26453e;
                return gVar != null ? abstractC5209f0.hasField(gVar) : ((AbstractC5227l0.c) AbstractC5209f0.j(this.f26450b, abstractC5209f0, new Object[0])).getNumber() != 0;
            }

            public boolean has(b bVar) {
                C5269x.g gVar = this.f26453e;
                if (gVar != null) {
                    return bVar.hasField(gVar);
                }
                return ((AbstractC5227l0.c) AbstractC5209f0.j(this.f26451c, bVar, new Object[0])).getNumber() != 0;
            }

            public C5269x.g get(b bVar) {
                C5269x.g gVar = this.f26453e;
                if (gVar == null) {
                    int number = ((AbstractC5227l0.c) AbstractC5209f0.j(this.f26451c, bVar, new Object[0])).getNumber();
                    if (number > 0) {
                        return this.f26449a.findFieldByNumber(number);
                    }
                    return null;
                }
                if (bVar.hasField(gVar)) {
                    return this.f26453e;
                }
                return null;
            }
        }

        public g(C5269x.b bVar, String[] strArr) {
            this.f26442a = bVar;
            this.f26444c = strArr;
            this.f26443b = new a[bVar.getFields().size()];
            this.f26445d = new c[bVar.getOneofs().size()];
            this.f26446e = false;
        }

        /* renamed from: com.google.protobuf.f0$g$d */
        private static final class d extends e {

            /* renamed from: c */
            private final C5269x.e f26454c;

            /* renamed from: d */
            private final Method f26455d;

            /* renamed from: e */
            private final Method f26456e;

            /* renamed from: f */
            private final boolean f26457f;

            /* renamed from: g */
            private Method f26458g;

            /* renamed from: h */
            private Method f26459h;

            /* renamed from: i */
            private Method f26460i;

            /* renamed from: j */
            private Method f26461j;

            d(C5269x.g gVar, String str, Class cls, Class cls2) {
                super(gVar, str, cls, cls2);
                this.f26454c = gVar.getEnumType();
                this.f26455d = AbstractC5209f0.i(this.f26462a, "valueOf", C5269x.f.class);
                this.f26456e = AbstractC5209f0.i(this.f26462a, "getValueDescriptor", new Class[0]);
                boolean zF = gVar.getFile().f();
                this.f26457f = zF;
                if (zF) {
                    Class cls3 = Integer.TYPE;
                    this.f26458g = AbstractC5209f0.i(cls, "get" + str + "Value", cls3);
                    this.f26459h = AbstractC5209f0.i(cls2, "get" + str + "Value", cls3);
                    this.f26460i = AbstractC5209f0.i(cls2, "set" + str + "Value", cls3, cls3);
                    this.f26461j = AbstractC5209f0.i(cls2, "add" + str + "Value", cls3);
                }
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.e, com.google.protobuf.AbstractC5209f0.g.a
            public void addRepeated(b bVar, Object obj) {
                if (this.f26457f) {
                    AbstractC5209f0.j(this.f26461j, bVar, Integer.valueOf(((C5269x.f) obj).getNumber()));
                } else {
                    super.addRepeated(bVar, AbstractC5209f0.j(this.f26455d, null, obj));
                }
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.e, com.google.protobuf.AbstractC5209f0.g.a
            public Object get(AbstractC5209f0 abstractC5209f0) {
                ArrayList arrayList = new ArrayList();
                int repeatedCount = getRepeatedCount(abstractC5209f0);
                for (int i8 = 0; i8 < repeatedCount; i8++) {
                    arrayList.add(getRepeated(abstractC5209f0, i8));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.e, com.google.protobuf.AbstractC5209f0.g.a
            public Object getRepeated(AbstractC5209f0 abstractC5209f0, int i8) {
                if (!this.f26457f) {
                    return AbstractC5209f0.j(this.f26456e, super.getRepeated(abstractC5209f0, i8), new Object[0]);
                }
                return this.f26454c.findValueByNumberCreatingIfUnknown(((Integer) AbstractC5209f0.j(this.f26458g, abstractC5209f0, Integer.valueOf(i8))).intValue());
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.e, com.google.protobuf.AbstractC5209f0.g.a
            public void setRepeated(b bVar, int i8, Object obj) {
                if (this.f26457f) {
                    AbstractC5209f0.j(this.f26460i, bVar, Integer.valueOf(i8), Integer.valueOf(((C5269x.f) obj).getNumber()));
                } else {
                    super.setRepeated(bVar, i8, AbstractC5209f0.j(this.f26455d, null, obj));
                }
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.e, com.google.protobuf.AbstractC5209f0.g.a
            public Object get(b bVar) {
                ArrayList arrayList = new ArrayList();
                int repeatedCount = getRepeatedCount(bVar);
                for (int i8 = 0; i8 < repeatedCount; i8++) {
                    arrayList.add(getRepeated(bVar, i8));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.e, com.google.protobuf.AbstractC5209f0.g.a
            public Object getRepeated(b bVar, int i8) {
                if (this.f26457f) {
                    return this.f26454c.findValueByNumberCreatingIfUnknown(((Integer) AbstractC5209f0.j(this.f26459h, bVar, Integer.valueOf(i8))).intValue());
                }
                return AbstractC5209f0.j(this.f26456e, super.getRepeated(bVar, i8), new Object[0]);
            }
        }

        /* renamed from: com.google.protobuf.f0$g$g */
        private static final class C0221g extends h {

            /* renamed from: f */
            private final C5269x.e f26475f;

            /* renamed from: g */
            private final Method f26476g;

            /* renamed from: h */
            private final Method f26477h;

            /* renamed from: i */
            private final boolean f26478i;

            /* renamed from: j */
            private Method f26479j;

            /* renamed from: k */
            private Method f26480k;

            /* renamed from: l */
            private Method f26481l;

            C0221g(C5269x.g gVar, String str, Class cls, Class cls2, String str2) {
                super(gVar, str, cls, cls2, str2);
                this.f26475f = gVar.getEnumType();
                this.f26476g = AbstractC5209f0.i(this.f26482a, "valueOf", C5269x.f.class);
                this.f26477h = AbstractC5209f0.i(this.f26482a, "getValueDescriptor", new Class[0]);
                boolean zF = gVar.getFile().f();
                this.f26478i = zF;
                if (zF) {
                    this.f26479j = AbstractC5209f0.i(cls, "get" + str + "Value", new Class[0]);
                    this.f26480k = AbstractC5209f0.i(cls2, "get" + str + "Value", new Class[0]);
                    this.f26481l = AbstractC5209f0.i(cls2, "set" + str + "Value", Integer.TYPE);
                }
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.h, com.google.protobuf.AbstractC5209f0.g.a
            public Object get(AbstractC5209f0 abstractC5209f0) {
                if (!this.f26478i) {
                    return AbstractC5209f0.j(this.f26477h, super.get(abstractC5209f0), new Object[0]);
                }
                return this.f26475f.findValueByNumberCreatingIfUnknown(((Integer) AbstractC5209f0.j(this.f26479j, abstractC5209f0, new Object[0])).intValue());
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.h, com.google.protobuf.AbstractC5209f0.g.a
            public void set(b bVar, Object obj) {
                if (this.f26478i) {
                    AbstractC5209f0.j(this.f26481l, bVar, Integer.valueOf(((C5269x.f) obj).getNumber()));
                } else {
                    super.set(bVar, AbstractC5209f0.j(this.f26476g, null, obj));
                }
            }

            @Override // com.google.protobuf.AbstractC5209f0.g.h, com.google.protobuf.AbstractC5209f0.g.a
            public Object get(b bVar) {
                if (this.f26478i) {
                    return this.f26475f.findValueByNumberCreatingIfUnknown(((Integer) AbstractC5209f0.j(this.f26480k, bVar, new Object[0])).intValue());
                }
                return AbstractC5209f0.j(this.f26477h, super.get(bVar), new Object[0]);
            }
        }
    }

    protected static AbstractC5227l0.h mutableCopy(AbstractC5227l0.h hVar) {
        return (AbstractC5227l0.h) makeMutableCopy(hVar);
    }

    @Override // com.google.protobuf.AbstractC5193a
    protected H0.a newBuilderForType(AbstractC5193a.b bVar) {
        return newBuilderForType((c) new a(bVar));
    }

    protected AbstractC5209f0(b bVar) {
        this.unknownFields = bVar.getUnknownFields();
    }

    protected static AbstractC5227l0.f mutableCopy(AbstractC5227l0.f fVar) {
        return (AbstractC5227l0.f) makeMutableCopy(fVar);
    }

    protected static <M extends H0> M parseDelimitedWithIOException(Z0 z02, InputStream inputStream, M m8) throws IOException {
        try {
            return (M) z02.parseDelimitedFrom(inputStream, m8);
        } catch (C5230m0 e8) {
            throw e8.unwrapIOException();
        }
    }

    protected static <M extends H0> M parseWithIOException(Z0 z02, InputStream inputStream, M m8) throws IOException {
        try {
            return (M) z02.parseFrom(inputStream, m8);
        } catch (C5230m0 e8) {
            throw e8.unwrapIOException();
        }
    }

    protected static AbstractC5227l0.b mutableCopy(AbstractC5227l0.b bVar) {
        return (AbstractC5227l0.b) makeMutableCopy(bVar);
    }

    protected static AbstractC5227l0.a mutableCopy(AbstractC5227l0.a aVar) {
        return (AbstractC5227l0.a) makeMutableCopy(aVar);
    }

    protected static <M extends H0> M parseWithIOException(Z0 z02, r rVar) throws IOException {
        try {
            return (M) z02.parseFrom(rVar);
        } catch (C5230m0 e8) {
            throw e8.unwrapIOException();
        }
    }

    protected static <M extends H0> M parseWithIOException(Z0 z02, r rVar, M m8) throws IOException {
        try {
            return (M) z02.parseFrom(rVar, m8);
        } catch (C5230m0 e8) {
            throw e8.unwrapIOException();
        }
    }
}
