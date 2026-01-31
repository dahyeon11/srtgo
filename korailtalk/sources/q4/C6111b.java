package q4;

import android.content.Context;
import com.j256.ormlite.dao.Dao;
import com.kakao.sdk.user.Constants;
import com.korail.talk.database.model.CreditCard;
import com.korail.talk.database.model.DoNotLookAgain;
import com.korail.talk.database.model.FavoriteStation;
import com.korail.talk.database.model.IssueList;
import com.korail.talk.database.model.MainPopupData;
import com.korail.talk.database.model.SMSData;
import com.korail.talk.database.model.StationData;
import com.korail.talk.database.model.TicketDetail;
import com.korail.talk.database.model.ZRecentStation;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z4.C6630d;
import z4.N;
import z4.t;

/* renamed from: q4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6111b {

    /* renamed from: b, reason: collision with root package name */
    private static C6111b f34943b;

    /* renamed from: a, reason: collision with root package name */
    private final C6110a f34944a;

    private C6111b(Context context) {
        this.f34944a = new C6110a(context);
    }

    private void a() {
        try {
            List<ZRecentStation> recentStationList = getRecentStationList();
            if (recentStationList.size() > 2) {
                for (int size = recentStationList.size() - 1; size >= 2; size--) {
                    b().getRecentSectionDao().deleteById(Integer.valueOf(recentStationList.get(size).getId()));
                }
            }
        } catch (SQLException e8) {
            t.e(e8.getMessage());
        }
    }

    private C6110a b() {
        return this.f34944a;
    }

    public static C6111b getInstance() {
        return f34943b;
    }

    public static void init(Context context) {
        if (f34943b == null) {
            f34943b = new C6111b(context);
        }
    }

    public void deleteAllStationList() {
        try {
            b().getStationListDao().deleteBuilder().delete();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void deleteCreditCard(int i8) {
        String string;
        int i9 = 0;
        i9 = 0;
        i9 = 0;
        try {
            try {
                int iDeleteById = b().getCreditCardDao().deleteById(Integer.valueOf(i8));
                StringBuilder sb = new StringBuilder();
                sb.append("deleteCount : ");
                sb.append(iDeleteById);
                string = sb.toString();
                i9 = sb;
            } catch (SQLException e8) {
                t.e(e8.getMessage());
                string = "deleteCount : 0";
            }
            t.e(string);
        } catch (Throwable th) {
            t.e("deleteCount : " + i9);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void deleteFavoriteSection(int i8) {
        String string;
        int i9 = 0;
        i9 = 0;
        i9 = 0;
        try {
            try {
                int iDeleteById = b().getFavoriteSectionDao().deleteById(Integer.valueOf(i8));
                StringBuilder sb = new StringBuilder();
                sb.append("deleteCount : ");
                sb.append(iDeleteById);
                string = sb.toString();
                i9 = sb;
            } catch (SQLException e8) {
                t.e(e8.getMessage());
                string = "deleteCount : 0";
            }
            t.e(string);
        } catch (Throwable th) {
            t.e("deleteCount : " + i9);
            throw th;
        }
    }

    public void deleteIssueList() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            b().getIssueListDao().deleteBuilder().delete();
        } catch (SQLException e8) {
            t.w(e8.getMessage());
        }
    }

    public void deleteMainPopupData() {
        try {
            t.e("DeleteCount : " + b().getMainPopupDataDao().deleteBuilder().delete());
        } catch (SQLException e8) {
            t.e(e8.getMessage());
        }
    }

    public void deleteRecentSection(ZRecentStation zRecentStation) {
        String str;
        try {
            try {
                str = "deleteCount : " + b().getRecentSectionDao().deleteById(Integer.valueOf(zRecentStation.getId()));
            } catch (SQLException e8) {
                t.e(e8.getMessage());
                str = "deleteCount : 0";
            }
            t.e(str);
        } catch (Throwable th) {
            t.e("deleteCount : 0");
            throw th;
        }
    }

    public void deleteSMSData(List<SMSData> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (SMSData sMSData : getAllSmsData()) {
            try {
                Iterator<SMSData> it = list.iterator();
                boolean z8 = true;
                while (it.hasNext()) {
                    if (sMSData.getPnrNo().equals(it.next().getPnrNo())) {
                        z8 = false;
                    }
                }
                if (z8) {
                    arrayList.add(sMSData);
                }
            } catch (Throwable th) {
                t.e("deleteCount : 0");
                throw th;
            }
        }
        try {
            str = "deleteCount : " + b().getSMSData().delete(arrayList);
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            str = "deleteCount : 0";
        }
        t.e(str);
    }

    public void deleteTicketDetail() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            b().getTicketDetailDao().deleteBuilder().delete();
        } catch (SQLException e8) {
            t.w(e8.getMessage());
        }
    }

    public List<IssueList> getAllIssueList() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        try {
            return b().getIssueListDao().queryForAll();
        } catch (SQLException e8) {
            t.w(e8.getMessage());
            return arrayList;
        }
    }

    public List<SMSData> getAllSmsData() {
        ArrayList arrayList = new ArrayList();
        try {
            return b().getSMSData().queryForAll();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return arrayList;
        }
    }

    public List<StationData> getAllStationList() {
        try {
            return b().getStationListDao().queryForAll();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return null;
        }
    }

    public List<CreditCard> getCreditCardList() {
        ArrayList arrayList = new ArrayList();
        try {
            return b().getCreditCardDao().queryBuilder().orderBy(Constants.ID, false).query();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return arrayList;
        }
    }

    public DoNotLookAgain getDoNotLookAgainData(DoNotLookAgain doNotLookAgain) {
        DoNotLookAgain doNotLookAgain2 = new DoNotLookAgain();
        try {
            return b().getDoNotLookAgainDataDao().queryBuilder().where().eq("custMgNo", doNotLookAgain.getCustMgNo()).and().eq("doNotLookAgainType", Integer.valueOf(doNotLookAgain.getDoNotLookAgainType())).queryForFirst();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return doNotLookAgain2;
        }
    }

    public List<FavoriteStation> getFavoriteStationList() {
        ArrayList arrayList = new ArrayList();
        try {
            return b().getFavoriteSectionDao().queryBuilder().orderBy(Constants.ID, false).query();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return arrayList;
        }
    }

    public MainPopupData getMainPopupData() {
        MainPopupData mainPopupData = new MainPopupData();
        try {
            return b().getMainPopupDataDao().queryBuilder().queryForFirst();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return mainPopupData;
        }
    }

    public List<ZRecentStation> getRecentStationList() {
        ArrayList arrayList = new ArrayList();
        try {
            return b().getRecentSectionDao().queryBuilder().orderBy("timestamp", false).query();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return arrayList;
        }
    }

    public SMSData getSMSData(SMSData sMSData) {
        try {
            return b().getSMSData().queryBuilder().where().eq("pnrNo", sMSData.getPnrNo()).queryForFirst();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return null;
        }
    }

    public StationData getStationDataByCode(String str) {
        try {
            return b().getStationListDao().queryBuilder().where().eq("stnCd", str).queryForFirst();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return null;
        }
    }

    public StationData getStationDataByName(String str) {
        try {
            return b().getStationListDao().queryBuilder().where().eq("stnNm", str).queryForFirst();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return null;
        }
    }

    public String getStationNameByCode(String str) {
        StationData stationDataByCode = getStationDataByCode(str);
        if (C6630d.isNotNull(stationDataByCode)) {
            return stationDataByCode.getStnNm();
        }
        return null;
    }

    public TicketDetail getTicketDetailByPnrNo(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            return b().getTicketDetailDao().queryBuilder().where().eq("pnrNo", str).queryForFirst();
        } catch (SQLException e8) {
            t.w(e8.getMessage());
            return null;
        }
    }

    public int insertCreditCard(CreditCard creditCard) {
        try {
            b().getCreditCardDao().create(creditCard);
            return b().getCreditCardDao().extractId(creditCard).intValue();
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return 0;
        }
    }

    public void insertDoNotLookAgainData(DoNotLookAgain doNotLookAgain) {
        try {
            DoNotLookAgain doNotLookAgainData = getDoNotLookAgainData(doNotLookAgain);
            t.e("doNotLookAgainData : " + doNotLookAgainData);
            if (C6630d.isNull(doNotLookAgainData)) {
                t.e("DoNotLookAgainData insert");
                b().getDoNotLookAgainDataDao().create(doNotLookAgain);
            } else {
                t.e("UpdateCount : " + b().getDoNotLookAgainDataDao().update((Dao<DoNotLookAgain, Integer>) doNotLookAgain));
            }
        } catch (SQLException e8) {
            t.e(e8.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void insertFavoriteSection(FavoriteStation favoriteStation) {
        String string;
        int i8 = 0;
        i8 = 0;
        i8 = 0;
        try {
            try {
                int iCreate = b().getFavoriteSectionDao().create(favoriteStation);
                StringBuilder sb = new StringBuilder();
                sb.append("insertCount : ");
                sb.append(iCreate);
                string = sb.toString();
                i8 = sb;
            } catch (SQLException e8) {
                t.e(e8.getMessage());
                string = "insertCount : 0";
            }
            t.e(string);
        } catch (Throwable th) {
            t.e("insertCount : " + i8);
            throw th;
        }
    }

    public void insertIssueList(IssueList issueList) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            b().getIssueListDao().create(issueList);
        } catch (SQLException e8) {
            t.w(e8.getMessage());
        }
    }

    public void insertMainPopupData(MainPopupData mainPopupData) {
        try {
            t.e("MainPopupData insert");
            b().getMainPopupDataDao().create(mainPopupData);
        } catch (SQLException e8) {
            t.e(e8.getMessage());
        }
    }

    public void insertRecentSection(ZRecentStation zRecentStation) {
        StringBuilder sb;
        int iCreate = 0;
        try {
            try {
                iCreate = b().getRecentSectionDao().create(zRecentStation);
                a();
                sb = new StringBuilder();
            } catch (SQLException e8) {
                t.e(e8.getMessage());
                sb = new StringBuilder();
            }
            sb.append("insertCount : ");
            sb.append(iCreate);
            t.e(sb.toString());
        } catch (Throwable th) {
            t.e("insertCount : " + iCreate);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void insertSMSData(SMSData sMSData) {
        String string;
        int i8 = 0;
        i8 = 0;
        i8 = 0;
        try {
            try {
                int iCreate = b().getSMSData().create(sMSData);
                StringBuilder sb = new StringBuilder();
                sb.append("insertCount : ");
                sb.append(iCreate);
                string = sb.toString();
                i8 = sb;
            } catch (SQLException e8) {
                t.e(e8.getMessage());
                string = "insertCount : 0";
            }
            t.e(string);
        } catch (Throwable th) {
            t.e("insertCount : " + i8);
            throw th;
        }
    }

    public void insertStationList(StationData stationData) {
        try {
            b().getStationListDao().create(stationData);
        } catch (SQLException e8) {
            t.e(e8.getMessage());
        }
    }

    public void insertTicketDetail(TicketDetail ticketDetail) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            b().getTicketDetailDao().create(ticketDetail);
        } catch (SQLException e8) {
            t.w(e8.getMessage());
        }
    }

    public int updateCreditCard(CreditCard creditCard) {
        try {
            return b().getCreditCardDao().update((Dao<CreditCard, Integer>) creditCard);
        } catch (SQLException e8) {
            t.e(e8.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateFavoriteSection(FavoriteStation favoriteStation) {
        String string;
        int i8 = 0;
        i8 = 0;
        i8 = 0;
        try {
            try {
                int iUpdate = b().getFavoriteSectionDao().update((Dao<FavoriteStation, Integer>) favoriteStation);
                StringBuilder sb = new StringBuilder();
                sb.append("updateCount : ");
                sb.append(iUpdate);
                string = sb.toString();
                i8 = sb;
            } catch (SQLException e8) {
                t.e(e8.getMessage());
                string = "updateCount : 0";
            }
            t.e(string);
        } catch (Throwable th) {
            t.e("updateCount : " + i8);
            throw th;
        }
    }

    public void updateMainPopupData(MainPopupData mainPopupData) {
        try {
            t.e("Update : " + b().getMainPopupDataDao().update((Dao<MainPopupData, Integer>) mainPopupData));
        } catch (SQLException e8) {
            t.e(e8.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateStationData(StationData stationData) {
        String string;
        int i8 = 0;
        i8 = 0;
        i8 = 0;
        try {
            try {
                int iUpdate = b().getStationListDao().update((Dao<StationData, Integer>) stationData);
                StringBuilder sb = new StringBuilder();
                sb.append("updateCount : ");
                sb.append(iUpdate);
                string = sb.toString();
                i8 = sb;
            } catch (SQLException e8) {
                t.e(e8.getMessage());
                string = "updateCount : 0";
            }
            t.e(string);
        } catch (Throwable th) {
            t.e("updateCount : " + i8);
            throw th;
        }
    }

    public String getStationNameByCode(String str, String str2) {
        String stationNameByCode = getStationNameByCode(str);
        return N.isNull(stationNameByCode) ? str2 : stationNameByCode;
    }
}
