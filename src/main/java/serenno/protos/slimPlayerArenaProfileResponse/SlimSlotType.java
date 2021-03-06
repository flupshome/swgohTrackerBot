// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlimPlayerArenaProfileResponse.proto

package serenno.protos.slimPlayerArenaProfileResponse;

/**
 * Protobuf enum {@code serenno.protos.slimPlayerArenaProfileResponse.SlimSlotType}
 */
public enum SlimSlotType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SlotTypeNONE = 0;</code>
   */
  SlotTypeNONE(0),
  /**
   * <code>UNIT = 1;</code>
   */
  UNIT(1),
  /**
   * <code>LEADER = 2;</code>
   */
  LEADER(2),
  /**
   * <code>CAPITAL_SHIP = 3;</code>
   */
  CAPITAL_SHIP(3),
  /**
   * <code>REINFORCMENT = 5;</code>
   */
  REINFORCMENT(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SlotTypeNONE = 0;</code>
   */
  public static final int SlotTypeNONE_VALUE = 0;
  /**
   * <code>UNIT = 1;</code>
   */
  public static final int UNIT_VALUE = 1;
  /**
   * <code>LEADER = 2;</code>
   */
  public static final int LEADER_VALUE = 2;
  /**
   * <code>CAPITAL_SHIP = 3;</code>
   */
  public static final int CAPITAL_SHIP_VALUE = 3;
  /**
   * <code>REINFORCMENT = 5;</code>
   */
  public static final int REINFORCMENT_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static SlimSlotType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SlimSlotType forNumber(int value) {
    switch (value) {
      case 0: return SlotTypeNONE;
      case 1: return UNIT;
      case 2: return LEADER;
      case 3: return CAPITAL_SHIP;
      case 5: return REINFORCMENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SlimSlotType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SlimSlotType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SlimSlotType>() {
          public SlimSlotType findValueByNumber(int number) {
            return SlimSlotType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return SlimPlayerArenaProfileResponseOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final SlimSlotType[] VALUES = values();

  public static SlimSlotType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SlimSlotType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:serenno.protos.slimPlayerArenaProfileResponse.SlimSlotType)
}

