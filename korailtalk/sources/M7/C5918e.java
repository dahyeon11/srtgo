package m7;

import R6.n;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5918e {

    /* renamed from: m7.e$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final double convertDurationUnit(double d9, EnumC5917d sourceUnit, EnumC5917d targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, sourceUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d9 * jConvert : d9 / sourceUnit.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long convertDurationUnitOverflow(long j8, EnumC5917d sourceUnit, EnumC5917d targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j8, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final EnumC5917d toDurationUnit(TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "<this>");
        switch (a.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                return EnumC5917d.NANOSECONDS;
            case 2:
                return EnumC5917d.MICROSECONDS;
            case 3:
                return EnumC5917d.MILLISECONDS;
            case 4:
                return EnumC5917d.SECONDS;
            case 5:
                return EnumC5917d.MINUTES;
            case 6:
                return EnumC5917d.HOURS;
            case 7:
                return EnumC5917d.DAYS;
            default:
                throw new n();
        }
    }

    public static final TimeUnit toTimeUnit(EnumC5917d enumC5917d) {
        Intrinsics.checkNotNullParameter(enumC5917d, "<this>");
        return enumC5917d.getTimeUnit$kotlin_stdlib();
    }

    public static final long convertDurationUnit(long j8, EnumC5917d sourceUnit, EnumC5917d targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j8, sourceUnit.getTimeUnit$kotlin_stdlib());
    }
}
