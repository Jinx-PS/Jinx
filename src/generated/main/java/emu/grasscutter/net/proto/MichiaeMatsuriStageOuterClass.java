// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MichiaeMatsuriStage.proto

package emu.grasscutter.net.proto;

public final class MichiaeMatsuriStageOuterClass {
  private MichiaeMatsuriStageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MichiaeMatsuriStageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MichiaeMatsuriStage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isOpen = 8;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 stageId = 11;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 openTime = 13;</code>
     * @return The openTime.
     */
    int getOpenTime();
  }
  /**
   * Protobuf type {@code MichiaeMatsuriStage}
   */
  public static final class MichiaeMatsuriStage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MichiaeMatsuriStage)
      MichiaeMatsuriStageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MichiaeMatsuriStage.newBuilder() to construct.
    private MichiaeMatsuriStage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MichiaeMatsuriStage() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MichiaeMatsuriStage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.internal_static_MichiaeMatsuriStage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.internal_static_MichiaeMatsuriStage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage.class, emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage.Builder.class);
    }

    public static final int ISOPEN_FIELD_NUMBER = 8;
    private boolean isOpen_ = false;
    /**
     * <code>bool isOpen = 8;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int STAGEID_FIELD_NUMBER = 11;
    private int stageId_ = 0;
    /**
     * <code>uint32 stageId = 11;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (isOpen_ != false) {
        output.writeBool(8, isOpen_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(11, stageId_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(13, openTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isOpen_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, stageId_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, openTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage other = (emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
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
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + OPENTIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage prototype) {
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
     * Protobuf type {@code MichiaeMatsuriStage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MichiaeMatsuriStage)
        emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.internal_static_MichiaeMatsuriStage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.internal_static_MichiaeMatsuriStage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage.class, emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage.newBuilder()
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
        isOpen_ = false;
        stageId_ = 0;
        openTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.internal_static_MichiaeMatsuriStage_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage build() {
        emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage buildPartial() {
        emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage result = new emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.stageId_ = stageId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.openTime_ = openTime_;
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
        if (other instanceof emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage) {
          return mergeFrom((emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage other) {
        if (other == emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
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
              case 64: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 88: {
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 104: {
                openTime_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 104
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

      private boolean isOpen_ ;
      /**
       * <code>bool isOpen = 8;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool isOpen = 8;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOpen = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 11;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 11;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MichiaeMatsuriStage)
    }

    // @@protoc_insertion_point(class_scope:MichiaeMatsuriStage)
    private static final emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage();
    }

    public static emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MichiaeMatsuriStage>
        PARSER = new com.google.protobuf.AbstractParser<MichiaeMatsuriStage>() {
      @java.lang.Override
      public MichiaeMatsuriStage parsePartialFrom(
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

    public static com.google.protobuf.Parser<MichiaeMatsuriStage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MichiaeMatsuriStage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MichiaeMatsuriStageOuterClass.MichiaeMatsuriStage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MichiaeMatsuriStage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MichiaeMatsuriStage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031MichiaeMatsuriStage.proto\"H\n\023MichiaeMa" +
      "tsuriStage\022\016\n\006isOpen\030\010 \001(\010\022\017\n\007stageId\030\013 " +
      "\001(\r\022\020\n\010openTime\030\r \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MichiaeMatsuriStage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MichiaeMatsuriStage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MichiaeMatsuriStage_descriptor,
        new java.lang.String[] { "IsOpen", "StageId", "OpenTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
