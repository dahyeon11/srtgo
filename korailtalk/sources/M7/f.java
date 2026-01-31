package m7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class f extends C5918e {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC5917d.values().length];
            try {
                iArr[EnumC5917d.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5917d.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5917d.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5917d.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5917d.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC5917d.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC5917d.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EnumC5917d durationUnitByIsoChar(char c9, boolean z8) {
        if (!z8) {
            if (c9 == 'D') {
                return EnumC5917d.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c9);
        }
        if (c9 == 'H') {
            return EnumC5917d.HOURS;
        }
        if (c9 == 'M') {
            return EnumC5917d.MINUTES;
        }
        if (c9 == 'S') {
            return EnumC5917d.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c9);
    }

    public static final EnumC5917d durationUnitByShortName(String shortName) {
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return EnumC5917d.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return EnumC5917d.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return EnumC5917d.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return EnumC5917d.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return EnumC5917d.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return EnumC5917d.HOURS;
            }
        } else if (shortName.equals("d")) {
            return EnumC5917d.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    public static final String shortName(EnumC5917d enumC5917d) {
        Intrinsics.checkNotNullParameter(enumC5917d, "<this>");
        switch (a.$EnumSwitchMapping$0[enumC5917d.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + enumC5917d).toString());
        }
    }
}
