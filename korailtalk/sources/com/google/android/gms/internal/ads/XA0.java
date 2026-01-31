package com.google.android.gms.internal.ads;

import androidx.core.view.C0924a0;

/* loaded from: classes2.dex */
public enum XA0 implements InterfaceC2650dz0 {
    USER_POPULATION_UNSPECIFIED(0),
    CARTER_SB_CHROME_INTERSTITIAL(1),
    GMAIL_PHISHY_JOURNEY(2),
    DOWNLOAD_RELATED_POPULATION_MIN(1000),
    RISKY_DOWNLOADER(1001),
    INFREQUENT_DOWNLOADER(1002),
    REGULAR_DOWNLOADER(1003),
    BOTLIKE_DOWNLOADER(1004),
    DOCUMENT_DOWNLOADER(1005),
    HIGHLY_TECHNICAL_DOWNLOADER(C0924a0.TYPE_CELL),
    LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE(C0924a0.TYPE_CROSSHAIR),
    HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE(C0924a0.TYPE_TEXT),
    SPAM_PING_SENDER(C0924a0.TYPE_VERTICAL_TEXT),
    RFA_TRUSTED(C0924a0.TYPE_ALIAS),
    DOWNLOAD_RELATED_POPULATION_MAX(1999);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f17146b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.VA0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            return XA0.zzc(i8);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f17148a;

    XA0(int i8) {
        this.f17148a = i8;
    }

    public static InterfaceC2880fz0 zzb() {
        return WA0.f16937a;
    }

    public static XA0 zzc(int i8) {
        if (i8 == 0) {
            return USER_POPULATION_UNSPECIFIED;
        }
        if (i8 == 1) {
            return CARTER_SB_CHROME_INTERSTITIAL;
        }
        if (i8 == 2) {
            return GMAIL_PHISHY_JOURNEY;
        }
        if (i8 == 1999) {
            return DOWNLOAD_RELATED_POPULATION_MAX;
        }
        switch (i8) {
            case 1000:
                return DOWNLOAD_RELATED_POPULATION_MIN;
            case 1001:
                return RISKY_DOWNLOADER;
            case 1002:
                return INFREQUENT_DOWNLOADER;
            case 1003:
                return REGULAR_DOWNLOADER;
            case 1004:
                return BOTLIKE_DOWNLOADER;
            case 1005:
                return DOCUMENT_DOWNLOADER;
            case C0924a0.TYPE_CELL /* 1006 */:
                return HIGHLY_TECHNICAL_DOWNLOADER;
            case C0924a0.TYPE_CROSSHAIR /* 1007 */:
                return LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE;
            case C0924a0.TYPE_TEXT /* 1008 */:
                return HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE;
            case C0924a0.TYPE_VERTICAL_TEXT /* 1009 */:
                return SPAM_PING_SENDER;
            case C0924a0.TYPE_ALIAS /* 1010 */:
                return RFA_TRUSTED;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f17148a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f17148a;
    }
}
