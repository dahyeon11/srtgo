package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface KCallable<R> extends KAnnotatedElement {

    public static final class DefaultImpls {
        public static /* synthetic */ void getName$annotations() {
        }

        public static /* synthetic */ void getParameters$annotations() {
        }

        public static /* synthetic */ void getReturnType$annotations() {
        }

        public static /* synthetic */ void getTypeParameters$annotations() {
        }

        public static /* synthetic */ void getVisibility$annotations() {
        }

        public static /* synthetic */ void isAbstract$annotations() {
        }

        public static /* synthetic */ void isFinal$annotations() {
        }

        public static /* synthetic */ void isOpen$annotations() {
        }

        public static /* synthetic */ void isSuspend$annotations() {
        }
    }

    R call(Object... objArr);

    R callBy(Map<KParameter, ? extends Object> map);

    String getName();

    List<KParameter> getParameters();

    KType getReturnType();

    List<KTypeParameter> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
