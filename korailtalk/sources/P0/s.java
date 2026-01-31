package P0;

import H0.v;
import P0.r;
import androidx.lifecycle.LiveData;
import java.util.List;

/* loaded from: classes.dex */
public interface s {
    void delete(String str);

    List<r> getAllEligibleWorkSpecsForScheduling(int i8);

    List<String> getAllUnfinishedWork();

    List<String> getAllWorkSpecIds();

    LiveData getAllWorkSpecIdsLiveData();

    List<r> getEligibleWorkForScheduling(int i8);

    List<androidx.work.b> getInputsFromPrerequisites(String str);

    List<r> getRecentlyCompletedWork(long j8);

    List<r> getRunningWork();

    LiveData getScheduleRequestedAtLiveData(String str);

    List<r> getScheduledWork();

    v.a getState(String str);

    List<String> getUnfinishedWorkWithName(String str);

    List<String> getUnfinishedWorkWithTag(String str);

    r getWorkSpec(String str);

    List<r.b> getWorkSpecIdAndStatesForName(String str);

    r[] getWorkSpecs(List<String> list);

    r.c getWorkStatusPojoForId(String str);

    List<r.c> getWorkStatusPojoForIds(List<String> list);

    List<r.c> getWorkStatusPojoForName(String str);

    List<r.c> getWorkStatusPojoForTag(String str);

    LiveData getWorkStatusPojoLiveDataForIds(List<String> list);

    LiveData getWorkStatusPojoLiveDataForName(String str);

    LiveData getWorkStatusPojoLiveDataForTag(String str);

    boolean hasUnfinishedWork();

    int incrementWorkSpecRunAttemptCount(String str);

    void insertWorkSpec(r rVar);

    int markWorkSpecScheduled(String str, long j8);

    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    int resetScheduledState();

    int resetWorkSpecRunAttemptCount(String str);

    void setOutput(String str, androidx.work.b bVar);

    void setPeriodStartTime(String str, long j8);

    int setState(v.a aVar, String... strArr);
}
