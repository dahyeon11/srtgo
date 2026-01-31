package maum.m2u.common;

import a4.AbstractC0834a;
import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5199c;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.AbstractC5245r1;
import com.google.protobuf.AbstractC5248t;
import com.google.protobuf.C5213g1;
import com.google.protobuf.C5228l1;
import com.google.protobuf.C5230m0;
import com.google.protobuf.C5240p1;
import com.google.protobuf.C5253v0;
import com.google.protobuf.C5269x;
import com.google.protobuf.E1;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.InterfaceC5243q1;
import com.google.protobuf.InterfaceC5268w0;
import com.google.protobuf.K;
import com.google.protobuf.K0;
import com.google.protobuf.M;
import com.google.protobuf.N0;
import com.google.protobuf.Z0;
import com.google.protobuf.r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import maum.m2u.common.DeviceOuterClass;

/* loaded from: classes3.dex */
public final class CardOuterClass {
    private static C5269x.h descriptor = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001amaum/m2u/common/card.proto\u0012\u000fmaum.m2u.common\u001a\u001cgoogle/protobuf/struct.proto\"m\n\tChartCard\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012(\n\u0007options\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012(\n\u0004data\u0018\n \u0003(\u000b2\u001a.google.protobuf.ListValue\"ò\u0001\n\nSelectCard\u0012\r\n\u0005title\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006header\u0018\u0002 \u0001(\t\u0012/\n\u0005items\u0018\u0003 \u0003(\u000b2 .maum.m2u.common.SelectCard.Item\u0012\u0012\n\nhorizontal\u0018\u000b \u0001(\b\u0012\f\n\u0004type\u0018\f \u0001(\t\u001ar\n\u0004Item\u0012\r\n\u0005title\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007summary\u0018\u0002 \u0001(\t\u0012\u0011\n\timage_url\u0018\u0003 \u0001(\t\u0012\u0016\n\u000eselected_utter\u0018d \u0001(\t\u0012\u0010\n\bselected\u0018e \u0001(\b\u0012\r\n\u0005style\u0018f \u0001(\t\"_\n\bLinkCard\u0012\r\n\u0005title\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007summary\u0018\u0002 \u0001(\t\u0012\u0011\n\timage_url\u0018\u0003 \u0001(\t\u0012\u0012\n\nimage_href\u0018\u0004 \u0001(\t\u0012\f\n\u0004type\u0018\u0005 \u0001(\t\"H\n\bListCard\u0012(\n\u0005cards\u0018\u0001 \u0003(\u000b2\u0019.maum.m2u.common.LinkCard\u0012\u0012\n\nhorizontal\u0018\u0002 \u0001(\b\"F\n\nCustomCard\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012*\n\tcard_data\u0018\n \u0001(\u000b2\u0017.google.protobuf.Struct\"P\n\u000eCustomListCard\u0012*\n\u0005cards\u0018\u0001 \u0003(\u000b2\u001b.maum.m2u.common.CustomCard\u0012\u0012\n\nhorizontal\u0018\u0002 \u0001(\b\"\u0086\u0001\n\tTableCard\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u00123\n\u0005items\u0018\u0002 \u0003(\u000b2$.maum.m2u.common.TableCard.TableItem\u001a6\n\tTableItem\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\u0012\r\n\u0005style\u0018\u0003 \u0001(\t\"N\n\rTableListCard\u0012)\n\u0005cards\u0018\u0001 \u0003(\u000b2\u001a.maum.m2u.common.TableCard\u0012\u0012\n\nhorizontal\u0018\u0002 \u0001(\b\"o\n\bGridCard\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012+\n\u0007columns\u0018\n \u0001(\u000b2\u001a.google.protobuf.ListValue\u0012(\n\u0004rows\u0018\u000b \u0003(\u000b2\u001a.google.protobuf.ListValue\"Î\u0003\n\u0004Card\u0012+\n\u0005chart\u0018\u0001 \u0001(\u000b2\u001a.maum.m2u.common.ChartCardH\u0000\u0012-\n\u0006select\u0018\u0002 \u0001(\u000b2\u001b.maum.m2u.common.SelectCardH\u0000\u0012)\n\u0004link\u0018\u0003 \u0001(\u000b2\u0019.maum.m2u.common.LinkCardH\u0000\u0012-\n\u0006custom\u0018\u0004 \u0001(\u000b2\u001b.maum.m2u.common.CustomCardH\u0000\u0012+\n\u0005table\u0018\u0005 \u0001(\u000b2\u001a.maum.m2u.common.TableCardH\u0000\u0012)\n\u0004grid\u0018\u0006 \u0001(\u000b2\u0019.maum.m2u.common.GridCardH\u0000\u0012.\n\tlink_list\u0018\u000b \u0001(\u000b2\u0019.maum.m2u.common.ListCardH\u0000\u00126\n\u000bcustom_list\u0018\f \u0001(\u000b2\u001f.maum.m2u.common.CustomListCardH\u0000\u00124\n\ntable_list\u0018\r \u0001(\u000b2\u001e.maum.m2u.common.TableListCardH\u0000\u0012\r\n\u0003raw\u0018\u0015 \u0001(\tH\u0000B\u000b\n\ttest_cardb\u0006proto3"}, new C5269x.h[]{AbstractC5245r1.getDescriptor()});
    private static final C5269x.b internal_static_maum_m2u_common_Card_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_Card_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_ChartCard_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_ChartCard_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_CustomCard_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_CustomCard_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_CustomListCard_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_CustomListCard_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_GridCard_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_GridCard_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LinkCard_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LinkCard_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_ListCard_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_ListCard_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_SelectCard_Item_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_SelectCard_Item_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_SelectCard_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_SelectCard_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_TableCard_TableItem_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_TableCard_TableItem_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_TableCard_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_TableCard_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_TableListCard_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_TableListCard_fieldAccessorTable;

    /* renamed from: maum.m2u.common.CardOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase;

        static {
            int[] iArr = new int[Card.TestCardCase.values().length];
            $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase = iArr;
            try {
                iArr[Card.TestCardCase.CHART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[Card.TestCardCase.SELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[Card.TestCardCase.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[Card.TestCardCase.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[Card.TestCardCase.TABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[Card.TestCardCase.GRID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[Card.TestCardCase.LINK_LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[Card.TestCardCase.CUSTOM_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[Card.TestCardCase.TABLE_LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[Card.TestCardCase.RAW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[Card.TestCardCase.TESTCARD_NOT_SET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static final class Card extends AbstractC5209f0 implements CardOrBuilder {
        public static final int CHART_FIELD_NUMBER = 1;
        public static final int CUSTOM_FIELD_NUMBER = 4;
        public static final int CUSTOM_LIST_FIELD_NUMBER = 12;
        public static final int GRID_FIELD_NUMBER = 6;
        public static final int LINK_FIELD_NUMBER = 3;
        public static final int LINK_LIST_FIELD_NUMBER = 11;
        public static final int RAW_FIELD_NUMBER = 21;
        public static final int SELECT_FIELD_NUMBER = 2;
        public static final int TABLE_FIELD_NUMBER = 5;
        public static final int TABLE_LIST_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int testCardCase_;
        private Object testCard_;
        private static final Card DEFAULT_INSTANCE = new Card();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.Card.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Card parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Card.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements CardOrBuilder {
            private int bitField0_;
            private C5228l1 chartBuilder_;
            private C5228l1 customBuilder_;
            private C5228l1 customListBuilder_;
            private C5228l1 gridBuilder_;
            private C5228l1 linkBuilder_;
            private C5228l1 linkListBuilder_;
            private C5228l1 selectBuilder_;
            private C5228l1 tableBuilder_;
            private C5228l1 tableListBuilder_;
            private int testCardCase_;
            private Object testCard_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(Card card) {
            }

            private void buildPartialOneofs(Card card) {
                C5228l1 c5228l1;
                C5228l1 c5228l12;
                C5228l1 c5228l13;
                C5228l1 c5228l14;
                C5228l1 c5228l15;
                C5228l1 c5228l16;
                C5228l1 c5228l17;
                C5228l1 c5228l18;
                C5228l1 c5228l19;
                card.testCardCase_ = this.testCardCase_;
                card.testCard_ = this.testCard_;
                if (this.testCardCase_ == 1 && (c5228l19 = this.chartBuilder_) != null) {
                    card.testCard_ = c5228l19.build();
                }
                if (this.testCardCase_ == 2 && (c5228l18 = this.selectBuilder_) != null) {
                    card.testCard_ = c5228l18.build();
                }
                if (this.testCardCase_ == 3 && (c5228l17 = this.linkBuilder_) != null) {
                    card.testCard_ = c5228l17.build();
                }
                if (this.testCardCase_ == 4 && (c5228l16 = this.customBuilder_) != null) {
                    card.testCard_ = c5228l16.build();
                }
                if (this.testCardCase_ == 5 && (c5228l15 = this.tableBuilder_) != null) {
                    card.testCard_ = c5228l15.build();
                }
                if (this.testCardCase_ == 6 && (c5228l14 = this.gridBuilder_) != null) {
                    card.testCard_ = c5228l14.build();
                }
                if (this.testCardCase_ == 11 && (c5228l13 = this.linkListBuilder_) != null) {
                    card.testCard_ = c5228l13.build();
                }
                if (this.testCardCase_ == 12 && (c5228l12 = this.customListBuilder_) != null) {
                    card.testCard_ = c5228l12.build();
                }
                if (this.testCardCase_ != 13 || (c5228l1 = this.tableListBuilder_) == null) {
                    return;
                }
                card.testCard_ = c5228l1.build();
            }

            private C5228l1 getChartFieldBuilder() {
                if (this.chartBuilder_ == null) {
                    if (this.testCardCase_ != 1) {
                        this.testCard_ = ChartCard.getDefaultInstance();
                    }
                    this.chartBuilder_ = new C5228l1((ChartCard) this.testCard_, getParentForChildren(), isClean());
                    this.testCard_ = null;
                }
                this.testCardCase_ = 1;
                onChanged();
                return this.chartBuilder_;
            }

            private C5228l1 getCustomFieldBuilder() {
                if (this.customBuilder_ == null) {
                    if (this.testCardCase_ != 4) {
                        this.testCard_ = CustomCard.getDefaultInstance();
                    }
                    this.customBuilder_ = new C5228l1((CustomCard) this.testCard_, getParentForChildren(), isClean());
                    this.testCard_ = null;
                }
                this.testCardCase_ = 4;
                onChanged();
                return this.customBuilder_;
            }

            private C5228l1 getCustomListFieldBuilder() {
                if (this.customListBuilder_ == null) {
                    if (this.testCardCase_ != 12) {
                        this.testCard_ = CustomListCard.getDefaultInstance();
                    }
                    this.customListBuilder_ = new C5228l1((CustomListCard) this.testCard_, getParentForChildren(), isClean());
                    this.testCard_ = null;
                }
                this.testCardCase_ = 12;
                onChanged();
                return this.customListBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_Card_descriptor;
            }

            private C5228l1 getGridFieldBuilder() {
                if (this.gridBuilder_ == null) {
                    if (this.testCardCase_ != 6) {
                        this.testCard_ = GridCard.getDefaultInstance();
                    }
                    this.gridBuilder_ = new C5228l1((GridCard) this.testCard_, getParentForChildren(), isClean());
                    this.testCard_ = null;
                }
                this.testCardCase_ = 6;
                onChanged();
                return this.gridBuilder_;
            }

            private C5228l1 getLinkFieldBuilder() {
                if (this.linkBuilder_ == null) {
                    if (this.testCardCase_ != 3) {
                        this.testCard_ = LinkCard.getDefaultInstance();
                    }
                    this.linkBuilder_ = new C5228l1((LinkCard) this.testCard_, getParentForChildren(), isClean());
                    this.testCard_ = null;
                }
                this.testCardCase_ = 3;
                onChanged();
                return this.linkBuilder_;
            }

            private C5228l1 getLinkListFieldBuilder() {
                if (this.linkListBuilder_ == null) {
                    if (this.testCardCase_ != 11) {
                        this.testCard_ = ListCard.getDefaultInstance();
                    }
                    this.linkListBuilder_ = new C5228l1((ListCard) this.testCard_, getParentForChildren(), isClean());
                    this.testCard_ = null;
                }
                this.testCardCase_ = 11;
                onChanged();
                return this.linkListBuilder_;
            }

            private C5228l1 getSelectFieldBuilder() {
                if (this.selectBuilder_ == null) {
                    if (this.testCardCase_ != 2) {
                        this.testCard_ = SelectCard.getDefaultInstance();
                    }
                    this.selectBuilder_ = new C5228l1((SelectCard) this.testCard_, getParentForChildren(), isClean());
                    this.testCard_ = null;
                }
                this.testCardCase_ = 2;
                onChanged();
                return this.selectBuilder_;
            }

            private C5228l1 getTableFieldBuilder() {
                if (this.tableBuilder_ == null) {
                    if (this.testCardCase_ != 5) {
                        this.testCard_ = TableCard.getDefaultInstance();
                    }
                    this.tableBuilder_ = new C5228l1((TableCard) this.testCard_, getParentForChildren(), isClean());
                    this.testCard_ = null;
                }
                this.testCardCase_ = 5;
                onChanged();
                return this.tableBuilder_;
            }

            private C5228l1 getTableListFieldBuilder() {
                if (this.tableListBuilder_ == null) {
                    if (this.testCardCase_ != 13) {
                        this.testCard_ = TableListCard.getDefaultInstance();
                    }
                    this.tableListBuilder_ = new C5228l1((TableListCard) this.testCard_, getParentForChildren(), isClean());
                    this.testCard_ = null;
                }
                this.testCardCase_ = 13;
                onChanged();
                return this.tableListBuilder_;
            }

            public Builder clearChart() {
                C5228l1 c5228l1 = this.chartBuilder_;
                if (c5228l1 != null) {
                    if (this.testCardCase_ == 1) {
                        this.testCardCase_ = 0;
                        this.testCard_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testCardCase_ == 1) {
                    this.testCardCase_ = 0;
                    this.testCard_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearCustom() {
                C5228l1 c5228l1 = this.customBuilder_;
                if (c5228l1 != null) {
                    if (this.testCardCase_ == 4) {
                        this.testCardCase_ = 0;
                        this.testCard_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testCardCase_ == 4) {
                    this.testCardCase_ = 0;
                    this.testCard_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearCustomList() {
                C5228l1 c5228l1 = this.customListBuilder_;
                if (c5228l1 != null) {
                    if (this.testCardCase_ == 12) {
                        this.testCardCase_ = 0;
                        this.testCard_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testCardCase_ == 12) {
                    this.testCardCase_ = 0;
                    this.testCard_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearGrid() {
                C5228l1 c5228l1 = this.gridBuilder_;
                if (c5228l1 != null) {
                    if (this.testCardCase_ == 6) {
                        this.testCardCase_ = 0;
                        this.testCard_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testCardCase_ == 6) {
                    this.testCardCase_ = 0;
                    this.testCard_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearLink() {
                C5228l1 c5228l1 = this.linkBuilder_;
                if (c5228l1 != null) {
                    if (this.testCardCase_ == 3) {
                        this.testCardCase_ = 0;
                        this.testCard_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testCardCase_ == 3) {
                    this.testCardCase_ = 0;
                    this.testCard_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearLinkList() {
                C5228l1 c5228l1 = this.linkListBuilder_;
                if (c5228l1 != null) {
                    if (this.testCardCase_ == 11) {
                        this.testCardCase_ = 0;
                        this.testCard_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testCardCase_ == 11) {
                    this.testCardCase_ = 0;
                    this.testCard_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearRaw() {
                if (this.testCardCase_ == 21) {
                    this.testCardCase_ = 0;
                    this.testCard_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearSelect() {
                C5228l1 c5228l1 = this.selectBuilder_;
                if (c5228l1 != null) {
                    if (this.testCardCase_ == 2) {
                        this.testCardCase_ = 0;
                        this.testCard_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testCardCase_ == 2) {
                    this.testCardCase_ = 0;
                    this.testCard_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearTable() {
                C5228l1 c5228l1 = this.tableBuilder_;
                if (c5228l1 != null) {
                    if (this.testCardCase_ == 5) {
                        this.testCardCase_ = 0;
                        this.testCard_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testCardCase_ == 5) {
                    this.testCardCase_ = 0;
                    this.testCard_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearTableList() {
                C5228l1 c5228l1 = this.tableListBuilder_;
                if (c5228l1 != null) {
                    if (this.testCardCase_ == 13) {
                        this.testCardCase_ = 0;
                        this.testCard_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testCardCase_ == 13) {
                    this.testCardCase_ = 0;
                    this.testCard_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearTestCard() {
                this.testCardCase_ = 0;
                this.testCard_ = null;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public ChartCard getChart() {
                C5228l1 c5228l1 = this.chartBuilder_;
                return c5228l1 == null ? this.testCardCase_ == 1 ? (ChartCard) this.testCard_ : ChartCard.getDefaultInstance() : this.testCardCase_ == 1 ? (ChartCard) c5228l1.getMessage() : ChartCard.getDefaultInstance();
            }

            public ChartCard.Builder getChartBuilder() {
                return (ChartCard.Builder) getChartFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public ChartCardOrBuilder getChartOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testCardCase_;
                return (i8 != 1 || (c5228l1 = this.chartBuilder_) == null) ? i8 == 1 ? (ChartCard) this.testCard_ : ChartCard.getDefaultInstance() : (ChartCardOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public CustomCard getCustom() {
                C5228l1 c5228l1 = this.customBuilder_;
                return c5228l1 == null ? this.testCardCase_ == 4 ? (CustomCard) this.testCard_ : CustomCard.getDefaultInstance() : this.testCardCase_ == 4 ? (CustomCard) c5228l1.getMessage() : CustomCard.getDefaultInstance();
            }

            public CustomCard.Builder getCustomBuilder() {
                return (CustomCard.Builder) getCustomFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public CustomListCard getCustomList() {
                C5228l1 c5228l1 = this.customListBuilder_;
                return c5228l1 == null ? this.testCardCase_ == 12 ? (CustomListCard) this.testCard_ : CustomListCard.getDefaultInstance() : this.testCardCase_ == 12 ? (CustomListCard) c5228l1.getMessage() : CustomListCard.getDefaultInstance();
            }

            public CustomListCard.Builder getCustomListBuilder() {
                return (CustomListCard.Builder) getCustomListFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public CustomListCardOrBuilder getCustomListOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testCardCase_;
                return (i8 != 12 || (c5228l1 = this.customListBuilder_) == null) ? i8 == 12 ? (CustomListCard) this.testCard_ : CustomListCard.getDefaultInstance() : (CustomListCardOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public CustomCardOrBuilder getCustomOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testCardCase_;
                return (i8 != 4 || (c5228l1 = this.customBuilder_) == null) ? i8 == 4 ? (CustomCard) this.testCard_ : CustomCard.getDefaultInstance() : (CustomCardOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return CardOuterClass.internal_static_maum_m2u_common_Card_descriptor;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public GridCard getGrid() {
                C5228l1 c5228l1 = this.gridBuilder_;
                return c5228l1 == null ? this.testCardCase_ == 6 ? (GridCard) this.testCard_ : GridCard.getDefaultInstance() : this.testCardCase_ == 6 ? (GridCard) c5228l1.getMessage() : GridCard.getDefaultInstance();
            }

            public GridCard.Builder getGridBuilder() {
                return (GridCard.Builder) getGridFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public GridCardOrBuilder getGridOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testCardCase_;
                return (i8 != 6 || (c5228l1 = this.gridBuilder_) == null) ? i8 == 6 ? (GridCard) this.testCard_ : GridCard.getDefaultInstance() : (GridCardOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public LinkCard getLink() {
                C5228l1 c5228l1 = this.linkBuilder_;
                return c5228l1 == null ? this.testCardCase_ == 3 ? (LinkCard) this.testCard_ : LinkCard.getDefaultInstance() : this.testCardCase_ == 3 ? (LinkCard) c5228l1.getMessage() : LinkCard.getDefaultInstance();
            }

            public LinkCard.Builder getLinkBuilder() {
                return (LinkCard.Builder) getLinkFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public ListCard getLinkList() {
                C5228l1 c5228l1 = this.linkListBuilder_;
                return c5228l1 == null ? this.testCardCase_ == 11 ? (ListCard) this.testCard_ : ListCard.getDefaultInstance() : this.testCardCase_ == 11 ? (ListCard) c5228l1.getMessage() : ListCard.getDefaultInstance();
            }

            public ListCard.Builder getLinkListBuilder() {
                return (ListCard.Builder) getLinkListFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public ListCardOrBuilder getLinkListOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testCardCase_;
                return (i8 != 11 || (c5228l1 = this.linkListBuilder_) == null) ? i8 == 11 ? (ListCard) this.testCard_ : ListCard.getDefaultInstance() : (ListCardOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public LinkCardOrBuilder getLinkOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testCardCase_;
                return (i8 != 3 || (c5228l1 = this.linkBuilder_) == null) ? i8 == 3 ? (LinkCard) this.testCard_ : LinkCard.getDefaultInstance() : (LinkCardOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public String getRaw() {
                String str = this.testCardCase_ == 21 ? this.testCard_ : "";
                if (str instanceof String) {
                    return (String) str;
                }
                String stringUtf8 = ((AbstractC5235o) str).toStringUtf8();
                if (this.testCardCase_ == 21) {
                    this.testCard_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public AbstractC5235o getRawBytes() {
                String str = this.testCardCase_ == 21 ? this.testCard_ : "";
                if (!(str instanceof String)) {
                    return (AbstractC5235o) str;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) str);
                if (this.testCardCase_ == 21) {
                    this.testCard_ = abstractC5235oCopyFromUtf8;
                }
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public SelectCard getSelect() {
                C5228l1 c5228l1 = this.selectBuilder_;
                return c5228l1 == null ? this.testCardCase_ == 2 ? (SelectCard) this.testCard_ : SelectCard.getDefaultInstance() : this.testCardCase_ == 2 ? (SelectCard) c5228l1.getMessage() : SelectCard.getDefaultInstance();
            }

            public SelectCard.Builder getSelectBuilder() {
                return (SelectCard.Builder) getSelectFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public SelectCardOrBuilder getSelectOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testCardCase_;
                return (i8 != 2 || (c5228l1 = this.selectBuilder_) == null) ? i8 == 2 ? (SelectCard) this.testCard_ : SelectCard.getDefaultInstance() : (SelectCardOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public TableCard getTable() {
                C5228l1 c5228l1 = this.tableBuilder_;
                return c5228l1 == null ? this.testCardCase_ == 5 ? (TableCard) this.testCard_ : TableCard.getDefaultInstance() : this.testCardCase_ == 5 ? (TableCard) c5228l1.getMessage() : TableCard.getDefaultInstance();
            }

            public TableCard.Builder getTableBuilder() {
                return (TableCard.Builder) getTableFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public TableListCard getTableList() {
                C5228l1 c5228l1 = this.tableListBuilder_;
                return c5228l1 == null ? this.testCardCase_ == 13 ? (TableListCard) this.testCard_ : TableListCard.getDefaultInstance() : this.testCardCase_ == 13 ? (TableListCard) c5228l1.getMessage() : TableListCard.getDefaultInstance();
            }

            public TableListCard.Builder getTableListBuilder() {
                return (TableListCard.Builder) getTableListFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public TableListCardOrBuilder getTableListOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testCardCase_;
                return (i8 != 13 || (c5228l1 = this.tableListBuilder_) == null) ? i8 == 13 ? (TableListCard) this.testCard_ : TableListCard.getDefaultInstance() : (TableListCardOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public TableCardOrBuilder getTableOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testCardCase_;
                return (i8 != 5 || (c5228l1 = this.tableBuilder_) == null) ? i8 == 5 ? (TableCard) this.testCard_ : TableCard.getDefaultInstance() : (TableCardOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public TestCardCase getTestCardCase() {
                return TestCardCase.forNumber(this.testCardCase_);
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public boolean hasChart() {
                return this.testCardCase_ == 1;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public boolean hasCustom() {
                return this.testCardCase_ == 4;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public boolean hasCustomList() {
                return this.testCardCase_ == 12;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public boolean hasGrid() {
                return this.testCardCase_ == 6;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public boolean hasLink() {
                return this.testCardCase_ == 3;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public boolean hasLinkList() {
                return this.testCardCase_ == 11;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public boolean hasRaw() {
                return this.testCardCase_ == 21;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public boolean hasSelect() {
                return this.testCardCase_ == 2;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public boolean hasTable() {
                return this.testCardCase_ == 5;
            }

            @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
            public boolean hasTableList() {
                return this.testCardCase_ == 13;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_Card_fieldAccessorTable.ensureFieldAccessorsInitialized(Card.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeChart(ChartCard chartCard) {
                C5228l1 c5228l1 = this.chartBuilder_;
                if (c5228l1 == null) {
                    if (this.testCardCase_ != 1 || this.testCard_ == ChartCard.getDefaultInstance()) {
                        this.testCard_ = chartCard;
                    } else {
                        this.testCard_ = ChartCard.newBuilder((ChartCard) this.testCard_).mergeFrom(chartCard).buildPartial();
                    }
                    onChanged();
                } else if (this.testCardCase_ == 1) {
                    c5228l1.mergeFrom(chartCard);
                } else {
                    c5228l1.setMessage(chartCard);
                }
                this.testCardCase_ = 1;
                return this;
            }

            public Builder mergeCustom(CustomCard customCard) {
                C5228l1 c5228l1 = this.customBuilder_;
                if (c5228l1 == null) {
                    if (this.testCardCase_ != 4 || this.testCard_ == CustomCard.getDefaultInstance()) {
                        this.testCard_ = customCard;
                    } else {
                        this.testCard_ = CustomCard.newBuilder((CustomCard) this.testCard_).mergeFrom(customCard).buildPartial();
                    }
                    onChanged();
                } else if (this.testCardCase_ == 4) {
                    c5228l1.mergeFrom(customCard);
                } else {
                    c5228l1.setMessage(customCard);
                }
                this.testCardCase_ = 4;
                return this;
            }

            public Builder mergeCustomList(CustomListCard customListCard) {
                C5228l1 c5228l1 = this.customListBuilder_;
                if (c5228l1 == null) {
                    if (this.testCardCase_ != 12 || this.testCard_ == CustomListCard.getDefaultInstance()) {
                        this.testCard_ = customListCard;
                    } else {
                        this.testCard_ = CustomListCard.newBuilder((CustomListCard) this.testCard_).mergeFrom(customListCard).buildPartial();
                    }
                    onChanged();
                } else if (this.testCardCase_ == 12) {
                    c5228l1.mergeFrom(customListCard);
                } else {
                    c5228l1.setMessage(customListCard);
                }
                this.testCardCase_ = 12;
                return this;
            }

            public Builder mergeGrid(GridCard gridCard) {
                C5228l1 c5228l1 = this.gridBuilder_;
                if (c5228l1 == null) {
                    if (this.testCardCase_ != 6 || this.testCard_ == GridCard.getDefaultInstance()) {
                        this.testCard_ = gridCard;
                    } else {
                        this.testCard_ = GridCard.newBuilder((GridCard) this.testCard_).mergeFrom(gridCard).buildPartial();
                    }
                    onChanged();
                } else if (this.testCardCase_ == 6) {
                    c5228l1.mergeFrom(gridCard);
                } else {
                    c5228l1.setMessage(gridCard);
                }
                this.testCardCase_ = 6;
                return this;
            }

            public Builder mergeLink(LinkCard linkCard) {
                C5228l1 c5228l1 = this.linkBuilder_;
                if (c5228l1 == null) {
                    if (this.testCardCase_ != 3 || this.testCard_ == LinkCard.getDefaultInstance()) {
                        this.testCard_ = linkCard;
                    } else {
                        this.testCard_ = LinkCard.newBuilder((LinkCard) this.testCard_).mergeFrom(linkCard).buildPartial();
                    }
                    onChanged();
                } else if (this.testCardCase_ == 3) {
                    c5228l1.mergeFrom(linkCard);
                } else {
                    c5228l1.setMessage(linkCard);
                }
                this.testCardCase_ = 3;
                return this;
            }

            public Builder mergeLinkList(ListCard listCard) {
                C5228l1 c5228l1 = this.linkListBuilder_;
                if (c5228l1 == null) {
                    if (this.testCardCase_ != 11 || this.testCard_ == ListCard.getDefaultInstance()) {
                        this.testCard_ = listCard;
                    } else {
                        this.testCard_ = ListCard.newBuilder((ListCard) this.testCard_).mergeFrom(listCard).buildPartial();
                    }
                    onChanged();
                } else if (this.testCardCase_ == 11) {
                    c5228l1.mergeFrom(listCard);
                } else {
                    c5228l1.setMessage(listCard);
                }
                this.testCardCase_ = 11;
                return this;
            }

            public Builder mergeSelect(SelectCard selectCard) {
                C5228l1 c5228l1 = this.selectBuilder_;
                if (c5228l1 == null) {
                    if (this.testCardCase_ != 2 || this.testCard_ == SelectCard.getDefaultInstance()) {
                        this.testCard_ = selectCard;
                    } else {
                        this.testCard_ = SelectCard.newBuilder((SelectCard) this.testCard_).mergeFrom(selectCard).buildPartial();
                    }
                    onChanged();
                } else if (this.testCardCase_ == 2) {
                    c5228l1.mergeFrom(selectCard);
                } else {
                    c5228l1.setMessage(selectCard);
                }
                this.testCardCase_ = 2;
                return this;
            }

            public Builder mergeTable(TableCard tableCard) {
                C5228l1 c5228l1 = this.tableBuilder_;
                if (c5228l1 == null) {
                    if (this.testCardCase_ != 5 || this.testCard_ == TableCard.getDefaultInstance()) {
                        this.testCard_ = tableCard;
                    } else {
                        this.testCard_ = TableCard.newBuilder((TableCard) this.testCard_).mergeFrom(tableCard).buildPartial();
                    }
                    onChanged();
                } else if (this.testCardCase_ == 5) {
                    c5228l1.mergeFrom(tableCard);
                } else {
                    c5228l1.setMessage(tableCard);
                }
                this.testCardCase_ = 5;
                return this;
            }

            public Builder mergeTableList(TableListCard tableListCard) {
                C5228l1 c5228l1 = this.tableListBuilder_;
                if (c5228l1 == null) {
                    if (this.testCardCase_ != 13 || this.testCard_ == TableListCard.getDefaultInstance()) {
                        this.testCard_ = tableListCard;
                    } else {
                        this.testCard_ = TableListCard.newBuilder((TableListCard) this.testCard_).mergeFrom(tableListCard).buildPartial();
                    }
                    onChanged();
                } else if (this.testCardCase_ == 13) {
                    c5228l1.mergeFrom(tableListCard);
                } else {
                    c5228l1.setMessage(tableListCard);
                }
                this.testCardCase_ = 13;
                return this;
            }

            public Builder setChart(ChartCard chartCard) {
                C5228l1 c5228l1 = this.chartBuilder_;
                if (c5228l1 == null) {
                    chartCard.getClass();
                    this.testCard_ = chartCard;
                    onChanged();
                } else {
                    c5228l1.setMessage(chartCard);
                }
                this.testCardCase_ = 1;
                return this;
            }

            public Builder setCustom(CustomCard customCard) {
                C5228l1 c5228l1 = this.customBuilder_;
                if (c5228l1 == null) {
                    customCard.getClass();
                    this.testCard_ = customCard;
                    onChanged();
                } else {
                    c5228l1.setMessage(customCard);
                }
                this.testCardCase_ = 4;
                return this;
            }

            public Builder setCustomList(CustomListCard customListCard) {
                C5228l1 c5228l1 = this.customListBuilder_;
                if (c5228l1 == null) {
                    customListCard.getClass();
                    this.testCard_ = customListCard;
                    onChanged();
                } else {
                    c5228l1.setMessage(customListCard);
                }
                this.testCardCase_ = 12;
                return this;
            }

            public Builder setGrid(GridCard gridCard) {
                C5228l1 c5228l1 = this.gridBuilder_;
                if (c5228l1 == null) {
                    gridCard.getClass();
                    this.testCard_ = gridCard;
                    onChanged();
                } else {
                    c5228l1.setMessage(gridCard);
                }
                this.testCardCase_ = 6;
                return this;
            }

            public Builder setLink(LinkCard linkCard) {
                C5228l1 c5228l1 = this.linkBuilder_;
                if (c5228l1 == null) {
                    linkCard.getClass();
                    this.testCard_ = linkCard;
                    onChanged();
                } else {
                    c5228l1.setMessage(linkCard);
                }
                this.testCardCase_ = 3;
                return this;
            }

            public Builder setLinkList(ListCard listCard) {
                C5228l1 c5228l1 = this.linkListBuilder_;
                if (c5228l1 == null) {
                    listCard.getClass();
                    this.testCard_ = listCard;
                    onChanged();
                } else {
                    c5228l1.setMessage(listCard);
                }
                this.testCardCase_ = 11;
                return this;
            }

            public Builder setRaw(String str) {
                str.getClass();
                this.testCardCase_ = 21;
                this.testCard_ = str;
                onChanged();
                return this;
            }

            public Builder setRawBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.testCardCase_ = 21;
                this.testCard_ = abstractC5235o;
                onChanged();
                return this;
            }

            public Builder setSelect(SelectCard selectCard) {
                C5228l1 c5228l1 = this.selectBuilder_;
                if (c5228l1 == null) {
                    selectCard.getClass();
                    this.testCard_ = selectCard;
                    onChanged();
                } else {
                    c5228l1.setMessage(selectCard);
                }
                this.testCardCase_ = 2;
                return this;
            }

            public Builder setTable(TableCard tableCard) {
                C5228l1 c5228l1 = this.tableBuilder_;
                if (c5228l1 == null) {
                    tableCard.getClass();
                    this.testCard_ = tableCard;
                    onChanged();
                } else {
                    c5228l1.setMessage(tableCard);
                }
                this.testCardCase_ = 5;
                return this;
            }

            public Builder setTableList(TableListCard tableListCard) {
                C5228l1 c5228l1 = this.tableListBuilder_;
                if (c5228l1 == null) {
                    tableListCard.getClass();
                    this.testCard_ = tableListCard;
                    onChanged();
                } else {
                    c5228l1.setMessage(tableListCard);
                }
                this.testCardCase_ = 13;
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.testCardCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Card build() {
                Card cardBuildPartial = buildPartial();
                if (cardBuildPartial.isInitialized()) {
                    return cardBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) cardBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Card buildPartial() {
                Card card = new Card(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(card);
                }
                buildPartialOneofs(card);
                onBuilt();
                return card;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Card getDefaultInstanceForType() {
                return Card.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.testCardCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                C5228l1 c5228l1 = this.chartBuilder_;
                if (c5228l1 != null) {
                    c5228l1.clear();
                }
                C5228l1 c5228l12 = this.selectBuilder_;
                if (c5228l12 != null) {
                    c5228l12.clear();
                }
                C5228l1 c5228l13 = this.linkBuilder_;
                if (c5228l13 != null) {
                    c5228l13.clear();
                }
                C5228l1 c5228l14 = this.customBuilder_;
                if (c5228l14 != null) {
                    c5228l14.clear();
                }
                C5228l1 c5228l15 = this.tableBuilder_;
                if (c5228l15 != null) {
                    c5228l15.clear();
                }
                C5228l1 c5228l16 = this.gridBuilder_;
                if (c5228l16 != null) {
                    c5228l16.clear();
                }
                C5228l1 c5228l17 = this.linkListBuilder_;
                if (c5228l17 != null) {
                    c5228l17.clear();
                }
                C5228l1 c5228l18 = this.customListBuilder_;
                if (c5228l18 != null) {
                    c5228l18.clear();
                }
                C5228l1 c5228l19 = this.tableListBuilder_;
                if (c5228l19 != null) {
                    c5228l19.clear();
                }
                this.testCardCase_ = 0;
                this.testCard_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof Card) {
                    return mergeFrom((Card) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setChart(ChartCard.Builder builder) {
                C5228l1 c5228l1 = this.chartBuilder_;
                if (c5228l1 == null) {
                    this.testCard_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testCardCase_ = 1;
                return this;
            }

            public Builder setCustom(CustomCard.Builder builder) {
                C5228l1 c5228l1 = this.customBuilder_;
                if (c5228l1 == null) {
                    this.testCard_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testCardCase_ = 4;
                return this;
            }

            public Builder setCustomList(CustomListCard.Builder builder) {
                C5228l1 c5228l1 = this.customListBuilder_;
                if (c5228l1 == null) {
                    this.testCard_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testCardCase_ = 12;
                return this;
            }

            public Builder setGrid(GridCard.Builder builder) {
                C5228l1 c5228l1 = this.gridBuilder_;
                if (c5228l1 == null) {
                    this.testCard_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testCardCase_ = 6;
                return this;
            }

            public Builder setLink(LinkCard.Builder builder) {
                C5228l1 c5228l1 = this.linkBuilder_;
                if (c5228l1 == null) {
                    this.testCard_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testCardCase_ = 3;
                return this;
            }

            public Builder setLinkList(ListCard.Builder builder) {
                C5228l1 c5228l1 = this.linkListBuilder_;
                if (c5228l1 == null) {
                    this.testCard_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testCardCase_ = 11;
                return this;
            }

            public Builder setSelect(SelectCard.Builder builder) {
                C5228l1 c5228l1 = this.selectBuilder_;
                if (c5228l1 == null) {
                    this.testCard_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testCardCase_ = 2;
                return this;
            }

            public Builder setTable(TableCard.Builder builder) {
                C5228l1 c5228l1 = this.tableBuilder_;
                if (c5228l1 == null) {
                    this.testCard_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testCardCase_ = 5;
                return this;
            }

            public Builder setTableList(TableListCard.Builder builder) {
                C5228l1 c5228l1 = this.tableListBuilder_;
                if (c5228l1 == null) {
                    this.testCard_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testCardCase_ = 13;
                return this;
            }

            public Builder mergeFrom(Card card) {
                if (card == Card.getDefaultInstance()) {
                    return this;
                }
                switch (AnonymousClass1.$SwitchMap$maum$m2u$common$CardOuterClass$Card$TestCardCase[card.getTestCardCase().ordinal()]) {
                    case 1:
                        mergeChart(card.getChart());
                        break;
                    case 2:
                        mergeSelect(card.getSelect());
                        break;
                    case 3:
                        mergeLink(card.getLink());
                        break;
                    case 4:
                        mergeCustom(card.getCustom());
                        break;
                    case 5:
                        mergeTable(card.getTable());
                        break;
                    case 6:
                        mergeGrid(card.getGrid());
                        break;
                    case 7:
                        mergeLinkList(card.getLinkList());
                        break;
                    case 8:
                        mergeCustomList(card.getCustomList());
                        break;
                    case 9:
                        mergeTableList(card.getTableList());
                        break;
                    case 10:
                        this.testCardCase_ = 21;
                        this.testCard_ = card.testCard_;
                        onChanged();
                        break;
                }
                mergeUnknownFields(card.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            switch (tag) {
                                case 0:
                                    z8 = true;
                                case 10:
                                    rVar.readMessage(getChartFieldBuilder().getBuilder(), m8);
                                    this.testCardCase_ = 1;
                                case 18:
                                    rVar.readMessage(getSelectFieldBuilder().getBuilder(), m8);
                                    this.testCardCase_ = 2;
                                case 26:
                                    rVar.readMessage(getLinkFieldBuilder().getBuilder(), m8);
                                    this.testCardCase_ = 3;
                                case 34:
                                    rVar.readMessage(getCustomFieldBuilder().getBuilder(), m8);
                                    this.testCardCase_ = 4;
                                case 42:
                                    rVar.readMessage(getTableFieldBuilder().getBuilder(), m8);
                                    this.testCardCase_ = 5;
                                case 50:
                                    rVar.readMessage(getGridFieldBuilder().getBuilder(), m8);
                                    this.testCardCase_ = 6;
                                case AbstractC0834a.MAX_ROWS_IN_BARCODE /* 90 */:
                                    rVar.readMessage(getLinkListFieldBuilder().getBuilder(), m8);
                                    this.testCardCase_ = 11;
                                case DeviceOuterClass.Device.TIMESTAMP_FIELD_NUMBER /* 98 */:
                                    rVar.readMessage(getCustomListFieldBuilder().getBuilder(), m8);
                                    this.testCardCase_ = 12;
                                case 106:
                                    rVar.readMessage(getTableListFieldBuilder().getBuilder(), m8);
                                    this.testCardCase_ = 13;
                                case 170:
                                    String stringRequireUtf8 = rVar.readStringRequireUtf8();
                                    this.testCardCase_ = 21;
                                    this.testCard_ = stringRequireUtf8;
                                default:
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                        z8 = true;
                                    }
                            }
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        public enum TestCardCase implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
            CHART(1),
            SELECT(2),
            LINK(3),
            CUSTOM(4),
            TABLE(5),
            GRID(6),
            LINK_LIST(11),
            CUSTOM_LIST(12),
            TABLE_LIST(13),
            RAW(21),
            TESTCARD_NOT_SET(0);

            private final int value;

            TestCardCase(int i8) {
                this.value = i8;
            }

            public static TestCardCase forNumber(int i8) {
                if (i8 == 21) {
                    return RAW;
                }
                switch (i8) {
                    case 0:
                        return TESTCARD_NOT_SET;
                    case 1:
                        return CHART;
                    case 2:
                        return SELECT;
                    case 3:
                        return LINK;
                    case 4:
                        return CUSTOM;
                    case 5:
                        return TABLE;
                    case 6:
                        return GRID;
                    default:
                        switch (i8) {
                            case 11:
                                return LINK_LIST;
                            case 12:
                                return CUSTOM_LIST;
                            case 13:
                                return TABLE_LIST;
                            default:
                                return null;
                        }
                }
            }

            @Override // com.google.protobuf.AbstractC5227l0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static TestCardCase valueOf(int i8) {
                return forNumber(i8);
            }
        }

        /* synthetic */ Card(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static Card getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return CardOuterClass.internal_static_maum_m2u_common_Card_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Card parseDelimitedFrom(InputStream inputStream) {
            return (Card) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Card parseFrom(ByteBuffer byteBuffer) {
            return (Card) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return super.equals(obj);
            }
            Card card = (Card) obj;
            if (!getTestCardCase().equals(card.getTestCardCase())) {
                return false;
            }
            int i8 = this.testCardCase_;
            if (i8 != 21) {
                switch (i8) {
                    case 1:
                        if (!getChart().equals(card.getChart())) {
                            return false;
                        }
                        break;
                    case 2:
                        if (!getSelect().equals(card.getSelect())) {
                            return false;
                        }
                        break;
                    case 3:
                        if (!getLink().equals(card.getLink())) {
                            return false;
                        }
                        break;
                    case 4:
                        if (!getCustom().equals(card.getCustom())) {
                            return false;
                        }
                        break;
                    case 5:
                        if (!getTable().equals(card.getTable())) {
                            return false;
                        }
                        break;
                    case 6:
                        if (!getGrid().equals(card.getGrid())) {
                            return false;
                        }
                        break;
                    default:
                        switch (i8) {
                            case 11:
                                if (!getLinkList().equals(card.getLinkList())) {
                                    return false;
                                }
                                break;
                            case 12:
                                if (!getCustomList().equals(card.getCustomList())) {
                                    return false;
                                }
                                break;
                            case 13:
                                if (!getTableList().equals(card.getTableList())) {
                                    return false;
                                }
                                break;
                        }
                }
            } else if (!getRaw().equals(card.getRaw())) {
                return false;
            }
            return getUnknownFields().equals(card.getUnknownFields());
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public ChartCard getChart() {
            return this.testCardCase_ == 1 ? (ChartCard) this.testCard_ : ChartCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public ChartCardOrBuilder getChartOrBuilder() {
            return this.testCardCase_ == 1 ? (ChartCard) this.testCard_ : ChartCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public CustomCard getCustom() {
            return this.testCardCase_ == 4 ? (CustomCard) this.testCard_ : CustomCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public CustomListCard getCustomList() {
            return this.testCardCase_ == 12 ? (CustomListCard) this.testCard_ : CustomListCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public CustomListCardOrBuilder getCustomListOrBuilder() {
            return this.testCardCase_ == 12 ? (CustomListCard) this.testCard_ : CustomListCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public CustomCardOrBuilder getCustomOrBuilder() {
            return this.testCardCase_ == 4 ? (CustomCard) this.testCard_ : CustomCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public GridCard getGrid() {
            return this.testCardCase_ == 6 ? (GridCard) this.testCard_ : GridCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public GridCardOrBuilder getGridOrBuilder() {
            return this.testCardCase_ == 6 ? (GridCard) this.testCard_ : GridCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public LinkCard getLink() {
            return this.testCardCase_ == 3 ? (LinkCard) this.testCard_ : LinkCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public ListCard getLinkList() {
            return this.testCardCase_ == 11 ? (ListCard) this.testCard_ : ListCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public ListCardOrBuilder getLinkListOrBuilder() {
            return this.testCardCase_ == 11 ? (ListCard) this.testCard_ : ListCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public LinkCardOrBuilder getLinkOrBuilder() {
            return this.testCardCase_ == 3 ? (LinkCard) this.testCard_ : LinkCard.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public String getRaw() {
            String str = this.testCardCase_ == 21 ? this.testCard_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            String stringUtf8 = ((AbstractC5235o) str).toStringUtf8();
            if (this.testCardCase_ == 21) {
                this.testCard_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public AbstractC5235o getRawBytes() {
            String str = this.testCardCase_ == 21 ? this.testCard_ : "";
            if (!(str instanceof String)) {
                return (AbstractC5235o) str;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) str);
            if (this.testCardCase_ == 21) {
                this.testCard_ = abstractC5235oCopyFromUtf8;
            }
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public SelectCard getSelect() {
            return this.testCardCase_ == 2 ? (SelectCard) this.testCard_ : SelectCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public SelectCardOrBuilder getSelectOrBuilder() {
            return this.testCardCase_ == 2 ? (SelectCard) this.testCard_ : SelectCard.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeMessageSize = this.testCardCase_ == 1 ? AbstractC5248t.computeMessageSize(1, (ChartCard) this.testCard_) : 0;
            if (this.testCardCase_ == 2) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(2, (SelectCard) this.testCard_);
            }
            if (this.testCardCase_ == 3) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(3, (LinkCard) this.testCard_);
            }
            if (this.testCardCase_ == 4) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(4, (CustomCard) this.testCard_);
            }
            if (this.testCardCase_ == 5) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(5, (TableCard) this.testCard_);
            }
            if (this.testCardCase_ == 6) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(6, (GridCard) this.testCard_);
            }
            if (this.testCardCase_ == 11) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(11, (ListCard) this.testCard_);
            }
            if (this.testCardCase_ == 12) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(12, (CustomListCard) this.testCard_);
            }
            if (this.testCardCase_ == 13) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(13, (TableListCard) this.testCard_);
            }
            if (this.testCardCase_ == 21) {
                iComputeMessageSize += AbstractC5209f0.computeStringSize(21, this.testCard_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public TableCard getTable() {
            return this.testCardCase_ == 5 ? (TableCard) this.testCard_ : TableCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public TableListCard getTableList() {
            return this.testCardCase_ == 13 ? (TableListCard) this.testCard_ : TableListCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public TableListCardOrBuilder getTableListOrBuilder() {
            return this.testCardCase_ == 13 ? (TableListCard) this.testCard_ : TableListCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public TableCardOrBuilder getTableOrBuilder() {
            return this.testCardCase_ == 5 ? (TableCard) this.testCard_ : TableCard.getDefaultInstance();
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public TestCardCase getTestCardCase() {
            return TestCardCase.forNumber(this.testCardCase_);
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public boolean hasChart() {
            return this.testCardCase_ == 1;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public boolean hasCustom() {
            return this.testCardCase_ == 4;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public boolean hasCustomList() {
            return this.testCardCase_ == 12;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public boolean hasGrid() {
            return this.testCardCase_ == 6;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public boolean hasLink() {
            return this.testCardCase_ == 3;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public boolean hasLinkList() {
            return this.testCardCase_ == 11;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public boolean hasRaw() {
            return this.testCardCase_ == 21;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public boolean hasSelect() {
            return this.testCardCase_ == 2;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public boolean hasTable() {
            return this.testCardCase_ == 5;
        }

        @Override // maum.m2u.common.CardOuterClass.CardOrBuilder
        public boolean hasTableList() {
            return this.testCardCase_ == 13;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8;
            int iHashCode;
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode2 = 779 + getDescriptor().hashCode();
            int i10 = this.testCardCase_;
            if (i10 != 21) {
                switch (i10) {
                    case 1:
                        i8 = ((iHashCode2 * 37) + 1) * 53;
                        iHashCode = getChart().hashCode();
                        break;
                    case 2:
                        i8 = ((iHashCode2 * 37) + 2) * 53;
                        iHashCode = getSelect().hashCode();
                        break;
                    case 3:
                        i8 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getLink().hashCode();
                        break;
                    case 4:
                        i8 = ((iHashCode2 * 37) + 4) * 53;
                        iHashCode = getCustom().hashCode();
                        break;
                    case 5:
                        i8 = ((iHashCode2 * 37) + 5) * 53;
                        iHashCode = getTable().hashCode();
                        break;
                    case 6:
                        i8 = ((iHashCode2 * 37) + 6) * 53;
                        iHashCode = getGrid().hashCode();
                        break;
                    default:
                        switch (i10) {
                            case 11:
                                i8 = ((iHashCode2 * 37) + 11) * 53;
                                iHashCode = getLinkList().hashCode();
                                break;
                            case 12:
                                i8 = ((iHashCode2 * 37) + 12) * 53;
                                iHashCode = getCustomList().hashCode();
                                break;
                            case 13:
                                i8 = ((iHashCode2 * 37) + 13) * 53;
                                iHashCode = getTableList().hashCode();
                                break;
                        }
                }
                int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            i8 = ((iHashCode2 * 37) + 21) * 53;
            iHashCode = getRaw().hashCode();
            iHashCode2 = i8 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return CardOuterClass.internal_static_maum_m2u_common_Card_fieldAccessorTable.ensureFieldAccessorsInitialized(Card.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new Card();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (this.testCardCase_ == 1) {
                abstractC5248t.writeMessage(1, (ChartCard) this.testCard_);
            }
            if (this.testCardCase_ == 2) {
                abstractC5248t.writeMessage(2, (SelectCard) this.testCard_);
            }
            if (this.testCardCase_ == 3) {
                abstractC5248t.writeMessage(3, (LinkCard) this.testCard_);
            }
            if (this.testCardCase_ == 4) {
                abstractC5248t.writeMessage(4, (CustomCard) this.testCard_);
            }
            if (this.testCardCase_ == 5) {
                abstractC5248t.writeMessage(5, (TableCard) this.testCard_);
            }
            if (this.testCardCase_ == 6) {
                abstractC5248t.writeMessage(6, (GridCard) this.testCard_);
            }
            if (this.testCardCase_ == 11) {
                abstractC5248t.writeMessage(11, (ListCard) this.testCard_);
            }
            if (this.testCardCase_ == 12) {
                abstractC5248t.writeMessage(12, (CustomListCard) this.testCard_);
            }
            if (this.testCardCase_ == 13) {
                abstractC5248t.writeMessage(13, (TableListCard) this.testCard_);
            }
            if (this.testCardCase_ == 21) {
                AbstractC5209f0.writeString(abstractC5248t, 21, this.testCard_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private Card(AbstractC5209f0.b bVar) {
            super(bVar);
            this.testCardCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Card card) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(card);
        }

        public static Card parseFrom(ByteBuffer byteBuffer, M m8) {
            return (Card) PARSER.parseFrom(byteBuffer, m8);
        }

        public static Card parseDelimitedFrom(InputStream inputStream, M m8) {
            return (Card) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static Card parseFrom(AbstractC5235o abstractC5235o) {
            return (Card) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public Card getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static Card parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (Card) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Card() {
            this.testCardCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Card parseFrom(byte[] bArr) {
            return (Card) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static Card parseFrom(byte[] bArr, M m8) {
            return (Card) PARSER.parseFrom(bArr, m8);
        }

        public static Card parseFrom(InputStream inputStream) {
            return (Card) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static Card parseFrom(InputStream inputStream, M m8) {
            return (Card) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static Card parseFrom(r rVar) {
            return (Card) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static Card parseFrom(r rVar, M m8) {
            return (Card) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface CardOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        ChartCard getChart();

        ChartCardOrBuilder getChartOrBuilder();

        CustomCard getCustom();

        CustomListCard getCustomList();

        CustomListCardOrBuilder getCustomListOrBuilder();

        CustomCardOrBuilder getCustomOrBuilder();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        GridCard getGrid();

        GridCardOrBuilder getGridOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        LinkCard getLink();

        ListCard getLinkList();

        ListCardOrBuilder getLinkListOrBuilder();

        LinkCardOrBuilder getLinkOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getRaw();

        AbstractC5235o getRawBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        SelectCard getSelect();

        SelectCardOrBuilder getSelectOrBuilder();

        TableCard getTable();

        TableListCard getTableList();

        TableListCardOrBuilder getTableListOrBuilder();

        TableCardOrBuilder getTableOrBuilder();

        Card.TestCardCase getTestCardCase();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasChart();

        boolean hasCustom();

        boolean hasCustomList();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasGrid();

        boolean hasLink();

        boolean hasLinkList();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasRaw();

        boolean hasSelect();

        boolean hasTable();

        boolean hasTableList();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class ChartCard extends AbstractC5209f0 implements ChartCardOrBuilder {
        public static final int DATA_FIELD_NUMBER = 10;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<C5253v0> data_;
        private byte memoizedIsInitialized;
        private C5240p1 options_;
        private volatile Object type_;
        private static final ChartCard DEFAULT_INSTANCE = new ChartCard();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.ChartCard.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public ChartCard parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = ChartCard.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements ChartCardOrBuilder {
            private int bitField0_;
            private C5213g1 dataBuilder_;
            private List<C5253v0> data_;
            private C5228l1 optionsBuilder_;
            private C5240p1 options_;
            private Object type_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(ChartCard chartCard) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    chartCard.type_ = this.type_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.optionsBuilder_;
                    chartCard.options_ = c5228l1 == null ? this.options_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                ChartCard.access$976(chartCard, i8);
            }

            private void buildPartialRepeatedFields(ChartCard chartCard) {
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 != null) {
                    chartCard.data_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.data_ = Collections.unmodifiableList(this.data_);
                    this.bitField0_ &= -5;
                }
                chartCard.data_ = this.data_;
            }

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 4;
                }
            }

            private C5213g1 getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new C5213g1(this.data_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_ChartCard_descriptor;
            }

            private C5228l1 getOptionsFieldBuilder() {
                if (this.optionsBuilder_ == null) {
                    this.optionsBuilder_ = new C5228l1(getOptions(), getParentForChildren(), isClean());
                    this.options_ = null;
                }
                return this.optionsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getOptionsFieldBuilder();
                    getDataFieldBuilder();
                }
            }

            public Builder addAllData(Iterable<? extends C5253v0> iterable) {
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 == null) {
                    ensureDataIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.data_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addData(C5253v0 c5253v0) {
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 == null) {
                    c5253v0.getClass();
                    ensureDataIsMutable();
                    this.data_.add(c5253v0);
                    onChanged();
                } else {
                    c5213g1.addMessage(c5253v0);
                }
                return this;
            }

            public C5253v0.b addDataBuilder() {
                return (C5253v0.b) getDataFieldBuilder().addBuilder(C5253v0.getDefaultInstance());
            }

            public Builder clearData() {
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearOptions() {
                this.bitField0_ &= -3;
                this.options_ = null;
                C5228l1 c5228l1 = this.optionsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.optionsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = ChartCard.getDefaultInstance().getType();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
            public C5253v0 getData(int i8) {
                C5213g1 c5213g1 = this.dataBuilder_;
                return c5213g1 == null ? this.data_.get(i8) : (C5253v0) c5213g1.getMessage(i8);
            }

            public C5253v0.b getDataBuilder(int i8) {
                return (C5253v0.b) getDataFieldBuilder().getBuilder(i8);
            }

            public List<C5253v0.b> getDataBuilderList() {
                return getDataFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
            public int getDataCount() {
                C5213g1 c5213g1 = this.dataBuilder_;
                return c5213g1 == null ? this.data_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
            public List<C5253v0> getDataList() {
                C5213g1 c5213g1 = this.dataBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.data_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
            public InterfaceC5268w0 getDataOrBuilder(int i8) {
                C5213g1 c5213g1 = this.dataBuilder_;
                return c5213g1 == null ? this.data_.get(i8) : (InterfaceC5268w0) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
            public List<? extends InterfaceC5268w0> getDataOrBuilderList() {
                C5213g1 c5213g1 = this.dataBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return CardOuterClass.internal_static_maum_m2u_common_ChartCard_descriptor;
            }

            @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
            public C5240p1 getOptions() {
                C5228l1 c5228l1 = this.optionsBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.options_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getOptionsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (C5240p1.b) getOptionsFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
            public InterfaceC5243q1 getOptionsOrBuilder() {
                C5228l1 c5228l1 = this.optionsBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.options_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
            public AbstractC5235o getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.type_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
            public boolean hasOptions() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_ChartCard_fieldAccessorTable.ensureFieldAccessorsInitialized(ChartCard.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeOptions(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.optionsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 2) == 0 || (c5240p12 = this.options_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.options_ = c5240p1;
                } else {
                    getOptionsBuilder().mergeFrom(c5240p1);
                }
                if (this.options_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder removeData(int i8) {
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 == null) {
                    ensureDataIsMutable();
                    this.data_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setData(int i8, C5253v0 c5253v0) {
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 == null) {
                    c5253v0.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i8, c5253v0);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, c5253v0);
                }
                return this;
            }

            public Builder setOptions(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.optionsBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.options_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTypeBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.type_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.type_ = "";
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public ChartCard build() {
                ChartCard chartCardBuildPartial = buildPartial();
                if (chartCardBuildPartial.isInitialized()) {
                    return chartCardBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) chartCardBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public ChartCard buildPartial() {
                ChartCard chartCard = new ChartCard(this, null);
                buildPartialRepeatedFields(chartCard);
                if (this.bitField0_ != 0) {
                    buildPartial0(chartCard);
                }
                onBuilt();
                return chartCard;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public ChartCard getDefaultInstanceForType() {
                return ChartCard.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            public C5253v0.b addDataBuilder(int i8) {
                return (C5253v0.b) getDataFieldBuilder().addBuilder(i8, C5253v0.getDefaultInstance());
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = "";
                this.options_ = null;
                C5228l1 c5228l1 = this.optionsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.optionsBuilder_ = null;
                }
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 == null) {
                    this.data_ = Collections.emptyList();
                } else {
                    this.data_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.type_ = "";
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addData(int i8, C5253v0 c5253v0) {
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 == null) {
                    c5253v0.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i8, c5253v0);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, c5253v0);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof ChartCard) {
                    return mergeFrom((ChartCard) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setData(int i8, C5253v0.b bVar) {
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 == null) {
                    ensureDataIsMutable();
                    this.data_.set(i8, bVar.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, bVar.build());
                }
                return this;
            }

            public Builder setOptions(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.optionsBuilder_;
                if (c5228l1 == null) {
                    this.options_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(ChartCard chartCard) {
                if (chartCard == ChartCard.getDefaultInstance()) {
                    return this;
                }
                if (!chartCard.getType().isEmpty()) {
                    this.type_ = chartCard.type_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (chartCard.hasOptions()) {
                    mergeOptions(chartCard.getOptions());
                }
                if (this.dataBuilder_ == null) {
                    if (!chartCard.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = chartCard.data_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(chartCard.data_);
                        }
                        onChanged();
                    }
                } else if (!chartCard.data_.isEmpty()) {
                    if (!this.dataBuilder_.isEmpty()) {
                        this.dataBuilder_.addAllMessages(chartCard.data_);
                    } else {
                        this.dataBuilder_.dispose();
                        this.dataBuilder_ = null;
                        this.data_ = chartCard.data_;
                        this.bitField0_ &= -5;
                        this.dataBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(chartCard.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addData(C5253v0.b bVar) {
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 == null) {
                    ensureDataIsMutable();
                    this.data_.add(bVar.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(bVar.build());
                }
                return this;
            }

            public Builder addData(int i8, C5253v0.b bVar) {
                C5213g1 c5213g1 = this.dataBuilder_;
                if (c5213g1 == null) {
                    ensureDataIsMutable();
                    this.data_.add(i8, bVar.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, bVar.build());
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.type_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    rVar.readMessage(getOptionsFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 2;
                                } else if (tag != 82) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    C5253v0 c5253v0 = (C5253v0) rVar.readMessage(C5253v0.parser(), m8);
                                    C5213g1 c5213g1 = this.dataBuilder_;
                                    if (c5213g1 == null) {
                                        ensureDataIsMutable();
                                        this.data_.add(c5253v0);
                                    } else {
                                        c5213g1.addMessage(c5253v0);
                                    }
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ ChartCard(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$976(ChartCard chartCard, int i8) {
            int i9 = i8 | chartCard.bitField0_;
            chartCard.bitField0_ = i9;
            return i9;
        }

        public static ChartCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return CardOuterClass.internal_static_maum_m2u_common_ChartCard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChartCard parseDelimitedFrom(InputStream inputStream) {
            return (ChartCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChartCard parseFrom(ByteBuffer byteBuffer) {
            return (ChartCard) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChartCard)) {
                return super.equals(obj);
            }
            ChartCard chartCard = (ChartCard) obj;
            if (getType().equals(chartCard.getType()) && hasOptions() == chartCard.hasOptions()) {
                return (!hasOptions() || getOptions().equals(chartCard.getOptions())) && getDataList().equals(chartCard.getDataList()) && getUnknownFields().equals(chartCard.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
        public C5253v0 getData(int i8) {
            return this.data_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
        public List<C5253v0> getDataList() {
            return this.data_;
        }

        @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
        public InterfaceC5268w0 getDataOrBuilder(int i8) {
            return this.data_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
        public List<? extends InterfaceC5268w0> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
        public C5240p1 getOptions() {
            C5240p1 c5240p1 = this.options_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
        public InterfaceC5243q1 getOptionsOrBuilder() {
            C5240p1 c5240p1 = this.options_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.type_) ? AbstractC5209f0.computeStringSize(1, this.type_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(2, getOptions());
            }
            for (int i9 = 0; i9 < this.data_.size(); i9++) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(10, this.data_.get(i9));
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
        public AbstractC5235o getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.type_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.ChartCardOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode();
            if (hasOptions()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getOptions().hashCode();
            }
            if (getDataCount() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getDataList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return CardOuterClass.internal_static_maum_m2u_common_ChartCard_fieldAccessorTable.ensureFieldAccessorsInitialized(ChartCard.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new ChartCard();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.type_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.type_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(2, getOptions());
            }
            for (int i8 = 0; i8 < this.data_.size(); i8++) {
                abstractC5248t.writeMessage(10, this.data_.get(i8));
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private ChartCard(AbstractC5209f0.b bVar) {
            super(bVar);
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(ChartCard chartCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chartCard);
        }

        public static ChartCard parseFrom(ByteBuffer byteBuffer, M m8) {
            return (ChartCard) PARSER.parseFrom(byteBuffer, m8);
        }

        public static ChartCard parseDelimitedFrom(InputStream inputStream, M m8) {
            return (ChartCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static ChartCard parseFrom(AbstractC5235o abstractC5235o) {
            return (ChartCard) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public ChartCard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static ChartCard parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (ChartCard) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ChartCard() {
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = "";
            this.data_ = Collections.emptyList();
        }

        public static ChartCard parseFrom(byte[] bArr) {
            return (ChartCard) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static ChartCard parseFrom(byte[] bArr, M m8) {
            return (ChartCard) PARSER.parseFrom(bArr, m8);
        }

        public static ChartCard parseFrom(InputStream inputStream) {
            return (ChartCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static ChartCard parseFrom(InputStream inputStream, M m8) {
            return (ChartCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static ChartCard parseFrom(r rVar) {
            return (ChartCard) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static ChartCard parseFrom(r rVar, M m8) {
            return (ChartCard) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface ChartCardOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        C5253v0 getData(int i8);

        int getDataCount();

        List<C5253v0> getDataList();

        InterfaceC5268w0 getDataOrBuilder(int i8);

        List<? extends InterfaceC5268w0> getDataOrBuilderList();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        C5240p1 getOptions();

        InterfaceC5243q1 getOptionsOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getType();

        AbstractC5235o getTypeBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasOptions();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class CustomCard extends AbstractC5209f0 implements CustomCardOrBuilder {
        public static final int CARD_DATA_FIELD_NUMBER = 10;
        private static final CustomCard DEFAULT_INSTANCE = new CustomCard();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.CustomCard.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public CustomCard parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = CustomCard.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private C5240p1 cardData_;
        private byte memoizedIsInitialized;
        private volatile Object type_;

        public static final class Builder extends AbstractC5209f0.b implements CustomCardOrBuilder {
            private int bitField0_;
            private C5228l1 cardDataBuilder_;
            private C5240p1 cardData_;
            private Object type_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(CustomCard customCard) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    customCard.type_ = this.type_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.cardDataBuilder_;
                    customCard.cardData_ = c5228l1 == null ? this.cardData_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                CustomCard.access$7376(customCard, i8);
            }

            private C5228l1 getCardDataFieldBuilder() {
                if (this.cardDataBuilder_ == null) {
                    this.cardDataBuilder_ = new C5228l1(getCardData(), getParentForChildren(), isClean());
                    this.cardData_ = null;
                }
                return this.cardDataBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_CustomCard_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getCardDataFieldBuilder();
                }
            }

            public Builder clearCardData() {
                this.bitField0_ &= -3;
                this.cardData_ = null;
                C5228l1 c5228l1 = this.cardDataBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.cardDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = CustomCard.getDefaultInstance().getType();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.CardOuterClass.CustomCardOrBuilder
            public C5240p1 getCardData() {
                C5228l1 c5228l1 = this.cardDataBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.cardData_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getCardDataBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (C5240p1.b) getCardDataFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.CustomCardOrBuilder
            public InterfaceC5243q1 getCardDataOrBuilder() {
                C5228l1 c5228l1 = this.cardDataBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.cardData_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return CardOuterClass.internal_static_maum_m2u_common_CustomCard_descriptor;
            }

            @Override // maum.m2u.common.CardOuterClass.CustomCardOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.CustomCardOrBuilder
            public AbstractC5235o getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.type_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.CustomCardOrBuilder
            public boolean hasCardData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_CustomCard_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomCard.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCardData(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.cardDataBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 2) == 0 || (c5240p12 = this.cardData_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.cardData_ = c5240p1;
                } else {
                    getCardDataBuilder().mergeFrom(c5240p1);
                }
                if (this.cardData_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setCardData(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.cardDataBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.cardData_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTypeBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.type_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.type_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public CustomCard build() {
                CustomCard customCardBuildPartial = buildPartial();
                if (customCardBuildPartial.isInitialized()) {
                    return customCardBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) customCardBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public CustomCard buildPartial() {
                CustomCard customCard = new CustomCard(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(customCard);
                }
                onBuilt();
                return customCard;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public CustomCard getDefaultInstanceForType() {
                return CustomCard.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = "";
                this.cardData_ = null;
                C5228l1 c5228l1 = this.cardDataBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.cardDataBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.type_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof CustomCard) {
                    return mergeFrom((CustomCard) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setCardData(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.cardDataBuilder_;
                if (c5228l1 == null) {
                    this.cardData_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(CustomCard customCard) {
                if (customCard == CustomCard.getDefaultInstance()) {
                    return this;
                }
                if (!customCard.getType().isEmpty()) {
                    this.type_ = customCard.type_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (customCard.hasCardData()) {
                    mergeCardData(customCard.getCardData());
                }
                mergeUnknownFields(customCard.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.type_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 82) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getCardDataFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 2;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ CustomCard(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$7376(CustomCard customCard, int i8) {
            int i9 = i8 | customCard.bitField0_;
            customCard.bitField0_ = i9;
            return i9;
        }

        public static CustomCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return CardOuterClass.internal_static_maum_m2u_common_CustomCard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CustomCard parseDelimitedFrom(InputStream inputStream) {
            return (CustomCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CustomCard parseFrom(ByteBuffer byteBuffer) {
            return (CustomCard) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomCard)) {
                return super.equals(obj);
            }
            CustomCard customCard = (CustomCard) obj;
            if (getType().equals(customCard.getType()) && hasCardData() == customCard.hasCardData()) {
                return (!hasCardData() || getCardData().equals(customCard.getCardData())) && getUnknownFields().equals(customCard.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.CardOuterClass.CustomCardOrBuilder
        public C5240p1 getCardData() {
            C5240p1 c5240p1 = this.cardData_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.CardOuterClass.CustomCardOrBuilder
        public InterfaceC5243q1 getCardDataOrBuilder() {
            C5240p1 c5240p1 = this.cardData_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.type_) ? AbstractC5209f0.computeStringSize(1, this.type_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(10, getCardData());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.CardOuterClass.CustomCardOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.CustomCardOrBuilder
        public AbstractC5235o getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.type_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.CustomCardOrBuilder
        public boolean hasCardData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode();
            if (hasCardData()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getCardData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return CardOuterClass.internal_static_maum_m2u_common_CustomCard_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomCard.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new CustomCard();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.type_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.type_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(10, getCardData());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private CustomCard(AbstractC5209f0.b bVar) {
            super(bVar);
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(CustomCard customCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(customCard);
        }

        public static CustomCard parseFrom(ByteBuffer byteBuffer, M m8) {
            return (CustomCard) PARSER.parseFrom(byteBuffer, m8);
        }

        public static CustomCard parseDelimitedFrom(InputStream inputStream, M m8) {
            return (CustomCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static CustomCard parseFrom(AbstractC5235o abstractC5235o) {
            return (CustomCard) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public CustomCard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static CustomCard parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (CustomCard) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private CustomCard() {
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = "";
        }

        public static CustomCard parseFrom(byte[] bArr) {
            return (CustomCard) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static CustomCard parseFrom(byte[] bArr, M m8) {
            return (CustomCard) PARSER.parseFrom(bArr, m8);
        }

        public static CustomCard parseFrom(InputStream inputStream) {
            return (CustomCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static CustomCard parseFrom(InputStream inputStream, M m8) {
            return (CustomCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static CustomCard parseFrom(r rVar) {
            return (CustomCard) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static CustomCard parseFrom(r rVar, M m8) {
            return (CustomCard) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface CustomCardOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        C5240p1 getCardData();

        InterfaceC5243q1 getCardDataOrBuilder();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getType();

        AbstractC5235o getTypeBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasCardData();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class CustomListCard extends AbstractC5209f0 implements CustomListCardOrBuilder {
        public static final int CARDS_FIELD_NUMBER = 1;
        public static final int HORIZONTAL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<CustomCard> cards_;
        private boolean horizontal_;
        private byte memoizedIsInitialized;
        private static final CustomListCard DEFAULT_INSTANCE = new CustomListCard();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.CustomListCard.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public CustomListCard parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = CustomListCard.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements CustomListCardOrBuilder {
            private int bitField0_;
            private C5213g1 cardsBuilder_;
            private List<CustomCard> cards_;
            private boolean horizontal_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(CustomListCard customListCard) {
                if ((this.bitField0_ & 2) != 0) {
                    customListCard.horizontal_ = this.horizontal_;
                }
            }

            private void buildPartialRepeatedFields(CustomListCard customListCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 != null) {
                    customListCard.cards_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.cards_ = Collections.unmodifiableList(this.cards_);
                    this.bitField0_ &= -2;
                }
                customListCard.cards_ = this.cards_;
            }

            private void ensureCardsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.cards_ = new ArrayList(this.cards_);
                    this.bitField0_ |= 1;
                }
            }

            private C5213g1 getCardsFieldBuilder() {
                if (this.cardsBuilder_ == null) {
                    this.cardsBuilder_ = new C5213g1(this.cards_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.cards_ = null;
                }
                return this.cardsBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_CustomListCard_descriptor;
            }

            public Builder addAllCards(Iterable<? extends CustomCard> iterable) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.cards_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addCards(CustomCard customCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    customCard.getClass();
                    ensureCardsIsMutable();
                    this.cards_.add(customCard);
                    onChanged();
                } else {
                    c5213g1.addMessage(customCard);
                }
                return this;
            }

            public CustomCard.Builder addCardsBuilder() {
                return (CustomCard.Builder) getCardsFieldBuilder().addBuilder(CustomCard.getDefaultInstance());
            }

            public Builder clearCards() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    this.cards_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearHorizontal() {
                this.bitField0_ &= -3;
                this.horizontal_ = false;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
            public CustomCard getCards(int i8) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? this.cards_.get(i8) : (CustomCard) c5213g1.getMessage(i8);
            }

            public CustomCard.Builder getCardsBuilder(int i8) {
                return (CustomCard.Builder) getCardsFieldBuilder().getBuilder(i8);
            }

            public List<CustomCard.Builder> getCardsBuilderList() {
                return getCardsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
            public int getCardsCount() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? this.cards_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
            public List<CustomCard> getCardsList() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.cards_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
            public CustomCardOrBuilder getCardsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? this.cards_.get(i8) : (CustomCardOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
            public List<? extends CustomCardOrBuilder> getCardsOrBuilderList() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.cards_);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return CardOuterClass.internal_static_maum_m2u_common_CustomListCard_descriptor;
            }

            @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
            public boolean getHorizontal() {
                return this.horizontal_;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_CustomListCard_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomListCard.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeCards(int i8) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setCards(int i8, CustomCard customCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    customCard.getClass();
                    ensureCardsIsMutable();
                    this.cards_.set(i8, customCard);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, customCard);
                }
                return this;
            }

            public Builder setHorizontal(boolean z8) {
                this.horizontal_ = z8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.cards_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public CustomListCard build() {
                CustomListCard customListCardBuildPartial = buildPartial();
                if (customListCardBuildPartial.isInitialized()) {
                    return customListCardBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) customListCardBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public CustomListCard buildPartial() {
                CustomListCard customListCard = new CustomListCard(this, null);
                buildPartialRepeatedFields(customListCard);
                if (this.bitField0_ != 0) {
                    buildPartial0(customListCard);
                }
                onBuilt();
                return customListCard;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public CustomListCard getDefaultInstanceForType() {
                return CustomListCard.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            public CustomCard.Builder addCardsBuilder(int i8) {
                return (CustomCard.Builder) getCardsFieldBuilder().addBuilder(i8, CustomCard.getDefaultInstance());
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.cards_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    this.cards_ = Collections.emptyList();
                } else {
                    this.cards_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -2;
                this.horizontal_ = false;
                return this;
            }

            public Builder addCards(int i8, CustomCard customCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    customCard.getClass();
                    ensureCardsIsMutable();
                    this.cards_.add(i8, customCard);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, customCard);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof CustomListCard) {
                    return mergeFrom((CustomListCard) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setCards(int i8, CustomCard.Builder builder) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(CustomListCard customListCard) {
                if (customListCard == CustomListCard.getDefaultInstance()) {
                    return this;
                }
                if (this.cardsBuilder_ == null) {
                    if (!customListCard.cards_.isEmpty()) {
                        if (this.cards_.isEmpty()) {
                            this.cards_ = customListCard.cards_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCardsIsMutable();
                            this.cards_.addAll(customListCard.cards_);
                        }
                        onChanged();
                    }
                } else if (!customListCard.cards_.isEmpty()) {
                    if (!this.cardsBuilder_.isEmpty()) {
                        this.cardsBuilder_.addAllMessages(customListCard.cards_);
                    } else {
                        this.cardsBuilder_.dispose();
                        this.cardsBuilder_ = null;
                        this.cards_ = customListCard.cards_;
                        this.bitField0_ &= -2;
                        this.cardsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getCardsFieldBuilder() : null;
                    }
                }
                if (customListCard.getHorizontal()) {
                    setHorizontal(customListCard.getHorizontal());
                }
                mergeUnknownFields(customListCard.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addCards(CustomCard.Builder builder) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addCards(int i8, CustomCard.Builder builder) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.add(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    CustomCard customCard = (CustomCard) rVar.readMessage(CustomCard.parser(), m8);
                                    C5213g1 c5213g1 = this.cardsBuilder_;
                                    if (c5213g1 == null) {
                                        ensureCardsIsMutable();
                                        this.cards_.add(customCard);
                                    } else {
                                        c5213g1.addMessage(customCard);
                                    }
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.horizontal_ = rVar.readBool();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ CustomListCard(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static CustomListCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return CardOuterClass.internal_static_maum_m2u_common_CustomListCard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CustomListCard parseDelimitedFrom(InputStream inputStream) {
            return (CustomListCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CustomListCard parseFrom(ByteBuffer byteBuffer) {
            return (CustomListCard) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomListCard)) {
                return super.equals(obj);
            }
            CustomListCard customListCard = (CustomListCard) obj;
            return getCardsList().equals(customListCard.getCardsList()) && getHorizontal() == customListCard.getHorizontal() && getUnknownFields().equals(customListCard.getUnknownFields());
        }

        @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
        public CustomCard getCards(int i8) {
            return this.cards_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
        public int getCardsCount() {
            return this.cards_.size();
        }

        @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
        public List<CustomCard> getCardsList() {
            return this.cards_;
        }

        @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
        public CustomCardOrBuilder getCardsOrBuilder(int i8) {
            return this.cards_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
        public List<? extends CustomCardOrBuilder> getCardsOrBuilderList() {
            return this.cards_;
        }

        @Override // maum.m2u.common.CardOuterClass.CustomListCardOrBuilder
        public boolean getHorizontal() {
            return this.horizontal_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeBoolSize = 0;
            for (int i9 = 0; i9 < this.cards_.size(); i9++) {
                iComputeBoolSize += AbstractC5248t.computeMessageSize(1, this.cards_.get(i9));
            }
            boolean z8 = this.horizontal_;
            if (z8) {
                iComputeBoolSize += AbstractC5248t.computeBoolSize(2, z8);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getCardsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCardsList().hashCode();
            }
            int iHashBoolean = (((((iHashCode * 37) + 2) * 53) + AbstractC5227l0.hashBoolean(getHorizontal())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashBoolean;
            return iHashBoolean;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return CardOuterClass.internal_static_maum_m2u_common_CustomListCard_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomListCard.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new CustomListCard();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            for (int i8 = 0; i8 < this.cards_.size(); i8++) {
                abstractC5248t.writeMessage(1, this.cards_.get(i8));
            }
            boolean z8 = this.horizontal_;
            if (z8) {
                abstractC5248t.writeBool(2, z8);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private CustomListCard(AbstractC5209f0.b bVar) {
            super(bVar);
            this.horizontal_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(CustomListCard customListCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(customListCard);
        }

        public static CustomListCard parseFrom(ByteBuffer byteBuffer, M m8) {
            return (CustomListCard) PARSER.parseFrom(byteBuffer, m8);
        }

        public static CustomListCard parseDelimitedFrom(InputStream inputStream, M m8) {
            return (CustomListCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static CustomListCard parseFrom(AbstractC5235o abstractC5235o) {
            return (CustomListCard) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public CustomListCard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static CustomListCard parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (CustomListCard) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private CustomListCard() {
            this.horizontal_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.cards_ = Collections.emptyList();
        }

        public static CustomListCard parseFrom(byte[] bArr) {
            return (CustomListCard) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static CustomListCard parseFrom(byte[] bArr, M m8) {
            return (CustomListCard) PARSER.parseFrom(bArr, m8);
        }

        public static CustomListCard parseFrom(InputStream inputStream) {
            return (CustomListCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static CustomListCard parseFrom(InputStream inputStream, M m8) {
            return (CustomListCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static CustomListCard parseFrom(r rVar) {
            return (CustomListCard) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static CustomListCard parseFrom(r rVar, M m8) {
            return (CustomListCard) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface CustomListCardOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        CustomCard getCards(int i8);

        int getCardsCount();

        List<CustomCard> getCardsList();

        CustomCardOrBuilder getCardsOrBuilder(int i8);

        List<? extends CustomCardOrBuilder> getCardsOrBuilderList();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        boolean getHorizontal();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class GridCard extends AbstractC5209f0 implements GridCardOrBuilder {
        public static final int COLUMNS_FIELD_NUMBER = 10;
        private static final GridCard DEFAULT_INSTANCE = new GridCard();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.GridCard.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public GridCard parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = GridCard.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int ROWS_FIELD_NUMBER = 11;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private C5253v0 columns_;
        private byte memoizedIsInitialized;
        private List<C5253v0> rows_;
        private volatile Object type_;

        public static final class Builder extends AbstractC5209f0.b implements GridCardOrBuilder {
            private int bitField0_;
            private C5228l1 columnsBuilder_;
            private C5253v0 columns_;
            private C5213g1 rowsBuilder_;
            private List<C5253v0> rows_;
            private Object type_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(GridCard gridCard) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    gridCard.type_ = this.type_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.columnsBuilder_;
                    gridCard.columns_ = c5228l1 == null ? this.columns_ : (C5253v0) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                GridCard.access$12076(gridCard, i8);
            }

            private void buildPartialRepeatedFields(GridCard gridCard) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 != null) {
                    gridCard.rows_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.rows_ = Collections.unmodifiableList(this.rows_);
                    this.bitField0_ &= -5;
                }
                gridCard.rows_ = this.rows_;
            }

            private void ensureRowsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.rows_ = new ArrayList(this.rows_);
                    this.bitField0_ |= 4;
                }
            }

            private C5228l1 getColumnsFieldBuilder() {
                if (this.columnsBuilder_ == null) {
                    this.columnsBuilder_ = new C5228l1(getColumns(), getParentForChildren(), isClean());
                    this.columns_ = null;
                }
                return this.columnsBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_GridCard_descriptor;
            }

            private C5213g1 getRowsFieldBuilder() {
                if (this.rowsBuilder_ == null) {
                    this.rowsBuilder_ = new C5213g1(this.rows_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.rows_ = null;
                }
                return this.rowsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getColumnsFieldBuilder();
                    getRowsFieldBuilder();
                }
            }

            public Builder addAllRows(Iterable<? extends C5253v0> iterable) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 == null) {
                    ensureRowsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.rows_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addRows(C5253v0 c5253v0) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 == null) {
                    c5253v0.getClass();
                    ensureRowsIsMutable();
                    this.rows_.add(c5253v0);
                    onChanged();
                } else {
                    c5213g1.addMessage(c5253v0);
                }
                return this;
            }

            public C5253v0.b addRowsBuilder() {
                return (C5253v0.b) getRowsFieldBuilder().addBuilder(C5253v0.getDefaultInstance());
            }

            public Builder clearColumns() {
                this.bitField0_ &= -3;
                this.columns_ = null;
                C5228l1 c5228l1 = this.columnsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.columnsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRows() {
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 == null) {
                    this.rows_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearType() {
                this.type_ = GridCard.getDefaultInstance().getType();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
            public C5253v0 getColumns() {
                C5228l1 c5228l1 = this.columnsBuilder_;
                if (c5228l1 != null) {
                    return (C5253v0) c5228l1.getMessage();
                }
                C5253v0 c5253v0 = this.columns_;
                return c5253v0 == null ? C5253v0.getDefaultInstance() : c5253v0;
            }

            public C5253v0.b getColumnsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (C5253v0.b) getColumnsFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
            public InterfaceC5268w0 getColumnsOrBuilder() {
                C5228l1 c5228l1 = this.columnsBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5268w0) c5228l1.getMessageOrBuilder();
                }
                C5253v0 c5253v0 = this.columns_;
                return c5253v0 == null ? C5253v0.getDefaultInstance() : c5253v0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return CardOuterClass.internal_static_maum_m2u_common_GridCard_descriptor;
            }

            @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
            public C5253v0 getRows(int i8) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                return c5213g1 == null ? this.rows_.get(i8) : (C5253v0) c5213g1.getMessage(i8);
            }

            public C5253v0.b getRowsBuilder(int i8) {
                return (C5253v0.b) getRowsFieldBuilder().getBuilder(i8);
            }

            public List<C5253v0.b> getRowsBuilderList() {
                return getRowsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
            public int getRowsCount() {
                C5213g1 c5213g1 = this.rowsBuilder_;
                return c5213g1 == null ? this.rows_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
            public List<C5253v0> getRowsList() {
                C5213g1 c5213g1 = this.rowsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.rows_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
            public InterfaceC5268w0 getRowsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                return c5213g1 == null ? this.rows_.get(i8) : (InterfaceC5268w0) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
            public List<? extends InterfaceC5268w0> getRowsOrBuilderList() {
                C5213g1 c5213g1 = this.rowsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.rows_);
            }

            @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
            public AbstractC5235o getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.type_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
            public boolean hasColumns() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_GridCard_fieldAccessorTable.ensureFieldAccessorsInitialized(GridCard.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeColumns(C5253v0 c5253v0) {
                C5253v0 c5253v02;
                C5228l1 c5228l1 = this.columnsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5253v0);
                } else if ((this.bitField0_ & 2) == 0 || (c5253v02 = this.columns_) == null || c5253v02 == C5253v0.getDefaultInstance()) {
                    this.columns_ = c5253v0;
                } else {
                    getColumnsBuilder().mergeFrom(c5253v0);
                }
                if (this.columns_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder removeRows(int i8) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 == null) {
                    ensureRowsIsMutable();
                    this.rows_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setColumns(C5253v0 c5253v0) {
                C5228l1 c5228l1 = this.columnsBuilder_;
                if (c5228l1 == null) {
                    c5253v0.getClass();
                    this.columns_ = c5253v0;
                } else {
                    c5228l1.setMessage(c5253v0);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRows(int i8, C5253v0 c5253v0) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 == null) {
                    c5253v0.getClass();
                    ensureRowsIsMutable();
                    this.rows_.set(i8, c5253v0);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, c5253v0);
                }
                return this;
            }

            public Builder setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTypeBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.type_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.type_ = "";
                this.rows_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public GridCard build() {
                GridCard gridCardBuildPartial = buildPartial();
                if (gridCardBuildPartial.isInitialized()) {
                    return gridCardBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) gridCardBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public GridCard buildPartial() {
                GridCard gridCard = new GridCard(this, null);
                buildPartialRepeatedFields(gridCard);
                if (this.bitField0_ != 0) {
                    buildPartial0(gridCard);
                }
                onBuilt();
                return gridCard;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public GridCard getDefaultInstanceForType() {
                return GridCard.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            public C5253v0.b addRowsBuilder(int i8) {
                return (C5253v0.b) getRowsFieldBuilder().addBuilder(i8, C5253v0.getDefaultInstance());
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = "";
                this.columns_ = null;
                C5228l1 c5228l1 = this.columnsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.columnsBuilder_ = null;
                }
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 == null) {
                    this.rows_ = Collections.emptyList();
                } else {
                    this.rows_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.type_ = "";
                this.rows_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addRows(int i8, C5253v0 c5253v0) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 == null) {
                    c5253v0.getClass();
                    ensureRowsIsMutable();
                    this.rows_.add(i8, c5253v0);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, c5253v0);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof GridCard) {
                    return mergeFrom((GridCard) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setColumns(C5253v0.b bVar) {
                C5228l1 c5228l1 = this.columnsBuilder_;
                if (c5228l1 == null) {
                    this.columns_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRows(int i8, C5253v0.b bVar) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 == null) {
                    ensureRowsIsMutable();
                    this.rows_.set(i8, bVar.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, bVar.build());
                }
                return this;
            }

            public Builder mergeFrom(GridCard gridCard) {
                if (gridCard == GridCard.getDefaultInstance()) {
                    return this;
                }
                if (!gridCard.getType().isEmpty()) {
                    this.type_ = gridCard.type_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (gridCard.hasColumns()) {
                    mergeColumns(gridCard.getColumns());
                }
                if (this.rowsBuilder_ == null) {
                    if (!gridCard.rows_.isEmpty()) {
                        if (this.rows_.isEmpty()) {
                            this.rows_ = gridCard.rows_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureRowsIsMutable();
                            this.rows_.addAll(gridCard.rows_);
                        }
                        onChanged();
                    }
                } else if (!gridCard.rows_.isEmpty()) {
                    if (!this.rowsBuilder_.isEmpty()) {
                        this.rowsBuilder_.addAllMessages(gridCard.rows_);
                    } else {
                        this.rowsBuilder_.dispose();
                        this.rowsBuilder_ = null;
                        this.rows_ = gridCard.rows_;
                        this.bitField0_ &= -5;
                        this.rowsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getRowsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(gridCard.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addRows(C5253v0.b bVar) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 == null) {
                    ensureRowsIsMutable();
                    this.rows_.add(bVar.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(bVar.build());
                }
                return this;
            }

            public Builder addRows(int i8, C5253v0.b bVar) {
                C5213g1 c5213g1 = this.rowsBuilder_;
                if (c5213g1 == null) {
                    ensureRowsIsMutable();
                    this.rows_.add(i8, bVar.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, bVar.build());
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.type_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 82) {
                                    rVar.readMessage(getColumnsFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 2;
                                } else if (tag != 90) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    C5253v0 c5253v0 = (C5253v0) rVar.readMessage(C5253v0.parser(), m8);
                                    C5213g1 c5213g1 = this.rowsBuilder_;
                                    if (c5213g1 == null) {
                                        ensureRowsIsMutable();
                                        this.rows_.add(c5253v0);
                                    } else {
                                        c5213g1.addMessage(c5253v0);
                                    }
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ GridCard(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$12076(GridCard gridCard, int i8) {
            int i9 = i8 | gridCard.bitField0_;
            gridCard.bitField0_ = i9;
            return i9;
        }

        public static GridCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return CardOuterClass.internal_static_maum_m2u_common_GridCard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GridCard parseDelimitedFrom(InputStream inputStream) {
            return (GridCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GridCard parseFrom(ByteBuffer byteBuffer) {
            return (GridCard) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GridCard)) {
                return super.equals(obj);
            }
            GridCard gridCard = (GridCard) obj;
            if (getType().equals(gridCard.getType()) && hasColumns() == gridCard.hasColumns()) {
                return (!hasColumns() || getColumns().equals(gridCard.getColumns())) && getRowsList().equals(gridCard.getRowsList()) && getUnknownFields().equals(gridCard.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
        public C5253v0 getColumns() {
            C5253v0 c5253v0 = this.columns_;
            return c5253v0 == null ? C5253v0.getDefaultInstance() : c5253v0;
        }

        @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
        public InterfaceC5268w0 getColumnsOrBuilder() {
            C5253v0 c5253v0 = this.columns_;
            return c5253v0 == null ? C5253v0.getDefaultInstance() : c5253v0;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
        public C5253v0 getRows(int i8) {
            return this.rows_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
        public int getRowsCount() {
            return this.rows_.size();
        }

        @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
        public List<C5253v0> getRowsList() {
            return this.rows_;
        }

        @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
        public InterfaceC5268w0 getRowsOrBuilder(int i8) {
            return this.rows_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
        public List<? extends InterfaceC5268w0> getRowsOrBuilderList() {
            return this.rows_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.type_) ? AbstractC5209f0.computeStringSize(1, this.type_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(10, getColumns());
            }
            for (int i9 = 0; i9 < this.rows_.size(); i9++) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(11, this.rows_.get(i9));
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
        public AbstractC5235o getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.type_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.GridCardOrBuilder
        public boolean hasColumns() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode();
            if (hasColumns()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getColumns().hashCode();
            }
            if (getRowsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getRowsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return CardOuterClass.internal_static_maum_m2u_common_GridCard_fieldAccessorTable.ensureFieldAccessorsInitialized(GridCard.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new GridCard();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.type_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.type_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(10, getColumns());
            }
            for (int i8 = 0; i8 < this.rows_.size(); i8++) {
                abstractC5248t.writeMessage(11, this.rows_.get(i8));
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private GridCard(AbstractC5209f0.b bVar) {
            super(bVar);
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GridCard gridCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gridCard);
        }

        public static GridCard parseFrom(ByteBuffer byteBuffer, M m8) {
            return (GridCard) PARSER.parseFrom(byteBuffer, m8);
        }

        public static GridCard parseDelimitedFrom(InputStream inputStream, M m8) {
            return (GridCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static GridCard parseFrom(AbstractC5235o abstractC5235o) {
            return (GridCard) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public GridCard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static GridCard parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (GridCard) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GridCard() {
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = "";
            this.rows_ = Collections.emptyList();
        }

        public static GridCard parseFrom(byte[] bArr) {
            return (GridCard) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static GridCard parseFrom(byte[] bArr, M m8) {
            return (GridCard) PARSER.parseFrom(bArr, m8);
        }

        public static GridCard parseFrom(InputStream inputStream) {
            return (GridCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static GridCard parseFrom(InputStream inputStream, M m8) {
            return (GridCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static GridCard parseFrom(r rVar) {
            return (GridCard) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static GridCard parseFrom(r rVar, M m8) {
            return (GridCard) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface GridCardOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        C5253v0 getColumns();

        InterfaceC5268w0 getColumnsOrBuilder();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        C5253v0 getRows(int i8);

        int getRowsCount();

        List<C5253v0> getRowsList();

        InterfaceC5268w0 getRowsOrBuilder(int i8);

        List<? extends InterfaceC5268w0> getRowsOrBuilderList();

        String getType();

        AbstractC5235o getTypeBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasColumns();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class LinkCard extends AbstractC5209f0 implements LinkCardOrBuilder {
        public static final int IMAGE_HREF_FIELD_NUMBER = 4;
        public static final int IMAGE_URL_FIELD_NUMBER = 3;
        public static final int SUMMARY_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private volatile Object imageHref_;
        private volatile Object imageUrl_;
        private byte memoizedIsInitialized;
        private volatile Object summary_;
        private volatile Object title_;
        private volatile Object type_;
        private static final LinkCard DEFAULT_INSTANCE = new LinkCard();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.LinkCard.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LinkCard parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LinkCard.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements LinkCardOrBuilder {
            private int bitField0_;
            private Object imageHref_;
            private Object imageUrl_;
            private Object summary_;
            private Object title_;
            private Object type_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LinkCard linkCard) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    linkCard.title_ = this.title_;
                }
                if ((i8 & 2) != 0) {
                    linkCard.summary_ = this.summary_;
                }
                if ((i8 & 4) != 0) {
                    linkCard.imageUrl_ = this.imageUrl_;
                }
                if ((i8 & 8) != 0) {
                    linkCard.imageHref_ = this.imageHref_;
                }
                if ((i8 & 16) != 0) {
                    linkCard.type_ = this.type_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_LinkCard_descriptor;
            }

            public Builder clearImageHref() {
                this.imageHref_ = LinkCard.getDefaultInstance().getImageHref();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearImageUrl() {
                this.imageUrl_ = LinkCard.getDefaultInstance().getImageUrl();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearSummary() {
                this.summary_ = LinkCard.getDefaultInstance().getSummary();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = LinkCard.getDefaultInstance().getTitle();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = LinkCard.getDefaultInstance().getType();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return CardOuterClass.internal_static_maum_m2u_common_LinkCard_descriptor;
            }

            @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
            public String getImageHref() {
                Object obj = this.imageHref_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.imageHref_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
            public AbstractC5235o getImageHrefBytes() {
                Object obj = this.imageHref_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.imageHref_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
            public String getImageUrl() {
                Object obj = this.imageUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.imageUrl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
            public AbstractC5235o getImageUrlBytes() {
                Object obj = this.imageUrl_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.imageUrl_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
            public String getSummary() {
                Object obj = this.summary_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.summary_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
            public AbstractC5235o getSummaryBytes() {
                Object obj = this.summary_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.summary_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
            public AbstractC5235o getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.title_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
            public AbstractC5235o getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.type_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_LinkCard_fieldAccessorTable.ensureFieldAccessorsInitialized(LinkCard.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setImageHref(String str) {
                str.getClass();
                this.imageHref_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setImageHrefBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.imageHref_ = abstractC5235o;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setImageUrl(String str) {
                str.getClass();
                this.imageUrl_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setImageUrlBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.imageUrl_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSummary(String str) {
                str.getClass();
                this.summary_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSummaryBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.summary_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.title_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTypeBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.type_ = abstractC5235o;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.title_ = "";
                this.summary_ = "";
                this.imageUrl_ = "";
                this.imageHref_ = "";
                this.type_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LinkCard build() {
                LinkCard linkCardBuildPartial = buildPartial();
                if (linkCardBuildPartial.isInitialized()) {
                    return linkCardBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) linkCardBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LinkCard buildPartial() {
                LinkCard linkCard = new LinkCard(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(linkCard);
                }
                onBuilt();
                return linkCard;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LinkCard getDefaultInstanceForType() {
                return LinkCard.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.title_ = "";
                this.summary_ = "";
                this.imageUrl_ = "";
                this.imageHref_ = "";
                this.type_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof LinkCard) {
                    return mergeFrom((LinkCard) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.title_ = "";
                this.summary_ = "";
                this.imageUrl_ = "";
                this.imageHref_ = "";
                this.type_ = "";
            }

            public Builder mergeFrom(LinkCard linkCard) {
                if (linkCard == LinkCard.getDefaultInstance()) {
                    return this;
                }
                if (!linkCard.getTitle().isEmpty()) {
                    this.title_ = linkCard.title_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!linkCard.getSummary().isEmpty()) {
                    this.summary_ = linkCard.summary_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!linkCard.getImageUrl().isEmpty()) {
                    this.imageUrl_ = linkCard.imageUrl_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!linkCard.getImageHref().isEmpty()) {
                    this.imageHref_ = linkCard.imageHref_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!linkCard.getType().isEmpty()) {
                    this.type_ = linkCard.type_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(linkCard.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.title_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.summary_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.imageUrl_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.imageHref_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag != 42) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.type_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ LinkCard(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static LinkCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return CardOuterClass.internal_static_maum_m2u_common_LinkCard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LinkCard parseDelimitedFrom(InputStream inputStream) {
            return (LinkCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LinkCard parseFrom(ByteBuffer byteBuffer) {
            return (LinkCard) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LinkCard)) {
                return super.equals(obj);
            }
            LinkCard linkCard = (LinkCard) obj;
            return getTitle().equals(linkCard.getTitle()) && getSummary().equals(linkCard.getSummary()) && getImageUrl().equals(linkCard.getImageUrl()) && getImageHref().equals(linkCard.getImageHref()) && getType().equals(linkCard.getType()) && getUnknownFields().equals(linkCard.getUnknownFields());
        }

        @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
        public String getImageHref() {
            Object obj = this.imageHref_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.imageHref_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
        public AbstractC5235o getImageHrefBytes() {
            Object obj = this.imageHref_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.imageHref_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
        public String getImageUrl() {
            Object obj = this.imageUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.imageUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
        public AbstractC5235o getImageUrlBytes() {
            Object obj = this.imageUrl_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.imageUrl_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.title_) ? AbstractC5209f0.computeStringSize(1, this.title_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.summary_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.summary_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.imageUrl_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.imageUrl_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.imageHref_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(4, this.imageHref_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.type_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(5, this.type_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
        public String getSummary() {
            Object obj = this.summary_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.summary_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
        public AbstractC5235o getSummaryBytes() {
            Object obj = this.summary_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.summary_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.title_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
        public AbstractC5235o getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.title_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.LinkCardOrBuilder
        public AbstractC5235o getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.type_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTitle().hashCode()) * 37) + 2) * 53) + getSummary().hashCode()) * 37) + 3) * 53) + getImageUrl().hashCode()) * 37) + 4) * 53) + getImageHref().hashCode()) * 37) + 5) * 53) + getType().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return CardOuterClass.internal_static_maum_m2u_common_LinkCard_fieldAccessorTable.ensureFieldAccessorsInitialized(LinkCard.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new LinkCard();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.title_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.title_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.summary_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.summary_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.imageUrl_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.imageUrl_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.imageHref_)) {
                AbstractC5209f0.writeString(abstractC5248t, 4, this.imageHref_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.type_)) {
                AbstractC5209f0.writeString(abstractC5248t, 5, this.type_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LinkCard(AbstractC5209f0.b bVar) {
            super(bVar);
            this.title_ = "";
            this.summary_ = "";
            this.imageUrl_ = "";
            this.imageHref_ = "";
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LinkCard linkCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(linkCard);
        }

        public static LinkCard parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LinkCard) PARSER.parseFrom(byteBuffer, m8);
        }

        public static LinkCard parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LinkCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LinkCard parseFrom(AbstractC5235o abstractC5235o) {
            return (LinkCard) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LinkCard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static LinkCard parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LinkCard) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LinkCard parseFrom(byte[] bArr) {
            return (LinkCard) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static LinkCard parseFrom(byte[] bArr, M m8) {
            return (LinkCard) PARSER.parseFrom(bArr, m8);
        }

        public static LinkCard parseFrom(InputStream inputStream) {
            return (LinkCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private LinkCard() {
            this.title_ = "";
            this.summary_ = "";
            this.imageUrl_ = "";
            this.imageHref_ = "";
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.title_ = "";
            this.summary_ = "";
            this.imageUrl_ = "";
            this.imageHref_ = "";
            this.type_ = "";
        }

        public static LinkCard parseFrom(InputStream inputStream, M m8) {
            return (LinkCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LinkCard parseFrom(r rVar) {
            return (LinkCard) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LinkCard parseFrom(r rVar, M m8) {
            return (LinkCard) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LinkCardOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        String getImageHref();

        AbstractC5235o getImageHrefBytes();

        String getImageUrl();

        AbstractC5235o getImageUrlBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getSummary();

        AbstractC5235o getSummaryBytes();

        String getTitle();

        AbstractC5235o getTitleBytes();

        String getType();

        AbstractC5235o getTypeBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class ListCard extends AbstractC5209f0 implements ListCardOrBuilder {
        public static final int CARDS_FIELD_NUMBER = 1;
        public static final int HORIZONTAL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<LinkCard> cards_;
        private boolean horizontal_;
        private byte memoizedIsInitialized;
        private static final ListCard DEFAULT_INSTANCE = new ListCard();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.ListCard.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public ListCard parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = ListCard.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements ListCardOrBuilder {
            private int bitField0_;
            private C5213g1 cardsBuilder_;
            private List<LinkCard> cards_;
            private boolean horizontal_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(ListCard listCard) {
                if ((this.bitField0_ & 2) != 0) {
                    listCard.horizontal_ = this.horizontal_;
                }
            }

            private void buildPartialRepeatedFields(ListCard listCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 != null) {
                    listCard.cards_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.cards_ = Collections.unmodifiableList(this.cards_);
                    this.bitField0_ &= -2;
                }
                listCard.cards_ = this.cards_;
            }

            private void ensureCardsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.cards_ = new ArrayList(this.cards_);
                    this.bitField0_ |= 1;
                }
            }

            private C5213g1 getCardsFieldBuilder() {
                if (this.cardsBuilder_ == null) {
                    this.cardsBuilder_ = new C5213g1(this.cards_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.cards_ = null;
                }
                return this.cardsBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_ListCard_descriptor;
            }

            public Builder addAllCards(Iterable<? extends LinkCard> iterable) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.cards_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addCards(LinkCard linkCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    linkCard.getClass();
                    ensureCardsIsMutable();
                    this.cards_.add(linkCard);
                    onChanged();
                } else {
                    c5213g1.addMessage(linkCard);
                }
                return this;
            }

            public LinkCard.Builder addCardsBuilder() {
                return (LinkCard.Builder) getCardsFieldBuilder().addBuilder(LinkCard.getDefaultInstance());
            }

            public Builder clearCards() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    this.cards_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearHorizontal() {
                this.bitField0_ &= -3;
                this.horizontal_ = false;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
            public LinkCard getCards(int i8) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? this.cards_.get(i8) : (LinkCard) c5213g1.getMessage(i8);
            }

            public LinkCard.Builder getCardsBuilder(int i8) {
                return (LinkCard.Builder) getCardsFieldBuilder().getBuilder(i8);
            }

            public List<LinkCard.Builder> getCardsBuilderList() {
                return getCardsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
            public int getCardsCount() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? this.cards_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
            public List<LinkCard> getCardsList() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.cards_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
            public LinkCardOrBuilder getCardsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? this.cards_.get(i8) : (LinkCardOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
            public List<? extends LinkCardOrBuilder> getCardsOrBuilderList() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.cards_);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return CardOuterClass.internal_static_maum_m2u_common_ListCard_descriptor;
            }

            @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
            public boolean getHorizontal() {
                return this.horizontal_;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_ListCard_fieldAccessorTable.ensureFieldAccessorsInitialized(ListCard.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeCards(int i8) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setCards(int i8, LinkCard linkCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    linkCard.getClass();
                    ensureCardsIsMutable();
                    this.cards_.set(i8, linkCard);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, linkCard);
                }
                return this;
            }

            public Builder setHorizontal(boolean z8) {
                this.horizontal_ = z8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.cards_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public ListCard build() {
                ListCard listCardBuildPartial = buildPartial();
                if (listCardBuildPartial.isInitialized()) {
                    return listCardBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) listCardBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public ListCard buildPartial() {
                ListCard listCard = new ListCard(this, null);
                buildPartialRepeatedFields(listCard);
                if (this.bitField0_ != 0) {
                    buildPartial0(listCard);
                }
                onBuilt();
                return listCard;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public ListCard getDefaultInstanceForType() {
                return ListCard.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            public LinkCard.Builder addCardsBuilder(int i8) {
                return (LinkCard.Builder) getCardsFieldBuilder().addBuilder(i8, LinkCard.getDefaultInstance());
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.cards_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    this.cards_ = Collections.emptyList();
                } else {
                    this.cards_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -2;
                this.horizontal_ = false;
                return this;
            }

            public Builder addCards(int i8, LinkCard linkCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    linkCard.getClass();
                    ensureCardsIsMutable();
                    this.cards_.add(i8, linkCard);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, linkCard);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof ListCard) {
                    return mergeFrom((ListCard) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setCards(int i8, LinkCard.Builder builder) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(ListCard listCard) {
                if (listCard == ListCard.getDefaultInstance()) {
                    return this;
                }
                if (this.cardsBuilder_ == null) {
                    if (!listCard.cards_.isEmpty()) {
                        if (this.cards_.isEmpty()) {
                            this.cards_ = listCard.cards_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCardsIsMutable();
                            this.cards_.addAll(listCard.cards_);
                        }
                        onChanged();
                    }
                } else if (!listCard.cards_.isEmpty()) {
                    if (!this.cardsBuilder_.isEmpty()) {
                        this.cardsBuilder_.addAllMessages(listCard.cards_);
                    } else {
                        this.cardsBuilder_.dispose();
                        this.cardsBuilder_ = null;
                        this.cards_ = listCard.cards_;
                        this.bitField0_ &= -2;
                        this.cardsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getCardsFieldBuilder() : null;
                    }
                }
                if (listCard.getHorizontal()) {
                    setHorizontal(listCard.getHorizontal());
                }
                mergeUnknownFields(listCard.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addCards(LinkCard.Builder builder) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addCards(int i8, LinkCard.Builder builder) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.add(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    LinkCard linkCard = (LinkCard) rVar.readMessage(LinkCard.parser(), m8);
                                    C5213g1 c5213g1 = this.cardsBuilder_;
                                    if (c5213g1 == null) {
                                        ensureCardsIsMutable();
                                        this.cards_.add(linkCard);
                                    } else {
                                        c5213g1.addMessage(linkCard);
                                    }
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.horizontal_ = rVar.readBool();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ ListCard(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static ListCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return CardOuterClass.internal_static_maum_m2u_common_ListCard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ListCard parseDelimitedFrom(InputStream inputStream) {
            return (ListCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ListCard parseFrom(ByteBuffer byteBuffer) {
            return (ListCard) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ListCard)) {
                return super.equals(obj);
            }
            ListCard listCard = (ListCard) obj;
            return getCardsList().equals(listCard.getCardsList()) && getHorizontal() == listCard.getHorizontal() && getUnknownFields().equals(listCard.getUnknownFields());
        }

        @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
        public LinkCard getCards(int i8) {
            return this.cards_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
        public int getCardsCount() {
            return this.cards_.size();
        }

        @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
        public List<LinkCard> getCardsList() {
            return this.cards_;
        }

        @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
        public LinkCardOrBuilder getCardsOrBuilder(int i8) {
            return this.cards_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
        public List<? extends LinkCardOrBuilder> getCardsOrBuilderList() {
            return this.cards_;
        }

        @Override // maum.m2u.common.CardOuterClass.ListCardOrBuilder
        public boolean getHorizontal() {
            return this.horizontal_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeBoolSize = 0;
            for (int i9 = 0; i9 < this.cards_.size(); i9++) {
                iComputeBoolSize += AbstractC5248t.computeMessageSize(1, this.cards_.get(i9));
            }
            boolean z8 = this.horizontal_;
            if (z8) {
                iComputeBoolSize += AbstractC5248t.computeBoolSize(2, z8);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getCardsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCardsList().hashCode();
            }
            int iHashBoolean = (((((iHashCode * 37) + 2) * 53) + AbstractC5227l0.hashBoolean(getHorizontal())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashBoolean;
            return iHashBoolean;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return CardOuterClass.internal_static_maum_m2u_common_ListCard_fieldAccessorTable.ensureFieldAccessorsInitialized(ListCard.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new ListCard();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            for (int i8 = 0; i8 < this.cards_.size(); i8++) {
                abstractC5248t.writeMessage(1, this.cards_.get(i8));
            }
            boolean z8 = this.horizontal_;
            if (z8) {
                abstractC5248t.writeBool(2, z8);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private ListCard(AbstractC5209f0.b bVar) {
            super(bVar);
            this.horizontal_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(ListCard listCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(listCard);
        }

        public static ListCard parseFrom(ByteBuffer byteBuffer, M m8) {
            return (ListCard) PARSER.parseFrom(byteBuffer, m8);
        }

        public static ListCard parseDelimitedFrom(InputStream inputStream, M m8) {
            return (ListCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static ListCard parseFrom(AbstractC5235o abstractC5235o) {
            return (ListCard) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public ListCard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static ListCard parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (ListCard) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ListCard() {
            this.horizontal_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.cards_ = Collections.emptyList();
        }

        public static ListCard parseFrom(byte[] bArr) {
            return (ListCard) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static ListCard parseFrom(byte[] bArr, M m8) {
            return (ListCard) PARSER.parseFrom(bArr, m8);
        }

        public static ListCard parseFrom(InputStream inputStream) {
            return (ListCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static ListCard parseFrom(InputStream inputStream, M m8) {
            return (ListCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static ListCard parseFrom(r rVar) {
            return (ListCard) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static ListCard parseFrom(r rVar, M m8) {
            return (ListCard) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface ListCardOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        LinkCard getCards(int i8);

        int getCardsCount();

        List<LinkCard> getCardsList();

        LinkCardOrBuilder getCardsOrBuilder(int i8);

        List<? extends LinkCardOrBuilder> getCardsOrBuilderList();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        boolean getHorizontal();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class SelectCard extends AbstractC5209f0 implements SelectCardOrBuilder {
        public static final int HEADER_FIELD_NUMBER = 2;
        public static final int HORIZONTAL_FIELD_NUMBER = 11;
        public static final int ITEMS_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 12;
        private static final long serialVersionUID = 0;
        private volatile Object header_;
        private boolean horizontal_;
        private List<Item> items_;
        private byte memoizedIsInitialized;
        private volatile Object title_;
        private volatile Object type_;
        private static final SelectCard DEFAULT_INSTANCE = new SelectCard();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.SelectCard.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public SelectCard parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = SelectCard.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements SelectCardOrBuilder {
            private int bitField0_;
            private Object header_;
            private boolean horizontal_;
            private C5213g1 itemsBuilder_;
            private List<Item> items_;
            private Object title_;
            private Object type_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(SelectCard selectCard) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    selectCard.title_ = this.title_;
                }
                if ((i8 & 2) != 0) {
                    selectCard.header_ = this.header_;
                }
                if ((i8 & 8) != 0) {
                    selectCard.horizontal_ = this.horizontal_;
                }
                if ((i8 & 16) != 0) {
                    selectCard.type_ = this.type_;
                }
            }

            private void buildPartialRepeatedFields(SelectCard selectCard) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 != null) {
                    selectCard.items_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.items_ = Collections.unmodifiableList(this.items_);
                    this.bitField0_ &= -5;
                }
                selectCard.items_ = this.items_;
            }

            private void ensureItemsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.items_ = new ArrayList(this.items_);
                    this.bitField0_ |= 4;
                }
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_SelectCard_descriptor;
            }

            private C5213g1 getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new C5213g1(this.items_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }

            public Builder addAllItems(Iterable<? extends Item> iterable) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    ensureItemsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.items_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addItems(Item item) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    item.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(item);
                    onChanged();
                } else {
                    c5213g1.addMessage(item);
                }
                return this;
            }

            public Item.Builder addItemsBuilder() {
                return (Item.Builder) getItemsFieldBuilder().addBuilder(Item.getDefaultInstance());
            }

            public Builder clearHeader() {
                this.header_ = SelectCard.getDefaultInstance().getHeader();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearHorizontal() {
                this.bitField0_ &= -9;
                this.horizontal_ = false;
                onChanged();
                return this;
            }

            public Builder clearItems() {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    this.items_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearTitle() {
                this.title_ = SelectCard.getDefaultInstance().getTitle();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = SelectCard.getDefaultInstance().getType();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return CardOuterClass.internal_static_maum_m2u_common_SelectCard_descriptor;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public String getHeader() {
                Object obj = this.header_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.header_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public AbstractC5235o getHeaderBytes() {
                Object obj = this.header_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.header_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public boolean getHorizontal() {
                return this.horizontal_;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public Item getItems(int i8) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                return c5213g1 == null ? this.items_.get(i8) : (Item) c5213g1.getMessage(i8);
            }

            public Item.Builder getItemsBuilder(int i8) {
                return (Item.Builder) getItemsFieldBuilder().getBuilder(i8);
            }

            public List<Item.Builder> getItemsBuilderList() {
                return getItemsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public int getItemsCount() {
                C5213g1 c5213g1 = this.itemsBuilder_;
                return c5213g1 == null ? this.items_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public List<Item> getItemsList() {
                C5213g1 c5213g1 = this.itemsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.items_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public ItemOrBuilder getItemsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                return c5213g1 == null ? this.items_.get(i8) : (ItemOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public List<? extends ItemOrBuilder> getItemsOrBuilderList() {
                C5213g1 c5213g1 = this.itemsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public AbstractC5235o getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.title_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
            public AbstractC5235o getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.type_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_SelectCard_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectCard.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeItems(int i8) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    ensureItemsIsMutable();
                    this.items_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setHeader(String str) {
                str.getClass();
                this.header_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setHeaderBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.header_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setHorizontal(boolean z8) {
                this.horizontal_ = z8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setItems(int i8, Item item) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    item.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i8, item);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, item);
                }
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.title_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTypeBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.type_ = abstractC5235o;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.title_ = "";
                this.header_ = "";
                this.items_ = Collections.emptyList();
                this.type_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SelectCard build() {
                SelectCard selectCardBuildPartial = buildPartial();
                if (selectCardBuildPartial.isInitialized()) {
                    return selectCardBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) selectCardBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SelectCard buildPartial() {
                SelectCard selectCard = new SelectCard(this, null);
                buildPartialRepeatedFields(selectCard);
                if (this.bitField0_ != 0) {
                    buildPartial0(selectCard);
                }
                onBuilt();
                return selectCard;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public SelectCard getDefaultInstanceForType() {
                return SelectCard.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            public Item.Builder addItemsBuilder(int i8) {
                return (Item.Builder) getItemsFieldBuilder().addBuilder(i8, Item.getDefaultInstance());
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.title_ = "";
                this.header_ = "";
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    this.items_ = Collections.emptyList();
                } else {
                    this.items_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -5;
                this.horizontal_ = false;
                this.type_ = "";
                return this;
            }

            public Builder addItems(int i8, Item item) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    item.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i8, item);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, item);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof SelectCard) {
                    return mergeFrom((SelectCard) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setItems(int i8, Item.Builder builder) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    ensureItemsIsMutable();
                    this.items_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.title_ = "";
                this.header_ = "";
                this.items_ = Collections.emptyList();
                this.type_ = "";
            }

            public Builder mergeFrom(SelectCard selectCard) {
                if (selectCard == SelectCard.getDefaultInstance()) {
                    return this;
                }
                if (!selectCard.getTitle().isEmpty()) {
                    this.title_ = selectCard.title_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!selectCard.getHeader().isEmpty()) {
                    this.header_ = selectCard.header_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (this.itemsBuilder_ == null) {
                    if (!selectCard.items_.isEmpty()) {
                        if (this.items_.isEmpty()) {
                            this.items_ = selectCard.items_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureItemsIsMutable();
                            this.items_.addAll(selectCard.items_);
                        }
                        onChanged();
                    }
                } else if (!selectCard.items_.isEmpty()) {
                    if (!this.itemsBuilder_.isEmpty()) {
                        this.itemsBuilder_.addAllMessages(selectCard.items_);
                    } else {
                        this.itemsBuilder_.dispose();
                        this.itemsBuilder_ = null;
                        this.items_ = selectCard.items_;
                        this.bitField0_ &= -5;
                        this.itemsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                    }
                }
                if (selectCard.getHorizontal()) {
                    setHorizontal(selectCard.getHorizontal());
                }
                if (!selectCard.getType().isEmpty()) {
                    this.type_ = selectCard.type_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(selectCard.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addItems(Item.Builder builder) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    ensureItemsIsMutable();
                    this.items_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addItems(int i8, Item.Builder builder) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    ensureItemsIsMutable();
                    this.items_.add(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.title_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.header_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    Item item = (Item) rVar.readMessage(Item.parser(), m8);
                                    C5213g1 c5213g1 = this.itemsBuilder_;
                                    if (c5213g1 == null) {
                                        ensureItemsIsMutable();
                                        this.items_.add(item);
                                    } else {
                                        c5213g1.addMessage(item);
                                    }
                                } else if (tag == 88) {
                                    this.horizontal_ = rVar.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag != 98) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.type_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        public static final class Item extends AbstractC5209f0 implements ItemOrBuilder {
            public static final int IMAGE_URL_FIELD_NUMBER = 3;
            public static final int SELECTED_FIELD_NUMBER = 101;
            public static final int SELECTED_UTTER_FIELD_NUMBER = 100;
            public static final int STYLE_FIELD_NUMBER = 102;
            public static final int SUMMARY_FIELD_NUMBER = 2;
            public static final int TITLE_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private volatile Object imageUrl_;
            private byte memoizedIsInitialized;
            private volatile Object selectedUtter_;
            private boolean selected_;
            private volatile Object style_;
            private volatile Object summary_;
            private volatile Object title_;
            private static final Item DEFAULT_INSTANCE = new Item();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.SelectCard.Item.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public Item parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = Item.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };

            public static final class Builder extends AbstractC5209f0.b implements ItemOrBuilder {
                private int bitField0_;
                private Object imageUrl_;
                private Object selectedUtter_;
                private boolean selected_;
                private Object style_;
                private Object summary_;
                private Object title_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(Item item) {
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        item.title_ = this.title_;
                    }
                    if ((i8 & 2) != 0) {
                        item.summary_ = this.summary_;
                    }
                    if ((i8 & 4) != 0) {
                        item.imageUrl_ = this.imageUrl_;
                    }
                    if ((i8 & 8) != 0) {
                        item.selectedUtter_ = this.selectedUtter_;
                    }
                    if ((i8 & 16) != 0) {
                        item.selected_ = this.selected_;
                    }
                    if ((i8 & 32) != 0) {
                        item.style_ = this.style_;
                    }
                }

                public static final C5269x.b getDescriptor() {
                    return CardOuterClass.internal_static_maum_m2u_common_SelectCard_Item_descriptor;
                }

                public Builder clearImageUrl() {
                    this.imageUrl_ = Item.getDefaultInstance().getImageUrl();
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearSelected() {
                    this.bitField0_ &= -17;
                    this.selected_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearSelectedUtter() {
                    this.selectedUtter_ = Item.getDefaultInstance().getSelectedUtter();
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder clearStyle() {
                    this.style_ = Item.getDefaultInstance().getStyle();
                    this.bitField0_ &= -33;
                    onChanged();
                    return this;
                }

                public Builder clearSummary() {
                    this.summary_ = Item.getDefaultInstance().getSummary();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearTitle() {
                    this.title_ = Item.getDefaultInstance().getTitle();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return CardOuterClass.internal_static_maum_m2u_common_SelectCard_Item_descriptor;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public String getImageUrl() {
                    Object obj = this.imageUrl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.imageUrl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public AbstractC5235o getImageUrlBytes() {
                    Object obj = this.imageUrl_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.imageUrl_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public boolean getSelected() {
                    return this.selected_;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public String getSelectedUtter() {
                    Object obj = this.selectedUtter_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.selectedUtter_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public AbstractC5235o getSelectedUtterBytes() {
                    Object obj = this.selectedUtter_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.selectedUtter_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public String getStyle() {
                    Object obj = this.style_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.style_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public AbstractC5235o getStyleBytes() {
                    Object obj = this.style_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.style_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public String getSummary() {
                    Object obj = this.summary_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.summary_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public AbstractC5235o getSummaryBytes() {
                    Object obj = this.summary_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.summary_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public String getTitle() {
                    Object obj = this.title_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.title_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
                public AbstractC5235o getTitleBytes() {
                    Object obj = this.title_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.title_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return CardOuterClass.internal_static_maum_m2u_common_SelectCard_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setImageUrl(String str) {
                    str.getClass();
                    this.imageUrl_ = str;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setImageUrlBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.imageUrl_ = abstractC5235o;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setSelected(boolean z8) {
                    this.selected_ = z8;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                public Builder setSelectedUtter(String str) {
                    str.getClass();
                    this.selectedUtter_ = str;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setSelectedUtterBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.selectedUtter_ = abstractC5235o;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setStyle(String str) {
                    str.getClass();
                    this.style_ = str;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder setStyleBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.style_ = abstractC5235o;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder setSummary(String str) {
                    str.getClass();
                    this.summary_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setSummaryBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.summary_ = abstractC5235o;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setTitle(String str) {
                    str.getClass();
                    this.title_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setTitleBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.title_ = abstractC5235o;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.title_ = "";
                    this.summary_ = "";
                    this.imageUrl_ = "";
                    this.selectedUtter_ = "";
                    this.style_ = "";
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Item build() {
                    Item itemBuildPartial = buildPartial();
                    if (itemBuildPartial.isInitialized()) {
                        return itemBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) itemBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Item buildPartial() {
                    Item item = new Item(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(item);
                    }
                    onBuilt();
                    return item;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public Item getDefaultInstanceForType() {
                    return Item.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.title_ = "";
                    this.summary_ = "";
                    this.imageUrl_ = "";
                    this.selectedUtter_ = "";
                    this.selected_ = false;
                    this.style_ = "";
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof Item) {
                        return mergeFrom((Item) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.title_ = "";
                    this.summary_ = "";
                    this.imageUrl_ = "";
                    this.selectedUtter_ = "";
                    this.style_ = "";
                }

                public Builder mergeFrom(Item item) {
                    if (item == Item.getDefaultInstance()) {
                        return this;
                    }
                    if (!item.getTitle().isEmpty()) {
                        this.title_ = item.title_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (!item.getSummary().isEmpty()) {
                        this.summary_ = item.summary_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (!item.getImageUrl().isEmpty()) {
                        this.imageUrl_ = item.imageUrl_;
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    if (!item.getSelectedUtter().isEmpty()) {
                        this.selectedUtter_ = item.selectedUtter_;
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    if (item.getSelected()) {
                        setSelected(item.getSelected());
                    }
                    if (!item.getStyle().isEmpty()) {
                        this.style_ = item.style_;
                        this.bitField0_ |= 32;
                        onChanged();
                    }
                    mergeUnknownFields(item.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.title_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.summary_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 26) {
                                        this.imageUrl_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 4;
                                    } else if (tag == 802) {
                                        this.selectedUtter_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 8;
                                    } else if (tag == 808) {
                                        this.selected_ = rVar.readBool();
                                        this.bitField0_ |= 16;
                                    } else if (tag != 818) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        this.style_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 32;
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            /* synthetic */ Item(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static Item getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_SelectCard_Item_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Item parseDelimitedFrom(InputStream inputStream) {
                return (Item) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Item parseFrom(ByteBuffer byteBuffer) {
                return (Item) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Item)) {
                    return super.equals(obj);
                }
                Item item = (Item) obj;
                return getTitle().equals(item.getTitle()) && getSummary().equals(item.getSummary()) && getImageUrl().equals(item.getImageUrl()) && getSelectedUtter().equals(item.getSelectedUtter()) && getSelected() == item.getSelected() && getStyle().equals(item.getStyle()) && getUnknownFields().equals(item.getUnknownFields());
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public String getImageUrl() {
                Object obj = this.imageUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.imageUrl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public AbstractC5235o getImageUrlBytes() {
                Object obj = this.imageUrl_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.imageUrl_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public boolean getSelected() {
                return this.selected_;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public String getSelectedUtter() {
                Object obj = this.selectedUtter_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.selectedUtter_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public AbstractC5235o getSelectedUtterBytes() {
                Object obj = this.selectedUtter_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.selectedUtter_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.title_) ? AbstractC5209f0.computeStringSize(1, this.title_) : 0;
                if (!AbstractC5209f0.isStringEmpty(this.summary_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.summary_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.imageUrl_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.imageUrl_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.selectedUtter_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(100, this.selectedUtter_);
                }
                boolean z8 = this.selected_;
                if (z8) {
                    iComputeStringSize += AbstractC5248t.computeBoolSize(101, z8);
                }
                if (!AbstractC5209f0.isStringEmpty(this.style_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(102, this.style_);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public String getStyle() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.style_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public AbstractC5235o getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.style_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public String getSummary() {
                Object obj = this.summary_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.summary_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public AbstractC5235o getSummaryBytes() {
                Object obj = this.summary_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.summary_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.SelectCard.ItemOrBuilder
            public AbstractC5235o getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.title_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTitle().hashCode()) * 37) + 2) * 53) + getSummary().hashCode()) * 37) + 3) * 53) + getImageUrl().hashCode()) * 37) + 100) * 53) + getSelectedUtter().hashCode()) * 37) + 101) * 53) + AbstractC5227l0.hashBoolean(getSelected())) * 37) + 102) * 53) + getStyle().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_SelectCard_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new Item();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (!AbstractC5209f0.isStringEmpty(this.title_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 1, this.title_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.summary_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 2, this.summary_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.imageUrl_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 3, this.imageUrl_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.selectedUtter_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 100, this.selectedUtter_);
                }
                boolean z8 = this.selected_;
                if (z8) {
                    abstractC5248t.writeBool(101, z8);
                }
                if (!AbstractC5209f0.isStringEmpty(this.style_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 102, this.style_);
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private Item(AbstractC5209f0.b bVar) {
                super(bVar);
                this.title_ = "";
                this.summary_ = "";
                this.imageUrl_ = "";
                this.selectedUtter_ = "";
                this.selected_ = false;
                this.style_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(Item item) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(item);
            }

            public static Item parseFrom(ByteBuffer byteBuffer, M m8) {
                return (Item) PARSER.parseFrom(byteBuffer, m8);
            }

            public static Item parseDelimitedFrom(InputStream inputStream, M m8) {
                return (Item) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static Item parseFrom(AbstractC5235o abstractC5235o) {
                return (Item) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Item getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static Item parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (Item) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Item parseFrom(byte[] bArr) {
                return (Item) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static Item parseFrom(byte[] bArr, M m8) {
                return (Item) PARSER.parseFrom(bArr, m8);
            }

            public static Item parseFrom(InputStream inputStream) {
                return (Item) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static Item parseFrom(InputStream inputStream, M m8) {
                return (Item) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            private Item() {
                this.title_ = "";
                this.summary_ = "";
                this.imageUrl_ = "";
                this.selectedUtter_ = "";
                this.selected_ = false;
                this.style_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.title_ = "";
                this.summary_ = "";
                this.imageUrl_ = "";
                this.selectedUtter_ = "";
                this.style_ = "";
            }

            public static Item parseFrom(r rVar) {
                return (Item) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static Item parseFrom(r rVar, M m8) {
                return (Item) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface ItemOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            String getImageUrl();

            AbstractC5235o getImageUrlBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            boolean getSelected();

            String getSelectedUtter();

            AbstractC5235o getSelectedUtterBytes();

            String getStyle();

            AbstractC5235o getStyleBytes();

            String getSummary();

            AbstractC5235o getSummaryBytes();

            String getTitle();

            AbstractC5235o getTitleBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ SelectCard(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static SelectCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return CardOuterClass.internal_static_maum_m2u_common_SelectCard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SelectCard parseDelimitedFrom(InputStream inputStream) {
            return (SelectCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SelectCard parseFrom(ByteBuffer byteBuffer) {
            return (SelectCard) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectCard)) {
                return super.equals(obj);
            }
            SelectCard selectCard = (SelectCard) obj;
            return getTitle().equals(selectCard.getTitle()) && getHeader().equals(selectCard.getHeader()) && getItemsList().equals(selectCard.getItemsList()) && getHorizontal() == selectCard.getHorizontal() && getType().equals(selectCard.getType()) && getUnknownFields().equals(selectCard.getUnknownFields());
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public String getHeader() {
            Object obj = this.header_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.header_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public AbstractC5235o getHeaderBytes() {
            Object obj = this.header_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.header_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public boolean getHorizontal() {
            return this.horizontal_;
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public Item getItems(int i8) {
            return this.items_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public List<Item> getItemsList() {
            return this.items_;
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public ItemOrBuilder getItemsOrBuilder(int i8) {
            return this.items_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public List<? extends ItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.title_) ? AbstractC5209f0.computeStringSize(1, this.title_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.header_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.header_);
            }
            for (int i9 = 0; i9 < this.items_.size(); i9++) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(3, this.items_.get(i9));
            }
            boolean z8 = this.horizontal_;
            if (z8) {
                iComputeStringSize += AbstractC5248t.computeBoolSize(11, z8);
            }
            if (!AbstractC5209f0.isStringEmpty(this.type_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(12, this.type_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.title_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public AbstractC5235o getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.title_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.SelectCardOrBuilder
        public AbstractC5235o getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.type_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTitle().hashCode()) * 37) + 2) * 53) + getHeader().hashCode();
            if (getItemsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getItemsList().hashCode();
            }
            int iHashBoolean = (((((((((iHashCode * 37) + 11) * 53) + AbstractC5227l0.hashBoolean(getHorizontal())) * 37) + 12) * 53) + getType().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashBoolean;
            return iHashBoolean;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return CardOuterClass.internal_static_maum_m2u_common_SelectCard_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectCard.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new SelectCard();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.title_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.title_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.header_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.header_);
            }
            for (int i8 = 0; i8 < this.items_.size(); i8++) {
                abstractC5248t.writeMessage(3, this.items_.get(i8));
            }
            boolean z8 = this.horizontal_;
            if (z8) {
                abstractC5248t.writeBool(11, z8);
            }
            if (!AbstractC5209f0.isStringEmpty(this.type_)) {
                AbstractC5209f0.writeString(abstractC5248t, 12, this.type_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private SelectCard(AbstractC5209f0.b bVar) {
            super(bVar);
            this.title_ = "";
            this.header_ = "";
            this.horizontal_ = false;
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SelectCard selectCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(selectCard);
        }

        public static SelectCard parseFrom(ByteBuffer byteBuffer, M m8) {
            return (SelectCard) PARSER.parseFrom(byteBuffer, m8);
        }

        public static SelectCard parseDelimitedFrom(InputStream inputStream, M m8) {
            return (SelectCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static SelectCard parseFrom(AbstractC5235o abstractC5235o) {
            return (SelectCard) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public SelectCard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static SelectCard parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (SelectCard) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SelectCard parseFrom(byte[] bArr) {
            return (SelectCard) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static SelectCard parseFrom(byte[] bArr, M m8) {
            return (SelectCard) PARSER.parseFrom(bArr, m8);
        }

        public static SelectCard parseFrom(InputStream inputStream) {
            return (SelectCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private SelectCard() {
            this.title_ = "";
            this.header_ = "";
            this.horizontal_ = false;
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.title_ = "";
            this.header_ = "";
            this.items_ = Collections.emptyList();
            this.type_ = "";
        }

        public static SelectCard parseFrom(InputStream inputStream, M m8) {
            return (SelectCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static SelectCard parseFrom(r rVar) {
            return (SelectCard) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static SelectCard parseFrom(r rVar, M m8) {
            return (SelectCard) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface SelectCardOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        String getHeader();

        AbstractC5235o getHeaderBytes();

        boolean getHorizontal();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        SelectCard.Item getItems(int i8);

        int getItemsCount();

        List<SelectCard.Item> getItemsList();

        SelectCard.ItemOrBuilder getItemsOrBuilder(int i8);

        List<? extends SelectCard.ItemOrBuilder> getItemsOrBuilderList();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getTitle();

        AbstractC5235o getTitleBytes();

        String getType();

        AbstractC5235o getTypeBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class TableCard extends AbstractC5209f0 implements TableCardOrBuilder {
        public static final int ITEMS_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<TableItem> items_;
        private byte memoizedIsInitialized;
        private volatile Object type_;
        private static final TableCard DEFAULT_INSTANCE = new TableCard();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.TableCard.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public TableCard parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = TableCard.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements TableCardOrBuilder {
            private int bitField0_;
            private C5213g1 itemsBuilder_;
            private List<TableItem> items_;
            private Object type_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(TableCard tableCard) {
                if ((this.bitField0_ & 1) != 0) {
                    tableCard.type_ = this.type_;
                }
            }

            private void buildPartialRepeatedFields(TableCard tableCard) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 != null) {
                    tableCard.items_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.items_ = Collections.unmodifiableList(this.items_);
                    this.bitField0_ &= -3;
                }
                tableCard.items_ = this.items_;
            }

            private void ensureItemsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.items_ = new ArrayList(this.items_);
                    this.bitField0_ |= 2;
                }
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_TableCard_descriptor;
            }

            private C5213g1 getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new C5213g1(this.items_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }

            public Builder addAllItems(Iterable<? extends TableItem> iterable) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    ensureItemsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.items_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addItems(TableItem tableItem) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    tableItem.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(tableItem);
                    onChanged();
                } else {
                    c5213g1.addMessage(tableItem);
                }
                return this;
            }

            public TableItem.Builder addItemsBuilder() {
                return (TableItem.Builder) getItemsFieldBuilder().addBuilder(TableItem.getDefaultInstance());
            }

            public Builder clearItems() {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    this.items_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearType() {
                this.type_ = TableCard.getDefaultInstance().getType();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return CardOuterClass.internal_static_maum_m2u_common_TableCard_descriptor;
            }

            @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
            public TableItem getItems(int i8) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                return c5213g1 == null ? this.items_.get(i8) : (TableItem) c5213g1.getMessage(i8);
            }

            public TableItem.Builder getItemsBuilder(int i8) {
                return (TableItem.Builder) getItemsFieldBuilder().getBuilder(i8);
            }

            public List<TableItem.Builder> getItemsBuilderList() {
                return getItemsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
            public int getItemsCount() {
                C5213g1 c5213g1 = this.itemsBuilder_;
                return c5213g1 == null ? this.items_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
            public List<TableItem> getItemsList() {
                C5213g1 c5213g1 = this.itemsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.items_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
            public TableItemOrBuilder getItemsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                return c5213g1 == null ? this.items_.get(i8) : (TableItemOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
            public List<? extends TableItemOrBuilder> getItemsOrBuilderList() {
                C5213g1 c5213g1 = this.itemsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
            }

            @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
            public AbstractC5235o getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.type_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_TableCard_fieldAccessorTable.ensureFieldAccessorsInitialized(TableCard.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeItems(int i8) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    ensureItemsIsMutable();
                    this.items_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setItems(int i8, TableItem tableItem) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    tableItem.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i8, tableItem);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, tableItem);
                }
                return this;
            }

            public Builder setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTypeBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.type_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.type_ = "";
                this.items_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public TableCard build() {
                TableCard tableCardBuildPartial = buildPartial();
                if (tableCardBuildPartial.isInitialized()) {
                    return tableCardBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) tableCardBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public TableCard buildPartial() {
                TableCard tableCard = new TableCard(this, null);
                buildPartialRepeatedFields(tableCard);
                if (this.bitField0_ != 0) {
                    buildPartial0(tableCard);
                }
                onBuilt();
                return tableCard;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public TableCard getDefaultInstanceForType() {
                return TableCard.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            public TableItem.Builder addItemsBuilder(int i8) {
                return (TableItem.Builder) getItemsFieldBuilder().addBuilder(i8, TableItem.getDefaultInstance());
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = "";
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    this.items_ = Collections.emptyList();
                } else {
                    this.items_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.type_ = "";
                this.items_ = Collections.emptyList();
            }

            public Builder addItems(int i8, TableItem tableItem) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    tableItem.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i8, tableItem);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, tableItem);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof TableCard) {
                    return mergeFrom((TableCard) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setItems(int i8, TableItem.Builder builder) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    ensureItemsIsMutable();
                    this.items_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(TableCard tableCard) {
                if (tableCard == TableCard.getDefaultInstance()) {
                    return this;
                }
                if (!tableCard.getType().isEmpty()) {
                    this.type_ = tableCard.type_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (this.itemsBuilder_ == null) {
                    if (!tableCard.items_.isEmpty()) {
                        if (this.items_.isEmpty()) {
                            this.items_ = tableCard.items_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureItemsIsMutable();
                            this.items_.addAll(tableCard.items_);
                        }
                        onChanged();
                    }
                } else if (!tableCard.items_.isEmpty()) {
                    if (!this.itemsBuilder_.isEmpty()) {
                        this.itemsBuilder_.addAllMessages(tableCard.items_);
                    } else {
                        this.itemsBuilder_.dispose();
                        this.itemsBuilder_ = null;
                        this.items_ = tableCard.items_;
                        this.bitField0_ &= -3;
                        this.itemsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(tableCard.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addItems(TableItem.Builder builder) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    ensureItemsIsMutable();
                    this.items_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addItems(int i8, TableItem.Builder builder) {
                C5213g1 c5213g1 = this.itemsBuilder_;
                if (c5213g1 == null) {
                    ensureItemsIsMutable();
                    this.items_.add(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.type_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    TableItem tableItem = (TableItem) rVar.readMessage(TableItem.parser(), m8);
                                    C5213g1 c5213g1 = this.itemsBuilder_;
                                    if (c5213g1 == null) {
                                        ensureItemsIsMutable();
                                        this.items_.add(tableItem);
                                    } else {
                                        c5213g1.addMessage(tableItem);
                                    }
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        public static final class TableItem extends AbstractC5209f0 implements TableItemOrBuilder {
            public static final int KEY_FIELD_NUMBER = 1;
            public static final int STYLE_FIELD_NUMBER = 3;
            public static final int VALUE_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private volatile Object key_;
            private byte memoizedIsInitialized;
            private volatile Object style_;
            private volatile Object value_;
            private static final TableItem DEFAULT_INSTANCE = new TableItem();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.TableCard.TableItem.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public TableItem parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = TableItem.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };

            public static final class Builder extends AbstractC5209f0.b implements TableItemOrBuilder {
                private int bitField0_;
                private Object key_;
                private Object style_;
                private Object value_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(TableItem tableItem) {
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        tableItem.key_ = this.key_;
                    }
                    if ((i8 & 2) != 0) {
                        tableItem.value_ = this.value_;
                    }
                    if ((i8 & 4) != 0) {
                        tableItem.style_ = this.style_;
                    }
                }

                public static final C5269x.b getDescriptor() {
                    return CardOuterClass.internal_static_maum_m2u_common_TableCard_TableItem_descriptor;
                }

                public Builder clearKey() {
                    this.key_ = TableItem.getDefaultInstance().getKey();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearStyle() {
                    this.style_ = TableItem.getDefaultInstance().getStyle();
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearValue() {
                    this.value_ = TableItem.getDefaultInstance().getValue();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return CardOuterClass.internal_static_maum_m2u_common_TableCard_TableItem_descriptor;
                }

                @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
                public String getKey() {
                    Object obj = this.key_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.key_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
                public AbstractC5235o getKeyBytes() {
                    Object obj = this.key_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.key_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
                public String getStyle() {
                    Object obj = this.style_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.style_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
                public AbstractC5235o getStyleBytes() {
                    Object obj = this.style_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.style_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
                public AbstractC5235o getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.value_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return CardOuterClass.internal_static_maum_m2u_common_TableCard_TableItem_fieldAccessorTable.ensureFieldAccessorsInitialized(TableItem.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setKey(String str) {
                    str.getClass();
                    this.key_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setKeyBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.key_ = abstractC5235o;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setStyle(String str) {
                    str.getClass();
                    this.style_ = str;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setStyleBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.style_ = abstractC5235o;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setValue(String str) {
                    str.getClass();
                    this.value_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setValueBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.value_ = abstractC5235o;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.key_ = "";
                    this.value_ = "";
                    this.style_ = "";
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public TableItem build() {
                    TableItem tableItemBuildPartial = buildPartial();
                    if (tableItemBuildPartial.isInitialized()) {
                        return tableItemBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) tableItemBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public TableItem buildPartial() {
                    TableItem tableItem = new TableItem(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(tableItem);
                    }
                    onBuilt();
                    return tableItem;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public TableItem getDefaultInstanceForType() {
                    return TableItem.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.key_ = "";
                    this.value_ = "";
                    this.style_ = "";
                    return this;
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.key_ = "";
                    this.value_ = "";
                    this.style_ = "";
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof TableItem) {
                        return mergeFrom((TableItem) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder mergeFrom(TableItem tableItem) {
                    if (tableItem == TableItem.getDefaultInstance()) {
                        return this;
                    }
                    if (!tableItem.getKey().isEmpty()) {
                        this.key_ = tableItem.key_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (!tableItem.getValue().isEmpty()) {
                        this.value_ = tableItem.value_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (!tableItem.getStyle().isEmpty()) {
                        this.style_ = tableItem.style_;
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    mergeUnknownFields(tableItem.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.key_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.value_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 2;
                                    } else if (tag != 26) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        this.style_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 4;
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            /* synthetic */ TableItem(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static TableItem getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_TableCard_TableItem_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static TableItem parseDelimitedFrom(InputStream inputStream) {
                return (TableItem) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static TableItem parseFrom(ByteBuffer byteBuffer) {
                return (TableItem) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TableItem)) {
                    return super.equals(obj);
                }
                TableItem tableItem = (TableItem) obj;
                return getKey().equals(tableItem.getKey()) && getValue().equals(tableItem.getValue()) && getStyle().equals(tableItem.getStyle()) && getUnknownFields().equals(tableItem.getUnknownFields());
            }

            @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
            public String getKey() {
                Object obj = this.key_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.key_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
            public AbstractC5235o getKeyBytes() {
                Object obj = this.key_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.key_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.key_) ? AbstractC5209f0.computeStringSize(1, this.key_) : 0;
                if (!AbstractC5209f0.isStringEmpty(this.value_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.value_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.style_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.style_);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
            public String getStyle() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.style_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
            public AbstractC5235o getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.style_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.CardOuterClass.TableCard.TableItemOrBuilder
            public AbstractC5235o getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.value_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getKey().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 37) + 3) * 53) + getStyle().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_TableCard_TableItem_fieldAccessorTable.ensureFieldAccessorsInitialized(TableItem.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new TableItem();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (!AbstractC5209f0.isStringEmpty(this.key_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 1, this.key_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.value_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 2, this.value_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.style_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 3, this.style_);
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private TableItem(AbstractC5209f0.b bVar) {
                super(bVar);
                this.key_ = "";
                this.value_ = "";
                this.style_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(TableItem tableItem) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(tableItem);
            }

            public static TableItem parseFrom(ByteBuffer byteBuffer, M m8) {
                return (TableItem) PARSER.parseFrom(byteBuffer, m8);
            }

            public static TableItem parseDelimitedFrom(InputStream inputStream, M m8) {
                return (TableItem) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static TableItem parseFrom(AbstractC5235o abstractC5235o) {
                return (TableItem) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public TableItem getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static TableItem parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (TableItem) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static TableItem parseFrom(byte[] bArr) {
                return (TableItem) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static TableItem parseFrom(byte[] bArr, M m8) {
                return (TableItem) PARSER.parseFrom(bArr, m8);
            }

            private TableItem() {
                this.key_ = "";
                this.value_ = "";
                this.style_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.key_ = "";
                this.value_ = "";
                this.style_ = "";
            }

            public static TableItem parseFrom(InputStream inputStream) {
                return (TableItem) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static TableItem parseFrom(InputStream inputStream, M m8) {
                return (TableItem) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static TableItem parseFrom(r rVar) {
                return (TableItem) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static TableItem parseFrom(r rVar, M m8) {
                return (TableItem) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface TableItemOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            String getKey();

            AbstractC5235o getKeyBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            String getStyle();

            AbstractC5235o getStyleBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            String getValue();

            AbstractC5235o getValueBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ TableCard(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static TableCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return CardOuterClass.internal_static_maum_m2u_common_TableCard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TableCard parseDelimitedFrom(InputStream inputStream) {
            return (TableCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TableCard parseFrom(ByteBuffer byteBuffer) {
            return (TableCard) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TableCard)) {
                return super.equals(obj);
            }
            TableCard tableCard = (TableCard) obj;
            return getType().equals(tableCard.getType()) && getItemsList().equals(tableCard.getItemsList()) && getUnknownFields().equals(tableCard.getUnknownFields());
        }

        @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
        public TableItem getItems(int i8) {
            return this.items_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
        public List<TableItem> getItemsList() {
            return this.items_;
        }

        @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
        public TableItemOrBuilder getItemsOrBuilder(int i8) {
            return this.items_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
        public List<? extends TableItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.type_) ? AbstractC5209f0.computeStringSize(1, this.type_) : 0;
            for (int i9 = 0; i9 < this.items_.size(); i9++) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(2, this.items_.get(i9));
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.CardOuterClass.TableCardOrBuilder
        public AbstractC5235o getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.type_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode();
            if (getItemsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getItemsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return CardOuterClass.internal_static_maum_m2u_common_TableCard_fieldAccessorTable.ensureFieldAccessorsInitialized(TableCard.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new TableCard();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.type_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.type_);
            }
            for (int i8 = 0; i8 < this.items_.size(); i8++) {
                abstractC5248t.writeMessage(2, this.items_.get(i8));
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private TableCard(AbstractC5209f0.b bVar) {
            super(bVar);
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(TableCard tableCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(tableCard);
        }

        public static TableCard parseFrom(ByteBuffer byteBuffer, M m8) {
            return (TableCard) PARSER.parseFrom(byteBuffer, m8);
        }

        public static TableCard parseDelimitedFrom(InputStream inputStream, M m8) {
            return (TableCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static TableCard parseFrom(AbstractC5235o abstractC5235o) {
            return (TableCard) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public TableCard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static TableCard parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (TableCard) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private TableCard() {
            this.type_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = "";
            this.items_ = Collections.emptyList();
        }

        public static TableCard parseFrom(byte[] bArr) {
            return (TableCard) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static TableCard parseFrom(byte[] bArr, M m8) {
            return (TableCard) PARSER.parseFrom(bArr, m8);
        }

        public static TableCard parseFrom(InputStream inputStream) {
            return (TableCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static TableCard parseFrom(InputStream inputStream, M m8) {
            return (TableCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static TableCard parseFrom(r rVar) {
            return (TableCard) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static TableCard parseFrom(r rVar, M m8) {
            return (TableCard) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface TableCardOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        TableCard.TableItem getItems(int i8);

        int getItemsCount();

        List<TableCard.TableItem> getItemsList();

        TableCard.TableItemOrBuilder getItemsOrBuilder(int i8);

        List<? extends TableCard.TableItemOrBuilder> getItemsOrBuilderList();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getType();

        AbstractC5235o getTypeBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class TableListCard extends AbstractC5209f0 implements TableListCardOrBuilder {
        public static final int CARDS_FIELD_NUMBER = 1;
        public static final int HORIZONTAL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<TableCard> cards_;
        private boolean horizontal_;
        private byte memoizedIsInitialized;
        private static final TableListCard DEFAULT_INSTANCE = new TableListCard();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.CardOuterClass.TableListCard.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public TableListCard parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = TableListCard.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements TableListCardOrBuilder {
            private int bitField0_;
            private C5213g1 cardsBuilder_;
            private List<TableCard> cards_;
            private boolean horizontal_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(TableListCard tableListCard) {
                if ((this.bitField0_ & 2) != 0) {
                    tableListCard.horizontal_ = this.horizontal_;
                }
            }

            private void buildPartialRepeatedFields(TableListCard tableListCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 != null) {
                    tableListCard.cards_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.cards_ = Collections.unmodifiableList(this.cards_);
                    this.bitField0_ &= -2;
                }
                tableListCard.cards_ = this.cards_;
            }

            private void ensureCardsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.cards_ = new ArrayList(this.cards_);
                    this.bitField0_ |= 1;
                }
            }

            private C5213g1 getCardsFieldBuilder() {
                if (this.cardsBuilder_ == null) {
                    this.cardsBuilder_ = new C5213g1(this.cards_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.cards_ = null;
                }
                return this.cardsBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return CardOuterClass.internal_static_maum_m2u_common_TableListCard_descriptor;
            }

            public Builder addAllCards(Iterable<? extends TableCard> iterable) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.cards_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addCards(TableCard tableCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    tableCard.getClass();
                    ensureCardsIsMutable();
                    this.cards_.add(tableCard);
                    onChanged();
                } else {
                    c5213g1.addMessage(tableCard);
                }
                return this;
            }

            public TableCard.Builder addCardsBuilder() {
                return (TableCard.Builder) getCardsFieldBuilder().addBuilder(TableCard.getDefaultInstance());
            }

            public Builder clearCards() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    this.cards_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearHorizontal() {
                this.bitField0_ &= -3;
                this.horizontal_ = false;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
            public TableCard getCards(int i8) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? this.cards_.get(i8) : (TableCard) c5213g1.getMessage(i8);
            }

            public TableCard.Builder getCardsBuilder(int i8) {
                return (TableCard.Builder) getCardsFieldBuilder().getBuilder(i8);
            }

            public List<TableCard.Builder> getCardsBuilderList() {
                return getCardsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
            public int getCardsCount() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? this.cards_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
            public List<TableCard> getCardsList() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.cards_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
            public TableCardOrBuilder getCardsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 == null ? this.cards_.get(i8) : (TableCardOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
            public List<? extends TableCardOrBuilder> getCardsOrBuilderList() {
                C5213g1 c5213g1 = this.cardsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.cards_);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return CardOuterClass.internal_static_maum_m2u_common_TableListCard_descriptor;
            }

            @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
            public boolean getHorizontal() {
                return this.horizontal_;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return CardOuterClass.internal_static_maum_m2u_common_TableListCard_fieldAccessorTable.ensureFieldAccessorsInitialized(TableListCard.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeCards(int i8) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setCards(int i8, TableCard tableCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    tableCard.getClass();
                    ensureCardsIsMutable();
                    this.cards_.set(i8, tableCard);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, tableCard);
                }
                return this;
            }

            public Builder setHorizontal(boolean z8) {
                this.horizontal_ = z8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.cards_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public TableListCard build() {
                TableListCard tableListCardBuildPartial = buildPartial();
                if (tableListCardBuildPartial.isInitialized()) {
                    return tableListCardBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) tableListCardBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public TableListCard buildPartial() {
                TableListCard tableListCard = new TableListCard(this, null);
                buildPartialRepeatedFields(tableListCard);
                if (this.bitField0_ != 0) {
                    buildPartial0(tableListCard);
                }
                onBuilt();
                return tableListCard;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public TableListCard getDefaultInstanceForType() {
                return TableListCard.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            public TableCard.Builder addCardsBuilder(int i8) {
                return (TableCard.Builder) getCardsFieldBuilder().addBuilder(i8, TableCard.getDefaultInstance());
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.cards_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    this.cards_ = Collections.emptyList();
                } else {
                    this.cards_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -2;
                this.horizontal_ = false;
                return this;
            }

            public Builder addCards(int i8, TableCard tableCard) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    tableCard.getClass();
                    ensureCardsIsMutable();
                    this.cards_.add(i8, tableCard);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, tableCard);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof TableListCard) {
                    return mergeFrom((TableListCard) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setCards(int i8, TableCard.Builder builder) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(TableListCard tableListCard) {
                if (tableListCard == TableListCard.getDefaultInstance()) {
                    return this;
                }
                if (this.cardsBuilder_ == null) {
                    if (!tableListCard.cards_.isEmpty()) {
                        if (this.cards_.isEmpty()) {
                            this.cards_ = tableListCard.cards_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCardsIsMutable();
                            this.cards_.addAll(tableListCard.cards_);
                        }
                        onChanged();
                    }
                } else if (!tableListCard.cards_.isEmpty()) {
                    if (!this.cardsBuilder_.isEmpty()) {
                        this.cardsBuilder_.addAllMessages(tableListCard.cards_);
                    } else {
                        this.cardsBuilder_.dispose();
                        this.cardsBuilder_ = null;
                        this.cards_ = tableListCard.cards_;
                        this.bitField0_ &= -2;
                        this.cardsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getCardsFieldBuilder() : null;
                    }
                }
                if (tableListCard.getHorizontal()) {
                    setHorizontal(tableListCard.getHorizontal());
                }
                mergeUnknownFields(tableListCard.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addCards(TableCard.Builder builder) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addCards(int i8, TableCard.Builder builder) {
                C5213g1 c5213g1 = this.cardsBuilder_;
                if (c5213g1 == null) {
                    ensureCardsIsMutable();
                    this.cards_.add(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    TableCard tableCard = (TableCard) rVar.readMessage(TableCard.parser(), m8);
                                    C5213g1 c5213g1 = this.cardsBuilder_;
                                    if (c5213g1 == null) {
                                        ensureCardsIsMutable();
                                        this.cards_.add(tableCard);
                                    } else {
                                        c5213g1.addMessage(tableCard);
                                    }
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.horizontal_ = rVar.readBool();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ TableListCard(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static TableListCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return CardOuterClass.internal_static_maum_m2u_common_TableListCard_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TableListCard parseDelimitedFrom(InputStream inputStream) {
            return (TableListCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TableListCard parseFrom(ByteBuffer byteBuffer) {
            return (TableListCard) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TableListCard)) {
                return super.equals(obj);
            }
            TableListCard tableListCard = (TableListCard) obj;
            return getCardsList().equals(tableListCard.getCardsList()) && getHorizontal() == tableListCard.getHorizontal() && getUnknownFields().equals(tableListCard.getUnknownFields());
        }

        @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
        public TableCard getCards(int i8) {
            return this.cards_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
        public int getCardsCount() {
            return this.cards_.size();
        }

        @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
        public List<TableCard> getCardsList() {
            return this.cards_;
        }

        @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
        public TableCardOrBuilder getCardsOrBuilder(int i8) {
            return this.cards_.get(i8);
        }

        @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
        public List<? extends TableCardOrBuilder> getCardsOrBuilderList() {
            return this.cards_;
        }

        @Override // maum.m2u.common.CardOuterClass.TableListCardOrBuilder
        public boolean getHorizontal() {
            return this.horizontal_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeBoolSize = 0;
            for (int i9 = 0; i9 < this.cards_.size(); i9++) {
                iComputeBoolSize += AbstractC5248t.computeMessageSize(1, this.cards_.get(i9));
            }
            boolean z8 = this.horizontal_;
            if (z8) {
                iComputeBoolSize += AbstractC5248t.computeBoolSize(2, z8);
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getCardsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCardsList().hashCode();
            }
            int iHashBoolean = (((((iHashCode * 37) + 2) * 53) + AbstractC5227l0.hashBoolean(getHorizontal())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashBoolean;
            return iHashBoolean;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return CardOuterClass.internal_static_maum_m2u_common_TableListCard_fieldAccessorTable.ensureFieldAccessorsInitialized(TableListCard.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new TableListCard();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            for (int i8 = 0; i8 < this.cards_.size(); i8++) {
                abstractC5248t.writeMessage(1, this.cards_.get(i8));
            }
            boolean z8 = this.horizontal_;
            if (z8) {
                abstractC5248t.writeBool(2, z8);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private TableListCard(AbstractC5209f0.b bVar) {
            super(bVar);
            this.horizontal_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(TableListCard tableListCard) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(tableListCard);
        }

        public static TableListCard parseFrom(ByteBuffer byteBuffer, M m8) {
            return (TableListCard) PARSER.parseFrom(byteBuffer, m8);
        }

        public static TableListCard parseDelimitedFrom(InputStream inputStream, M m8) {
            return (TableListCard) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static TableListCard parseFrom(AbstractC5235o abstractC5235o) {
            return (TableListCard) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public TableListCard getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static TableListCard parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (TableListCard) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private TableListCard() {
            this.horizontal_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.cards_ = Collections.emptyList();
        }

        public static TableListCard parseFrom(byte[] bArr) {
            return (TableListCard) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static TableListCard parseFrom(byte[] bArr, M m8) {
            return (TableListCard) PARSER.parseFrom(bArr, m8);
        }

        public static TableListCard parseFrom(InputStream inputStream) {
            return (TableListCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static TableListCard parseFrom(InputStream inputStream, M m8) {
            return (TableListCard) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static TableListCard parseFrom(r rVar) {
            return (TableListCard) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static TableListCard parseFrom(r rVar, M m8) {
            return (TableListCard) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface TableListCardOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        TableCard getCards(int i8);

        int getCardsCount();

        List<TableCard> getCardsList();

        TableCardOrBuilder getCardsOrBuilder(int i8);

        List<? extends TableCardOrBuilder> getCardsOrBuilderList();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        boolean getHorizontal();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        internal_static_maum_m2u_common_ChartCard_descriptor = bVar;
        internal_static_maum_m2u_common_ChartCard_fieldAccessorTable = new AbstractC5209f0.g(bVar, new String[]{"Type", "Options", "Data"});
        C5269x.b bVar2 = getDescriptor().getMessageTypes().get(1);
        internal_static_maum_m2u_common_SelectCard_descriptor = bVar2;
        internal_static_maum_m2u_common_SelectCard_fieldAccessorTable = new AbstractC5209f0.g(bVar2, new String[]{"Title", "Header", "Items", "Horizontal", "Type"});
        C5269x.b bVar3 = bVar2.getNestedTypes().get(0);
        internal_static_maum_m2u_common_SelectCard_Item_descriptor = bVar3;
        internal_static_maum_m2u_common_SelectCard_Item_fieldAccessorTable = new AbstractC5209f0.g(bVar3, new String[]{"Title", "Summary", "ImageUrl", "SelectedUtter", "Selected", "Style"});
        C5269x.b bVar4 = getDescriptor().getMessageTypes().get(2);
        internal_static_maum_m2u_common_LinkCard_descriptor = bVar4;
        internal_static_maum_m2u_common_LinkCard_fieldAccessorTable = new AbstractC5209f0.g(bVar4, new String[]{"Title", "Summary", "ImageUrl", "ImageHref", "Type"});
        C5269x.b bVar5 = getDescriptor().getMessageTypes().get(3);
        internal_static_maum_m2u_common_ListCard_descriptor = bVar5;
        internal_static_maum_m2u_common_ListCard_fieldAccessorTable = new AbstractC5209f0.g(bVar5, new String[]{"Cards", "Horizontal"});
        C5269x.b bVar6 = getDescriptor().getMessageTypes().get(4);
        internal_static_maum_m2u_common_CustomCard_descriptor = bVar6;
        internal_static_maum_m2u_common_CustomCard_fieldAccessorTable = new AbstractC5209f0.g(bVar6, new String[]{"Type", "CardData"});
        C5269x.b bVar7 = getDescriptor().getMessageTypes().get(5);
        internal_static_maum_m2u_common_CustomListCard_descriptor = bVar7;
        internal_static_maum_m2u_common_CustomListCard_fieldAccessorTable = new AbstractC5209f0.g(bVar7, new String[]{"Cards", "Horizontal"});
        C5269x.b bVar8 = getDescriptor().getMessageTypes().get(6);
        internal_static_maum_m2u_common_TableCard_descriptor = bVar8;
        internal_static_maum_m2u_common_TableCard_fieldAccessorTable = new AbstractC5209f0.g(bVar8, new String[]{"Type", "Items"});
        C5269x.b bVar9 = bVar8.getNestedTypes().get(0);
        internal_static_maum_m2u_common_TableCard_TableItem_descriptor = bVar9;
        internal_static_maum_m2u_common_TableCard_TableItem_fieldAccessorTable = new AbstractC5209f0.g(bVar9, new String[]{"Key", "Value", "Style"});
        C5269x.b bVar10 = getDescriptor().getMessageTypes().get(7);
        internal_static_maum_m2u_common_TableListCard_descriptor = bVar10;
        internal_static_maum_m2u_common_TableListCard_fieldAccessorTable = new AbstractC5209f0.g(bVar10, new String[]{"Cards", "Horizontal"});
        C5269x.b bVar11 = getDescriptor().getMessageTypes().get(8);
        internal_static_maum_m2u_common_GridCard_descriptor = bVar11;
        internal_static_maum_m2u_common_GridCard_fieldAccessorTable = new AbstractC5209f0.g(bVar11, new String[]{"Type", "Columns", "Rows"});
        C5269x.b bVar12 = getDescriptor().getMessageTypes().get(9);
        internal_static_maum_m2u_common_Card_descriptor = bVar12;
        internal_static_maum_m2u_common_Card_fieldAccessorTable = new AbstractC5209f0.g(bVar12, new String[]{"Chart", "Select", "Link", "Custom", "Table", "Grid", "LinkList", "CustomList", "TableList", "Raw", "TestCard"});
        AbstractC5245r1.getDescriptor();
    }

    private CardOuterClass() {
    }

    public static C5269x.h getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(M m8) {
    }

    public static void registerAllExtensions(K k8) {
        registerAllExtensions((M) k8);
    }
}
