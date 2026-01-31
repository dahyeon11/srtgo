package io.grpc;

/* renamed from: io.grpc.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5800q extends AbstractC5725g {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5725g f33278a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5719d f33279b;

    private C5800q(AbstractC5725g abstractC5725g, AbstractC5719d abstractC5719d) {
        this.f33278a = (AbstractC5725g) e3.w.checkNotNull(abstractC5725g, "channelCreds");
        this.f33279b = (AbstractC5719d) e3.w.checkNotNull(abstractC5719d, "callCreds");
    }

    public static AbstractC5725g create(AbstractC5725g abstractC5725g, AbstractC5719d abstractC5719d) {
        return new C5800q(abstractC5725g, abstractC5719d);
    }

    public AbstractC5719d getCallCredentials() {
        return this.f33279b;
    }

    public AbstractC5725g getChannelCredentials() {
        return this.f33278a;
    }

    @Override // io.grpc.AbstractC5725g
    public AbstractC5725g withoutBearerTokens() {
        return this.f33278a.withoutBearerTokens();
    }
}
