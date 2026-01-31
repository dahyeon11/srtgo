package com.google.protobuf;

import com.google.protobuf.C5269x;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.K;
import com.google.protobuf.K0;
import com.google.protobuf.P1;
import com.google.protobuf.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
abstract class O0 {

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26238a;

        static {
            int[] iArr = new int[C5269x.g.c.values().length];
            f26238a = iArr;
            try {
                iArr[C5269x.g.c.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26238a[C5269x.g.c.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26238a[C5269x.g.c.ENUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b implements e {

        /* renamed from: a */
        private final H0.a f26239a;

        /* renamed from: b */
        private boolean f26240b = true;

        public b(H0.a aVar) {
            this.f26239a = aVar;
        }

        private H0.a a(C5269x.g gVar) {
            if (!this.f26240b) {
                return null;
            }
            try {
                return this.f26239a.getFieldBuilder(gVar);
            } catch (UnsupportedOperationException unused) {
                this.f26240b = false;
                return null;
            }
        }

        private H0.a b(C5269x.g gVar, H0 h02) {
            return h02 != null ? h02.newBuilderForType() : this.f26239a.newBuilderForField(gVar);
        }

        @Override // com.google.protobuf.O0.e
        public e addRepeatedField(C5269x.g gVar, Object obj) {
            if (obj instanceof K0.a) {
                obj = ((K0.a) obj).buildPartial();
            }
            this.f26239a.addRepeatedField(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public e clearField(C5269x.g gVar) {
            this.f26239a.clearField(gVar);
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public e clearOneof(C5269x.l lVar) {
            this.f26239a.clearOneof(lVar);
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public K.c findExtensionByName(K k8, String str) {
            return k8.findImmutableExtensionByName(str);
        }

        @Override // com.google.protobuf.O0.e
        public K.c findExtensionByNumber(K k8, C5269x.b bVar, int i8) {
            return k8.findImmutableExtensionByNumber(bVar, i8);
        }

        @Override // com.google.protobuf.O0.e
        public Object finish() {
            return this.f26239a;
        }

        @Override // com.google.protobuf.O0.e
        public e.a getContainerType() {
            return e.a.MESSAGE;
        }

        @Override // com.google.protobuf.O0.e
        public C5269x.b getDescriptorForType() {
            return this.f26239a.getDescriptorForType();
        }

        @Override // com.google.protobuf.O0.e
        public Object getField(C5269x.g gVar) {
            return this.f26239a.getField(gVar);
        }

        @Override // com.google.protobuf.O0.e
        public C5269x.g getOneofFieldDescriptor(C5269x.l lVar) {
            return this.f26239a.getOneofFieldDescriptor(lVar);
        }

        @Override // com.google.protobuf.O0.e
        public P1.d getUtf8Validation(C5269x.g gVar) {
            if (gVar.needsUtf8Check()) {
                return P1.d.STRICT;
            }
            gVar.isRepeated();
            return P1.d.LOOSE;
        }

        @Override // com.google.protobuf.O0.e
        public boolean hasField(C5269x.g gVar) {
            return this.f26239a.hasField(gVar);
        }

        @Override // com.google.protobuf.O0.e
        public boolean hasOneof(C5269x.l lVar) {
            return this.f26239a.hasOneof(lVar);
        }

        @Override // com.google.protobuf.O0.e
        public void mergeGroup(r rVar, M m8, C5269x.g gVar, H0 h02) {
            H0.a aVarB;
            if (gVar.isRepeated()) {
                H0.a aVarB2 = b(gVar, h02);
                rVar.readGroup(gVar.getNumber(), aVarB2, m8);
                addRepeatedField(gVar, aVarB2.buildPartial());
                return;
            }
            if (hasField(gVar)) {
                H0.a aVarA = a(gVar);
                if (aVarA != null) {
                    rVar.readGroup(gVar.getNumber(), aVarA, m8);
                    return;
                } else {
                    aVarB = b(gVar, h02);
                    aVarB.mergeFrom((H0) getField(gVar));
                }
            } else {
                aVarB = b(gVar, h02);
            }
            rVar.readGroup(gVar.getNumber(), aVarB, m8);
            setField(gVar, aVarB.buildPartial());
        }

        @Override // com.google.protobuf.O0.e
        public void mergeMessage(r rVar, M m8, C5269x.g gVar, H0 h02) {
            H0.a aVarB;
            if (gVar.isRepeated()) {
                H0.a aVarB2 = b(gVar, h02);
                rVar.readMessage(aVarB2, m8);
                addRepeatedField(gVar, aVarB2.buildPartial());
                return;
            }
            if (hasField(gVar)) {
                H0.a aVarA = a(gVar);
                if (aVarA != null) {
                    rVar.readMessage(aVarA, m8);
                    return;
                } else {
                    aVarB = b(gVar, h02);
                    aVarB.mergeFrom((H0) getField(gVar));
                }
            } else {
                aVarB = b(gVar, h02);
            }
            rVar.readMessage(aVarB, m8);
            setField(gVar, aVarB.buildPartial());
        }

        @Override // com.google.protobuf.O0.e
        public e newEmptyTargetForField(C5269x.g gVar, H0 h02) {
            return new b(h02 != null ? h02.newBuilderForType() : this.f26239a.newBuilderForField(gVar));
        }

        @Override // com.google.protobuf.O0.e
        public e newMergeTargetForField(C5269x.g gVar, H0 h02) {
            H0 h03;
            H0.a aVarA;
            if (!gVar.isRepeated() && hasField(gVar) && (aVarA = a(gVar)) != null) {
                return new b(aVarA);
            }
            H0.a aVarB = b(gVar, h02);
            if (!gVar.isRepeated() && (h03 = (H0) getField(gVar)) != null) {
                aVarB.mergeFrom(h03);
            }
            return new b(aVarB);
        }

        @Override // com.google.protobuf.O0.e
        public Object parseGroup(r rVar, M m8, C5269x.g gVar, H0 h02) {
            H0 h03;
            H0.a aVarNewBuilderForType = h02 != null ? h02.newBuilderForType() : this.f26239a.newBuilderForField(gVar);
            if (!gVar.isRepeated() && (h03 = (H0) getField(gVar)) != null) {
                aVarNewBuilderForType.mergeFrom(h03);
            }
            rVar.readGroup(gVar.getNumber(), aVarNewBuilderForType, m8);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.O0.e
        public Object parseMessage(r rVar, M m8, C5269x.g gVar, H0 h02) {
            H0 h03;
            H0.a aVarNewBuilderForType = h02 != null ? h02.newBuilderForType() : this.f26239a.newBuilderForField(gVar);
            if (!gVar.isRepeated() && (h03 = (H0) getField(gVar)) != null) {
                aVarNewBuilderForType.mergeFrom(h03);
            }
            rVar.readMessage(aVarNewBuilderForType, m8);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.O0.e
        public Object parseMessageFromBytes(AbstractC5235o abstractC5235o, M m8, C5269x.g gVar, H0 h02) {
            H0 h03;
            H0.a aVarNewBuilderForType = h02 != null ? h02.newBuilderForType() : this.f26239a.newBuilderForField(gVar);
            if (!gVar.isRepeated() && (h03 = (H0) getField(gVar)) != null) {
                aVarNewBuilderForType.mergeFrom(h03);
            }
            aVarNewBuilderForType.mergeFrom(abstractC5235o, m8);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.O0.e
        public e setField(C5269x.g gVar, Object obj) {
            if (gVar.isRepeated() || !(obj instanceof K0.a)) {
                this.f26239a.setField(gVar, obj);
                return this;
            }
            if (obj != a(gVar)) {
                this.f26239a.setField(gVar, ((K0.a) obj).buildPartial());
            }
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public e setRepeatedField(C5269x.g gVar, int i8, Object obj) {
            if (obj instanceof K0.a) {
                obj = ((K0.a) obj).buildPartial();
            }
            this.f26239a.setRepeatedField(gVar, i8, obj);
            return this;
        }
    }

    static class c implements e {

        /* renamed from: a */
        private final W f26241a;

        c(W w8) {
            this.f26241a = w8;
        }

        @Override // com.google.protobuf.O0.e
        public e addRepeatedField(C5269x.g gVar, Object obj) {
            this.f26241a.addRepeatedField(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public e clearField(C5269x.g gVar) {
            this.f26241a.clearField(gVar);
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public e clearOneof(C5269x.l lVar) {
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public K.c findExtensionByName(K k8, String str) {
            return k8.findImmutableExtensionByName(str);
        }

        @Override // com.google.protobuf.O0.e
        public K.c findExtensionByNumber(K k8, C5269x.b bVar, int i8) {
            return k8.findImmutableExtensionByNumber(bVar, i8);
        }

        @Override // com.google.protobuf.O0.e
        public Object finish() {
            throw new UnsupportedOperationException("finish() called on FieldSet object");
        }

        @Override // com.google.protobuf.O0.e
        public e.a getContainerType() {
            return e.a.EXTENSION_SET;
        }

        @Override // com.google.protobuf.O0.e
        public C5269x.b getDescriptorForType() {
            throw new UnsupportedOperationException("getDescriptorForType() called on FieldSet object");
        }

        @Override // com.google.protobuf.O0.e
        public Object getField(C5269x.g gVar) {
            return this.f26241a.getField(gVar);
        }

        @Override // com.google.protobuf.O0.e
        public C5269x.g getOneofFieldDescriptor(C5269x.l lVar) {
            return null;
        }

        @Override // com.google.protobuf.O0.e
        public P1.d getUtf8Validation(C5269x.g gVar) {
            return gVar.needsUtf8Check() ? P1.d.STRICT : P1.d.LOOSE;
        }

        @Override // com.google.protobuf.O0.e
        public boolean hasField(C5269x.g gVar) {
            return this.f26241a.hasField(gVar);
        }

        @Override // com.google.protobuf.O0.e
        public boolean hasOneof(C5269x.l lVar) {
            return false;
        }

        @Override // com.google.protobuf.O0.e
        public void mergeGroup(r rVar, M m8, C5269x.g gVar, H0 h02) {
            if (gVar.isRepeated()) {
                H0.a aVarNewBuilderForType = h02.newBuilderForType();
                rVar.readGroup(gVar.getNumber(), aVarNewBuilderForType, m8);
                addRepeatedField(gVar, aVarNewBuilderForType.buildPartial());
            } else if (hasField(gVar)) {
                K0.a builder = ((K0) getField(gVar)).toBuilder();
                rVar.readGroup(gVar.getNumber(), builder, m8);
                setField(gVar, builder.buildPartial());
            } else {
                H0.a aVarNewBuilderForType2 = h02.newBuilderForType();
                rVar.readGroup(gVar.getNumber(), aVarNewBuilderForType2, m8);
                setField(gVar, aVarNewBuilderForType2.buildPartial());
            }
        }

        @Override // com.google.protobuf.O0.e
        public void mergeMessage(r rVar, M m8, C5269x.g gVar, H0 h02) {
            if (gVar.isRepeated()) {
                H0.a aVarNewBuilderForType = h02.newBuilderForType();
                rVar.readMessage(aVarNewBuilderForType, m8);
                addRepeatedField(gVar, aVarNewBuilderForType.buildPartial());
            } else if (hasField(gVar)) {
                K0.a builder = ((K0) getField(gVar)).toBuilder();
                rVar.readMessage(builder, m8);
                setField(gVar, builder.buildPartial());
            } else {
                H0.a aVarNewBuilderForType2 = h02.newBuilderForType();
                rVar.readMessage(aVarNewBuilderForType2, m8);
                setField(gVar, aVarNewBuilderForType2.buildPartial());
            }
        }

        @Override // com.google.protobuf.O0.e
        public e newEmptyTargetForField(C5269x.g gVar, H0 h02) {
            throw new UnsupportedOperationException("newEmptyTargetForField() called on FieldSet object");
        }

        @Override // com.google.protobuf.O0.e
        public e newMergeTargetForField(C5269x.g gVar, H0 h02) {
            throw new UnsupportedOperationException("newMergeTargetForField() called on FieldSet object");
        }

        @Override // com.google.protobuf.O0.e
        public Object parseGroup(r rVar, M m8, C5269x.g gVar, H0 h02) {
            H0 h03;
            H0.a aVarNewBuilderForType = h02.newBuilderForType();
            if (!gVar.isRepeated() && (h03 = (H0) getField(gVar)) != null) {
                aVarNewBuilderForType.mergeFrom(h03);
            }
            rVar.readGroup(gVar.getNumber(), aVarNewBuilderForType, m8);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.O0.e
        public Object parseMessage(r rVar, M m8, C5269x.g gVar, H0 h02) {
            H0 h03;
            H0.a aVarNewBuilderForType = h02.newBuilderForType();
            if (!gVar.isRepeated() && (h03 = (H0) getField(gVar)) != null) {
                aVarNewBuilderForType.mergeFrom(h03);
            }
            rVar.readMessage(aVarNewBuilderForType, m8);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.O0.e
        public Object parseMessageFromBytes(AbstractC5235o abstractC5235o, M m8, C5269x.g gVar, H0 h02) {
            H0 h03;
            H0.a aVarNewBuilderForType = h02.newBuilderForType();
            if (!gVar.isRepeated() && (h03 = (H0) getField(gVar)) != null) {
                aVarNewBuilderForType.mergeFrom(h03);
            }
            aVarNewBuilderForType.mergeFrom(abstractC5235o, m8);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.O0.e
        public e setField(C5269x.g gVar, Object obj) {
            this.f26241a.setField(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public e setRepeatedField(C5269x.g gVar, int i8, Object obj) {
            this.f26241a.setRepeatedField(gVar, i8, obj);
            return this;
        }
    }

    static class d implements e {

        /* renamed from: a */
        private final W.b f26242a;

        d(W.b bVar) {
            this.f26242a = bVar;
        }

        @Override // com.google.protobuf.O0.e
        public e addRepeatedField(C5269x.g gVar, Object obj) {
            this.f26242a.addRepeatedField(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public e clearField(C5269x.g gVar) {
            this.f26242a.clearField(gVar);
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public e clearOneof(C5269x.l lVar) {
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public K.c findExtensionByName(K k8, String str) {
            return k8.findImmutableExtensionByName(str);
        }

        @Override // com.google.protobuf.O0.e
        public K.c findExtensionByNumber(K k8, C5269x.b bVar, int i8) {
            return k8.findImmutableExtensionByNumber(bVar, i8);
        }

        @Override // com.google.protobuf.O0.e
        public Object finish() {
            throw new UnsupportedOperationException("finish() called on FieldSet object");
        }

        @Override // com.google.protobuf.O0.e
        public e.a getContainerType() {
            return e.a.EXTENSION_SET;
        }

        @Override // com.google.protobuf.O0.e
        public C5269x.b getDescriptorForType() {
            throw new UnsupportedOperationException("getDescriptorForType() called on FieldSet object");
        }

        @Override // com.google.protobuf.O0.e
        public Object getField(C5269x.g gVar) {
            return this.f26242a.getField(gVar);
        }

        @Override // com.google.protobuf.O0.e
        public C5269x.g getOneofFieldDescriptor(C5269x.l lVar) {
            return null;
        }

        @Override // com.google.protobuf.O0.e
        public P1.d getUtf8Validation(C5269x.g gVar) {
            return gVar.needsUtf8Check() ? P1.d.STRICT : P1.d.LOOSE;
        }

        @Override // com.google.protobuf.O0.e
        public boolean hasField(C5269x.g gVar) {
            return this.f26242a.hasField(gVar);
        }

        @Override // com.google.protobuf.O0.e
        public boolean hasOneof(C5269x.l lVar) {
            return false;
        }

        @Override // com.google.protobuf.O0.e
        public void mergeGroup(r rVar, M m8, C5269x.g gVar, H0 h02) {
            K0.a builder;
            if (gVar.isRepeated()) {
                H0.a aVarNewBuilderForType = h02.newBuilderForType();
                rVar.readGroup(gVar.getNumber(), aVarNewBuilderForType, m8);
                addRepeatedField(gVar, aVarNewBuilderForType.buildPartial());
            } else if (!hasField(gVar)) {
                H0.a aVarNewBuilderForType2 = h02.newBuilderForType();
                rVar.readGroup(gVar.getNumber(), aVarNewBuilderForType2, m8);
                setField(gVar, aVarNewBuilderForType2);
            } else {
                Object objC = this.f26242a.c(gVar);
                if (objC instanceof K0.a) {
                    builder = (K0.a) objC;
                } else {
                    builder = ((K0) objC).toBuilder();
                    this.f26242a.setField(gVar, builder);
                }
                rVar.readGroup(gVar.getNumber(), builder, m8);
            }
        }

        @Override // com.google.protobuf.O0.e
        public void mergeMessage(r rVar, M m8, C5269x.g gVar, H0 h02) {
            K0.a builder;
            if (gVar.isRepeated()) {
                H0.a aVarNewBuilderForType = h02.newBuilderForType();
                rVar.readMessage(aVarNewBuilderForType, m8);
                addRepeatedField(gVar, aVarNewBuilderForType.buildPartial());
            } else if (!hasField(gVar)) {
                H0.a aVarNewBuilderForType2 = h02.newBuilderForType();
                rVar.readMessage(aVarNewBuilderForType2, m8);
                setField(gVar, aVarNewBuilderForType2);
            } else {
                Object objC = this.f26242a.c(gVar);
                if (objC instanceof K0.a) {
                    builder = (K0.a) objC;
                } else {
                    builder = ((K0) objC).toBuilder();
                    this.f26242a.setField(gVar, builder);
                }
                rVar.readMessage(builder, m8);
            }
        }

        @Override // com.google.protobuf.O0.e
        public e newEmptyTargetForField(C5269x.g gVar, H0 h02) {
            throw new UnsupportedOperationException("newEmptyTargetForField() called on FieldSet object");
        }

        @Override // com.google.protobuf.O0.e
        public e newMergeTargetForField(C5269x.g gVar, H0 h02) {
            throw new UnsupportedOperationException("newMergeTargetForField() called on FieldSet object");
        }

        @Override // com.google.protobuf.O0.e
        public Object parseGroup(r rVar, M m8, C5269x.g gVar, H0 h02) {
            H0 h03;
            H0.a aVarNewBuilderForType = h02.newBuilderForType();
            if (!gVar.isRepeated() && (h03 = (H0) getField(gVar)) != null) {
                aVarNewBuilderForType.mergeFrom(h03);
            }
            rVar.readGroup(gVar.getNumber(), aVarNewBuilderForType, m8);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.O0.e
        public Object parseMessage(r rVar, M m8, C5269x.g gVar, H0 h02) {
            H0 h03;
            H0.a aVarNewBuilderForType = h02.newBuilderForType();
            if (!gVar.isRepeated() && (h03 = (H0) getField(gVar)) != null) {
                aVarNewBuilderForType.mergeFrom(h03);
            }
            rVar.readMessage(aVarNewBuilderForType, m8);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.O0.e
        public Object parseMessageFromBytes(AbstractC5235o abstractC5235o, M m8, C5269x.g gVar, H0 h02) {
            H0 h03;
            H0.a aVarNewBuilderForType = h02.newBuilderForType();
            if (!gVar.isRepeated() && (h03 = (H0) getField(gVar)) != null) {
                aVarNewBuilderForType.mergeFrom(h03);
            }
            aVarNewBuilderForType.mergeFrom(abstractC5235o, m8);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.O0.e
        public e setField(C5269x.g gVar, Object obj) {
            this.f26242a.setField(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.O0.e
        public e setRepeatedField(C5269x.g gVar, int i8, Object obj) {
            this.f26242a.setRepeatedField(gVar, i8, obj);
            return this;
        }
    }

    interface e {

        public enum a {
            MESSAGE,
            EXTENSION_SET
        }

        e addRepeatedField(C5269x.g gVar, Object obj);

        e clearField(C5269x.g gVar);

        e clearOneof(C5269x.l lVar);

        K.c findExtensionByName(K k8, String str);

        K.c findExtensionByNumber(K k8, C5269x.b bVar, int i8);

        Object finish();

        a getContainerType();

        C5269x.b getDescriptorForType();

        Object getField(C5269x.g gVar);

        C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        P1.d getUtf8Validation(C5269x.g gVar);

        boolean hasField(C5269x.g gVar);

        boolean hasOneof(C5269x.l lVar);

        void mergeGroup(r rVar, M m8, C5269x.g gVar, H0 h02);

        void mergeMessage(r rVar, M m8, C5269x.g gVar, H0 h02);

        e newEmptyTargetForField(C5269x.g gVar, H0 h02);

        e newMergeTargetForField(C5269x.g gVar, H0 h02);

        Object parseGroup(r rVar, M m8, C5269x.g gVar, H0 h02);

        Object parseMessage(r rVar, M m8, C5269x.g gVar, H0 h02);

        Object parseMessageFromBytes(AbstractC5235o abstractC5235o, M m8, C5269x.g gVar, H0 h02);

        e setField(C5269x.g gVar, Object obj);

        e setRepeatedField(C5269x.g gVar, int i8, Object obj);
    }

    static String a(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private static void b(r rVar, K.c cVar, M m8, e eVar) {
        C5269x.g gVar = cVar.descriptor;
        eVar.setField(gVar, eVar.parseMessage(rVar, m8, gVar, cVar.defaultInstance));
    }

    static List c(N0 n02) {
        ArrayList arrayList = new ArrayList();
        d(n02, "", arrayList);
        return arrayList;
    }

    private static void d(N0 n02, String str, List list) {
        for (C5269x.g gVar : n02.getDescriptorForType().getFields()) {
            if (gVar.isRequired() && !n02.hasField(gVar)) {
                list.add(str + gVar.getName());
            }
        }
        for (Map.Entry<C5269x.g, Object> entry : n02.getAllFields().entrySet()) {
            C5269x.g key = entry.getKey();
            Object value = entry.getValue();
            if (key.getJavaType() == C5269x.g.b.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) value).iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        d((N0) it.next(), k(str, key, i8), list);
                        i8++;
                    }
                } else if (n02.hasField(key)) {
                    d((N0) value, k(str, key, -1), list);
                }
            }
        }
    }

    static int e(H0 h02, Map map) {
        boolean messageSetWireFormat = h02.getDescriptorForType().getOptions().getMessageSetWireFormat();
        int iComputeMessageSetExtensionSize = 0;
        for (Map.Entry entry : map.entrySet()) {
            C5269x.g gVar = (C5269x.g) entry.getKey();
            Object value = entry.getValue();
            iComputeMessageSetExtensionSize += (messageSetWireFormat && gVar.isExtension() && gVar.getType() == C5269x.g.c.MESSAGE && !gVar.isRepeated()) ? AbstractC5248t.computeMessageSetExtensionSize(gVar.getNumber(), (H0) value) : W.computeFieldSize(gVar, value);
        }
        G1 unknownFields = h02.getUnknownFields();
        return iComputeMessageSetExtensionSize + (messageSetWireFormat ? unknownFields.getSerializedSizeAsMessageSet() : unknownFields.getSerializedSize());
    }

    static boolean f(N0 n02) {
        for (C5269x.g gVar : n02.getDescriptorForType().getFields()) {
            if (gVar.isRequired() && !n02.hasField(gVar)) {
                return false;
            }
        }
        for (Map.Entry<C5269x.g, Object> entry : n02.getAllFields().entrySet()) {
            C5269x.g key = entry.getKey();
            if (key.getJavaType() == C5269x.g.b.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((H0) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((H0) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean g(com.google.protobuf.r r7, com.google.protobuf.G1.b r8, com.google.protobuf.M r9, com.google.protobuf.C5269x.b r10, com.google.protobuf.O0.e r11, int r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.O0.g(com.google.protobuf.r, com.google.protobuf.G1$b, com.google.protobuf.M, com.google.protobuf.x$b, com.google.protobuf.O0$e, int):boolean");
    }

    static void h(H0.a aVar, G1.b bVar, r rVar, M m8) {
        int tag;
        b bVar2 = new b(aVar);
        C5269x.b descriptorForType = aVar.getDescriptorForType();
        do {
            tag = rVar.readTag();
            if (tag == 0) {
                return;
            }
        } while (g(rVar, bVar, m8, descriptorForType, bVar2, tag));
    }

    private static void i(AbstractC5235o abstractC5235o, K.c cVar, M m8, e eVar) {
        C5269x.g gVar = cVar.descriptor;
        if (eVar.hasField(gVar) || M.isEagerlyParseMessageSets()) {
            eVar.setField(gVar, eVar.parseMessageFromBytes(abstractC5235o, m8, gVar, cVar.defaultInstance));
        } else {
            eVar.setField(gVar, new C5242q0(cVar.defaultInstance, m8, abstractC5235o));
        }
    }

    private static void j(r rVar, G1.b bVar, M m8, C5269x.b bVar2, e eVar) {
        int uInt32 = 0;
        AbstractC5235o bytes = null;
        K.c cVarFindExtensionByNumber = null;
        while (true) {
            int tag = rVar.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == P1.f26266c) {
                uInt32 = rVar.readUInt32();
                if (uInt32 != 0 && (m8 instanceof K)) {
                    cVarFindExtensionByNumber = eVar.findExtensionByNumber((K) m8, bVar2, uInt32);
                }
            } else if (tag == P1.f26267d) {
                if (uInt32 == 0 || cVarFindExtensionByNumber == null || !M.isEagerlyParseMessageSets()) {
                    bytes = rVar.readBytes();
                } else {
                    b(rVar, cVarFindExtensionByNumber, m8, eVar);
                    bytes = null;
                }
            } else if (!rVar.skipField(tag)) {
                break;
            }
        }
        rVar.checkLastTagWas(P1.f26265b);
        if (bytes == null || uInt32 == 0) {
            return;
        }
        if (cVarFindExtensionByNumber != null) {
            i(bytes, cVarFindExtensionByNumber, m8, eVar);
        } else if (bVar != null) {
            bVar.mergeField(uInt32, G1.c.newBuilder().addLengthDelimited(bytes).build());
        }
    }

    private static String k(String str, C5269x.g gVar, int i8) {
        StringBuilder sb = new StringBuilder(str);
        if (gVar.isExtension()) {
            sb.append('(');
            sb.append(gVar.getFullName());
            sb.append(')');
        } else {
            sb.append(gVar.getName());
        }
        if (i8 != -1) {
            sb.append('[');
            sb.append(i8);
            sb.append(']');
        }
        sb.append(Q7.C.PACKAGE_SEPARATOR_CHAR);
        return sb.toString();
    }

    static void l(H0 h02, Map map, AbstractC5248t abstractC5248t, boolean z8) {
        boolean messageSetWireFormat = h02.getDescriptorForType().getOptions().getMessageSetWireFormat();
        if (z8) {
            TreeMap treeMap = new TreeMap(map);
            for (C5269x.g gVar : h02.getDescriptorForType().getFields()) {
                if (gVar.isRequired() && !treeMap.containsKey(gVar)) {
                    treeMap.put(gVar, h02.getField(gVar));
                }
            }
            map = treeMap;
        }
        for (Map.Entry entry : map.entrySet()) {
            C5269x.g gVar2 = (C5269x.g) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && gVar2.isExtension() && gVar2.getType() == C5269x.g.c.MESSAGE && !gVar2.isRepeated()) {
                abstractC5248t.writeMessageSetExtension(gVar2.getNumber(), (H0) value);
            } else {
                W.writeField(gVar2, value, abstractC5248t);
            }
        }
        G1 unknownFields = h02.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(abstractC5248t);
        } else {
            unknownFields.writeTo(abstractC5248t);
        }
    }
}
