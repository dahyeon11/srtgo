package ai.maum.m2u.cdk.utils;

import androidx.appcompat.app.g;
import maum.m2u.map.Map;

/* loaded from: classes.dex */
public class G711 {
    public static final int BIAS = 132;
    static final int NSEGS = 8;
    static final int QUANT_MASK = 15;
    static final int SEG_SHIFT = 4;
    static final int SIGN_BIT = 128;
    static final int[] seg_end = {255, Map.MapException.StatusCode.GRPC_ROUTER_OPEN_ERROR_VALUE, 1023, 2047, 4095, 8191, 16383, 32767};
    static final int SEG_MASK = 112;
    static final int[] _u2a = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 27, 29, 31, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 46, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, Map.MapException.CALLED_INTERFACE_FIELD_NUMBER, 104, 105, 106, 107, g.FEATURE_SUPPORT_ACTION_BAR, g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 110, 111, SEG_MASK, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128};
    static final int[] _a2u = {1, 3, 5, 7, 9, 11, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 32, 33, 33, 34, 34, 35, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 48, 49, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, Map.MapException.CALLED_INTERFACE_FIELD_NUMBER, 104, 105, 106, 107, g.FEATURE_SUPPORT_ACTION_BAR, g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 110, 111, SEG_MASK, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127};

    public static int alaw2linear(int i8) {
        int i9 = i8 ^ 85;
        int i10 = (i9 & 15) << 4;
        int i11 = (i9 & SEG_MASK) >> 4;
        int i12 = i11 != 0 ? i11 != 1 ? (i10 + 264) << (i11 - 1) : i10 + 264 : i10 + 8;
        return (i9 & 128) != 0 ? i12 : -i12;
    }

    public static int alaw2ulaw(int i8) {
        int i9 = i8 & 255;
        return (i8 & 128) != 0 ? _a2u[i9 ^ 213] ^ 255 : _a2u[i9 ^ 85] ^ 127;
    }

    public static int linear2alaw(int i8) {
        int i9;
        if (i8 >= 0) {
            i9 = 213;
        } else {
            i8 = (-i8) - 8;
            i9 = 85;
        }
        int iSearch = search(i8, seg_end);
        if (iSearch >= 8) {
            return i9 ^ 127;
        }
        return (((iSearch < 2 ? i8 >> 4 : i8 >> (iSearch + 3)) & 15) | (iSearch << 4)) ^ i9;
    }

    public static int linear2ulaw(int i8) {
        int i9;
        int i10;
        if (i8 < 0) {
            i9 = 132 - i8;
            i10 = 127;
        } else {
            i9 = i8 + BIAS;
            i10 = 255;
        }
        int iSearch = search(i9, seg_end);
        if (iSearch >= 8) {
            return i10 ^ 127;
        }
        return (((i9 >> (iSearch + 3)) & 15) | (iSearch << 4)) ^ i10;
    }

    static int search(int i8, int[] iArr) {
        for (int i9 = 0; i9 < iArr.length; i9++) {
            if (i8 <= iArr[i9]) {
                return i9;
            }
        }
        return iArr.length;
    }

    public static int ulaw2alaw(int i8) {
        int i9 = i8 & 255;
        return (i8 & 128) != 0 ? (_u2a[i9 ^ 255] - 1) ^ 213 : (_u2a[i9 ^ 127] - 1) ^ 85;
    }

    public static int ulaw2linear(int i8) {
        int i9 = ~i8;
        int i10 = (((i9 & 15) << 3) + BIAS) << ((i9 & SEG_MASK) >> 4);
        return (i9 & 128) != 0 ? 132 - i10 : i10 - 132;
    }
}
