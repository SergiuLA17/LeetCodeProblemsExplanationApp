package com.example.leetcodeproblems.DataAccesLayer.dao;

import com.example.leetcodeproblems.CommonLayer.entity.info.*;
import com.example.leetcodeproblems.CommonLayer.entity.practice.enumpractice;
import com.example.leetcodeproblems.CommonLayer.entity.quiz.quiz;
import com.example.leetcodeproblems.CommonLayer.entity.spring.scopeinfo;
import com.example.leetcodeproblems.DataAccesLayer.repository.info.*;
import com.example.leetcodeproblems.DataAccesLayer.repository.practice.EnumPracticeRep;
import com.example.leetcodeproblems.DataAccesLayer.repository.quiz.QuizRep;
import com.example.leetcodeproblems.DataAccesLayer.repository.spring.ScopeInfoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

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
    private ClassesRep classesRep;
    @Autowired
    private NullRep nullRep;
    @Autowired
    private StaticWordRep staticWordRep;
    @Autowired
    private PooInfoRep pooInfoRep;
    @Autowired
    private GetterSetterRep getterSetterRep;
    @Autowired
    private ModificatrRep  modificators;
    @Autowired
    private MostenireRep mostenireRep;
    @Autowired
    private AbstractClassRep abstractClassRep;
    @Autowired
    private InterfaceClassRep interfaceClassRep;
    @Autowired
    private HashTableClass hashTableClass;
    @Autowired
    private StackInfoRep stackInfoRep;
    @Autowired
    private TreeSetInfo treeSetInfo;
    @Autowired
    private redblacktreeinfo redblacktreeinfo;
    @Autowired
    private EnumInfoRep enumInfoRep;
    @Autowired
    private EnumPracticeRep enumPracticeRep;
    @Autowired
    private ScopeInfoRep scopeInfoRep;
    @Autowired
    QuizRep quizRep;




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

    public Iterable<gettersetter> findsAllSetterGettre() {return getterSetterRep.findAll();}

    public Iterable<modificators> findAllmodificatros() {return modificators.findAll();}

    public Iterable<mostenire> findAllMostenire() {return mostenireRep.findAll();}

    public Iterable<abstractclass> findAllAbstractClass() {return abstractClassRep.findAll();}

    public Iterable<interfaceclass> findAllInterfaceClass() {return interfaceClassRep.findAll();}

    public Iterable<hashtableinfo> findAllHashTable() {return hashTableClass.findAll();}

    public Iterable<stackinfo> findAllStackInfo() {return stackInfoRep.findAll();}

    public Iterable<treesetinfo> findAllTreeSetInfo() {return treeSetInfo.findAll();}

    public Iterable<redblacktree> findAllRedBlackInfo() {return redblacktreeinfo.findAll();}

    public Iterable<enuminfo> findEnumInfoAll() {return enumInfoRep.findAll();}

    public Iterable<enumpractice> findAllEnumPractice() {return enumPracticeRep.findAll();}

    public Iterable<scopeinfo> findAllScopeInfo() {return scopeInfoRep.findAll();}

    public Iterable<quiz> findAllQuiz(){
        return quizRep.findAll();
    }

    public void saveDataQuiz(int data){
        quiz quiz = new quiz();
        quiz.setDate(LocalDate.now());
        quiz.setData(data);
        quizRep.save(quiz);
    }
}
