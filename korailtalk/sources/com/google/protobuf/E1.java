package com.google.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class E1 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final List f26144a;

    public E1(K0 k02) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f26144a = null;
    }

    private static String a(List list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        Iterator it = list.iterator();
        boolean z8 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z8) {
                z8 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public C5230m0 asInvalidProtocolBufferException() {
        return new C5230m0(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.f26144a);
    }

    public E1(List<String> list) {
        super(a(list));
        this.f26144a = list;
    }
}
