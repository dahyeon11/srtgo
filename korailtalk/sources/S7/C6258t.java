package s7;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s7.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6258t extends C6260v {
    public final /* synthetic */ <T extends C6260v> void forEach(f7.l lVar) {
        Object next = getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        for (C6260v nextNode = (C6260v) next; !Intrinsics.areEqual(nextNode, this); nextNode = nextNode.getNextNode()) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (nextNode != null) {
                lVar.invoke(nextNode);
            }
        }
    }

    public final boolean isEmpty() {
        return getNext() == this;
    }

    @Override // s7.C6260v
    public boolean isRemoved() {
        return false;
    }

    @Override // s7.C6260v
    /* renamed from: remove, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo591remove() {
        return ((Boolean) remove()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [s7.v] */
    public final void validate$kotlinx_coroutines_core() {
        Object next = getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C6258t c6258t = this;
        C6258t c6258t2 = (C6260v) next;
        while (!Intrinsics.areEqual(c6258t2, this)) {
            C6260v nextNode = c6258t2.getNextNode();
            c6258t2.validateNode$kotlinx_coroutines_core(c6258t, nextNode);
            c6258t = c6258t2;
            c6258t2 = nextNode;
        }
        Object next2 = getNext();
        Intrinsics.checkNotNull(next2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        validateNode$kotlinx_coroutines_core(c6258t, (C6260v) next2);
    }

    public final Void remove() {
        throw new IllegalStateException("head cannot be removed");
    }
}
