package com.example.leetcodeproblems.service;

import com.example.leetcodeproblems.repository.Web.*;
import com.example.leetcodeproblems.repository.algorithms.sortmergeRep;
import com.example.leetcodeproblems.repository.answer.*;
import com.example.leetcodeproblems.repository.collections.*;
import com.example.leetcodeproblems.repository.exception.*;
import com.example.leetcodeproblems.repository.git.gitcommandsRep;
import com.example.leetcodeproblems.repository.git.mergevsrebaseRep;
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
import com.example.leetcodeproblems.repository.sql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class References {
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
    private collectionanswerRep collectionanswerRep;
    @Autowired
    private queueinfoRep queueinfoRep;
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
    private solidsrpRep solidsrpRep;
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
    @Autowired
    private acidinfoRep acidinfoRep;
    @Autowired
    private normalforminfoRep normalforminfoRep;
    @Autowired
    private isolationlevelRep isolationlevelRep;
    @Autowired
    private jmminfoRep jmminfo;
    @Autowired
    private gcinfoRep gcinfoRep;
    @Autowired
    private lcbeaninfoRep lcbeaninfoRep;
    @Autowired
    private omainfoRep omainfoRep;
    @Autowired
    private jpainfoRep jpainfoRep;
    @Autowired
    private hibernateinfoRep hibernateinfoRep;
    @Autowired
    private exceptionRep exceptioninfoRep;
    @Autowired
    private checkRep checkRep;
    @Autowired
    private exceptionanswerRep exceptionanswerRep;
    @Autowired
    private acidasnwerRep acidasnwerRep;
    @Autowired
    private sortmergeRep sortmergeRep;

    public sortmergeRep getSortmergeRep() { return sortmergeRep; }

    public acidasnwerRep getAcidasnwerRep() {return acidasnwerRep;}

    public exceptionanswerRep getExceptionanswerRep() {return exceptionanswerRep;}

    public checkRep getCheckRep() { return checkRep;}

    public exceptionRep getExceptioninfoRep() {
        return exceptioninfoRep;
    }

    public interviewRep getInterviewRep() {
        return interviewRep;
    }

    public JavaRepository getJavaRepository() {
        return javaRepository;
    }

    public MethodsRepository getMethodsRepository() {
        return methodsRepository;
    }

    public PrimitiveRepository getPrimitiveRepository() {
        return primitiveRepository;
    }

    public BytesRepository getBytesRepository() {
        return bytesRepository;
    }

    public AutoBoxingRepository getAutoBoxingRepository() {
        return autoBoxingRepository;
    }

    public ConstructorsRepository getConstructorsRepository() {
        return constructorsRepository;
    }

    public ImmutableRepository getImmutableRepository() {
        return immutableRepository;
    }

    public ReferintaRepository getReferintaRepository() {
        return referintaRepository;
    }

    public ColletctionsRepository getCollectionsRepository() {
        return collectionsRepository;
    }

    public HashSetsRepository getHashSetsRepository() {
        return hashSetsRepository;
    }

    public IterablesRepository getIterablesRepository() {
        return iterablesRepository;
    }

    public ListsRepository getListsRepository() {
        return listsRepository;
    }

    public ArrayaListsRepository getArrayaListsRepository() {
        return arrayaListsRepository;
    }

    public SetsRepository getSetsRepository() {
        return setsRepository;
    }

    public ConvertArrayToListRepository getConvertArrayToListRepository() {
        return convertArrayToListRepository;
    }

    public ClassesRep getClassesRep() {
        return classesRep;
    }

    public NullRep getNullRep() {
        return nullRep;
    }

    public StaticWordRep getStaticWordRep() {
        return staticWordRep;
    }

    public PooInfoRep getPooInfoRep() {
        return pooInfoRep;
    }

    public GetterSetterRep getGetterSetterRep() {
        return getterSetterRep;
    }

    public ModificatrRep getModificators() {
        return modificators;
    }

    public MostenireRep getMostenireRep() {
        return mostenireRep;
    }

    public AbstractClassRep getAbstractClassRep() {
        return abstractClassRep;
    }

    public InterfaceClassRep getInterfaceClassRep() {
        return interfaceClassRep;
    }

    public HashTableClass getHashTableClass() {
        return hashTableClass;
    }

    public StackInfoRep getStackInfoRep() {
        return stackInfoRep;
    }

    public TreeSetInfo getTreeSetInfo() {
        return treeSetInfo;
    }

    public redblacktreeinfo getRedblacktreeinfo() {
        return redblacktreeinfo;
    }

    public EnumInfoRep getEnumInfoRep() {
        return enumInfoRep;
    }

    public EnumPracticeRep getEnumPracticeRep() {
        return enumPracticeRep;
    }

    public ScopeInfoRep getScopeInfoRep() {
        return scopeInfoRep;
    }

    public QuizRep getQuizRep() {
        return quizRep;
    }

    public beaninfoRep getBeanIngfoRep() {
        return beanIngfoRep;
    }

    public iocinfoRep getIocinfo() {
        return iocinfo;
    }

    public configinfoRep getConfiginfoRep() {
        return configinfoRep;
    }

    public componentinfoRep getComponentinfoRep() {
        return componentinfoRep;
    }

    public importinfoRep getImportinfoRep() {
        return importinfoRep;
    }

    public joininfoRep getJoininfoRep() {
        return joininfoRep;
    }

    public sqlpracticeRep getSqlpracticeRep() {
        return sqlpracticeRep;
    }

    public countinfoRep getCountinfoRep() {
        return countinfoRep;
    }

    public groupbyinfoRep getGroupbyinfoRep() {
        return groupbyinfoRep;
    }

    public oopanswerRep getOopanswerRep() {
        return oopanswerRep;
    }

    public collectionanswerRep getCollectionanswerRep() {
        return collectionanswerRep;
    }

    public queueinfoRep getQueueinfoRep() {
        return queueinfoRep;
    }

    public dequeinfoRep getDequeinfoRep() {
        return dequeinfoRep;
    }

    public mapinfoRep getMapinfoRep() {
        return mapinfoRep;
    }

    public sortedmapinfoRep getSortedmapinfoRep() {
        return sortedmapinfoRep;
    }

    public solidinfoRep getSolidinfoRep() {
        return solidinfoRep;
    }

    public soliddipRep getSoliddipRep() {
        return soliddipRep;
    }

    public solidispRep getSolidispRep() {
        return solidispRep;
    }

    public solidocpRep getSolidocpRep() {
        return solidocpRep;
    }

    public solidsrpRep getSolidsrpRep() {
        return solidsrpRep;
    }

    public solidlspRep getSolidlspRep() {
        return solidlspRep;
    }

    public solidanswerRep getSolidanswerRep() {
        return solidanswerRep;
    }

    public kissinfoRep getKissinfoRep() {
        return kissinfoRep;
    }

    public kissanswerRep getKissanswerRep() {
        return kissanswerRep;
    }

    public dryRep getDryinfoRep() {
        return dryinfoRep;
    }

    public dryanswerRep getDryanswerRep() {
        return dryanswerRep;
    }

    public yagniRep getYagniRep() {
        return yagniRep;
    }

    public yagnianswerRep getYagnianswerRep() {
        return yagnianswerRep;
    }

    public gofinfoRep getGofinfoRep() {
        return gofinfoRep;
    }

    public gofanswerRep getGofanswerRep() {
        return gofanswerRep;
    }

    public graspinfoRep getGraspinfoRep() {
        return graspinfoRep;
    }

    public graspanswerRep getGraspanswerRep() {
        return graspanswerRep;
    }

    public restinfoRep getRestinfoRep() {
        return restinfoRep;
    }

    public restanswerRep getRestanswerRep() {
        return restanswerRep;
    }

    public soapinfoRep getSoapinfoRep() {
        return soapinfoRep;
    }

    public soapanswerRep getSoapanswerRep() {
        return soapanswerRep;
    }

    public gitcommandsRep getGitcommandsRep() {
        return gitcommandsRep;
    }

    public mergevsrebaseRep getMergevsrebaseRep() {
        return mergevsrebaseRep;
    }

    public acidinfoRep getAcidinfoRep() {
        return acidinfoRep;
    }

    public normalforminfoRep getNormalforminfoRep() {
        return normalforminfoRep;
    }

    public isolationlevelRep getIsolationlevelRep() {
        return isolationlevelRep;
    }

    public jmminfoRep getJmminfo() {
        return jmminfo;
    }

    public gcinfoRep getGcinfoRep() {
        return gcinfoRep;
    }

    public lcbeaninfoRep getLcbeaninfoRep() {
        return lcbeaninfoRep;
    }

    public omainfoRep getOmainfoRep() {
        return omainfoRep;
    }

    public jpainfoRep getJpainfoRep() {
        return jpainfoRep;
    }

    public hibernateinfoRep getHibernateinfoRep() {
        return hibernateinfoRep;
    }
}
