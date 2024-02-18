abstract class RGPV {
    RGPV() {
        System.out.println("u r in rgpv");
    }

    abstract void bTech();

    void diploma() {
        System.out.println("Diploma in rgpv");
    }
}

class Global extends RGPV {
    @Override
    public void bTech() {
        System.out.println("CSE");
        System.out.println("IT");
        System.out.println("ME");
        System.out.println("CE");
        System.out.println("AI/ML");
    }

    public static void main(String[] args) {
        Global g = new Global();
        g.bTech();
        g.diploma();
    }
}