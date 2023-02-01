// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetUpLunchBoxWidgetReq.proto

package emu.grasscutter.net.proto;

public final class SetUpLunchBoxWidgetReqOuterClass {
  private SetUpLunchBoxWidgetReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetUpLunchBoxWidgetReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetUpLunchBoxWidgetReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.LunchBoxData lunchBoxData = 14;</code>
     * @return Whether the lunchBoxData field is set.
     */
    boolean hasLunchBoxData();
    /**
     * <code>.LunchBoxData lunchBoxData = 14;</code>
     * @return The lunchBoxData.
     */
    emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getLunchBoxData();
    /**
     * <code>.LunchBoxData lunchBoxData = 14;</code>
     */
    emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder();
  }
  /**
   * Protobuf type {@code SetUpLunchBoxWidgetReq}
   */
  public static final class SetUpLunchBoxWidgetReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetUpLunchBoxWidgetReq)
      SetUpLunchBoxWidgetReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetUpLunchBoxWidgetReq.newBuilder() to construct.
    private SetUpLunchBoxWidgetReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetUpLunchBoxWidgetReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetUpLunchBoxWidgetReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.class, emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.Builder.class);
    }

    /**
     * Protobuf enum {@code SetUpLunchBoxWidgetReq.HFHLKGOKGOE}
     */
    public enum HFHLKGOKGOE
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4285;</code>
       */
      PEPPOHPHJOJ(1, 4285),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final HFHLKGOKGOE DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final HFHLKGOKGOE EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4285;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4285;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static HFHLKGOKGOE valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static HFHLKGOKGOE forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4285: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<HFHLKGOKGOE>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          HFHLKGOKGOE> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<HFHLKGOKGOE>() {
              public HFHLKGOKGOE findValueByNumber(int number) {
                return HFHLKGOKGOE.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final HFHLKGOKGOE[] VALUES = getStaticValuesArray();
      private static HFHLKGOKGOE[] getStaticValuesArray() {
        return new HFHLKGOKGOE[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static HFHLKGOKGOE valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private HFHLKGOKGOE(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SetUpLunchBoxWidgetReq.HFHLKGOKGOE)
    }

    public static final int LUNCHBOXDATA_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
    /**
     * <code>.LunchBoxData lunchBoxData = 14;</code>
     * @return Whether the lunchBoxData field is set.
     */
    @java.lang.Override
    public boolean hasLunchBoxData() {
      return lunchBoxData_ != null;
    }
    /**
     * <code>.LunchBoxData lunchBoxData = 14;</code>
     * @return The lunchBoxData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getLunchBoxData() {
      return lunchBoxData_ == null ? emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : lunchBoxData_;
    }
    /**
     * <code>.LunchBoxData lunchBoxData = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder() {
      return lunchBoxData_ == null ? emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : lunchBoxData_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (lunchBoxData_ != null) {
        output.writeMessage(14, getLunchBoxData());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lunchBoxData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getLunchBoxData());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq other = (emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq) obj;

      if (hasLunchBoxData() != other.hasLunchBoxData()) return false;
      if (hasLunchBoxData()) {
        if (!getLunchBoxData()
            .equals(other.getLunchBoxData())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasLunchBoxData()) {
        hash = (37 * hash) + LUNCHBOXDATA_FIELD_NUMBER;
        hash = (53 * hash) + getLunchBoxData().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SetUpLunchBoxWidgetReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetUpLunchBoxWidgetReq)
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.class, emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        lunchBoxData_ = null;
        if (lunchBoxDataBuilder_ != null) {
          lunchBoxDataBuilder_.dispose();
          lunchBoxDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq build() {
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq buildPartial() {
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq result = new emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.lunchBoxData_ = lunchBoxDataBuilder_ == null
              ? lunchBoxData_
              : lunchBoxDataBuilder_.build();
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq other) {
        if (other == emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.getDefaultInstance()) return this;
        if (other.hasLunchBoxData()) {
          mergeLunchBoxData(other.getLunchBoxData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 114: {
                input.readMessage(
                    getLunchBoxDataFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 114
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder> lunchBoxDataBuilder_;
      /**
       * <code>.LunchBoxData lunchBoxData = 14;</code>
       * @return Whether the lunchBoxData field is set.
       */
      public boolean hasLunchBoxData() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.LunchBoxData lunchBoxData = 14;</code>
       * @return The lunchBoxData.
       */
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getLunchBoxData() {
        if (lunchBoxDataBuilder_ == null) {
          return lunchBoxData_ == null ? emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : lunchBoxData_;
        } else {
          return lunchBoxDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.LunchBoxData lunchBoxData = 14;</code>
       */
      public Builder setLunchBoxData(emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData value) {
        if (lunchBoxDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lunchBoxData_ = value;
        } else {
          lunchBoxDataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.LunchBoxData lunchBoxData = 14;</code>
       */
      public Builder setLunchBoxData(
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder builderForValue) {
        if (lunchBoxDataBuilder_ == null) {
          lunchBoxData_ = builderForValue.build();
        } else {
          lunchBoxDataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.LunchBoxData lunchBoxData = 14;</code>
       */
      public Builder mergeLunchBoxData(emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData value) {
        if (lunchBoxDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            lunchBoxData_ != null &&
            lunchBoxData_ != emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance()) {
            getLunchBoxDataBuilder().mergeFrom(value);
          } else {
            lunchBoxData_ = value;
          }
        } else {
          lunchBoxDataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.LunchBoxData lunchBoxData = 14;</code>
       */
      public Builder clearLunchBoxData() {
        bitField0_ = (bitField0_ & ~0x00000001);
        lunchBoxData_ = null;
        if (lunchBoxDataBuilder_ != null) {
          lunchBoxDataBuilder_.dispose();
          lunchBoxDataBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.LunchBoxData lunchBoxData = 14;</code>
       */
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder getLunchBoxDataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getLunchBoxDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.LunchBoxData lunchBoxData = 14;</code>
       */
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder() {
        if (lunchBoxDataBuilder_ != null) {
          return lunchBoxDataBuilder_.getMessageOrBuilder();
        } else {
          return lunchBoxData_ == null ?
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : lunchBoxData_;
        }
      }
      /**
       * <code>.LunchBoxData lunchBoxData = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder> 
          getLunchBoxDataFieldBuilder() {
        if (lunchBoxDataBuilder_ == null) {
          lunchBoxDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder>(
                  getLunchBoxData(),
                  getParentForChildren(),
                  isClean());
          lunchBoxData_ = null;
        }
        return lunchBoxDataBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SetUpLunchBoxWidgetReq)
    }

    // @@protoc_insertion_point(class_scope:SetUpLunchBoxWidgetReq)
    private static final emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq();
    }

    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetUpLunchBoxWidgetReq>
        PARSER = new com.google.protobuf.AbstractParser<SetUpLunchBoxWidgetReq>() {
      @java.lang.Override
      public SetUpLunchBoxWidgetReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<SetUpLunchBoxWidgetReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetUpLunchBoxWidgetReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetUpLunchBoxWidgetReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SetUpLunchBoxWidgetReq.proto\032\022LunchBox" +
      "Data.proto\"\237\001\n\026SetUpLunchBoxWidgetReq\022#\n" +
      "\014lunchBoxData\030\016 \001(\0132\r.LunchBoxData\"`\n\013HF" +
      "HLKGOKGOE\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\275!\022\017\n" +
      "\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIA" +
      "BGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.getDescriptor(),
        });
    internal_static_SetUpLunchBoxWidgetReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetUpLunchBoxWidgetReq_descriptor,
        new java.lang.String[] { "LunchBoxData", });
    emu.grasscutter.net.proto.LunchBoxDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
