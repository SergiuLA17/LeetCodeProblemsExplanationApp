package com.example.leetcodeproblems.HtmlGenerate;

import com.example.leetcodeproblems.HtmlGenerate.Collection.Colectie;
import com.example.leetcodeproblems.HtmlGenerate.Collection.Iterable.Iterable;
import com.example.leetcodeproblems.HtmlGenerate.Collection.List.ListArray;
import com.example.leetcodeproblems.HtmlGenerate.Collection.List.ListInter;
import com.example.leetcodeproblems.HtmlGenerate.Collection.Set.HashSetCol;
import com.example.leetcodeproblems.HtmlGenerate.Collection.Set.SetCol;
import com.example.leetcodeproblems.HtmlGenerate.Collection.Set.TreeSetCol;
import com.example.leetcodeproblems.HtmlGenerate.Interview.Interview;
import com.example.leetcodeproblems.HtmlGenerate.Java.Clase.ClasaImmutabila;
import com.example.leetcodeproblems.HtmlGenerate.Java.Clase.Clase;
import com.example.leetcodeproblems.HtmlGenerate.Java.Clase.Constructor;
import com.example.leetcodeproblems.HtmlGenerate.Java.Clase.Metode;
import com.example.leetcodeproblems.HtmlGenerate.Java.Clase.Variabile.CuReferinta.AutoboxingUnboxing;
import com.example.leetcodeproblems.HtmlGenerate.Java.Clase.Variabile.CuReferinta.CuReferinta;
import com.example.leetcodeproblems.HtmlGenerate.Java.Clase.Variabile.Primitive.ByteVar;
import com.example.leetcodeproblems.HtmlGenerate.Java.Clase.Variabile.Primitive.Primitive;
import com.example.leetcodeproblems.HtmlGenerate.Java.Clase.Variabile.Variabile;
import com.example.leetcodeproblems.HtmlGenerate.Java.CuvinteCheie.Null;
import com.example.leetcodeproblems.HtmlGenerate.Java.CuvinteCheie.Static;
import com.example.leetcodeproblems.HtmlGenerate.Java.Java;
import com.example.leetcodeproblems.HtmlGenerate.POO.DataStructure.HashTable;
import com.example.leetcodeproblems.HtmlGenerate.POO.DataStructure.RedBlackTree;
import com.example.leetcodeproblems.HtmlGenerate.POO.DataStructure.Stack;
import com.example.leetcodeproblems.HtmlGenerate.POO.Incapsulare.GetterSetter;
import com.example.leetcodeproblems.HtmlGenerate.POO.Incapsulare.Incapsulare;
import com.example.leetcodeproblems.HtmlGenerate.POO.Incapsulare.Modificator;
import com.example.leetcodeproblems.HtmlGenerate.POO.Mostenire.Abstract;
import com.example.leetcodeproblems.HtmlGenerate.POO.Mostenire.Interfata;
import com.example.leetcodeproblems.HtmlGenerate.POO.Mostenire.Mostenire;
import com.example.leetcodeproblems.HtmlGenerate.POO.POO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlGenerate {
    public static void taskDetailsView(String component, String name) throws IOException {
        File f = new File("src/main/resources/templates/" + name);
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(Templates.menu);
        bw.write(component);
        bw.write(Templates.component);

        bw.close();

    }

    public static void main(String[] args) throws IOException {
        HtmlGenerate.generateAllFiles();
    }

    public static void generateAllFiles() throws IOException {
        Java.generateJava();
        Clase.generateJavaClass();
        Metode.generateClaseMetode();
        Primitive.generateClaseVariabilePrimitive();
        ByteVar.generateClaseVariabilePrimitiveByte();
        AutoboxingUnboxing.generateClaseVariabileReferintaAutobox();
        Variabile.generateVariabileMainGeneral();
        Constructor.generateClassConstructor();
        Interview.generateInterviewQuestion();
        Null.generateJavaCuvantCheieNull();
        POO.generatePooInfo();
        Incapsulare.generateIncapsulare();
        Stack.generateStructData();
        CuReferinta.generateVariabileReferinta();
        Static.generateCuvantCheieStatic();
        Mostenire.generateOOPMostenire();
        Interfata.generateOOPMostenireInterface();
        Abstract.generateOOPMostenireAbstract();
        Colectie.generateCollection();
        Iterable.generateCollectionIterable();
        ListInter.generateCollectionList();
        ListArray.generateCollectionListArrayList();
        SetCol.generateCollectionSet();
        HashTable.generateHashTable();
        GetterSetter.generateOOPIncapsulareGetterSetter();
        Modificator.generateOOPIncapsulareModificators();
        HashSetCol.generateCollectionHashSet();
        TreeSetCol.generateCollectionTreeSet();
        RedBlackTree.OOPStrucDataRedBlckTree();
        ClasaImmutabila.generateClassImmutableClass();


    }
}
