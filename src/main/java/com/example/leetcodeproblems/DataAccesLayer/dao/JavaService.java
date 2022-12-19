package com.example.leetcodeproblems.DataAccesLayer.dao;

import com.example.leetcodeproblems.CommonLayer.entity.*;
import com.example.leetcodeproblems.DataAccesLayer.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaService {
    @Autowired
    private interviewRep interviewRep;
    @Autowired
    private JavaRepository javaRepository;
    @Autowired
    private MethodsRepository methodsRepository;
    @Autowired
    private PrimitiveRepository primitiveRepository;
    @Autowired
    private BytesRepository bytesRepository;
    @Autowired
    private AutoBoxingRepository autoBoxingRepository;
    @Autowired
    private ConstructorsRepository constructorsRepository;
    @Autowired
    private ImmutableRepository immutableRepository;
    @Autowired
    private ReferintaRepository referintaRepository;
    @Autowired
    private ColletctionsRepository collectionsRepository;
    @Autowired
    private HashSetsRepository hashSetsRepository;
    @Autowired
    private IterablesRepository iterablesRepository;
    @Autowired
    private ListsRepository listsRepository;
    @Autowired
    private ArrayaListsRepository arrayaListsRepository;
    @Autowired
    private SetsRepository setsRepository;
    @Autowired
    private ConvertArrayToListRepository convertArrayToListRepository;
    @Autowired
    private ClassesRep  classesRep;
    @Autowired
    private NullRep nullRep;
    @Autowired
    private StaticWordRep staticWordRep;
    @Autowired
    private PooInfoRep pooInfoRep;




    public Iterable<Java> findJavaAll() {return javaRepository.findAll();}

    public Iterable<Methods> findMethodsAll() {
        return methodsRepository.findAll();
    }

    public Iterable<Primitive> findPrimitiveAll() {
        return primitiveRepository.findAll();
    }

    public Iterable<Bytes> findBytesAll() {
        return bytesRepository.findAll();
    }

    public Iterable<Autoboxing> findAutoBoxingAll() {
        return autoBoxingRepository.findAll();
    }

    public Iterable<Constructors> findConstructorAll() {
        return constructorsRepository.findAll();
    }

    public Iterable<Immutable> findImmutableAll() {
        return immutableRepository.findAll();
    }

    public Iterable<Referinta> findReferintaAll() {return referintaRepository.findAll();}

    public Iterable<Collections> findCollectionsAll() {return collectionsRepository.findAll();}

    public Iterable<Hashsets> findHashSetsAll() {return hashSetsRepository.findAll();}

    public Iterable<Iterables> findIterablesAll() {return iterablesRepository.findAll();}

    public Iterable<Lists> listsFindAll() {return listsRepository.findAll();}

    public Iterable<Arraylists> findArrayListsAll() {return arrayaListsRepository.findAll();}

    public Iterable<Sets> findSetsAll() {return setsRepository.findAll();}

    public Iterable<convertstringtoarrtolist> findConvertStringToArrayList() {return convertArrayToListRepository.findAll();}

    public Iterable<interview> findInterviewAll() {return interviewRep.findAll();}

    public Iterable<Classes> findCLassesAll() {return classesRep.findAll();}

    public Iterable<Nullword> findAllNull() {return nullRep.findAll();}

    public Iterable<Staticword> findStaticAll() {return staticWordRep.findAll();}

    public Iterable<pooinfo> findPooInfoALl() {return pooInfoRep.findAll();}


}
