package maum.m2u.common;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5199c;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.AbstractC5248t;
import com.google.protobuf.C5228l1;
import com.google.protobuf.C5230m0;
import com.google.protobuf.C5269x;
import com.google.protobuf.E1;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.K;
import com.google.protobuf.K0;
import com.google.protobuf.M;
import com.google.protobuf.N0;
import com.google.protobuf.Z0;
import com.google.protobuf.r;
import com.google.protobuf.w1;
import com.google.protobuf.x1;
import com.google.protobuf.y1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class LocationOuterClass {
    private static C5269x.h descriptor = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001emaum/m2u/common/location.proto\u0012\u000fmaum.m2u.common\u001a\u001fgoogle/protobuf/timestamp.proto\"q\n\bLocation\u0012\u0010\n\blatitude\u0018\u0001 \u0001(\u0002\u0012\u0011\n\tlongitude\u0018\u0002 \u0001(\u0002\u0012\u0010\n\blocation\u0018\u0003 \u0001(\t\u0012.\n\nrefresh_at\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.Timestampb\u0006proto3"}, new C5269x.h[]{y1.getDescriptor()});
    private static final C5269x.b internal_static_maum_m2u_common_Location_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_Location_fieldAccessorTable;

    public static final class Location extends AbstractC5209f0 implements LocationOrBuilder {
        public static final int LATITUDE_FIELD_NUMBER = 1;
        public static final int LOCATION_FIELD_NUMBER = 3;
        public static final int LONGITUDE_FIELD_NUMBER = 2;
        public static final int REFRESH_AT_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private float latitude_;
        private volatile Object location_;
        private float longitude_;
        private byte memoizedIsInitialized;
        private w1 refreshAt_;
        private static final Location DEFAULT_INSTANCE = new Location();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.LocationOuterClass.Location.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Location parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Location.newBuilder();
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

        /* renamed from: maum.m2u.common.LocationOuterClass$Location$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Location parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Location.newBuilder();
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
        }

        public static final class Builder extends AbstractC5209f0.b implements LocationOrBuilder {
            private int bitField0_;
            private float latitude_;
            private Object location_;
            private float longitude_;
            private C5228l1 refreshAtBuilder_;
            private w1 refreshAt_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(Location location) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    location.latitude_ = this.latitude_;
                }
                if ((i9 & 2) != 0) {
                    location.longitude_ = this.longitude_;
                }
                if ((i9 & 4) != 0) {
                    location.location_ = this.location_;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l1 = this.refreshAtBuilder_;
                    location.refreshAt_ = c5228l1 == null ? this.refreshAt_ : (w1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                Location.access$1076(location, i8);
            }

            public static final C5269x.b getDescriptor() {
                return LocationOuterClass.internal_static_maum_m2u_common_Location_descriptor;
            }

            private C5228l1 getRefreshAtFieldBuilder() {
                if (this.refreshAtBuilder_ == null) {
                    this.refreshAtBuilder_ = new C5228l1(getRefreshAt(), getParentForChildren(), isClean());
                    this.refreshAt_ = null;
                }
                return this.refreshAtBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getRefreshAtFieldBuilder();
                }
            }

            public Builder clearLatitude() {
                this.bitField0_ &= -2;
                this.latitude_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearLocation() {
                this.location_ = Location.getDefaultInstance().getLocation();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearLongitude() {
                this.bitField0_ &= -3;
                this.longitude_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearRefreshAt() {
                this.bitField0_ &= -9;
                this.refreshAt_ = null;
                C5228l1 c5228l1 = this.refreshAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.refreshAtBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return LocationOuterClass.internal_static_maum_m2u_common_Location_descriptor;
            }

            @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
            public float getLatitude() {
                return this.latitude_;
            }

            @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
            public String getLocation() {
                Object obj = this.location_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.location_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
            public AbstractC5235o getLocationBytes() {
                Object obj = this.location_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.location_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
            public float getLongitude() {
                return this.longitude_;
            }

            @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
            public w1 getRefreshAt() {
                C5228l1 c5228l1 = this.refreshAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.refreshAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getRefreshAtBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (w1.b) getRefreshAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
            public x1 getRefreshAtOrBuilder() {
                C5228l1 c5228l1 = this.refreshAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.refreshAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
            public boolean hasRefreshAt() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return LocationOuterClass.internal_static_maum_m2u_common_Location_fieldAccessorTable.ensureFieldAccessorsInitialized(Location.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeRefreshAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.refreshAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 8) == 0 || (w1Var2 = this.refreshAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.refreshAt_ = w1Var;
                } else {
                    getRefreshAtBuilder().mergeFrom(w1Var);
                }
                if (this.refreshAt_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setLatitude(float f8) {
                this.latitude_ = f8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLocation(String str) {
                str.getClass();
                this.location_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLocationBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.location_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLongitude(float f8) {
                this.longitude_ = f8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRefreshAt(w1 w1Var) {
                C5228l1 c5228l1 = this.refreshAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.refreshAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.location_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Location build() {
                Location locationBuildPartial = buildPartial();
                if (locationBuildPartial.isInitialized()) {
                    return locationBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) locationBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Location buildPartial() {
                Location location = new Location(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(location);
                }
                onBuilt();
                return location;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Location getDefaultInstanceForType() {
                return Location.getDefaultInstance();
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
                this.latitude_ = 0.0f;
                this.longitude_ = 0.0f;
                this.location_ = "";
                this.refreshAt_ = null;
                C5228l1 c5228l1 = this.refreshAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.refreshAtBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.location_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof Location) {
                    return mergeFrom((Location) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setRefreshAt(w1.b bVar) {
                C5228l1 c5228l1 = this.refreshAtBuilder_;
                if (c5228l1 == null) {
                    this.refreshAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeFrom(Location location) {
                if (location == Location.getDefaultInstance()) {
                    return this;
                }
                if (location.getLatitude() != 0.0f) {
                    setLatitude(location.getLatitude());
                }
                if (location.getLongitude() != 0.0f) {
                    setLongitude(location.getLongitude());
                }
                if (!location.getLocation().isEmpty()) {
                    this.location_ = location.location_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (location.hasRefreshAt()) {
                    mergeRefreshAt(location.getRefreshAt());
                }
                mergeUnknownFields(location.getUnknownFields());
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
                                if (tag == 13) {
                                    this.latitude_ = rVar.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.longitude_ = rVar.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.location_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getRefreshAtFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 8;
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

        /* synthetic */ Location(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$1076(Location location, int i8) {
            int i9 = i8 | location.bitField0_;
            location.bitField0_ = i9;
            return i9;
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return LocationOuterClass.internal_static_maum_m2u_common_Location_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Location parseDelimitedFrom(InputStream inputStream) {
            return (Location) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) {
            return (Location) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return super.equals(obj);
            }
            Location location = (Location) obj;
            if (Float.floatToIntBits(getLatitude()) == Float.floatToIntBits(location.getLatitude()) && Float.floatToIntBits(getLongitude()) == Float.floatToIntBits(location.getLongitude()) && getLocation().equals(location.getLocation()) && hasRefreshAt() == location.hasRefreshAt()) {
                return (!hasRefreshAt() || getRefreshAt().equals(location.getRefreshAt())) && getUnknownFields().equals(location.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
        public float getLatitude() {
            return this.latitude_;
        }

        @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
        public String getLocation() {
            Object obj = this.location_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.location_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
        public AbstractC5235o getLocationBytes() {
            Object obj = this.location_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.location_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
        public float getLongitude() {
            return this.longitude_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
        public w1 getRefreshAt() {
            w1 w1Var = this.refreshAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
        public x1 getRefreshAtOrBuilder() {
            w1 w1Var = this.refreshAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeFloatSize = Float.floatToRawIntBits(this.latitude_) != 0 ? AbstractC5248t.computeFloatSize(1, this.latitude_) : 0;
            if (Float.floatToRawIntBits(this.longitude_) != 0) {
                iComputeFloatSize += AbstractC5248t.computeFloatSize(2, this.longitude_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.location_)) {
                iComputeFloatSize += AbstractC5209f0.computeStringSize(3, this.location_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeFloatSize += AbstractC5248t.computeMessageSize(4, getRefreshAt());
            }
            int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.LocationOuterClass.LocationOrBuilder
        public boolean hasRefreshAt() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getLatitude())) * 37) + 2) * 53) + Float.floatToIntBits(getLongitude())) * 37) + 3) * 53) + getLocation().hashCode();
            if (hasRefreshAt()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getRefreshAt().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return LocationOuterClass.internal_static_maum_m2u_common_Location_fieldAccessorTable.ensureFieldAccessorsInitialized(Location.class, Builder.class);
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
            return new Location();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (Float.floatToRawIntBits(this.latitude_) != 0) {
                abstractC5248t.writeFloat(1, this.latitude_);
            }
            if (Float.floatToRawIntBits(this.longitude_) != 0) {
                abstractC5248t.writeFloat(2, this.longitude_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.location_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.location_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(4, getRefreshAt());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private Location(AbstractC5209f0.b bVar) {
            super(bVar);
            this.latitude_ = 0.0f;
            this.longitude_ = 0.0f;
            this.location_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Location location) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(location);
        }

        public static Location parseFrom(ByteBuffer byteBuffer, M m8) {
            return (Location) PARSER.parseFrom(byteBuffer, m8);
        }

        public static Location parseDelimitedFrom(InputStream inputStream, M m8) {
            return (Location) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static Location parseFrom(AbstractC5235o abstractC5235o) {
            return (Location) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public Location getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Location parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (Location) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Location parseFrom(byte[] bArr) {
            return (Location) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static Location parseFrom(byte[] bArr, M m8) {
            return (Location) PARSER.parseFrom(bArr, m8);
        }

        private Location() {
            this.latitude_ = 0.0f;
            this.longitude_ = 0.0f;
            this.location_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.location_ = "";
        }

        public static Location parseFrom(InputStream inputStream) {
            return (Location) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, M m8) {
            return (Location) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static Location parseFrom(r rVar) {
            return (Location) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static Location parseFrom(r rVar, M m8) {
            return (Location) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LocationOrBuilder extends N0 {
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

        float getLatitude();

        String getLocation();

        AbstractC5235o getLocationBytes();

        float getLongitude();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        w1 getRefreshAt();

        x1 getRefreshAtOrBuilder();

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

        boolean hasRefreshAt();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        internal_static_maum_m2u_common_Location_descriptor = bVar;
        internal_static_maum_m2u_common_Location_fieldAccessorTable = new AbstractC5209f0.g(bVar, new String[]{"Latitude", "Longitude", "Location", "RefreshAt"});
        y1.getDescriptor();
    }

    private LocationOuterClass() {
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
