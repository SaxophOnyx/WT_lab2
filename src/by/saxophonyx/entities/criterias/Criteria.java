package by.saxophonyx.entities.criterias;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
    private final String groupSearchName;
    private Map<String, Object> criteria;


    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
        this.criteria =  new HashMap<>();
    }


    public Map<String, Object> getCriteria() {
        return criteria;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    /**
     * Adds a set of property and its desired value to map of criteria.
     *
     * @param searchCriteria searched criteria
     * @param value          desired value
     */
    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

}