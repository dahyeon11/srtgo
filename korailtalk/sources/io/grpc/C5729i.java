package io.grpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.grpc.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5729i extends AbstractC5725g {

    /* renamed from: a, reason: collision with root package name */
    private final List f32149a;

    private C5729i(List list) {
        this.f32149a = list;
    }

    public static AbstractC5725g create(AbstractC5725g... abstractC5725gArr) {
        if (abstractC5725gArr.length == 0) {
            throw new IllegalArgumentException("At least one credential is required");
        }
        for (AbstractC5725g abstractC5725g : abstractC5725gArr) {
            abstractC5725g.getClass();
        }
        return new C5729i(Collections.unmodifiableList(new ArrayList(Arrays.asList(abstractC5725gArr))));
    }

    public List<AbstractC5725g> getCredentialsList() {
        return this.f32149a;
    }

    @Override // io.grpc.AbstractC5725g
    public AbstractC5725g withoutBearerTokens() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f32149a.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC5725g) it.next()).withoutBearerTokens());
        }
        return new C5729i(Collections.unmodifiableList(arrayList));
    }
}
