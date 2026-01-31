package F3;

import java.util.List;

/* loaded from: classes2.dex */
public enum e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(t.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);


    /* renamed from: a, reason: collision with root package name */
    private final Class f1138a;

    e(Class cls) {
        this.f1138a = cls;
    }

    public Class<?> getValueType() {
        return this.f1138a;
    }
}
