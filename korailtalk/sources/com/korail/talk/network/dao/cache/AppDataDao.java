package com.korail.talk.network.dao.cache;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseResponse;
import java.util.Date;
import n4.AbstractC5955f;
import z3.InterfaceC6622c;

/* loaded from: classes.dex */
public class AppDataDao extends BaseDao {
    private boolean mIsPending;

    public class AppDataResponse extends BaseResponse {
        private String disability_certification_msg;
        private String forSeatIntg;

        @InterfaceC6622c("airportBusMsg")
        private String limousine;
        private String railplus_cardinfo;
        private Version version;

        public AppDataResponse() {
        }

        public String getDisability_certification_msg() {
            return this.disability_certification_msg;
        }

        public String getForSeatIntg() {
            return this.forSeatIntg;
        }

        public String getLimousine() {
            return this.limousine;
        }

        public String getRailPlusCardInfo() {
            return this.railplus_cardinfo;
        }

        public Version getVersion() {
            return this.version;
        }
    }

    public class Version {
        private String AMESSAGE;
        private String NEWDVERSION;

        public Version() {
        }

        public String getAMessage() {
            return this.AMESSAGE;
        }

        public String getNEWDVERSION() {
            return this.NEWDVERSION;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        return ((CacheService) getService(CacheService.class)).getAppData(new Date().getTime());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_app_data;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return this.mIsPending;
    }

    public void setPending(boolean z8) {
        this.mIsPending = z8;
    }
}
