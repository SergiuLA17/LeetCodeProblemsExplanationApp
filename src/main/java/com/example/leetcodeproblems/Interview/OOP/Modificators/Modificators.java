package com.example.leetcodeproblems.Interview.OOP.Modificators;
//incapsularea in java
//este izolarea unor date de la user de care el nu are nevoie

public class Modificators {
    private String setterOptions;
    private String thisKeyword;
    private String getterOptions;
    protected int x;

    public int getX() {
        getterOptions = """
                getter
                Putem sa folosim getteri pentru a accesa variabilele private
                """;
        return x;
    }


    public void setX(int x) {
        setterOptions = """
                Setter
                    Putem adauga oarecare logica
                    Putem verifica daca valoarea este corecta.
                    Putem face conversii de tipuri.
                    Putem face conversii de unitati de masura.
                    Putem face conversii de valori.
                """;
        thisKeyword = """
                this
                    this este un keyword care se foloseste pentru a face referire la obiectul curent.
                    this este folosit pentru a face referire la variabilele de instanta.
                    this este folosit pentru a face referire la metodele de instanta.
                """;
        this.x = x;

    }


    public void printInfoAboutModificators() {
        System.out.println("======================================================");
        System.out.println("                        Informatie despre modificatori");
        String privateModificator = """
                private
                    este un modificator de acces
                    pentru  clasele mostenite variabilele nu sunt vizibile
                    pentru clasele din acelasi pachet variabilele nu sunt vizibile
                    pentru clasele din alte pachete variabilele nu sunt vizibile
                    pentru clasele din alte proiecte variabilele nu sunt vizibile
                """;
        System.out.println(privateModificator);
        String publicModificator = """
                public
                    este un modificator de acces
                    pentru  clasele mostenite variabilele sunt vizibile
                    pentru clasele din acelasi pachet variabilele sunt vizibile
                    pentru clasele din alte pachete variabilele sunt vizibile
                    pentru clasele din alte proiecte variabilele sunt vizibile
                """;
        System.out.println(publicModificator);
        String defaultModificator = """
                default
                    este un modificator de acces
                    pentru  clasele mostenite variabilele nu sunt vizibile
                    pentru clasele din acelasi pachet variabilele sunt vizibile
                    pentru clasele din alte pachete variabilele nu sunt vizibile
                    pentru clasele din alte proiecte variabilele nu sunt vizibile
                """;
        System.out.println(defaultModificator);
        String protectedModificator = """
                protected
                    este un modificator de acces
                    pentru  clasele mostenite variabilele sunt vizibile
                    pentru clasele din acelasi pachet variabilele sunt vizibile
                    pentru clasele din alte pachete variabilele nu sunt vizibile
                    pentru clasele din alte proiecte variabilele nu sunt vizibile
                """;
        System.out.println(protectedModificator);
    }

    public void printInfoAboutSetterAndGetter() {
        setX(10);
        getX();
        System.out.println("======================================================");
        System.out.println("                    Informatie despre Setter si Getter");
        System.out.println(setterOptions);
        System.out.println(thisKeyword);
        System.out.println(getterOptions);
    }


}
