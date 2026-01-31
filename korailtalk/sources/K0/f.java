package K0;

import H0.d;
import H0.l;
import H0.m;
import P0.r;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;

/* loaded from: classes.dex */
class f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f2723b = l.tagWithPrefix("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    private final ComponentName f2724a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2725a;

        static {
            int[] iArr = new int[m.values().length];
            f2725a = iArr;
            try {
                iArr[m.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2725a[m.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2725a[m.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2725a[m.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2725a[m.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    f(Context context) {
        this.f2724a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.getUri(), aVar.shouldTriggerForDescendants() ? 1 : 0);
    }

    static int c(m mVar) {
        int i8 = a.f2725a[mVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 == 4) {
            return 3;
        }
        if (i8 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        l.get().debug(f2723b, String.format("API version too low. Cannot convert network type value %s", mVar), new Throwable[0]);
        return 1;
    }

    static void d(JobInfo.Builder builder, m mVar) {
        if (Build.VERSION.SDK_INT < 30 || mVar != m.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(mVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(r rVar, int i8) {
        H0.c cVar = rVar.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", rVar.id);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", rVar.isPeriodic());
        JobInfo.Builder extras = new JobInfo.Builder(i8, this.f2724a).setRequiresCharging(cVar.requiresCharging()).setRequiresDeviceIdle(cVar.requiresDeviceIdle()).setExtras(persistableBundle);
        d(extras, cVar.getRequiredNetworkType());
        if (!cVar.requiresDeviceIdle()) {
            extras.setBackoffCriteria(rVar.backoffDelayDuration, rVar.backoffPolicy == H0.a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(rVar.calculateNextRunTime() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!rVar.expedited) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.hasContentUriTriggers()) {
            Iterator<d.a> it = cVar.getContentUriTriggers().getTriggers().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(cVar.getTriggerContentUpdateDelay());
            extras.setTriggerContentMaxDelay(cVar.getTriggerMaxContentDelay());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.requiresBatteryNotLow());
            extras.setRequiresStorageNotLow(cVar.requiresStorageNotLow());
        }
        boolean z8 = rVar.runAttemptCount > 0;
        boolean z9 = jMax > 0;
        if (androidx.core.os.a.isAtLeastS() && rVar.expedited && !z8 && !z9) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
