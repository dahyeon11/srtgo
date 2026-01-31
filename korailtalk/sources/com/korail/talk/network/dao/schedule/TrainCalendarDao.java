package com.korail.talk.network.dao.schedule;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import java.util.List;
import n4.AbstractC5955f;
import z4.N;

/* loaded from: classes.dex */
public class TrainCalendarDao extends BaseDao {

    public class TrainCalendarResponse extends BaseResponse {
        private List<RunningCalendar> runningCalendar;

        public class RunningCalendar implements Comparable<RunningCalendar> {
            private static final String BOOL_NO = "N";
            private static final String BOOL_YES = "Y";
            private static final String PEAK_SEASON_BIZ_DD_STG_CD = "5";
            private String aTrnOpFlg;
            private String bizDdStgCd;
            private String dTrnOpFlg;
            private String dayDvCd;
            private String gTrnOpFlg;
            private String hldyDvCd;
            private String oTrnOpFlg;
            private String runDt;
            private String sTrnOpFlg;
            private String saleDdDvCd;
            private String vTrnOpFlg;
            private String xTrnOpFlg;

            public RunningCalendar() {
            }

            public String getBizDdStgCd() {
                return this.bizDdStgCd;
            }

            public String getDateStr() {
                return this.runDt;
            }

            public boolean isATrainAvailable() {
                return BOOL_YES.equals(this.aTrnOpFlg);
            }

            public boolean isDMZTrainAvailable() {
                return BOOL_YES.equals(this.dTrnOpFlg);
            }

            public boolean isForSaleDate() {
                return "5".equals(this.saleDdDvCd) || StbkAcntDao.ACCOUNT_REGISTER.equals(this.saleDdDvCd);
            }

            public boolean isGTrainAvailable() {
                return BOOL_YES.equals(this.gTrnOpFlg);
            }

            public boolean isHoliday() {
                return !this.hldyDvCd.isEmpty();
            }

            public boolean isOTrainAvailable() {
                return BOOL_YES.equals(this.oTrnOpFlg);
            }

            public boolean isPeakSeason() {
                return N.notNullEqual(this.bizDdStgCd, "5");
            }

            public boolean isSTrainAvailable() {
                return BOOL_YES.equals(this.sTrnOpFlg);
            }

            public boolean isVTrainAvailable() {
                return BOOL_YES.equals(this.vTrnOpFlg);
            }

            public boolean isXTrainAvailable() {
                return BOOL_YES.equals(this.xTrnOpFlg);
            }

            public void setBizDdStgCd(String str) {
                this.bizDdStgCd = str;
            }

            @Override // java.lang.Comparable
            public int compareTo(RunningCalendar runningCalendar) {
                String str = this.runDt;
                if (str == null || runningCalendar == null) {
                    return 0;
                }
                return str.compareTo(runningCalendar.getDateStr());
            }
        }

        public TrainCalendarResponse() {
        }

        public List<RunningCalendar> getRunningCalendarList() {
            return this.runningCalendar;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        return ((CalendarService) getService(CalendarService.class)).getTrainCalendar();
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_train_calendar;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return false;
    }
}
