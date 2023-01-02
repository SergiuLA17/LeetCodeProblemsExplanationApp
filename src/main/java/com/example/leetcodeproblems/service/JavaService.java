package com.example.leetcodeproblems.service;

import com.example.leetcodeproblems.model.entity.Web.*;
import com.example.leetcodeproblems.model.entity.answers.*;
import com.example.leetcodeproblems.model.entity.collections.*;
import com.example.leetcodeproblems.model.entity.git.*;
import com.example.leetcodeproblems.model.entity.info.*;
import com.example.leetcodeproblems.model.entity.patterns.*;
import com.example.leetcodeproblems.model.entity.practice.*;
import com.example.leetcodeproblems.model.entity.principies.dry.dryinfo;
import com.example.leetcodeproblems.model.entity.principies.kiss.kissinfo;
import com.example.leetcodeproblems.model.entity.principies.solid.*;
import com.example.leetcodeproblems.model.entity.principies.yagni.yagniinfo;
import com.example.leetcodeproblems.model.entity.quiz.quiz;
import com.example.leetcodeproblems.model.entity.spring.*;
import com.example.leetcodeproblems.model.entity.sql.countinfo;
import com.example.leetcodeproblems.model.entity.sql.groupbyinfo;
import com.example.leetcodeproblems.model.entity.sql.joinsinfo;
import com.example.leetcodeproblems.repository.answer.*;
import com.example.leetcodeproblems.repository.collections.dequeinfoRep;
import com.example.leetcodeproblems.repository.collections.mapinfoRep;
import com.example.leetcodeproblems.repository.collections.queueinfoRep;
import com.example.leetcodeproblems.repository.collections.sortedmapinfoRep;
import com.example.leetcodeproblems.repository.git.*;
import com.example.leetcodeproblems.repository.info.*;
import com.example.leetcodeproblems.repository.patterns.gofinfoRep;
import com.example.leetcodeproblems.repository.patterns.graspinfoRep;
import com.example.leetcodeproblems.repository.practice.EnumPracticeRep;
import com.example.leetcodeproblems.repository.practice.sqlpracticeRep;
import com.example.leetcodeproblems.repository.principies.dry.dryRep;
import com.example.leetcodeproblems.repository.principies.kiss.kissinfoRep;
import com.example.leetcodeproblems.repository.principies.solid.*;
import com.example.leetcodeproblems.repository.principies.yagni.yagniRep;
import com.example.leetcodeproblems.repository.quiz.QuizRep;
import com.example.leetcodeproblems.repository.spring.*;
import com.example.leetcodeproblems.repository.sql.countinfoRep;
import com.example.leetcodeproblems.repository.sql.groupbyinfoRep;
import com.example.leetcodeproblems.repository.sql.joininfoRep;
import com.example.leetcodeproblems.repository.Web.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private QuizRep quizRep;
    @Autowired
    private beaninfoRep beanIngfoRep;
    @Autowired
    private iocinfoRep iocinfo;
    @Autowired
    private configinfoRep configinfoRep;
    @Autowired
    private componentinfoRep componentinfoRep;
    @Autowired
    private importinfoRep importinfoRep;
    @Autowired
    private joininfoRep joininfoRep;
    @Autowired
    private sqlpracticeRep sqlpracticeRep;
    @Autowired
    private countinfoRep countinfoRep;
    @Autowired
    private groupbyinfoRep groupbyinfoRep;
    @Autowired
    private oopanswerRep oopanswerRep;
    @Autowired
    private  collectionanswerRep collectionanswerRep;
    @Autowired
    private  queueinfoRep queueinfoRep;
    @Autowired
    private dequeinfoRep dequeinfoRep;
    @Autowired
    private mapinfoRep mapinfoRep;
    @Autowired
    private sortedmapinfoRep sortedmapinfoRep;
    @Autowired
    private solidinfoRep solidinfoRep;
    @Autowired
    private soliddipRep soliddipRep;
    @Autowired
    private solidispRep solidispRep;
    @Autowired
    private solidocpRep solidocpRep;
    @Autowired
    private solidsrpRep  solidsrpRep;
    @Autowired
    private solidlspRep solidlspRep;
    @Autowired
    private solidanswerRep solidanswerRep;
    @Autowired
    private kissinfoRep kissinfoRep;
    @Autowired
    private kissanswerRep kissanswerRep;
    @Autowired
    private dryRep dryinfoRep;
    @Autowired
    private dryanswerRep dryanswerRep;
    @Autowired
    private yagniRep yagniRep;
    @Autowired
    private yagnianswerRep yagnianswerRep;
    @Autowired
    private gofinfoRep gofinfoRep;
    @Autowired
    private gofanswerRep gofanswerRep;
    @Autowired
    private graspinfoRep graspinfoRep;
    @Autowired
    private graspanswerRep graspanswerRep;
    @Autowired
    private restinfoRep restinfoRep;
    @Autowired
    private restanswerRep restanswerRep;
    @Autowired
    private soapinfoRep soapinfoRep;
    @Autowired
    private soapanswerRep soapanswerRep;
    @Autowired
    private gitcommandsRep gitcommandsRep;
    @Autowired
    private mergevsrebaseRep mergevsrebaseRep;




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

    public Iterable<beaninfo> finaAllBeanInfo() {return beanIngfoRep.findAll();}

    public Iterable<iocinfo> findIoCInfoAll() {return iocinfo.findAll();}

    public Iterable<configinfo> findConfigInfo() {return configinfoRep.findAll();}

    public Iterable<componentinfo> findComponenInfo() {return componentinfoRep.findAll();}

    public Iterable<importinfo> findImportInfo() {return importinfoRep.findAll();}

    public Iterable<joinsinfo> findAllJoinInfo() {return joininfoRep.findAll();}

    public Iterable<sqlpractice> findAllSqlPractice() {return sqlpracticeRep.findAll();}

    public Iterable<countinfo> fingCountInfo() {return countinfoRep.findAll();}

    public Iterable<groupbyinfo> findGroupByInfo() {return groupbyinfoRep.findAll();}

    public Iterable<oopanswer> findOOPanswer() {return oopanswerRep.findAll();}

    public Iterable<collectionanswer> findAllCollectionAnswer() {return collectionanswerRep.findAll();}

    public Iterable<queueinfo> findAllQueueInfo() {return queueinfoRep.findAll();}

    public Iterable<dequeinfo> findDequeInfo() {return dequeinfoRep.findAll();}

    public Iterable<mapinfo> findMapInfo() {return mapinfoRep.findAll();}

    public Iterable<sortedmapinfo> findSortedMapInfo() {return sortedmapinfoRep.findAll();}

    public Iterable<solidinfo> findSolidInfo() {return solidinfoRep.findAll();}

    public Iterable<soliddip> findSolidDIP() {return soliddipRep.findAll();}

    public Iterable<solidsrp> findSolidSRP() {return solidsrpRep.findAll();}

    public Iterable<solidlsp> findSolidLSP() {return solidlspRep.findAll();}

    public Iterable<solidocp> findSolidOCP() {return solidocpRep.findAll();}

    public Iterable<solidisp> findSolidISP() {return solidispRep.findAll();}

    public Iterable<solidanswer> findSolidAnswer() {return solidanswerRep.findAll();}

    public Iterable<kissinfo> findKissInfo() {return kissinfoRep.findAll();}

    public Iterable<kissanswer> findKISSanswer() {return kissanswerRep.findAll();}

    public Iterable<quiz> findAllQuiz(){
        return quizRep.findAll();
    }

    public Iterable<dryinfo> findAllDRY(){
        return dryinfoRep.findAll();
    }

    public Iterable<dryanswer> findAllDRYanswer(){
        return dryanswerRep.findAll();
    }

    public Iterable<yagniinfo> findYagniInfo(){
        return yagniRep.findAll();
    }

    public Iterable<yagnianswer> findYagniAnswer(){
        return yagnianswerRep.findAll();
    }

    public Iterable<gofinfo> findGOFinfo(){return gofinfoRep.findAll();
    }

    public Iterable<gofanswer> findGofAnswerInfo(){return gofanswerRep.findAll();
    }

    public Iterable<graspinfo> findAllGRASPinfo(){return graspinfoRep.findAll();
    }

    public Iterable<graspanswer> findAllGRASPAnswer(){return graspanswerRep.findAll();
    }

    public Iterable<restinfo> findRESTinfo(){return restinfoRep.findAll();
    }

    public Iterable<restanswer> findRESTanswer(){return restanswerRep.findAll();
    }

    public Iterable<soapinfo> findSOAPinfo(){return soapinfoRep.findAll();
    }

    public Iterable<soapanswer> findSOAPanswer(){return soapanswerRep.findAll();
    }

    public Iterable<gitcommands> findGITinfo(){return gitcommandsRep.findAll();
    }

    public Iterable<mergevsrebase> findMergeAndRebaseINFO(){return mergevsrebaseRep.findAll();
    }





    public void saveDataQuiz(int data){
        quiz quiz = new quiz();
        quiz.setDate(LocalDate.now());
        quiz.setData(data);
        quizRep.save(quiz);
    }

    public Model processModel(Model model, Iterable<?> iterable) {
        List<Object> arrayList = new ArrayList<>();
        iterable.forEach(arrayList::add);

        model.addAttribute("length", arrayList.size());
        model.addAttribute("dataList", arrayList);
        return model;
    }
}
