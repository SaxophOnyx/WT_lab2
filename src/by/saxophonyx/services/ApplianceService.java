package by.saxophonyx.services;

import by.saxophonyx.dao.contracts.IApplianceDAO;
import by.saxophonyx.entities.Appliance;
import by.saxophonyx.entities.criterias.Criteria;
import by.saxophonyx.services.contracts.IApplianceService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Concrete appliance service.
 */
public class ApplianceService implements IApplianceService {
    private IApplianceDAO applianceDAO;
    private ICriteriaValidator validator;

    /**
     *
     * @param applianceDAO instance of appliance DTO
     * @param validator instance of appliance criteria validator
     */
    public ApplianceService(IApplianceDAO applianceDAO, ICriteriaValidator validator) {
        this.applianceDAO = applianceDAO;
        this.validator = validator;
    }


    @Override
    public List<Appliance> find(Criteria criteria) {
        if (validator.validCriteria(criteria)) {
            return applianceDAO.find(criteria);
        }
        else
            return null;
    }

    @Override
    public List<Appliance> sort(Comparator<Appliance> comparator) {
        List<Appliance> appliances = applianceDAO.parseAll();
        appliances.sort(comparator);
        return appliances;
    }

    @Override
    public List<Appliance> sort(Comparator<Appliance> comparator, List<Appliance> appliances) {
        appliances.sort(comparator);
        return appliances;
    }

    @Override
    public List<Appliance> getMin(Comparator<Appliance> comparator) {
        List<Appliance> appliances = applianceDAO.parseAll();
        Appliance min = appliances.stream().min(comparator).orElse(null);
        if (min != null) {
            return appliances.stream()
                    .filter(p -> comparator.compare(p, min) == 0)
                    .collect(Collectors.toList());
        }

        return new ArrayList<>();
    }

    @Override
    public List<Appliance> getMin(Comparator<Appliance> comparator, List<Appliance> appliances) {
        Appliance min = appliances.stream().min(comparator).orElse(null);
        if (min != null) {
            return appliances.stream()
                    .filter(p -> comparator.compare(p, min) == 0)
                    .collect(Collectors.toList());
        }

        return new ArrayList<>();
    }

    @Override
    public void save(List<Appliance> appliances){
        applianceDAO.save(appliances);
    }
}