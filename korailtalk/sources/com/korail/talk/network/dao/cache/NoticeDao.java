package com.korail.talk.network.dao.cache;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseResponse;
import java.util.Date;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class NoticeDao extends BaseDao {

    public class NoticeResponse extends BaseResponse {
        private String bbrdId;
        private String ptwtSqno;
        private String ptwtTtl;

        public NoticeResponse() {
        }

        public String getBbrdId() {
            return this.bbrdId;
        }

        public String getNoticePostData() {
            return "bbrdId=" + getBbrdId() + "&ptwtSqno=" + getPtwtSqno();
        }

        public String getPtwtSqno() {
            return this.ptwtSqno;
        }

        public String getPtwtTtl() {
            return this.ptwtTtl;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        return ((CacheService) getService(CacheService.class)).getNotice(new Date().getTime());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_notice_data;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return false;
    }
}
