package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;

/* renamed from: com.google.protobuf.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5228l1 implements AbstractC5193a.b {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC5193a.b f26569a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC5193a.AbstractC0218a f26570b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5193a f26571c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26572d;

    public C5228l1(AbstractC5193a abstractC5193a, AbstractC5193a.b bVar, boolean z8) {
        this.f26571c = (AbstractC5193a) AbstractC5227l0.a(abstractC5193a);
        this.f26569a = bVar;
        this.f26572d = z8;
    }

    private void a() {
        AbstractC5193a.b bVar;
        if (this.f26570b != null) {
            this.f26571c = null;
        }
        if (!this.f26572d || (bVar = this.f26569a) == null) {
            return;
        }
        bVar.markDirty();
        this.f26572d = false;
    }

    public AbstractC5193a build() {
        this.f26572d = true;
        return getMessage();
    }

    public C5228l1 clear() {
        AbstractC5193a abstractC5193a = this.f26571c;
        this.f26571c = (AbstractC5193a) (abstractC5193a != null ? abstractC5193a.getDefaultInstanceForType() : this.f26570b.getDefaultInstanceForType());
        AbstractC5193a.AbstractC0218a abstractC0218a = this.f26570b;
        if (abstractC0218a != null) {
            abstractC0218a.dispose();
            this.f26570b = null;
        }
        a();
        this.f26572d = true;
        return this;
    }

    public void dispose() {
        this.f26569a = null;
    }

    public AbstractC5193a.AbstractC0218a getBuilder() {
        if (this.f26570b == null) {
            AbstractC5193a.AbstractC0218a abstractC0218a = (AbstractC5193a.AbstractC0218a) this.f26571c.newBuilderForType(this);
            this.f26570b = abstractC0218a;
            abstractC0218a.mergeFrom((H0) this.f26571c);
            this.f26570b.markClean();
        }
        return this.f26570b;
    }

    public AbstractC5193a getMessage() {
        if (this.f26571c == null) {
            this.f26571c = (AbstractC5193a) this.f26570b.buildPartial();
        }
        return this.f26571c;
    }

    public N0 getMessageOrBuilder() {
        AbstractC5193a.AbstractC0218a abstractC0218a = this.f26570b;
        return abstractC0218a != null ? abstractC0218a : this.f26571c;
    }

    @Override // com.google.protobuf.AbstractC5193a.b
    public void markDirty() {
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.protobuf.C5228l1 mergeFrom(com.google.protobuf.AbstractC5193a r3) {
        /*
            r2 = this;
            com.google.protobuf.a$a r0 = r2.f26570b
            if (r0 != 0) goto Lf
            com.google.protobuf.a r0 = r2.f26571c
            com.google.protobuf.H0 r1 = r0.getDefaultInstanceForType()
            if (r0 != r1) goto Lf
            r2.f26571c = r3
            goto L16
        Lf:
            com.google.protobuf.a$a r0 = r2.getBuilder()
            r0.mergeFrom(r3)
        L16:
            r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5228l1.mergeFrom(com.google.protobuf.a):com.google.protobuf.l1");
    }

    public C5228l1 setMessage(AbstractC5193a abstractC5193a) {
        this.f26571c = (AbstractC5193a) AbstractC5227l0.a(abstractC5193a);
        AbstractC5193a.AbstractC0218a abstractC0218a = this.f26570b;
        if (abstractC0218a != null) {
            abstractC0218a.dispose();
            this.f26570b = null;
        }
        a();
        return this;
    }
}
