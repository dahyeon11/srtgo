package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum F9 implements InterfaceC2650dz0 {
    ERROR_ENCODE_SIZE_FAIL(1),
    ERROR_UNKNOWN(3),
    ERROR_NO_SIGNALS(5),
    ERROR_ENCRYPTION(7),
    ERROR_MEMORY(9),
    ERROR_SIMULATOR(11),
    ERROR_SERVICE(13),
    ERROR_THREAD(15),
    ERROR_COLLECTION_TIMEOUT(17),
    PSN_WEB64_FAIL(2),
    PSN_DECRYPT_SIZE_FAIL(4),
    PSN_MD5_CHECK_FAIL(8),
    PSN_MD5_SIZE_FAIL(16),
    PSN_MD5_FAIL(32),
    PSN_DECODE_FAIL(64),
    PSN_SALT_FAIL(128),
    PSN_BITSLICER_FAIL(256),
    PSN_REQUEST_TYPE_FAIL(512),
    PSN_INVALID_ERROR_CODE(1024),
    PSN_TIMESTAMP_EXPIRED(2048),
    PSN_ENCODE_SIZE_FAIL(4096),
    PSN_BLANK_VALUE(8192),
    PSN_INITIALIZATION_FAIL(16384),
    PSN_GASS_CLIENT_FAIL(32768),
    PSN_SIGNALS_TIMEOUT(65536),
    PSN_TINK_FAIL(131072);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f12949b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.E9
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            F9 f9 = F9.ERROR_ENCODE_SIZE_FAIL;
            if (i8 == 1) {
                return F9.ERROR_ENCODE_SIZE_FAIL;
            }
            if (i8 == 2) {
                return F9.PSN_WEB64_FAIL;
            }
            if (i8 == 3) {
                return F9.ERROR_UNKNOWN;
            }
            if (i8 == 4) {
                return F9.PSN_DECRYPT_SIZE_FAIL;
            }
            if (i8 == 5) {
                return F9.ERROR_NO_SIGNALS;
            }
            if (i8 == 7) {
                return F9.ERROR_ENCRYPTION;
            }
            if (i8 == 8) {
                return F9.PSN_MD5_CHECK_FAIL;
            }
            if (i8 == 9) {
                return F9.ERROR_MEMORY;
            }
            switch (i8) {
                case 11:
                    return F9.ERROR_SIMULATOR;
                case 13:
                    return F9.ERROR_SERVICE;
                case 32:
                    return F9.PSN_MD5_FAIL;
                case 64:
                    return F9.PSN_DECODE_FAIL;
                case 128:
                    return F9.PSN_SALT_FAIL;
                case 256:
                    return F9.PSN_BITSLICER_FAIL;
                case 512:
                    return F9.PSN_REQUEST_TYPE_FAIL;
                case 1024:
                    return F9.PSN_INVALID_ERROR_CODE;
                case 2048:
                    return F9.PSN_TIMESTAMP_EXPIRED;
                case 4096:
                    return F9.PSN_ENCODE_SIZE_FAIL;
                case 8192:
                    return F9.PSN_BLANK_VALUE;
                case 16384:
                    return F9.PSN_INITIALIZATION_FAIL;
                case 32768:
                    return F9.PSN_GASS_CLIENT_FAIL;
                case 65536:
                    return F9.PSN_SIGNALS_TIMEOUT;
                case 131072:
                    return F9.PSN_TINK_FAIL;
                default:
                    switch (i8) {
                        case 15:
                            return F9.ERROR_THREAD;
                        case 16:
                            return F9.PSN_MD5_SIZE_FAIL;
                        case 17:
                            return F9.ERROR_COLLECTION_TIMEOUT;
                        default:
                            return null;
                    }
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f12951a;

    F9(int i8) {
        this.f12951a = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12951a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f12951a;
    }
}
