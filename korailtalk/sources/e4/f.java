package e4;

import R.k;
import a4.AbstractC0834a;
import ai.maum.m2u.cdk.utils.G711;
import com.google.firebase.iid.w;
import maum.m2u.map.Map;

/* loaded from: classes2.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int[][] f30454a = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, G711.BIAS, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, Map.MapException.StatusCode.GRPC_AUTH_SIGN_OUT_ERROR_VALUE, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, Map.MapException.StatusCode.GRPC_ROUTER_OPEN_ERROR_VALUE, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, Map.MapException.StatusCode.GRPC_IDR_ERROR_VALUE, 648, 733, 717, 83, Map.MapException.StatusCode.ROUTER_DA_NOT_FOUND_VALUE, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, Map.MapException.StatusCode.MAP_NO_STREAM_PARAM_VALUE, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, 208, AbstractC0834a.MAX_CODEWORDS_IN_BARCODE, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, 704, Map.MapException.StatusCode.GRPC_STT_TRANSCRIPT_NULL_ERROR_VALUE, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, Map.MapException.StatusCode.GRPC_AUTH_IS_VALID_ERROR_VALUE, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, Map.MapException.StatusCode.MAP_CURRENTLY_HAS_NO_STREAM_VALUE, 550, 86, 801, 4, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, Map.MapException.StatusCode.MAP_IF_NOT_FOUND_VALUE, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, k.OPTIMIZATION_STANDARD, 284, 549, 209, 884, Map.MapException.StatusCode.MAP_CURRENTLY_HAS_NO_STREAM_VALUE, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, Map.MapException.CALLED_INTERFACE_FIELD_NUMBER, Map.MapException.StatusCode.GRPC_ROUTER_OPEN_ERROR_VALUE, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, Map.MapException.StatusCode.MAP_CLASS_NOT_FOUND_VALUE, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, Map.MapException.StatusCode.GRPC_TTS_ERROR_VALUE, 118, 49, 795, 32, 144, w.ERROR_UNKNOWN, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, Map.MapException.StatusCode.ROUTER_SESSION_INVALID_VALUE, 41, 656, Map.MapException.StatusCode.GRPC_AUTH_SIGN_OUT_ERROR_VALUE, 579, 481, 173, Map.MapException.StatusCode.ROUTER_DA_NOT_FOUND_VALUE, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, Map.MapException.StatusCode.GRPC_AUTH_SIGN_IN_ERROR_VALUE, 35, 599, 428, 207, Map.MapException.StatusCode.MAP_SYSTEM_MAINTENANCE_VALUE, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, Map.MapException.StatusCode.MAP_TOTAL_SESSION_COUNT_EXCEEDED_VALUE, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, Map.MapException.StatusCode.ROUTER_ITF_ERROR_VALUE, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, Map.MapException.StatusCode.GRPC_ROUTER_EVENT_ERROR_VALUE, 192, Map.MapException.StatusCode.GRPC_STT_TRANSCRIPT_NULL_ERROR_VALUE, 258, 240, 518, 794, 395, 768, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, Map.MapException.StatusCode.AUTH_FAILED_VALUE, 570, 381, 415, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, Map.MapException.StatusCode.AUTH_INVALID_HEADER_VALUE, Map.MapException.StatusCode.ROUTER_SESSION_INVALID_VALUE, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, Map.MapException.StatusCode.GRPC_ROUTER_OPEN_ERROR_VALUE, 327, 589, 777, 699, 688, 43, Map.MapException.StatusCode.MAP_TOTAL_SESSION_COUNT_EXCEEDED_VALUE, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, 563, 564, 343, 693, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 608, 563, 365, 181, 772, 677, Map.MapException.StatusCode.MAP_NO_STREAM_PARAM_VALUE, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, Map.MapException.StatusCode.ROUTER_ITF_ERROR_VALUE, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, Map.MapException.StatusCode.AUTH_CHECK_AUTH_FAILED_VALUE, 441, 207, 300, 892, 827, 141, 537, 381, 662, Map.MapException.StatusCode.GRPC_ROUTER_EVENT_ERROR_VALUE, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, Map.MapException.StatusCode.MAP_NO_STREAM_PARAM_VALUE, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, Map.MapException.StatusCode.AUTH_FAILED_VALUE, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, Map.MapException.StatusCode.MAP_IF_NOT_FOUND_VALUE, 424, 242, 749, 321, 54, 669, Map.MapException.StatusCode.MAP_STREAM_ID_NOT_MATCH_VALUE, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, Map.MapException.StatusCode.MAP_STREAM_ID_NOT_MATCH_VALUE, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, Map.MapException.StatusCode.ROUTER_ITF_ERROR_VALUE, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, Map.MapException.StatusCode.MAP_NO_STREAM_PARAM_VALUE, 863, 251, 366, Map.MapException.StatusCode.AUTH_INVALID_HEADER_VALUE, 282, 738, 675, 410, 389, 244, 31, 121, Map.MapException.StatusCode.AUTH_FAILED_VALUE, 263}};

    static String a(CharSequence charSequence, int i8) {
        int iB = b(i8);
        char[] cArr = new char[iB];
        int length = charSequence.length();
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = iB - 1;
            int iCharAt = (charSequence.charAt(i9) + cArr[i10]) % AbstractC0834a.NUMBER_OF_CODEWORDS;
            while (i10 > 0) {
                cArr[i10] = (char) ((cArr[i10 - 1] + (929 - ((f30454a[i8][i10] * iCharAt) % AbstractC0834a.NUMBER_OF_CODEWORDS))) % AbstractC0834a.NUMBER_OF_CODEWORDS);
                i10--;
            }
            cArr[0] = (char) ((929 - ((iCharAt * f30454a[i8][0]) % AbstractC0834a.NUMBER_OF_CODEWORDS)) % AbstractC0834a.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(iB);
        for (int i11 = iB - 1; i11 >= 0; i11--) {
            char c9 = cArr[i11];
            if (c9 != 0) {
                cArr[i11] = (char) (929 - c9);
            }
            sb.append(cArr[i11]);
        }
        return sb.toString();
    }

    static int b(int i8) {
        if (i8 < 0 || i8 > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i8 + 1);
    }
}
