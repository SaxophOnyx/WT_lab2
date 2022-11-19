package by.saxophonyx.dao;

/**
 * A factory for creating ApplianceDAO.
 */
public final class ApplianceDAOFactory {
    private static final ApplianceDAOFactory instance = new ApplianceDAOFactory();


    private ApplianceDAOFactory() {

    }


    /**
     * Singleton instance of ApplianceDAOFactory
     */
    public static ApplianceDAOFactory getInstance() {
        return instance;
    }

    /**
     *
     * @param path path to the data file
     * @return instance of ApplianceDAO
     */
    public ApplianceDAO getApplianceDAO(String path) {
        return new ApplianceDAO(path);
    }
}