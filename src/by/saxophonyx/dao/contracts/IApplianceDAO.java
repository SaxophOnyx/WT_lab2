package by.saxophonyx.dao.contracts;

import by.saxophonyx.entities.Appliance;
import by.saxophonyx.entities.criterias.Criteria;

import java.util.List;

public interface IApplianceDAO {
    /**
     * Gets all appliances from a file.
     *
     * @return list of all appliances
     */
    List<Appliance> parseAll();

    /**
     * Finds appliances that fit certain criteria.
     *
     * @param criteria a set of criteria
     * @return list of appliances that fit the criteria
     */
    List<Appliance> find(Criteria criteria);

    /**
     * Saves a list of appliances to a file.
     *
     * @param appliances list of appliances to save
     */
    void save(List<Appliance> appliances);
}