// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarPropChangeReasonNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarPropChangeReasonNotifyOuterClass {
  private AvatarPropChangeReasonNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarPropChangeReasonNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarPropChangeReasonNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float curValue = 2;</code>
     * @return The curValue.
     */
    float getCurValue();

    /**
     * <code>uint32 propType = 10;</code>
     * @return The propType.
     */
    int getPropType();

    /**
     * <code>float oldValue = 4;</code>
     * @return The oldValue.
     */
    float getOldValue();

    /**
     * <code>.PropChangeReason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.PropChangeReason reason = 5;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason getReason();

    /**
     * <code>uint64 avatarGuid = 12;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * Protobuf type {@code AvatarPropChangeReasonNotify}
   */
  public static final class AvatarPropChangeReasonNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarPropChangeReasonNotify)
      AvatarPropChangeReasonNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarPropChangeReasonNotify.newBuilder() to construct.
    private AvatarPropChangeReasonNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarPropChangeReasonNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarPropChangeReasonNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.internal_static_AvatarPropChangeReasonNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.internal_static_AvatarPropChangeReasonNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.class, emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code AvatarPropChangeReasonNotify.MNCBONEOPGK}
     */
    public enum MNCBONEOPGK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1262;</code>
       */
      PEPPOHPHJOJ(1, 1262),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MNCBONEOPGK DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1262;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1262;
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
      public static MNCBONEOPGK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MNCBONEOPGK forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1262: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MNCBONEOPGK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MNCBONEOPGK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MNCBONEOPGK>() {
              public MNCBONEOPGK findValueByNumber(int number) {
                return MNCBONEOPGK.forNumber(number);
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
        return emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final MNCBONEOPGK[] VALUES = getStaticValuesArray();
      private static MNCBONEOPGK[] getStaticValuesArray() {
        return new MNCBONEOPGK[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static MNCBONEOPGK valueOf(
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

      private MNCBONEOPGK(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AvatarPropChangeReasonNotify.MNCBONEOPGK)
    }

    public static final int CURVALUE_FIELD_NUMBER = 2;
    private float curValue_ = 0F;
    /**
     * <code>float curValue = 2;</code>
     * @return The curValue.
     */
    @java.lang.Override
    public float getCurValue() {
      return curValue_;
    }

    public static final int PROPTYPE_FIELD_NUMBER = 10;
    private int propType_ = 0;
    /**
     * <code>uint32 propType = 10;</code>
     * @return The propType.
     */
    @java.lang.Override
    public int getPropType() {
      return propType_;
    }

    public static final int OLDVALUE_FIELD_NUMBER = 4;
    private float oldValue_ = 0F;
    /**
     * <code>float oldValue = 4;</code>
     * @return The oldValue.
     */
    @java.lang.Override
    public float getOldValue() {
      return oldValue_;
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private int reason_ = 0;
    /**
     * <code>.PropChangeReason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.PropChangeReason reason = 5;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason getReason() {
      emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason result = emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.forNumber(reason_);
      return result == null ? emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
    }

    public static final int AVATARGUID_FIELD_NUMBER = 12;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatarGuid = 12;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (java.lang.Float.floatToRawIntBits(curValue_) != 0) {
        output.writeFloat(2, curValue_);
      }
      if (java.lang.Float.floatToRawIntBits(oldValue_) != 0) {
        output.writeFloat(4, oldValue_);
      }
      if (reason_ != emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
        output.writeEnum(5, reason_);
      }
      if (propType_ != 0) {
        output.writeUInt32(10, propType_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(12, avatarGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(curValue_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, curValue_);
      }
      if (java.lang.Float.floatToRawIntBits(oldValue_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, oldValue_);
      }
      if (reason_ != emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, reason_);
      }
      if (propType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, propType_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, avatarGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify other = (emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify) obj;

      if (java.lang.Float.floatToIntBits(getCurValue())
          != java.lang.Float.floatToIntBits(
              other.getCurValue())) return false;
      if (getPropType()
          != other.getPropType()) return false;
      if (java.lang.Float.floatToIntBits(getOldValue())
          != java.lang.Float.floatToIntBits(
              other.getOldValue())) return false;
      if (reason_ != other.reason_) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      hash = (37 * hash) + CURVALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCurValue());
      hash = (37 * hash) + PROPTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPropType();
      hash = (37 * hash) + OLDVALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getOldValue());
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + AVATARGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify prototype) {
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
     * Protobuf type {@code AvatarPropChangeReasonNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarPropChangeReasonNotify)
        emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.internal_static_AvatarPropChangeReasonNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.internal_static_AvatarPropChangeReasonNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.class, emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.newBuilder()
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
        curValue_ = 0F;
        propType_ = 0;
        oldValue_ = 0F;
        reason_ = 0;
        avatarGuid_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.internal_static_AvatarPropChangeReasonNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify build() {
        emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify result = new emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.curValue_ = curValue_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.propType_ = propType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.oldValue_ = oldValue_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.reason_ = reason_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.getDefaultInstance()) return this;
        if (other.getCurValue() != 0F) {
          setCurValue(other.getCurValue());
        }
        if (other.getPropType() != 0) {
          setPropType(other.getPropType());
        }
        if (other.getOldValue() != 0F) {
          setOldValue(other.getOldValue());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
              case 21: {
                curValue_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 21
              case 37: {
                oldValue_ = input.readFloat();
                bitField0_ |= 0x00000004;
                break;
              } // case 37
              case 40: {
                reason_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 40
              case 80: {
                propType_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 96: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 96
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

      private float curValue_ ;
      /**
       * <code>float curValue = 2;</code>
       * @return The curValue.
       */
      @java.lang.Override
      public float getCurValue() {
        return curValue_;
      }
      /**
       * <code>float curValue = 2;</code>
       * @param value The curValue to set.
       * @return This builder for chaining.
       */
      public Builder setCurValue(float value) {
        
        curValue_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>float curValue = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurValue() {
        bitField0_ = (bitField0_ & ~0x00000001);
        curValue_ = 0F;
        onChanged();
        return this;
      }

      private int propType_ ;
      /**
       * <code>uint32 propType = 10;</code>
       * @return The propType.
       */
      @java.lang.Override
      public int getPropType() {
        return propType_;
      }
      /**
       * <code>uint32 propType = 10;</code>
       * @param value The propType to set.
       * @return This builder for chaining.
       */
      public Builder setPropType(int value) {
        
        propType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 propType = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPropType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        propType_ = 0;
        onChanged();
        return this;
      }

      private float oldValue_ ;
      /**
       * <code>float oldValue = 4;</code>
       * @return The oldValue.
       */
      @java.lang.Override
      public float getOldValue() {
        return oldValue_;
      }
      /**
       * <code>float oldValue = 4;</code>
       * @param value The oldValue to set.
       * @return This builder for chaining.
       */
      public Builder setOldValue(float value) {
        
        oldValue_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>float oldValue = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearOldValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        oldValue_ = 0F;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.PropChangeReason reason = 5;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.PropChangeReason reason = 5;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        reason_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.PropChangeReason reason = 5;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason getReason() {
        emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason result = emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.forNumber(reason_);
        return result == null ? emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.PropChangeReason reason = 5;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PropChangeReason reason = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000008);
        reason_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatarGuid = 12;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatarGuid = 12;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatarGuid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000010);
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AvatarPropChangeReasonNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarPropChangeReasonNotify)
    private static final emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify();
    }

    public static emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarPropChangeReasonNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarPropChangeReasonNotify>() {
      @java.lang.Override
      public AvatarPropChangeReasonNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarPropChangeReasonNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarPropChangeReasonNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarPropChangeReasonNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarPropChangeReasonNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"AvatarPropChangeReasonNotify.proto\032\026Pr" +
      "opChangeReason.proto\"\334\001\n\034AvatarPropChang" +
      "eReasonNotify\022\020\n\010curValue\030\002 \001(\002\022\020\n\010propT" +
      "ype\030\n \001(\r\022\020\n\010oldValue\030\004 \001(\002\022!\n\006reason\030\005 " +
      "\001(\0162\021.PropChangeReason\022\022\n\navatarGuid\030\014 \001" +
      "(\004\"O\n\013MNCBONEOPGK\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJ" +
      "OJ\020\356\t\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032" +
      "\002\020\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PropChangeReasonOuterClass.getDescriptor(),
        });
    internal_static_AvatarPropChangeReasonNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarPropChangeReasonNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarPropChangeReasonNotify_descriptor,
        new java.lang.String[] { "CurValue", "PropType", "OldValue", "Reason", "AvatarGuid", });
    emu.grasscutter.net.proto.PropChangeReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
