package B2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import java.util.Map;
import r2.InterfaceC6172a;

/* renamed from: B2.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC0451j extends AbstractBinderC0443b implements InterfaceC0452k {
    public AbstractBinderC0451j() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC0452k asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0452k ? (InterfaceC0452k) iInterfaceQueryLocalInterface : new C0450i(iBinder);
    }

    @Override // B2.AbstractBinderC0443b
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC0455n c0453l;
        InterfaceC0455n c0453l2 = null;
        InterfaceC0455n c0453l3 = null;
        InterfaceC0455n c0453l4 = null;
        InterfaceC0458q c0456o = null;
        InterfaceC0458q c0456o2 = null;
        InterfaceC0458q c0456o3 = null;
        InterfaceC0455n c0453l5 = null;
        InterfaceC0455n c0453l6 = null;
        InterfaceC0455n c0453l7 = null;
        InterfaceC0455n c0453l8 = null;
        InterfaceC0455n c0453l9 = null;
        InterfaceC0455n c0453l10 = null;
        InterfaceC0459s rVar = null;
        InterfaceC0455n c0453l11 = null;
        InterfaceC0455n c0453l12 = null;
        InterfaceC0455n c0453l13 = null;
        InterfaceC0455n c0453l14 = null;
        switch (i8) {
            case 1:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                C0460t c0460t = (C0460t) AbstractC0444c.zza(parcel, C0460t.CREATOR);
                long j8 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                initialize(interfaceC6172aAsInterface, c0460t, j8);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
                boolean zZzg = AbstractC0444c.zzg(parcel);
                boolean zZzg2 = AbstractC0444c.zzg(parcel);
                long j9 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                logEvent(string, string2, bundle, zZzg, zZzg2, j9);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c0453l = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l = iInterfaceQueryLocalInterface instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface : new C0453l(strongBinder);
                }
                long j10 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                logEventAndBundle(string3, string4, bundle2, c0453l, j10);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                boolean zZzg3 = AbstractC0444c.zzg(parcel);
                long j11 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                setUserProperty(string5, string6, interfaceC6172aAsInterface2, zZzg3, j11);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zZzg4 = AbstractC0444c.zzg(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface2 : new C0453l(strongBinder2);
                }
                AbstractC0444c.zzc(parcel);
                getUserProperties(string7, string8, zZzg4, c0453l2);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l14 = iInterfaceQueryLocalInterface3 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface3 : new C0453l(strongBinder3);
                }
                AbstractC0444c.zzc(parcel);
                getMaxUserProperties(string9, c0453l14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j12 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                setUserId(string10, j12);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
                long j13 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                setConditionalUserProperty(bundle3, j13);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
                AbstractC0444c.zzc(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l13 = iInterfaceQueryLocalInterface4 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface4 : new C0453l(strongBinder4);
                }
                AbstractC0444c.zzc(parcel);
                getConditionalUserProperties(string13, string14, c0453l13);
                break;
            case 11:
                boolean zZzg5 = AbstractC0444c.zzg(parcel);
                long j14 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                setMeasurementEnabled(zZzg5, j14);
                break;
            case 12:
                long j15 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                resetAnalyticsData(j15);
                break;
            case 13:
                long j16 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                setMinimumSessionDuration(j16);
                break;
            case 14:
                long j17 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                setSessionTimeoutDuration(j17);
                break;
            case 15:
                InterfaceC6172a interfaceC6172aAsInterface3 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j18 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                setCurrentScreen(interfaceC6172aAsInterface3, string15, string16, j18);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l12 = iInterfaceQueryLocalInterface5 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface5 : new C0453l(strongBinder5);
                }
                AbstractC0444c.zzc(parcel);
                getCurrentScreenName(c0453l12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l11 = iInterfaceQueryLocalInterface6 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface6 : new C0453l(strongBinder6);
                }
                AbstractC0444c.zzc(parcel);
                getCurrentScreenClass(c0453l11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    rVar = iInterfaceQueryLocalInterface7 instanceof InterfaceC0459s ? (InterfaceC0459s) iInterfaceQueryLocalInterface7 : new r(strongBinder7);
                }
                AbstractC0444c.zzc(parcel);
                setInstanceIdProvider(rVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l10 = iInterfaceQueryLocalInterface8 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface8 : new C0453l(strongBinder8);
                }
                AbstractC0444c.zzc(parcel);
                getCachedAppInstanceId(c0453l10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l9 = iInterfaceQueryLocalInterface9 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface9 : new C0453l(strongBinder9);
                }
                AbstractC0444c.zzc(parcel);
                getAppInstanceId(c0453l9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l8 = iInterfaceQueryLocalInterface10 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface10 : new C0453l(strongBinder10);
                }
                AbstractC0444c.zzc(parcel);
                getGmpAppId(c0453l8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l7 = iInterfaceQueryLocalInterface11 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface11 : new C0453l(strongBinder11);
                }
                AbstractC0444c.zzc(parcel);
                generateEventId(c0453l7);
                break;
            case 23:
                String string17 = parcel.readString();
                long j19 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                beginAdUnitExposure(string17, j19);
                break;
            case 24:
                String string18 = parcel.readString();
                long j20 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                endAdUnitExposure(string18, j20);
                break;
            case 25:
                InterfaceC6172a interfaceC6172aAsInterface4 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                long j21 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                onActivityStarted(interfaceC6172aAsInterface4, j21);
                break;
            case 26:
                InterfaceC6172a interfaceC6172aAsInterface5 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                onActivityStopped(interfaceC6172aAsInterface5, j22);
                break;
            case 27:
                InterfaceC6172a interfaceC6172aAsInterface6 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                onActivityCreated(interfaceC6172aAsInterface6, bundle5, j23);
                break;
            case 28:
                InterfaceC6172a interfaceC6172aAsInterface7 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                onActivityDestroyed(interfaceC6172aAsInterface7, j24);
                break;
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                InterfaceC6172a interfaceC6172aAsInterface8 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                onActivityPaused(interfaceC6172aAsInterface8, j25);
                break;
            case 30:
                InterfaceC6172a interfaceC6172aAsInterface9 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                onActivityResumed(interfaceC6172aAsInterface9, j26);
                break;
            case 31:
                InterfaceC6172a interfaceC6172aAsInterface10 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l6 = iInterfaceQueryLocalInterface12 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface12 : new C0453l(strongBinder12);
                }
                long j27 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                onActivitySaveInstanceState(interfaceC6172aAsInterface10, c0453l6, j27);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l5 = iInterfaceQueryLocalInterface13 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface13 : new C0453l(strongBinder13);
                }
                long j28 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                performAction(bundle6, c0453l5, j28);
                break;
            case 33:
                int i10 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC6172a interfaceC6172aAsInterface11 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC6172a interfaceC6172aAsInterface12 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                InterfaceC6172a interfaceC6172aAsInterface13 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC0444c.zzc(parcel);
                logHealthData(i10, string19, interfaceC6172aAsInterface11, interfaceC6172aAsInterface12, interfaceC6172aAsInterface13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c0456o3 = iInterfaceQueryLocalInterface14 instanceof InterfaceC0458q ? (InterfaceC0458q) iInterfaceQueryLocalInterface14 : new C0456o(strongBinder14);
                }
                AbstractC0444c.zzc(parcel);
                setEventInterceptor(c0456o3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c0456o2 = iInterfaceQueryLocalInterface15 instanceof InterfaceC0458q ? (InterfaceC0458q) iInterfaceQueryLocalInterface15 : new C0456o(strongBinder15);
                }
                AbstractC0444c.zzc(parcel);
                registerOnMeasurementEventListener(c0456o2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c0456o = iInterfaceQueryLocalInterface16 instanceof InterfaceC0458q ? (InterfaceC0458q) iInterfaceQueryLocalInterface16 : new C0456o(strongBinder16);
                }
                AbstractC0444c.zzc(parcel);
                unregisterOnMeasurementEventListener(c0456o);
                break;
            case 37:
                HashMap mapZzb = AbstractC0444c.zzb(parcel);
                AbstractC0444c.zzc(parcel);
                initForTests(mapZzb);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l4 = iInterfaceQueryLocalInterface17 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface17 : new C0453l(strongBinder17);
                }
                int i11 = parcel.readInt();
                AbstractC0444c.zzc(parcel);
                getTestFlag(c0453l4, i11);
                break;
            case 39:
                boolean zZzg6 = AbstractC0444c.zzg(parcel);
                AbstractC0444c.zzc(parcel);
                setDataCollectionEnabled(zZzg6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0453l3 = iInterfaceQueryLocalInterface18 instanceof InterfaceC0455n ? (InterfaceC0455n) iInterfaceQueryLocalInterface18 : new C0453l(strongBinder18);
                }
                AbstractC0444c.zzc(parcel);
                isDataCollectionEnabled(c0453l3);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
                AbstractC0444c.zzc(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j29 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                clearMeasurementEnabled(j29);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
                long j30 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                setConsent(bundle8, j30);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC0444c.zza(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                AbstractC0444c.zzc(parcel);
                setConsentThirdParty(bundle9, j31);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void beginAdUnitExposure(String str, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void clearMeasurementEnabled(long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void endAdUnitExposure(String str, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void generateEventId(InterfaceC0455n interfaceC0455n);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void getAppInstanceId(InterfaceC0455n interfaceC0455n);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void getCachedAppInstanceId(InterfaceC0455n interfaceC0455n);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void getConditionalUserProperties(String str, String str2, InterfaceC0455n interfaceC0455n);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void getCurrentScreenClass(InterfaceC0455n interfaceC0455n);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void getCurrentScreenName(InterfaceC0455n interfaceC0455n);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void getGmpAppId(InterfaceC0455n interfaceC0455n);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void getMaxUserProperties(String str, InterfaceC0455n interfaceC0455n);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void getTestFlag(InterfaceC0455n interfaceC0455n, int i8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void getUserProperties(String str, String str2, boolean z8, InterfaceC0455n interfaceC0455n);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void initForTests(Map map);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void initialize(InterfaceC6172a interfaceC6172a, C0460t c0460t, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void isDataCollectionEnabled(InterfaceC0455n interfaceC0455n);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC0455n interfaceC0455n, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void logHealthData(int i8, String str, InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void onActivityCreated(InterfaceC6172a interfaceC6172a, Bundle bundle, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void onActivityDestroyed(InterfaceC6172a interfaceC6172a, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void onActivityPaused(InterfaceC6172a interfaceC6172a, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void onActivityResumed(InterfaceC6172a interfaceC6172a, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void onActivitySaveInstanceState(InterfaceC6172a interfaceC6172a, InterfaceC0455n interfaceC0455n, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void onActivityStarted(InterfaceC6172a interfaceC6172a, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void onActivityStopped(InterfaceC6172a interfaceC6172a, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void performAction(Bundle bundle, InterfaceC0455n interfaceC0455n, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void registerOnMeasurementEventListener(InterfaceC0458q interfaceC0458q);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void resetAnalyticsData(long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setConditionalUserProperty(Bundle bundle, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setConsent(Bundle bundle, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setConsentThirdParty(Bundle bundle, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setCurrentScreen(InterfaceC6172a interfaceC6172a, String str, String str2, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setDataCollectionEnabled(boolean z8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setDefaultEventParameters(Bundle bundle);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setEventInterceptor(InterfaceC0458q interfaceC0458q);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setInstanceIdProvider(InterfaceC0459s interfaceC0459s);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setMeasurementEnabled(boolean z8, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setMinimumSessionDuration(long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setSessionTimeoutDuration(long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setUserId(String str, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void setUserProperty(String str, String str2, InterfaceC6172a interfaceC6172a, boolean z8, long j8);

    @Override // B2.InterfaceC0452k
    public abstract /* synthetic */ void unregisterOnMeasurementEventListener(InterfaceC0458q interfaceC0458q);
}
