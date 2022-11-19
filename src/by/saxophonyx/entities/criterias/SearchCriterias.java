package by.saxophonyx.entities.criterias;

/**
 * Class containing enums of all appliances type that specify appliance's
 * criteria that can be searched for.
 */
public final class SearchCriterias {
    public static enum Laptop {
        BATTERY_CAPACITY("batteryCapacity"),
        OS("OS"),
        MEMORY_ROM("memoryRom"),
        SYSTEM_MEMORY("systemMemory"),
        CPU("cpu"),
        DISPLAY_INCHES("displayInches"),
        NAME("name"),
        PRICE("price");

        private final String value;

        Laptop(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public static enum Kettle {
        POWER_CONSUMPTION("powerConsumption"),
        WEIGHT("weight"),
        CAPACITY("capacity"),
        DEPTH("depth"),
        HEIGHT("height"),
        WIDTH("width"),
        NAME("name"),
        PRICE("price");

        private final String value;

        Kettle(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public static enum Refrigerator {
        POWER_CONSUMPTION("powerConsumption"),
        WEIGHT("weight"),
        FREEZER_CAPACITY("freezerCapacity"),
        OVERALL_CAPACITY("overallCapacity"),
        HEIGHT("height"),
        WIDTH("width"),
        NAME("name"),
        PRICE("price");

        private final String value;

        Refrigerator(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public static enum VacuumCleaner {
        POWER_CONSUMPTION("powerConsumption"),
        FILTER_TYPE("filterType"),
        BAG_TYPE("bagType"),
        WAND_TYPE("wandType"),
        MOTOR_SPEED_REGULATION("motorSpeedRegulation"),
        CLEANING_WIDTH("cleaningWidth"),
        NAME("name"),
        PRICE("price");

        private final String value;

        VacuumCleaner(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public static enum TabletPC {
        BATTERY_CAPACITY("batteryCapacity"),
        DISPLAY_INCHES("displayInches"),
        MEMORY_ROM("memoryRom"),
        FLASH_MEMORY_CAPACITY("flashMemoryCapacity"),
        COLOR("color"),
        NAME("name"),
        PRICE("price");

        private final String value;

        TabletPC(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public static enum Speakers {
        POWER_CONSUMPTION("powerConsumption"),
        NUMBER_OF_SPEAKERS("numberOfSpeakers"),
        FREQUENCY_RANGE_MIN("frequencyRangeMin"),
        FREQUENCY_RANGE_MAX("frequencyRangeMax"),
        CORD_LENGTH("cordLength"),
        NAME("name"),
        PRICE("price");

        private final String value;

        Speakers(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private SearchCriterias() {

    }
}

