// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayerInfoNotify.proto

package emu.grasscutter.net.proto;

public final class ScenePlayerInfoNotifyOuterClass {
  private ScenePlayerInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayerInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayerInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> 
        getPlayerInfoListList();
    /**
     * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
     */
    emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo getPlayerInfoList(int index);
    /**
     * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
     */
    int getPlayerInfoListCount();
    /**
     * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> 
        getPlayerInfoListOrBuilderList();
    /**
     * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
     */
    emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder getPlayerInfoListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ScenePlayerInfoNotify}
   */
  public static final class ScenePlayerInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayerInfoNotify)
      ScenePlayerInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayerInfoNotify.newBuilder() to construct.
    private ScenePlayerInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayerInfoNotify() {
      playerInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayerInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.class, emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code ScenePlayerInfoNotify.IOKKMFKCAAI}
     */
    public enum IOKKMFKCAAI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 264;</code>
       */
      PEPPOHPHJOJ(1, 264),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final IOKKMFKCAAI DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 264;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 264;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


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
      public static IOKKMFKCAAI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static IOKKMFKCAAI forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 264: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<IOKKMFKCAAI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          IOKKMFKCAAI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<IOKKMFKCAAI>() {
              public IOKKMFKCAAI findValueByNumber(int number) {
                return IOKKMFKCAAI.forNumber(number);
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
        return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final IOKKMFKCAAI[] VALUES = getStaticValuesArray();
      private static IOKKMFKCAAI[] getStaticValuesArray() {
        return new IOKKMFKCAAI[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static IOKKMFKCAAI valueOf(
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

      private IOKKMFKCAAI(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ScenePlayerInfoNotify.IOKKMFKCAAI)
    }

    public static final int PLAYERINFOLIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> playerInfoList_;
    /**
     * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> getPlayerInfoListList() {
      return playerInfoList_;
    }
    /**
     * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> 
        getPlayerInfoListOrBuilderList() {
      return playerInfoList_;
    }
    /**
     * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
     */
    @java.lang.Override
    public int getPlayerInfoListCount() {
      return playerInfoList_.size();
    }
    /**
     * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo getPlayerInfoList(int index) {
      return playerInfoList_.get(index);
    }
    /**
     * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder getPlayerInfoListOrBuilder(
        int index) {
      return playerInfoList_.get(index);
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
      for (int i = 0; i < playerInfoList_.size(); i++) {
        output.writeMessage(11, playerInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < playerInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, playerInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify other = (emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify) obj;

      if (!getPlayerInfoListList()
          .equals(other.getPlayerInfoListList())) return false;
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
      if (getPlayerInfoListCount() > 0) {
        hash = (37 * hash) + PLAYERINFOLIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify prototype) {
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
     * Protobuf type {@code ScenePlayerInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayerInfoNotify)
        emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.class, emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.newBuilder()
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
        if (playerInfoListBuilder_ == null) {
          playerInfoList_ = java.util.Collections.emptyList();
        } else {
          playerInfoList_ = null;
          playerInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify build() {
        emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify buildPartial() {
        emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify result = new emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify result) {
        if (playerInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerInfoList_ = java.util.Collections.unmodifiableList(playerInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerInfoList_ = playerInfoList_;
        } else {
          result.playerInfoList_ = playerInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify other) {
        if (other == emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.getDefaultInstance()) return this;
        if (playerInfoListBuilder_ == null) {
          if (!other.playerInfoList_.isEmpty()) {
            if (playerInfoList_.isEmpty()) {
              playerInfoList_ = other.playerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerInfoListIsMutable();
              playerInfoList_.addAll(other.playerInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.playerInfoList_.isEmpty()) {
            if (playerInfoListBuilder_.isEmpty()) {
              playerInfoListBuilder_.dispose();
              playerInfoListBuilder_ = null;
              playerInfoList_ = other.playerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerInfoListFieldBuilder() : null;
            } else {
              playerInfoListBuilder_.addAllMessages(other.playerInfoList_);
            }
          }
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
              case 90: {
                emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.parser(),
                        extensionRegistry);
                if (playerInfoListBuilder_ == null) {
                  ensurePlayerInfoListIsMutable();
                  playerInfoList_.add(m);
                } else {
                  playerInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 90
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

      private java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> playerInfoList_ =
        java.util.Collections.emptyList();
      private void ensurePlayerInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo>(playerInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> playerInfoListBuilder_;

      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> getPlayerInfoListList() {
        if (playerInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerInfoList_);
        } else {
          return playerInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public int getPlayerInfoListCount() {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.size();
        } else {
          return playerInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo getPlayerInfoList(int index) {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.get(index);
        } else {
          return playerInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public Builder setPlayerInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.set(index, value);
          onChanged();
        } else {
          playerInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public Builder setPlayerInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public Builder addPlayerInfoList(emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(value);
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public Builder addPlayerInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(index, value);
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public Builder addPlayerInfoList(
          emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public Builder addPlayerInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public Builder addAllPlayerInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> values) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerInfoList_);
          onChanged();
        } else {
          playerInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public Builder clearPlayerInfoList() {
        if (playerInfoListBuilder_ == null) {
          playerInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public Builder removePlayerInfoList(int index) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.remove(index);
          onChanged();
        } else {
          playerInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder getPlayerInfoListBuilder(
          int index) {
        return getPlayerInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder getPlayerInfoListOrBuilder(
          int index) {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.get(index);  } else {
          return playerInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> 
           getPlayerInfoListOrBuilderList() {
        if (playerInfoListBuilder_ != null) {
          return playerInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerInfoList_);
        }
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder addPlayerInfoListBuilder() {
        return getPlayerInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder addPlayerInfoListBuilder(
          int index) {
        return getPlayerInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ScenePlayerInfo playerInfoList = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder> 
           getPlayerInfoListBuilderList() {
        return getPlayerInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> 
          getPlayerInfoListFieldBuilder() {
        if (playerInfoListBuilder_ == null) {
          playerInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder>(
                  playerInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerInfoList_ = null;
        }
        return playerInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayerInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayerInfoNotify)
    private static final emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify();
    }

    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayerInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayerInfoNotify>() {
      @java.lang.Override
      public ScenePlayerInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ScenePlayerInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayerInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayerInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayerInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ScenePlayerInfoNotify.proto\032\025ScenePlay" +
      "erInfo.proto\"\222\001\n\025ScenePlayerInfoNotify\022(" +
      "\n\016playerInfoList\030\013 \003(\0132\020.ScenePlayerInfo" +
      "\"O\n\013IOKKMFKCAAI\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ" +
      "\020\210\002\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020" +
      "\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_ScenePlayerInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayerInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayerInfoNotify_descriptor,
        new java.lang.String[] { "PlayerInfoList", });
    emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
