// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeV2DungeonStageInfo.proto

package emu.grasscutter.net.proto;

public final class SummerTimeV2DungeonStageInfoOuterClass {
  private SummerTimeV2DungeonStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeV2DungeonStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeV2DungeonStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isPrevDungeonSucceed = 4;</code>
     * @return The isPrevDungeonSucceed.
     */
    boolean getIsPrevDungeonSucceed();

    /**
     * <code>bool isOpen = 14;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 openTime = 13;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>uint32 stageId = 6;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * Protobuf type {@code SummerTimeV2DungeonStageInfo}
   */
  public static final class SummerTimeV2DungeonStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeV2DungeonStageInfo)
      SummerTimeV2DungeonStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeV2DungeonStageInfo.newBuilder() to construct.
    private SummerTimeV2DungeonStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeV2DungeonStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeV2DungeonStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.internal_static_SummerTimeV2DungeonStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.internal_static_SummerTimeV2DungeonStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo.class, emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo.Builder.class);
    }

    public static final int ISPREVDUNGEONSUCCEED_FIELD_NUMBER = 4;
    private boolean isPrevDungeonSucceed_ = false;
    /**
     * <code>bool isPrevDungeonSucceed = 4;</code>
     * @return The isPrevDungeonSucceed.
     */
    @java.lang.Override
    public boolean getIsPrevDungeonSucceed() {
      return isPrevDungeonSucceed_;
    }

    public static final int ISOPEN_FIELD_NUMBER = 14;
    private boolean isOpen_ = false;
    /**
     * <code>bool isOpen = 14;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int OPENTIME_FIELD_NUMBER = 13;
    private int openTime_ = 0;
    /**
     * <code>uint32 openTime = 13;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int STAGEID_FIELD_NUMBER = 6;
    private int stageId_ = 0;
    /**
     * <code>uint32 stageId = 6;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (isPrevDungeonSucceed_ != false) {
        output.writeBool(4, isPrevDungeonSucceed_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(6, stageId_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(13, openTime_);
      }
      if (isOpen_ != false) {
        output.writeBool(14, isOpen_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isPrevDungeonSucceed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isPrevDungeonSucceed_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, stageId_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, openTime_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo other = (emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo) obj;

      if (getIsPrevDungeonSucceed()
          != other.getIsPrevDungeonSucceed()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + ISPREVDUNGEONSUCCEED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPrevDungeonSucceed());
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + OPENTIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo prototype) {
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
     * Protobuf type {@code SummerTimeV2DungeonStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeV2DungeonStageInfo)
        emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.internal_static_SummerTimeV2DungeonStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.internal_static_SummerTimeV2DungeonStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo.class, emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo.newBuilder()
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
        isPrevDungeonSucceed_ = false;
        isOpen_ = false;
        openTime_ = 0;
        stageId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.internal_static_SummerTimeV2DungeonStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo build() {
        emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo buildPartial() {
        emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo result = new emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isPrevDungeonSucceed_ = isPrevDungeonSucceed_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.openTime_ = openTime_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.stageId_ = stageId_;
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
        if (other instanceof emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo other) {
        if (other == emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo.getDefaultInstance()) return this;
        if (other.getIsPrevDungeonSucceed() != false) {
          setIsPrevDungeonSucceed(other.getIsPrevDungeonSucceed());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
              case 32: {
                isPrevDungeonSucceed_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 48: {
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
              case 104: {
                openTime_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 104
              case 112: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private boolean isPrevDungeonSucceed_ ;
      /**
       * <code>bool isPrevDungeonSucceed = 4;</code>
       * @return The isPrevDungeonSucceed.
       */
      @java.lang.Override
      public boolean getIsPrevDungeonSucceed() {
        return isPrevDungeonSucceed_;
      }
      /**
       * <code>bool isPrevDungeonSucceed = 4;</code>
       * @param value The isPrevDungeonSucceed to set.
       * @return This builder for chaining.
       */
      public Builder setIsPrevDungeonSucceed(boolean value) {
        
        isPrevDungeonSucceed_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool isPrevDungeonSucceed = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPrevDungeonSucceed() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isPrevDungeonSucceed_ = false;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool isOpen = 14;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool isOpen = 14;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOpen = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 openTime = 13;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 openTime = 13;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 openTime = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        openTime_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 6;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 6;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        stageId_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeV2DungeonStageInfo)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeV2DungeonStageInfo)
    private static final emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo();
    }

    public static emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeV2DungeonStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeV2DungeonStageInfo>() {
      @java.lang.Override
      public SummerTimeV2DungeonStageInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SummerTimeV2DungeonStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeV2DungeonStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SummerTimeV2DungeonStageInfoOuterClass.SummerTimeV2DungeonStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeV2DungeonStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeV2DungeonStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"SummerTimeV2DungeonStageInfo.proto\"o\n\034" +
      "SummerTimeV2DungeonStageInfo\022\034\n\024isPrevDu" +
      "ngeonSucceed\030\004 \001(\010\022\016\n\006isOpen\030\016 \001(\010\022\020\n\010op" +
      "enTime\030\r \001(\r\022\017\n\007stageId\030\006 \001(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SummerTimeV2DungeonStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeV2DungeonStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeV2DungeonStageInfo_descriptor,
        new java.lang.String[] { "IsPrevDungeonSucceed", "IsOpen", "OpenTime", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
