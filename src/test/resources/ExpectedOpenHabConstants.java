package org.test;

import static org.test.StringConstants.*;

import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * Auto generated class for ESH-INF constants.
 */
public final class OpenHabConstants {


    // BridgeTypeUIDs
    public static final ThingTypeUID WMBUSBRIDGE_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, BRIDGE_TYPE_ID_WMBUSBRIDGE);
    public static final ThingTypeUID WMBUSVIRTUALBRIDGE_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, BRIDGE_TYPE_ID_WMBUSVIRTUALBRIDGE);

    // ThingTypeUIDs
    public static final ThingTypeUID ITRON_SMOKE_DETECTOR_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_ITRON_SMOKE_DETECTOR);
    public static final ThingTypeUID TECHEM_HKV45_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_TECHEM_HKV45);
    public static final ThingTypeUID TECHEM_HKV61_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_TECHEM_HKV61);
    public static final ThingTypeUID TECHEM_HKV64_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_TECHEM_HKV64);
    public static final ThingTypeUID TECHEM_HKV69_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_TECHEM_HKV69);
    public static final ThingTypeUID TECHEM_HKV94_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_TECHEM_HKV94);
    public static final ThingTypeUID TECHEM_SD76_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_TECHEM_SD76);
    public static final ThingTypeUID TECHEM_WZ62_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_TECHEM_WZ62);
    public static final ThingTypeUID TECHEM_WZ72_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_TECHEM_WZ72);
    public static final ThingTypeUID TECHEM_WMZ43_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_TECHEM_WMZ43);
    public static final ThingTypeUID METER_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_METER);
    public static final ThingTypeUID ENCRYPTED_METER_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_ENCRYPTED_METER);
    public static final ThingTypeUID THING_WITH_GROUPS_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_THING_WITH_GROUPS);
    public static final ThingTypeUID EGO_TCP_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, THING_TYPE_ID_EGO_TCP);

    // ChannelUIDs for itron_smoke_detector
    public static final ChannelUID ITRON_SMOKE_DETECTOR_CURRENT_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_CURRENT_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_CURRENT_DATE_STRING_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_CURRENT_DATE_STRING);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_CURRENT_DATE_NUMBER_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_CURRENT_DATE_NUMBER);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_REMOVAL_OCCURRED_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_REMOVAL_OCCURRED);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_BILLING_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_BILLING_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_PRODUCT_INSTALLED_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_PRODUCT_INSTALLED);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_OPERATION_MODE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_OPERATION_MODE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_PERIMETER_INTRUSION_OCCURRED_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_PERIMETER_INTRUSION_OCCURRED);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_SMOKE_INLET_BLOCKED_OCCURRED_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_SMOKE_INLET_BLOCKED_OCCURRED);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_OUT_OF_TEMP_RANGE_OCCURRED_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_OUT_OF_TEMP_RANGE_OCCURRED);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_PRODUCT_CODE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_PRODUCT_CODE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_BATTERY_LIFETIME_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_BATTERY_LIFETIME);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_PERIMETER_INTRUSION_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_PERIMETER_INTRUSION);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_REMOVAL_ERROR_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_REMOVAL_ERROR);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_STATUS_DATA_ENCRYPTED_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_STATUS_DATA_ENCRYPTED);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_ALERT_START_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_ALERT_START_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_ALERT_START_DATE_STRING_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_ALERT_START_DATE_STRING);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_ALERT_START_DATE_NUMBER_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_ALERT_START_DATE_NUMBER);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_ALERT_END_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_ALERT_END_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_ALERT_END_DATE_STRING_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_ALERT_END_DATE_STRING);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_ALERT_END_DATE_NUMBER_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_ALERT_END_DATE_NUMBER);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_BEEPER_STOPPED_DURING_SMOKE_ALERT_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_BEEPER_STOPPED_DURING_SMOKE_ALERT_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_BEEPER_STOPPED_DURING_SMOKE_ALERT_DATE_STRING_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_BEEPER_STOPPED_DURING_SMOKE_ALERT_DATE_STRING);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_BEEPER_STOPPED_DURING_SMOKE_ALERT_DATE_NUMBER_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_BEEPER_STOPPED_DURING_SMOKE_ALERT_DATE_NUMBER);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_PERIMETER_INTRUSION_OBSTACLE_OCCURRED_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_PERIMETER_INTRUSION_OBSTACLE_OCCURRED_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_PERIMETER_INTRUSION_OBSTACLE_OCCURRED_DATE_STRING_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_PERIMETER_INTRUSION_OBSTACLE_OCCURRED_DATE_STRING);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_PERIMETER_INTRUSION_OBSTACLE_OCCURRED_DATE_NUMBER_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_PERIMETER_INTRUSION_OBSTACLE_OCCURRED_DATE_NUMBER);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_PERIMETER_INTRUSION_OBSTACLE_REMOVED_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_PERIMETER_INTRUSION_OBSTACLE_REMOVED_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_PERIMETER_INTRUSION_OBSTACLE_REMOVED_DATE_STRING_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_PERIMETER_INTRUSION_OBSTACLE_REMOVED_DATE_STRING);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_PERIMETER_INTRUSION_OBSTACLE_REMOVED_DATE_NUMBER_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_PERIMETER_INTRUSION_OBSTACLE_REMOVED_DATE_NUMBER);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_INLET_BLOCKED_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_INLET_BLOCKED_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_INLET_BLOCKED_DATE_STRING_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_INLET_BLOCKED_DATE_STRING);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_INLET_BLOCKED_DATE_NUMBER_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_INLET_BLOCKED_DATE_NUMBER);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_INLET_BLOCKING_REMOVED_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_INLET_BLOCKING_REMOVED_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_INLET_BLOCKING_REMOVED_DATE_STRING_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_INLET_BLOCKING_REMOVED_DATE_STRING);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_SMOKE_INLET_BLOCKING_REMOVED_DATE_NUMBER_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_SMOKE_INLET_BLOCKING_REMOVED_DATE_NUMBER);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_TEMPERATURE_OUT_OF_RANGE_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_TEMPERATURE_OUT_OF_RANGE_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_TEMPERATURE_OUT_OF_RANGE_DATE_STRING_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_TEMPERATURE_OUT_OF_RANGE_DATE_STRING);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_TEMPERATURE_OUT_OF_RANGE_DATE_NUMBER_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_TEMPERATURE_OUT_OF_RANGE_DATE_NUMBER);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_TEST_SWITCH_DATE_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_TEST_SWITCH_DATE);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_TEST_SWITCH_DATE_STRING_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_TEST_SWITCH_DATE_STRING);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_LAST_TEST_SWITCH_DATE_NUMBER_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_LAST_TEST_SWITCH_DATE_NUMBER);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_NUMBER_OF_TEST_SWITCHES_OPERATED_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_NUMBER_OF_TEST_SWITCHES_OPERATED);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_PERIMETER_INTRUSION_DAY_COUNTER_CUMULATED_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_PERIMETER_INTRUSION_DAY_COUNTER_CUMULATED);
    public static final ChannelUID ITRON_SMOKE_DETECTOR_SMOKE_INLET_DAY_COUNTER_CUMULATED_UID = new ChannelUID(ITRON_SMOKE_DETECTOR_THING_TYPE_UID, CID_SMOKE_INLET_DAY_COUNTER_CUMULATED);

    // ChannelUIDs for techem_hkv45
    public static final ChannelUID TECHEM_HKV45_CURRENT_READING_UID = new ChannelUID(TECHEM_HKV45_THING_TYPE_UID, CID_CURRENT_READING);
    public static final ChannelUID TECHEM_HKV45_LAST_READING_UID = new ChannelUID(TECHEM_HKV45_THING_TYPE_UID, CID_LAST_READING);
    public static final ChannelUID TECHEM_HKV45_LAST_DATE_UID = new ChannelUID(TECHEM_HKV45_THING_TYPE_UID, CID_LAST_DATE);
    public static final ChannelUID TECHEM_HKV45_LAST_DATE_STRING_UID = new ChannelUID(TECHEM_HKV45_THING_TYPE_UID, CID_LAST_DATE_STRING);
    public static final ChannelUID TECHEM_HKV45_LAST_DATE_NUMBER_UID = new ChannelUID(TECHEM_HKV45_THING_TYPE_UID, CID_LAST_DATE_NUMBER);
    public static final ChannelUID TECHEM_HKV45_CURRENT_DATE_UID = new ChannelUID(TECHEM_HKV45_THING_TYPE_UID, CID_CURRENT_DATE);
    public static final ChannelUID TECHEM_HKV45_CURRENT_DATE_STRING_UID = new ChannelUID(TECHEM_HKV45_THING_TYPE_UID, CID_CURRENT_DATE_STRING);
    public static final ChannelUID TECHEM_HKV45_CURRENT_DATE_NUMBER_UID = new ChannelUID(TECHEM_HKV45_THING_TYPE_UID, CID_CURRENT_DATE_NUMBER);
    public static final ChannelUID TECHEM_HKV45_RECEPTION_UID = new ChannelUID(TECHEM_HKV45_THING_TYPE_UID, CID_RECEPTION);

    // ChannelUIDs for techem_hkv61
    public static final ChannelUID TECHEM_HKV61_CURRENT_READING_UID = new ChannelUID(TECHEM_HKV61_THING_TYPE_UID, CID_CURRENT_READING);
    public static final ChannelUID TECHEM_HKV61_LAST_READING_UID = new ChannelUID(TECHEM_HKV61_THING_TYPE_UID, CID_LAST_READING);
    public static final ChannelUID TECHEM_HKV61_RECEPTION_UID = new ChannelUID(TECHEM_HKV61_THING_TYPE_UID, CID_RECEPTION);
    public static final ChannelUID TECHEM_HKV61_LAST_DATE_UID = new ChannelUID(TECHEM_HKV61_THING_TYPE_UID, CID_LAST_DATE);
    public static final ChannelUID TECHEM_HKV61_LAST_DATE_STRING_UID = new ChannelUID(TECHEM_HKV61_THING_TYPE_UID, CID_LAST_DATE_STRING);
    public static final ChannelUID TECHEM_HKV61_LAST_DATE_NUMBER_UID = new ChannelUID(TECHEM_HKV61_THING_TYPE_UID, CID_LAST_DATE_NUMBER);
    public static final ChannelUID TECHEM_HKV61_CURRENT_DATE_UID = new ChannelUID(TECHEM_HKV61_THING_TYPE_UID, CID_CURRENT_DATE);
    public static final ChannelUID TECHEM_HKV61_CURRENT_DATE_STRING_UID = new ChannelUID(TECHEM_HKV61_THING_TYPE_UID, CID_CURRENT_DATE_STRING);
    public static final ChannelUID TECHEM_HKV61_CURRENT_DATE_NUMBER_UID = new ChannelUID(TECHEM_HKV61_THING_TYPE_UID, CID_CURRENT_DATE_NUMBER);
    public static final ChannelUID TECHEM_HKV61_ALMANAC_UID = new ChannelUID(TECHEM_HKV61_THING_TYPE_UID, CID_ALMANAC);

    // ChannelUIDs for techem_hkv64
    public static final ChannelUID TECHEM_HKV64_CURRENT_READING_UID = new ChannelUID(TECHEM_HKV64_THING_TYPE_UID, CID_CURRENT_READING);
    public static final ChannelUID TECHEM_HKV64_LAST_READING_UID = new ChannelUID(TECHEM_HKV64_THING_TYPE_UID, CID_LAST_READING);
    public static final ChannelUID TECHEM_HKV64_RECEPTION_UID = new ChannelUID(TECHEM_HKV64_THING_TYPE_UID, CID_RECEPTION);
    public static final ChannelUID TECHEM_HKV64_LAST_DATE_UID = new ChannelUID(TECHEM_HKV64_THING_TYPE_UID, CID_LAST_DATE);
    public static final ChannelUID TECHEM_HKV64_LAST_DATE_STRING_UID = new ChannelUID(TECHEM_HKV64_THING_TYPE_UID, CID_LAST_DATE_STRING);
    public static final ChannelUID TECHEM_HKV64_LAST_DATE_NUMBER_UID = new ChannelUID(TECHEM_HKV64_THING_TYPE_UID, CID_LAST_DATE_NUMBER);
    public static final ChannelUID TECHEM_HKV64_CURRENT_DATE_UID = new ChannelUID(TECHEM_HKV64_THING_TYPE_UID, CID_CURRENT_DATE);
    public static final ChannelUID TECHEM_HKV64_CURRENT_DATE_STRING_UID = new ChannelUID(TECHEM_HKV64_THING_TYPE_UID, CID_CURRENT_DATE_STRING);
    public static final ChannelUID TECHEM_HKV64_CURRENT_DATE_NUMBER_UID = new ChannelUID(TECHEM_HKV64_THING_TYPE_UID, CID_CURRENT_DATE_NUMBER);
    public static final ChannelUID TECHEM_HKV64_ALMANAC_UID = new ChannelUID(TECHEM_HKV64_THING_TYPE_UID, CID_ALMANAC);

    // ChannelUIDs for techem_hkv69
    public static final ChannelUID TECHEM_HKV69_ROOM_TEMPERATURE_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_ROOM_TEMPERATURE);
    public static final ChannelUID TECHEM_HKV69_RADIATOR_TEMPERATURE_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_RADIATOR_TEMPERATURE);
    public static final ChannelUID TECHEM_HKV69_CURRENT_READING_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_CURRENT_READING);
    public static final ChannelUID TECHEM_HKV69_LAST_READING_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_LAST_READING);
    public static final ChannelUID TECHEM_HKV69_RECEPTION_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_RECEPTION);
    public static final ChannelUID TECHEM_HKV69_LAST_DATE_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_LAST_DATE);
    public static final ChannelUID TECHEM_HKV69_LAST_DATE_STRING_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_LAST_DATE_STRING);
    public static final ChannelUID TECHEM_HKV69_LAST_DATE_NUMBER_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_LAST_DATE_NUMBER);
    public static final ChannelUID TECHEM_HKV69_CURRENT_DATE_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_CURRENT_DATE);
    public static final ChannelUID TECHEM_HKV69_CURRENT_DATE_STRING_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_CURRENT_DATE_STRING);
    public static final ChannelUID TECHEM_HKV69_CURRENT_DATE_NUMBER_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_CURRENT_DATE_NUMBER);
    public static final ChannelUID TECHEM_HKV69_ALMANAC_UID = new ChannelUID(TECHEM_HKV69_THING_TYPE_UID, CID_ALMANAC);

    // ChannelUIDs for techem_hkv94
    public static final ChannelUID TECHEM_HKV94_ROOM_TEMPERATURE_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_ROOM_TEMPERATURE);
    public static final ChannelUID TECHEM_HKV94_RADIATOR_TEMPERATURE_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_RADIATOR_TEMPERATURE);
    public static final ChannelUID TECHEM_HKV94_CURRENT_READING_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_CURRENT_READING);
    public static final ChannelUID TECHEM_HKV94_LAST_READING_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_LAST_READING);
    public static final ChannelUID TECHEM_HKV94_RECEPTION_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_RECEPTION);
    public static final ChannelUID TECHEM_HKV94_LAST_DATE_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_LAST_DATE);
    public static final ChannelUID TECHEM_HKV94_LAST_DATE_STRING_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_LAST_DATE_STRING);
    public static final ChannelUID TECHEM_HKV94_LAST_DATE_NUMBER_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_LAST_DATE_NUMBER);
    public static final ChannelUID TECHEM_HKV94_CURRENT_DATE_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_CURRENT_DATE);
    public static final ChannelUID TECHEM_HKV94_CURRENT_DATE_STRING_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_CURRENT_DATE_STRING);
    public static final ChannelUID TECHEM_HKV94_CURRENT_DATE_NUMBER_UID = new ChannelUID(TECHEM_HKV94_THING_TYPE_UID, CID_CURRENT_DATE_NUMBER);

    // ChannelUIDs for techem_sd76
    public static final ChannelUID TECHEM_SD76_STATUS_UID = new ChannelUID(TECHEM_SD76_THING_TYPE_UID, CID_STATUS);
    public static final ChannelUID TECHEM_SD76_CURRENT_DATE_UID = new ChannelUID(TECHEM_SD76_THING_TYPE_UID, CID_CURRENT_DATE);
    public static final ChannelUID TECHEM_SD76_CURRENT_DATE_STRING_UID = new ChannelUID(TECHEM_SD76_THING_TYPE_UID, CID_CURRENT_DATE_STRING);
    public static final ChannelUID TECHEM_SD76_CURRENT_DATE_NUMBER_UID = new ChannelUID(TECHEM_SD76_THING_TYPE_UID, CID_CURRENT_DATE_NUMBER);
    public static final ChannelUID TECHEM_SD76_CURRENT_DATE_SMOKE_UID = new ChannelUID(TECHEM_SD76_THING_TYPE_UID, CID_CURRENT_DATE_SMOKE);
    public static final ChannelUID TECHEM_SD76_CURRENT_DATE_SMOKE_STRING_UID = new ChannelUID(TECHEM_SD76_THING_TYPE_UID, CID_CURRENT_DATE_SMOKE_STRING);
    public static final ChannelUID TECHEM_SD76_CURRENT_DATE_SMOKE_NUMBER_UID = new ChannelUID(TECHEM_SD76_THING_TYPE_UID, CID_CURRENT_DATE_SMOKE_NUMBER);

    // ChannelUIDs for techem_wz62
    public static final ChannelUID TECHEM_WZ62_STATUS_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_STATUS);
    public static final ChannelUID TECHEM_WZ62_CURRENT_READING_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_CURRENT_READING);
    public static final ChannelUID TECHEM_WZ62_LAST_READING_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_LAST_READING);
    public static final ChannelUID TECHEM_WZ62_LAST_DATE_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_LAST_DATE);
    public static final ChannelUID TECHEM_WZ62_LAST_DATE_STRING_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_LAST_DATE_STRING);
    public static final ChannelUID TECHEM_WZ62_LAST_DATE_NUMBER_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_LAST_DATE_NUMBER);
    public static final ChannelUID TECHEM_WZ62_CURRENT_DATE_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_CURRENT_DATE);
    public static final ChannelUID TECHEM_WZ62_CURRENT_DATE_STRING_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_CURRENT_DATE_STRING);
    public static final ChannelUID TECHEM_WZ62_CURRENT_DATE_NUMBER_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_CURRENT_DATE_NUMBER);
    public static final ChannelUID TECHEM_WZ62_RECEPTION_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_RECEPTION);
    public static final ChannelUID TECHEM_WZ62_COUNTER_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_COUNTER);
    public static final ChannelUID TECHEM_WZ62_ALMANAC_UID = new ChannelUID(TECHEM_WZ62_THING_TYPE_UID, CID_ALMANAC);

    // ChannelUIDs for techem_wz72
    public static final ChannelUID TECHEM_WZ72_CURRENT_READING_UID = new ChannelUID(TECHEM_WZ72_THING_TYPE_UID, CID_CURRENT_READING);
    public static final ChannelUID TECHEM_WZ72_LAST_READING_UID = new ChannelUID(TECHEM_WZ72_THING_TYPE_UID, CID_LAST_READING);
    public static final ChannelUID TECHEM_WZ72_LAST_DATE_UID = new ChannelUID(TECHEM_WZ72_THING_TYPE_UID, CID_LAST_DATE);
    public static final ChannelUID TECHEM_WZ72_LAST_DATE_STRING_UID = new ChannelUID(TECHEM_WZ72_THING_TYPE_UID, CID_LAST_DATE_STRING);
    public static final ChannelUID TECHEM_WZ72_LAST_DATE_NUMBER_UID = new ChannelUID(TECHEM_WZ72_THING_TYPE_UID, CID_LAST_DATE_NUMBER);
    public static final ChannelUID TECHEM_WZ72_CURRENT_DATE_UID = new ChannelUID(TECHEM_WZ72_THING_TYPE_UID, CID_CURRENT_DATE);
    public static final ChannelUID TECHEM_WZ72_CURRENT_DATE_STRING_UID = new ChannelUID(TECHEM_WZ72_THING_TYPE_UID, CID_CURRENT_DATE_STRING);
    public static final ChannelUID TECHEM_WZ72_CURRENT_DATE_NUMBER_UID = new ChannelUID(TECHEM_WZ72_THING_TYPE_UID, CID_CURRENT_DATE_NUMBER);
    public static final ChannelUID TECHEM_WZ72_RECEPTION_UID = new ChannelUID(TECHEM_WZ72_THING_TYPE_UID, CID_RECEPTION);

    // ChannelUIDs for techem_wmz43
    public static final ChannelUID TECHEM_WMZ43_CURRENT_READING_UID = new ChannelUID(TECHEM_WMZ43_THING_TYPE_UID, CID_CURRENT_READING);
    public static final ChannelUID TECHEM_WMZ43_LAST_READING_UID = new ChannelUID(TECHEM_WMZ43_THING_TYPE_UID, CID_LAST_READING);
    public static final ChannelUID TECHEM_WMZ43_LAST_DATE_UID = new ChannelUID(TECHEM_WMZ43_THING_TYPE_UID, CID_LAST_DATE);
    public static final ChannelUID TECHEM_WMZ43_LAST_DATE_STRING_UID = new ChannelUID(TECHEM_WMZ43_THING_TYPE_UID, CID_LAST_DATE_STRING);
    public static final ChannelUID TECHEM_WMZ43_LAST_DATE_NUMBER_UID = new ChannelUID(TECHEM_WMZ43_THING_TYPE_UID, CID_LAST_DATE_NUMBER);
    public static final ChannelUID TECHEM_WMZ43_CURRENT_DATE_UID = new ChannelUID(TECHEM_WMZ43_THING_TYPE_UID, CID_CURRENT_DATE);
    public static final ChannelUID TECHEM_WMZ43_CURRENT_DATE_STRING_UID = new ChannelUID(TECHEM_WMZ43_THING_TYPE_UID, CID_CURRENT_DATE_STRING);
    public static final ChannelUID TECHEM_WMZ43_CURRENT_DATE_NUMBER_UID = new ChannelUID(TECHEM_WMZ43_THING_TYPE_UID, CID_CURRENT_DATE_NUMBER);
    public static final ChannelUID TECHEM_WMZ43_RECEPTION_UID = new ChannelUID(TECHEM_WMZ43_THING_TYPE_UID, CID_RECEPTION);

    // ChannelUIDs for meter

    // ChannelUIDs for encrypted_meter

    // ChannelUIDs for thing_with_groups

    // ChannelUIDs for ego-tcp

    private OpenHabConstants () {}

}
