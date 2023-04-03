package Encapuslation;

public class ProgrammingFeeStructure
{
    private String LanguageName;
    private  int LanguageFees;
    private double Duration;
    private char Type;

    public String getLanguageName() {
        return LanguageName;
    }

    public void setLanguageName(String languageName) {
        LanguageName = languageName;
    }

    public int getLanguageFees() {
        return LanguageFees;
    }

    public void setLanguageFees(int languageFees) {
        LanguageFees = languageFees;
    }

    public double getDuration() {
        return Duration;
    }

    public void setDuration(double duration) {
        Duration = duration;
    }

    public char getType() {
        return Type;
    }

    public void setType(char type) {
        Type = type;
    }

    public Boolean getItProvideJob() {
        return ItProvideJob;
    }

    public void setItProvideJob(Boolean itProvideJob) {
        ItProvideJob = itProvideJob;
    }

    private Boolean ItProvideJob;



}
