package com.google.android.gms.internal.ads;

import androidx.core.view.C0924a0;
import maum.m2u.map.Map;
import u.C6386i;

/* renamed from: com.google.android.gms.internal.ads.ye, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5003ye implements InterfaceC2650dz0 {
    UNKNOWN_EVENT_TYPE(0),
    AD_REQUEST(1),
    AD_LOADED(2),
    AD_IMPRESSION(5),
    AD_FIRST_CLICK(6),
    AD_SUBSEQUENT_CLICK(7),
    REQUEST_WILL_START(8),
    REQUEST_DID_END(9),
    REQUEST_WILL_UPDATE_SIGNALS(10),
    REQUEST_DID_UPDATE_SIGNALS(11),
    REQUEST_WILL_BUILD_URL(12),
    REQUEST_DID_BUILD_URL(13),
    REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
    REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
    REQUEST_WILL_PROCESS_RESPONSE(16),
    REQUEST_DID_PROCESS_RESPONSE(17),
    REQUEST_WILL_RENDER(18),
    REQUEST_DID_RENDER(19),
    AD_FAILED_TO_LOAD(3),
    AD_FAILED_TO_LOAD_NO_FILL(4),
    AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
    AD_FAILED_TO_LOAD_NETWORK_ERROR(101),
    AD_FAILED_TO_LOAD_TIMEOUT(102),
    AD_FAILED_TO_LOAD_CANCELLED(Map.MapException.CALLED_INTERFACE_FIELD_NUMBER),
    AD_FAILED_TO_LOAD_NO_ERROR(104),
    AD_FAILED_TO_LOAD_NOT_FOUND(105),
    REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
    REQUEST_DID_UPDATE_GMS_SIGNALS(1001),
    REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
    REQUEST_FAILED_TO_BUILD_URL(1003),
    REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
    REQUEST_FAILED_TO_PROCESS_RESPONSE(1005),
    REQUEST_FAILED_TO_UPDATE_SIGNALS(C0924a0.TYPE_CELL),
    REQUEST_FAILED_TO_RENDER(C0924a0.TYPE_CROSSHAIR),
    REQUEST_IS_PREFETCH(1100),
    REQUEST_SAVED_TO_CACHE(1101),
    REQUEST_LOADED_FROM_CACHE(1102),
    REQUEST_PREFETCH_INTERCEPTED(1103),
    REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED(1104),
    REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED(1105),
    NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED(1106),
    NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED(1107),
    REQUEST_FAILED_TO_LOAD_FROM_CACHE(1108),
    BANNER_SIZE_INVALID(10000),
    BANNER_SIZE_VALID(C6386i.CAMERA_UNAVAILABLE_DO_NOT_DISTURB),
    ANDROID_WEBVIEW_CRASH(C6386i.CAMERA_CHARACTERISTICS_CREATION_ERROR),
    OFFLINE_UPLOAD(10003),
    DELAY_PAGE_LOAD_CANCELLED_AD(10004);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f23980b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.xe
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            EnumC5003ye enumC5003ye = EnumC5003ye.UNKNOWN_EVENT_TYPE;
            switch (i8) {
                case 0:
                    return EnumC5003ye.UNKNOWN_EVENT_TYPE;
                case 1:
                    return EnumC5003ye.AD_REQUEST;
                case 2:
                    return EnumC5003ye.AD_LOADED;
                case 3:
                    return EnumC5003ye.AD_FAILED_TO_LOAD;
                case 4:
                    return EnumC5003ye.AD_FAILED_TO_LOAD_NO_FILL;
                case 5:
                    return EnumC5003ye.AD_IMPRESSION;
                case 6:
                    return EnumC5003ye.AD_FIRST_CLICK;
                case 7:
                    return EnumC5003ye.AD_SUBSEQUENT_CLICK;
                case 8:
                    return EnumC5003ye.REQUEST_WILL_START;
                case 9:
                    return EnumC5003ye.REQUEST_DID_END;
                case 10:
                    return EnumC5003ye.REQUEST_WILL_UPDATE_SIGNALS;
                case 11:
                    return EnumC5003ye.REQUEST_DID_UPDATE_SIGNALS;
                case 12:
                    return EnumC5003ye.REQUEST_WILL_BUILD_URL;
                case 13:
                    return EnumC5003ye.REQUEST_DID_BUILD_URL;
                case 14:
                    return EnumC5003ye.REQUEST_WILL_MAKE_NETWORK_REQUEST;
                case 15:
                    return EnumC5003ye.REQUEST_DID_RECEIVE_NETWORK_RESPONSE;
                case 16:
                    return EnumC5003ye.REQUEST_WILL_PROCESS_RESPONSE;
                case 17:
                    return EnumC5003ye.REQUEST_DID_PROCESS_RESPONSE;
                case 18:
                    return EnumC5003ye.REQUEST_WILL_RENDER;
                case 19:
                    return EnumC5003ye.REQUEST_DID_RENDER;
                default:
                    switch (i8) {
                        case 100:
                            return EnumC5003ye.AD_FAILED_TO_LOAD_INVALID_REQUEST;
                        case 101:
                            return EnumC5003ye.AD_FAILED_TO_LOAD_NETWORK_ERROR;
                        case 102:
                            return EnumC5003ye.AD_FAILED_TO_LOAD_TIMEOUT;
                        case Map.MapException.CALLED_INTERFACE_FIELD_NUMBER /* 103 */:
                            return EnumC5003ye.AD_FAILED_TO_LOAD_CANCELLED;
                        case 104:
                            return EnumC5003ye.AD_FAILED_TO_LOAD_NO_ERROR;
                        case 105:
                            return EnumC5003ye.AD_FAILED_TO_LOAD_NOT_FOUND;
                        default:
                            switch (i8) {
                                case 1000:
                                    return EnumC5003ye.REQUEST_WILL_UPDATE_GMS_SIGNALS;
                                case 1001:
                                    return EnumC5003ye.REQUEST_DID_UPDATE_GMS_SIGNALS;
                                case 1002:
                                    return EnumC5003ye.REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS;
                                case 1003:
                                    return EnumC5003ye.REQUEST_FAILED_TO_BUILD_URL;
                                case 1004:
                                    return EnumC5003ye.REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST;
                                case 1005:
                                    return EnumC5003ye.REQUEST_FAILED_TO_PROCESS_RESPONSE;
                                case C0924a0.TYPE_CELL /* 1006 */:
                                    return EnumC5003ye.REQUEST_FAILED_TO_UPDATE_SIGNALS;
                                case C0924a0.TYPE_CROSSHAIR /* 1007 */:
                                    return EnumC5003ye.REQUEST_FAILED_TO_RENDER;
                                default:
                                    switch (i8) {
                                        case 1100:
                                            return EnumC5003ye.REQUEST_IS_PREFETCH;
                                        case 1101:
                                            return EnumC5003ye.REQUEST_SAVED_TO_CACHE;
                                        case 1102:
                                            return EnumC5003ye.REQUEST_LOADED_FROM_CACHE;
                                        case 1103:
                                            return EnumC5003ye.REQUEST_PREFETCH_INTERCEPTED;
                                        case 1104:
                                            return EnumC5003ye.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
                                        case 1105:
                                            return EnumC5003ye.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
                                        case 1106:
                                            return EnumC5003ye.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
                                        case 1107:
                                            return EnumC5003ye.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
                                        case 1108:
                                            return EnumC5003ye.REQUEST_FAILED_TO_LOAD_FROM_CACHE;
                                        default:
                                            switch (i8) {
                                                case 10000:
                                                    return EnumC5003ye.BANNER_SIZE_INVALID;
                                                case C6386i.CAMERA_UNAVAILABLE_DO_NOT_DISTURB /* 10001 */:
                                                    return EnumC5003ye.BANNER_SIZE_VALID;
                                                case C6386i.CAMERA_CHARACTERISTICS_CREATION_ERROR /* 10002 */:
                                                    return EnumC5003ye.ANDROID_WEBVIEW_CRASH;
                                                case 10003:
                                                    return EnumC5003ye.OFFLINE_UPLOAD;
                                                case 10004:
                                                    return EnumC5003ye.DELAY_PAGE_LOAD_CANCELLED_AD;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f23982a;

    EnumC5003ye(int i8) {
        this.f23982a = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f23982a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f23982a;
    }
}
