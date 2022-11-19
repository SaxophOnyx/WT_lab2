package by.saxophonyx.services;

import by.saxophonyx.entities.criterias.Criteria;
import by.saxophonyx.entities.criterias.SearchCriterias;

import java.util.Arrays;
import java.util.Set;

/**
 * Concrete criteria validator
 */
public class CriteriaValidator implements ICriteriaValidator{
    public CriteriaValidator() {

    }


    @Override
    public boolean validCriteria(Criteria criteria) {
        return switch (criteria.getGroupSearchName()) {
            case "Laptop" -> doesCriteriaExists(criteria, SearchCriterias.Laptop.class);
            case "Kettle" -> doesCriteriaExists(criteria, SearchCriterias.Kettle.class);
            case "Refrigerator" -> doesCriteriaExists(criteria, SearchCriterias.Refrigerator.class);
            case "Speakers" -> doesCriteriaExists(criteria, SearchCriterias.Speakers.class);
            case "TabletPC" -> doesCriteriaExists(criteria, SearchCriterias.TabletPC.class);
            case "VacuumCleaner" -> doesCriteriaExists(criteria, SearchCriterias.VacuumCleaner.class);
            default -> false;
        };
    }

    /**
     * Compares criteria to search criteria available for an appliance.
     *
     * @param criteria criteria to search for
     * @param e        all search criteria available for an appliance
     * @return true if appliance has all of criteria
     */
    private static boolean doesCriteriaExists(Criteria criteria, Class<? extends Enum<?>> e) {
        Set<String> properties = criteria.getCriteria().keySet();
        String[] arr = Arrays.stream(e.getEnumConstants()).map(Enum::toString).toArray(String[]::new);
        return Arrays.asList(arr).containsAll(properties);
    }
}