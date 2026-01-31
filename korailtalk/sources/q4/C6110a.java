package q4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import z4.C6630d;
import z4.t;

/* renamed from: q4.a */
/* loaded from: classes.dex */
public class C6110a extends OrmLiteSqliteOpenHelper {

    /* renamed from: a */
    private Dao f34934a;

    /* renamed from: b */
    private Dao f34935b;

    /* renamed from: c */
    private Dao f34936c;

    /* renamed from: d */
    private Dao f34937d;

    /* renamed from: e */
    private Dao f34938e;

    /* renamed from: f */
    private Dao f34939f;

    /* renamed from: g */
    private Dao f34940g;

    /* renamed from: h */
    private Dao f34941h;

    /* renamed from: i */
    private Dao f34942i;

    public C6110a(Context context) {
        super(context, "korailtalk.sqlite", null, 15);
    }

    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper, android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.f34934a = null;
        this.f34939f = null;
        this.f34935b = null;
        this.f34936c = null;
        this.f34937d = null;
        this.f34938e = null;
        this.f34940g = null;
        this.f34941h = null;
        this.f34942i = null;
    }

    public Dao<CreditCard, Integer> getCreditCardDao() {
        if (C6630d.isNull(this.f34936c)) {
            this.f34936c = getDao(CreditCard.class);
        }
        return this.f34936c;
    }

    public Dao<DoNotLookAgain, Integer> getDoNotLookAgainDataDao() {
        if (C6630d.isNull(this.f34941h)) {
            this.f34941h = getDao(DoNotLookAgain.class);
        }
        return this.f34941h;
    }

    public Dao<FavoriteStation, Integer> getFavoriteSectionDao() {
        if (C6630d.isNull(this.f34935b)) {
            this.f34935b = getDao(FavoriteStation.class);
        }
        return this.f34935b;
    }

    public Dao<IssueList, Integer> getIssueListDao() {
        if (C6630d.isNull(this.f34937d)) {
            this.f34937d = getDao(IssueList.class);
        }
        return this.f34937d;
    }

    public Dao<MainPopupData, Integer> getMainPopupDataDao() {
        if (C6630d.isNull(this.f34940g)) {
            this.f34940g = getDao(MainPopupData.class);
        }
        return this.f34940g;
    }

    public Dao<com.korail.talk.database.model.old.CreditCard, Integer> getOldCreditCardDao() {
        return getDao(com.korail.talk.database.model.old.CreditCard.class);
    }

    public Dao<ZRecentStation, Integer> getRecentSectionDao() {
        if (C6630d.isNull(this.f34939f)) {
            this.f34939f = getDao(ZRecentStation.class);
        }
        return this.f34939f;
    }

    public Dao<SMSData, Integer> getSMSData() {
        if (C6630d.isNull(this.f34942i)) {
            this.f34942i = getDao(SMSData.class);
        }
        return this.f34942i;
    }

    public Dao<StationData, Integer> getStationListDao() {
        if (C6630d.isNull(this.f34934a)) {
            this.f34934a = getDao(StationData.class);
        }
        return this.f34934a;
    }

    public Dao<TicketDetail, Integer> getTicketDetailDao() {
        if (C6630d.isNull(this.f34938e)) {
            this.f34938e = getDao(TicketDetail.class);
        }
        return this.f34938e;
    }

    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase, ConnectionSource connectionSource) {
        t.e("onCreate");
        try {
            TableUtils.createTableIfNotExists(connectionSource, StationData.class);
            TableUtils.createTableIfNotExists(connectionSource, FavoriteStation.class);
            TableUtils.createTableIfNotExists(connectionSource, CreditCard.class);
            TableUtils.createTableIfNotExists(connectionSource, IssueList.class);
            TableUtils.createTableIfNotExists(connectionSource, TicketDetail.class);
            TableUtils.createTableIfNotExists(connectionSource, ZRecentStation.class);
            TableUtils.createTableIfNotExists(connectionSource, MainPopupData.class);
            TableUtils.createTableIfNotExists(connectionSource, DoNotLookAgain.class);
            TableUtils.createTableIfNotExists(connectionSource, SMSData.class);
        } catch (SQLException e8) {
            t.e(e8.getMessage());
        }
    }

    @Override // com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, ConnectionSource connectionSource, int i8, int i9) {
        t.e("onUpgrade");
        if (i8 != i9) {
            try {
                TableUtils.dropTable(connectionSource, StationData.class, true);
                TableUtils.dropTable(connectionSource, MainPopupData.class, true);
                TableUtils.dropTable(connectionSource, DoNotLookAgain.class, true);
                ArrayList arrayList = new ArrayList();
                List<com.korail.talk.database.model.old.CreditCard> listQuery = getOldCreditCardDao().queryBuilder().orderBy(Constants.ID, false).query();
                if (listQuery.size() > 0) {
                    for (int i10 = 0; i10 < listQuery.size(); i10++) {
                        com.korail.talk.database.model.old.CreditCard creditCard = listQuery.get(i10);
                        CreditCard creditCard2 = new CreditCard();
                        creditCard2.setId(creditCard.getId());
                        creditCard2.setCardNickname(creditCard.getCardNickname());
                        creditCard2.setCardNumber(creditCard.getCardNumber());
                        creditCard2.setCardValidateMonth(creditCard.getCardValidateMonth());
                        creditCard2.setCardValidateYear(creditCard.getCardValidateYear());
                        creditCard2.setCardType("0");
                        arrayList.add(creditCard2);
                    }
                }
                TableUtils.dropTable(connectionSource, com.korail.talk.database.model.old.CreditCard.class, true);
                onCreate(sQLiteDatabase, connectionSource);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    try {
                        CreditCard creditCard3 = (CreditCard) arrayList.get(i11);
                        getCreditCardDao().create(creditCard3);
                        getCreditCardDao().extractId(creditCard3);
                    } catch (SQLException e8) {
                        t.e(e8.getMessage());
                    }
                }
                try {
                    getCreditCardDao().queryBuilder().orderBy(Constants.ID, false).query();
                } catch (SQLException e9) {
                    t.e(e9.getMessage());
                }
            } catch (SQLException e10) {
                t.e(e10.getMessage());
            }
        }
    }
}
