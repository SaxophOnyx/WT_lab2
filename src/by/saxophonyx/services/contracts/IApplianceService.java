package by.saxophonyx.services.contracts;

import by.saxophonyx.entities.Appliance;
import by.saxophonyx.entities.criterias.Criteria;

import java.util.Comparator;
import java.util.List;

/**
 * Interface for appliance services
 */
public interface IApplianceService {
    /**
     * Find for appliances by criteria.
     *
     * @param criteria the criteria for search
     * @return list of found appliances
     */
    List<Appliance> find(Criteria criteria);

    /**
     * Gets sorted by comparator appliances
     *
     * @param comparator for sorting appliances
     * @return list of sorted by comparator appliances
     */
    List<Appliance> sort(Comparator<Appliance> comparator, List<Appliance> appliances);

    /**
     * Sots all appliances.
     *
     * @param comparator specifies property to sort by
     * @return sorted list of appliances
     */
    List<Appliance> sort(Comparator<Appliance> comparator);

    /**
     * Finds appliances with minimal value of some property.
     *
     * @param comparator specifies property to compare by
     * @param appliances limited list of appliances to search among
     * @return list of appliances with minimal value of desired property
     */
    List<Appliance> getMin(Comparator<Appliance> comparator, List<Appliance> appliances);

    /**
     * Finds appliances with minimal value of some property among all appliances.
     *
     * @param comparator specifies property to compare by
     * @return list of appliances with minimal value of desired property
     */
    List<Appliance> getMin(Comparator<Appliance> comparator);

    /**
     * Saves a list of appliances.
     *
     * @param appliances list to save
     */
    void save(List<Appliance> appliances);
}
