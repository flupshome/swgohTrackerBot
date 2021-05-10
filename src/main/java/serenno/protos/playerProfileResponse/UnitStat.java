// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerProfileResponse.proto

package serenno.protos.playerProfileResponse;

/**
 * Protobuf enum {@code serenno.protos.playerProfileResponse.UnitStat}
 */
public enum UnitStat
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNIT_STAT_NONE = 0;</code>
   */
  UNIT_STAT_NONE(0),
  /**
   * <code>UNIT_STAT_MAX_HEALTH = 1;</code>
   */
  UNIT_STAT_MAX_HEALTH(1),
  /**
   * <code>UNIT_STAT_STRENGTH = 2;</code>
   */
  UNIT_STAT_STRENGTH(2),
  /**
   * <code>UNIT_STAT_AGILITY = 3;</code>
   */
  UNIT_STAT_AGILITY(3),
  /**
   * <code>UNIT_STAT_INTELLIGENCE = 4;</code>
   */
  UNIT_STAT_INTELLIGENCE(4),
  /**
   * <code>UNIT_STAT_SPEED = 5;</code>
   */
  UNIT_STAT_SPEED(5),
  /**
   * <code>UNIT_STAT_ATTACK_DAMAGE = 6;</code>
   */
  UNIT_STAT_ATTACK_DAMAGE(6),
  /**
   * <code>UNIT_STAT_ABILITY_POWER = 7;</code>
   */
  UNIT_STAT_ABILITY_POWER(7),
  /**
   * <code>UNIT_STAT_ARMOR = 8;</code>
   */
  UNIT_STAT_ARMOR(8),
  /**
   * <code>UNIT_STAT_SUPPRESSION = 9;</code>
   */
  UNIT_STAT_SUPPRESSION(9),
  /**
   * <code>UNIT_STAT_ARMOR_PENETRATION = 10;</code>
   */
  UNIT_STAT_ARMOR_PENETRATION(10),
  /**
   * <code>UNIT_STAT_SUPPRESSION_PENETRATION = 11;</code>
   */
  UNIT_STAT_SUPPRESSION_PENETRATION(11),
  /**
   * <code>UNIT_STAT_DODGE_RATING = 12;</code>
   */
  UNIT_STAT_DODGE_RATING(12),
  /**
   * <code>UNIT_STAT_DEFLECTION_RATING = 13;</code>
   */
  UNIT_STAT_DEFLECTION_RATING(13),
  /**
   * <code>UNIT_STAT_ATTACK_CRITICAL_RATING = 14;</code>
   */
  UNIT_STAT_ATTACK_CRITICAL_RATING(14),
  /**
   * <code>UNIT_STAT_ABILITY_CRITICAL_RATING = 15;</code>
   */
  UNIT_STAT_ABILITY_CRITICAL_RATING(15),
  /**
   * <code>UNIT_STAT_CRITICAL_DAMAGE = 16;</code>
   */
  UNIT_STAT_CRITICAL_DAMAGE(16),
  /**
   * <code>UNIT_STAT_ACCURACY = 17;</code>
   */
  UNIT_STAT_ACCURACY(17),
  /**
   * <code>UNIT_STAT_RESISTANCE = 18;</code>
   */
  UNIT_STAT_RESISTANCE(18),
  /**
   * <code>UNIT_STAT_DODGE_PERCENT_ADDITIVE = 19;</code>
   */
  UNIT_STAT_DODGE_PERCENT_ADDITIVE(19),
  /**
   * <code>UNIT_STAT_DEFLECTION_PERCENT_ADDITIVE = 20;</code>
   */
  UNIT_STAT_DEFLECTION_PERCENT_ADDITIVE(20),
  /**
   * <code>UNIT_STAT_ATTACK_CRITICAL_PERCENT_ADDITIVE = 21;</code>
   */
  UNIT_STAT_ATTACK_CRITICAL_PERCENT_ADDITIVE(21),
  /**
   * <code>UNIT_STAT_ABILITY_CRITICAL_PERCENT_ADDITIVE = 22;</code>
   */
  UNIT_STAT_ABILITY_CRITICAL_PERCENT_ADDITIVE(22),
  /**
   * <code>UNIT_STAT_ARMOR_PERCENT_ADDITIVE = 23;</code>
   */
  UNIT_STAT_ARMOR_PERCENT_ADDITIVE(23),
  /**
   * <code>UNIT_STAT_SUPPRESSION_PERCENT_ADDITIVE = 24;</code>
   */
  UNIT_STAT_SUPPRESSION_PERCENT_ADDITIVE(24),
  /**
   * <code>UNIT_STAT_ARMOR_PENETRATION_PERCENT_ADDITIVE = 25;</code>
   */
  UNIT_STAT_ARMOR_PENETRATION_PERCENT_ADDITIVE(25),
  /**
   * <code>UNIT_STAT_SUPPRESSION_PENETRATION_PERCENT_ADDITIVE = 26;</code>
   */
  UNIT_STAT_SUPPRESSION_PENETRATION_PERCENT_ADDITIVE(26),
  /**
   * <code>UNIT_STAT_HEALTH_STEAL = 27;</code>
   */
  UNIT_STAT_HEALTH_STEAL(27),
  /**
   * <code>UNIT_STAT_MAX_SHIELD = 28;</code>
   */
  UNIT_STAT_MAX_SHIELD(28),
  /**
   * <code>UNIT_STAT_SHIELD_PENETRATION = 29;</code>
   */
  UNIT_STAT_SHIELD_PENETRATION(29),
  /**
   * <code>UNIT_STAT_HEALTH_REGEN = 30;</code>
   */
  UNIT_STAT_HEALTH_REGEN(30),
  /**
   * <code>UNIT_STAT_ATTACK_DAMAGE_PERCENT_ADDITIVE = 31;</code>
   */
  UNIT_STAT_ATTACK_DAMAGE_PERCENT_ADDITIVE(31),
  /**
   * <code>UNIT_STAT_ABILITY_POWER_PERCENT_ADDITIVE = 32;</code>
   */
  UNIT_STAT_ABILITY_POWER_PERCENT_ADDITIVE(32),
  /**
   * <code>UNIT_STAT_DODGE_NEGATE_PERCENT_ADDITIVE = 33;</code>
   */
  UNIT_STAT_DODGE_NEGATE_PERCENT_ADDITIVE(33),
  /**
   * <code>UNIT_STAT_DEFLECTION_NEGATE_PERCENT_ADDITIVE = 34;</code>
   */
  UNIT_STAT_DEFLECTION_NEGATE_PERCENT_ADDITIVE(34),
  /**
   * <code>UNIT_STAT_ATTACK_CRITICAL_NEGATE_PERCENT_ADDITIVE = 35;</code>
   */
  UNIT_STAT_ATTACK_CRITICAL_NEGATE_PERCENT_ADDITIVE(35),
  /**
   * <code>UNIT_STAT_ABILITY_CRITICAL_NEGATE_PERCENT_ADDITIVE = 36;</code>
   */
  UNIT_STAT_ABILITY_CRITICAL_NEGATE_PERCENT_ADDITIVE(36),
  /**
   * <code>UNIT_STAT_DODGE_NEGATE_RATING = 37;</code>
   */
  UNIT_STAT_DODGE_NEGATE_RATING(37),
  /**
   * <code>UNIT_STAT_DEFLECTION_NEGATE_RATING = 38;</code>
   */
  UNIT_STAT_DEFLECTION_NEGATE_RATING(38),
  /**
   * <code>UNIT_STAT_ATTACK_CRITICAL_NEGATE_RATING = 39;</code>
   */
  UNIT_STAT_ATTACK_CRITICAL_NEGATE_RATING(39),
  /**
   * <code>UNIT_STAT_ABILITY_CRITICAL_NEGATE_RATING = 40;</code>
   */
  UNIT_STAT_ABILITY_CRITICAL_NEGATE_RATING(40),
  /**
   * <code>UNIT_STAT_OFFENSE = 41;</code>
   */
  UNIT_STAT_OFFENSE(41),
  /**
   * <code>UNIT_STAT_DEFENSE = 42;</code>
   */
  UNIT_STAT_DEFENSE(42),
  /**
   * <code>UNIT_STAT_DEFENSE_PENETRATION = 43;</code>
   */
  UNIT_STAT_DEFENSE_PENETRATION(43),
  /**
   * <code>UNIT_STAT_EVASION_RATING = 44;</code>
   */
  UNIT_STAT_EVASION_RATING(44),
  /**
   * <code>UNIT_STAT_CRITICAL_RATING = 45;</code>
   */
  UNIT_STAT_CRITICAL_RATING(45),
  /**
   * <code>UNIT_STAT_EVASION_NEGATE_RATING = 46;</code>
   */
  UNIT_STAT_EVASION_NEGATE_RATING(46),
  /**
   * <code>UNIT_STAT_CRITICAL_NEGATE_RATING = 47;</code>
   */
  UNIT_STAT_CRITICAL_NEGATE_RATING(47),
  /**
   * <code>UNIT_STAT_OFFENSE_PERCENT_ADDITIVE = 48;</code>
   */
  UNIT_STAT_OFFENSE_PERCENT_ADDITIVE(48),
  /**
   * <code>UNIT_STAT_DEFENSE_PERCENT_ADDITIVE = 49;</code>
   */
  UNIT_STAT_DEFENSE_PERCENT_ADDITIVE(49),
  /**
   * <code>UNIT_STAT_DEFENSE_PENETRATION_PERCENT_ADDITIVE = 50;</code>
   */
  UNIT_STAT_DEFENSE_PENETRATION_PERCENT_ADDITIVE(50),
  /**
   * <code>UNIT_STAT_EVASION_PERCENT_ADDITIVE = 51;</code>
   */
  UNIT_STAT_EVASION_PERCENT_ADDITIVE(51),
  /**
   * <code>UNIT_STAT_EVASION_NEGATE_PERCENT_ADDITIVE = 52;</code>
   */
  UNIT_STAT_EVASION_NEGATE_PERCENT_ADDITIVE(52),
  /**
   * <code>UNIT_STAT_CRITICAL_CHANCE_PERCENT_ADDITIVE = 53;</code>
   */
  UNIT_STAT_CRITICAL_CHANCE_PERCENT_ADDITIVE(53),
  /**
   * <code>UNIT_STAT_CRITICAL_NEGATE_CHANCE_PERCENT_ADDITIVE = 54;</code>
   */
  UNIT_STAT_CRITICAL_NEGATE_CHANCE_PERCENT_ADDITIVE(54),
  /**
   * <code>UNIT_STAT_MAX_HEALTH_PERCENT_ADDITIVE = 55;</code>
   */
  UNIT_STAT_MAX_HEALTH_PERCENT_ADDITIVE(55),
  /**
   * <code>UNIT_STAT_MAX_SHIELD_PERCENT_ADDITIVE = 56;</code>
   */
  UNIT_STAT_MAX_SHIELD_PERCENT_ADDITIVE(56),
  /**
   * <code>UNIT_STAT_SPEED_PERCENT_ADDITIVE = 57;</code>
   */
  UNIT_STAT_SPEED_PERCENT_ADDITIVE(57),
  /**
   * <code>UNIT_STAT_COUNTER_ATTACK_RATING = 58;</code>
   */
  UNIT_STAT_COUNTER_ATTACK_RATING(58),
  /**
   * <code>UNIT_STAT_TAUNT = 59;</code>
   */
  UNIT_STAT_TAUNT(59),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNIT_STAT_NONE = 0;</code>
   */
  public static final int UNIT_STAT_NONE_VALUE = 0;
  /**
   * <code>UNIT_STAT_MAX_HEALTH = 1;</code>
   */
  public static final int UNIT_STAT_MAX_HEALTH_VALUE = 1;
  /**
   * <code>UNIT_STAT_STRENGTH = 2;</code>
   */
  public static final int UNIT_STAT_STRENGTH_VALUE = 2;
  /**
   * <code>UNIT_STAT_AGILITY = 3;</code>
   */
  public static final int UNIT_STAT_AGILITY_VALUE = 3;
  /**
   * <code>UNIT_STAT_INTELLIGENCE = 4;</code>
   */
  public static final int UNIT_STAT_INTELLIGENCE_VALUE = 4;
  /**
   * <code>UNIT_STAT_SPEED = 5;</code>
   */
  public static final int UNIT_STAT_SPEED_VALUE = 5;
  /**
   * <code>UNIT_STAT_ATTACK_DAMAGE = 6;</code>
   */
  public static final int UNIT_STAT_ATTACK_DAMAGE_VALUE = 6;
  /**
   * <code>UNIT_STAT_ABILITY_POWER = 7;</code>
   */
  public static final int UNIT_STAT_ABILITY_POWER_VALUE = 7;
  /**
   * <code>UNIT_STAT_ARMOR = 8;</code>
   */
  public static final int UNIT_STAT_ARMOR_VALUE = 8;
  /**
   * <code>UNIT_STAT_SUPPRESSION = 9;</code>
   */
  public static final int UNIT_STAT_SUPPRESSION_VALUE = 9;
  /**
   * <code>UNIT_STAT_ARMOR_PENETRATION = 10;</code>
   */
  public static final int UNIT_STAT_ARMOR_PENETRATION_VALUE = 10;
  /**
   * <code>UNIT_STAT_SUPPRESSION_PENETRATION = 11;</code>
   */
  public static final int UNIT_STAT_SUPPRESSION_PENETRATION_VALUE = 11;
  /**
   * <code>UNIT_STAT_DODGE_RATING = 12;</code>
   */
  public static final int UNIT_STAT_DODGE_RATING_VALUE = 12;
  /**
   * <code>UNIT_STAT_DEFLECTION_RATING = 13;</code>
   */
  public static final int UNIT_STAT_DEFLECTION_RATING_VALUE = 13;
  /**
   * <code>UNIT_STAT_ATTACK_CRITICAL_RATING = 14;</code>
   */
  public static final int UNIT_STAT_ATTACK_CRITICAL_RATING_VALUE = 14;
  /**
   * <code>UNIT_STAT_ABILITY_CRITICAL_RATING = 15;</code>
   */
  public static final int UNIT_STAT_ABILITY_CRITICAL_RATING_VALUE = 15;
  /**
   * <code>UNIT_STAT_CRITICAL_DAMAGE = 16;</code>
   */
  public static final int UNIT_STAT_CRITICAL_DAMAGE_VALUE = 16;
  /**
   * <code>UNIT_STAT_ACCURACY = 17;</code>
   */
  public static final int UNIT_STAT_ACCURACY_VALUE = 17;
  /**
   * <code>UNIT_STAT_RESISTANCE = 18;</code>
   */
  public static final int UNIT_STAT_RESISTANCE_VALUE = 18;
  /**
   * <code>UNIT_STAT_DODGE_PERCENT_ADDITIVE = 19;</code>
   */
  public static final int UNIT_STAT_DODGE_PERCENT_ADDITIVE_VALUE = 19;
  /**
   * <code>UNIT_STAT_DEFLECTION_PERCENT_ADDITIVE = 20;</code>
   */
  public static final int UNIT_STAT_DEFLECTION_PERCENT_ADDITIVE_VALUE = 20;
  /**
   * <code>UNIT_STAT_ATTACK_CRITICAL_PERCENT_ADDITIVE = 21;</code>
   */
  public static final int UNIT_STAT_ATTACK_CRITICAL_PERCENT_ADDITIVE_VALUE = 21;
  /**
   * <code>UNIT_STAT_ABILITY_CRITICAL_PERCENT_ADDITIVE = 22;</code>
   */
  public static final int UNIT_STAT_ABILITY_CRITICAL_PERCENT_ADDITIVE_VALUE = 22;
  /**
   * <code>UNIT_STAT_ARMOR_PERCENT_ADDITIVE = 23;</code>
   */
  public static final int UNIT_STAT_ARMOR_PERCENT_ADDITIVE_VALUE = 23;
  /**
   * <code>UNIT_STAT_SUPPRESSION_PERCENT_ADDITIVE = 24;</code>
   */
  public static final int UNIT_STAT_SUPPRESSION_PERCENT_ADDITIVE_VALUE = 24;
  /**
   * <code>UNIT_STAT_ARMOR_PENETRATION_PERCENT_ADDITIVE = 25;</code>
   */
  public static final int UNIT_STAT_ARMOR_PENETRATION_PERCENT_ADDITIVE_VALUE = 25;
  /**
   * <code>UNIT_STAT_SUPPRESSION_PENETRATION_PERCENT_ADDITIVE = 26;</code>
   */
  public static final int UNIT_STAT_SUPPRESSION_PENETRATION_PERCENT_ADDITIVE_VALUE = 26;
  /**
   * <code>UNIT_STAT_HEALTH_STEAL = 27;</code>
   */
  public static final int UNIT_STAT_HEALTH_STEAL_VALUE = 27;
  /**
   * <code>UNIT_STAT_MAX_SHIELD = 28;</code>
   */
  public static final int UNIT_STAT_MAX_SHIELD_VALUE = 28;
  /**
   * <code>UNIT_STAT_SHIELD_PENETRATION = 29;</code>
   */
  public static final int UNIT_STAT_SHIELD_PENETRATION_VALUE = 29;
  /**
   * <code>UNIT_STAT_HEALTH_REGEN = 30;</code>
   */
  public static final int UNIT_STAT_HEALTH_REGEN_VALUE = 30;
  /**
   * <code>UNIT_STAT_ATTACK_DAMAGE_PERCENT_ADDITIVE = 31;</code>
   */
  public static final int UNIT_STAT_ATTACK_DAMAGE_PERCENT_ADDITIVE_VALUE = 31;
  /**
   * <code>UNIT_STAT_ABILITY_POWER_PERCENT_ADDITIVE = 32;</code>
   */
  public static final int UNIT_STAT_ABILITY_POWER_PERCENT_ADDITIVE_VALUE = 32;
  /**
   * <code>UNIT_STAT_DODGE_NEGATE_PERCENT_ADDITIVE = 33;</code>
   */
  public static final int UNIT_STAT_DODGE_NEGATE_PERCENT_ADDITIVE_VALUE = 33;
  /**
   * <code>UNIT_STAT_DEFLECTION_NEGATE_PERCENT_ADDITIVE = 34;</code>
   */
  public static final int UNIT_STAT_DEFLECTION_NEGATE_PERCENT_ADDITIVE_VALUE = 34;
  /**
   * <code>UNIT_STAT_ATTACK_CRITICAL_NEGATE_PERCENT_ADDITIVE = 35;</code>
   */
  public static final int UNIT_STAT_ATTACK_CRITICAL_NEGATE_PERCENT_ADDITIVE_VALUE = 35;
  /**
   * <code>UNIT_STAT_ABILITY_CRITICAL_NEGATE_PERCENT_ADDITIVE = 36;</code>
   */
  public static final int UNIT_STAT_ABILITY_CRITICAL_NEGATE_PERCENT_ADDITIVE_VALUE = 36;
  /**
   * <code>UNIT_STAT_DODGE_NEGATE_RATING = 37;</code>
   */
  public static final int UNIT_STAT_DODGE_NEGATE_RATING_VALUE = 37;
  /**
   * <code>UNIT_STAT_DEFLECTION_NEGATE_RATING = 38;</code>
   */
  public static final int UNIT_STAT_DEFLECTION_NEGATE_RATING_VALUE = 38;
  /**
   * <code>UNIT_STAT_ATTACK_CRITICAL_NEGATE_RATING = 39;</code>
   */
  public static final int UNIT_STAT_ATTACK_CRITICAL_NEGATE_RATING_VALUE = 39;
  /**
   * <code>UNIT_STAT_ABILITY_CRITICAL_NEGATE_RATING = 40;</code>
   */
  public static final int UNIT_STAT_ABILITY_CRITICAL_NEGATE_RATING_VALUE = 40;
  /**
   * <code>UNIT_STAT_OFFENSE = 41;</code>
   */
  public static final int UNIT_STAT_OFFENSE_VALUE = 41;
  /**
   * <code>UNIT_STAT_DEFENSE = 42;</code>
   */
  public static final int UNIT_STAT_DEFENSE_VALUE = 42;
  /**
   * <code>UNIT_STAT_DEFENSE_PENETRATION = 43;</code>
   */
  public static final int UNIT_STAT_DEFENSE_PENETRATION_VALUE = 43;
  /**
   * <code>UNIT_STAT_EVASION_RATING = 44;</code>
   */
  public static final int UNIT_STAT_EVASION_RATING_VALUE = 44;
  /**
   * <code>UNIT_STAT_CRITICAL_RATING = 45;</code>
   */
  public static final int UNIT_STAT_CRITICAL_RATING_VALUE = 45;
  /**
   * <code>UNIT_STAT_EVASION_NEGATE_RATING = 46;</code>
   */
  public static final int UNIT_STAT_EVASION_NEGATE_RATING_VALUE = 46;
  /**
   * <code>UNIT_STAT_CRITICAL_NEGATE_RATING = 47;</code>
   */
  public static final int UNIT_STAT_CRITICAL_NEGATE_RATING_VALUE = 47;
  /**
   * <code>UNIT_STAT_OFFENSE_PERCENT_ADDITIVE = 48;</code>
   */
  public static final int UNIT_STAT_OFFENSE_PERCENT_ADDITIVE_VALUE = 48;
  /**
   * <code>UNIT_STAT_DEFENSE_PERCENT_ADDITIVE = 49;</code>
   */
  public static final int UNIT_STAT_DEFENSE_PERCENT_ADDITIVE_VALUE = 49;
  /**
   * <code>UNIT_STAT_DEFENSE_PENETRATION_PERCENT_ADDITIVE = 50;</code>
   */
  public static final int UNIT_STAT_DEFENSE_PENETRATION_PERCENT_ADDITIVE_VALUE = 50;
  /**
   * <code>UNIT_STAT_EVASION_PERCENT_ADDITIVE = 51;</code>
   */
  public static final int UNIT_STAT_EVASION_PERCENT_ADDITIVE_VALUE = 51;
  /**
   * <code>UNIT_STAT_EVASION_NEGATE_PERCENT_ADDITIVE = 52;</code>
   */
  public static final int UNIT_STAT_EVASION_NEGATE_PERCENT_ADDITIVE_VALUE = 52;
  /**
   * <code>UNIT_STAT_CRITICAL_CHANCE_PERCENT_ADDITIVE = 53;</code>
   */
  public static final int UNIT_STAT_CRITICAL_CHANCE_PERCENT_ADDITIVE_VALUE = 53;
  /**
   * <code>UNIT_STAT_CRITICAL_NEGATE_CHANCE_PERCENT_ADDITIVE = 54;</code>
   */
  public static final int UNIT_STAT_CRITICAL_NEGATE_CHANCE_PERCENT_ADDITIVE_VALUE = 54;
  /**
   * <code>UNIT_STAT_MAX_HEALTH_PERCENT_ADDITIVE = 55;</code>
   */
  public static final int UNIT_STAT_MAX_HEALTH_PERCENT_ADDITIVE_VALUE = 55;
  /**
   * <code>UNIT_STAT_MAX_SHIELD_PERCENT_ADDITIVE = 56;</code>
   */
  public static final int UNIT_STAT_MAX_SHIELD_PERCENT_ADDITIVE_VALUE = 56;
  /**
   * <code>UNIT_STAT_SPEED_PERCENT_ADDITIVE = 57;</code>
   */
  public static final int UNIT_STAT_SPEED_PERCENT_ADDITIVE_VALUE = 57;
  /**
   * <code>UNIT_STAT_COUNTER_ATTACK_RATING = 58;</code>
   */
  public static final int UNIT_STAT_COUNTER_ATTACK_RATING_VALUE = 58;
  /**
   * <code>UNIT_STAT_TAUNT = 59;</code>
   */
  public static final int UNIT_STAT_TAUNT_VALUE = 59;


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
  public static UnitStat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UnitStat forNumber(int value) {
    switch (value) {
      case 0: return UNIT_STAT_NONE;
      case 1: return UNIT_STAT_MAX_HEALTH;
      case 2: return UNIT_STAT_STRENGTH;
      case 3: return UNIT_STAT_AGILITY;
      case 4: return UNIT_STAT_INTELLIGENCE;
      case 5: return UNIT_STAT_SPEED;
      case 6: return UNIT_STAT_ATTACK_DAMAGE;
      case 7: return UNIT_STAT_ABILITY_POWER;
      case 8: return UNIT_STAT_ARMOR;
      case 9: return UNIT_STAT_SUPPRESSION;
      case 10: return UNIT_STAT_ARMOR_PENETRATION;
      case 11: return UNIT_STAT_SUPPRESSION_PENETRATION;
      case 12: return UNIT_STAT_DODGE_RATING;
      case 13: return UNIT_STAT_DEFLECTION_RATING;
      case 14: return UNIT_STAT_ATTACK_CRITICAL_RATING;
      case 15: return UNIT_STAT_ABILITY_CRITICAL_RATING;
      case 16: return UNIT_STAT_CRITICAL_DAMAGE;
      case 17: return UNIT_STAT_ACCURACY;
      case 18: return UNIT_STAT_RESISTANCE;
      case 19: return UNIT_STAT_DODGE_PERCENT_ADDITIVE;
      case 20: return UNIT_STAT_DEFLECTION_PERCENT_ADDITIVE;
      case 21: return UNIT_STAT_ATTACK_CRITICAL_PERCENT_ADDITIVE;
      case 22: return UNIT_STAT_ABILITY_CRITICAL_PERCENT_ADDITIVE;
      case 23: return UNIT_STAT_ARMOR_PERCENT_ADDITIVE;
      case 24: return UNIT_STAT_SUPPRESSION_PERCENT_ADDITIVE;
      case 25: return UNIT_STAT_ARMOR_PENETRATION_PERCENT_ADDITIVE;
      case 26: return UNIT_STAT_SUPPRESSION_PENETRATION_PERCENT_ADDITIVE;
      case 27: return UNIT_STAT_HEALTH_STEAL;
      case 28: return UNIT_STAT_MAX_SHIELD;
      case 29: return UNIT_STAT_SHIELD_PENETRATION;
      case 30: return UNIT_STAT_HEALTH_REGEN;
      case 31: return UNIT_STAT_ATTACK_DAMAGE_PERCENT_ADDITIVE;
      case 32: return UNIT_STAT_ABILITY_POWER_PERCENT_ADDITIVE;
      case 33: return UNIT_STAT_DODGE_NEGATE_PERCENT_ADDITIVE;
      case 34: return UNIT_STAT_DEFLECTION_NEGATE_PERCENT_ADDITIVE;
      case 35: return UNIT_STAT_ATTACK_CRITICAL_NEGATE_PERCENT_ADDITIVE;
      case 36: return UNIT_STAT_ABILITY_CRITICAL_NEGATE_PERCENT_ADDITIVE;
      case 37: return UNIT_STAT_DODGE_NEGATE_RATING;
      case 38: return UNIT_STAT_DEFLECTION_NEGATE_RATING;
      case 39: return UNIT_STAT_ATTACK_CRITICAL_NEGATE_RATING;
      case 40: return UNIT_STAT_ABILITY_CRITICAL_NEGATE_RATING;
      case 41: return UNIT_STAT_OFFENSE;
      case 42: return UNIT_STAT_DEFENSE;
      case 43: return UNIT_STAT_DEFENSE_PENETRATION;
      case 44: return UNIT_STAT_EVASION_RATING;
      case 45: return UNIT_STAT_CRITICAL_RATING;
      case 46: return UNIT_STAT_EVASION_NEGATE_RATING;
      case 47: return UNIT_STAT_CRITICAL_NEGATE_RATING;
      case 48: return UNIT_STAT_OFFENSE_PERCENT_ADDITIVE;
      case 49: return UNIT_STAT_DEFENSE_PERCENT_ADDITIVE;
      case 50: return UNIT_STAT_DEFENSE_PENETRATION_PERCENT_ADDITIVE;
      case 51: return UNIT_STAT_EVASION_PERCENT_ADDITIVE;
      case 52: return UNIT_STAT_EVASION_NEGATE_PERCENT_ADDITIVE;
      case 53: return UNIT_STAT_CRITICAL_CHANCE_PERCENT_ADDITIVE;
      case 54: return UNIT_STAT_CRITICAL_NEGATE_CHANCE_PERCENT_ADDITIVE;
      case 55: return UNIT_STAT_MAX_HEALTH_PERCENT_ADDITIVE;
      case 56: return UNIT_STAT_MAX_SHIELD_PERCENT_ADDITIVE;
      case 57: return UNIT_STAT_SPEED_PERCENT_ADDITIVE;
      case 58: return UNIT_STAT_COUNTER_ATTACK_RATING;
      case 59: return UNIT_STAT_TAUNT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UnitStat>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UnitStat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UnitStat>() {
          public UnitStat findValueByNumber(int number) {
            return UnitStat.forNumber(number);
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
    return PlayerProfileResponseOuterClass.getDescriptor().getEnumTypes().get(3);
  }

  private static final UnitStat[] VALUES = values();

  public static UnitStat valueOf(
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

  private UnitStat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:serenno.protos.playerProfileResponse.UnitStat)
}

