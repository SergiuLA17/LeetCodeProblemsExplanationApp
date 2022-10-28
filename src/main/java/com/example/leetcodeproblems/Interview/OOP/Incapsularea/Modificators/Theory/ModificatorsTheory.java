package com.example.leetcodeproblems.Interview.OOP.Incapsularea.Modificators.Theory;

public  class ModificatorsTheory {
    public static void printInfoAboutModificators() {
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
}
