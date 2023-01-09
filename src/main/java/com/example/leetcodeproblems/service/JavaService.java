package com.example.leetcodeproblems.service;

import com.example.leetcodeproblems.model.entity.Web.restinfo;
import com.example.leetcodeproblems.model.entity.Web.soapinfo;
import com.example.leetcodeproblems.model.entity.answers.*;
import com.example.leetcodeproblems.model.entity.collections.dequeinfo;
import com.example.leetcodeproblems.model.entity.collections.mapinfo;
import com.example.leetcodeproblems.model.entity.collections.queueinfo;
import com.example.leetcodeproblems.model.entity.collections.sortedmapinfo;
import com.example.leetcodeproblems.model.entity.exception.check;
import com.example.leetcodeproblems.model.entity.exception.exception;
import com.example.leetcodeproblems.model.entity.git.gitcommands;
import com.example.leetcodeproblems.model.entity.git.mergevsrebase;
import com.example.leetcodeproblems.model.entity.info.*;
import com.example.leetcodeproblems.model.entity.patterns.gofinfo;
import com.example.leetcodeproblems.model.entity.patterns.graspinfo;
import com.example.leetcodeproblems.model.entity.practice.enumpractice;
import com.example.leetcodeproblems.model.entity.practice.sqlpractice;
import com.example.leetcodeproblems.model.entity.principies.dry.dryinfo;
import com.example.leetcodeproblems.model.entity.principies.kiss.kissinfo;
import com.example.leetcodeproblems.model.entity.principies.solid.*;
import com.example.leetcodeproblems.model.entity.principies.yagni.yagniinfo;
import com.example.leetcodeproblems.model.entity.quiz.quiz;
import com.example.leetcodeproblems.model.entity.spring.*;
import com.example.leetcodeproblems.model.entity.sql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class JavaService {
    @Autowired
    References references;




    public Iterable<Java> findJavaAll() {return references.getJavaRepository().findAll();}

    public Iterable<Methods> findMethodsAll() {
        return references.getMethodsRepository().findAll();
    }

    public Iterable<Primitive> findPrimitiveAll() {
        return references.getPrimitiveRepository().findAll();
    }

    public Iterable<Bytes> findBytesAll() {
        return references.getBytesRepository().findAll();
    }

    public Iterable<Autoboxing> findAutoBoxingAll() {
        return references.getAutoBoxingRepository().findAll();
    }

    public Iterable<Constructors> findConstructorAll() {
        return references.getConstructorsRepository().findAll();
    }

    public Iterable<Immutable> findImmutableAll() {
        return references.getImmutableRepository().findAll();
    }

    public Iterable<Referinta> findReferintaAll() {return references.getReferintaRepository().findAll();}

    public Iterable<Collections> findCollectionsAll() {return references.getCollectionsRepository().findAll();}

    public Iterable<Hashsets> findHashSetsAll() {return references.getHashSetsRepository().findAll();}

    public Iterable<Iterables> findIterablesAll() {return references.getIterablesRepository().findAll();}

    public Iterable<Lists> listsFindAll() {return references.getListsRepository().findAll();}

    public Iterable<Arraylists> findArrayListsAll() {return references.getArrayaListsRepository().findAll();}

    public Iterable<Sets> findSetsAll() {return references.getSetsRepository().findAll();}

    public Iterable<convertstringtoarrtolist> findConvertStringToArrayList() {return references.getConvertArrayToListRepository().findAll();}

    public Iterable<interview> findInterviewAll() {return references.getInterviewRep().findAll();}

    public Iterable<Classes> findCLassesAll() {return references.getClassesRep().findAll();}

    public Iterable<Nullword> findAllNull() {return references.getNullRep().findAll();}

    public Iterable<Staticword> findStaticAll() {return references.getStaticWordRep().findAll();}

    public Iterable<pooinfo> findPooInfoALl() {return references.getPooInfoRep().findAll();}

    public Iterable<gettersetter> findsAllSetterGettre() {return references.getGetterSetterRep().findAll();}

    public Iterable<modificators> findAllmodificatros() {return references.getModificators().findAll();}

    public Iterable<mostenire> findAllMostenire() {return references.getMostenireRep().findAll();}

    public Iterable<abstractclass> findAllAbstractClass() {return references.getAbstractClassRep().findAll();}

    public Iterable<interfaceclass> findAllInterfaceClass() {return references.getInterfaceClassRep().findAll();}

    public Iterable<hashtableinfo> findAllHashTable() {return references.getHashTableClass().findAll();}

    public Iterable<stackinfo> findAllStackInfo() {return references.getStackInfoRep().findAll();}

    public Iterable<treesetinfo> findAllTreeSetInfo() {return references.getTreeSetInfo().findAll();}

    public Iterable<redblacktree> findAllRedBlackInfo() {return references.getRedblacktreeinfo().findAll();}

    public Iterable<enuminfo> findEnumInfoAll() {return references.getEnumInfoRep().findAll();}

    public Iterable<enumpractice> findAllEnumPractice() {return references.getEnumPracticeRep().findAll();}

    public Iterable<scopeinfo> findAllScopeInfo() {return references.getScopeInfoRep().findAll();}

    public Iterable<beaninfo> finaAllBeanInfo() {return references.getBeanIngfoRep().findAll();}

    public Iterable<iocinfo> findIoCInfoAll() {return references.getIocinfo().findAll();}

    public Iterable<configinfo> findConfigInfo() {return references.getConfiginfoRep().findAll();}

    public Iterable<componentinfo> findComponenInfo() {return references.getComponentinfoRep().findAll();}

    public Iterable<importinfo> findImportInfo() {return references.getImportinfoRep().findAll();}

    public Iterable<joinsinfo> findAllJoinInfo() {return references.getJoininfoRep().findAll();}

    public Iterable<sqlpractice> findAllSqlPractice() {return references.getSqlpracticeRep().findAll();}

    public Iterable<countinfo> fingCountInfo() {return references.getCountinfoRep().findAll();}

    public Iterable<groupbyinfo> findGroupByInfo() {return references.getGroupbyinfoRep().findAll();}

    public Iterable<oopanswer> findOOPanswer() {return references.getOopanswerRep().findAll();}

    public Iterable<collectionanswer> findAllCollectionAnswer() {return references.getCollectionanswerRep().findAll();}

    public Iterable<queueinfo> findAllQueueInfo() {return references.getQueueinfoRep().findAll();}

    public Iterable<dequeinfo> findDequeInfo() {return references.getDequeinfoRep().findAll();}

    public Iterable<mapinfo> findMapInfo() {return references.getMapinfoRep().findAll();}

    public Iterable<sortedmapinfo> findSortedMapInfo() {return references.getSortedmapinfoRep().findAll();}

    public Iterable<solidinfo> findSolidInfo() {return references.getSolidinfoRep().findAll();}

    public Iterable<soliddip> findSolidDIP() {return references.getSoliddipRep().findAll();}

    public Iterable<solidsrp> findSolidSRP() {return references.getSolidsrpRep().findAll();}

    public Iterable<solidlsp> findSolidLSP() {return references.getSolidlspRep().findAll();}

    public Iterable<solidocp> findSolidOCP() {return references.getSolidocpRep().findAll();}

    public Iterable<solidisp> findSolidISP() {return references.getSolidispRep().findAll();}

    public Iterable<solidanswer> findSolidAnswer() {return references.getSolidanswerRep().findAll();}

    public Iterable<kissinfo> findKissInfo() {return references.getKissinfoRep().findAll();}

    public Iterable<kissanswer> findKISSanswer() {return references.getKissanswerRep().findAll();}

    public Iterable<quiz> findAllQuiz(){
        return references.getQuizRep().findAll();
    }

    public Iterable<dryinfo> findAllDRY(){
        return references.getDryinfoRep().findAll();
    }

    public Iterable<dryanswer> findAllDRYanswer(){
        return references.getDryanswerRep().findAll();
    }

    public Iterable<yagniinfo> findYagniInfo(){
        return references.getYagniRep().findAll();
    }

    public Iterable<yagnianswer> findYagniAnswer(){
        return references.getYagnianswerRep().findAll();
    }

    public Iterable<gofinfo> findGOFinfo(){return references.getGofinfoRep().findAll();
    }

    public Iterable<gofanswer> findGofAnswerInfo(){return references.getGofanswerRep().findAll();
    }

    public Iterable<graspinfo> findAllGRASPinfo(){return references.getGraspinfoRep().findAll();
    }

    public Iterable<graspanswer> findAllGRASPAnswer(){return references.getGraspanswerRep().findAll();
    }

    public Iterable<restinfo> findRESTinfo(){return references.getRestinfoRep().findAll();
    }

    public Iterable<restanswer> findRESTanswer(){return references.getRestanswerRep().findAll();
    }

    public Iterable<soapinfo> findSOAPinfo(){return references.getSoapinfoRep().findAll();
    }

    public Iterable<soapanswer> findSOAPanswer(){return references.getSoapanswerRep().findAll();
    }

    public Iterable<gitcommands> findGITinfo(){return references.getGitcommandsRep().findAll();
    }

    public Iterable<mergevsrebase> findMergeAndRebaseINFO(){return references.getMergevsrebaseRep().findAll();
    }

    public Iterable<acidinfo> findACIDinfo(){return references.getAcidinfoRep().findAll();
    }

    public Iterable<normalforminfo> findNormalFormInfo(){return references.getNormalforminfoRep().findAll();
    }

    public Iterable<isolationlevel> findIsolationLevelInfo(){return references.getIsolationlevelRep().findAll();
    }

    public Iterable<jmminfo> findJMMinfo(){return references.getJmminfo().findAll();
    }

    public Iterable<gcinfo> fincGarbageCOllectorInfo(){return references.getGcinfoRep().findAll();
    }

    public Iterable<lcbeaninfo> lyfeCycleBeanInfo(){return references.getLcbeaninfoRep().findAll();
    }

    public Iterable<omainfo> findOMAinfp(){return references.getOmainfoRep().findAll();
    }

    public Iterable<jpainfo> findJPAinfo(){return references.getJpainfoRep().findAll();
    }

    public Iterable<hibernateinfo> findHibernateinfo(){return references.getHibernateinfoRep().findAll();
    }

    public Iterable<exception> findExceptioninfo(){return references.getExceptioninfoRep().findAll();
    }

    public Iterable<check> findCheckExceptioRep(){return references.getCheckRep().findAll();
    }

    public Iterable<exceptionanswer> findExceptionAnswerInfo(){return references.getExceptionanswerRep().findAll();
    }





    public void saveDataQuiz(int data){
        quiz quiz = new quiz();
        quiz.setDate(LocalDate.now());
        quiz.setData(data);
        references.getQuizRep().save(quiz);
    }

    public Model processModel(Model model, Iterable<?> iterable) {
        List<Object> arrayList = new ArrayList<>();
        iterable.forEach(arrayList::add);

        model.addAttribute("length", arrayList.size());
        model.addAttribute("dataList", arrayList);
        return model;
    }
}
