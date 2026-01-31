package p7;

import R6.G;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: p7.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6074l {
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    public static final void cancelConsumed(InterfaceC6098w interfaceC6098w, Throwable th) {
        AbstractC6076n.cancelConsumed(interfaceC6098w, th);
    }

    public static final <E, R> R consume(InterfaceC6063a interfaceC6063a, f7.l lVar) {
        return (R) AbstractC6076n.consume(interfaceC6063a, lVar);
    }

    public static final <E> Object consumeEach(InterfaceC6063a interfaceC6063a, f7.l lVar, W6.d<? super G> dVar) {
        return AbstractC6076n.consumeEach(interfaceC6063a, lVar, dVar);
    }

    public static final f7.l consumes(InterfaceC6098w interfaceC6098w) {
        return AbstractC6077o.consumes(interfaceC6098w);
    }

    public static final f7.l consumesAll(InterfaceC6098w... interfaceC6098wArr) {
        return AbstractC6077o.consumesAll(interfaceC6098wArr);
    }

    public static final <E, K> InterfaceC6098w distinctBy(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6077o.distinctBy(interfaceC6098w, gVar, pVar);
    }

    public static final <E> InterfaceC6098w filter(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6077o.filter(interfaceC6098w, gVar, pVar);
    }

    public static final <E> InterfaceC6098w filterNotNull(InterfaceC6098w interfaceC6098w) {
        return AbstractC6077o.filterNotNull(interfaceC6098w);
    }

    public static final <E, R> InterfaceC6098w map(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6077o.map(interfaceC6098w, gVar, pVar);
    }

    public static final <E, R> InterfaceC6098w mapIndexed(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.q qVar) {
        return AbstractC6077o.mapIndexed(interfaceC6098w, gVar, qVar);
    }

    public static final <E, C extends InterfaceC6099x> Object toChannel(InterfaceC6098w interfaceC6098w, C c9, W6.d<? super C> dVar) {
        return AbstractC6077o.toChannel(interfaceC6098w, c9, dVar);
    }

    public static final <E, C extends Collection<? super E>> Object toCollection(InterfaceC6098w interfaceC6098w, C c9, W6.d<? super C> dVar) {
        return AbstractC6077o.toCollection(interfaceC6098w, c9, dVar);
    }

    public static final <E> Object toList(InterfaceC6098w interfaceC6098w, W6.d<? super List<? extends E>> dVar) {
        return AbstractC6076n.toList(interfaceC6098w, dVar);
    }

    public static final <E> Object toMutableSet(InterfaceC6098w interfaceC6098w, W6.d<? super Set<E>> dVar) {
        return AbstractC6077o.toMutableSet(interfaceC6098w, dVar);
    }

    public static final <E> Object trySendBlocking(InterfaceC6099x interfaceC6099x, E e8) {
        return AbstractC6075m.trySendBlocking(interfaceC6099x, e8);
    }

    public static final <E, R> R consume(InterfaceC6098w interfaceC6098w, f7.l lVar) {
        return (R) AbstractC6076n.consume(interfaceC6098w, lVar);
    }

    public static final <E> Object consumeEach(InterfaceC6098w interfaceC6098w, f7.l lVar, W6.d<? super G> dVar) {
        return AbstractC6076n.consumeEach(interfaceC6098w, lVar, dVar);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(InterfaceC6098w interfaceC6098w, M m8, W6.d<? super M> dVar) {
        return AbstractC6077o.toMap(interfaceC6098w, m8, dVar);
    }

    public static final <E, R, V> InterfaceC6098w zip(InterfaceC6098w interfaceC6098w, InterfaceC6098w interfaceC6098w2, W6.g gVar, f7.p pVar) {
        return AbstractC6077o.zip(interfaceC6098w, interfaceC6098w2, gVar, pVar);
    }
}
