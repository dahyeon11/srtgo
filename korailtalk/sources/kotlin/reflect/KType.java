package kotlin.reflect;

import java.util.List;

/* loaded from: classes3.dex */
public interface KType extends KAnnotatedElement {

    public static final class DefaultImpls {
        public static /* synthetic */ void getArguments$annotations() {
        }

        public static /* synthetic */ void getClassifier$annotations() {
        }
    }

    List<KTypeProjection> getArguments();

    KClassifier getClassifier();

    boolean isMarkedNullable();
}
