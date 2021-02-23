package kg.megacom;

public enum DeveloperGrades {
    JUNIOR("I'm junior developer"),
    MIDDLE("I'm middle level"),
    SENIOR("I'm senior developer"),
    TEAMLEAD("I'm teamleader");

    private String phrase;

    DeveloperGrades(String phrase) {
        this.phrase = phrase;
    }

    DeveloperGrades() {
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public  void printPhrase(){
        System.out.println(phrase);
    }
}
