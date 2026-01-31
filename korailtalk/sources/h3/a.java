package H3;

import F3.h;
import O3.c;
import Q7.X;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.delay.CashRfnDao;
import com.korail.talk.network.dao.giftInfo.TicketPresentDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import e0.C5339a;
import g5.e;
import java.util.Arrays;
import y1.x;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f1794b = {"CTRL_PS", X.SPACE, "A", CashRfnDao.f27551B, "C", HelpSrvCustDao.HelpSrvCustRequest.f27549D, "E", "F", x.MAX_AD_CONTENT_RATING_G, "H", CashRfnDao.f27552I, "J", "K", "L", "M", "N", TicketPresentDao.DEFAULT_HID_INFO_INP_DV_CD, "P", "Q", "R", "S", "T", "U", C5339a.GPS_MEASUREMENT_INTERRUPTED, C5339a.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f1795c = {"CTRL_PS", X.SPACE, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f1796d = {"CTRL_PS", X.SPACE, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", X.LF, "\u000b", "\f", X.CR, "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f1797e = {"", X.CR, "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", e.STATE_NAME_NONE, ".", "/", ":", ";", SimpleComparison.LESS_THAN_OPERATION, SimpleComparison.EQUAL_TO_OPERATION, SimpleComparison.GREATER_THAN_OPERATION, "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f1798f = {"CTRL_PS", X.SPACE, "0", "1", "2", "3", StbkAcntDao.ACCOUNT_REGISTER, StbkAcntDao.CHANGE_PASSWORD, "6", "7", "8", StbkAcntDao.DELETE_ACCOUNT, ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a, reason: collision with root package name */
    private G3.a f1799a;

    /* renamed from: H3.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0036a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1800a;

        static {
            int[] iArr = new int[b.values().length];
            f1800a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1800a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1800a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1800a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1800a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr[i8] = g(zArr, i8 << 3);
        }
        return bArr;
    }

    private boolean[] b(boolean[] zArr) throws h {
        int i8;
        O3.a aVar;
        if (this.f1799a.getNbLayers() <= 2) {
            aVar = O3.a.AZTEC_DATA_6;
            i8 = 6;
        } else {
            i8 = 8;
            if (this.f1799a.getNbLayers() <= 8) {
                aVar = O3.a.AZTEC_DATA_8;
            } else if (this.f1799a.getNbLayers() <= 22) {
                aVar = O3.a.AZTEC_DATA_10;
                i8 = 10;
            } else {
                aVar = O3.a.AZTEC_DATA_12;
                i8 = 12;
            }
        }
        int nbDatablocks = this.f1799a.getNbDatablocks();
        int length = zArr.length / i8;
        if (length < nbDatablocks) {
            throw h.getFormatInstance();
        }
        int length2 = zArr.length % i8;
        int[] iArr = new int[length];
        int i9 = 0;
        while (i9 < length) {
            iArr[i9] = h(zArr, length2, i8);
            i9++;
            length2 += i8;
        }
        try {
            new c(aVar).decode(iArr, length - nbDatablocks);
            int i10 = 1 << i8;
            int i11 = i10 - 1;
            int i12 = 0;
            for (int i13 = 0; i13 < nbDatablocks; i13++) {
                int i14 = iArr[i13];
                if (i14 == 0 || i14 == i11) {
                    throw h.getFormatInstance();
                }
                if (i14 == 1 || i14 == i10 - 2) {
                    i12++;
                }
            }
            boolean[] zArr2 = new boolean[(nbDatablocks * i8) - i12];
            int i15 = 0;
            for (int i16 = 0; i16 < nbDatablocks; i16++) {
                int i17 = iArr[i16];
                if (i17 == 1 || i17 == i10 - 2) {
                    Arrays.fill(zArr2, i15, (i15 + i8) - 1, i17 > 1);
                    i15 += i8 - 1;
                } else {
                    int i18 = i8 - 1;
                    while (i18 >= 0) {
                        int i19 = i15 + 1;
                        zArr2[i15] = ((1 << i18) & i17) != 0;
                        i18--;
                        i15 = i19;
                    }
                }
            }
            return zArr2;
        } catch (O3.e e8) {
            throw h.getFormatInstance(e8);
        }
    }

    private boolean[] c(M3.b bVar) {
        boolean zIsCompact = this.f1799a.isCompact();
        int nbLayers = this.f1799a.getNbLayers();
        int i8 = (zIsCompact ? 11 : 14) + (nbLayers << 2);
        int[] iArr = new int[i8];
        boolean[] zArr = new boolean[i(nbLayers, zIsCompact)];
        int i9 = 2;
        if (zIsCompact) {
            for (int i10 = 0; i10 < i8; i10++) {
                iArr[i10] = i10;
            }
        } else {
            int i11 = i8 / 2;
            int i12 = ((i8 + 1) + (((i11 - 1) / 15) * 2)) / 2;
            for (int i13 = 0; i13 < i11; i13++) {
                iArr[(i11 - i13) - 1] = (i12 - r12) - 1;
                iArr[i11 + i13] = (i13 / 15) + i13 + i12 + 1;
            }
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < nbLayers) {
            int i16 = ((nbLayers - i14) << i9) + (zIsCompact ? 9 : 12);
            int i17 = i14 << 1;
            int i18 = (i8 - 1) - i17;
            int i19 = 0;
            while (i19 < i16) {
                int i20 = i19 << 1;
                int i21 = 0;
                while (i21 < i9) {
                    int i22 = i17 + i21;
                    int i23 = i17 + i19;
                    zArr[i15 + i20 + i21] = bVar.get(iArr[i22], iArr[i23]);
                    int i24 = iArr[i23];
                    int i25 = i18 - i21;
                    zArr[(i16 * 2) + i15 + i20 + i21] = bVar.get(i24, iArr[i25]);
                    int i26 = i18 - i19;
                    zArr[(i16 * 4) + i15 + i20 + i21] = bVar.get(iArr[i25], iArr[i26]);
                    zArr[(i16 * 6) + i15 + i20 + i21] = bVar.get(iArr[i26], iArr[i22]);
                    i21++;
                    nbLayers = nbLayers;
                    zIsCompact = zIsCompact;
                    i9 = 2;
                }
                i19++;
                i9 = 2;
            }
            i15 += i16 << 3;
            i14++;
            i9 = 2;
        }
        return zArr;
    }

    private static String d(b bVar, int i8) {
        int i9 = C0036a.f1800a[bVar.ordinal()];
        if (i9 == 1) {
            return f1794b[i8];
        }
        if (i9 == 2) {
            return f1795c[i8];
        }
        if (i9 == 3) {
            return f1796d[i8];
        }
        if (i9 == 4) {
            return f1797e[i8];
        }
        if (i9 == 5) {
            return f1798f[i8];
        }
        throw new IllegalStateException("Bad table");
    }

    private static String e(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        b bVarF = bVar;
        int i8 = 0;
        while (i8 < length) {
            if (bVar != b.BINARY) {
                int i9 = bVar == b.DIGIT ? 4 : 5;
                if (length - i8 < i9) {
                    break;
                }
                int iH = h(zArr, i8, i9);
                i8 += i9;
                String strD = d(bVar, iH);
                if (strD.startsWith("CTRL_")) {
                    bVarF = f(strD.charAt(5));
                    if (strD.charAt(6) != 'L') {
                        bVarF = bVar;
                        bVar = bVarF;
                    }
                } else {
                    sb.append(strD);
                }
                bVar = bVarF;
            } else {
                if (length - i8 < 5) {
                    break;
                }
                int iH2 = h(zArr, i8, 5);
                int i10 = i8 + 5;
                if (iH2 == 0) {
                    if (length - i10 < 11) {
                        break;
                    }
                    iH2 = h(zArr, i10, 11) + 31;
                    i10 = i8 + 16;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= iH2) {
                        i8 = i10;
                        break;
                    }
                    if (length - i10 < 8) {
                        i8 = length;
                        break;
                    }
                    sb.append((char) h(zArr, i10, 8));
                    i10 += 8;
                    i11++;
                }
                bVar = bVarF;
            }
        }
        return sb.toString();
    }

    private static b f(char c9) {
        return c9 != 'B' ? c9 != 'D' ? c9 != 'P' ? c9 != 'L' ? c9 != 'M' ? b.UPPER : b.MIXED : b.LOWER : b.PUNCT : b.DIGIT : b.BINARY;
    }

    private static byte g(boolean[] zArr, int i8) {
        int length = zArr.length - i8;
        return (byte) (length >= 8 ? h(zArr, i8, 8) : h(zArr, i8, length) << (8 - length));
    }

    private static int h(boolean[] zArr, int i8, int i9) {
        int i10 = 0;
        for (int i11 = i8; i11 < i8 + i9; i11++) {
            i10 <<= 1;
            if (zArr[i11]) {
                i10 |= 1;
            }
        }
        return i10;
    }

    public static String highLevelDecode(boolean[] zArr) {
        return e(zArr);
    }

    private static int i(int i8, boolean z8) {
        return ((z8 ? 88 : 112) + (i8 << 4)) * i8;
    }

    public M3.e decode(G3.a aVar) throws h {
        this.f1799a = aVar;
        boolean[] zArrB = b(c(aVar.getBits()));
        M3.e eVar = new M3.e(a(zArrB), e(zArrB), null, null);
        eVar.setNumBits(zArrB.length);
        return eVar;
    }
}
