package com.h2osystech.smartalimi.aidllib;

import android.content.ContentResolver;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface;
import com.h2osystech.smartalimi.common.Const;
import com.h2osystech.smartalimi.servicealimi.BuildConfig;
import g5.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class SmartAgentInterface implements ServiceAlimiInterface {
    static ServiceAlimiInterface alimiInterface;
    static ContentResolver dataResolver;

    public static class Stub {
        public static SmartAgentInterface asInterface(IBinder iBinder, Context context) {
            DataResolver.authoritis = BuildConfig.authority;
            SmartAgentInterface.alimiInterface = ServiceAlimiInterface.Stub.asInterface(iBinder);
            SmartAgentInterface.dataResolver = context.getContentResolver();
            return new SmartAgentInterface();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public void enableLog(boolean z8) {
        alimiInterface.enableLog(z8);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int erbAddregist(String str, String str2) {
        return alimiInterface.erbAddregist(str, str2);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int erbDelregist(String str, String str2) {
        return alimiInterface.erbDelregist(str, str2);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int erbTerm() {
        return alimiInterface.erbTerm();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public List getAllCurrentMsg() {
        int sortType = getSortType();
        String dBUserID = getDBUserID();
        DataResolver dataResolver2 = new DataResolver(dataResolver);
        new ArrayList();
        return sortType != 0 ? sortType != 1 ? dataResolver2.getCurrentMsg(dBUserID) : dataResolver2.getCurrentMsgTask(dBUserID) : dataResolver2.getCurrentMsg(dBUserID);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public List getAllMsg() {
        return new DataResolver(dataResolver).getAllMsg(getDBUserID());
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int getBeforeMsg(int i8) {
        return alimiInterface.getBeforeMsg(i8);
    }

    public String getDBUserID() {
        String savedUserID = alimiInterface.getSavedUserID();
        if (savedUserID.contains(e.STATE_NAME_NONE)) {
            savedUserID = savedUserID.replaceAll(e.STATE_NAME_NONE, "__0x01");
        }
        return savedUserID.contains(".") ? savedUserID.replaceAll("\\.", "__0x02") : savedUserID;
    }

    public ArrayList<MSGVo> getMsgByTaskname(ArrayList<String> arrayList) {
        String dBUserID;
        try {
            dBUserID = getDBUserID();
        } catch (Exception unused) {
            Log.e("TAG", "getMsgByTaskname: Login ID Error");
            dBUserID = "";
        }
        return new DataResolver(dataResolver).getTaskNameMsg(dBUserID, arrayList);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int getNotiDisable() {
        return 0;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int getNotiThreadTime() {
        return alimiInterface.getNotiThreadTime();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int getNotiType() {
        return alimiInterface.getNotiType();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public String getPushOnOff() {
        return alimiInterface.getPushOnOff();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public String getReadMsg(String str) {
        return new DataResolver(dataResolver).getReadYN(getDBUserID(), str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public String getSavedUserID() {
        return alimiInterface.getSavedUserID();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public String getSenderBySeq(String str) {
        return new DataResolver(dataResolver).getSenderByUniseq(getDBUserID(), str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int getSortType() {
        return alimiInterface.getSortType();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public MSGVo getUniqMsg(String str) {
        return new DataResolver(dataResolver).getUniseqMsg(getDBUserID(), str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int newMsgCount() {
        return alimiInterface.newMsgCount();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int readCheck(String str, List list) {
        return alimiInterface.readCheck(str, list);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int removeAllMsg() {
        return new DataResolver(dataResolver).removeAllMsg(getDBUserID());
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int removeBySeq(String str) {
        return new DataResolver(dataResolver).removeToUniqSeqItem(getDBUserID(), str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int removeListItem(String str) {
        String dBUserID = getDBUserID();
        DataResolver dataResolver2 = new DataResolver(dataResolver);
        int sortType = getSortType();
        return sortType != 0 ? sortType != 1 ? dataResolver2.removeSenderGroupID(dBUserID, str) : dataResolver2.removeTaskGroupID(dBUserID, str) : dataResolver2.removeSenderGroupID(dBUserID, str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public List selectGroupID(String str) {
        String dBUserID = getDBUserID();
        int sortType = getSortType();
        DataResolver dataResolver2 = new DataResolver(dataResolver);
        return sortType != 0 ? sortType != 1 ? dataResolver2.getSenderMsg(dBUserID, str) : dataResolver2.getTaskNameMsg(dBUserID, str) : dataResolver2.getSenderMsg(dBUserID, str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public List selectSearchItems(String str) {
        return new DataResolver(dataResolver).selectSearchValuesList(getDBUserID(), str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int selectSearchValuesCount(String str) {
        return new DataResolver(dataResolver).selectSearchValuesCount(getDBUserID(), str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setAllReadCheck() {
        return alimiInterface.setAllReadCheck();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setAppType(String str) {
        return alimiInterface.setAppType(str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setBedgeCountPackage(String str) {
        return alimiInterface.setBedgeCountPackage(str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setBroadcastOpt(boolean z8) {
        return alimiInterface.setBroadcastOpt(z8);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setGCMtoSaveMode(int i8) {
        return alimiInterface.setGCMtoSaveMode(i8);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setLogin(String str, String str2, int i8) {
        return alimiInterface.setLogin(str, str2, i8);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public boolean setLogout() {
        return alimiInterface.setLogout();
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setNotiDisable(int i8) {
        if (i8 == 0 || i8 == 1) {
            return alimiInterface.setNotiDisable(i8);
        }
        return -1;
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setNotiThreadTime(int i8) {
        return alimiInterface.setNotiThreadTime(i8);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setNotiType(int i8) {
        if (i8 < 0 || i8 > 2) {
            return -1;
        }
        return alimiInterface.setNotiType(i8);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setPhoneNumber(String str) {
        return alimiInterface.setPhoneNumber(str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setPushOnOff(String str) {
        return alimiInterface.setPushOnOff(str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setReadChk(String str, String str2) {
        return alimiInterface.setReadChk(str, str2);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setReadMsg(String str) {
        return alimiInterface.setReadMsg(str);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setServerIPPort(String str, String str2) {
        return alimiInterface.setServerIPPort(str, str2);
    }

    @Override // com.h2osystech.smartalimi.aidllib.ServiceAlimiInterface
    public int setSortType(int i8) {
        return alimiInterface.setSortType(i8);
    }

    public void updateBadge(Context context, int i8) {
        Const.updateBadgetCount(context, i8);
    }
}
