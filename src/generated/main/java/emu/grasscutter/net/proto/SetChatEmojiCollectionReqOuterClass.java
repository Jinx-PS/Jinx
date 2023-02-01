// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetChatEmojiCollectionReq.proto

package emu.grasscutter.net.proto;

public final class SetChatEmojiCollectionReqOuterClass {
  private SetChatEmojiCollectionReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetChatEmojiCollectionReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetChatEmojiCollectionReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
     * @return Whether the chatEmojiCollectionData field is set.
     */
    boolean hasChatEmojiCollectionData();
    /**
     * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
     * @return The chatEmojiCollectionData.
     */
    emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData getChatEmojiCollectionData();
    /**
     * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
     */
    emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder getChatEmojiCollectionDataOrBuilder();
  }
  /**
   * Protobuf type {@code SetChatEmojiCollectionReq}
   */
  public static final class SetChatEmojiCollectionReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetChatEmojiCollectionReq)
      SetChatEmojiCollectionReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetChatEmojiCollectionReq.newBuilder() to construct.
    private SetChatEmojiCollectionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetChatEmojiCollectionReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetChatEmojiCollectionReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.internal_static_SetChatEmojiCollectionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.internal_static_SetChatEmojiCollectionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq.class, emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq.Builder.class);
    }

    /**
     * Protobuf enum {@code SetChatEmojiCollectionReq.AMDGEFGHKLC}
     */
    public enum AMDGEFGHKLC
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4060;</code>
       */
      PEPPOHPHJOJ(1, 4060),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final AMDGEFGHKLC DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final AMDGEFGHKLC EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4060;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4060;
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
      public static AMDGEFGHKLC valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static AMDGEFGHKLC forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4060: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<AMDGEFGHKLC>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          AMDGEFGHKLC> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AMDGEFGHKLC>() {
              public AMDGEFGHKLC findValueByNumber(int number) {
                return AMDGEFGHKLC.forNumber(number);
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
        return emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final AMDGEFGHKLC[] VALUES = getStaticValuesArray();
      private static AMDGEFGHKLC[] getStaticValuesArray() {
        return new AMDGEFGHKLC[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static AMDGEFGHKLC valueOf(
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

      private AMDGEFGHKLC(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SetChatEmojiCollectionReq.AMDGEFGHKLC)
    }

    public static final int CHATEMOJICOLLECTIONDATA_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData chatEmojiCollectionData_;
    /**
     * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
     * @return Whether the chatEmojiCollectionData field is set.
     */
    @java.lang.Override
    public boolean hasChatEmojiCollectionData() {
      return chatEmojiCollectionData_ != null;
    }
    /**
     * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
     * @return The chatEmojiCollectionData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData getChatEmojiCollectionData() {
      return chatEmojiCollectionData_ == null ? emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : chatEmojiCollectionData_;
    }
    /**
     * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder getChatEmojiCollectionDataOrBuilder() {
      return chatEmojiCollectionData_ == null ? emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : chatEmojiCollectionData_;
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
      if (chatEmojiCollectionData_ != null) {
        output.writeMessage(11, getChatEmojiCollectionData());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chatEmojiCollectionData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getChatEmojiCollectionData());
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq other = (emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq) obj;

      if (hasChatEmojiCollectionData() != other.hasChatEmojiCollectionData()) return false;
      if (hasChatEmojiCollectionData()) {
        if (!getChatEmojiCollectionData()
            .equals(other.getChatEmojiCollectionData())) return false;
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
      if (hasChatEmojiCollectionData()) {
        hash = (37 * hash) + CHATEMOJICOLLECTIONDATA_FIELD_NUMBER;
        hash = (53 * hash) + getChatEmojiCollectionData().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq prototype) {
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
     * Protobuf type {@code SetChatEmojiCollectionReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetChatEmojiCollectionReq)
        emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.internal_static_SetChatEmojiCollectionReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.internal_static_SetChatEmojiCollectionReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq.class, emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq.newBuilder()
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
        chatEmojiCollectionData_ = null;
        if (chatEmojiCollectionDataBuilder_ != null) {
          chatEmojiCollectionDataBuilder_.dispose();
          chatEmojiCollectionDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.internal_static_SetChatEmojiCollectionReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq build() {
        emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq buildPartial() {
        emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq result = new emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.chatEmojiCollectionData_ = chatEmojiCollectionDataBuilder_ == null
              ? chatEmojiCollectionData_
              : chatEmojiCollectionDataBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq other) {
        if (other == emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq.getDefaultInstance()) return this;
        if (other.hasChatEmojiCollectionData()) {
          mergeChatEmojiCollectionData(other.getChatEmojiCollectionData());
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
                input.readMessage(
                    getChatEmojiCollectionDataFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
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

      private emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData chatEmojiCollectionData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData, emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder, emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder> chatEmojiCollectionDataBuilder_;
      /**
       * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
       * @return Whether the chatEmojiCollectionData field is set.
       */
      public boolean hasChatEmojiCollectionData() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
       * @return The chatEmojiCollectionData.
       */
      public emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData getChatEmojiCollectionData() {
        if (chatEmojiCollectionDataBuilder_ == null) {
          return chatEmojiCollectionData_ == null ? emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : chatEmojiCollectionData_;
        } else {
          return chatEmojiCollectionDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
       */
      public Builder setChatEmojiCollectionData(emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData value) {
        if (chatEmojiCollectionDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          chatEmojiCollectionData_ = value;
        } else {
          chatEmojiCollectionDataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
       */
      public Builder setChatEmojiCollectionData(
          emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder builderForValue) {
        if (chatEmojiCollectionDataBuilder_ == null) {
          chatEmojiCollectionData_ = builderForValue.build();
        } else {
          chatEmojiCollectionDataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
       */
      public Builder mergeChatEmojiCollectionData(emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData value) {
        if (chatEmojiCollectionDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            chatEmojiCollectionData_ != null &&
            chatEmojiCollectionData_ != emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance()) {
            getChatEmojiCollectionDataBuilder().mergeFrom(value);
          } else {
            chatEmojiCollectionData_ = value;
          }
        } else {
          chatEmojiCollectionDataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
       */
      public Builder clearChatEmojiCollectionData() {
        bitField0_ = (bitField0_ & ~0x00000001);
        chatEmojiCollectionData_ = null;
        if (chatEmojiCollectionDataBuilder_ != null) {
          chatEmojiCollectionDataBuilder_.dispose();
          chatEmojiCollectionDataBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
       */
      public emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder getChatEmojiCollectionDataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getChatEmojiCollectionDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
       */
      public emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder getChatEmojiCollectionDataOrBuilder() {
        if (chatEmojiCollectionDataBuilder_ != null) {
          return chatEmojiCollectionDataBuilder_.getMessageOrBuilder();
        } else {
          return chatEmojiCollectionData_ == null ?
              emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : chatEmojiCollectionData_;
        }
      }
      /**
       * <code>.ChatEmojiCollectionData chatEmojiCollectionData = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData, emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder, emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder> 
          getChatEmojiCollectionDataFieldBuilder() {
        if (chatEmojiCollectionDataBuilder_ == null) {
          chatEmojiCollectionDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData, emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder, emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder>(
                  getChatEmojiCollectionData(),
                  getParentForChildren(),
                  isClean());
          chatEmojiCollectionData_ = null;
        }
        return chatEmojiCollectionDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SetChatEmojiCollectionReq)
    }

    // @@protoc_insertion_point(class_scope:SetChatEmojiCollectionReq)
    private static final emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq();
    }

    public static emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetChatEmojiCollectionReq>
        PARSER = new com.google.protobuf.AbstractParser<SetChatEmojiCollectionReq>() {
      @java.lang.Override
      public SetChatEmojiCollectionReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SetChatEmojiCollectionReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetChatEmojiCollectionReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetChatEmojiCollectionReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetChatEmojiCollectionReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037SetChatEmojiCollectionReq.proto\032\035ChatE" +
      "mojiCollectionData.proto\"\270\001\n\031SetChatEmoj" +
      "iCollectionReq\0229\n\027chatEmojiCollectionDat" +
      "a\030\013 \001(\0132\030.ChatEmojiCollectionData\"`\n\013AMD" +
      "GEFGHKLC\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\334\037\022\017\n\013" +
      "DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIAB" +
      "GAOCI\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.getDescriptor(),
        });
    internal_static_SetChatEmojiCollectionReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetChatEmojiCollectionReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetChatEmojiCollectionReq_descriptor,
        new java.lang.String[] { "ChatEmojiCollectionData", });
    emu.grasscutter.net.proto.ChatEmojiCollectionDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
