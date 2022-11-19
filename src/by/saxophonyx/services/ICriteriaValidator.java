package by.saxophonyx.services;

import by.saxophonyx.entities.criterias.Criteria;

/**
 * Criteria validator
 */
public interface ICriteriaValidator {
    /**
     * Checks if criteria is valid
     *
     * @param criteria the criteria to validate
     * @return boolean if valid
     */
    public boolean validCriteria(Criteria criteria);
}
