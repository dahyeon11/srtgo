package n7;

import kotlin.jvm.internal.Intrinsics;
import s7.C6258t;
import s7.C6260v;

/* loaded from: classes3.dex */
public final class G0 extends C6258t implements InterfaceC5999o0 {
    public final String getString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object next = getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z8 = true;
        for (C6260v nextNode = (C6260v) next; !Intrinsics.areEqual(nextNode, this); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof A0) {
                A0 a02 = (A0) nextNode;
                if (z8) {
                    z8 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(a02);
            }
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // n7.InterfaceC5999o0
    public boolean isActive() {
        return true;
    }

    @Override // s7.C6260v
    public String toString() {
        return super.toString();
    }

    @Override // n7.InterfaceC5999o0
    public G0 getList() {
        return this;
    }
}
