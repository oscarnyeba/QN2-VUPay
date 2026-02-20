public class VUCourses {
    
    // Variables / Attributes
    String moduleName;
    String moduleCode;
    double tuition;

    // Constructor
    public VUCourses(String moduleName, String moduleCode, double tuition) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.tuition = tuition;
    }

    // Getters
    public String getModuleName() { return moduleName; }
    public String getModuleCode() { return moduleCode; }
    public double getTuition()    { return tuition;    }

    // Display course details
    @Override
    public String toString() {
        return "Module Name : " + moduleName +
               "\nModule Code : " + moduleCode +
               "\nTuition     : UGX " + String.format("%,.0f", tuition);
    }
}