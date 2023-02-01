// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IslandPartyStageData.proto

package emu.grasscutter.net.proto;

public final class IslandPartyStageDataOuterClass {
  private IslandPartyStageDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IslandPartyStageDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IslandPartyStageData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 bestScore = 5;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>uint32 stageId = 2;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool isOpen = 1;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code IslandPartyStageData}
   */
  public static final class IslandPartyStageData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IslandPartyStageData)
      IslandPartyStageDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IslandPartyStageData.newBuilder() to construct.
    private IslandPartyStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IslandPartyStageData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IslandPartyStageData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.internal_static_IslandPartyStageData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.internal_static_IslandPartyStageData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.class, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder.class);
    }

    public static final int BESTSCORE_FIELD_NUMBER = 5;
    private int bestScore_ = 0;
    /**
     * <code>uint32 bestScore = 5;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int STAGEID_FIELD_NUMBER = 2;
    private int stageId_ = 0;
    /**
     * <code>uint32 stageId = 2;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int ISOPEN_FIELD_NUMBER = 1;
    private boolean isOpen_ = false;
    /**
     * <code>bool isOpen = 1;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
        output.writeBool(1, isOpen_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(2, stageId_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(5, bestScore_);
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
          .computeBoolSize(1, isOpen_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, stageId_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, bestScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData other = (emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData) obj;

      if (getBestScore()
          != other.getBestScore()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + BESTSCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData prototype) {
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
     * Protobuf type {@code IslandPartyStageData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IslandPartyStageData)
        emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.internal_static_IslandPartyStageData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.internal_static_IslandPartyStageData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.class, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.newBuilder()
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
        bestScore_ = 0;
        stageId_ = 0;
        isOpen_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.internal_static_IslandPartyStageData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData build() {
        emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData buildPartial() {
        emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData result = new emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.bestScore_ = bestScore_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.stageId_ = stageId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData) {
          return mergeFrom((emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData other) {
        if (other == emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.getDefaultInstance()) return this;
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
              case 8: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 16: {
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 40: {
                bestScore_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
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

      private int bestScore_ ;
      /**
       * <code>uint32 bestScore = 5;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 bestScore = 5;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bestScore = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        bitField0_ = (bitField0_ & ~0x00000001);
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 2;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 2;</code>
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
       * <code>uint32 stageId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool isOpen = 1;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool isOpen = 1;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOpen = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:IslandPartyStageData)
    }

    // @@protoc_insertion_point(class_scope:IslandPartyStageData)
    private static final emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData();
    }

    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IslandPartyStageData>
        PARSER = new com.google.protobuf.AbstractParser<IslandPartyStageData>() {
      @java.lang.Override
      public IslandPartyStageData parsePartialFrom(
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

    public static com.google.protobuf.Parser<IslandPartyStageData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IslandPartyStageData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IslandPartyStageData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IslandPartyStageData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032IslandPartyStageData.proto\"J\n\024IslandPa" +
      "rtyStageData\022\021\n\tbestScore\030\005 \001(\r\022\017\n\007stage" +
      "Id\030\002 \001(\r\022\016\n\006isOpen\030\001 \001(\010B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IslandPartyStageData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IslandPartyStageData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IslandPartyStageData_descriptor,
        new java.lang.String[] { "BestScore", "StageId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
