// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BonusOpActivityInfo.proto

package emu.grasscutter.net.proto;

public final class BonusOpActivityInfoOuterClass {
  private BonusOpActivityInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BonusOpActivityInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BonusOpActivityInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 left_bonus_count = 8;</code>
     * @return The leftBonusCount.
     */
    int getLeftBonusCount();
  }
  /**
   * Protobuf type {@code BonusOpActivityInfo}
   */
  public static final class BonusOpActivityInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BonusOpActivityInfo)
      BonusOpActivityInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BonusOpActivityInfo.newBuilder() to construct.
    private BonusOpActivityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BonusOpActivityInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BonusOpActivityInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.internal_static_BonusOpActivityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.internal_static_BonusOpActivityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.class, emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder.class);
    }

    public static final int LEFT_BONUS_COUNT_FIELD_NUMBER = 8;
    private int leftBonusCount_ = 0;
    /**
     * <code>uint32 left_bonus_count = 8;</code>
     * @return The leftBonusCount.
     */
    @java.lang.Override
    public int getLeftBonusCount() {
      return leftBonusCount_;
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
      if (leftBonusCount_ != 0) {
        output.writeUInt32(8, leftBonusCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (leftBonusCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, leftBonusCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo other = (emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo) obj;

      if (getLeftBonusCount()
          != other.getLeftBonusCount()) return false;
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
      hash = (37 * hash) + LEFT_BONUS_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getLeftBonusCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo prototype) {
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
     * Protobuf type {@code BonusOpActivityInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BonusOpActivityInfo)
        emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.internal_static_BonusOpActivityInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.internal_static_BonusOpActivityInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.class, emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.newBuilder()
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
        leftBonusCount_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.internal_static_BonusOpActivityInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo build() {
        emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo buildPartial() {
        emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo result = new emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.leftBonusCount_ = leftBonusCount_;
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
        if (other instanceof emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo) {
          return mergeFrom((emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo other) {
        if (other == emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance()) return this;
        if (other.getLeftBonusCount() != 0) {
          setLeftBonusCount(other.getLeftBonusCount());
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
                leftBonusCount_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
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

      private int leftBonusCount_ ;
      /**
       * <code>uint32 left_bonus_count = 8;</code>
       * @return The leftBonusCount.
       */
      @java.lang.Override
      public int getLeftBonusCount() {
        return leftBonusCount_;
      }
      /**
       * <code>uint32 left_bonus_count = 8;</code>
       * @param value The leftBonusCount to set.
       * @return This builder for chaining.
       */
      public Builder setLeftBonusCount(int value) {
        
        leftBonusCount_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 left_bonus_count = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftBonusCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        leftBonusCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BonusOpActivityInfo)
    }

    // @@protoc_insertion_point(class_scope:BonusOpActivityInfo)
    private static final emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo();
    }

    public static emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BonusOpActivityInfo>
        PARSER = new com.google.protobuf.AbstractParser<BonusOpActivityInfo>() {
      @java.lang.Override
      public BonusOpActivityInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<BonusOpActivityInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BonusOpActivityInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BonusOpActivityInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BonusOpActivityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031BonusOpActivityInfo.proto\"/\n\023BonusOpAc" +
      "tivityInfo\022\030\n\020left_bonus_count\030\010 \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BonusOpActivityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BonusOpActivityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BonusOpActivityInfo_descriptor,
        new java.lang.String[] { "LeftBonusCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
