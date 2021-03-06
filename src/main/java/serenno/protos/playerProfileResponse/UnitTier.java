// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerProfileResponse.proto

package serenno.protos.playerProfileResponse;

/**
 * Protobuf enum {@code serenno.protos.playerProfileResponse.UnitTier}
 */
public enum UnitTier
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TIER_00 = 0;</code>
   */
  TIER_00(0),
  /**
   * <code>TIER_01 = 1;</code>
   */
  TIER_01(1),
  /**
   * <code>TIER_02 = 2;</code>
   */
  TIER_02(2),
  /**
   * <code>TIER_03 = 3;</code>
   */
  TIER_03(3),
  /**
   * <code>TIER_04 = 4;</code>
   */
  TIER_04(4),
  /**
   * <code>TIER_05 = 5;</code>
   */
  TIER_05(5),
  /**
   * <code>TIER_06 = 6;</code>
   */
  TIER_06(6),
  /**
   * <code>TIER_07 = 7;</code>
   */
  TIER_07(7),
  /**
   * <code>TIER_08 = 8;</code>
   */
  TIER_08(8),
  /**
   * <code>TIER_09 = 9;</code>
   */
  TIER_09(9),
  /**
   * <code>TIER_10 = 10;</code>
   */
  TIER_10(10),
  /**
   * <code>TIER_11 = 11;</code>
   */
  TIER_11(11),
  /**
   * <code>TIER_12 = 12;</code>
   */
  TIER_12(12),
  /**
   * <code>TIER_13 = 13;</code>
   */
  TIER_13(13),
  /**
   * <code>TIER_14 = 14;</code>
   */
  TIER_14(14),
  /**
   * <code>TIER_15 = 15;</code>
   */
  TIER_15(15),
  /**
   * <code>TIER_16 = 16;</code>
   */
  TIER_16(16),
  /**
   * <code>TIER_17 = 17;</code>
   */
  TIER_17(17),
  /**
   * <code>TIER_18 = 18;</code>
   */
  TIER_18(18),
  /**
   * <code>TIER_19 = 19;</code>
   */
  TIER_19(19),
  /**
   * <code>TIER_20 = 20;</code>
   */
  TIER_20(20),
  /**
   * <code>TIER_21 = 21;</code>
   */
  TIER_21(21),
  /**
   * <code>TIER_22 = 22;</code>
   */
  TIER_22(22),
  /**
   * <code>TIER_23 = 23;</code>
   */
  TIER_23(23),
  /**
   * <code>TIER_24 = 24;</code>
   */
  TIER_24(24),
  /**
   * <code>TIER_25 = 25;</code>
   */
  TIER_25(25),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TIER_00 = 0;</code>
   */
  public static final int TIER_00_VALUE = 0;
  /**
   * <code>TIER_01 = 1;</code>
   */
  public static final int TIER_01_VALUE = 1;
  /**
   * <code>TIER_02 = 2;</code>
   */
  public static final int TIER_02_VALUE = 2;
  /**
   * <code>TIER_03 = 3;</code>
   */
  public static final int TIER_03_VALUE = 3;
  /**
   * <code>TIER_04 = 4;</code>
   */
  public static final int TIER_04_VALUE = 4;
  /**
   * <code>TIER_05 = 5;</code>
   */
  public static final int TIER_05_VALUE = 5;
  /**
   * <code>TIER_06 = 6;</code>
   */
  public static final int TIER_06_VALUE = 6;
  /**
   * <code>TIER_07 = 7;</code>
   */
  public static final int TIER_07_VALUE = 7;
  /**
   * <code>TIER_08 = 8;</code>
   */
  public static final int TIER_08_VALUE = 8;
  /**
   * <code>TIER_09 = 9;</code>
   */
  public static final int TIER_09_VALUE = 9;
  /**
   * <code>TIER_10 = 10;</code>
   */
  public static final int TIER_10_VALUE = 10;
  /**
   * <code>TIER_11 = 11;</code>
   */
  public static final int TIER_11_VALUE = 11;
  /**
   * <code>TIER_12 = 12;</code>
   */
  public static final int TIER_12_VALUE = 12;
  /**
   * <code>TIER_13 = 13;</code>
   */
  public static final int TIER_13_VALUE = 13;
  /**
   * <code>TIER_14 = 14;</code>
   */
  public static final int TIER_14_VALUE = 14;
  /**
   * <code>TIER_15 = 15;</code>
   */
  public static final int TIER_15_VALUE = 15;
  /**
   * <code>TIER_16 = 16;</code>
   */
  public static final int TIER_16_VALUE = 16;
  /**
   * <code>TIER_17 = 17;</code>
   */
  public static final int TIER_17_VALUE = 17;
  /**
   * <code>TIER_18 = 18;</code>
   */
  public static final int TIER_18_VALUE = 18;
  /**
   * <code>TIER_19 = 19;</code>
   */
  public static final int TIER_19_VALUE = 19;
  /**
   * <code>TIER_20 = 20;</code>
   */
  public static final int TIER_20_VALUE = 20;
  /**
   * <code>TIER_21 = 21;</code>
   */
  public static final int TIER_21_VALUE = 21;
  /**
   * <code>TIER_22 = 22;</code>
   */
  public static final int TIER_22_VALUE = 22;
  /**
   * <code>TIER_23 = 23;</code>
   */
  public static final int TIER_23_VALUE = 23;
  /**
   * <code>TIER_24 = 24;</code>
   */
  public static final int TIER_24_VALUE = 24;
  /**
   * <code>TIER_25 = 25;</code>
   */
  public static final int TIER_25_VALUE = 25;


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
  public static UnitTier valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UnitTier forNumber(int value) {
    switch (value) {
      case 0: return TIER_00;
      case 1: return TIER_01;
      case 2: return TIER_02;
      case 3: return TIER_03;
      case 4: return TIER_04;
      case 5: return TIER_05;
      case 6: return TIER_06;
      case 7: return TIER_07;
      case 8: return TIER_08;
      case 9: return TIER_09;
      case 10: return TIER_10;
      case 11: return TIER_11;
      case 12: return TIER_12;
      case 13: return TIER_13;
      case 14: return TIER_14;
      case 15: return TIER_15;
      case 16: return TIER_16;
      case 17: return TIER_17;
      case 18: return TIER_18;
      case 19: return TIER_19;
      case 20: return TIER_20;
      case 21: return TIER_21;
      case 22: return TIER_22;
      case 23: return TIER_23;
      case 24: return TIER_24;
      case 25: return TIER_25;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UnitTier>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UnitTier> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UnitTier>() {
          public UnitTier findValueByNumber(int number) {
            return UnitTier.forNumber(number);
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
    return PlayerProfileResponseOuterClass.getDescriptor().getEnumTypes().get(4);
  }

  private static final UnitTier[] VALUES = values();

  public static UnitTier valueOf(
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

  private UnitTier(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:serenno.protos.playerProfileResponse.UnitTier)
}

