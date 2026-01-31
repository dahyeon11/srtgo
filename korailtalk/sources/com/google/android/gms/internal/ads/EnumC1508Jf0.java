package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1508Jf0 implements InterfaceC2650dz0 {
    UNKNOWN(0),
    PROVIDENCE(1),
    INTENT_OPERATION(2),
    BROADCAST_RECEIVER(3),
    CONTENT_PROVIDER(4),
    ACTIVITY(5),
    SERVICE(6),
    BINDER(7),
    SYNC_ADAPTER(8),
    GCM_TASK(9),
    INTENT_SERVICE(10),
    SERVICE_CONNECTION(11),
    GCM_LISTENER(12),
    CALLBACKS(13),
    ALARM_LISTENER(14),
    CUSTOM_EVENT_LOOP(15),
    SENSOR_EVENT_LISTENER(16),
    BLE_SCAN_CALLBACK(17),
    BINDER_BY_INTERCEPTOR(18),
    CONTENT_OBSERVER(19),
    BACKUP_AGENT(20),
    SLICE_PROVIDER(21),
    LOCATION_LISTENER(22),
    GMS_APPLICATION(23),
    OAUTH(24),
    LOCATION_CALLBACKS(25),
    BT_ADAPTER(26),
    NETWORK_CALLBACK(27),
    JOB_SERVICE(28);


    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2765ez0 f13674b = new InterfaceC2765ez0() { // from class: com.google.android.gms.internal.ads.If0
        @Override // com.google.android.gms.internal.ads.InterfaceC2765ez0
        public final /* synthetic */ InterfaceC2650dz0 zza(int i8) {
            EnumC1508Jf0 enumC1508Jf0 = EnumC1508Jf0.UNKNOWN;
            switch (i8) {
                case 0:
                    return EnumC1508Jf0.UNKNOWN;
                case 1:
                    return EnumC1508Jf0.PROVIDENCE;
                case 2:
                    return EnumC1508Jf0.INTENT_OPERATION;
                case 3:
                    return EnumC1508Jf0.BROADCAST_RECEIVER;
                case 4:
                    return EnumC1508Jf0.CONTENT_PROVIDER;
                case 5:
                    return EnumC1508Jf0.ACTIVITY;
                case 6:
                    return EnumC1508Jf0.SERVICE;
                case 7:
                    return EnumC1508Jf0.BINDER;
                case 8:
                    return EnumC1508Jf0.SYNC_ADAPTER;
                case 9:
                    return EnumC1508Jf0.GCM_TASK;
                case 10:
                    return EnumC1508Jf0.INTENT_SERVICE;
                case 11:
                    return EnumC1508Jf0.SERVICE_CONNECTION;
                case 12:
                    return EnumC1508Jf0.GCM_LISTENER;
                case 13:
                    return EnumC1508Jf0.CALLBACKS;
                case 14:
                    return EnumC1508Jf0.ALARM_LISTENER;
                case 15:
                    return EnumC1508Jf0.CUSTOM_EVENT_LOOP;
                case 16:
                    return EnumC1508Jf0.SENSOR_EVENT_LISTENER;
                case 17:
                    return EnumC1508Jf0.BLE_SCAN_CALLBACK;
                case 18:
                    return EnumC1508Jf0.BINDER_BY_INTERCEPTOR;
                case 19:
                    return EnumC1508Jf0.CONTENT_OBSERVER;
                case 20:
                    return EnumC1508Jf0.BACKUP_AGENT;
                case 21:
                    return EnumC1508Jf0.SLICE_PROVIDER;
                case 22:
                    return EnumC1508Jf0.LOCATION_LISTENER;
                case 23:
                    return EnumC1508Jf0.GMS_APPLICATION;
                case 24:
                    return EnumC1508Jf0.OAUTH;
                case 25:
                    return EnumC1508Jf0.LOCATION_CALLBACKS;
                case 26:
                    return EnumC1508Jf0.BT_ADAPTER;
                case 27:
                    return EnumC1508Jf0.NETWORK_CALLBACK;
                case 28:
                    return EnumC1508Jf0.JOB_SERVICE;
                default:
                    return null;
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f13676a;

    EnumC1508Jf0(int i8) {
        this.f13676a = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13676a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2650dz0
    public final int zza() {
        return this.f13676a;
    }
}
