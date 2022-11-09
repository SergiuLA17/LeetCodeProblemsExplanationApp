package com.example.leetcodeproblems.Interview.OOP.Incapsularea.GetterAndSetter.Theory;

import org.springframework.stereotype.Component;

@Component
public class GetterAndSettersTheory {
    public int x;

    public GetterAndSettersTheory() {
    }

    public int getX() {
        String getterOptions = """
                getter
                Putem sa folosim getteri pentru a accesa variabilele private
                """;
        System.out.println(getterOptions);
        return x;
    }

    public void setX(int x) {
        String setterOptions = """
                Setter
                    Putem adauga oarecare logica
                    Putem verifica daca valoarea este corecta.
                    Putem face conversii de tipuri.
                    Putem face conversii de unitati de masura.
                    Putem face conversii de valori.
                """;
        String thisKeyword = """
                this
                    this este un keyword care se foloseste pentru a face referire la obiectul curent.
                    this este folosit pentru a face referire la variabilele de instanta.
                    this este folosit pentru a face referire la metodele de instanta.
                    nu putem atribui la this valoarea null.
                """;
        System.out.println(setterOptions);
        System.out.println(thisKeyword);
        this.x = x;

    }

    public void theory() {
        System.out.println("======================================================");
        System.out.println("                    Informatie despre Setter si Getter");
        System.out.println("Cea mai buna logica in settere su gettere este de a pune anumite restrictii in" +
                "scrierea codului, adica daca noi scrim un cod in grup, prin settere si gettere noi spunem," +
                "ca variabilele date nu sunt pentru folosire publica.");
        setX(10);
        getX();
    }
}
