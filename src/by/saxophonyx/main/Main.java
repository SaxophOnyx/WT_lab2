package by.saxophonyx.main;

import by.saxophonyx.dao.ApplianceDAOFactory;
import by.saxophonyx.dao.contracts.IApplianceDAO;
import by.saxophonyx.entities.Appliance;
import by.saxophonyx.entities.criterias.Criteria;
import by.saxophonyx.entities.criterias.SearchCriterias;
import by.saxophonyx.services.ApplianceService;
import by.saxophonyx.services.CriteriaValidator;
import by.saxophonyx.services.ICriteriaValidator;
import by.saxophonyx.services.contracts.IApplianceService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static final String PATH = "src\\by\\saxophonyx\\datafiles\\appliances.xml";

    public static void main(String[] args) {
        IApplianceDAO dao = ApplianceDAOFactory.getInstance().getApplianceDAO(PATH);
        ICriteriaValidator validator = new CriteriaValidator();
        IApplianceService service = new ApplianceService(dao, validator);
        List<Appliance> appliances = new ArrayList<>();

        Criteria laptopCriteria = new Criteria(SearchCriterias.Laptop.class.getSimpleName());
        List<Appliance> laptops = service.find(laptopCriteria);
        appliances.addAll(laptops);

        Criteria refrigeratorCriteria = new Criteria(SearchCriterias.Refrigerator.class.getSimpleName());
        List<Appliance> refrigerators = service.find(refrigeratorCriteria);
        appliances.addAll(refrigerators);

        Criteria kettleCriteria = new Criteria(SearchCriterias.Kettle.class.getSimpleName());
        List<Appliance> kettles = service.find(kettleCriteria);
        appliances.addAll(kettles);

        Criteria vcCriteria = new Criteria(SearchCriterias.VacuumCleaner.class.getSimpleName());
        List<Appliance> vcs = service.find(vcCriteria);
        appliances.addAll(vcs);

        List<Appliance> minPriceAppliances = service.getMin(Comparator.comparing(Appliance::getPrice), appliances);
        if (minPriceAppliances != null) {
            System.out.println("The cheapest goods:");
            printAppliances(minPriceAppliances);
        }

        System.out.println("\nKettles:");
        printAppliances(kettles);
    }

        private static void printAppliances(Iterable<Appliance> appliances) {
            int counter = 0;
            for (var a : appliances) {
                ++counter;
                System.out.printf("  %d. %s\n", counter, a.toString());
            }

            System.out.println();
        }
}